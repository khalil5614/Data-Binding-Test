# Data-Binding-Test
Data binding in android application

You can bind view attribute with a variable to automatically update data. Syntax for one way binding is '@{variable_name}'.

For data binding <layout> will be the root element of the layout xml file. After the <layout> tag there will be <data> tag where binding data is declared in variable. After </data> tag view codes are written as we write before( there will be LinearLayout, COnstraintLayout or any other Layout required for your view).  From java this declared are set the value of this variables. Any class can import using <import>. To use a method of imported class, method must be static.
  
  
# For Example:
 
<layout >
&lt; layout 
  xmlns:android="http://schemas.android.com/apk/res/android"
  &gt;
    <data>

        <import type="com.example.khalil.databindingtest.Utils.MyStringUtils" />

        <variable
            name="user"
            type="com.example.khalil.databindingtest.Models.User" />

        <variable
            name="temp"
            type="com.example.khalil.databindingtest.Models.TemperatureData" />

    </data>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        
        </LinearLayout>
&lt;/layout&gt;
</layout>
