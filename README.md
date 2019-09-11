<h1 align="center">Assignment 2 Integration: RPC/RMI Stud Admin Project </h1>

<h3>Description <g-emoji class="g-emoji" alias="page_with_curl" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4c3.png">📃</g-emoji></h3>

<p>The final produckt contains 3 main sections:</p>

<p>1-RMI-Server</p>

<p>2-RMI-Client</p>

<p>3-MySQL database & CSV file</p>

<img src="https://github.com/Hallur20/IntegrationAssignment2/blob/master/conection.PNG" alt="Smiley face" height="auto" width="auto">

<p>The client communicates with the server using a CLI, the server reads the data from the MYSQL-database and the CSV-File. You can run the product using 3 difrent stations since the server, client, and database can communicate remotely which each other, or you can also run it on one station if you want to connect localhostly (READ the note section at the end of the readme file <g-emoji class="g-emoji" alias="small_red_triangle_down" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f53b.png">🔻</g-emoji>)</p>

<h4>What does the MYSQL database & CSV contians?  <g-emoji class="g-emoji" alias="mag" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f50d.png">🔍</g-emoji></h4>

<h5>MYSQL <img src="http://icons.iconarchive.com/icons/papirus-team/papirus-apps/48/mysql-workbench-icon.png" style="margin-top:40px;" title="Mysql-workbench" alt="Mysql-workbench icon" width="48" height="48"></h5>

<p>The MySQL database contains the first semester students with the following information (Name, Email, age), you can see the dump-file by  <a href="https://github.com/Hallur20/IntegrationAssignment2/blob/master/students.sql"> clicking her </a> .</p>

<h5>CSV File <img src="https://cdn3.iconfinder.com/data/icons/file-formats-set-2/64/x-17-512.png" alt="csv, file, format icon" class="d-block mx-auto" height="auto" width="40"></h5>

<p>The csv file contains secound semester students ith the following information (Name, Email, age), you can see the file by <a href="https://github.com/Hallur20/IntegrationAssignment2/blob/master/RMIServer/newStudents.csv">clicking her</a>. </p>
  


<h3>Setup<g-emoji class="g-emoji" alias="gear" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/2699.png">⚙️</g-emoji></h3>

<ul>
<li>1-Clone the project.</li>
<li>2-Open the server and client in your favorite java ide (It could be on one computer, or open the server on one computer and the client on another computer).</li>
<li>Add the jar file <a href="https://github.com/Hallur20/IntegrationAssignment2/blob/master/Assignment2IntregrationServer1.jar"> Assignment2IntegrationServer1.jar </a> to the libraries folder in the client project.</li>
 <li>Open MYSQL workbench and create a user with all priveleges on mysql (if you do not have one).</li>
<li>Open MYSQL workbench and run the <a href="https://github.com/Hallur20/IntegrationAssignment2/blob/master/students.sql"> dump file </a>.</li>
<li>After you have the database ready go to the server project, then to the logic package --> StudentFactory --> line 80 and change the ip/user/password into your user/your ip and port.</li>
<li>run server from Main.java.</li>
<li>run client from RMIClient.java.</li>
<li>Now you are ready to go! <g-emoji class="g-emoji" alias="white_check_mark" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/2705.png">✅</g-emoji>.</li>
</ul>

<h3>Note <g-emoji class="g-emoji" alias="interrobang" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/2049.png">⁉️</g-emoji></h3>

<p>If you are using  3 diffrent stations to run the project you should make sure that all of the 3 stations are connected to the same internet network, we used the school internet network which have the public-ip:10.50.131.53 ,which we used to connect remotly to the server from the client, if you are using a diffrent netwrok or localy so you need to change the 'ip' in the RMIClient.java class line 26, then go to the server and change the 'ip' in the Main.java class line: 39 </p>


<h3>Client commands <img src="https://cdn0.iconfinder.com/data/icons/cosmo-multimedia/40/terminal-512.png" alt="cmd, command, console, line, linux, terminal icon" class="d-block mx-auto" height="auto" width="40"></h3>

<ul>
<li>type 1 to get all students from both csv file and database</li>
<li>type 2 to get all new students from database</li>
<li>type 3 to get all old students from csv file</li>
</ul>
