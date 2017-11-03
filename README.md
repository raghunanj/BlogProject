# BlogProject

The code is mainly written in Java exploring some basic features of MongDB.

An enhancement for the blog to insert entries into the posts collection. After this, you must be able to add blog posts with a title, body and tags and have it be added to the posts collection properly. 

Here is an example of valid blog post: 

> db.posts.find().pretty()
{
    "_id" : ObjectId("513d396da0ee6e58987bae74"),
    "title" : "NoSQL course in MongoDB",
    "author" : "Savitha",
    "body" : "This is a special course in NoSQL which is concentrated mainly on MongoDB.",
    "permalink" : "nosql_mongodb",
    "tags" : [
        "nosql",
        "mongodb",
        "pesit",
        "specialtopic"
    ],
    "comments" : [ ],
    "date" : ISODate("2014-03-11")
}

After you have added the posts, you will be adding some indexes to the post collection to make the blog fast.
