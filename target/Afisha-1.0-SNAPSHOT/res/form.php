$link=mysql_connect($host,$user,$pass);
    mysql_select_db($db_name,$link);

  $sql = mysql_query("SELECT `src_ip` , `src_port` , `dst_ip` , `dst_port` ,  `bytes`
FROM `table` ", $link);
    while ($result = mysql_fetch_array($sql)) {
        echo $result['src_ip'].": ".$result['src_port']."<br>";
    }