package com.example.all_progressbar

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.example.all_progressbar.databinding.DialogCutomProgressbarBinding


class DialogCustomProgressBar : DialogFragment() {
    lateinit var  binding:DialogCutomProgressbarBinding
    companion object {
        @JvmStatic
        fun newInstance() =
            DialogCustomProgressBar().apply {
                arguments = Bundle().apply {
                }
            }
    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(requireActivity())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCanceledOnTouchOutside(false)
        // to transparent
        val v: View? = dialog.window?.decorView
        v?.setBackgroundResource(android.R.color.transparent )
        // for full width
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        return dialog
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_cutom_progressbar, container, false)
        return  binding.root
    }


   

}

//var otpVerificationDialog = OtpVerificationDialog()
//fragmentManager?.let { it1 -> otpVerificationDialog.show(it1, "otpVerificationDialog") }
