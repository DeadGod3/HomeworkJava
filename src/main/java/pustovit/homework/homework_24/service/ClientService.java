package pustovit.homework.homework_24.service;

import pustovit.homework.homework_24.Database;
import pustovit.homework.homework_24.entity.Accounts;
import pustovit.homework.homework_24.entity.Clients;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private final String QUERY_SAVE = "INSERT INTO clients (name, email, phone, about) VALUES (?,?,?,?)";
    private final String QUERY_GET_ALL_READ = "SELECT * FROM clients";
    private final String QUERY_DELETE_INDEX = "DELETE FROM clients WHERE id = ?";
    private final String QUERY_UPDATE = "UPDATE clients SET name = ?, email = ?, phone = ?, about = ? WHERE id = ?";
    private final String QUERY_READ_BY_PHONE = "SELECT * FROM clients WHERE phone = ?";
    private final String QUERY_GET_CL_ACC = "SELECT * FROM clients,accounts WHERE clients.id = client_id;";
//    6. Добавить метод для получения всех Clients где id клиент = client_id таблицы сущности Accounts;

    public List<Clients> readClientsAccounts() {
        List<Clients> customers = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_CL_ACC);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Clients clients = new Clients();
                clients.setId(resultSet.getInt("id"));
                clients.setName(resultSet.getString("name"));
                clients.setEmail(resultSet.getString("email"));
                clients.setPhone(resultSet.getInt("phone"));
                clients.setAbout(resultSet.getString("about"));
                customers.add(clients);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public void save(Clients clients) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, clients.getName());
            preparedStatement.setString(2, clients.getEmail());
            preparedStatement.setInt(3, clients.getPhone());
            preparedStatement.setString(4, clients.getAbout());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Clients> ReadAll() {
        List<Clients> customers = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL_READ);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Clients clients = new Clients();
                clients.setId(resultSet.getInt("id"));
                clients.setName(resultSet.getString("name"));
                clients.setEmail(resultSet.getString("email"));
                clients.setPhone(resultSet.getInt("phone"));
                clients.setAbout(resultSet.getString("about"));
                customers.add(clients);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public List<Clients> readByPhone(Clients clients) {
        List<Clients> clientsByPhone = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ_BY_PHONE)) {
            preparedStatement.setInt(1, clients.getPhone());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                clients.setId(resultSet.getInt("id"));
                clients.setName(resultSet.getString("name"));
                clients.setEmail(resultSet.getString("email"));
                clients.setPhone(resultSet.getInt("phone"));
                clients.setAbout(resultSet.getString("about"));
                clientsByPhone.add(clients);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientsByPhone;
    }


    public void update(Clients clients) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, clients.getName());
            preparedStatement.setString(2, clients.getEmail());
            preparedStatement.setInt(3, clients.getPhone());
            preparedStatement.setString(4, clients.getAbout());
            preparedStatement.setInt(5, clients.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void delete(Clients clients) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE_INDEX)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, clients.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
