package com.amazon.ata.dynamodbquery.prework.query;

import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import java.util.List;

public class BookApp {

    /**
     * Test your methods on a real database connection. Should print [The Book Thief, to Kill a Mockingbird, My Side of
     *                 the Mountain].
     * @param args main method arguments
     */
    public static void main(String[] args) {
        //GIVEN
        DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient());
        String employeeId = "5b2ccd28";

        //WHEN
        BookDAO bookDAO = new BookDAO(mapper);
        BookHelperMethods helperMethods = new BookHelperMethods();
        List<Book> booksList = bookDAO.getBooksReadByEmployee(employeeId);

        //THEN
        System.out.println("Query result should retrieve 3 books with titles The Book Thief, to Kill a Mockingbird, and" +
                " My Side of the Mountain: " + helperMethods.getTitlesFromList(booksList));
    }
}
