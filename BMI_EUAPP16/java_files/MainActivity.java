<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="pl.edu.zslp.bmi_euapp16.MainActivity"
    android:background="@drawable/bmi">
    <Button
        android:id="@+id/buttonAbout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginTop="101dp"
        android:onClick="MAbout"
        android:text="@string/button_about"
        android:textSize="18sp" />
    <Button
        android:id="@+id/buttonCalculator"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_below="@+id/buttonAbout"
        android:layout_marginTop="35dp"
        android:onClick="MCalc"
        android:text="@string/button_bmi_calculator"
        android:textSize="18sp" />
</RelativeLayout>