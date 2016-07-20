
/**
 * Write a description of class CSVWriter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
import edu.utc.MichaelHolloway.LookupTable;
import edu.utc.MichaelHolloway.DataProvider;
import edu.utc.MichaelHolloway.DataProcessor;
import edu.utc.MichaelHolloway.DataDumper;
import java.util.Scanner;
import java.util.ArrayList;
public class CSVWriter implements DataProcessor 
{   
   
 
   
   LookupTable lt=new LookupTable();
   PrintWriter printer=null;
   PrintWriter OtherWriter=null;
   /**
    * Constructs the CSV writer to print to a csv file
    */
     public CSVWriter() throws FileNotFoundException
     {
       printer=new PrintWriter("CSVFile.txt");
       OtherWriter=new PrintWriter("ka.txt");
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
       OtherWriter.close();
     }
   }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           Project documentation
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
                                                                                                                                                                                                                                                                               3G1EÁ1!I I I I I I H I  3KGG7IU$œ$
 
 
 
 
 
 
 
  3K										Y)I 3KIU7]U%         	3KGMKI7IU”^	 C  3KEKQˆ€¬  3KGG7IUS…%)	%	( ( ( ( ( ( (  3KGGKIE_ü‚ ‚J  3KISU/IUü˜à
  P  	3KII73U75ı  
3KEE73U?KIı™| €Ô  
3KGME7U7E_ıåV &  3KGMWU7Qıà€ù x #  	3KQQ73UE_ıO  3KI3/UĞZ  
3KI5?U?KIS•€¼  	3KI5?U?KI”€·M&  
3KIS?57Q75•€‹  3KGMKWI5”i&  3K‘ 
3KGMWU7Q‘ 	3KIU/?I75‘d  3KIU/?I„  3KGGKI  3KGG/I5S  3K57Œu€•+ ?  3KQQ7E/U?KIe€ì  	3KGMWU7QS	TS€   3KWE5E  3KGME7]=   3K5?I;  3Q 3Q7/U7l  3U% 3U]U% 3W‰ 3WQQ7IU‰€  4Á1—H —L —F —( •: •5  4#¡				1 4‰ 4á 4.…%)	%	 4.T6…%)	%	9 9 9 9 9 9 9  4/U/üy‚Ï‚”   i  4/ı!1 4/á 4/U/á 4/U/Á1! 4/U/RKWQ37R7QY7QÀ0 •V) •Z) •T) •6) “H) “C) šÕ€è €è  4/U/R7UÀ0 ”*‚Ã‡Á ”.‚Ç‡Á ”(‚Ã‡Á ”
‚°‡Á ’ğ‡Á ’ğ‡Á ™ê†Íˆ $ˆ  4/U/8E/;SÁ1! 4/U/J1A73UT=?3CD?I7SÀ0 “³€¿€¾Üdavš “³€¿€¾Üdavš “±€¿€¾Üdavš “ €¼€»Üdavš ‘²€»Üdavš ‘­€»Üdavš %™€É€Í€¿€¼€É€Í€Òác‚^‚` c‚^‚`  4/U/J1A73U.WUKG/U?3473?G/EÀ0 “¬€¿€¾Üdavš “¬€¿€¾Üdavš “ª€¿€¾Üdavš “™€¼€»Üdavš ‘«€»Üdavš ‘¦€»Üdavš %™x€É€Í€¿€¼€É€Í€Òác‚^‚` c‚^‚`  4/U/J1A73ULQ73?S?KIÀ0 “¥€¿€¾Üdavš “¥€¿€¾Üdavš “£€¿€¾Üdavš “’€¼€»Üdavš ‘¤€»Üdavš ‘Ÿ€»Üdavš %™q€É€Í€¿€¼€É€Í€Òác‚^‚` c‚^‚`  4/U/J1A73ULQ73?S?KI473?G/EÀ0 “€¿€¾Üdavš “€¿€¾Üdavš “œ€¿€¾Üdavš “‹€¼€»Üdavš ‘€»Üdavš ‘˜€»Üdavš %™j€É€Í€¿€¼€É€Í€Òác‚^‚` úc‚^‚`  4/U/RKWQ37Á1! 4/U/J1A73U4/U/RKWQ37À0 “—€¿€¾Üdavš “—€¿€¾Üdavš “•€¿€¾Üdavš “„€¼€»Üdavš ‘–€»Üdavš ‘‘€»Üdavš %™c€É€Í€¿€¼€É€Í€Òác‚^‚` óc‚^‚`  4/U/J1A73U2KEKQÀ0 “	€º	€¹	×	_	\	q	•	 “	€º	€¹	×	_	\	q	•	 “	€º	€¹	×	_	\	q	•	 “}	€·	€¶	×	_	\	q	•	 ‘	€¶	×	_	\	q	•	 ‘Š	€¶	×	_	\	q	•	 %™\	€Ä	€È	€º	€·	€Ä	€È	€Í	Ü	^	‚Y	‚[	 ì	^	‚Y	‚[	  4/U/J1A73UR=KQUH/G7À0 “„€¿€¾Üdavš “„€¿€¾Üdavš “‚€¿€¾Üdavš “q€¼€»Üdavš ‘ƒ€»Üdavš ‘~€»Üdavš %™P€É€Í€¿€¼€É€Í€Òác‚^‚` àc‚^‚`  4/U/J1A73UH/G7À0 “}
€¹	€¹Ødavš “}
€¹	€¹Ødavš “{
€¹	€¹Ødavš “j€º€¹Ødavš ‘|€¹Ødavš ‘w€¹Ødavš %™I€Ç
€Ç
€¹€º€Ç
€Ç€Ç×c‚^‚` Ùc‚^‚`  4/U/R7U:Q/M=F/U3=À0 ‘Ô‡Â ‘Ô‡Â ‘Ò‡Â ‘Ç‡Â ™‡Â ”‡Â “Šˆ ‡ˆ  4/U/R7UX?57K.I/E_S?SÀ0 ‘Í‡Â ‘Í‡Â ‘Ë‡Â ‘À‡Â ’‡Â ‡Â “ƒˆ ‡  4/U/R7ULQ75?3U?KIÀ0 ‘Æ‡Â ‘Æ‡Â ‘Ä‡Â ‘¹‡Â ‹‡Â †‡Â “|ˆ ‡z  4/U/R7URUKQ75PWIÀ0 ‘¿‡Â ‘¿‡Â ‘½‡Â <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  Êşº¾   3 p
  I J
  I KÀ	!ûTD-@	!ûTD-
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
  I \ ] <init> ()V Code LineNumberTable LocalVariableTable this LDriver; main ([Ljava/lang/String;)V args [Ljava/lang/String; sin LSin; Sampler LMathSampler; dumper $Ledu/utc/MichaelHolloway/DataDumper; data LData; inFile Ljava/io/File; chooser Ljavax/swing/JFileChooser; data2 reader LCSVreader; n %Ledu/utc/MichaelHolloway/LookupTable; dumper2 writer LCSVWriter; dumper3 StackMapTable ' J K M N ^ P 
Exceptions _ 
SourceFile Driver.java   Sin MathSampler  ` "edu/utc/MichaelHolloway/DataDumper Data a b javax/swing/JFileChooser c d e f g h i no file selected j k l 	CSVreader  m n o 	CSVWriter Driver java/lang/Object java/io/File java/io/IOException (DDILFunction;)V run P(Ledu/utc/MichaelHolloway/DataProvider;Ledu/utc/MichaelHolloway/DataProcessor;)V showOpenDialog (Ljava/awt/Component;)I getSelectedFile ()Ljava/io/File; java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V (Ljava/io/File;)V nextData '()Ledu/utc/MichaelHolloway/LookupTable; !               /     *· ±             !        " #   	 $ %    ­     š» Y· L» Y  û+· 	M» 
Y· N» Y· :W,-¸ :» Y· :¶ š 
¶ :Ç ² ¶ ±» Y· :» Y· :¶ :	» 
Y· :
» Y· :» 
Y· :¸ ±        R         !  *  2  5  >  G  N  S   [ ! \ # e $ p % w & € ' ‰ ( ’ ) ™ - !   „    š & '    ’ ( )    * +  ! y , -  * p . /  5 e 0 1  > \ 2 3  e 5 4 /  p * 5 6  w # 7 8 	 €  9 - 
 ‰  : ;  ’  < -  =    ÿ N  > ? @ A B C D   E     F  G    H                                                                                                                                                                                                                                                                     Qı  9Q77E_ü€Í€Ÿ  9/EEı€Ì  	9/S=?KI75ı€’  9/EE?I;ı/  
9?I/E;QKWMĞd  9K]Ñ3  97U3=7S¤[  97Á1 97I37Á1 9Á1 9+Á1 9+9Á1 9$• 9$Q• 9E• 	9EK[3=/QU•'  9?QSU‘   9W) 9WI3U?KI/E?U_  	9WI3U?KIS  9KQGWE/€  9?u 
9?I?S=75u 9WEEe€Ş  9/U=7QW(  9?7E5A  9Q?7I5S	  9/G?E_  9?I/E€è  9?I/EE_€²  9K3WS€“  9/S3?I/U?KI9  	9/S3?I/U7  :‘	¥% :ùé :/ı©1 	:/U7RU/U7ı©0*      ˜€ì‚£‡»€à ˜€ì‚£‡¿€à ˜€ì‚£‡»€à —è€ì‚£‡¨€à •ú€ì‚£†è€à •õ€ì‚£†è€à  :/‘ 	:/U7[/_‘ :/E?E7Kd€ˆ0.  :7I7Q/U7T_M7Á1! :7I7Q/U7X/EW7SÁ1! :7Á1! :?ıé :?/I3KE?ıƒW  :?Y7I•€«  :KK;E7F/MSJM7I.IIKU/U?KISÁ1! :KÁ1! :KK;E7F/MSX/EW72KEWGIÁ1! :KK;E7F/MSF/QC7QJMU?KISÁ1! :P‰ :P66H‰o  :Q‘	¹1 :Q/M=?3S‘ X(  
:Q/M=?3S&4ˆ^)  :Q/M=ü”
ƒ 			g 5			 €ã€  :Q/Y?U/U?KI/Eı  :Qù :Q/M=Sù :Q/M=F/U3=Á1! :Q/M=D?IC75>4SÀ


0
 ‰Š‚2‚ ‰‚-‚ ‰‚-‚ ˆ÷Š‚+‚ ‡ÉŠ‚‚ ‡ÄŠ‚‚	 Šˆ€º‚1€º‚ 
†‰‚d‚  :Q/M=L/M7QD?I72KEKQÁ1! :Q/M=L/M7QD?I7RM/3?I;Á1! :Q/M=L/M7QÁ1! :Q/M=2/QU7S?/IÁ1! :Q/M=LEKU4KW1E7^.]?SÀ0 ‡ƒF ‡ƒA ‡ƒA †úƒ; …Ì‚ …Æ‚
 ‡Æ„ …Á‚	  :Q/M=4Q/[P/?I1K[À0 ‡ ƒF †ûƒA †ûƒA †óƒ; …Å‚ …¿‚
 ‡¿„ …º‚	  :Q/M=LEKU^D/17EÀ0 †ùƒH †ôƒC †ôƒC †ìƒ= …¾‚ …¸‚ ‡¸„ …³‚  :Q/M=LEKU\D/17EÀ0 †ôƒH †ïƒC †ïƒC †çƒ= …¹‚ …³‚ ‡³„ …®‚  :Q/M=LEKU479/WEU^F/]À0 †ïƒF †êƒA †êƒA †âƒ; …´‚ …®‚
 ‡®„ …©‚	  :Q/M=LEKU479/WEU^F?IÀ0 †èƒF †ãƒA †ãƒA †Ûƒ; …­‚ …§‚
 ‡§„ …¢‚  :Q/M=LEKU479/WEU\F/]À0 †áƒF †ÜƒA †ÜƒA †Ôƒ; …¦‚ … ‚
 ‡„ …™‚  :Q/M=LEKU479/WEU\F?IÀ0 †ÚƒF †ÕƒA †ÕƒA †Íƒ; …Ÿ‚ …™‚
 ‡—„ …’‚  :Q/M=LEKU^F/]À0 †ÓƒF †Îƒ? †Îƒ? †Æƒ; …˜‚ …’‚
 ‡„ …‹‚  :Q/M=LEKU^F?IÀ0 †ÌƒF †Åƒ? †Åƒ? †¿ƒ= …‘‚ …‹‚ ‡‰„ …„‚  :Q/M=LEKU\T?3CSPKU/U75.I;E7À0 †¼ƒF †·ƒA †·ƒA †±ƒ= …‚ …}‚ ‡y„ …t‚  :Q/M=LEKU\F/]À0 †µƒD †°ƒ? †°ƒ? †ªƒ; …z‚ …v‚
 ‡r„ …m‚  :Q/M=LEKU\F?IÀ0 †¬ƒD †§ƒ? †§ƒ? †¡ƒ= …q‚ …m‚ ‡i„ …f‚  :Q/M=LEKU4KW1E7^.WUKS3/E7<?IUÀ0 †£ƒF †ƒA †ƒA †šƒ= …h‚ …f‚ ‡`„ …_‚  :Q/M=LEKU^.WUKS3/E7<?IUÀ0 †œƒF †—ƒA †—ƒA †“ƒ= …a‚ …_‚ ‡Y„ …X‚  :Q/M=LEKU\.WUKS3/E7<?IUÀ0 †•ƒF †ƒA †ƒA †Œƒ= …Z‚ …X‚ ‡R„ …Q‚  $:Q/M=LEKU4KW1E7^.WUKS3/E7JI8?QSU4/U/À0 †ƒF †‰ƒA †‰ƒA †…ƒ= …S‚ …Q‚ ‡K„ …J‚  :Q/M=LEKU^.WUKS3/E7JI8?QSU4/U/À0 †‡ƒF †‚ƒA †‚ƒA †~ƒ= …L‚ …J‚ ‡D„ …C‚  :Q/M=LEKU\.WUKS3/E7JI8?QSU4/U/À0 †€ƒF †{ƒA †{ƒA †wƒ= …E‚ …C‚ ‡=„ …<‚  :Q/M=LEKU4KW1E7^.WUKS3/E7À0 †yƒF †tƒA †tƒA †pƒ= …>‚ …<‚ ‡6„ …5‚  :Q/M=LEKU^.WUKS3/E7À0 †rƒF †mƒA †mƒA †iƒ= …7‚ …5‚ ‡/„ ….‚  :Q/M=LEKU\.WUKS3/E7À0 †kƒF †fƒA †fƒA †bƒ= …0‚ ….‚ ‡(„ …'‚  :Q/M=F?IKQT?3C2KEKQÀ0 †d	ƒA	 †_	ƒ<	 †_	ƒ<	 †[	ƒ8	 …)	‚		 …'	‚	 ‡!	ƒş	 … 	‚ 	  :Q/M=F?IKQT?3CRU_E7À0 †XƒF †SƒA †SƒA †Oƒ= …‚ …‚ ‡„ …‚  :Q/M=F/AKQT?3C2KEKQÀ0 †Q	ƒA	 †L	ƒ<	 †L	ƒ<	 †H	ƒ8	 …	‚		 …	‚	 ‡	ƒş	 …	‚ 	  :Q/M=F/AKQT?3CRU_E7À0 †EƒF †@ƒA †@ƒA †<ƒ= …
‚ …‚ ‡„ …‚  :Q/M=R=K[LK?IULQKU73UKQSÀ0 †>ƒF †9ƒA †9ƒA †5ƒ= …‚ …‚ †û„ „ú‚  :Q/M=RU/3C2KEWGISÁ1! :Q/M=Á1! :Q/M=0/Q:Q/M=À0 †0ƒF †+ƒA †+ƒA †'ƒ= „õ‚ „ó‚ †í„ „ì‚  :Q/M=2KII73UD?I7SÀ0 †)ƒF †$ƒA †$ƒA † ƒ= „î‚ „ì‚ †æ„ „å‚  :Q/M=R=K[0/S76QQKQ0/QSÀ0 †"ƒF †ƒA †ƒA †ƒ= „ç‚ „å‚ †ß„ „Ş‚  :Q/M=R=K[TQ/376QQKQ0/QSÀ0 †ƒF †ƒA †ƒA †ƒ= „à‚ „Ş‚ †Ø„ „×‚  :Q/M=LEKUTQ/37>4L/?QSÀ0 …ÿƒB …úƒ= …úƒ= …öƒ9 „Ä‚
 „Â‚ †¼ƒÿ „»‚  :Q/M=LEKU0/S72KEWGI>4À0 …ôƒF …ïƒA …ïƒA …ëƒ= „¹‚ „·‚
 †±„ „²‚  :Q/M=R=K[2WQSKQ47EU/À0 …íƒF …èƒA …èƒA …äƒ= „²‚ „°‚
 †ª„ „«‚  :Q/M=R=K[2WQSKQRU/UWSÀ0 …æƒF …áƒA …áƒA …İƒ= „«‚ „©‚
 †£„ „¤‚  :Q/M=R=K[D7;7I5À0 …ßƒF …ÚƒA …ÚƒA …Öƒ= „¤‚ „¢‚
 †œ„ „‚  :Q/M=R=K[T/I;7IUÀ0 …ØƒF …ÓƒA …ÓƒA …Ïƒ= „‚ „›‚
 †•„ „–‚  :Q/M=>IU7QMKE/U7À0 …ÑƒF …ÌƒA …ÌƒA …Èƒ= „–‚ „”‚
 †„ „‚  :Q/M=R=K[LK?IUSÀ0 …ÊƒF …ÅƒA …ÅƒA …Áƒ= „‚ „‚
 †‡„ „ˆ‚  :Q/M=T?UE72KEKQÀ0 …Ã	ƒA	 …¾	ƒ<	 …¾	ƒ<	 …º	ƒ8	 „ˆ	‚	 „†	‚	 †€	ƒş	 „	‚ 	  
:Q/M=T?UE7À0 …·ƒH …²ƒC …²ƒC …®ƒ? „|‚ „z‚ †t„ „u‚  :Q/M=F/U3=HWGR73U?KISÀ0 €± €± €± €± €± €± €° €±  :Q/M=F/U3=VS7NW/5Q/U?3À0 €ª €ª €ª €ª €ª €ª €© €ª  :Q/M=F/U3=VS7D?I7/QÀ0 €£ €£ €£ €£ €£ €£ €¢ €£  :Q/M=F/U3=VS72KISU/IUÀ0 €œ €œ €œ €œ €œ €œ €› €œ  :Q/M=F/U3=JITKKE1/#BlueJ class context
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
                                                                                            Y?U_ı¡T   ;7åA 	;7U<7?;=UåAM j  ;7UZ?5U=åAG U  ;K‘u ;K‘~  ;Q7/UE_$  ;KU€³  ;KK5€Ÿ  ;. ;.%5== <•			-1A <K•E1•I <KEEK[/_•E0•I   a '	     <J…%)	%	 <JZ…%)	%	; ; ; ; ; ; ;  <7…!%	%	-1! <7Q7…%)	%		 	 	 	 	 	 	  <%)		5-	 <K%)		5-	 
<KEEK[/_%)		5-	 <KE5ıC  <7?;=UåA <¤z  <7/57QR=KQUH/G7Á1! <7/57QH/G7Á1! <7/57QÁ1! <7/57QVI?USÁ1! <?SUK;Q/GÁ1! <?Á1! <7EM7Q4/U/2WQY78?UÁ1! <7EM7QVS76IU?Q7P/I;7Á1! <7EM7QF?I?G?a75Á1! <7EM7QLQ73?S?KI473?G/EÁ1! <7EM7QLQ73?S?KIÁ1! <7EM7Q0/S72KEWGI>4Á1! <7EM7QTQ/372KEWGI>4Á1! <7EM7QP/I;7F/]Á1! <7EM7QP/I;7F?IÁ1! <?IUÁ1! <7EM7QLK?IUST/I;7IUa =7?;=U	 %$ €Ä%7 ‚ Z7 Z7 Z7 Z7 Z7 ] Z7  =#¡				-)!A =7 ¡				--! =7Q7•%	 	 	 	 	 	 	 	  =7…%)	%	               =?ıá =?USı‚  =/I5ü2  =/ıíq =/Sıñq€Ü w !  =KQ?aKIU/EE_ü€¹  =Kıá ==À0 jg|• jg|• jg|• tjg|• Fjg|• Ajg|• 	’8i‚d‚] 	Bi‚d‚]  ==Á1! =7Q7%&%+'$$&+Á1[ [ [ [ [ [  =/Y7‘y€ !  =7EM9WE  =7Q7'$',((*)'aZ [  =?S  =/5€áP  =/Q5[/Q7€–  =KM?I;j  =K[[   >IU7Q9/37¡-%	- >¡					-%A >I¡%	%	)E)!A >H…%)	%	 >HRTPV2T>JHR…%)	%	D D D D D D D  >9üíØ €Œ  >9ıí >Uı >Uıe  >IUQK5W3U?KIıá   >ˆ¥H€‡	 €é [W

 N9  >IMWU4?/EK;‰ >4Á1! >I57]Á1! >IU7Q9/37JMÁ1! 	>4X/EW7Á1! >4Á1! >4H/G7Á1! >IU7QY/ET?G7VI?UÁ1! 
>IU7QY/EÁ1! >4À,,,0,(( 6;”ù11?€Ï€¾€½liedsj X2‚4‚X ;”ı11?€Ó€¾€½liedsj X7‚/‚X ;”÷11?€Ï€¾€½liedsj X5‚/‚X ;”Ù11?€¾€¼€½liedsj X2‚
-‚X 5’ë11?€¾€½liedsj X2‚‚X 5’æ11?€¾€½liedsj X3‚
‚	X Kšx22€¿€Í€Í€»€¼€Í€Ò€Ñlhd‚a‚_i€ôX2€º‚2€º‚X %²22hd‚a‚_i€ôX‚‚X  >IY/E?54/U/8E/;SÁ1! >I4/U/0QK[S7QÁ1! >I3Q7G7IUÁ1! >IMWU2KEWGIÁ1! >IU7QY/E.WUKÁ1! >4SÁ1! >I9KÁ1! >I3Q7G7IUSÁ1! 	>4L/?QSÁ1! >IU7QMKE/U7Á1! 
>4RUQ?I;Á1! >8• >8•&  >Iy€Í ,  >IUK  > > ?•	%		!%A ?G•%A ?GMKQU•%A :     ?U‰YI1! ?U‰Xh 	rqn ` €˜  ?I…	)		M%I ?I3EW57…%)	%	+ + + + + + +  ?S…	%		Y)M ?S…$		X(M 
Õ
€•€Ã   €¨   F d   €¸.a%  €  ³@€›2B
 tm L  ?I3ıƒb  ?I9KQG/U?KIı‚Ô   ?Iüğ%H‚;	€ÛI. ¼G  €•
 
a*	$v F  ?IUKıñq‡ O Z  	?IU7Q9/37ı€ú  ?IMWUıuy€õ Q €½ ‚  ?‰€‹  ?USÁ1!< < < < < < < <  ?9”-€ÍE  )  ?IS?57•€† €£7   ?9•- ?IYKEY7•  	?I3Q7G7IU‘€à  
?I?U?/E?a7‘  	?I5?3/U75¶  ?IU7QY/EdA  	?IU7QY/ESd€ÁG  	?I3Q7/S75ew  	?I3Q7/S7Seq  ?I3E?I7dd'  ?IU7Q7SURS 1  ?IU7Q7SU?I;I	€Ñ  
?I9EW7I375€ü  
?IU7Q7SU75€Ù,  
?IU7QIS=?M€Ô
  ?IU7Q[KQC?I;€Ë  ?II7QE  @¡					A1! @¡		 @8Q/G7”L  @8• 
@2KGMKI7IUˆL  @2‰ @JMU?KIL/I7ˆw  @J‰ @å @å @WSU?9?3/U?KIÁ1! @WSU?9?3/U?KIÀ


0
 ‰Š‚3‚ ‰‚.‚ ‰‚.‚ ‰Š‚,‚ ‡áŠ‚‚ ‡ÜŠ‚‚
 Š—ˆ€º‚2€º‚ 
†¡‚d‚  @WÁ1! A							my A/						 A/Y/		  4            A	•%õ A/•% A/Y/•% A/Y/]• ;   AWÑµ AWGMSÑF  AK•y AK?I75•€½  AK1L0  AWSUG  A[ 	A[;CYSO CIK[„$($% % % % % % %  C	…	)	%	‰ CI…	)	%	 CIK[IıW  C?e 
C?I7G/U?3Se6  Dı½1A DK	ı½1! DK;;7Qı D D  D/	ı½1! D/1ı€  Dı™I D/U7SUF/]Á1! D/1LQKRKWQ37Á1! D/1LQKÁ1! DK3/U?KIÁ1!• • • ”ó “ “  š’ Ì  D?I7/QÁ1! D?I7SÁ1! D?I7/QÀ1’¿€Â ’¿€Â ’½€Â ‘ğ Â ½  D?	Á1 D/U7SUÁ1! DN2/E36OW/U?KI47M7I57IURUKQ7SÀ


0


 ‘^dcz“ ‘^dcz“ ‘\dcz“ ‘Qdcz“ #dcz“ dcz“ “d‚b‚[ d‚b‚[  D/SU4/U/2KEE73U75FK57Á1! D?Y7P7/5KWUÁ1! DNÁ1! D/U7SUÁ1!‰Ã ‰Ã ‰Á ‰¶ ˆˆ ˆƒ ‹3 ‡=  D?IC75>4SÁ1! DK3C75À


0
 ˆöŠ‚2‚ ˆö‚-‚ ˆô‚-‚ ˆéŠ‚+‚ ‡»Š‚‚ ‡¶Š‚‚
 Šqˆ€º‚1€º‚ 
†{‚e‚  D?I72KEKQÁ1! D?I7RM/3?I;Á1! D/17EÁ1! DK;P?;=U^.]?SÀ0 †ƒF †ƒA †ƒA †ƒ= „Ù‚ „×‚ †Ñ„ „Ğ‚  DK;^.]?SÀ0 †ƒF †ƒA †ƒA †ƒ= „Ò‚ „Ğ‚ †Ê„ „É‚  DK;\.]?SÀ0 †ƒF †ƒA †ƒA …ıƒ= „Ë‚ „É‚ †Ã„ „Â‚  D7;7I5Á1! D7Á1! Dy	1 D/y- D/1y- DKqQ DK;?3qe D?I7d  DK;;7Qa D? 	D?1Q/Q_ DW DWMUKI E 											-%!A E/	!	 E/I;1        E?‰YI1!A E?I7S‰e€§ €ƒ  E?I7‰Xt å- o €•,3  E7	…	)	%	Ñ E7/SU…%)	%	- - - - - - -  E/3Cı‚]  E?C7E_ı‚Y  E?SU75ı‚0  E/I5ı€ç  E7I;U=ı€Ã  E/a_Ñ9  E	%	¥ E/	%	¥ E/1	%	¥ E?C7‰íc €  	E?37IS7QSÁ1!= = = = = = = =  EK•q EK;?3/E•	€À   EKKM
		  EKI;‘F  EKKMS‘	  EK3/U?KIa  EK;?3*  EKY7S  E7/QI75€Á  EKKC75€¥  E7/Ib  E?;=U-  FÉi œ- ‘g  F•u1	-A F™!				 F/MSJM7I.IIKU/U?KISÁ1! F/Á1! F/MSX/EW72KEWGIÁ1! F/QC7QJMU?KISÁ1! F/MSF/QC7QJMU?KISÁ1! F/U3='Á1 F/U3=&Á1! F/U3=%Á1! F/U3=$Á1! F/]Á1! F/]4WQ/U?KIÁ1! F/U3=Á1! 
F/U3=T/;Á1! F/IW/E2WQY78?UR=K[PFR6À0 ˆ:ƒA ˆ:ƒF ˆ8ƒD ˆ-ƒ= †ÿ †ú ‰·„  F/IW/E2WQY78?U>I3Q7G7IUSÀ0 ˆ3
ƒ; ˆ3ƒ=
 ˆ1ƒ;
 ˆ&
ƒ7
 †ø
 †ó
 ‰°
ƒü  F/AKQT?3CSÁ1! F/AKQT?3C2KEKQÁ1! F/AKQT?3CRU_E7Á1! F/U=2KISU/IUH/G7À0
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
                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               >E •­>E œ÷> ’1>  F0D2/E32KEWGIH/G7À0 —¹>E —½>E —·>E —™>E •«>E •¦>E œğ> ’*>  F0D2/E?1Q/U?KITQ/37À0 —$ —( —" — • • œ¤ ‘Ş  F0D2/E?1Q/U?KI6]M7Q?G7IUT_M7À0 — —! — –ı • •
 œ ‘×  F0D2/E?1Q/U?KIR=KQU2KEWGIH/G7À0 — — — –ö • • œ– ‘Ğ  F0D2/E?1Q/U?KI2KEWGIH/G7À0 — — — –ï • ”ü œ ‘É  F0D2/E?1Q/U?KIP/I;747S3À0 — — — –è ”ú ”õ œˆ ‘Â  F0D2/E?1Q/U?KI44R>I57]À0 — — — –ã ”õ ”ğ œƒ ‘½  F0D2/E?1Q/U?KIHWGLE/37SÀ0 –ü —  –ú –Ü ”î ”é œ| ‘¶  F0D2/E?1Q/U?KI^F/]À0 –õ –ù –ó –Õ ”ç ”â œu ‘¯  F0D2/E?1Q/U?KI^F?IÀ0 –î –ò –ì –Î ”à ”Û œn ‘¨  F0D2/E?1Q/U?KI2K799?3?7IUSÀ0 –ç –ë –å –Ç ”Ù ”Ô œg ‘¡  F0D2/E?1Q/U?KI>IU7Q9/37JMÀ0 –à –ä –Ş –À ”Ò ”Í œ` ‘š  F0D2/E?1Q/U?KI>4X/EW7À0 –Ù –İ –× –¹ ”Ë ”Æ œY ‘“  F0D2/E?1Q/U?KI6OW/U?KIT_M7À0 –Ò –Ö –Ğ –² ”Ä ”¿ œR ‘Œ  F0D2/E?1Q/U?KIVS7QH/G7À0 –Ë –Ï –É –« ”½ ”¸ œK ‘…  F0D2/E?1Q/U?KI>4H/G7À0 –Ã –Ç –Á –£ ”µ ”° œ= ‘w  F0D2/E?1Q/U?KILQ7UU_VI?USÀ0 –º –¾ –¸ –š ”¬ ”§ œ6 ‘p  F0D2/E?1Q/U?KIVI?USÀ0 –µ –¹ –³ –• ”§ ”¢ œ/ ‘i  
F0D2=/II7EÀ0 ˜Oã ˜Sã ˜Mã ˜/ã –Aã –<ã ~˜ ’¸˜  F0D2=/II7E`7QK479/WEUÀ0 ˜L ˜P ˜J ˜, –> –9 { ’µ  F0D2=/II7EF/U3='À0˜" ˜& ˜  ˜ – –  F0D2=/II7EF/U3=&À0 ˜ ˜ ˜ —ú – – Q ’‹  F0D2=/II7EF/U3=%À0 ˜ ˜ ˜ —ò – •ÿ I ’ƒ  F0D2=/II7EF/U3=$À0 ˜
 ˜ ˜ —ê •ü •÷ A ’{  F0D2=/II7ETQ?;;7QÀ0 –« –¯ –© –‹ ” ”˜ œ% ‘_  F0D2=/II7EP7S7UJI2KEE73UÀ0 –¤ –¨ –¢ –„ ”– ”‘ œ ‘X  F0D2=/II7E\(FK57À0 – –¡ –› –} ” ”Š œ ‘Q  F0D2=/II7EJ99S7UÀ0 –– –š –” –v ”ˆ ”ƒ œ ‘J  F0D2=/II7EP7Y7QS7À0 – –“ – –o ” ”| œ	 ‘C  F0D2=/II7E2/E?1Q/U?KIRUKQ/;7À0 –ˆ –Œ –† –h ”z ”u œ ‘<  F0D2=/II7ER7ISKQ.WUK>4À0 – –… – –a ”s ”n ›û ‘5  F0D2=/II7ER7ISKQ>4H/G7À0 –z –~ –x –Z ”l ”g ›ô ‘.  F0D2=/II7E>I57]À0 –s –w –q –S ”e ”` ›í ‘'  F0D2KEWGI<7/57QR=KQUH/G7À0 ˜‚ ˜‚ ˜ ‚ —â‚ •ô‚ •ï‚ 9Ğ ’sĞ  F0D2KEWGI<7/57QH/G7À0 —û‚ —ÿ‚ —ù‚ —Û‚ •í‚ •è‚ 2Î ’lÎ  F0D2KIU?IWKWSÀ0 –i –m –g –I ”[ ”V ›ã ‘  F0D2KEE73U?KITQ?;;7Q6I/1E75À0 – –" – •ş ” ” ›˜ Ò  F0D2KEE73U?KIHWG4?;?U/E6Y7IUSÀ0 – – – •÷ ”	 ” ›‘ Ë  F0D2KEE73U?KI6I54?;?U/E.9U7QHWGÀ0 – – – •ğ ” “ı ›Š Ä  F0D2KEE73U?KIR7E73U756Y7IUVI?USÀ0 –	 – – •é “û “ö ›ƒ ½  #F0D2KEE73U?KIR7E73U756Y7IUR=KQUH/G7À0 – – – •ä “ö “ñ ›~ ¸  F0D2KEE73U?KIR7E73U756Y7IUH/G7À0 •ı – •û •İ “ï “ê ›y ³  F0D2KEE73U?KIR7E73U756Y7IUT?G7À0 •õ •ù •ó •Õ “ç “â ›t ®  F0D2KEWGI<7/57QÀ0 •î •ò •ì •Î “à “Û ›m §  F0D2KEWGI<7/57QVI?USÀ0 •ë •ï •é •Ë “İ “Ø ›j ¤  F0D2KEE73U?KIHWG6Z62KEWGISÀ0 •¯ •³ •­ • “¡ “œ ›. h  F0D2KEE73U?KIJY7QS/GME?I;À0 •¨ •¬ •¦ •ˆ “š “• ›' a  F0D2KEE73U?KIF/]4WQ/U?KIÀ0 •¡ •¥ •Ÿ • ““ “ ›  Z  F0D2KEE73U?KIHWGR/GME7SÀ0 •š • •˜ •z “Œ “‡ › S  F0D2KEE73U?KI47EU/TÀ0 •“ •— •‘ •s “… “€ › L  F0D2KEE73U?KI6I=/I375T?G?I;À0 •ƒ •‡ • •c “u “p › <  F0D2KEE73U?KIP7M7/UÀ0 •| •€ •z •\ “n “i šû 5  F0D2KEE73U?KIR/GME7.U`7QKÀ0 •u •y •s •U “g “b šô .  F0D2KEE73U?KIT?G7VI?UÀ0 •n •r •l •N “` “[ ší '  F0D2KEE73U?KI4QKM2KWIU7QFK57À0 •g •k •e •G “Y “T šæ    F0D2KEE73U?KIVS7Q2KEE73UFK57À0 •` •d •^ •@ “R “M šß   F0D6Z6.Y7Q/;74/U/À0 –[ –_ –Y –; ”M ”H ›Õ ‘  F0D8/SURU/QUÀ0 •Š • •ˆ •j “| “w ›	 C  F0D:KK;E7F/MSJM7I.IIKU/U?KISÀ0 ˜b ˜f ˜` ˜B –T –O ‘ ’Ë  F0D:KK;E7F/MSX/EW72KEWGIÀ0 ˜[ ˜_ ˜Y ˜; –M –H Š ’Ä  F0D:KK;E7F/MSF/QC7QJMU?KISÀ0 ˜V ˜Z ˜T ˜6 –H –C … ’¿  F0DD/1LQKRKWQ37À0 •Sa •Wa •Qa •3a “Ea “@a šÒa a  	F0DD/1LQKÀ0 •N •R •L •. “@ “; šÍ   
F0DLKQUP79À0 •" •& •  • “ “ š¡ Û  F0DP/5?/U?KI>IU7QY/ET?G7VI?UÀ0 –M –Q –K –- ”? ”: ›Ç ‘  F0DP/5?/U?KI>IU7QY/EÀ0 –F –J –D –& ”8 ”3 ›À ú  !F0DR7ISKQJ37/IJMU?3SZ/Y7E7I;U=6I5À0 ˜E ˜I ˜C ˜% –7 –2 t ’®  F0DR7ISKQJ37/IJMU?3SZ/Y7E7I;U=À0 ˜> ˜B ˜< ˜ –0 –+ m ’§  F0DR7ISKQL=KUK;/U7VI?USÀ0 ˜7 ˜; ˜5 ˜ –) –$ f ’   F0DR7ISKQL=KUK;/U7VI?USF7U7QSÀ0 ˜0 ˜4 ˜. ˜ –" – _ ’™  F0DR7ISKQRKWQ37>4À0 ˜) ˜- ˜' ˜	 – – X ’’  F0DR6.Y7Q/;74/U/À
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
                                                                                                                                                                                                                                                         								 , ‚t  -  &  &  -  ,  %  GS&ı GSı GSı G7ı™I G7/SWQ7G7IUSı‚Â  GSı‚»  G7/SWQ75ı‚  G/C7ü‚k’  G7ıá‚e # *  GKSUüä‚Xú <  G?ıñ G?SS7Sı‚  GKı…e-I GKQ7ıét‚ €» €è  
€Ø,	D  G7/SWQ7G7IUıû  G7/SWQ7ü™ÂV%   GWSUüğf€ š  GWıñ G/IW/Eı€  	G7IU?KI75ı€Š  Gˆ-	0

€‰	      ˜5pBI„7PrOŸhe ˜9pBI„;PrOŸhe ˜3pBI„7PrOŸhe ˜pBIƒg€À€¿OŸhe –'pBIƒg€¿OŸhe –"pBIƒg€¿OŸhe  dhBw‚¢‚a€À„gg‚b ’hBwƒZg‚b  GKWU=ùV  GÙ9)	 G[Ù9)	 G[Ù9)	 GGÀ0 ƒjg|• ƒjg|• jg|• vjg|• Hjg|• Cjg|• 	’:i‚d‚] 	Di‚d‚]  GGÁ1! G/QCŒÄ	  GWEU?ME?3/U?KI·  G/QCS¤  G?SU/C7\  G/U=7G/U?3/EŒ€úA  G?I?G/E  GUˆ “f€À ‘x ‘s ™E‚a€À  GU‰! G7U7QSe  GKU?KIe^  G_V#"€¬ RI  G/I_4  
G73=/I?3/E  GKU=7Q  G/I€¸  G/AKQ€© $ SH  G/AKQS€  G_ Hı½%	! H@ı H@ıƒh  Hü‚É  HW
ı½-! HWG17Qı½1‚À •û •ÿ •ù •Û “í “è  HKG7I3E/UWQ7ü‚´‚”  HKıé H/G7Á1! HWGLE/37SÁ1! HWG4?;?U/E6Y7IUSÁ1! HWGÁ1! HWG6Z62KEWGISÁ1! HWGR/GME7SÁ1! HWG17QÁ1! HSÁ1! H.HSÁ1! HSÁ1! H.Á1! H/G7SÁ1! H/Á1! H/G7RU/QUÁ1! H/G7À


0
 ‰IŠ‚3‚ ‰I‚.‚ ‰G‚.‚ ‰<Š‚,‚ ˆŠ‚‚ ˆ	Š‚‚
 ŠÄˆ€º‚2€º‚ 
†Î‚d‚  	H7[4/U/Á1! H7Á1! HWGR73U?KISÁ1! HWGRGKKU=?I;LK?IUSÀ0 €‡ €‡ €‡ €‡ €‡ €‡ €† €‡  HWG47Q?Y/U?Y7LK?IUSÀ0 €€ €€ €€ €€ €€ €€  €€  HKI7”€ª  HWG7Q?3  H% HW% HWG17Q% I/G7 -E,!€É? _ _   _ _  _  €„< _ Z Z Z Á Z Z Z Y Z  I+¡															-)A I/¡-E-! IW¡					A- 
IWGT/Q;7US¡-%	-7 ( ( ( ( ( (  IWG47M7I57I3?7S¡-%	-2 # # # # # #  IWG2KGG7IUS%         I7[”%A‰W! €š 7 7 m  I7•	%		]u I775S…	)	%	# s # # # # # #  IK…	)	!	])I IKU…)	%	](H ‚y5=€        O ¿ o <B  IKU7ı'  I/Y?Y?7[ñA-d d d  IWG17Qå     IWEEˆ{  I7]U‰L  IKS7ùH  IWGPK[SÁ1”h ”l ”f ”H ’Z ’U  I‘€û €73  I7Y7Q‘€ö  I7SU75‘€  IWG17QS  IKe€ë  J•	)		-% JH• JH•P  JM•uI1! JM7Q/U?KI• J8…%)	%	 J8…%)	%	4 4 4 4 4 4 4  J1
ı½1 J1S7QY7ı  JM7Iı€ş  J9	ı½1! J9ı  JMU?KIL/I7‰ JM7I.IIKU/U?KISÁ1! 	JMU?KISÁ1! JMU?3SZ/Y7E7I;U=6I5Á1! J37/IJMU?3SZ/Y7E7I;U=6I5Á1! J3Á1! JMU?3SZ/Y7E7I;U=Á1! J37/IJMU?3SZ/Y7E7I;U=Á1! JMÁ1! JI2KEE73UÁ1! JI	Á%! J99S7UÁ1! JY7QS/GME?I;Á1! JYÁ1! JWU2Q7/U72KISU/IUÁ1! JWÁ1! JWU.GME?UW57Á1! JWU8Q7OW7I3_Á1! JWUZ/Y78KQGÁ1! JWU2KEWGI>4Á1! J99S7UX/EW7Á1! J1A73UT=?3CD?I7SÁ1! J1A73U.WUKG/U?3473?G/EÁ1! J1A73ULQ73?S?KIÁ1! J1A73ULQ73?S?KI473?G/EÁ1! J1A73U4/U/RKWQ37Á1! J1A73U2KEKQÁ1! J1A73UR=KQUH/G7Á1! J1A73UH/G7Á1! J94/_8KQG/UÁ1! JI8?QSU4/U/Á1! JMU?KIS4?/EK;SÁ1! JITKKE1/QÁ1! JRÁ1! JRÁ1! JB• JB•€ö  JI7•€ƒ  JP• JP•s  
J1A73U?Y7Se  K•				Y%I K9•e%I K9•d	%	H €­€§ ‚Á03'?
N%* 2}    €¥€   €Û &&  +		
 Â		  €ô&	N1 €Î€‡ >  KQ…			%	Y KQ…		%	X8 ‚´  8  8   8 8 8 8 €º€­ u €œ  K1ı™ 	K1A73U?Y7ı‚G  KIıuu	)I KIı˜I€è !b' €”  K1S7QY7ıL  KWå-e KWUå,d
S ` o €	 j 
€Ú &&  +# «  KYÑí KY7QÑíG   KI7‰u	)M  ‰ €˜  KøA  KM•} KM7Q/UKQ•€Á  	KM7Q/UKQS”€šz  KU‘ KU=7Q‘  KWUS?57€«  KIE_p… =B  K9U7I^  K1A73Uea  KM7Q/U7$  L¡		)		-A L4‘			)							 L/I7‰ L/
‰I1!A L/Q/G7U7QH/G7SÁ1! L/;7>I57]Á1! L/;7À0 ‰™V†ë ‰™V†ë ‰—V†é ‰ŒV†Ş ˆ^V…° ˆYV…« ‹
Jˆi ‡J„r  	L/;7T/1E7À0 ‰–€÷ ‰–€÷ ‰”€÷ ‰‰€÷ ˆ[€÷ ˆV€÷ ‹€ë ‡€ë  L/;7P7ME/_Z?I5K[LKS?U?KIÀ0 ˆœ†æ ˆœ†æ ˆš†ä ˆ†Ù ‡a…« ‡\…¦ Šˆd †#„m  L/M7QD?I72KEKQÁ1! L/;7:Q/M=L/M7QD?I72KEKQÀ0 ˆ‘	†å	 ˆ‘	†å	 ˆ	†ã	 ˆ„	†Ø	 ‡V	…ª	 ‡Q	…¥	 Š	ˆc	 †	„l	  L/M7QD?I7RM/3?I;Á1! L/;7:Q/M=L/M7QD?I7RM/3?I;À0 ˆ…†è ˆ…†è ˆƒ†æ ˆx†Û ‡J…­ ‡E…¨ Šˆf †„o  L/M7QÁ1! L/;7:Q/M=L/M7QÀ0 ˆ|†ê ˆ|†ê ˆz†è ˆo†İ ‡A…¯ ‡<…ª ‰ùˆh †„q  
L/;7>I9KÁ1! L/;7L/;7>I9KÀ0 ˆu†ì ˆu†ì ˆs†ê ˆh†ß ‡:…± ‡5…¬ ‰òˆj …ü„s  L/;74?SME/_L/;7>I9KÀ0 ˆp†ê ˆp†ê ˆn†è ˆc†İ ‡5…¯ ‡0…ª ‰íˆh …÷„q  	L/;72KEKQÀ0 ˆi	†å	 ˆi	†å	 ˆg	†ã	 ˆ\	†Ø	 ‡.	…ª	 ‡)	…¥	 ‰æ	ˆc	 …ğ	„l	  	L/;7T?UE7À0 ˆ]†ì ˆ]†ì ˆ[†ê ˆP†ß ‡"…± ‡…¬ ‰Úˆj …ä„s  L/;7<7EM7Q4/U/2WQY78?UÀ0 	ˆ=0‚5 	ˆ=5‚0 	ˆ;3‚0 	ˆ00‚. ‡0 †ı1 	‰º0‚Ö3  L/;7:Q/M=2/QU7S?/IÀ0 	‡
‚;‚ 	‡‚6‚ 	‡‚6‚ 	†ı‚4‚ …Ï‚‚ …É‚‚
 	‡É‚÷‚ …Ä‚
‚  L/?QSÁ1! 
L/;70KWI5SÀ0 €æ €æ €æ €æ €æ €æ €å €æ  L/;7<7EM7QLK?IUST/I;7IU`	ˆ‡€»ƒN€»  L/M7Q%  L/ 
L/_3=73C L7ı‰ L7/QSKIıƒ`  L7Q37IUı¡‚¾ 
  L7Q?G7U7QT7SU7Qña (   L7í L7Q?G7U7QT7SU7Qí 	L7Q?G7U7QäW  L<Á1 L<JTJÁ1–¿ –Ã –½ –Ÿ ”± ”¬  L=_S?3SüƒY‚Q  	L=KUK;/U7ü‚€¦4!O  L=	ı½1! L=KUK;/U7VI?USÁ1! L=KUK;/U7VI?USF7U7QSÁ1! L?3C7Uü¹1ƒ			€ß0{E-€‰ 1		Êşº¾   3 L
  2 3
  2 4À	!ûTD-@	!ûTD-
  5 6
 
 2 7
  2
 8 9 :	 ; < =
 > ? @ A <init> ()V Code LineNumberTable LocalVariableTable this LMainDriver; main ([Ljava/lang/String;)V writer LCSVWriter; e Ljava/io/IOException; args [Ljava/lang/String; sin LSin; Sampler LMathSampler; dumper $Ledu/utc/MichaelHolloway/DataDumper; StackMapTable # 3 4 6 : 
SourceFile MainDriver.java   Sin MathSampler  B "edu/utc/MichaelHolloway/DataDumper 	CSVWriter C D E java/io/IOException F G H Error: Could not write I J K 
MainDriver java/lang/Object (DDILFunction;)V Data run P(Ledu/utc/MichaelHolloway/DataProvider;Ledu/utc/MichaelHolloway/DataProcessor;)V java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V !               /     *· ±                        	       à     =» Y· L» Y  +· 	M» 
Y· N» Y· :,¸ § :² ¶ ±    / 2      & 	           )  /  2  4  <     >  )     4    !    = " #    5 $ %   % & '     ( )  *    ÿ 2  + , - .  /	  0    1                                                                                                                                                                                                                                                                                                                                                                                         +· 	M» 
Y· N» Y· :,¸ :» Y· :¶ š 
¶ :Ç ² ¶ ±» Y· :» Y· :» Y· :		¶ W	¶ 	¶ 	¶ -¸ § :² !¶ ±    X    Y ›     '   b            )  /  2  ;  D  K ! P # X $ Y & d ( m * v , ~ / ‰ 0  1 • 2 › 6  4   5 ¨ 8 (   p  ) r - .  2 i / 0  ; ` 1 2  d 7 3 4  m . 5 6  v % 7 8 	    9 :    © ; <    ¡ = >   ‘ ? @    ‰ A B  C   6 ÿ K  D E F G H I J  ÿ D  D E F G  K	  L    M                                              ¡-%	- 	M/3C/;7¡-%	- M.¡															-%A MQ¡				]q MQKA73U¡	D 
 5 5 
 5 
 5 5 
 
 5 
 
  M/3C/;7 	,		$			,	
? 
0 
0 
0 
0 
0 
0  M/¡				á M/Q/GS%         MW1E?3”$) N * # # * ) "  MW•İ M/?IU2KGMKI7IU‘	 P  MMı MMıƒj  M?	ı½1! M?3C7Uı‚|  MKıé% MK?IUSıè
 
€İ &&  +# ®  MQ7M/Q7ı?  MWQMKS7ı#  MQ?IUEIå,U b q €  l  MQ?IU¥€„  M7Q9KQGˆ€š5  M7‰¥ M/QUùg  M?Á1!P P P P P P O P  MQK;Q/G€Ö  MQK37SS‘  ME)I ME/375)œ €Ã  MK?IU%‹   MKSS?1E_ˆ  MQK;Q/GG?I;[  MQKY?57  
MQ7579?I75  MQK1E7G	  M7Qe   MQA 	MQK1E7GA MWQSW7^8
 C  ME/373  MQK;Q/GSp  M/QUS8  MQKM7QE_%  
M/QU?3WE/Q
  NW/5Q/U?3Á1! NÁ%!A NWÁ%! NW7SU?KI”	
€× &&  +# ¨  NW/5`”€Ö  N  OÑ© OWÑ© OW?3CÑ1  OWKU?7IU´k%  OWKU7Œ£  P73U/I;E7X?7[7Q €Ë€Â '  P73U/I;E7LQK;Q/G €Œ~ X JB  P7¡Ae% P¡	%	%	-%	 P	)	%	™ P7 P73U/I;E7X?7[7Q P73U/I;E7LQK;Q/G‘ P6‰%)	%	 P64‰€·  	P73U/I;E7ˆ$@€›A 8 8  P73KY7Q‰W  P6…%)	%	™ P6.4F6…%)	%	 P6.4F6…%)	%	        P7MKQUı P?	ı½1! P?Y7Qıƒf  
P797Q7I37SüƒV€£‚”  P7SWEUSü™‚8‚ @  P73KQ5ü‚+  P7GKY7ı0  P/I;747S3Á1! P/Á1! P7S7UJI2KEE73UÁ1! 	P7Y7QS7Á1! P/5?/U?KI>IU7QY/ET?G7VI?UÁ1! P/5?/U?KI>IU7QY/EÁ1! P7M7/UÁ1! P79Á1! PK	Á-! PK[SÁ1 PWIÁ1! 	P7/5KWUÁ1! PWÁ1! PKU/U?KIÀ


0
 ‰PŠ‚3‚ ‰P‚.‚ ‰N‚.‚ ‰CŠ‚,‚ ˆŠ‚‚ ˆŠ‚‚
 ŠËˆ€º‚2€º‚ 
†Õ‚d‚  P7ME/_Z?I5K[LKS?U?KIÁ1! PFR6Á1! P/I;7Á1! 
P/I;7F/]Á1! 
P/I;7F?IÁ1! 	P/?I1K[Á1! PKU/U75.I;E7Á1! P?;=U^.]?SÁ1! PFÁ1! P7ME/_Z?I5K[P7M7/UÀ0          P7ME/_Z?I5K[RM775À0          P7ME/_Z?I5K[LKS?U?KIÀ0 	 	 	 	 	 	 	 	  P7SKEWU?KIÁ1! P/5?/ISÀ0 y y y y y y x y  P7SMKIS7•€¦  PKWI53  P7GKY/Ee€¬  
P62^2D6PU Q7/5G7 `  Q¡	%	%	Y)I Q7¡	%	%	Y)M 
Q73U/I;E7S•F G  	Q73U/I;E7ˆew v  Q7/57Q…%)	%	        Q7SM73U?Y7E_ı‚¬  Q7/E?a75ı‚†  Q?ı Q?;=Uı‚€  QWıY QWII?I;ı‚o  Q7SWEUSü‚H  Q7M7/Uıı  Q7E?/1?E?U_ı÷  Q7G/?Iıu  	Q7E7/S?I;ü`  Q7/5?I;ı  Q?I;ü€³  Q?;?5E_ü€°  QWIS¥p  Q•) Q• 
Q7E/U?KI/E•€™  Q7/5S‘€¼  Q797QS‘`  Q7SWEUŒr,j  	Q7UWQI?I;€”  
Q7MQ7S7IUS.  Q7m Q7/Em Q7OW?Q7G7IUSd€ß  	Q73K;I?a7e€š  QQ QQ$&Ï€Q  Q$ 	Q$XG/]% Q7/SKIK  Q7OW?Q75  R*																	%	 R
Ù	©%9 RY R/	ı½1! R/5E7ıƒe  R/GME7üƒ%t‚”  	R/GME7SÁ1! R/GME7.U`7QKÁ1! R3	ı½1! 	R3?7IU?SUıƒ[  R3?7IU?9?3Á1! R3Q77IP7SKEWU?KIÀ0 €ğ €ğ €ğ €ğ €ğ €ğ €ï €ğ  R3 	R3?7I37 R7ı½%	! R73KI5Sı‚Î   R7ISKQJ37/IJMU?3SZ/Y7E7I;U=6I5Á1! R7ISKQJ37/IJMU?3SZ/Y7E7I;U=Á1! R7ISKQL=KUK;/U7VI?USÁ1! R7ISKQL=KUK;/U7VI?USF7U7QSÁ1! R7ISKQRKWQ37>4Á1! R7ISKQ.WUK>4Á1! R7ISKQ>4H/G7Á1! R7E73U756Y7IUVI?USÁ1! R7E73U756Y7IUR=KQUH/G7Á1! R7E73U756Y7IUH/G7Á1! R7E73U756Y7IUT?G7Á1! R7QY7QÁ1! R7Q?/EHWG17QÁ1! R7UÁ1! R7U:Q/M=F/U3=Á1! R7UX?57K.I/E_S?SÁ1! R7ULQ75?3U?KIÁ1! R7URUKQ75PWIÁ1! R7U.WUK2Q7/U75Á1! R7UD/U7SUÁ1! R7U88TÁ1! R7U<?SUK;Q/GÁ1! R7UR=K[>I4/U/0QK[S7QÁ1! R7URKWQ37H/G7Á1! R7U2KGG7IUSÁ1! 	R7UH/G7Á1! R7ISKQY?EE72/E36OW/U?KIÀ


0


 ‘Uhez“ ‘Uhez“ ‘Shez“ ‘Hhez“ hez“ hez“ “g‚b‚[ g‚b‚[  R7ISKQ>IMWU2KEWGIÁ1! R7ISKQ2KEWGIÁ1! R7ISKQ2KI9E?3U6I/1E75À0 & & & & & & % &  
R73U?KISÁ1! 	R7MU7G17Q•	€ë Ê  R7E73U75•€  R=İ	1	 R=77U'İ	]        R=77U&İ	]        R=77U%İ	]        R=KQUH/G7Á1! R=?9UÁ1 R=KQU2KEWGIH/G7Á1! R=K[>I4/U/0QK[S7QÁ1! R=K[D?Y7P7/5KWUÁ1! 
R=K[PFR6Á1! R=K[.EEX/EW7S.SF/AKQT?3CSÀ0 †ÃƒF †¾ƒA †¾ƒA †¸ƒ= …ˆ‚ …„‚ ‡€„ …{‚  R=K[LK?IULQKU73UKQSÁ1! R=K[0/S76QQKQ0/QSÁ1! R=K[TQ/376QQKQ0/QSÁ1! R=K[2WQSKQ47EU/Á1! R=K[2WQSKQRU/UWSÁ1! R=K[D7;7I5Á1! R=K[T/I;7IUÁ1! R=K[LK?IUSÁ1! R=K[:Q/M=F/U3=JITKKE1/QÀ0 €• €• €• €• €• €• €” €•  R=K[`7QKJITKKE1/QÀ0 € € € € € € € €  R?	•Õ1! R?a7	•Õ1! R?a7À


0
 ‰Š‚3‚ ‰‚.‚ ‰‚.‚ ‰Š‚,‚ ‡ÚŠ‚‚ ‡ÕŠ‚‚
 Šˆ€º‚2€º‚ 
†š‚d‚  RGKKU=?I;LK?IUSÁ1! RGÁ1! RJı RJH>2ı€ó  
RKWQ37>4Á1! RKÁ1! RKWQ37R7QY7QÁ1! RKWQ37Á1! 	RKWQ37&Á1#BlueJ class context
comment0.params=args
comment0.target=void\ main(java.lang.String[])
numComments=1
                                                                                                                                                                                                                                                                                                                                                                                                                     •í€ìŠk  	RUKQ/;7Á1! RUKQ7D/U7SUF/]Á1! RU/QUÁ1! RUQ?I;Á1! RUKQ75PWIÁ1! RUKQ7SÁ1! RU/QU2KEE73UT?G7Á1! RU_E7Á1! 	RU/QUT?G7À


0


 |fcx‘ |fcx‘ zfcx‘ ofcx‘ Afcx‘ <fcx‘ ’3e‚`‚Y =e‚`‚Y  
RU/QU>I57]À0 ‰Œ ‰Œ ‰Š ‰ ˆQ ˆL Šı ‡  RU_E7SÀ


0
 ‰/	…	‚
	.	‚
	 ‰/	Š	‚
	)	‚
	 ‰-	ˆ	‚
	)	‚
	 ‰"	…	‚	'	‚	 ‡ô	…	‚
	‚	 ‡ï	…	‚	‚	 Šª	ƒ	€µ	‚	-	€µ	‚
	 
†´	‚_	‚ 	  RU/3C2KEWGISÁ1! RU/UWSÁ1! 
RU/U?KI7Q_À0 €¸ €¸ €¸ €¸ €¸ €¸ €· €¸  RUQ/?;=Ud  RUW99! RWı1u1! RWGG/Q_ı   RWG63UÍa !  RWÁ	 RWG63UÁ	 RW1KQ5?I/U7J99S7UÀ


0
 ˆÕ‰	‚1	‚ ˆÕ	‚,	‚ ˆÓŒ	‚,	‚ ˆÈ‰	‚*	‚	 ‡š‰	‚‚ ‡•‰
‚‚	 ŠP‡	€µ	‚0	€µ	‚ 
†Z‚d‚  RW1KQ5?I/U7TK>4À


0
 ˆÍ‚6‚ ˆÍ“‚1‚ ˆË‘‚1‚ ˆÀ‚/‚
 ‡’‚‚ ‡‚‚
 ŠHŒ€º‚5€º‚ 
†R‚e‚  R_ı R_G1KEı‚µ  R_SU7GåQ ^ m €œ €Ÿ h  Sİ0@      Uh„ Uh„ Sh„ Hh„ h„ h„  €Š0. ’g„È g„È Y(d  S,¡					%A S‘ S/e S/G7e€ş  S/U?S9_e€Ü  S/U?S?9_e€È  S3ıá S3/UU7Qı˜  S3Q77Iı  S3‘ 	S3?7I37‘ S3?7I37y  S7•½)	A 
S7UX?S?1E7•b  S7U479/WEU2EKS7JM7Q/U?KI•J  S7UT?UE7•C  S7UR?a7•;  S7U2KEKQˆ€³H  S7U‰€ª  S7Y7Q/Eı‚l  S73U?KIı‚>  S77Iü˜‚:™ €”-  S7M/Q/U7ı¦  S73KI547Q?Y/U?Y7T?G7R=?9UÀ0—Î‚÷ —Ò‚÷ —Ì‚÷ —®‚÷ •À‚÷ •»‚÷  S7IU?I7E‘€Á  S73KI5e!  S77e€ê  S73KI547Q?Y/U?Y7`‚¯ ’?‚¯  S77G75€œ  S=K[>IU7Q9/37 -%	-€Î? d k d d k k  S=¡					Y	) S=K[VS7S¡-%	-A 2 2 2 2 2 2  S=K[6]U7I5S¡-%	-< - - - - - -  S=KWE5„	($) 6 ) ) ) ) ) )  S=7…%)	%	" " " " " " "  S=K[Iü™,p €á  S=K[F7SS/;74?/EK;‰y  S=K[>IMWU4?/EK;ˆZ  S=/M7•	- 7  S>Á1! S>4Á1 —C —G —A —# •5 •0 B ’AB  S?ıé1M S?57Sıj  S?]”€˜z  S?57d  S?GME7  SEKM7ü•ú    SEı• SGe SG/EEe€Ú  SK…	)		])I SKG7KI7…%)	%	        	SKG7U?G7Sı‚x  SK9Uı€Ş  SKü€µ  SKQQ_‰€  	SKG7U=?I;‘  SK9U[/Q7q €˜  SKEWU?KI) €±  SKG7€Â  SMiI SM775i sS  SM73?9?3/EE_2  SM73?9?30  SOe SOW/Q75e"  SSÀ0 …jg|• …jg|• ƒjg|• xjg|• Jjg|• Ejg|• 	’<i‚d‚] 	Fi‚d‚]  SSÁ1! SU•9%I SU/U?3•1* + $ $ + * #  SUQ/?;=Uüä  SU/UWSı  SU/I5ü€´  SU7M2KEWGI0/S75Á1—A —E —? —! •3 •.  SU7MÁ(	”_ ”c ”]  ”? ’Q ’L  
SU/U7G7IUS•€à  	SU/U7G7IU”	€ÎE E  SU/QU‘/  SUKQ75t  SUKQ/;7`  SUKQ7SL  SUKMM75e€Õ  SUW5?75w  SU/QU75`  SWıI©)I SW3=ıñ€á €˜  SWQ9/37ı€ß  SWQ7ı€Ú  SWG´[#  SWMMKQUeW  SW?U75€‚  S[• S[?I;•! = !  S_G1KEŒ²…  S_ S_IU/]  Tı‚Æ  T+¡				%A T…	%	=	 TÁ1! T/Q;7U¡-%	- T/¡%	%	-%!1! 	T/Q;7US¡-%	- T/1E7ü	œ‚ê‚Â 	  T/;Á1! T/1E7Á1! T/1E72KEWGIÀ


0


 ‰… ‰… ‰ƒ ‰x ˆJ ˆE 
Šö 
‡   	T/I;7IUÁ1! T7…			%	-1! T7EE…%)	%	        T7SUüƒ			 3			  T7ù9u T7SUSù T7SU7Qñ5 T7SU7Qí9 T7]UÁ1! 
T73=IKEK;_Á1!: : : : : : : :  T7SU± T<…%)	%	 T<>R…%)	%	> > > > > > >  T=‰	%		-%A T=7S7‰‘€¦ 5  T=?S‰)		Õ€ˆ  ‚ƒ9¬     €”, S   J  T=7‰	$		Y(Hr ' ‚Ÿ€¼€ö["" ' ' €¢% ' ' K ' ' % €äB€ƒ ° \ €¢.  T=7KQ_ıC  T=?3CD?I7SÁ1! T=7_e€ù  T=WSN  
T=QKW;=KWU€½  T>…%)	%	 T>TD6…%)	%	1 1 1 1 1 1 1  T?•¥1	 T?UE7	•Õ1! T?G7ü¥0
ƒ$					% 9					      ”Ü5‰€é ”à5‰‘€é ”Ú5‰€é ”¼5‰z€é ’Î5ˆº€é ’É5ˆº€é  š[6œ€é •6†Ì€é  T?G7R=?9UÁ1 T?G?I;Á1–É –Í –Ç –© ”» ”¶  
T?G7VI?UÁ1! T?G7Á1! T?G?I;Á1! T?G7J99S7UX/EW7Á1! T?G7J99S7UÁ1! T?G7J94/_8KQG/UÀ


0


 ‡b_t ‡b_t …b_t zb_t Lb_t Gb_t ’>a‚\‚U Ha‚\‚U  T?3CSÁ1! T?3CSPKU/U75.I;E7Á1! T?3C2KEKQÁ1! T?3CRU_E7Á1! T?UE72KEKQÁ1! TJ…%)	%	 TJ…%)	%	< < < < < < <  TKüô"  TK	ı½1! TKÁ1! TK>4Á1! 	TKKE1/QÁ1! TQ/37Á1! TQ	Á)	! 	TQ?;;7QÁ1! TQ?;;7Q4/U/Á1! TQ?;;7QLQ7TQ?;;7Q4/U/Á1! TQ?;;7Q2KISU/IUÁ1! TQ?;;7QVS72KISU/IUÁ1! TQ?;;7QX/EW7Á1! TQ?;;7QT_M7Á1! TQ?;;7Q6I/1E75Á1! TQ7/U.ST7]UÁ1! TQ/ISM/Q7IUÁ1! TQ/372KEWGI>4Á1! TQ/376QQKQ0/QSÁ1! TQ/37>4L/?QSÁ1! TQW7‘t  TW
Á%	! TW&Á1!—Ç —Ë —Å —§ •¹ •´ œş ’8  TWÁ1!—… —‰ —ƒ —e •w •r œ¼ ‘ö  TW¡ TWUKQ?/E\¡ 
TWUKQ?/E TW7S5/_•	€é È  T[• T[K•E  T\…%)	%	 T\T…%)	%	 T_M7Á1! T_Á1! U/Q;7U& €à  U_M7 -%	-€Ó?€ƒ i p i i p p  U/¡			!Q U/Q;7U% ,$,€¡ v } v v } }  U.¡															%A UQW7	  $,pC d 4 h4 4 4 h4 h4 €Ò€Æ  UQ	¡!%	-q U_¡-%	- UK¡	%		I)I UK¡$		H(H $ ‚j€„m6I	& $ $ a $ $ d $ $  €ã€Ù 	€Ÿ 4 µ® 	 Hb ]+
h
 B  U/Q;7U	  ‚U        U=7ˆ9$	X(H€®  ;‚’
		3(	

$&  @  €¦   €›)3 e   €Ñ:0&$ H. ÃD)5b
 !( 	€Ó	.6 ;  U=‰		%		M)I U[‰e‘ U[K‰e‘F €‚ €¹  U=/U‰tu(HD ( €—&  €õ €¶ | 9VS  U=?S…)	!	É ‚Û‚“#     c    /  UIüƒA‚»  U/1E7Sı‚Ù   U7
ıu)!)	 U7SU	ı!)	‚Ö  F F F  F F F  UıuI1	‚Ì € Š8 Š8 Š6 Š+ ˆı ˆø  ‹§ ‡±  U/1E7ü‚3+  U?G7ü˜‚F X:  U?ıí-I U=Q77ı¥  U=7Iı„  UKW3=ıh  U=QKW;=üM  UKMüE*  UIı U=7KQ7U?3/EıE  U=/Iıíu6  €Ú  U7EE?I;‰n  U=7G‰O  Uá!1 U/á U/1E7Sá U7Á1 U7SUÁ1 U?G7Su€Ş6 5  
U7QG?I/U75‘€¾  U/C7I‘"  U=7Q7em  U=/ICSO  U=?I;S€Ä  U=KS7€  UK[/Q5Sc  U=7?QN  U UKU/EE_(  V¥‘	 VR¥ 	VR0&$84¥ V¡					-)	 VT¡-%	- VT8¡-%	-H 9 9 9 
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
                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               Á1! X/EW7SÁ1! X7QU?3/E@WSU?9?3/U?KIÀ


0
 ‰#Š‚3‚ ‰#‚.‚ ‰!‚.‚ ‰Š‚,‚ ‡èŠ‚‚ ‡ãŠ‚‚
 Šˆ€º‚2€º‚ 
†¨‚d‚  X/EW7S.SF/AKQT?3CSÁ1! 	X7QS?KIÁ1! X7QS?KIÀ0          X?SW/Eq X7EaœG ‘  XG XG/]% X?SW/EDK;?3 Y									9)A YK									 YK?5									 +  O  ,  %  %  ,  +  $  Y7
•• Y7QS?KI•$         Y_üƒ6
o‚B  Y_Küƒ)‚±  YSüƒ#					5 8					  Y/EW7Sü‚¢€‹  Y/ıY•) Y7EK3?U_ü˜È   YSı Y7QU?3/Eıv  Y_ı Y/EW7¤”€¤ Lo
 €’  Y/Q?/1E7¤”c M! €›%  Y	À0—|ˆÇ —€ˆË —zˆÇ —\ˆ´ •n‡ô •i‡ô  œ³ŒF ‘í…v  Yµ--	 YEµ--	 YESµ-- Y?q Y?SW/E)  Y/E?5d€^  Y?S?U?I;-  Y$ Y$U  YES?;	 YG YG] Z•9%!A ZQ•% ZQ?U7•%         Z?ıAe1! Z?U=?Iı  Z?5U=åA Z¤|+  Z=/Uˆu_ €• Bi  Z=‰I%!A Z/Y7E7I;U=6I5Á1! Z/Á1! Z/Y7E7I;U=Á1! 
Z/Y78KQGÁ1! 
Z/IUH.HSÁ1! Z=?U7Á1! Z?I5K[LKS?U?KIÁ1! Z?I5K[P7M7/UÁ1! Z?I5K[RM775Á1! Z•	u Z?•	 	Z?I5K[S•	 Z=7Iq€Ó kD €Ò  Z=_'   ZK ZKQ5  Z= Z=_ [?5U= ,$ €Ø''7 n'7 u.7 n'7 n'7 u.7 H u.7  [¡					Y)I [?¡	%	!uq [?U=‰ìp€Œ ‚`€Åx €×D  €¶|  [=…	)	%	Y	)I [=K…%)	%	Ñ       €¹  [/Sü	™H‚œ
.˜j € €ù"W@  [=7Iü™‚n €ÿ  [7ı™ [7Q7ı˜‚$ €ÂT  [=?3=ıñ‚ ,  [/ı™I [K‰}q [KWE5‰|pa C ;U  [=7Q7•€Ğ  [?EE€Û6  [Q?U?I;€Ô  [Q‘ [KQC2€Õ   [=/U€§  [KQC?I;SF  [=_M  \(FK57Á1! \	Á%! \(Á1! \D/17EÁ1! \F/]Á1! \F?IÁ1! \T?3CSPKU/U75.I;E7Á1! \.WUKS3/E7<?IUÁ1! \.WUKS3/E7JI8?QSU4/U/Á1! \.WUKS3/E7Á1! \.]?SÁ1! \DÁ1! \TÁ1! \FÁ1! \.Á1! \¡ \¡ \”u  ] ,$,D0 A€İ%%7 s%7 z,7 s%7 s%7 O z,7 z,7 	“Î€ÃPrO 	“Î€ÃPrO 	“Ì€ÃPrO “µ€À€¿O ‘Ç€¿O ‘Â€¿O 7€£ƒ €Ç€Ë€Ã€À€Ç€ËPzO…Ÿ ’q€£‡¹   ]¡%	%-E1!A ]G?Iüƒ?‚»  ]G/]üƒ=‚»  ]_ı ]_ı–  ]Gı ]İ	] ]Eİ	] ]ES]İ	] ]&7Á1! ]9999Á1! ]$Á1! ]99999999Á1! ]+Á1! ]+9+9Á1 ](Á1! ]()()Á1! ],Á1! ],1,1Á1! ]'Á1! ]''''Á1! ]+$+$Á1! ],(,(Á1! ]*'*'Á1! ]3$3$Á1! ]3Á1! ]&Á1! ]$	Á1!A ]9Á1! ]*Á1! ]$  ^F/]Á1! ^F?IÁ1! 
^D?IC75>4SÀ


0
 ‰Š‚3‚ ‰‚.‚ ‰	‚.‚ ˆşŠ‚,‚ ‡ĞŠ‚‚ ‡ËŠ‚‚
 Š†ˆ€º‚2€º‚ 
†‚d‚  ^.]?SÁ1! ^D/17EÁ1! ^.WUKS3/E7<?IUÁ1! ^.WUKS3/E7JI8?QSU4/U/Á1! ^.WUKS3/E7Á1! ^DÁ1! ^FÁ1! ^
Á% ^.Á1! ^KÁ1! ^KWQÁ1! ^”w  ^e ^7e ^7/=e ^7e ^7Se	  _ ,$,€â##7 x#7 *7 x#7 x#7 Q *7 *7  _¡				]- _K…				] _KWQ…			 	ù[-#         G    _KW	…%)		\     b   €  _?e _?7E5Se€¸  `7QK479/WEUÁ1! `7Á1! `7QKÁ1! `7QKJITKKE1/QÁ1! `Á1! b¡		 b¡		                bµ	 bµ	 dü½1‚«}¼9 —G —K —E —' •9 •4  dı½1! dlı dlı‚  dxÁ1! dxebÁ1!‘† ‘† ‘„ ‘y K F “<  e
ı½1 eı˜   ebÀ0 V V T I ä ß ’‘Ö à  ebÁ1! fˆ€	  f‰ g)																%		 g)								$ c  €È;  ƒ_€;€·€¯  V   	c(   r3  9    	€¢(  &        
 	•€¯”/ 	• €¯”3 	•€¯”- t L 	”ü€¯” 	“€¯’! 	“	€¯’  œD©šd ‘~©  gho”pY! k  gÍ•q-91! gÍ•p,80 D €¡ m ”Ø5: ”Ü5: ”Ö5: ”¸5: ’Ê5: ’Å5: šW6 ‘6  gh•1A ghiäN  g	%	9 g	%	9 g|ù g|ùO  gdÀ0 —ÏBK —ÓBK —ÍBK —¯BK •ÁBK •¼BK B ’@B  gdÁ1! ho”$e 
€Ê X e t €¬Z €¤  h"•					%		 ho•% h"”			$	1
  _8
  
ƒPXø^T 2  +  + 2   1
 *
         3 3 3 z P 3 3 3  3 3  hkı hkıƒi  hgüƒL‚®  h#ı h#gıƒ/  hâ€ı hâ€ı™  hgı hlĞ½Y .  hlÑ½ hmµu1 hmµu1R ”m ”q ”k ”M ’_ ’Z  h	%	9 h	%	 hpmÀ0 —ÑBB‚Ú —ÕBB‚Ú —ÏBB‚Ú —±BB‚Ú •ÃBB‚Ú •¾BB‚Ú B| ’BB|  hÍÀ0 • •" • ”ş “ “ š ×  hÍÁ1! hpÁ1! hl± hl± i•%9-! im•% im•%         i”$8- 	 	 	 	 I6	 {h	 	 	 	“Í€ÃPrO 	“Í€ÃPrO 	“Ë€ÃPrO €Ê “´€À€¿O ‘Æ€¿O ‘Á€¿O ™“€Ç€Ë€Ã€À€Ç€ËPzO  ii iiiii€‹  jm#ü¡‚,½   jı1-%	!E jmı¡ jå0H


$ DJ P €ª € “ÏQrPJ%O “ÏQrPJ%O “ÍQrPJ%O v&  
“¶OqOH%O ‘ÈOH%O ‘ÃÊşº¾   3 g
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
  I J K L M <init> ()V Code LineNumberTable LocalVariableTable this LMainDriver2; main ([Ljava/lang/String;)V reader LCSVreader; plotter LSwingPlotter; frame Ljavax/swing/JFrame; e Ljava/io/IOException; args [Ljava/lang/String; inFile Ljava/io/File; chooser Ljavax/swing/JFileChooser; StackMapTable N 7 J 
SourceFile MainDriver2.java   javax/swing/JFileChooser O P Q R S T U no file selected V W X 	CSVreader  Y Z [ \ ] ^ SwingPlotter javax/swing/JFrame _ ` a b c d e f java/io/IOException Error retrieving file MainDriver2 java/lang/Object java/io/File showOpenDialog (Ljava/awt/Component;)I getSelectedFile ()Ljava/io/File; java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V (Ljava/io/File;)V nextData '()Ledu/utc/MichaelHolloway/LookupTable; #edu/utc/MichaelHolloway/LookupTable printAll ()Ljava/lang/String; add *(Ljava/awt/Component;)Ljava/awt/Component; setSize (II)V setDefaultCloseOperation (I)V 
setVisible (Z)V !               /     *· ±                        	   !    G     xL» Y· M,¶ š ,¶ L+Ç ² ¶ ±» 	Y+· 
N² -¶ ¶ ¶ » Y· :» Y· :¶ W¶ ¶ ¶ § N² ¶ ±  $ k n      N       
        #  $ # - % : & C ( L * T - _ . e / k 5 n 2 o 4 w 8    H  - > " #  C ( $ %  L  & '  o  ( )    x * +    v , -  
 n . /  0    ı  1 2÷ I 3  4    5                                                                                                                                                                                                                                                                                                                                                                                                                                           2›Q
€°
€º
€¹
€¯
€°
€º
€¿
8S'1(1³


€—9RA	€‡€¢C	ˆ.A	€‡€¢_	ˆ;XI€˜6 €ÔIYS'1(1³


€—9j¢‚ 9XI€˜7 c" T  l4¡																%A lpm`”€Ö  lpa m”)		)@  ! 	‚ÊÒ€æ ! ! ! !   ! !      Thk Thk Rhk €ú €ì ?73 Ghk hŒák hŒÜk  ?0 ’gÕk g‹Şk   m"•						)A mi•% mii•%         mmˆd€¥ ~ €“, a  mm‰e mmmmmmmù2  mdÀ0 —ÆB —ÊB —ÄB —¦B •¸B •³B œıB ’7B  mdÁ1! meÁ1! mebÁ1!• •# • ”ÿ “ “ š Ø  n„	($,$ AE ¨ E E E E E E „hez“‰Ëk. „hez“‰Ëk. ‚hez“‰Ék. €òH w 	Ñ€Ó whez“‰¾k. Ihez“ˆk. Dhez“ˆ‹k. ’;g‚b‚[‹;k- Eg‚b‚[‡Dk. &  n…	)	%	-%!A o•1I1! o•0H0 $ a! & P+ T	 }X $ •”Ô •”Ø •”Ò ”í”´ ’ÿ’Æ ’ú’Á šŒšS Æ  opmÀ0 •!ƒ—2 •%ƒ›2 •ƒ—2 •ƒ„2 “‚Ä2 “‚Ä2 š ‡`1 ÚÁ  oebÀ0 ‘ˆ ‘ˆ ‘† ‘{ M H “>  oxÁ1! oxdÁ1!‘„ ‘„ ‘‚ ‘w I D “:  oeÁ1! opÁ1! pmÀóóó0ó¶¶ Ò•‚õ˜n	
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

	
	
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
			

			
	
		

			
	
	
		
	 ‚õ˜r	
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

	
	
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
			

			
	
	
		
	 ‚õ˜l	
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

	
	
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
			

			
	
	
		
	 ‚õ˜N	
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
		
		
	
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
			

	
	
		

		
	
	
		
	 ‚¸–`	
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
		
	
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
			

			
	
				

	
		
	 ‚¸–[	
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
		
	
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
                                                                                                                                                                                                                                                                                                                                                                                                                     			


		

				
	1	

					
																								 †˜t			


		

				
	1	

															
														 †˜n			


		

				
	1	

															
														 p& †˜P		

	
	

				
	1	

					
										
														 …¡–b		

	

				
	1	

					
																				 …¡–].           S—BB  —Bb    ..          S—BB  —B      Ap a c k a  Ug e . b l u   e j PACKAG~1BLU  \—B˜B  &Ÿ˜Bæ%Q  README  TXT  i—BB  \W\Bè%×  å. c l a s  às   ÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a t h S  àa m p l e r   $ x åATHSA~1CLA  r—BB  S|B&ş  åS i n . j  a v a   ÿÿÿÿ  ÿÿÿÿåIN~1   JAV  ~—BB  t—B!&  åS i n . c  ¾l a s s   ÿÿ  ÿÿÿÿåIN~1   CLA  —BB  ïxBX&‘  åS i n . c  Yt x t   ÿÿÿÿ  ÿÿÿÿåIN~1   CTX  ¢—BB  ïxBY&-  åD r i v e  ûr . c l a s   s   åRIVER~1CLA  ±—BB  Ö’Bk&û  åD r i v e  r . c t x t     ÿÿåRIVER~1CTX  Â—BB  Ö’B'k   åD a t a .  –j a v a   ÿÿ  ÿÿÿÿåATA~1  JAV  	—BB  o—B'Æ  åD a t a .  Äc l a s s     ÿÿÿÿåATA~1  CLA  —BB  j—B&+  åD a t a .  ßc t x t   ÿÿ  ÿÿÿÿåATA~1  CTX  )—BB  j—B	'E  åa v a   ÿÿ ²ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a t h S  ²a m p l e r   . j åATHSA~1JAV  8—BB  S—B'(  åa   ÿÿÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V r e  a d e r . j   a v åSVREA~1JAV  J—BB  ˜B!&~  ås s   ÿÿÿÿ ºÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V r e  ºa d e r . c   l a åSVREA~1CLA  _—BB  –B'ç  åt   ÿÿÿÿÿÿ Õÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V r e  Õa d e r . c   t x åSVREA~1CTX  r—BB  –B'Í  åa   ÿÿÿÿÿÿ –ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V W r  –i t e r . j   a v åSVWRI~1JAV  —BB  |—B!&u  ål a s s    ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a t h S  a m p l e r   . c åATHSA~2CLA  ‘—BB  ˜zB'   åt x t   ÿÿ ûÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a t h S  ûa m p l e r   . c åATHSA~1CTX  œ—BB  ˜zB',  LINES   TXT ¨—B˜B  	§ˆB'   Bj a v a    ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿS w i n g  P l o t t e   r . SWINGP~1JAV  ¹—B˜B  Í˜B '  ås s   ÿÿÿÿ Äÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V W r  Äi t e r . c   l a åSVWRI~1CLA  V—BB  ¦”B#'ö  åt   ÿÿÿÿÿÿ ßÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V W r  ßi t e r . c   t x åSVWRI~1CTX  d—BB  ¦”B$'>  BP o i n t  K. c l a s s     ÿÿS w i n g  KP l o t t e   r $ SWINGP~1CLA  p—B˜B  Í˜B&Ê  AL i n e P  •r i n t e r     ÿÿLINEPR~1     {—BB  R‹B      Bx t   ÿÿÿÿ rÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿL i n e P  rr i n t e r   . t LINEPR~1TXT  —BB  sSŒB      Bc l a s s  «  ÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿS w i n g  «P l o t t e   r . SWINGP~2CLA  „—B˜B  Í˜B!&V  Bc t x t    fÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿS w i n g  fP l o t t e   r . SWINGP~1CTX  —BB  Í˜B
'¿  åu t h . j  ÿa v a   ÿÿÿÿ  ÿÿÿÿåT h e M o  ÿm e n t O f   t r åHEMOM~1JAV  š—BB  feB*'ä  KA      TXT ¢—B˜B  ²˜B      åF u n c t  3i o n . j a   v a åUNCTI~1JAV  ¦—BB  ˜B!&ã   åu t h . c  ®l a s s   ÿÿ  ÿÿÿÿåT h e M o  ®m e n t O f   t r åHEMOM~1CLA  ±—BB  feB,'‹  ås   ÿÿÿÿÿÿ bÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåF u n c t  bi o n . c l   a s åUNCTI~1CLA  ½—BB  ÏV|B0'²   åF u n c t  }i o n . c t   x t åUNCTI~1CTX   —BB  ÏV|B'e   åu t h . c  Ét x t   ÿÿÿÿ  ÿÿÿÿåT h e M o  Ém e n t O f   t r åHEMOM~1CTX   —BB  feB•'k   Bv a   ÿÿÿÿ Ãÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿM a i n D  Ãr i v e r .   j a MAINDR~1JAV   —BB  ı˜B'  Bs a f s .  Òt x t   ÿÿÿÿ  ÿÿÿÿL i n e P  Òr i n t e r   f d LINEPR~2TXT  % —BB  ­UŒB—'&  Ba s s   ÿÿ rÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿM a i n D  rr i v e r .   c l MAINDR~1CLA  ) —B˜B   ™Bk&í  AC S V F i  ’l e . t x t     ÿÿCSVFILE TXT  3 —B˜B  ²˜B''&  Bx t   ÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿM a i n D  r i v e r .   c t MAINDR~1CTX  8 —B˜B   ™B'k   Ba v a   ÿÿ #ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿM a i n D  #r i v e r 2   . j MAINDR~2JAV  C —B˜B  ë˜B$'é  Bl a s s    Rÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿM a i n D  Rr i v e r 2   . c MAINDR~2CLA  L —B˜B  ë˜B#'8  Bt x t   ÿÿ mÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿM a i n D  mr i v e r 2   . c MAINDR~2CTX  X —B˜B  ë˜B)'k   åi n . c l  ¡a s s   ÿÿÿÿ  ÿÿÿÿåM a t h S  ¡a m p l e r   $ s åATHSA~3CLA  f —BB  {X|B'Y  åD r i v e  Lr . j a v a     ÿÿåRIVER~1JAV  t —BB  ù•BŸ'  EDU         —BB  cW\B '    DOC        ¤!—BB  @}B¶'    åm p   ÿÿÿÿ Ñÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå7 5 7 0 9  Ñ4 2 2 5 0 4   . t åb l u e j  Ñ2 0 7 2 8 5   3 7 åLUEJ2~1TMP  x:—BB  ;—B      åa v a #    Òÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a t h S  Òa m p l e r   . j åATHSA~2JAV  UO—BB  P—BÏ'  åa v a #    Òÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a t h S  Òa m p l e r   . j åATHSA~2JAV  UO—BB  S—BÏ''  åD a t a .  j a v a #     ÿÿÿÿåATA~2  JAV  sZ—BB  [—B&¤  åD a t a .  j a v a #     ÿÿÿÿåATA~2  JAV  sZ—BB  c—B&Ã  åD a t a .  j a v a #     ÿÿÿÿåATA~2  JAV  sZ—BB  g—B
'¦  åD a t a .  j a v a #     ÿÿÿÿåATA~2  JAV  sZ—BB  o—B
'§  åS i n . j  a v a #   ÿÿ  ÿÿÿÿåIN~2   JAV  Xs—BB  t—B&÷  åa #   ÿÿÿÿ ¶ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V W r  ¶i t e r . j   a v åSVWRI~2JAV  T{—BB  |—B&L  åa #   ÿÿÿÿ +ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåC S V r e  +a d e r . j   a v åSVREA~2JAV  «˜BB  ˜B&U  å#   ÿÿÿÿÿÿ Sÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåF u n c t  Si o n . j a   v a åUNCTI~2JAV  {
˜BB  ˜B&Á   åv a #   ÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r .   j a åAINDR~3JAV  ‹J˜BB  K˜Bk&Ú  åv a #   ÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r .   j a åAINDR~3JAV  fS˜BB  T˜Bk&  åv a #   ÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r .   j a åAINDR~3JAV  fS˜BB  W˜Bk&£  å_ _ S H E  aL L 0 . j a   v a å_SHEL~1JAV   Z˜BB  [˜B#'¸   ås   ÿÿÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå_ _ S H E  L L 0 . c l   a s å_SHEL~1CLA  ÂZ˜BB  [˜B$'ó  åv a #   ÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r .   j a åAINDR~3JAV  ›n˜BB  o˜B#'£  å_ _ S H E  aL L 1 . j a   v a å_SHEL~1JAV  p˜BB  q˜B#'¸   ås   ÿÿÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå_ _ S H E  L L 1 . c l   a s å_SHEL~1CLA  ²p˜BB  q˜B$'ó  åa v a #    ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r 2   . j åAINDR~3JAV  Á˜BB  ˜B#'#  åa v a #    ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r 2   . j åAINDR~3JAV  Á˜BB  •˜B#'ˆ  åv a #   ÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r .   j a åAINDR~3JAV  =«˜BB  ¬˜B*'è  åv a #   ÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r .   j a åAINDR~3JAV  ½˜BB  À˜B*'U  åj a v a #  ü  ÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåS w i n g  üP l o t t e   r . åWINGP~2JAV  Ì˜BB  Í˜B*'+  å_ _ S H E  aL L 2 . j a   v a å_SHEL~1JAV  &Î˜BB  Ï˜B*'¸   ås   ÿÿÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå_ _ S H E  L L 2 . c l   a s å_SHEL~1CLA  FÎ˜BB  Ï˜B+'ó  åv a #   ÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r .   j a åAINDR~3JAV  ’ü˜BB  ı˜B*'š  åm p   ÿÿÿÿ šÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå4 4 5 1 7  š1 1 3 2 9 3   . t åb l u e j  š9 0 4 7 4 3   0 8 åLUEJ9~1TMP  ‡©˜B˜B  ª˜B      å_ _ S H E  aL L 0 . j a   v a å_SHEL~1JAV  ¨°˜B˜B  ±˜Bã'¸   ås   ÿÿÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå_ _ S H E  L L 0 . c l   a s å_SHEL~1CLA  s±˜B˜B  ²˜Bä'ó  åa v a #    ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r 2   . j åAINDR~3JAV  ”Ä˜B˜B  Å˜Bã'ª  åa v a #    ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r 2   . j åAINDR~3JAV  Ã×˜B˜B  Ù˜Bã'Å  åa v a #    ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿåM a i n D  r i v e r 2   . j åAINDR~3JAV  ¿é˜B˜B  ê˜Bã'×  å_ _ S H E  aL L 1 . j a   v a å_SHEL~1JAV  Bì˜B˜B  í˜Bã'¹   ås   ÿÿÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå_ _ S H E  L L 1 . c l   a s å_SHEL~1CLA  aì˜B˜B  í˜Bä'ô  å_ _ S H E  aL L 2 . j a   v a å_SHEL~1JAV  Nõ˜B˜B  ö˜Bã'¹   ås   ÿÿÿÿÿÿ ÿÿÿÿÿÿÿÿÿÿÿÿ  ÿÿÿÿå_ _ S H E  L L 2 . c l   a s å_SHEL~1CLA  kõ˜B˜B  ö˜Bä'ô                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  