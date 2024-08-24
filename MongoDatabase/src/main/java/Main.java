import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;

public class Main {
    //mongodb is no nosql database means object oriented database , faster than sql , easy to use
    //create the mongoDB connection using client
    //create the database
    //access the database
    //delete the database
    //create the collection
    //access the collection
    //delete the collection
    //insert the data
    //update the data
    //delete the data
    //read the data
    public static void main(String[] args) {
        //create mongoDB connection
        //create the mongo client
        var client = MongoClients.create("mongodb://localhost:27017");
        //create the database with the name "expenseDB"

        //it will create the database if it is not present with same name otherwise it will access the database
        var database = client.getDatabase("expenseDB");
        System.out.println("Database is created with the name: " + database.getName());


        //create the collection with the name "expense"
//        database.createCollection("parents");
        System.out.println("Collection is created");
        //fetch all the collection
        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }
        //delete the collection from database
        var collection = database.getCollection("user");
        collection.drop();

        // insert the database in table
         var insertFaculty = database.getCollection("Faculty");
         var facultydocument = new Document();
         facultydocument.append("name","Harshika");
         facultydocument.append("email","harsh@gmail.com");
         facultydocument.append("age",22);
        insertFaculty.insertOne(facultydocument);

        //insert many document using single method
        ArrayList<Document> arrayList = new ArrayList<>();
        var facultydocument1 = new Document();
        facultydocument1.append("name","Pawan");
        facultydocument1.append("email","pawan@gmail.com");
        facultydocument1.append("age",34);
       arrayList.add(facultydocument1);

        var facultydocument2 = new Document();
        facultydocument2.append("name","Rohit");
        facultydocument2.append("email","tihor@gmail.com");
        facultydocument2.append("age",21);
        arrayList.add(facultydocument2);

        var facultydocument3 = new Document();
        facultydocument3.append("name","Ram");
        facultydocument3.append("email","ram@gmail.com");
        facultydocument3.append("age",20);
        arrayList.add(facultydocument3);

        var facultydocument4 = new Document();
        facultydocument4.append("name","Lakshman");
        facultydocument4.append("email","lakshman@gmail.com");
        facultydocument4.append("age",20);
        arrayList.add(facultydocument4);

        insertFaculty.insertMany(arrayList);

        //update the data using collection
        insertFaculty.updateOne(new Document("name","pawan"),
                new Document("$set",new Document("email","pawan@gmail.com")));
        insertFaculty.updateMany(new Document("email","sakshiDubey@gmail.com"),new Document("$set",new Document("name","sakshi")));

    }
}