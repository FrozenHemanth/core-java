package daoImpl;

import dao.PaymentDAO;
import dto.PaymentDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAOImpl implements PaymentDAO {

    @Override
    public String batchInsert(List<PaymentDTO> paymentDTOS) {
        System.out.println("the values are inserted =" +paymentDTOS);
        String isInserted = null;
        Connection connection = null;
        String sqlQuery = "insert into payment_info (account_no,holder_name,amount,payment_type,payment_date) values(?,?,?,?,?)";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The driver is loaded successfully.");

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hemanth_db","root","hemanth@mysql");
            System.out.println("connection establishedd");
            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);

            for (PaymentDTO ref:paymentDTOS){
                preparedStatement.setInt(1,ref.getAccount_no());
                preparedStatement.setString(2,ref.getHolder_name());
                preparedStatement.setLong(3,ref.getAmount());
                preparedStatement.setString(4,ref.getPayment_type());
                preparedStatement.setString(5,ref.getPayment_date());
                preparedStatement.addBatch();
                System.out.println(ref.getHolder_name()+"payment inserted");

            }
            preparedStatement.executeBatch();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        isInserted="data inserted";

        return isInserted;
    }

    @Override
    public List<PaymentDTO> getPaymentList() {
        System.out.println("list of payment account details ");
        List<PaymentDTO> arrayList = new ArrayList<>();
        PaymentDTO paymentDTO=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The driver is loaded successfully.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hemanth_db","root","hemanth@mysql");
            System.out.println("the connection established");
            preparedStatement=connection.prepareStatement("SELECT* from TABLE ( payment_info )");
            System.out.println(" preparestatemt is created");
       resultSet=preparedStatement.executeQuery();
       while (resultSet.next())
       {
           paymentDTO=new PaymentDTO();
           paymentDTO.setAccount_no(resultSet.getInt("account_no"));
           paymentDTO.setHolder_name(resultSet.getString("holder_name"));
           paymentDTO.setAmount(resultSet.getLong("ammount"));
           paymentDTO.setPayment_type(resultSet.getString("payment_type"));
           paymentDTO.setPayment_date(resultSet.getString("payment_date"));

           arrayList.add(paymentDTO);
       }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }
}
