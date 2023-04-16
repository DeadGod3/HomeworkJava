package pustovit.homework.homework_24.service;

import pustovit.homework.homework_24.Database;
import pustovit.homework.homework_24.entity.Accounts;
import pustovit.homework.homework_24.entity.Statuses;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    private final String QUERY_SAVE = "INSERT INTO statuses (alias, description) VALUES (?,?)";
    private final String QUERY_GET_ALL_READ = "SELECT * FROM statuses";
    private final String QUERY_DELETE_INDEX = "DELETE FROM statuses WHERE id = ?";
    private final String QUERY_UPDATE = "UPDATE accounts SET alias = ?, description = ? WHERE id = ?";

    public void save(Statuses statuses) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, statuses.getAlias());
            preparedStatement.setString(2, statuses.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Statuses> ReadAll() {
        List<Statuses> statusesArrayList = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL_READ);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Statuses statuses = new Statuses();
                statuses.setId(resultSet.getInt("id"));
                statuses.setAlias(resultSet.getString("alias"));
                statuses.setDescription(resultSet.getString("description"));
                statusesArrayList.add(statuses);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statusesArrayList;
    }

    public void delete(Statuses statuses) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE_INDEX)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, statuses.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Statuses statuses) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, statuses.getAlias());
            preparedStatement.setString(2, statuses.getDescription());
            preparedStatement.setInt(4,statuses.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
