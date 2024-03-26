package com.torchtech.customtoast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CustomToast {

    companion object  {

          fun showToast (context: Context ,message:String,toastIcon:Int){
            val  toast = Toast.makeText(context,message,Toast.LENGTH_SHORT)
            val view = LayoutInflater.from(context).inflate(R.layout.custom_toast_layout,null)
            val toastMessage = view.findViewById<TextView>(R.id.toast_text)
              val toastImage = view.findViewById<ImageView>(R.id.toast_icon)
              toastImage.setImageResource(toastIcon)
            toastMessage.text = message
              toast.setGravity(Gravity.TOP,0,0)
            toast.view = view
            toast.show()
        }
    }
}