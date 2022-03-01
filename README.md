### Querying the BooksRead table

Expected time required: 10 min

You've created a table that keeps track of all the books you and your co-workers have read. You want to be able to
query the table to retrieve all the books a specific person has read, based on their unique id.

The `BooksRead` table has the following fields:

* `id`: partition key—unique id for each employee
* `asin`: sort key—unique id for each book
* `author`: author of the book
* `title`: title of the book
* `favorited`: boolean value of whether the book was liked by who read it
* `year_published`: the year the book was published

Write the `getBooksReadByEmployee()` method in the `BookDAO` class to return all the books that are read by a certain 
person using the `query()` method.

The `Book` class is already written and annotated for you. The `BookHelperMethods` provides methods that are used for
testing. 

The unit tests in `BookDAOTest` are set-up with a mock database so that you can test your methods offline. The `main()`
method is set-up in `BookApp` so that you can connect to the real BooksRead table and test your methods that way.

HINT:
* [I'm getting the error 'no HASH key value present' when I attempt to query the table!](./hints/hint_01.md)
