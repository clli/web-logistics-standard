;first make sure the number of arguments passed into the scripts is more than 1
If $CmdLine[0]<2 Then Exit EndIf
 handleUpload($CmdLine[1],$CmdLine[2])

;define a function to handle upload
 Func handleUpload($browser, $uploadfile)
	 Dim $title                          ;declare a variable
            ;specify the upload window title according to the browser
            If $browser="IE" Then                  ; stands for IE;
 	      $title="ѡ��Ҫ���ص��ļ���ͨ����wenku.baidu.com"
            Else                                 ; stands for Firefox
	       $title="��"
            EndIf

            if WinWait($title,"",4) Then ;wait for window withtitle attribute for 4 seconds;
                   WinActivate($title)                  ;active the window;
                   ControlSetText($title,"","Edit1",$uploadfile)   ;put thefile path into the textfield
                   ControlClick($title,"","Button1")                ;click the OK or Save button
            Else
	        Return False
            EndIf
 EndFunc