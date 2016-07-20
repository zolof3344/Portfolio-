
/**
 * A reader for comma seperated values
 * 
 * @author Michael Holloway 
 * @version 1.0
 */
import java.util.Scanner;
import java.io.*;
import edu.utc.MichaelHolloway.LookupTable;
import edu.utc.MichaelHolloway.DataProvider;
import edu.utc.MichaelHolloway.DataProcessor;
import edu.utc.MichaelHolloway.DataDumper;
import java.util.Scanner;
import java.util.ArrayList;
public class CSVreader implements DataProvider 
{ File file=null;
  Scanner input=null;
    /**
     * This is the constructor for the CSV Reader
     * @param it takes a file from which it will read
     */
    public CSVreader(File f) throws IOException
    {file=f;
     ;
     input=new Scanner(file);
    }

    /**
     * This method gives out the next data in line
     * @return it returns a lookupTable with the next data in line.
     */
    public LookupTable nextData()
    {   int x=0;
        LookupTable lt2=new LookupTable();
         
        while(input.hasNextLine())
        { Scanner lineScanner=new Scanner(input.nextLine());
           lineScanner.useDelimiter(",");
            while(lineScanner.hasNextLine())
            {    
                lt2.set("Column:"+x,lineScanner.next());
                x=x+1;
             }
            }
            x=0;
        
       
        return lt2;
    }

    /**
     * This method checks to see if the given mathSampler has data to pass
     * @return this method returns a boolean indicating if it has data or not.
     */
    public boolean hasData()
    {if(input.hasNextLine())
        { return true;
        }
        else
        {
        return false;
        }
    }
}
public class CSVWriter implements DataProcessor 
{   
   
 
   
   LookupTable lt=new LookupTable();
   PrintWriter printer=null;
   PrintWriter pw=null;
   /**
    * Constructs the CSV writer to print to a csv file
    */
     public CSVWriter() throws FileNotFoundException
     {
       printer=new PrintWriter("CSVFile.txt");
       pw=new PrintWriter("ka.txt");
     }
     /**
      * Processes the data passed to it, the data being a lookup table it prints out all the data through a loop
      * @param lt the process method takes in a lookupTable 
      */
     public void process(LookupTable lt) 
     { 
       ArrayList<String> strings=lt.getKeys();
       printer.println(strings.get(0)+","+lt.get(strings.get(0)));
       printer.println(strings.get(1)+","+lt.get(strings.get(1)));
         
      }
    /**
     * Closes the print writer
     */
     public void finish()
     { printer.close();
       pw.close();
     }
   }
   

                                                                                                                                                                                     '*%-+,(+--+%a��  '*%-+,(+-**a�  '*+-+$(a�~ ��  '*&+)*,a�{ ��  '*Y '**)Y '+�5 '+���  '+(,'$(a�� ��  '+--)+-%,+)a��  '+,'&'),-*'a��  ',�0 ���I 
������ ���G �|�< �N� �I�	 �?�� 8  ',�1! ',%&+-(%%+*���  ','*%%&a�� ��  ',+a�  ',(\��u��  '-�u '-&%)----------(6�Y  '-*+$,(-%(-*a��  '-($',(a�� ��  '-(*,%)'%)%]��  (��
%#�*�� $  ! ! !   !��X��C�ÂMU7�18�-;�w��ƀ��z�� #��X��C�ÂMU7�18�-;�w��˂�{�����  ��X��C�ÂMU7�18�-;�w��ɂ�{��� 0 W �O�) "��X�π��JU7�18�-;�w��ƀ��u��� ��X�ςJU7�18�-;�w��ƀ���
 ��X�ςJU7�18�-;�w��ƀ��� ��P �� 6�o�̀рÀ��̀рց�7�08G�":::���Ӏ����y�� ��7�08G�":::��  (�


%	-%
% (�5e			M
 (�u	m ($
�

%	-A]	 ($$�
!%	- ?        ($���  ($�� ($&�� ($)-,%(-'+$----+�w  ($)&in  ($-++(&)')-)a��  ($***$,a�� ��  (%�m (%)*%+)%$)(�M  (%**&+,)%(('a�#  (&	�	m= (&'�	� (&�	e (&(&%+$+%-%----,���  (&$-%-----------6�.  (&,)&*(a�� ��  (&%***(a�� ��  (&$',$,a�� ��  (&]��  (&Y ('�Y ('--%-----------6�>  ('$$%+*-'$%���  ('���  ('()*'&a�� ��  ('%&+$(a�� ��  (')+(+&a�� ��  ((�=! ((�=�� ��  ((,%+*-,)%,*a��  ((,%+*-,)$)a�  (('+))-)(,%'a�&  (((%*+&a�A �K  ((+(*a�> �H  ((-',$,a�; �E  ((,&,'&a�� �   ()�1! ()()�1! ()+$*(`�8? �B?  ())(%+*a�  �*  ()'(-*,a� �'  ()'++%&a� �$  (),%*%*a� �!  ()&+*a�� ��  ()`��::: ��:::  (*�	a (*$,*(+''$)$$$$&�u  (*���  (*))'+&&&%&(a��  (*,,*'&a�& �0  (*$-$)*a�# �-  (*,$(a�� �  (+�
1! (+$*%'$(%&-���  (+--'*())&($$$$%�)  
(+(*,(&'&*�t  (+-------------)6�I  (+�0��m ��m ��m ��m ��m ��m  (+*'+,&(-$+*a��  (+'&)'*a� �  (+&)%*,a�� ��  (,	�		1! (,()(,+%+&(���  (,%-*$$$$$$$$$$'6�/  (,$�0 ��� ��� ���쀞 ���သ �\���� �W���� ��l��  (-
�	1! (-,)%'$((*)$$$$%���  (-&-&-+*%+------�(  (-,�0�'�0� �+�0� �%�0� ��0�� ��0�; ��0�;  (-%�1�� �� �� �� �� ��  (-$�1�l �l �j �_ �1 �,  (-')+)*')+&�5�� ��  (-&)*'&`�5	 �?	  (-%+(a�2 �<  (-&&,,,a�/ �9  (-)'$+&a�) �3  (-''+%&a�� ��  (FK57�1! (F�1! )�EU
$A�� 
�1��Ā�90 - 0  < < 9 - , ���+-��l��q�7 ���+-�J���q�)� ���+-��q��U� `
 ��+ �			/{ �|�+-�؃l��q�  ���+-��U�'�� ���+-��*@�#�� ��! ��� "����-���g:::�|m�^��J	�����t �
��-����:::�|m��	�	��   )�
%-%
%A )�I1!
 )�I1!
 )$�-%	-���? \ \ \ \ \ \ ��  )$�-%	-11! )$-$&'('--(�8  )$(�4����� ���� ���؂ �]���  )$'�4��	 �Ȃ	 �Ƃ �т  )$+�0���߂ �P�W�  )$)*$$,-(-%�5�� ��  )$*�0�Ȃ	 ��  )$-��ׂ	  )$*%,%*a�� �	  )%�I% )%+$%*%-),&-----�8  )%&%'$'&'&&���  )%$��b���  )%*(&$,a�� ��  )&)��_��� �_�^�  )&(��Ȃ	 �
�	  )&�Y )&($&'&,$)%+���  )&,��]�\�  )&+��
�	  )&$++(&,%((a��  )'�1% )'+)&-(%%+*�1�� �$ �$�E �� ��  )'-'*-$(*&**a��  )(	�-! )($*-�1�` �` �^ �S �% �   
)(%+'-%(*+�1�� �' �' ��  )(�-�� �� �� �� �� �� ��  )(^KWQ�1Y Y Y Y Y Y  )($,(&(a�� ��  )($+--%&)''a��  ))��I! ))-�  ))-('----------*6�J  ))&%*''-(-%���  ))`��::: ��:::  )*	�%
%	-5	 )*$�195!     )*,)GS&���  )*&�   )*($&+%*))*----,�v  )*,-*%$)((($$$$,���  )+�a )+'$(&)*&+%----)�e  )+'-&')*%&(��  )+$&$'&a�� ��  )+**&&)(-$&`	�����K��  ),�A ),%)-,*++'&$$$$*�g  ),+'&)*')+&��"  ),)(*+(',&&���  )-�1! )-$$-&-%*''%��   )-'+)��5  )-���  )-%*&(----------*i��  )-%*&)d��  )-()',(a�� ��  )-)\�݂	  *��
% *(��	I! *(��l  *��%		�!8�怃 6  B  B  " 3 2 ���n�����  ���n���ك� ���n���݃� | �� �t ���n����� ���n������7 �ބ�n���o ^ �^ ��3:::�h�� ��3:::�҂i���  *��Y *��Y *)�u *),''$*)'*&----'���  *),*+**+-)%$$$$%���  *'	�1! *''(%'()$*)���  *+�
 *+'-(-%-+'(----,���  *%� *%%(&,,&$-($$$$)�P  *(),)(,*,)(----,�;  *((+(*$+-+%���  **� **%+$'%-()%----,���  *-�	] *-()%,*((%&----)�U  *+*&-(%)'-,$$$$+�+  *&�1! *&�1!�  �$ � �  � �
 �� ��  *$	�1	 *$�1!� � �
 �� �� �� �� ��  *'*'�1! *,� *,+(%'*%%'%7���  *&(-''+&'$(�1�� � � �� �� ��  
*-&$,*)%'+��  *'%&+-(%%+*��  *(+&&&$))&*���  *$,&------------)ix  *-*$($,'**$%a��  *$-')*a�� ��  *$**%&a�� ��  *$--$(,a�� ��  *$%*+&,a�� ��  *(*(a�� ��  *-%+*&(a�� ��  *),$%%&a�� ��  *&,-&(,a�� ��  *$'-)((a�� ��  *)`��::: ��:::  
*$&'+&)'&%a��  *(%&),**)((a��  *-+,%-*$%'*]�I  *--$+'(,'-+]��  *(,\����  *&)]��  +$�-$-��?q u | uU u |\ |  +$$�-9	-��? B B B B B  +$�-%	-E1	 +�%	%	-%
%	 +�� +�� +)��e +)���T ��::: ��:::  +��

%�Md��    < # # ��� �� �� n # ���� #  
��:::�h�� ��:::��  +,��
] +,��8  +&��) +&$�I  +-� +-%(,'-%%$(�M  ++�A ++,'&$$$$$$$$$$&6�D  +(	�1! +(-(,$$$$$$$$$$&6�/  ++*-,,$)&'(----&���  +*�q +*&-')*%)(+$$$$-���  +(-$,$$$$$$$$$$(6�D  +($,($$$$$$$$$$%6�/  ++&-$%,'$)$$$$$(�r  +%�	1 +%-('*+')*'�^  ++-+(&-*+&+�>  +%(+,%)'*,&----)�,  +-%--$&,-$)$$$$%���  +)%)+,,&&&,$$$$,�@  +,-$%(('%)($$$$%�=  +-*),,**)-%���  +%+%,�1�] �] �[ �P �" �  +9�1 +9�1 +9+9�1 +((�0 ��� ��� ���쀞 ���သ �^���� �Y���� ����  +$+$�1! +$,(%''-(-%�1� �� �� #BlueJ class context
comment0.params=
comment0.target=CSVWriter()
comment0.text=\r\n\ Constructs\ the\ CSV\ writer\ to\ print\ to\ a\ csv\ file\r\n
comment1.params=lt
comment1.target=void\ process(edu.utc.MichaelHolloway.LookupTable)
comment1.text=\r\n\ Processes\ the\ data\ passed\ to\ it,\ the\ data\ being\ a\ lookup\ table\ it\ prints\ out\ all\ the\ data\ through\ a\ loop\r\n\ @param\ lt\ the\ process\ method\ takes\ in\ a\ lookupTable\ \r\n
comment2.params=
comment2.target=void\ finish()
comment2.text=\r\n\ Closes\ the\ print\ writer\r\n
numComments=3
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  �� �*  ,(�1! ,(+$%*$,')'���  ,()',&&+*')��*  ,,�] ,,)(-*+&,&)���  ,(-')$,-(-%���  ,)&)*$,a�� ��  ,$)-%&,a�� ��  ,)`��::: ��:::  ,,$$(-*&,'&(`��


  ,,**(&%)*,)a�<  ,+,a�  
,)&'+&)'&%a��  ,%a ,%%%%-,&&)&a��  ,-)()&-$$$%a��  ,Y ,+Y ,+-'%)$$)Y ,&Y ,&($+),-,,Y -$�-<��?   P0 w   -$$�19	-��? I I I I  -$�-9	-� -�


	9	)
%% -�
u$%	  
�4���5W   	��	 	��	 �� 	��	 	��	 �����> ��π����� ������� �� �� �� �́����5 �߀����� �ڀ����� ��%  ��:::����`�� 
��:::���_  -%�	 -%�	�K   -,� -,'+*$)(*+$-----�o  -*�	 -*++&$-%$%'----+�;  -'� -'-('----------)6�5  -*,'$()%$-'----)�f  --�) --(,$&$&&,-��  -(i -(+%$$$$$$$$$$$$)i��  -(+%e��  -(+&&,,a�� ��  -$&++*a�� ��  -)`��::: ��:::  -)a --,+(,),*%-`�R�	  -$*&)]�F  .
��$(B �� �� �� �� ���� �� 
�ZUV3
 ��M 
�ŀтP��V��U  .�	
	%		%A .�QM .% .%5== .1SKEWU7X7QS?KI�0 r r r r r r q r  .1�1! .3� .337E7Q/U?KI� .3��	1 .337E7Q/U?KI��0       � i���� �$i���� �i���� � i���� �i��� �
i��� �Oa�;�� ��a�k��  .33E7Q/U?KI�  	.33KQ5?I;e~  .33a�I ��  
.55H7[4/U/�


0
 ������2� ������-� ������-� ������+� 
������ 
�����
�
 �j������1��� 
�t�e�  .5�1! 
.9U7QHWG�1! .9	�1!A .9U7Q�,  .EEK[VS7Q47E7U7�1! .E�1! .EEX/EW7S.SF/AKQT?3CS�1! .EEK[.WUK2WQY78?U�0 � � � � � � � �  .EEK[JMU?KIS4?/EK;S�0 �� �� �� �� �� �� �� ��  .F�	 .F�	�� ��  .GME?UW57�1! .G�1! 
.IIKU/U?KIS�1! .I�% .I/EK;JWU2Q7/U72KISU/IU�1! .I/EK;JWU.GME?UW57�1! .I/EK;JWU8Q7OW7I3_�1! .I/EK;JWUZ/Y78KQG�1! 
.I/E_S?S�1! 
.I5Z=?U7�1! .I;E7�1! .IS[7Q3���  .I���  .IS[7Q�
��"�� � +# ��'H  .I/E_S?SeP  .I/E_a7e4  .MM7I5?]�����  	.MM/Q/UWS���u  .M	��1! .MM�1! .MME?3/U?KI0W?E54/U7T?G7�0 + + + + + + + +  .Q
�
e1! 
.Q7/T7SU7Q�a (   .Q� .Q7/T7SU7Q� .QQ/_�1! .Q?/E�0 �G����7� �G����2� �E����2� �:����0� 	����� 	����� ������6��� �̂h�	  .S��H�9�� ��, ��5  .S
��%	A .S� .SS?;IG7IU� .ST7]U�1! .SF/AKQT?3CS�1! .SSWG7�]& ��  .U`7QK�1! .U	�1!A .U�X�u �u �s �t�тP  	.U&;.%5==#  .V�%)	%	 .VT<JPR�%)	%	A A A A A A A  .WUK>4�1! .W�1! .WUKG/U?3473?G/E�1! 
.WUK2Q7/U75�1! .WUK�1! .WUK2Q7/U75�


0
 ������2� ������-� ������-� ������+� 
������ 
�����
�
 �x������1��� 
���e�  .WUKS3/E7<?IU�1! .WUKS3/E7JI8?QSU4/U/�1! .WUKS3/E7�1! .WUK2WQY78?U�1! 
.Y7Q/;74/U/�1! .Y�1! .]?S�1! .]�1! /�d	(H
 d` �\y��+U     RN  ����% �!@' �`��	H 9 �_$79  D"  /(�								
								
!%A /1
�	)	%	�I /1KWU�%)	%	�       ��  /1E7���  /1KY7el  /1?E?U_O  /3�--I%A /337MU75���  /337E7Q/U?KI�������b&  ��^  
/33WQ/U7E_�k  /3U?KI�HyT ��

 !  /3UW/E���  /3U?KIS�uT ��  /33�0 ���� �� ���� ���� ���� ���� ���! �/�Q  /337SS75�e  /337MUS�F  /3OW?Q7�F  /5� /55�\  /9�u /9U7Q���  /9Q/?5���  /E�	)	%	
Uq /EE	�	)	%	
 ��       
  /ESK��i �  	/E;KQ?U=G�#  /EGKSUR  /E[/_SA  /I5�X-9$@
��C �\��UPN/'�� ��+ b ; ; ; �Ӏ� ��E�� ��� ; ; ; ��<1 ; ; �U5!2)" '  /I�		%	!	-%A /I_U=?I;�%)	%	�       S  /I/E_S?S���  /I?G/E&�\&  /I?G/E%�P"  /I��(Hq �� �l��N
 	��V$ �?��  /IKU=7Q��� i  /IS[7Q���  /M��- /MM7/QS��-�� � �  
/MMQK]?G/U7E_���  /MMQKMQ?/U7���   /MM7/Qe��  /Q�		
	
					e) /Q;S�	)	
	
						 0 	 1 	 * 	 * 	 1 	 0 	 )  /Q7��d)�� 6 ��K 
 � �  /QGS���  /QU?3E7�X  /Q7/���
  /S��(H�/��AK'H G �� ��^ �JY�� Q  /S�Yy)I /SS?;IS�_  /SS?;I�J  /SCS�N  /SU7Q?3C���  
/SSK3?/U75�~  
/SS?;IG7IU�0  
/SSWGMU?KId��^  /U
�	)	%	�I /U	�)	%	�, �~�e , , , , , , ��  /U& /W	�
%i /WU=KQ�
%         /WUKG/U7�
  /Y�I� /YK?5���  /Y7Q/;7��s&  �  /[�	%A /[U�%A 6 " "  0�
		
		
A-!A 0E�
	

		
A1! 0EW7@�


		
                07� 07��]  0EK3C75��.  0EK3C��   0W
�%�1! 	0W?E57Q�% 0�m 0W� 	0W?E57Q� 0E� 0EW7@� 0Q/?I�1! 0/�1! 0/S75�1 0Q�1! 0QK/53/SUTK�,,,0,(( 6;� 11?������l�g�b�^
�p��
d
� X�2��4�X ;�11?������l�g�b�^
�p��
d
� X�7��/�X ;��11?������l�g�b�^
�p��
d
� X�5��/�X ;��11?������l�g�b�^
�p��
d
� X�2��-�
X 5��11?����l�g�b�^
�p��
d
� X�2��
X 5��11?����l�g�b�^
�p��
d
� X�3��X K�11����������������l�f�a�[
�Z	d	��X�2����2���X %��11�f�a�[
�Z	d	��X��X  0�,,�� �� �� � 
�ˀтP��V��U  0U�Y 0U�X�y �y �w �x�тP  	0QK[S7Q�1! 0E/3C.I5Z=?U7�1! 0/3C;QKWI52KEKQ�


0
 ��	��	�	�-	�	 ��	��	�	�(	�	 ��	��	�	�(	�	 ��	��	�	�&	�		 
��	��	�	�	 
��	��	�	�	 �c	��	��	�
	�,	��	�	 
�m	�`	� 	  0/3C;QKWI5TQ/ISM/Q7IU�


0
 ������2� ������-� ������-� ������+� 
������ 
�����
�
 �W������1��� 
�a�e�  0KWI5S�


0
 ������+� ������&� ������&� �������$�� 
������ 
�������� �A
������*��� 
�K
�\��  0/S72KEWGI>4�1! 0?I:Q/M=RU/3C2KEWGIS�0 �7�F �2�A �2�A �.�= ��� ��� ��� ���  
0/Q:Q/M=�1! 0/QS�1! 0/S76QQKQ0/QS�1! 0?�1! 0K	�1!A 0KWI5S�1! 0W?E54/U7T?G7�1! 0KU=�  1�-%	- 1E�-%	- 1EW.           m=}�B�B  @}�BU    ..          m=}�B�B  @}�B�%    LOGFILE TXT w=}�B�B  E}�BV�  Bl   ������ ������������  ����C S V r e  a d e r . h   t m CSVREA~1HTM  PA}�B�B  B}�B�'�<  Bl   ������ �������������  ����C S V W r  �i t e r . h   t m CSVWRI~1HTM  �A}�B�B  B}�B�'�>  AD a t a .  �h t m l   ��  ����DATA~1  HTM  B}�B�B  C}�B�'.  AD r i v e  Lr . h t m l     ��DRIVER~1HTM  B}�B�B  C}�B�'�,  AF u n c t  3i o n . h t   m l FUNCTI~1HTM  .B}�B�B  C}�B+'�"  Bt m l   �� �������������  ����M a t h S  �a m p l e r   . h MATHSA~1HTM  ?B}�B�B  C}�B�'hE  AS i n . h  t m l   ����  ����SIN~1   HTM  RB}�B�B  C}�B�'�0  Bh t m l    ������������  ����S w i n g  P l o t t e   r . SWINGP~1HTM  aB}�B�B  D}�B(�_ Bu t h . h  �t m l   ����  ����T h e M o  �m e n t O f   t r THEMOM~1HTM  #C}�B�B  D}�B�'D+  EDU        5C}�B�B  D}�B(    Ap a c k a  g e - l i s   t   PACKAG~1     �C}�B�B  D}�B�'   Be . h t m  l   ��������  ����o v e r v  i e w - f r   a m OVERVI~1HTM  �C}�B�B  D}�B�'�  B. h t m l  �  ����������  ����p a c k a  �g e - f r a   m e PACKAG~1HTM  �C}�B�B  D}�B�'|  Br y . h t  �m l   ������  ����p a c k a  �g e - s u m   m a PACKAG~2HTM  �C}�B�B  D}�B�'�  Bh t m l    �������������  ����p a c k a  �g e - t r e   e . PACKAG~3HTM  	D}�B�B  E}�B]'@   Be s . h t  �m l   ������  ����c o n s t  �a n t - v a   l u CONSTA~1HTM  4D}�B�B  E}�B�'�  Br m . h t   m l   ������  ����s e r i a   l i z e d -   f o SERIAL~1HTM  ?D}�B�B  E}�B�'�  Ar e s o u  ?r c e s   ��  ����RESOUR~1    KD}�B�B  E}�B3(    B. h t m l  �  ����������  ����o v e r v  �i e w - t r   e e OVERVI~2HTM  VD}�B�B  E}�B['�"  Bl   ������ �������������  ����i n d e x  �- a l l . h   t m INDEX-~1HTM  cD}�B�B  E}�BH'qP  Ba m e . h  t m l   ����  ����a l l c l  a s s e s -   f r ALLCLA~1HTM  wD}�B�B  E}�Bk'�  Bf r a m e  �. h t m l     ����a l l c l  �a s s e s -   n o ALLCLA~2HTM  �D}�B�B  E}�BO'}  Ai n d e x  3. h t m l     ����INDEX~1 HTM  �D}�B�B  E}�BK'�  Ba r y . h  �t m l   ����  ����o v e r v  �i e w - s u   m m OVERVI~3HTM  �D}�B�B  E}�B?'@  Ah e l p -  nd o c . h t   m l HELP-D~1HTM  �D}�B�B  E}�B='�!  Bs   ������ �������������  ����s t y l e  �s h e e t .   c s STYLES~1CSS  �D}�B�B  E}�B7'�                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  Project documentation
<---- javadoc command: ---->
C:\Program Files\Java\jdk1.7.0_07\bin\javadoc.exe
-sourcepath
E:\SemesterProject
-source
1.7
-classpath
C:\Program Files (x86)\BlueJ\lib\bluejcore.jar;C:\Program Files (x86)\BlueJ\lib\junit-4.8.2.jar;E:\SemesterProject
-d
E:\SemesterProject\doc
-encoding
UTF-8
-charset
UTF-8
-docletpath
C:\Program Files (x86)\BlueJ\lib\bjdoclet.jar
-doclet
bluej.doclet.doclets.formats.html.HtmlDoclet
-doctitle
SemesterProject
-windowtitle
SemesterProject
-author
-version
-nodeprecated
-package
-link
http://download.oracle.com/javase/6/docs/api/
edu.utc.MichaelHolloway
E:\SemesterProject/Driver.java
E:\SemesterProject/Data.java
E:\SemesterProject/MathSampler.java
E:\SemesterProject/CSVreader.java
E:\SemesterProject/CSVWriter.java
E:\SemesterProject/Function.java
E:\SemesterProject/TheMomentOftruth.java
E:\SemesterProject/SwingPlotter.java
E:\SemesterProject/Sin.java
<---- end of javadoc command ---->
Loading source file E:\SemesterProject/Driver.java...
Loading source file E:\SemesterProject/Data.java...
Loading source file E:\SemesterProject/MathSampler.java...
Loading source file E:\SemesterProject/CSVreader.java...
Loading source file E:\SemesterProject/CSVWriter.java...
Loading source file E:\SemesterProject/Function.java...
Loading source file E:\SemesterProject/TheMomentOftruth.java...
Loading source file E:\SemesterProject/SwingPlotter.java...
Loading source file E:\SemesterProject/Sin.java...
Loading source files for package edu.utc.MichaelHolloway...
Constructing Javadoc information...
Standard Doclet version 1.7.0_07
Building tree for all the packages and classes...
Generating E:\SemesterProject\doc\CSVreader.html...
E:\SemesterProject\CSVreader.java:22: warning - @param argument "it" is not a parameter name.
Generating E:\SemesterProject\doc\CSVWriter.html...
Generating E:\SemesterProject\doc\Data.html...
E:\SemesterProject\Data.java:22: warning - @param argument "in:" is not a parameter name.
E:\SemesterProject\Data.java:22: warning - @param argument "out:" is not a parameter name.
E:\SemesterProject\Data.java:22: warning - @return tag cannot be used in method with void return type.
Generating E:\SemesterProject\doc\Driver.html...
Generating E:\SemesterProject\doc\Function.html...
Generating E:\SemesterProject\doc\MathSampler.html...
E:\SemesterProject\MathSampler.java:45: warning - @param argument "There" is not a parameter name.
Generating E:\SemesterProject\doc\Sin.html...
Generating E:\SemesterProject\doc\SwingPlotter.html...
E:\SemesterProject\SwingPlotter.java:140: warning - @param argument "takes" is not a parameter name.
Generating E:\SemesterProject\doc\TheMomentOftruth.html...
Generating E:\SemesterProject\doc\edu\utc\MichaelHolloway\DataDumper.html...
Generating E:\SemesterProject\doc\edu\utc\MichaelHolloway\DataProcessor.html...
Generating E:\SemesterProject\doc\edu\utc\MichaelHolloway\DataProvider.html...
Generating E:\SemesterProject\doc\edu\utc\MichaelHolloway\LookupTable.html...
E:\SemesterProject\edu\utc\MichaelHolloway\LookupTable.java:34: warning - @return tag cannot be used in method with void return type.
Generating E:\SemesterProject\doc\overview-frame.html...
Generating E:\SemesterProject\doc\package-frame.html...
Generating E:\SemesterProject\doc\package-summary.html...
Generating E:\SemesterProject\doc\package-tree.html...
Generating E:\SemesterProject\doc\edu\utc\MichaelHolloway\package-frame.html...
Generating E:\SemesterProject\doc\edu\utc\MichaelHolloway\package-summary.html...
Generating E:\SemesterProject\doc\edu\utc\MichaelHolloway\package-tree.html...
Generating E:\SemesterProject\doc\constant-values.html...
Generating E:\SemesterProject\doc\serialized-form.html...
Building index for all the packages and classes...
Generating E:\SemesterProject\doc\overview-tree.html...
Generating E:\SemesterProject\doc\index-all.html...
Building index for all classes...
Generating E:\SemesterProject\doc\allclasses-frame.html...
Generating E:\SemesterProject\doc\allclasses-noframe.html...
Generating E:\SemesterProject\doc\index.html...
Generating E:\SemesterProject\doc\overview-summary.html...
Generating E:\SemesterProject\doc\help-doc.html...
Generating E:\SemesterProject\doc\stylesheet.css...
7 warnings
                                                                                                                                                                                                                                                                               3G1E�1!I I I I I I H I  3KGG7IU$�$
 
 
 
 
 
 
 
  3K�			
				
		
	Y)I 3KIU7]U�
%         	3KGMKI7IU�
^	 C  3KEKQ���  3KGG7IUS�%)	%	( ( ( ( ( ( (  3KGGKIE_����J  3KISU/IU����
 � P  	3KII73U75���  
3KEE73U?KI���| ��  
3KGME7U7E_���V &  3KGMWU7Q���� x #  	3KQQ73UE_�O  3KI3/U�Z  
3KI5?U?KIS���  	3KI5?U?KI���M&  
3KIS?57Q75���  3KGMKWI5�i&  3K� 
3KGMWU7Q� 	3KIU/?I75�d  3KIU/?I���  3KGGKI��  3KGG/I5S��  3K57�u��+ ?  3KQQ7E/U?KIe��  	3KGMWU7QS	�TS��   3KWE5�E  3KGME7]=   3K5?I;  3Q 3Q7/U7l  3U�
% 3U]U�
% 3W� 3WQQ7IU���  4�1�H �L �F �( �: �5  4#�

				

1 4� 4� 4.�%)	%	 4.T6�%)	%	9 9 9 9 9 9 9  4/U/��y����   i  4/��!1 4/� 4/U/� 4/U/�1! 4/U/RKWQ37R7QY7Q�0 �V�) �Z�) �T�) �6�) �H�) �C�) �Հ� ���  4/U/R7U�0 �*���� �.���� �(���� �
���� ����� ����� ���� �$�  4/U/8E/;S�1! 4/U/J1A73UT=?3CD?I7S�0 ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� �������d�a�v�� �������d�a�v�� %������������������c�^�` 
��c�^�`  4/U/J1A73U.WUKG/U?3473?G/E�0 ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� �������d�a�v�� �������d�a�v�� %�x�����������������c�^�` 
��c�^�`  4/U/J1A73ULQ73?S?KI�0 ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� �������d�a�v�� �������d�a�v�� %�q�����������������c�^�` 
��c�^�`  4/U/J1A73ULQ73?S?KI473?G/E�0 ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� �������d�a�v�� �������d�a�v�� %�j�����������������c�^�` 
���c�^�`  4/U/RKWQ37�1! 4/U/J1A73U4/U/RKWQ37�0 ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� �������d�a�v�� �������d�a�v�� %�c�����������������c�^�` 
���c�^�`  4/U/J1A73U2KEKQ�0 ��	��	��	��	�_	�\	�q	��	 ��	��	��	��	�_	�\	�q	��	 ��	��	��	��	�_	�\	�q	��	 �}	��	��	��	�_	�\	�q	��	 ��	��	��	�_	�\	�q	��	 ��	��	��	�_	�\	�q	��	 %�\	��	��	��	��	��	��	��	��	�^	�Y	�[	 
��	�^	�Y	�[	  4/U/J1A73UR=KQUH/G7�0 ���������d�a�v�� ���������d�a�v�� ���������d�a�v�� �q�������d�a�v�� �������d�a�v�� �~�����d�a�v�� %�P�����������������c�^�` 
���c�^�`  4/U/J1A73UH/G7�0 �}
��	�����d�a�v�� �}
��	�����d�a�v�� �{
��	�����d�a�v�� �j�������d�a�v�� �|�����d�a�v�� �w�����d�a�v�� %�I��
��
������
�������c�^�` 
���c�^�`  4/U/R7U:Q/M=F/U3=�0 ���� ���� ���� ���� ���� ���� ��� ��  4/U/R7UX?57K.I/E_S?S�0 ���� ���� ���� ���� ���� ���� ��� ��  4/U/R7ULQ75?3U?KI�0 ���� ���� ���� ���� ���� ���� �|� �z  4/U/R7URUKQ75PWI�0 ���� ���� ���� <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--NewPage-->
<HTML>
<HEAD>
<!-- Generated by javadoc (build 1.7.0_07) on Mon Apr 15 15:42:08 EDT 2013 -->
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE>
edu.utc.MichaelHolloway (SemesterProject)
</TITLE>

<META NAME="date" CONTENT="2013-04-15">

<LINK REL ="stylesheet" TYPE="text/css" HREF="../../../stylesheet.css" TITLE="Style">

<SCRIPT type="text/javascript">
function windowTitle()
{
    if (location.href.indexOf('is-external=true') == -1) {
        parent.document.title="edu.utc.MichaelHolloway (SemesterProject)";
    }
}
</SCRIPT>
<NOSCRIPT>
</NOSCRIPT>

</HEAD>

<BODY BGCOLOR="white" onload="windowTitle();">
<HR>


<!-- ========= START OF TOP NAVBAR ======= -->
<A NAME="navbar_top"><!-- --></A>
<A HREF="#skip-navbar_top" title="Skip navigation links"></A>
<TABLE BORDER="0" WIDTH="100%" CELLPADDING="1" CELLSPACING="0" SUMMARY="">
<TR>
<TD COLSPAN=2 BGCOLOR="#EEEEFF" CLASS="NavBarCell1">
<A NAME="navbar_top_firstrow"><!-- --></A>
<TABLE BORDER="0" CELLPADDING="0" CELLSPACING="3" SUMMARY="">
  <TR ALIGN="center" VALIGN="top">
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../overview-summary.html"><FONT CLASS="NavBarFont1"><B>Overview</B></FONT></A>&nbsp;</TD>
  <TD BGCOLOR="#FFFFFF" CLASS="NavBarCell1Rev"> &nbsp;<FONT CLASS="NavBarFont1Rev"><B>Package</B></FONT>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <FONT CLASS="NavBarFont1">Class</FONT>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="package-tree.html"><FONT CLASS="NavBarFont1"><B>Tree</B></FONT></A>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../index-all.html"><FONT CLASS="NavBarFont1"><B>Index</B></FONT></A>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../help-doc.html"><FONT CLASS="NavBarFont1"><B>Help</B></FONT></A>&nbsp;</TD>
  </TR>
</TABLE>
</TD>
<TD ALIGN="right" VALIGN="top" ROWSPAN=3><EM>
</EM>
</TD>
</TR>

<TR>
<TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
&nbsp;<A HREF="../../..//package-summary.html"><B>PREV PACKAGE</B></A>&nbsp;
&nbsp;NEXT PACKAGE</FONT></TD>
<TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
  <A HREF="../../../index.html?edu/utc/MichaelHolloway/package-summary.html" target="_top"><B>FRAMES</B></A>  &nbsp;
&nbsp;<A HREF="package-summary.html" target="_top"><B>NO FRAMES</B></A>  &nbsp;
&nbsp;<SCRIPT type="text/javascript">
  <!--
  if(window==top) {
    document.writeln('<A HREF="../../../allclasses-noframe.html"><B>All Classes</B></A>');
  }
  //-->
</SCRIPT>
<NOSCRIPT>
  <A HREF="../../../allclasses-noframe.html"><B>All Classes</B></A>
</NOSCRIPT>


</FONT></TD>
</TR>
</TABLE>
<A NAME="skip-navbar_top"></A>
<!-- ========= END OF TOP NAVBAR ========= -->

<HR>
<H2>
Package edu.utc.MichaelHolloway
</H2>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
<TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
<B>Interface Summary</B></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD WIDTH="15%"><B><A HREF="../../../edu/utc/MichaelHolloway/DataProcessor.html" title="interface in edu.utc.MichaelHolloway">DataProcessor</A></B></TD>
<TD>Write a description of interface DataProcessor here.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD WIDTH="15%"><B><A HREF="../../../edu/utc/MichaelHolloway/DataProvider.html" title="interface in edu.utc.MichaelHolloway">DataProvider</A></B></TD>
<TD>Write a description of interface DataProvider here.</TD>
</TR>
</TABLE>
&nbsp;

<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
<TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
<B>Class Summary</B></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD WIDTH="15%"><B><A HREF="../../../edu/utc/MichaelHolloway/DataDumper.html" title="class in edu.utc.MichaelHolloway">DataDumper</A></B></TD>
<TD>Write a description of class DataDumper here.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD WIDTH="15%"><B><A HREF="../../../edu/utc/MichaelHolloway/LookupTable.html" title="class in edu.utc.MichaelHolloway">LookupTable</A></B></TD>
<TD>LookupTable class This class is used to create objects of type LookupTable providing the user with a way to store pairs and lookup.</TD>
</TR>
</TABLE>
&nbsp;

<P>
<DL>
</DL>
<HR>


<!-- ======= START OF BOTTOM NAVBAR ====== -->
<A NAME="navbar_bottom"><!-- --></A>
<A HREF="#skip-navbar_bottom" title="Skip navigation links"></A>
<TABLE BORDER="0" WIDTH="100%" CELLPADDING="1" CELLSPACING="0" SUMMARY="">
<TR>
<TD COLSPAN=2 BGCOLOR="#EEEEFF" CLASS="NavBarCell1">
<A NAME="navbar_bottom_firstrow"><!-- --></A>
<TABLE BORDER="0" CELLPADDING="0" CELLSPACING="3" SUMMARY="">
  <TR ALIGN="center" VALIGN="top">
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../overview-summary.html"><FONT CLASS="NavBarFont1"><B>Overview</B></FONT></A>&nbsp;</TD>
  <TD BGCOLOR="#FFFFFF" CLASS="NavBarCell1Rev"> &nbsp;<FONT CLASS="NavBarFont1Rev"><B>Package</B></FONT>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <FONT CLASS="NavBarFont1">Class</FONT>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="package-tree.html"><FONT CLASS="NavBarFont1"><B>Tree</B></FONT></A>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../index-all.html"><FONT CLASS="NavBarFont1"><B>Index</B></FONT></A>&nbsp;</TD>
  <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../help-doc.html"><FONT CLASS="NavBarFont1"><B>Help</B></FONT></A>&nbsp;</TD>
  </TR>
</TABLE>
</TD>
<TD ALIGN="right" VALIGN="top" ROWSPAN=3><EM>
</EM>
</TD>
</TR>

<TR>
<TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
&nbsp;<A HREF="../../..//package-summary.html"><B>PREV PACKAGE</B></A>&nbsp;
&nbsp;NEXT PACKAGE</FONT></TD>
<TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
  <A HREF="../../../index.html?edu/utc/MichaelHolloway/package-summary.html" target="_top"><B>FRAMES</B></A>  &nbsp;
&nbsp;<A HREF="package-summary.html" target="_top"><B>NO FRAMES</B></A>  &nbsp;
&nbsp;<SCRIPT type="text/javascript">
  <!--
  if(window==top) {
    document.writeln('<A HREF="../../../allclasses-noframe.html"><B>All Classes</B></A>');
  }
  //-->
</SCRIPT>
<NOSCRIPT>
  <A HREF="../../../allclasses-noframe.html"><B>All Classes</B></A>
</NOSCRIPT>


</FONT></TD>
</TR>
</TABLE>
<A NAME="skip-navbar_bottom"></A>
<!-- ======== END OF BOTTOM NAVBAR ======= -->

<HR>

</BODY>
</HTML>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ����   3 p
  I J
  I K�	!�TD-@	!�TD-
  L M
 
 I N
  I
  O P
  I
  Q
  R	 S T U
 V W X
  Y
  Z [
  I \ ] <init> ()V Code LineNumberTable LocalVariableTable this LDriver; main ([Ljava/lang/String;)V args [Ljava/lang/String; sin LSin; Sampler 
LMathSampler; dumper $Ledu/utc/MichaelHolloway/DataDumper; data LData; inFile Ljava/io/File; chooser Ljavax/swing/JFileChooser; data2 reader LCSVreader; n %Ledu/utc/MichaelHolloway/LookupTable; dumper2 writer LCSVWriter; dumper3 
StackMapTable ' J K M N ^ P 
Exceptions _ 
SourceFile Driver.java   Sin MathSampler  ` "edu/utc/MichaelHolloway/DataDumper Data a b javax/swing/JFileChooser c d e f g h i no file selected j k l 	CSVreader  m n o 	CSVWriter Driver java/lang/Object java/io/File java/io/IOException (DDILFunction;)V run P(Ledu/utc/MichaelHolloway/DataProvider;Ledu/utc/MichaelHolloway/DataProcessor;)V showOpenDialog (Ljava/awt/Component;)I getSelectedFile ()Ljava/io/File; java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V (Ljava/io/File;)V nextData '()Ledu/utc/MichaelHolloway/LookupTable; !               /     *� �             !        " #   	 $ %    �  
   �� Y� L� Y  �+� 	M� 
Y� N� Y� 
:W,-� :� Y� :� � 
� :� � � �� Y� 
:� Y� :� :	� 
Y� :
� Y� :� 
Y� :� �        R         !  *  2  5  >  G  N  S   [ ! \ # e $ p % w & � ' � ( � ) � - !   � 
   � & '    � ( )   � * +  ! y , -  * p . /  5 e 0 1  > \ 2 3  e 5 4 /  p * 5 6  w # 7 8 	 �  9 - 
 �  : ;  �  < -  =    � N  > ? @ A B C D  
 E     F  G    H                                                                                                                                                                                                                                                                     Q��  9Q77E_��̀�  9/EE���  	9/S=?KI75���  9/EE?I;�/  
9?I/E;QKWM�d  9K]�3  97U3=7S�[  97�1 97I37�1 9�1 9+�1 9+9�1 9$� 9$Q� 9E� 	9EK[3=/QU�'  9?QSU�   9W�) 
9WI3U?KI/E?U_��  	9WI3U?KIS��  9KQGWE/���  9?u 
9?I?S=75u 9WEEe��  9/U=7Q�W(  9?7E5�A  9Q?7I5S�	  9/G?E_�  9?I/E��  9?I/EE_��  9K3WS��  9/S3?I/U?KI9  	9/S3?I/U7  :�	
�%
 :�� :/
��1 	:/U7RU/U7��0�*      ��삣���� ��삣���� ��삣���� ���삣���� ���삣��� ���삣���  :/� 	:/U7[/_� :/E?E7Kd��0.  :7I7Q/U7T_M7�1! :7I7Q/U7X/EW7S�1! :7�1! :?�� :?/I3KE?��W  :?Y7I���  :KK;E7F/MSJM7I.IIKU/U?KIS�1! :K�1! :KK;E7F/MSX/EW72KEWGI�1! :KK;E7F/MSF/QC7QJMU?KIS�1! :P� :P66H�o  :Q
�	
�1 :Q/M=?3S� X(  
:Q/M=?3S&4�^)  :Q/M=��
� 		
	�g 5		
	 �〞  
:Q/Y?U/U?KI/E�  :Q� :Q/M=S� :Q/M=F/U3=�1! :Q/M=D?IC75>4S�


0
 �����2� �����-� �����-� ������+�
 
������ 
������	 �������1��� 
���d�  :Q/M=L/M7QD?I72KEKQ�1! :Q/M=L/M7QD?I7RM/3?I;�1! :Q/M=L/M7Q�1! :Q/M=2/QU7S?/I�1! :Q/M=LEKU4KW1E7^.]?S�0 ��F ��A ��A ���; ��� ���
 ��� ���	  :Q/M=4Q/[P/?I1K[�0 � �F ���A ���A ���; ��� ���
 ��� ���	  :Q/M=LEKU^D/17E�0 ���H ���C ���C ���= ��� ��� ��� ���  :Q/M=LEKU\D/17E�0 ���H ���C ���C ���= ��� ��� ��� ���  :Q/M=LEKU479/WEU^F/]�0 ���F ���A ���A ���; ��� ���
 ��� ���	  :Q/M=LEKU479/WEU^F?I�0 ���F ���A ���A ���; ��� ���
 ��� ���  :Q/M=LEKU479/WEU\F/]�0 ���F ���A ���A ���; ��� ���
 ��� ���  :Q/M=LEKU479/WEU\F?I�0 ���F ���A ���A ���; ��� ���
 ��� ���  
:Q/M=LEKU^F/]�0 ���F ���? ���? ���; ��� ���
 ��� ���  
:Q/M=LEKU^F?I�0 ���F ���? ���? ���= ��� ��� ��� ���  :Q/M=LEKU\T?3CSPKU/U75.I;E7�0 ���F ���A ���A ���= ��� �}� �y� �t�  
:Q/M=LEKU\F/]�0 ���D ���? ���? ���; �z� �v�
 �r� �m�  
:Q/M=LEKU\F?I�0 ���D ���? ���? ���= �q� �m� �i� �f�  :Q/M=LEKU4KW1E7^.WUKS3/E7<?IU�0 ���F ���A ���A ���= �h� �f� �`� �_�  :Q/M=LEKU^.WUKS3/E7<?IU�0 ���F ���A ���A ���= �a� �_� �Y� �X�  :Q/M=LEKU\.WUKS3/E7<?IU�0 ���F ���A ���A ���= �Z� �X� �R� �Q�  $:Q/M=LEKU4KW1E7^.WUKS3/E7JI8?QSU4/U/�0 ���F ���A ���A ���= �S� �Q� �K� �J�  :Q/M=LEKU^.WUKS3/E7JI8?QSU4/U/�0 ���F ���A ���A �~�= �L� �J� �D� �C�  :Q/M=LEKU\.WUKS3/E7JI8?QSU4/U/�0 ���F �{�A �{�A �w�= �E� �C� �=� �<�  :Q/M=LEKU4KW1E7^.WUKS3/E7�0 �y�F �t�A �t�A �p�= �>� �<� �6� �5�  :Q/M=LEKU^.WUKS3/E7�0 �r�F �m�A �m�A �i�= �7� �5� �/� �.�  :Q/M=LEKU\.WUKS3/E7�0 �k�F �f�A �f�A �b�= �0� �.� �(� �'�  :Q/M=F?IKQT?3C2KEKQ�0 �d	�A	 �_	�<	 �_	�<	 �[	�8	 �)	�		 �'	�	 �!	��	 � 	� 	  :Q/M=F?IKQT?3CRU_E7�0 �X�F �S�A �S�A �O�= �� �� �� ��  :Q/M=F/AKQT?3C2KEKQ�0 �Q	�A	 �L	�<	 �L	�<	 �H	�8	 �	�		 �	�	 �	��	 �
	� 	  :Q/M=F/AKQT?3CRU_E7�0 �E�F �@�A �@�A �<�= �
� �� �� ��  :Q/M=R=K[LK?IULQKU73UKQS�0 �>�F �9�A �9�A �5�= �� �� ��� ���  :Q/M=RU/3C2KEWGIS�1! :Q/M=�1! 
:Q/M=0/Q:Q/M=�0 �0�F �+�A �+�A �'�= ��� ��� ��� ���  :Q/M=2KII73UD?I7S�0 �)�F �$�A �$�A � �= ��� ��� ��� ���  :Q/M=R=K[0/S76QQKQ0/QS�0 �"�F ��A ��A ��= ��� ��� ��� ���  :Q/M=R=K[TQ/376QQKQ0/QS�0 ��F ��A ��A ��= ��� ��� ��� ���  :Q/M=LEKUTQ/37>4L/?QS�0 ���B ���= ���= ���9 ���
 ��� ���� ���  :Q/M=LEKU0/S72KEWGI>4�0 ���F ���A ���A ���= ��� ���
 ��� ���  :Q/M=R=K[2WQSKQ47EU/�0 ���F ���A ���A ���= ��� ���
 ��� ���  :Q/M=R=K[2WQSKQRU/UWS�0 ���F ���A ���A ���= ��� ���
 ��� ���  :Q/M=R=K[D7;7I5�0 ���F ���A ���A ���= ��� ���
 ��� ���  :Q/M=R=K[T/I;7IU�0 ���F ���A ���A ���= ��� ���
 ��� ���  :Q/M=>IU7QMKE/U7�0 ���F ���A ���A ���= ��� ���
 ��� ���  :Q/M=R=K[LK?IUS�0 ���F ���A ���A ���= ��� ���
 ��� ���  :Q/M=T?UE72KEKQ�0 ��	�A	 ��	�<	 ��	�<	 ��	�8	 ��	�	 ��	�	 ��	��	 ��	� 	  
:Q/M=T?UE7�0 ���H ���C ���C ���? �|� �z� �t� �u�  :Q/M=F/U3=HWGR73U?KIS�0 �� �� �� �� �� �� �� ��  :Q/M=F/U3=VS7NW/5Q/U?3�0 �� �� �� �� �� �� �� ��  :Q/M=F/U3=VS7D?I7/Q�0 �� �� �� �� �� �� �� ��  :Q/M=F/U3=VS72KISU/IU�0 �� �� �� �� �� �� �� ��  :Q/M=F/U3=JITKKE1/#BlueJ class context
comment0.params=args
comment0.target=void\ main(java.lang.String[])
numComments=1
                                                                                                                                                                                                                                                                                                                                                                                                                       * @param in: This paramater is the DataProvider which the method takes
      * @param out: This paramater is the DataProcessor which the method takes
      * @return This method does not return anything.
      */ 
    public static void run(DataProvider in,DataProcessor out)
    {  
        while(in.hasData())
        {   
            out.process(nn.nextData());
            
        }
        out.finish();
    }
}
                                                                                            Y?U_��T   ;7�A 	;7U<7?;=U�AM j  ;7UZ?5U=�AG U  ;K�u ;K�~  ;Q7/UE_�$  ;KU��  ;KK5��  ;. ;.%5== <�
			-1A <K�

E1�I <KEEK[/_�

E0�I   a '	     <J�%)	%	 <JZ�%)	%	; ; ; ; ; ; ;  <7�!%	%	-1! <7Q7�%)	%		 	 	 	 	 	 	  <�%)		5-	
 <K�%)		5-	
 
<KEEK[/_�%)		5-	
 <KE5��C  <7?;=U�A <�z  <7/57QR=KQUH/G7�1! <7/57QH/G7�1! <7/57Q�1! 
<7/57QVI?US�1! <?SUK;Q/G�1! <?�1! <7EM7Q4/U/2WQY78?U�1! <7EM7QVS76IU?Q7P/I;7�1! <7EM7QF?I?G?a75�1! <7EM7QLQ73?S?KI473?G/E�1! <7EM7QLQ73?S?KI�1! <7EM7Q0/S72KEWGI>4�1! <7EM7QTQ/372KEWGI>4�1! <7EM7QP/I;7F/]�1! <7EM7QP/I;7F?I�1! <?IU�1! <7EM7QLK?IUST/I;7IUa =7?;=U	�%$
 ��%7 �� Z7 Z7 Z7 Z7 Z7 ] Z7  =#�

		

	
	-)!A =7 �

		

	
	--! =7Q7�
%	 	 	 	 	 	 	 	  =7�%)	%	               =?�� =?US��  =/I5��2
  =/��q =/S��q�� w �!  =KQ?aKIU/EE_���  =K�� ==�0 ���j�g�|�� ���j�g�|�� ��j�g�|�� �t�j�g�|�� �F�j�g�|�� �A�j�g�|�� 	�8�i�d�] 	�B�i�d�]  ==�1! 
=7Q7%&%+'$$&+�1[ [ [ [ [ [  =/Y7�y�� !  =7EM9WE��  
=7Q7'$',((*)'aZ [  =?S�  =/5��P  =/Q5[/Q7��  =KM?I;j  =K[[   >IU7Q9/37�-%	- >�					-%A >I�%	%	)E)!A >H�%)	%	 >HRTPV2T>JHR�%)	%	D D D D D D D  >9���� ��  >9�� >U� >U��e  >IUQK5W3U?KI��   >��H��	 �� �[
W


 N9  
>IMWU4?/EK;� >4�1! >I57]�1! 
>IU7Q9/37JM�1! 	>4X/EW7�1! >4�1! >4H/G7�1! >IU7QY/ET?G7VI?U�1! 
>IU7QY/E�1! >4�,,,0,(( 6;��11?������l�i�e�d�s��j� X�2��4�X ;��11?������l�i�e�d�s��j� X�7��/�X ;��11?������l�i�e�d�s��j� X�5��/�X ;��11?������l�i�e�d�s��j� X�2�
�-�X 5��11?����l�i�e�d�s��j� X�2��X 5��11?����l�i�e�d�s��j� X�3�
�	X K�x22����������������l�h�d�a�_i��X�2����2���X %��22�h�d�a�_i��X��X  >IY/E?54/U/8E/;S�1! >I4/U/0QK[S7Q�1! >I3Q7G7IU�1! 
>IMWU2KEWGI�1! >IU7QY/E.WUK�1! >4S�1! >I9K�1! >I3Q7G7IUS�1! 	>4L/?QS�1! 
>IU7QMKE/U7�1! 
>4RUQ?I;�1! >8� >8�&  >I�y��� ,  >IU��K  > > ?�
	%		
!%A ?G�
%A ?GMKQU�%A :     ?U�
YI1! ?U�Xh 	�rqn ` ��  ?I�	)		
M%I ?I3EW57�%)	%	+ + + + + + +  ?S�	%		Y)M ?S�$		X(M 
��
����   ��   F d   ��.a% � �� ��@��2B
 �tm L  ?I3��b  ?I9KQG/U?KI����   ?I��%H�;	��I. ��G  ��
 
�a*	$v F  ?IUK��q�� O Z  	?IU7Q9/37���  ?IMWU�uy�� Q �� ��  ?���  ?US�1!< < < < < < < <  ?9�-��E � )  ?IS?57��� ��7 ��  ?9�- ?IYKEY7�  	?I3Q7G7IU���  
?I?U?/E?a7�  	?I5?3/U75���  ?IU7QY/Ed�A  	?IU7QY/ESd��G  	?I3Q7/S75ew  	?I3Q7/S7Seq  ?I3E?I7dd'  ?IU7Q7SU�RS 1  ?IU7Q7SU?I;�I	��  
?I9EW7I375��  
?IU7Q7SU75��,  
?IU7QIS=?M��
  ?IU7Q[KQC?I;��  ?II7QE  @�		

			A1! @�


		
 @8Q/G7�L  @8� 
@2KGMKI7IU�L
  @2� @JMU?KIL/I7�w  @J� @� @� @WSU?9?3/U?KI�1! 
@WSU?9?3/U?KI�


0
 �����3� �����.� �����.� �����,�
 
������ 
������
 ��������2��� 
���d�  @W�1! A�			
				my A/
�			
			 A/Y/�
	
	  4            A	�
%� A/�
% A/Y/�
% A/Y/]�
� ;   AW�� AWGMS�F  AK�y AK?I75���  AK1�L0  AWSU�G  A[ 	A[;CYSO CIK[�$($% % % % % % %  C	�	)	%	� CI�	)	%	 CIK[I�W  C?e 
C?I7G/U?3Se6  D��1A DK	��1! DK;;7Q��� D D  D/	��1! D/1���  D��I D/U7SUF/]�1! D/1LQKRKWQ37�1! D/1LQK�1! DK3/U?KI�1!� � � �� � �  �� ��  D?I7/Q�1! D?I7S�1! D?I7/Q�1���� ���� ���� �� �� ��  D?	�1 D/U7SU�1! DN2/E36OW/U?KI47M7I57IURUKQ7S�


0


 �^�d�c�z�� �^�d�c�z�� �\�d�c�z�� �Q�d�c�z�� �#�d�c�z�� ��d�c�z�� 
��d�b�[ 
��d�b�[  D/SU4/U/2KEE73U75FK57�1! 
D?Y7P7/5KWU�1! DN�1! D/U7SU�1!�� �� �� �� �� �� �3 �=  D?IC75>4S�1! DK3C75�


0
 ������2� ������-� ������-� ������+� 
������ 
�����
�
 �q������1��� 
�{�e�  D?I72KEKQ�1! 
D?I7RM/3?I;�1! D/17E�1! 
DK;P?;=U^.]?S�0 ��F ��A ��A ��= ��� ��� ��� ���  DK;^.]?S�0 �
�F ��A ��A ��= ��� ��� ��� ���  DK;\.]?S�0 ��F ��A ��A ���= ��� ��� ��� ���  D7;7I5�1! D7�1! Dy	1
 D/y- D/1y- DKqQ DK;?3qe D?I7d  DK;;7Qa D? 	D?1Q/Q_ DW DWMUKI E �	
									
	-%!A E/	�!	 E/I;�1        E?�
YI1!A E?I7S�e�� ��  E?I7�Xt ��- o ��,3  E7	�	)	%	� E7/SU�%)	%	- - - - - - -  E/3C��]  E?C7E_��Y  E?SU75��0  E/I5���  E7I;U=���  E/a_�9  E�	%	� E/�	%	� E/1�	%	� E?C7��c ��  	E?37IS7QS�1!= = = = = = = =  EK�q EK;?3/E�	��   EKKM��

	
	  EKI;�F  EKKMS�	  EK3/U?KI�a  EK;?3�*  EKY7S�  E7/QI75��  EKKC75��  E7/Ib  E?;=U-  F�i �- �g  F�

u1	-A F
�!				 F/MSJM7I.IIKU/U?KIS�1! F/�1! F/MSX/EW72KEWGI�1! F/QC7QJMU?KIS�1! F/MSF/QC7QJMU?KIS�1! F/U3='�1 F/U3=&�1! F/U3=%�1! F/U3=$�1! F/]�1! 
F/]4WQ/U?KI�1! F/U3=�1! 
F/U3=T/;�1! F/IW/E2WQY78?UR=K[PFR6�0 �:�A �:�F �8�D �-�= �� �� ���  F/IW/E2WQY78?U>I3Q7G7IUS�0 �3
�;
 �3
�=
 �1
�;
 �&
�7
 ��
 ��
 ��
��
  F/AKQT?3CS�1! F/AKQT?3C2KEKQ�1! F/AKQT?3CRU_E7�1! F/U=2KISU/IUH/G7�0
/**
 * Write a description of class MainDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import edu.utc.MichaelHolloway.LookupTable;
import edu.utc.MichaelHolloway.DataProvider;
import edu.utc.MichaelHolloway.DataProcessor;
import edu.utc.MichaelHolloway.DataDumper;
import javax.swing.*;
public class MainDriver
{ 
    public static void main(String[] args)
    {
    Sin sin=new Sin();
    MathSampler Sampler=new MathSampler(-Math.PI,Math.PI,5,sin);
    DataDumper dumper=new DataDumper();
    try
    {
   CSVWriter writer=new CSVWriter();
    Data.run(Sampler,writer);
      }
    catch(IOException e)
    { System.out.println("Error: Could not write");
    }
    
}
}
                                                                                                                                                                                                                                                                                                      reader=new CSVreader(inFile);
    // set up plotter
     SwingPlotter plotter = new SwingPlotter();
     // set up Swing frame
     JFrame frame = new JFrame();
    // add SwingPLotter to frame
    frame.add(plotter);
    // make frame visible
    
     frame.setSize(400, 400);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
    Data.run(reader,dumper);
      }
    catch(IOException e)
    { System.out.println("Error: Could not write");
    }
    
}
}
                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               >E ��>E ��> �1>  F0D2/E32KEWGIH/G7�0 ��>E ��>E ��>E ��>E ��>E ��>E ��> �*>  F0D2/E?1Q/U?KITQ/37�0 �$ �( �" � � � �� ��  F0D2/E?1Q/U?KI6]M7Q?G7IUT_M7�0 � �! � �� � �
 �� ��  F0D2/E?1Q/U?KIR=KQU2KEWGIH/G7�0 � � � �� � � �� ��  F0D2/E?1Q/U?KI2KEWGIH/G7�0 � � �
 �� � �� �� ��  F0D2/E?1Q/U?KIP/I;747S3�0 � � � �� �� �� �� ��  F0D2/E?1Q/U?KI44R>I57]�0 � � � �� �� �� �� ��  F0D2/E?1Q/U?KIHWGLE/37S�0 �� �  �� �� �� �� �| ��  F0D2/E?1Q/U?KI^F/]�0 �� �� �� �� �� �� �u ��  F0D2/E?1Q/U?KI^F?I�0 �� �� �� �� �� �� �n ��  F0D2/E?1Q/U?KI2K799?3?7IUS�0 �� �� �� �� �� �� �g ��  F0D2/E?1Q/U?KI>IU7Q9/37JM�0 �� �� �� �� �� �� �` ��  F0D2/E?1Q/U?KI>4X/EW7�0 �� �� �� �� �� �� �Y ��  F0D2/E?1Q/U?KI6OW/U?KIT_M7�0 �� �� �� �� �� �� �R ��  F0D2/E?1Q/U?KIVS7QH/G7�0 �� �� �� �� �� �� �K ��  F0D2/E?1Q/U?KI>4H/G7�0 �� �� �� �� �� �� �= �w  F0D2/E?1Q/U?KILQ7UU_VI?US�0 �� �� �� �� �� �� �6 �p  F0D2/E?1Q/U?KIVI?US�0 �� �� �� �� �� �� �/ �i  
F0D2=/II7E�0 �O�� �S�� �M�� �/�� �A�� �<�� �~�� ����  F0D2=/II7E`7QK479/WEU�0 �L �P �J �, �> �9 �{ ��  F0D2=/II7EF/U3='�0�" �& �  � � �  F0D2=/II7EF/U3=&�0 � � � �� � � �Q ��  F0D2=/II7EF/U3=%�0 � � � �� � �� �I ��  F0D2=/II7EF/U3=$�0 �
 � � �� �� �� �A �{  F0D2=/II7ETQ?;;7Q�0 �� �� �� �� �� �� �% �_  F0D2=/II7EP7S7UJI2KEE73U�0 �� �� �� �� �� �� � �X  F0D2=/II7E\(FK57�0 �� �� �� �} �� �� � �Q  F0D2=/II7EJ99S7U�0 �� �� �� �v �� �� � �J  F0D2=/II7EP7Y7QS7�0 �� �� �� �o �� �| �	 �C  F0D2=/II7E2/E?1Q/U?KIRUKQ/;7�0 �� �� �� �h �z �u � �<  F0D2=/II7ER7ISKQ.WUK>4�0 �� �� � �a �s �n �� �5  F0D2=/II7ER7ISKQ>4H/G7�0 �z �~ �x �Z �l �g �� �.  F0D2=/II7E>I57]�0 �s �w �q �S �e �` �� �'  F0D2KEWGI<7/57QR=KQUH/G7�0 �� �� � � ��� ��� ��� �9�� �s��  F0D2KEWGI<7/57QH/G7�0 ��� ��� ��� ��� ��� ��� �2�� �l��  
F0D2KIU?IWKWS�0 �i �m �g �I �[ �V �� �  F0D2KEE73U?KITQ?;;7Q6I/1E75�0 � �" � �� � � �� ��  F0D2KEE73U?KIHWG4?;?U/E6Y7IUS�0 � � � �� �	 � �� ��  F0D2KEE73U?KI6I54?;?U/E.9U7QHWG�0 � � � �� � �� �� ��  F0D2KEE73U?KIR7E73U756Y7IUVI?US�0 �	 �
 � �� �� �� �� ��  #F0D2KEE73U?KIR7E73U756Y7IUR=KQUH/G7�0 � � � �� �� �� �~ ��  F0D2KEE73U?KIR7E73U756Y7IUH/G7�0 �� � �� �� �� �� �y ��  F0D2KEE73U?KIR7E73U756Y7IUT?G7�0 �� �� �� �� �� �� �t ��  F0D2KEWGI<7/57Q�0 �� �� �� �� �� �� �m ��  F0D2KEWGI<7/57QVI?US�0 �� �� �� �� �� �� �j ��  F0D2KEE73U?KIHWG6Z62KEWGIS�0 �� �� �� �� �� �� �. �h  F0D2KEE73U?KIJY7QS/GME?I;�0 �� �� �� �� �� �� �' �a  F0D2KEE73U?KIF/]4WQ/U?KI�0 �� �� �� �� �� �� �  �Z  F0D2KEE73U?KIHWGR/GME7S�0 �� �� �� �z �� �� � �S  F0D2KEE73U?KI47EU/T�0 �� �� �� �s �� �� � �L  F0D2KEE73U?KI6I=/I375T?G?I;�0 �� �� �� �c �u �p � �<  F0D2KEE73U?KIP7M7/U�0 �| �� �z �\ �n �i �� �5  F0D2KEE73U?KIR/GME7.U`7QK�0 �u �y �s �U �g �b �� �.  F0D2KEE73U?KIT?G7VI?U�0 �n �r �l �N �` �[ �� �'  F0D2KEE73U?KI4QKM2KWIU7QFK57�0 �g �k �e �G �Y �T �� �   F0D2KEE73U?KIVS7Q2KEE73UFK57�0 �` �d �^ �@ �R �M �� �  F0D6Z6.Y7Q/;74/U/�0 �[ �_ �Y �; �M �H �� �  F0D8/SURU/QU�0 �� �� �� �j �| �w �	 �C  F0D:KK;E7F/MSJM7I.IIKU/U?KIS�0 �b �f �` �B �T �O �� ��  F0D:KK;E7F/MSX/EW72KEWGI�0 �[ �_ �Y �; �M �H �� ��  F0D:KK;E7F/MSF/QC7QJMU?KIS�0 �V �Z �T �6 �H �C �� ��  F0DD/1LQKRKWQ37�0 �Sa �Wa �Qa �3a �Ea �@a ��a �a  	F0DD/1LQK�0 �N �R �L �. �@ �; �� �  
F0DLKQUP79�0 �" �& �  � � � �� ��  F0DP/5?/U?KI>IU7QY/ET?G7VI?U�0 �M �Q �K �- �? �: �� �  F0DP/5?/U?KI>IU7QY/E�0 �F �J �D �& �8 �3 �� ��  !F0DR7ISKQJ37/IJMU?3SZ/Y7E7I;U=6I5�0 �E �I �C �% �7 �2 �t ��  F0DR7ISKQJ37/IJMU?3SZ/Y7E7I;U=�0 �> �B �< � �0 �+ �m ��  F0DR7ISKQL=KUK;/U7VI?US�0 �7 �; �5 � �) �$ �f ��  F0DR7ISKQL=KUK;/U7VI?USF7U7QS�0 �0 �4 �. � �" � �_ ��  F0DR7ISKQRKWQ37>4�0 �) �- �' �	 � � �X ��  F0DR6.Y7Q/;74/U/�
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.utc.MichaelHolloway.LookupTable;
import edu.utc.MichaelHolloway.DataProvider;
import edu.utc.MichaelHolloway.DataProcessor;
import edu.utc.MichaelHolloway.DataDumper;
import java.util.Scanner;
import java.io.*;
import javax.swing.JFileChooser;
public class Driver
{
  public static void main(String[] args) throws IOException
  {   Sin sin=new Sin();
      MathSampler Sampler=new MathSampler(-Math.PI,Math.PI,-5,sin);
      DataDumper dumper=new DataDumper();
      Data data=new Data();
      data.run(Sampler,dumper);
      File inFile=null;
       JFileChooser chooser= new JFileChooser();
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        { 
            inFile=chooser.getSelectedFile();
        }
        //in file is either a valid file or not
        if(inFile==null)
        {
            System.out.println("no file selected");
            return;
        }
      Data data2=new Data();
        CSVreader reader=new CSVreader(inFile);
     LookupTable n=reader.nextData();
     DataDumper dumper2=new DataDumper();
     
     DataDumper dumper3=new DataDumper();
     Data.run(reader,writer);
     
   
     
}
}
                                                                                                                                                                                                                                                         �		
	
					 , �t  -  &  &  -  ,  %  GS&� GS� GS� G7��I G7/SWQ7G7IUS���  GS���  G7/SWQ75���  G/C7��k��  G7���e �# *  GKSU���X�� <  G?�� G?SS7S��  GK��e-I GKQ7��t� �� ��  
��,	D  G7/SWQ7G7IU���  G7/SWQ7���V%   GWSU���f�� ��  GW�� G/IW/E���  	G7IU?KI75���  G�-	0

��	      �5pBI�7PrO���h�e �9pBI�;PrO���h�e �3pBI�7PrO���h�e �pBI�g����O���h�e �'pBI�g��O���h�e �"pBI�g��O���h�e  �dhBw���a���g�g�b 
��hBw�Z�g�b  GKWU=�V  G�9)	 G[�9)	 G[�9)	 GG�0 ���j�g�|�� ���j�g�|�� ���j�g�|�� �v�j�g�|�� �H�j�g�|�� �C�j�g�|�� 	�:�i�d�] 	�D�i�d�]  GG�1! G/QC���	  GWEU?ME?3/U?KI���  G/QCS���  G?SU/C7��\  G/U=7G/U?3/E���A  G?I?G/E�  GU� �f�� �x �s �E�a��  GU�! G7U7QSe�  GKU?KIe^  G_�V#"�� RI  G/I_�4  
G73=/I?3/E�  GKU=7Q�  G/I��  G/AKQ�� $ SH  G/AKQS��  G_ H��%	! H@� H@��h  H���  HW
��-! HWG17Q��1�� �� �� �� �� �� ��  HKG7I3E/UWQ7�����  HK�� H/G7�1! HWGLE/37S�1! HWG4?;?U/E6Y7IUS�1! HWG�1! HWG6Z62KEWGIS�1! HWGR/GME7S�1! HWG17Q�1! HS�1! H.HS�1! HS�1! H.�1! H/G7S�1! H/�1! H/G7RU/QU�1! H/G7�


0
 �I����3� �I����.� �G����.� �<����,�
 
����� 
�	����
 ��������2��� 
���d�  	H7[4/U/�1! H7�1! 
HWGR73U?KIS�1! HWGRGKKU=?I;LK?IUS�0 �� �� �� �� �� �� �� ��  HWG47Q?Y/U?Y7LK?IUS�0 �� �� �� �� �� ��  ��  HKI7���  HWG7Q?3���  H% HW% HWG17Q% I/G7�-

E,!��? _ _   _ _  _  ��< _ Z Z Z ���� Z Z Z Y Z  I+�															-)A I/�-

E-! IW�
	
	
			A- 
IWGT/Q;7US�-%	-7 ( ( ( ( ( (  IWG47M7I57I3?7S�-%	-2 # # # # # #  IWG2KGG7IUS�
%         I7[�%A�W! �� 7 7 m  I7�
	%		]u I775S�	)	%	# �s # # # # # #  IK
�	)	!	])I IKU�)	%	](H �y5=��       O �� o �<B  IKU7��'  I/Y?Y?7[�A-d d d  IWG17Q�     IWEE�{  I7]U�L  IKS7�H  IWGPK[S�1�h �l �f �H �Z �U  I��� ��73  I7Y7Q���  I7SU75���  IWG17QS���  IKe��  J�	)		-%
 JH� JH�P  JM�uI1! JM7Q/U?KI� J8�%)	%	 J8�%)	%	4 4 4 4 4 4 4  J1
��1 J1S7QY7��  JM7I���  J9	��1! J9�  JMU?KIL/I7� JM7I.IIKU/U?KIS�1! 	JMU?KIS�1! JMU?3SZ/Y7E7I;U=6I5�1! J37/IJMU?3SZ/Y7E7I;U=6I5�1! J3�1! JMU?3SZ/Y7E7I;U=�1! J37/IJMU?3SZ/Y7E7I;U=�1! JM�1! JI2KEE73U�1! JI	�%
! J99S7U�1! JY7QS/GME?I;�1! JY�1! JWU2Q7/U72KISU/IU�1! JW�1! JWU.GME?UW57�1! JWU8Q7OW7I3_�1! 
JWUZ/Y78KQG�1! 
JWU2KEWGI>4�1! 
J99S7UX/EW7�1! J1A73UT=?3CD?I7S�1! J1A73U.WUKG/U?3473?G/E�1! J1A73ULQ73?S?KI�1! J1A73ULQ73?S?KI473?G/E�1! J1A73U4/U/RKWQ37�1! 
J1A73U2KEKQ�1! J1A73UR=KQUH/G7�1! J1A73UH/G7�1! 
J94/_8KQG/U�1! 
JI8?QSU4/U/�1! JMU?KIS4?/EK;S�1! JITKKE1/Q�1! JR�1! JR�1! JB� JB���  JI7���  JP� JP�s  
J1A73U?Y7Se  K�
				Y%I K9�

e%I K9�d	
%	H ���� ��03'?
N%* 2}
    ����   �� && � +		
 ��		  ��&	N1
 �΀� >  KQ�			%	Y KQ�		%	X8 ���  8  8   8 8 8 8 ���� u ��  K1�� 	K1A73U?Y7��G  KI�uu	)I KI��I�� �!b' ��  K1S7QY7�L  KW�-e KWU�,d
S ` o ��	 j
 
�� && � +# ��  KY�� KY7Q��G �  KI7�u	)M  �� ��  K�A  KM�} KM7Q/UKQ���  	KM7Q/UKQS���z  KU� KU=7Q��  KWUS?57���  KIE_�p�� �=B  K9U7I��^  K1A73Uea  KM7Q/U7$  L�

		
)	
	-A L4�		
	)			
		
	

	 L/I7� L/
�I1!A L/Q/G7U7QH/G7S�1! L/;7>I57]�1! L/;7�0 ���V�� ���V�� ���V�� ���V�� �^�V�� �Y�V�� �
�J�i ��J�r  	L/;7T/1E7�0 ���� ���� ���� ���� �[�� �V�� ��� ���  L/;7P7ME/_Z?I5K[LKS?U?KI�0 ���� ���� ���� ���� �a�� �\�� ��d �#�m  L/M7QD?I72KEKQ�1! L/;7:Q/M=L/M7QD?I72KEKQ�0 ��	��	 ��	��	 ��	��	 ��	��	 �V	��	 �Q	��	 �	�c	 �	�l	  L/M7QD?I7RM/3?I;�1! L/;7:Q/M=L/M7QD?I7RM/3?I;�0 ���� ���� ���� �x�� �J�� �E�� ��f ��o  L/M7Q�1! L/;7:Q/M=L/M7Q�0 �|�� �|�� �z�� �o�� �A�� �<�� ���h ��q  
L/;7>I9K�1! L/;7L/;7>I9K�0 �u�� �u�� �s�� �h�� �:�� �5�� ���j ���s  L/;74?SME/_L/;7>I9K�0 �p�� �p�� �n�� �c�� �5�� �0�� ���h ���q  	L/;72KEKQ�0 �i	��	 �i	��	 �g	��	 �\	��	 �.	��	 �)	��	 ��	�c	 ��	�l	  	L/;7T?UE7�0 �]�� �]�� �[�� �P�� �"�� ��� ���j ���s  L/;7<7EM7Q4/U/2WQY78?U�0 	�=�0��5 	�=�5��0 	�;�3��0 	�0�0��. ��0 ��1 	���0�ց3  L/;7:Q/M=2/QU7S?/I�0 	�
��;� 	���6� 	���6� 	���4�
 �ς� �ɂ�
 	�ɂ��� �Ă
�  L/?QS�1! 
L/;70KWI5S�0 �� �� �� �� �� �� �� ��  L/;7<7EM7QLK?IUST/I;7IU`	�����N��  L/M7Q%  L/ 
L/_3=73C L7�

� L7/QSKI��`  L7Q37IU���� 
  L7Q?G7U7QT7SU7Q�a (   L7� L7Q?G7U7QT7SU7Q� 	L7Q?G7U7Q�W  L<�1 L<JTJ�1�� �� �� �� �� ��  L=_S?3S��Y�Q  	L=KUK;/U7����4!O  L=	��1! L=KUK;/U7VI?US�1! L=KUK;/U7VI?USF7U7QS�1! L?3C7U��1�			��0{E-�� 1		����   3 L
  2 3
  2 4�	!�TD-@	!�TD-
  5 6
 
 2 7
  2
 8 9 :	 ; < =
 > ? @ A <init> ()V Code LineNumberTable LocalVariableTable this LMainDriver; main ([Ljava/lang/String;)V writer LCSVWriter; e Ljava/io/IOException; args [Ljava/lang/String; sin LSin; Sampler 
LMathSampler; dumper $Ledu/utc/MichaelHolloway/DataDumper; 
StackMapTable # 3 4 6 : 
SourceFile MainDriver.java   Sin MathSampler  B "edu/utc/MichaelHolloway/DataDumper 	CSVWriter C D E java/io/IOException F G H Error: Could not write I J K 
MainDriver java/lang/Object (DDILFunction;)V Data run P(Ledu/utc/MichaelHolloway/DataProvider;Ledu/utc/MichaelHolloway/DataProcessor;)V java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V !               /     *� �                        	       �     =� Y� L� Y  +� 	M� 
Y� N� Y� 
:,� � 
:� � �    / 2      & 	           )  /  2  4  <     >  )     4    !    = " #    5 $ %   % & '     ( )  *    � 2  + , - .  /	  0    1                                                                                                                                                                                                                                                                                                                                                                                         +� 	M� 
Y� N� Y� 
:,� :� Y� :� � 
� :� � � �� Y� :� Y� :� Y� :		� W	��� 	� 	� -� � 
:� !� �    X �   Y � �    '   b            )  /  2  ;  D  K ! P # X $ Y & d ( m * v , ~ / � 0 � 1 � 2 � 6 � 4 � 5 � 8 (   p  ) r - .  2 i / 0  ; ` 1 2  d 7 3 4  m . 5 6  v % 7 8 	 �  9 :    � ; <    � = >   � ? @    � A B  C   6 � K  D E F G H I J  
� D  D E F G  K	  L    M                                              �-%	- 	M/3C/;7�-%	- M.�															-%A MQ�		

	
	]q MQKA73U�	D 
 5 5 
 5 
 5 5 
 
 5 
 
  M/3C/;7�	,		$			,	
? 
0 
0 
0 
0 
0 
0  M/�
	

		
	� M/Q/GS�
%         MW1E?3�$) N * # # * ) "  MW�

� M/?IU2KGMKI7IU�	 P  MM� MM��j  M?	��1! M?3C7U��|  MK��% MK?IUS��
�� 
�� && � +# ��  MQ7M/Q7��?  MWQMKS7�#  MQ?IUEI�,U b q �� l
  MQ?IU���  M7Q9KQG���5  M7�� M/QU�g  M?�1!�P �P �P �P �P �P �O �P  MQK;Q/G���  MQK37SS�  ME�)I ME/375�)�� ��  MK?IU�%��   MKSS?1E_���  MQK;Q/GG?I;��[  MQKY?57��  
MQ7579?I75��  MQK1E7G�	  M7Qe�   MQA 	MQK1E7GA MWQSW7�^8
 C  ME/37�3  MQK;Q/GSp  M/QUS8  MQKM7QE_%  
M/QU?3WE/Q
  NW/5Q/U?3�1! N�%!A NW�%! NW7SU?KI�	
�� &&
 � +# ��
  NW/5`����  N  O�� OW�� OW?3C�1  OWKU?7IU�k%  OWKU7���  P73U/I;E7X?7[7Q��ˀ� '  P73U/I;E7LQK;Q/G���~ X JB  P7�


Ae%
 P�

	%	%	-%	 P�	)	%	� P7�
 P73U/I;E7X?7[7Q� P73U/I;E7LQK;Q/G� P6�%)	%	 P64���  	P73U/I;E7�$@��A 8 8  P73KY7Q�W  P6�%)	%	� P6.4F6�%)	%	 P6.4F6�%)	%	        P7MKQU� P?	��1! P?Y7Q��f  
P797Q7I37S��V����  P7SWEUS���8� @  P73KQ5��+  P7GKY7��0  P/I;747S3�1! P/�1! P7S7UJI2KEE73U�1! 	P7Y7QS7�1! P/5?/U?KI>IU7QY/ET?G7VI?U�1! P/5?/U?KI>IU7QY/E�1! P7M7/U�1! P79�1! PK	�-! PK[S�1 PWI�1! 	P7/5KWU�1! PW�1! PKU/U?KI�


0
 �P����3� �P����.� �N����.� �C����,�
 
����� 
�����
 ��������2��� 
���d�  P7ME/_Z?I5K[LKS?U?KI�1! PFR6�1! P/I;7�1! 
P/I;7F/]�1! 
P/I;7F?I�1! 	P/?I1K[�1! PKU/U75.I;E7�1! P?;=U^.]?S�1! PF�1! P7ME/_Z?I5K[P7M7/U�0 � � � � � � � �  P7ME/_Z?I5K[RM775�0 � � � � � � � �  P7ME/_Z?I5K[LKS?U?KI�0 �	 �	 �	 �	 �	 �	 �	 �	  P7SKEWU?KI�1! P/5?/IS�0 y y y y y y x y  P7SMKIS7���  PKWI5��3  P7GKY/Ee��  
P62^2D6PU Q7/5G7�`  Q�

	%	%	Y)I Q7�

	%	%	Y)M 
Q73U/I;E7S�
F G  	Q73U/I;E7�ew v  Q7/57Q�%)	%	        Q7SM73U?Y7E_���  Q7/E?a75���  Q?� Q?;=U���  QW�Y QWII?I;��o  Q7SWEUS��H  Q7M7/U���  Q7E?/1?E?U_���  Q7G/?I��u  	Q7E7/S?I;��`  Q7/5?I;��  Q?I;���  Q?;?5E_���  QWIS�p  Q�) Q� 
Q7E/U?KI/E���  Q7/5S���  Q797QS�`  Q7SWEU��r,j  	Q7UWQI?I;���  
Q7MQ7S7IUS�.  Q7m Q7/Em Q7OW?Q7G7IUSd��  	Q73K;I?a7e��  QQ QQ$&πQ  Q$ 	Q$XG/]% Q7/SKIK  Q7OW?Q75  R*�								
									%	 R
�	�%9 RY R/	��1! R/5E7��e  R/GME7��%t��  	R/GME7S�1! R/GME7.U`7QK�1! R3	��1! 	R3?7IU?SU��[  R3?7IU?9?3�1! R3Q77IP7SKEWU?KI�0 �� �� �� �� �� �� �� ��  R3� 	R3?7I37� R7��%	! R73KI5S���   R7ISKQJ37/IJMU?3SZ/Y7E7I;U=6I5�1! R7ISKQJ37/IJMU?3SZ/Y7E7I;U=�1! R7ISKQL=KUK;/U7VI?US�1! R7ISKQL=KUK;/U7VI?USF7U7QS�1! R7ISKQRKWQ37>4�1! R7ISKQ.WUK>4�1! R7ISKQ>4H/G7�1! R7E73U756Y7IUVI?US�1! R7E73U756Y7IUR=KQUH/G7�1! R7E73U756Y7IUH/G7�1! R7E73U756Y7IUT?G7�1! R7QY7Q�1! R7Q?/EHWG17Q�1! R7U�1! R7U:Q/M=F/U3=�1! R7UX?57K.I/E_S?S�1! R7ULQ75?3U?KI�1! R7URUKQ75PWI�1! R7U.WUK2Q7/U75�1! R7UD/U7SU�1! R7U88T�1! R7U<?SUK;Q/G�1! R7UR=K[>I4/U/0QK[S7Q�1! R7URKWQ37H/G7�1! 
R7U2KGG7IUS�1! 	R7UH/G7�1! R7ISKQY?EE72/E36OW/U?KI�


0


 �U�h�e�z�� �U�h�e�z�� �S�h�e�z�� �H�h�e�z�� ��h�e�z�� ��h�e�z�� 
��g�b�[ 
��g�b�[  R7ISKQ>IMWU2KEWGI�1! R7ISKQ2KEWGI�1! R7ISKQ2KI9E?3U6I/1E75�0 �& �& �& �& �& �& �% �&  
R73U?KIS�1! 	R7MU7G17Q�	�� ��  R7E73U75���  R=�	1	 R=77U'�	]        R=77U&�	]        R=77U%�	]        R=KQUH/G7�1! R=?9U�1 R=KQU2KEWGIH/G7�1! R=K[>I4/U/0QK[S7Q�1! R=K[D?Y7P7/5KWU�1! 
R=K[PFR6�1! R=K[.EEX/EW7S.SF/AKQT?3CS�0 ���F ���A ���A ���= ��� ��� ��� �{�  R=K[LK?IULQKU73UKQS�1! R=K[0/S76QQKQ0/QS�1! R=K[TQ/376QQKQ0/QS�1! R=K[2WQSKQ47EU/�1! R=K[2WQSKQRU/UWS�1! R=K[D7;7I5�1! 
R=K[T/I;7IU�1! R=K[LK?IUS�1! R=K[:Q/M=F/U3=JITKKE1/Q�0 �� �� �� �� �� �� �� ��  R=K[`7QKJITKKE1/Q�0 �� �� �� �� �� �� �� ��  R?	��1! R?a7	��1! R?a7�


0
 �����3� �����.� �����.� �����,�
 
������ 
������
 ��������2��� 
���d�  RGKKU=?I;LK?IUS�1! RG�1! RJ� RJH>2���  
RKWQ37>4�1! RK�1! RKWQ37R7QY7Q�1! RKWQ37�1! 	RKWQ37&�1#BlueJ class context
comment0.params=args
comment0.target=void\ main(java.lang.String[])
numComments=1
                                                                                                                                                                                                                                                                                                                                                                                                                     ���k  	RUKQ/;7�1! RUKQ7D/U7SUF/]�1! RU/QU�1! RUQ?I;�1! RUKQ75PWI�1! RUKQ7S�1! RU/QU2KEE73UT?G7�1! RU_E7�1! 	RU/QUT?G7�


0


 �|�f�c�x�� �|�f�c�x�� �z�f�c�x�� �o�f�c�x�� �A�f�c�x�� �<�f�c�x�� 
�3�e�`�Y 
�=�e�`�Y  
RU/QU>I57]�0 �� �� �� � �Q �L �� �  RU_E7S�


0
 �/	��	�
	�.	�
	 �/	��	�
	�)	�
	 �-	��	�
	�)	�
	 �"	��	�	�'	�	 
��	��	�
	�	 
��	��	�	�	 ��	��	��	�	�-	��	�
	 
��	�_	� 	  RU/3C2KEWGIS�1! RU/UWS�1! 
RU/U?KI7Q_�0 �� �� �� �� �� �� �� ��  RUQ/?;=Ud  RUW99! RW�1u1! RWGG/Q_�   RWG63U�a !  RW�	 RWG63U�	 RW1KQ5?I/U7J99S7U�


0
 ����	��1	� ����	��,	� ����	��,	� ����	��*	�	 
����	�� 
����
��	 �P��	��	�
�0	��	� 
�Z�d�  RW1KQ5?I/U7TK>4�


0
 ������6� ������1� ������1� ������/�
 
������ 
������
 �H������5��� 
�R�e�  R_� R_G1KE���  R_SU7G�Q ^ m �� �� h
  S�0@    
  �U�h� �U�h� �S�h� �H�h� ��h� ��h�  ��0. ��g�� ��g�� �Y(d  S,�

		

	
		%A S� S/e S/G7e��  S/U?S9_e��  S/U?S?9_e��  S3�� S3/UU7Q���  S3Q77I��  S3� 	S3?7I37� S3?7I37y  S7�

�)	A 
S7UX?S?1E7�b  S7U479/WEU2EKS7JM7Q/U?KI�J  S7UT?UE7�C  S7UR?a7�;  S7U2KEKQ���H  S7U���  S7Y7Q/E��l  S73U?KI��>  S77I���:�� ��-  S7M/Q/U7���  S73KI547Q?Y/U?Y7T?G7R=?9U�0�΂� �҂� �̂� ���� ���� ����  S7IU?I7E���  S73KI5e�!  S77e��  S73KI547Q?Y/U?Y7`��� �?��  S77G75��  
S=K[>IU7Q9/37�-%	-��? d k d d k k  S=�					Y	) S=K[VS7S�-%	-A 2 2 2 2 2 2  S=K[6]U7I5S�-%	-< - - - - - -  S=KWE5�	($) �6 ) ) ) ) ) )  S=7�%)	%	" " " " " " "  S=K[I���,p ��  S=K[F7SS/;74?/EK;�y  S=K[>IMWU4?/EK;�Z  S=/M7�	- 7  S>�1! S>4�1 �C �G �A �# �5 �0 �B �AB  S?��1M S?57S��j  S?]���z  S?57d�  S?GME7  SEKM7����  �  SE�� SGe SG/EEe��  SK
�	)		])I SKG7KI7�%)	%	        	SKG7U?G7S��x  SK9U���  SK���  SKQQ_���  	SKG7U=?I;��  SK9U[/Q7�q ��  SKEWU?KI�) ��  SKG7��  SMiI SM775i sS  SM73?9?3/EE_2  SM73?9?30  SOe SOW/Q75e�"  SS�0 ���j�g�|�� ���j�g�|�� ���j�g�|�� �x�j�g�|�� �J�j�g�|�� �E�j�g�|�� 	�<�i�d�] 	�F�i�d�]  SS�1! SU�9%I SU/U?3�1* + $ $ + * #  SUQ/?;=U���  SU/UWS��  SU/I5���  SU7M2KEWGI0/S75�1�A �E �? �! �3 �.  SU7M�(	�_ �c �] � �? �Q �L  
SU/U7G7IUS���  	SU/U7G7IU�	��E E  SU/QU�/  SUKQ75��t  SUKQ/;7�`  SUKQ7S�L  SUKMM75e��  SUW5?75w  SU/QU75`  SW�I�)I SW3=���� ��  SWQ9/37���  SWQ7���  SWG�[#  SWMMKQUeW  SW?U75��  S[�
� S[?I;�
�! = !  S_G1KE�����  S_� S_IU/]�  T���  T+�

	
	
	
	

%A T�

	%	=	 T�1! T/Q;7U�-%	- T/�%	%	-%!1! 	T/Q;7US�-%	- T/1E7�	����� 	  T/;�1! T/1E7�1! T/1E72KEWGI�


0


 �� �� �� �x �J �E 
�� 
�   	T/I;7IU�1! T7�		

	%	-1! T7EE�%)	%	        T7SU��			 3			  T7�
9u T7SUS� T7SU7Q�
5
 T7SU7Q�9 T7]U�1! 
T73=IKEK;_�1!: : : : : : : :  T7SU� T<�%)	%	 T<>R�%)	%	> > > > > > >  T=�	%		-%A T=7S7���� 5  T=?S�)		���  ��9��     ��, S   J  T=7�	$		Y(Hr ' 
������["" ' ' ��% ' ' K ' ' % ��B�� �� �\ ��.  T=7KQ_�C  T=?3CD?I7S�1! T=7_e��  T=WS�N  
T=QKW;=KWU��  T>�%)	%	 T>TD6�%)	%	1 1 1 1 1 1 1  T?��1	 T?UE7	��1! T?G7��0
�$					% 9					      ��5���� ��5���� ��5���� ��5�z�� ��5���� ��5����  �[6���� ��6�̀�  T?G7R=?9U�1 T?G?I;�1�� �� �� �� �� ��  
T?G7VI?U�1! T?G7�1! T?G?I;�1! T?G7J99S7UX/EW7�1! T?G7J99S7U�1! T?G7J94/_8KQG/U�


0


 ���b�_�t�� ���b�_�t�� ���b�_�t�� �z�b�_�t�� �L�b�_�t�� �G�b�_�t�� 
�>�a�\�U 
�H�a�\�U  T?3CS�1! T?3CSPKU/U75.I;E7�1! T?3C2KEKQ�1! T?3CRU_E7�1! T?UE72KEKQ�1! TJ�%)	%	 TJ�%)	%	< < < < < < <  TK���"  TK	��1! TK�1! TK>4�1! 	TKKE1/Q�1! TQ/37�1! TQ	�)	! 	TQ?;;7Q�1! 
TQ?;;7Q4/U/�1! TQ?;;7QLQ7TQ?;;7Q4/U/�1! TQ?;;7Q2KISU/IU�1! TQ?;;7QVS72KISU/IU�1! TQ?;;7QX/EW7�1! 
TQ?;;7QT_M7�1! TQ?;;7Q6I/1E75�1! 
TQ7/U.ST7]U�1! 
TQ/ISM/Q7IU�1! TQ/372KEWGI>4�1! TQ/376QQKQ0/QS�1! TQ/37>4L/?QS�1! TQW7�t  TW
�%	! TW&�1!�� �� �� �� �� �� �� �8  TW�1!�� �� �� �e �w �r �� ��  TW� TWUKQ?/E\� 
TWUKQ?/E� TW7S5/_�	�� ��  T[� T[K�E  T\�%)	%	 T\T�%)	%	 T_M7�1! T_�1! U/Q;7U&�
��  U_M7�-%	-��?�� i p i i p p  U/�
	

		
!Q U/Q;7U%�,$,
�� v 
} v v 
} 
}  U.�				
											
%A UQW7	�
 $,pC d 4 h4 4 4 h4 h4 �Ҁ�  UQ	�
!%	-q U_�-%	- UK�	%		I)I UK�$		H(H $ �j��m6I	& $ $ a $ $ d $ $  ��� 	�� 4 ���� 	�
 Hb 
�]
+
h
 B  U/Q;7U	�
  �U        U=7�9$	X(H��  ;��
		
3(	

$&  @  ��   ��)3 e   ��:0&$ �H. ��D)5b
 �!( 	��	.6 ;  U=�		%		
M)I U[�e� U[K�e�F �� ��  U=/U�
tu(HD �( ��&  �� ��� �| �9VS  U=?S�)	!	
� �ۂ�#     c   
 /  UI��A��  U/1E7S����   U7
�u)!)	 U7SU	��!)	��  F F F  F F F  U�uI1	�� �� �8 �8 �6 �+ �� ��  �� ��  U/1E7��3+  U?G7���F �X:  U?��-I U=Q77���  U=7I���  UKW3=��h  U=QKW;=��M  UKM��E*  UI� U=7KQ7U?3/E�E  U=/I��u6 � ��  U7EE?I;�n  U=7G�O  U�!1 U/� U/1E7S� U7�1 U7SU�1 U?G7S�u��6 �5  
U7QG?I/U75���  U/C7I�"  U=7Q7em  U=/ICS�O  U=?I;S��  U=KS7��  UK[/Q5Sc  U=7?QN  U UKU/EE_(  V��	 VR� 	VR0&$84� V�					-)	 VT�-%	- VT8�-%	-H 9 9 9 
/**
 * Write a description of class MainDriver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import edu.utc.MichaelHolloway.LookupTable;
import edu.utc.MichaelHolloway.DataProvider;
import edu.utc.MichaelHolloway.DataProcessor;
import edu.utc.MichaelHolloway.DataDumper;
import javax.swing.*;
public class MainDriver2
{     
      public static void main(String[] args)
      {


     File inFile=null;

    JFileChooser chooser= new JFileChooser();
    if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
    { 
        inFile=chooser.getSelectedFile();
    }
    //in file is either a valid file or not
    if(inFile==null)
    {
        System.out.println("no file selected");
        return;
    }
    try
    {
    CSVreader reader=new CSVreader(inFile);
    // set up plotter
    System.out.println(reader.nextData().printAll());
       SwingPlotter plotter = new SwingPlotter();
    // set up Swing frame
    JFrame frame = new JFrame();
    // add SwingPLotter to frame
    frame.add(plotter);
    // make frame visible

    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
   }
   catch(IOException e)
   {
       System.out.println("Error retrieving file");
   }
   
 
}
}
                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               �1! X/EW7S�1! X7QU?3/E@WSU?9?3/U?KI�


0
 �#����3� �#����.� �!����.� �����,�
 
������ 
������
 ��������2��� 
���d�  X/EW7S.SF/AKQT?3CS�1! 	X7QS?KI�1! X7QS?KI�0          X?SW/Eq X7Ea�G ��  XG XG/]% 
X?SW/EDK;?3
 Y�		

	
	
					9)A YK�			
	
					 YK?5�			
	
					 +  O  ,  %  %  ,  +  $  Y7
�

� Y7QS?KI�
$         Y_��6
o�B  Y_K��)��  YS��#					�5 8					  Y/EW7S�����  Y/�Y�) Y7EK3?U_����

 �  YS� Y7QU?3/E��v  Y_� Y/EW7���� �Lo
 ��  Y/Q?/1E7��c M! ��%  Y	�0�|�� ���� �z�� �\�� �n�� �i��  ���F ��v  Y�--
	 YE�--
	 YES�--
 Y?�q Y?SW/E�)  Y/E?5d��^  Y?S?U?I;�-  Y$ Y$U  YES?;	 YG YG] Z�

9%!A ZQ�
% ZQ?U7�
%         Z?�Ae1! Z?U=?I���  Z?5U=�A Z�|+  Z=/U�u_ �� �Bi  Z=�I%!A Z/Y7E7I;U=6I5�1! Z/�1! Z/Y7E7I;U=�1! 
Z/Y78KQG�1! 
Z/IUH.HS�1! Z=?U7�1! Z?I5K[LKS?U?KI�1! Z?I5K[P7M7/U�1! 
Z?I5K[RM775�1! Z�	u Z?�	 	Z?I5K[S�	 Z=7I�q�� �k�D ��  Z=_'   ZK ZKQ5  Z= Z=_ [?5U=�,$
 ��''7 n'7 u.7 n'7 n'7 u.7 H u.7  [�			
		Y)I [?
�
	%	
!uq [?U=��p�� �`��x ��D � ��|  [=
�	)	%	Y	)I [=K�%)	%	�       ��  [/S�	�H��
.��j �� ��"W@  [=7I���n� ��  [7�� [7Q7���$ ��T  [=?3=��� ,  [/��I [K�}q [KWE5�|pa �C �;U  [=7Q7���  [?EE���6  [Q?U?I;���  [Q� [KQC�2��   [=/U��  [KQC?I;SF  [=_M  \(FK57�1! \	�%
! \(�1! \D/17E�1! \F/]�1! \F?I�1! \T?3CSPKU/U75.I;E7�1! \.WUKS3/E7<?IU�1! \.WUKS3/E7JI8?QSU4/U/�1! \.WUKS3/E7�1! \.]?S�1! \D�1! \T�1! \F�1! \.�1! \� \� \�u  ]�,$,D0 A��%%7 s%7 z,7 s%7 s%7 O z,7 z,7 	����PrO 	����PrO 	����PrO ������O �ǀ�O ��O �7��� �����À�����PzO�� �q����   ]�%	%-E1!A ]G?I��?��  ]G/]��=��  ]_� ]_���  ]G� ]�	] ]E�	] ]ES]�	] ]&7�1! ]9999�1! ]$�1! ]99999999�1! ]+�1! ]+9+9�1 ](�1! ]()()�1! ],�1! ],1,1�1! ]'�1! ]''''�1! ]+$+$�1! ],(,(�1! ]*'*'�1! ]3$3$�1! ]3�1! ]&�1! ]$	�1!A ]9�1! ]*�1! ]$  ^F/]�1! ^F?I�1! 
^D?IC75>4S�


0
 �����3� �����.� �	����.� ������,�
 
������ 
������
 ��������2��� 
���d�  ^.]?S�1! ^D/17E�1! ^.WUKS3/E7<?IU�1! ^.WUKS3/E7JI8?QSU4/U/�1! ^.WUKS3/E7�1! ^D�1! ^F�1! ^
�%
 ^.�1! ^K�1! ^KWQ�1! ^�w

  ^e ^7e ^7/=e ^7e ^7Se�	  _�,$,��##7 x#7 *7 x#7 x#7 Q *7 *7  _�		

		]- _K�				] _KWQ
�			 	��[-#
         G    _KW	�%)		\     b   ��  _?e _?7E5Se��  
`7QK479/WEU�1! `7�1! `7QK�1! `7QKJITKKE1/Q�1! `�1! b�


		
 b�


		
                b�	 b�	 d��1��}��9 �G �K �E �' �9 �4  d��1! dl� dl���  dx�1! dxeb�1!�� �� �� �y �K �F �<  e
��1 e��   eb�0 �V� �V� �T� �I� ��� ��� �
�� ���  eb�1! f���	  f� g)�								
								

%		 g)�								
$ c  ��;  �_���;����  V   	c(   r3  9    	��(  &        
 	����/ 	� ���3 	����- t �L 	����� 	����! 	�	���  �D���d �~����  gho�pY! k  g��q-91! g��p,80 D �� m
 ��5: ��5: ��5: ��5: ��5: ��5: �W6 ��6  gh�1A ghi�N  g�	%	9 g�	%	9 g|� g|�O  gd�0 ��BK ��BK ��BK ��BK ��BK ��BK �B �@B  gd�1! ho�$e 
�� X e t ��Z ��  h"�					

%		 ho�
% h"�			
$	1
  _8
  
�P
X��^T 2  +  + 2   1
 *
         3 3 3 z �P 3 3 3  3 3  hk� hk��i  hg��L
��  h#� h#g��/  h”� h”���  hg� hl��Y .  hl�� hm�u1 hm�u1R �m �q �k �M �_ �Z  h�	%	9 h�	%	 hpm�0 ��BB�� ��BB�� ��BB�� ��BB�� ��BB�� ��BB�� �B| �BB|  h��0 � �" � �� � � �� ��  h��1! hp�1! hl� hl� i�
%9-! im�
% im�
%         i�$8- 	 	 	 	 I6	 {h	 	 	 	����PrO 	����PrO 	����PrO �� ������O �ƀ�O ����O �������À�����PzO  ii� iiiii���  jm#���,��   j�1-%	!E jm�� j�0H


$ DJ P �� �� ��QrPJ%O ��QrPJ%O ��QrPJ%O v& � 
��OqOH%O ��OH%O ������   3 g
  6 7
  6
  8
  9	 : ; <
 = > ?
 	 @
 	 A
 B C D
 
 6 E
  6
  F
  G
  H
  I J K L M <init> ()V Code LineNumberTable LocalVariableTable this 
LMainDriver2; main ([Ljava/lang/String;)V reader LCSVreader; plotter LSwingPlotter; frame Ljavax/swing/JFrame; e Ljava/io/IOException; args [Ljava/lang/String; inFile Ljava/io/File; chooser Ljavax/swing/JFileChooser; 
StackMapTable N 7 J 
SourceFile MainDriver2.java   javax/swing/JFileChooser O P Q R S T U no file selected V W X 	CSVreader  Y Z [ \ ] ^ SwingPlotter javax/swing/JFrame _ ` a b c d e f java/io/IOException Error retrieving file MainDriver2 java/lang/Object java/io/File showOpenDialog (Ljava/awt/Component;)I getSelectedFile ()Ljava/io/File; java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V (Ljava/io/File;)V nextData '()Ledu/utc/MichaelHolloway/LookupTable; #edu/utc/MichaelHolloway/LookupTable printAll ()Ljava/lang/String; add *(Ljava/awt/Component;)Ljava/awt/Component; setSize (II)V setDefaultCloseOperation (I)V 
setVisible (Z)V !               /     *� �                        	   !    G     xL� Y� M,� � ,� L+� � � �� 	Y+� 
N� -� � � � 
Y� :� Y� :� W��� � � � N� � �  $ k n      N       
        #  $ # - % : & C ( L * T - _ . e / k 5 n 2 o 4 w 8    H  - > " #  C ( $ %  L  & '  o  ( )    x * +    v , -  
 n . /  0    �  1 2� I 3  4    5                                                                                                                                                                                                                                                                                                                                                                                                                                           �2��Q
��
��
��
��
��
��
��
�8�S�'1�(1��


��9RA	����C	��.A	����_	��;XI��6 �ԐI�Y�S�'1�(1��


��9j��� 9XI��7 �c"
 T  l4�																%A lpm`����  lpa m�)		)@  ! 	���Ҁ� ! ! ! !   ! !      �T�h�k �T�h�k �R�h�k �� �� ?73 �G�h�k ��h��k ��h��k  ?0 ��g��k ��g��k   m"�
						)A mi�
% mii�
%         mm�d�� ~ ��, a  mm�e mmmmmmm�2  md�0 ��B ��B ��B ��B ��B ��B ��B �7B  md�1! me�1! meb�1!� �# � �� � � �� ��  n�	($,$ AE �� E E E E E E ���h�e�z����k. ���h�e�z����k. ���h�e�z����k. ��H w 	���� �w�h�e�z����k. �I�h�e�z����k. �D�h�e�z����k. �;�g�b�[�;k- �E�g�b�[�Dk. &  n�	)	%	-%!A o�

1I1! o�
0H0 $ a! �& P+ T	 }X $ �
�� ��� ��� �픴 ���� ��� ���S �Ə�  opm�0 �!���2 �%���2 ����2 ����2 ��ā2 ��ā2 ���`�1 �ځ�  oeb�0 �� �� �� �{ �M �H �>  ox�1! oxd�1!�� �� �� �w �I �D �:  oe�1! op�1! pm����0��� �����n	
	



	
	"


!




	


	


 
	
	


 

>








	

			

			
	
		

			
	
	
		
	 ���r	
	



	
	"


!




	


	


 
	
	


 

>








	
		

			
	

			

			
	
	
		
	 ���l	
	



	
	"


!




	


	


 
	
	


 

>








	
			

			
	

			

			
	
	
		
	 ���N	
	



	
	"


!

	

	
	
	
	


 
	
	


 

>








	

			

	
	

		

		
	
	
		
	 ���`	
	



	
	"


!

	

	
	


 
	
	


 

>








	

			

			
	
				

	
		
	 ���[	
	



	
	"


!

	

	
	


 
	
	


 

>

x,-3.141592653589793
f(x),-1.2246467991473532E-16
x,-1.8849555921538759
f(x),-0.9510565162951536
x,-0.6283185307179586
f(x),-0.5877852522924731
x,0.6283185307179586
f(x),0.5877852522924731
x,1.8849555921538759
f(x),0.9510565162951536
x,3.141592653589793
f(x),1.2246467991473532E-16
                                                                                                                                                                                                                          9474462003
f(x),-0.12533323356430542
x,-3.003362576831841
f(x),-0.13779029068463935
x,-2.9907962062174818
f(x),-0.15022558912075842
x,-2.9782298356031225
f(x),-0.16263716519488508
x,-2.965663464988763
f(x),-0.17502305897527762
x,-2.953097094374404
f(x),-0.18738131458572632
x,-2.9405307237600447
f(x),-0.1997099805144088
x,-2.9279643531456854
f(x),-0.2120071099220565
x,-2.915397982531326
f(x),-0.22427076094938317
x,-2.902831611916967
f(x),-0.23649899702372676
x,-2.8902652413026075
f(x),-0.24868988716485696
x,-2.8776988706882483
f(x),-0.2608415062898992
x,-2.865132500073889
f(x),-0.2729519355173276
x,-2.8525661294595297
f(x),-0.2850192624699786
x,-2.8399997588451704
f(x),-0.2970415815770375
x,-2.827433388230811
f(x),-0.30901699437495006
x,-2.814867017616452
f(x),-0.3209436098072122
x,-2.8023006470020926
f(x),-0.33281954452298945
x,-2.7897342763877333
f(x),-0.34464292317451994
x,-2.777167905773374
f(x),-0.3564118787132537
x,-2.7646015351590147
f(x),-0.36812455268468103
x,-2.7520351645446555
f(x),-0.3797790955218043
x,-2.739468793930296
f(x),-0.39137366683720565
x,-2.726902423315937
f(x),-0.40290643571366597
x,-2.7143360527015776
f(x),-0.41437558099328753
x,-2.7017696820872183
f(x),-0.4257792915650761
x,-2.689203311472859
f(x),-0.43711576665093643
x,-2.6766369408585
f(x),-0.4483832160900359
x,-2.6640705702441405
f(x),-0.45957986062149153
x,-2.6515041996297812
f(x),-0.47070393216533635
x,-2.638937829015422
f(x),-0.4817536741017191
x,-2.6263714584010627
f(x),-0.49272734154829545
x,-2.6138050877867034
f(x),-0.5036232016357648
x,-2.601238717172344
f(x),-0.5144395337815104
x,-2.588672346557985
f(x),-0.5251746299612998
x,-2.5761059759436256
f(x),-0.5358267949790008
x,-2.5635396053292663
f(x),-0.5463943467342732
x,-2.550973234714907
f(x),-0.5568756164881923
x,-2.5384068641005477
f(x),-0.5672689491267607
x,-2.5258404934861884
f(x),-0.577572703422272
x,-2.513274122871829
f(x),-0.5877852522924776
x,-2.50070775225747
f(x),-0.5979049830575234
x,-2.4881413816431106
f(x),-0.6079302976946098
x,-2.4755750110287513
f(x),-0.6178596130903389
x,-2.463008640414392
f(x),-0.627691361290705
x,-2.4504422698000328
f(x),-0.6374239897486943
x,-2.4378758991856735
f(x),-0.6470559615694489
x,-2.425309528571314
f(x),-0.6565857557529611
x,-2.412743157956955
f(x),-0.6660118674342563
x,-2.4001767873425957
f(x),-0.6753328081210291
x,-2.3876104167282364
f(x),-0.6845471059286934
x,-2.375044046113877
f(x),-0.6936533058128097
x,-2.362477675499518
f(x),-0.702649969798854
x,-2.3499113048851585
f(x),-0.7115356772092901
x,-2.3373449342707993
f(x),-0.7203090248879117
x,-2.32477856365644
f(x),-0.7289686274214163
x,-2.3122121930420807
f(x),-0.7375131173581787
x,-2.2996458224277214
f(x),-0.745941145424187
x,-2.287079451813362
f(x),-0.7542513807361086
x,-2.274513081199003
f(x),-0.7624425110114527
x,-2.2619467105846436
f(x),-0.770513242775794
x,-2.2493803399702843
f(x),-0.7784623015670282
x,-2.236813969355925
f(x),-0.7862884321366237
x,-2.2242475987415657
f(x),-0.7939903986478402
x,-2.2116812281272065
f(x),-0.8015669848708813
x,-2.199114857512847
f(x),-0.8090169943749521
x,-2.186548486898488
f(x),-0.8163392507171887
x,-2.1739821162841286
f(x),-0.8235325976284321
x,-2.1614157456697694
f(x),-0.8305958991958173
x,-2.14884937505541
f(x),-0.8375280400421463
x,-2.136283004441051
f(x),-0.8443279255020197
x,-2.1237166338266915
f(x),-0.8509944817946964
x,-2.1111502632123322
f(x),-0.8575266561936568
x,-2.098583892597973
f(x),-0.8639234171928398
x,-2.0860175219836137
f(x),-0.8701837546695301
x,-2.0734511513692544
f(x),-0.876306680043868
x,-2.060884780754895
f(x),-0.8822912264349576
x,-2.048318410140536
f(x),-0.8881364488135488
x,-2.0357520395261766
f(x),-0.893841424151268
x,-2.0231856689118173
f(x),-0.8994052515663752
x,-2.010619298297458
f(x),-0.9048270524660237
x,-1.9980529276830987
f(x),-0.9101059706849998
x,-1.9854865570687394
f(x),-0.9152411726209215
x,-1.9729201864543802
f(x),-0.9202318473658743
x,-1.9603538158400209
f(x),-0.9250772068344619
x,-1.9477874452256616
f(x),-0.9297764858882551
x,-1.9352210746113023
f(x),-0.9343289424566157
x,-1.922654703996943
f(x),-0.9387338576538776
x,-1.9100883333825838
f(x),-0.942990535892868
x,-1.8975219627682245
f(x),-0.9470983049947477
x,-1.8849555921538652
f(x),-0.9510565162951569
x,-1.872389221539506
f(x),-0.9548645447466462
x,-1.8598228509251467
f(x),-0.9585217890173791
x,-1.8472564803107874
f(x),-0.9620276715860889
x,-1.834690109696428
f(x),-0.9653816388332768
x,-1.8221237390820688
f(x),-0.968583161128634
x,-1.8095573684677095
f(x),-0.9716317329146766
x,-1.7969909978533503
f(x),-0.9745268727865797
x,-1.784424627238991
f(x),-0.9772681235681959
x,-1.7718582566246317
f(x),-0.9798550523842492
x,-1.7592918860102724
f(x),-0.9822872507286909
x,-1.7467255153959131
f(x),-0.9845643345292074
x,-1.7341591447815539
f(x),-0.98668594420787
x,-1.7215927741671946
f(x),-0.9886517447379158
x,-1.7090264035528353
f(x),-0.9904614256966529
x,-1.696460032938476
f(x),-0.9921147013144793
x,-1.6838936623241167
f(x),-0.9936113105200098
x,-1.6713272917097575
f(x),-0.9949510169813014
x,-1.6587609210953982
f(x),-0.9961336091431736
x,-1.646194550481039
f(x),-0.9971589002606149
x,-1.6336281798666796
f(x),-0.9980267284282723
x,-1.6210618092523204
f(x),-0.9987369566060181
x,-1.608495438637961
f(x),-0.9992894726405898
x,-1.5959290680236018
f(x),-0.9996841892833003
x,-1.5833626974092425
f(x),-0.9999210442038163
x,-1.5707963267948832
f(x),-1.0
x,-1.558229956180524
f(x),-0.999921044203816
x,-1.5456635855661647
f(x),-0.9996841892832996
x,-1.5330972149518054
f(x),-0.9992894726405888
x,-1.5205308443374461
f(x),-0.9987369566060168
x,-1.5079644737230868
f(x),-0.9980267284282707
x,-1.4953981031087276
f(x),-0.9971589002606128
x,-1.4828317324943683
f(x),-0.9961336091431712
x,-1.470265361880009
f(x),-0.9949510169812987
x,-1.4576989912656497
f(x),-0.9936113105200068
x,-1.4451326206512904
f(x),-0.992114701314476
x,-1.4325662500369312
f(x),-0.9904614256966492
x,-1.4199998794225719
f(x),-0.9886517447379118
x,-1.4074335088082126
f(x),-0.9866859442078657
x,-1.3948671381938533
f(x),-0.9845643345292028
x,-1.382300767579494
f(x),-0.9822872507286858
x,-1.3697343969651348
f(x),-0.9798550523842439
x,-1.3571680263507755
f(x),-0.9772681235681903
x,-1.3446016557364162
f(x),-0.9745268727865737
x,-1.332035285122057
f(x),-0.9716317329146703
x,-1.3194689145076977
f(x),-0.9685831611286273
x,-1.3069025438933384
f(x),-0.9653816388332698
x,-1.294336173278979
f(x),-0.9620276715860816
x,-1.2817698026646198
f(x),-0.9585217890173714
x,-1.2692034320502605
f(x),-0.9548645447466382
x,-1.2566370614359013
f(x),-0.9510565162951486
x,-1.244070690821542
f(x),-0.9470983049947391
x,-1.2315043202071827
f(x),-0.9429905358928591
x,-1.2189379495928234
f(x),-0.9387338576538684
x,-1.2063715789784641
f(x),-0.9343289424566061
x,-1.1938052083641049
f(x),-0.9297764858882454
x,-1.1812388377497456
f(x),-0.9250772068344517
x,-1.1686724671353863
f(x),-0.9202318473658637
x,-1.156106096521027
f(x),-0.9152411726209108
x,-1.1435397259066677
f(x),-0.9101059706849887
x,-1.1309733552923085
f(x),-0.9048270524660122
x,-1.1184069846779492
f(x),-0.8994052515663635
x,-1.10584061406359
f(x),-0.893841424151256
x,-1.0932742434492306
f(x),-0.8881364488135365
x,-1.0807078728348714
f(x),-0.8822912264349451
x,-1.068141502220512
f(x),-0.8763066800438551
x,-1.0555751316061528
f(x),-0.8701837546695169
x,-1.0430087609917935
f(x),-0.8639234171928264
x,-1.03044239037#BlueJ class context
comment0.params=args
comment0.target=void\ main(java.lang.String[])
numComments=1
                                                                                                                                                                                                                                                                                                                                                                                                                     		

	


		

				
	1	

					
										
													

	 ��t			


		

				
	1	

					
										
													

	 ��n		

	


		

				
	1	

					
										
													

	 p& ��P		

	
	

				
	1	

					
										
													

	 ���b		

	

				
	1	

					
																			

	 ���].           S��B�B  ��Bb    ..          S��B�B  ��B      Ap a c k a  Ug e . b l u   e j PACKAG~1BLU  \��B�B  &��B�%Q  README  TXT  i��B�B  \W\B�%�  �. c l a s  �s   ��������  �����M a t h S  �a m p l e r   $ x �ATHSA~1CLA  r��B�B  S|B&�  �S i n . j  a v a   ����  �����IN~1   JAV  ~��B�B  t��B!&  �S i n . c  �l a s s   ��  �����IN~1   CLA  ���B�B  �x�BX&�  �S i n . c  Yt x t   ����  �����IN~1   CTX  ���B�B  �x�BY&-  �D r i v e  �r . c l a s   s   �RIVER~1CLA  ���B�B  ֒�Bk&�  �D r i v e  r . c t x t     ���RIVER~1CTX  ���B�B  ֒�B'k   �D a t a .  �j a v a   ��  �����ATA~1  JAV  	��B�B  o��B'�  �D a t a .  �c l a s s     �����ATA~1  CLA  ��B�B  j��B&+  �D a t a .  �c t x t   ��  �����ATA~1  CTX  )��B�B  j��B	'E  �a v a   �� �������������  �����M a t h S  �a m p l e r   . j �ATHSA~1JAV  8��B�B  S��B'(  �a   ������ ������������  �����C S V r e  a d e r . j   a v �SVREA~1JAV  J��B�B  ��B!&~  �s s   ���� �������������  �����C S V r e  �a d e r . c   l a �SVREA~1CLA  _��B�B  ��B'�  �t   ������ �������������  �����C S V r e  �a d e r . c   t x �SVREA~1CTX  r��B�B  ��B'�  �a   ������ �������������  �����C S V W r  �i t e r . j   a v �SVWRI~1JAV  ���B�B  |��B!&u  �l a s s    �������������  �����M a t h S  �a m p l e r   . c �ATHSA~2CLA  ���B�B  �z�B'   �t x t   �� �������������  �����M a t h S  �a m p l e r   . c �ATHSA~1CTX  ���B�B  �z�B',  LINES   TXT ���B�B  	��B'   Bj a v a    ������������  ����S w i n g  P l o t t e   r . SWINGP~1JAV  ���B�B  ͘�B '  �s s   ���� �������������  �����C S V W r  �i t e r . c   l a �SVWRI~1CLA  V��B�B  ���B#'�  �t   ������ �������������  �����C S V W r  �i t e r . c   t x �SVWRI~1CTX  d��B�B  ���B$'>  BP o i n t  K. c l a s s     ��S w i n g  KP l o t t e   r $ SWINGP~1CLA  p��B�B  ͘�B&�  AL i n e P  �r i n t e r     ��LINEPR~1     {��B�B  R�B      Bx t   ���� r������������  ����L i n e P  rr i n t e r   . t LINEPR~1TXT  ��B�B  sS�B      Bc l a s s  �  ����������  ����S w i n g  �P l o t t e   r . SWINGP~2CLA  ���B�B  ͘�B!&V  Bc t x t    f������������  ����S w i n g  fP l o t t e   r . SWINGP~1CTX  ���B�B  ͘�B
'�  �u t h . j  �a v a   ����  �����T h e M o  �m e n t O f   t r �HEMOM~1JAV  ���B�B  fe�B*'�  KA      TXT ���B�B  ���B      �F u n c t  3i o n . j a   v a �UNCTI~1JAV  ���B�B  ��B!&�   �u t h . c  �l a s s   ��  �����T h e M o  �m e n t O f   t r �HEMOM~1CLA  ���B�B  fe�B,'�  �s   ������ b������������  �����F u n c t  bi o n . c l   a s �UNCTI~1CLA  ���B�B  �V|B0'�   �F u n c t  }i o n . c t   x t �UNCTI~1CTX   ��B�B  �V|B�'e   �u t h . c  �t x t   ����  �����T h e M o  �m e n t O f   t r �HEMOM~1CTX  
 ��B�B  fe�B�'k   Bv a   ���� �������������  ����M a i n D  �r i v e r .   j a MAINDR~1JAV   ��B�B  �B'  Bs a f s .  �t x t   ����  ����L i n e P  �r i n t e r   f d LINEPR~2TXT  % ��B�B  �U�B�'&  Ba s s   �� r������������  ����M a i n D  rr i v e r .   c l MAINDR~1CLA  ) ��B�B   ��Bk&�  AC S V F i  �l e . t x t     ��CSVFILE TXT  3 ��B�B  ���B''&  Bx t   ���� �������������  ����M a i n D  �r i v e r .   c t MAINDR~1CTX  8 ��B�B   ��B'k   Ba v a   �� #������������  ����M a i n D  #r i v e r 2   . j MAINDR~2JAV  C ��B�B  래B$'�  Bl a s s    R������������  ����M a i n D  Rr i v e r 2   . c MAINDR~2CLA  L ��B�B  래B#'8  Bt x t   �� m������������  ����M a i n D  mr i v e r 2   . c MAINDR~2CTX  X ��B�B  래B)'k   �i n . c l  �a s s   ����  �����M a t h S  �a m p l e r   $ s �ATHSA~3CLA  f ��B�B  {X|B�'Y  �D r i v e  Lr . j a v a     ���RIVER~1JAV  t ��B�B  �B�'  EDU         ��B�B  cW\B�'    DOC        �!��B�B  @}�B�'    �m p   ���� �������������  �����7 5 7 0 9  �4 2 2 5 0 4   . t �b l u e j  �2 0 7 2 8 5   3 7 �LUEJ2~1TMP  x:��B�B  ;��B      �a v a #    �������������  �����M a t h S  �a m p l e r   . j �ATHSA~2JAV  UO��B�B  P��B�'  �a v a #    �������������  �����M a t h S  �a m p l e r   . j �ATHSA~2JAV  UO��B�B  S��B�''  �D a t a .  �j a v a #     �����ATA~2  JAV  sZ��B�B  [��B&�  �D a t a .  �j a v a #     �����ATA~2  JAV  sZ��B�B  c��B&�  �D a t a .  �j a v a #     �����ATA~2  JAV  sZ��B�B  g��B
'�  �D a t a .  �j a v a #     �����ATA~2  JAV  sZ��B�B  o��B
'�  �S i n . j  a v a #   ��  �����IN~2   JAV  Xs��B�B  t��B&�  �a #   ���� �������������  �����C S V W r  �i t e r . j   a v �SVWRI~2JAV  T{��B�B  |��B&L  �a #   ���� +������������  �����C S V r e  +a d e r . j   a v �SVREA~2JAV  ���B�B  ��B&U  �#   ������ S������������  �����F u n c t  Si o n . j a   v a �UNCTI~2JAV  {
��B�B  ��B&�   �v a #   �� ������������  �����M a i n D  r i v e r .   j a �AINDR~3JAV  �J��B�B  K��Bk&�  �v a #   �� ������������  �����M a i n D  r i v e r .   j a �AINDR~3JAV  fS��B�B  T��Bk&�  �v a #   �� ������������  �����M a i n D  r i v e r .   j a �AINDR~3JAV  fS��B�B  W��Bk&�  �_ _ S H E  aL L 0 . j a   v a �_SHEL~1JAV  �Z��B�B  [��B#'�   �s   ������ �������������  �����_ _ S H E  �L L 0 . c l   a s �_SHEL~1CLA  �Z��B�B  [��B$'�  �v a #   �� ������������  �����M a i n D  r i v e r .   j a �AINDR~3JAV  �n��B�B  o��B#'�  �_ _ S H E  aL L 1 . j a   v a �_SHEL~1JAV  �p��B�B  q��B#'�   �s   ������ �������������  �����_ _ S H E  �L L 1 . c l   a s �_SHEL~1CLA  �p��B�B  q��B$'�  �a v a #    ������������  �����M a i n D  r i v e r 2   . j �AINDR~3JAV  ����B�B  ���B#'#  �a v a #    ������������  �����M a i n D  r i v e r 2   . j �AINDR~3JAV  ����B�B  ���B#'�  �v a #   �� ������������  �����M a i n D  r i v e r .   j a �AINDR~3JAV  =���B�B  ���B*'�  �v a #   �� ������������  �����M a i n D  r i v e r .   j a �AINDR~3JAV  ���B�B  ���B*'U  �j a v a #  �  ����������  �����S w i n g  �P l o t t e   r . �WINGP~2JAV  ̘�B�B  ͘�B*'+  �_ _ S H E  aL L 2 . j a   v a �_SHEL~1JAV  &Θ�B�B  Ϙ�B*'�   �s   ������ �������������  �����_ _ S H E  �L L 2 . c l   a s �_SHEL~1CLA  FΘ�B�B  Ϙ�B+'�  �v a #   �� ������������  �����M a i n D  r i v e r .   j a �AINDR~3JAV  ��B�B  �B*'�  �m p   ���� �������������  �����4 4 5 1 7  �1 1 3 2 9 3   . t �b l u e j  �9 0 4 7 4 3   0 8 �LUEJ9~1TMP  ����B�B  ���B      �_ _ S H E  aL L 0 . j a   v a �_SHEL~1JAV  ����B�B  ���B�'�   �s   ������ �������������  �����_ _ S H E  �L L 0 . c l   a s �_SHEL~1CLA  s���B�B  ���B�'�  �a v a #    ������������  �����M a i n D  r i v e r 2   . j �AINDR~3JAV  �Ğ�B�B  Ş�B�'�  �a v a #    ������������  �����M a i n D  r i v e r 2   . j �AINDR~3JAV  �מ�B�B  ٞ�B�'�  �a v a #    ������������  �����M a i n D  r i v e r 2   . j �AINDR~3JAV  �鞘B�B  ꞘB�'�  �_ _ S H E  aL L 1 . j a   v a �_SHEL~1JAV  B잘B�B  힘B�'�   �s   ������ �������������  �����_ _ S H E  �L L 1 . c l   a s �_SHEL~1CLA  a잘B�B  힘B�'�  �_ _ S H E  aL L 2 . j a   v a �_SHEL~1JAV  N���B�B  ���B�'�   �s   ������ �������������  �����_ _ S H E  �L L 2 . c l   a s �_SHEL~1CLA  k���B�B  ���B�'�                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  