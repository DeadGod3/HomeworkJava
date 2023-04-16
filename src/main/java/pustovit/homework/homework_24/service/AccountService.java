package pustovit.homework.homework_24.service;

import pustovit.homework.homework_24.Database;
import pustovit.homework.homework_24.entity.Accounts;
import pustovit.homework.homework_24.entity.Clients;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
//5. Добавить метод для получения number из Account, где value > переданного значения;


    private final String QUERY_SAVE = "INSERT INTO accounts (client_id, number, value) VALUES (?,?,?)";
    private final String QUERY_GET_ALL_READ = "SELECT * FROM accounts";
    private final String QUERY_DELETE_INDEX = "DELETE FROM accounts WHERE id = ?";
    private final String QUERY_UPDATE = "UPDATE accounts SET client_id = ?, number = ?, value = ? WHERE id = ?";
    private final String QUERY_GET_NUMBER = "SELECT number FROM accounts WHERE value > ?";

    public void save(Accounts accounts) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, accounts.getClient_id());
            preparedStatement.setString(2, accounts.getNumber());
            preparedStatement.setDouble(3, accounts.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Accounts> ReadAll() {
        List<Accounts> accountsArrayList = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL_READ);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Accounts accounts = new Accounts();
                accounts.setId(resultSet.getInt("id"));
                accounts.setClient_id(resultSet.getInt("client_id"));
                accounts.setNumber(resultSet.getString("number"));
                accounts.setValue(resultSet.getDouble("value"));
                accountsArrayList.add(accounts);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountsArrayList;
    }

    public List<Accounts> getNumberOfValue(Accounts accounts) {
        List<Accounts> accountsNumber = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_NUMBER)) {
            preparedStatement.setDouble(1, accounts.getValue());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                accounts.setNumber(resultSet.getString("number"));
                accountsNumber.add(accounts);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountsNumber;
    }

    public void delete(Accounts accounts) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE_INDEX)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, accounts.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Accounts accounts) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, accounts.getClient_id());
            preparedStatement.setString(2, accounts.getNumber());
            preparedStatement.setDouble(3, accounts.getValue());
            preparedStatement.setInt(4, accounts.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
