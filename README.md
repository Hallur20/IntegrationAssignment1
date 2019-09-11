<h1>Assignment 2 Integration: RPC/RMI Stud Admin Project </h1>

<h3>Description <g-emoji class="g-emoji" alias="page_with_curl" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4c3.png">📃</g-emoji></h3>

<p>The final produckt contains 3 main serctions:</p>

<p>RMI-Server</p>

<p>RMI-Client</p>

<p>MySQL database & CSV file</p>

<h4>What does the MYSQL database <img src="http://icons.iconarchive.com/icons/papirus-team/papirus-apps/48/mysql-workbench-icon.png" style="margin-top:40px;" title="Mysql-workbench" alt="Mysql-workbench icon" width="48" height="48"> & CSV contians?</h4>

TThe csv file contains 2nd semester students while the database container first semester students. Our client communicates with the server using a CLI.
The final product we made can be used on 3 diffirent stations: 1-the client, 2-the server, 3 database where they can remotely communicate. he server communictates with the
csv file/database.
</p>

<h3>instructions</h3>
<ul>
<li>clone the project</li>
<li>open the server and client in your favorite java ide</li>
<li>add the jar file (Assignment2IntegrationServer1.jar) to the libraries folder in the client project</li>
<li>open mysql workbench and run the dump file</li>
<li>create a user with all priveleges on mysql</li>
<li>in the server project, go to the logic package --> StudentFactory --> line 80 and change the ip/user/password to your user/your ip and port</li>
<li>run server from Main.java</li>
<li>run client from RMIClient.java</li>
<li>you should be setup</li>
</ul>

<h3>scanner commands in client</h3>

<ul>
<li>type 1 to get all students from both csv file and database</li>
<li>type 2 to get all new students from database</li>
<li>type 3 to get all old students from csv file</li>
</ul>
