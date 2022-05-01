# Report

A Small Social System Paradigm, also the Group Project of Database System

<img src="https://img.shields.io/badge/Build-Success-brightgreen" /> <img src="https://img.shields.io/badge/Collaboration%20-Teams-orange" />  

## Abstract

This Project provides an enterprise application community program. The report firstly explains the business problem and background. Then it talks about our enterprise solution and details on implement it through database system. This also includes the challenges we encountered during the development process. By reading this Report, you can quickly understand the implementation and process of our application.

## Background

With the advance of the information technology and database system, more and more companies are tapping their potential customers by building their own brand internet communities. However, many small and micro enterprises have difficulty in building Internet communities in a short cycle due to technical limitations and lack of development experience. This project builds an Internet community application model for enterprises, implementation by Oracle database and Java. Enterprises can selectively build programs that suit their needs through rich interfaces and expandability.

## Solution

From both business and technique perspective, a good B2C software application for customers should follow C3 principle (Henry, Chan). C3 refers to Concept, Customer, and Company. This “Novepus” tool, named as November + Octopus, is developed as a tool to help various enterprises to build an innovation culture which all its staffs or clients can discuss related company affairs. Such intelligent communities do not only provide convenient tool for the management of the company, but are expert at attracting talent, investment, building global recognition as well [1]. Therefore, “Novepus” ‘s goal is to bring new technology and convenience to the business world, aiming to provide convenient online forum service to people all over the world.

Apart from C3 principle, the 8Ps from business perspective are also considered in making our product feasible. Among them, the “Price”, which is most direct to our service, is planned as a “14-day” free trial and yearly based costs for the enterprises. The business plan is referred from other general-purpose enterprise application, such as Navicat, MySQL, and IntelliJ. For the “People”, our design has a wide range of targeting customer groups, such as education institutes, medical service, small mid or large private companies etc [2].

“Novepus” is a server-client online forum system. Our aim is to provide the best user experience and comprehensive interaction experience. Therefore, our design involves more advanced functions, such as rather than a simple message tool, such as “sending interest”, “follow other”, “likes”. The implementation details will be discussed in “client” part.

**Package For Enterprise**

- Enterprise Community program model for enterprises (Java Program)
- Oracle database construction statements (DDL)
- Some extensions

By using the above models, enterprises will obtain best practices. The Enterprise Community Model Program is written by Java. It is a set of applications with basic functionality and rich expandability. Engineers can deploy our applications directly. Enterprises can also add additional extensions based on their needs. The following diagram shows the structure of Package. 

<img src="https://pic.hanjiaming.com.cn/2022/01/11/869844e2b3e96.png" alt="1641895334570.png" title="1641895334570.png" />

**Application**

Our general principle is to be disciplined, rigorous, and extensible, whether it's a database, or an enterprise community program. Considering the time and technology limitation, we try our best to complete our plan, although some of the features are still reserved interfaces.

**Enterprise Community program**

For the client design, we strictly follow the MVC model and Evevt-driven programming ideas.

We provide a command line interface suitable for developers and users. The different controllers have their own roles. We create Java classes based on the entities of the database. The following diagram shows the relationship on the components of client. 

For View, all inputs and outputs are managed by NovepusIO, while the paradigm of all inputs and outputs emulates that of a normal command line program. It provides the user with detailed menu command descriptions and prompts. And we have classified all exceptions to reduce unnecessary program interruptions to improve the stability of the application. Since Java is very cumbersome for keyboard event handling, we still use the screen buffer input to read commands. But this also reduces the possibility of incorrect user input in one way.

<img src="https://pic.hanjiaming.com.cn/2022/01/11/3fa79403d8f85.png" alt="1641895362018.png" title="1641895362018.png" />

There’re 6 main functions supported: 

- Show the up-to-date posts titles one by one and allow users to choose.
- Search function available and users can search by keywords to view the interested topics
- Shown posts are provided by analyzing users’ interested and potential favorite topics,
- New posts can be created;
- Users can scroll up and down OR refresh the page to get the new updates;
- Users can see the details by clicking on each title and system will enter post content page;

For each post, it supports

- Allow comments under each post;
- Allow likes for each post;
- Allow likes for each comment;

User center are one of the key components for community platform and it’s used for supporting personalized and stylish self-management and self-presentation.

There’re are 4 functions available and developed for our software, listed as follows:

- Manage your own account info. Users are allowed to modify their account status by resetting the account name, resetting personal signature, resetting their interest tags, and resetting their phone numbers. This part of info is private and only accessible by users themselves.
- Manage your personal profile page. Personal page is popular trend in current social platform and this will increase the interactions between different users. Number of current online people, number of following people, number of followed people, number of created posts, and number of received likes are available and accessible by the global user.
- Show all your created posts OR delete unwanted posts. Users can view their post titles, scroll up and down, refresh the page, search by keywords, click to see the details and delete any previous posts.
- Check the history log files. User can check their pasted operations though the history log files and this solves the safety concern and increase the operation transparency.

Contact and sending messages are important functions for a forum, not only commenting below posts, but closer connection and communication through private talks. Here’s 5 main functions for the “Friends List”:

- **Search** other users by nickname OR account name OR phone number OR interest tags;
- **Add** new friends after searching;
- **Send** message to your friends;
- **View** all your friends in the list page;
-  **Delete** your friends if necessary;

The mainbox provides a broader view for all types of messages, including the messages from a friend, @ reminder in others’ posts, OR other system reminder. User can:

- **Check** all the messages mentioned above;
- **Send** messages to other users;
- **Reply** to others’messages;
- **Refresh** the page to get up-to-dates status;
- **Delete** related people;
- System **reminders** may include, but not limit to, e.g. password changes.

**Database**

We designed the database based on the client side using the strictest and most standard model. The following diagram shows the schema of “Novepus”.  

<img src="https://pic.hanjiaming.com.cn/2022/01/11/edc221fd51cc2.png" alt="1641896119991.png" title="1641896119991.png" />
**Integrity constraints**

There’re 3 main integrity constraints considered – key constraints, domain constraints and foreign key constraints. 

For key constraints, we define candidate keys as follows: id in user, id in post, id in message, id in comment, id in interest and they all need to set as NOT NULL. Each user or post has a unique id for searching, insertion and deletion. In addition, we have added many unique keys such as username and tuple (post_id,user_id). After all, username, as an intuitive field used to distinguish users, cannot be repeated; a user can only perform one LIKE operation on a post, so the tuple (post_id,user_id) cannot be repeated. 

We also define domain constraint for each attribute in the relational model. For example, in the user relation, we have variety types of attributes: NUMBER for id, VARCHAR for username, password, email and signature, DATATIME for create_time, and last_exit_time, and TINYINT for isonline which is type is boolean, according to their different characteristics. Considering that there is no boolean type in Oracle database, we use interger to represent it which 0 means false and 1 means true.

Finally, for the foreign key constraints, we design all the primary keys in the basic table: user, post, log, message, comment, and interest. All other ids are referring to these keys as their foreign keys. We use the design idea of cascade deletion to prevent null pointers for foreign keys.

Apart from defining integrity constraints, our design also follows performance tuning rules. 

Firstly, regarding to normal forms and denormalization, our team has discussed whether to balance between BCNF and frequent updates. For example,the post_mention_post and post table are separated by key “post_id”, resulting a BCNF relationship among the two tables, reducing the data redundancy. However, separating into two tables are not friendly to frequent updates. In our case of forum application, reducing data redundancy is more important since there may be large amount of data and posts. Therefore, we finally choose to separate them into two tables by horizontal partitioning. Secondly, indexing tuning is one important strategy in our database design. According to Ahmad [3], SQL index helps in speeding up the queries by providing swift access to the requested data, called data seek operation, instead of scanning the whole table to retrieve a few records, similar to book’s index. There’re three cases where we should insert index to the table as suggested by Oracle [4]:

- The column is queried frequently.
- A referential integrity constraint exists on the column.
- A *unique* key integrity constraint exists on the column.

**Learning Experiences and Discussion**

We encountered many challenges during the implementation of the database and the client.

**Challenge**

**Best practices for triadic relationships.**

In our development plan, we allow users to add their own interest tags and for articles to be tagged with interest tags at the time of creation. This feature is designed for an interest promotion function, i.e. the user can see the articles he or she is interested in on the recommendation page to improve the precise promotion of the company. Moreover, enterprise developers can also push the data intelligently after data analysis through a rich interface. We need to convert this ternary relationship into a binary one. Therefore, the main database designer referred to several application solutions and finally implemented their relational representation with three tables. We set all the fields of the interest_user and interest_post tables as foreign keys.

<img src="https://pic.hanjiaming.com.cn/2022/01/11/08c245ecea107.png" alt="clip_image004.png" title="clip_image004.png" />

**How to increment the primary key "ID"?**

Since there is no server, the client cannot have the ID of the last record. we need a component that makes the ID increment automatically after database insertion. We found a lot of useful examples in the textbook. Finally, the application used this case: the trigger will make the ID self-incrementing before the insert a new record; the value of the ID will be recorded in sequence. 

**Trading indexing for speed.**

The core programmers in our group complained that some queries would be very slow after inserting several thousand pieces of data in the test case. After analysis, we think that there are two reasons: all the users' like_posts are put in one table; the developers do not develop the application properly and repeatedly query for irrelevant information. Therefore, in addition to standardizing the code of DBcontroller, we also added indexes to all such tuples. Here, the main database designer also weighed the possible impact of indexes on database performance.

**Hard delete or soft delete?**

There are a large number of foreign key constraints in the database, which may lead to bugs in the dependencies if the records are easily deleted. We have studied a variety of mature database design solutions and found that many databases do not use the idea of cascade deletion.

"The whole world is federation level, if we delete a user, we have to delete all articles of a user, all comments, comments of his articles also have to be deleted, logs about him also have to be deleted ...... all records containing such foreign keys have to be deleted, the whole world has to be deleted ".  

The soft delete uses the marker field. We add the isdelete field for many entities so that the client only needs to check the isdelete field first before deciding whether to display it or not.

In today's society, we are also thinking about privacy and security issues. If a user posts an illegal message, even though the message is later deleted, we still need to keep the evidence for tracing. The soft delete design is in line with this thinking. Therefore, our database retains the constraint of cascading deletion, which is at the discretion of enterprise developers according to the real situation.

**Expansion Packs**

We support enterprise developers to add any extensions to our enterprise applications. This includes web, oauth2 unified authentication, etc.

**Microsoft Azure AD SSO**

We have experimented with using Microsoft Azure AD to interface with our user directory, i.e. using a Microsoft personal or work or education account to log into our applications. This is achievable. Since our registered Microsoft Azure applications expire, we cannot be formally submitted it. However, we encourage eligible companies to try to add this extension. We have successfully used PolyU's Microsoft account to sign into our application. This unified enterprise login system greatly protects endpoint security and also provides convenience for employees. Oauth2 protocol also supports the use of Google or other user directory providers.

**Conclusion**

This article describes best practices for enterprise community building using the Novepus program. We provide model, expansion and feasibility solutions. This program which aims to deal with the business problems basically consisting of three parts basic model, extensions and model. In order to make our program more rigorous, we pay large attention to the Integrity constraints. 

This is a very difficult development process we have ever met. We encountered a lot of challenges, but in the end, we patiently solved all the difficulties by searching a lot of information from Internet and books. After finishing this project, we have a deep understanding of the critical role of the database in the whole business. This Project we also gradually started to master the full-stack thinking: from front-end to back-end, from customer to developer, from application to database.

**References**

[1]Bell et al., Seizing our destiny : 2012's best communities to live, work, grow and prosper in - and how they got that way, First edition.. New York, NY: Intelligent Community Forum, 2012. 

[2]G. Makoul, A. B. Zick, M. Aakhus, K. J. Neely, and P. E. Roemer, “Using an online forum to encourage reflection about difficult conversations in medicine,” Patient education and counseling, vol. 79, no. 1, pp. 83–86, 2009, doi: 10.1016/j.pec.2009.07.027. 

[3]Ahmad, Y. (Jan 13, 2020). SQLShack. Top five considerations for SQL Server index design. https://www.sqlshack.com/top-five-considerations-for-sql-server-index-design/

Retrieved on 2021, November 28.

[4]Oracle. Selecting an Index Strategy.

https://docs.oracle.com/cd/B14117_01/appdev.101/b10795/adfns_in.htm 

Retrieved on 2021, November 28.

