package com.example.myapplication3.Intent

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.myapplication3.CHANNELID
import com.example.myapplication3.NOTIFICATIONID
import com.example.myapplication3.R
import com.example.myapplication3.ZERO

class FirstIntentActivity : AppCompatActivity() {

    lateinit var btnExplicit: Button
    lateinit var editTextData: EditText
    lateinit var btnImplicit: Button
    lateinit var btnPendingIntent: Button
    lateinit var notificationManager: NotificationManager

    @SuppressLint("RemoteViewLayout")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_intent)
        btnExplicit = findViewById(R.id.btn_explicit)
        editTextData = findViewById(R.id.edittext_data)
        btnImplicit = findViewById(R.id.btn_implicit)
        btnPendingIntent = findViewById(R.id.btn_pendingIntent)
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        btnPendingIntent.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val name = getString(R.string.notificationTitle)
                val descriptionText = getString(R.string.notificationDescription)
                val importance = NotificationManager.IMPORTANCE_HIGH
                val channel = NotificationChannel(CHANNELID, name, importance).apply {
                    description = descriptionText
                }
                val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.createNotificationChannel(channel)
            }
            val pendingIntent = PendingIntent.getActivity(this, ZERO, intent, PendingIntent.FLAG_IMMUTABLE)
            val bitmapLargeIcon = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.bookmark)
            val builder = NotificationCompat.Builder(this, CHANNELID)
                    .setSmallIcon(R.drawable.bookmark)
                    .setContentTitle(getString(R.string.exampleTitle))
                    .setContentText(getString(R.string.exampleDescription))
                    .setStyle(NotificationCompat.BigTextStyle().bigText(getString(R.string.description)))
                    .setLargeIcon(bitmapLargeIcon)
                    .setContentIntent(pendingIntent)
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
            with(NotificationManagerCompat.from(this)) {
                notify(NOTIFICATIONID, builder.build())
            }
        }
        btnExplicit.setOnClickListener {
            val data = editTextData.text.toString()
            val intent = Intent(this, SecondIntentActivity::class.java)
            intent.putExtra(getString(R.string.data), data)
            startActivity(intent)
        }
        btnImplicit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.youTube)))
            startActivity(intent)
        }
    }
}