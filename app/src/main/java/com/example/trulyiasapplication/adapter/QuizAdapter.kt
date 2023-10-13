package com.example.trulyiasapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trulyiasapplication.DataModel.Question
import com.example.trulyiasapplication.R

class QuizAdapter(val context:Context,var list:ArrayList<Question>):RecyclerView.Adapter<QuizAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizAdapter.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.daily_quiz_listitems,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuizAdapter.ViewHolder, position: Int) {
        val obj=list[position]
        holder.txtQuestionSubject.text=obj.subject
        holder.txtQuestionTitle.text=obj.title
        holder.txtQuestionContent.text=obj.content
        holder.option1RadioButton.text=obj.option1
        holder.option2RadioButton.text=obj.option2
        holder.option3RadioButton.text=obj.option3
        holder.option4RadioButton.text=obj.option4
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        var txtQuestionSubject:TextView=ItemView.findViewById(R.id.txtQuestionSubject)
        var txtQuestionTitle:TextView=ItemView.findViewById(R.id.txtQuestionTitle)
        var txtQuestionContent:TextView=ItemView.findViewById(R.id.txtquestioncontent)
        var option1RadioButton:RadioButton=ItemView.findViewById(R.id.option1RadioButton)
        var option2RadioButton:RadioButton=ItemView.findViewById(R.id.option2RadioButton)
        var option3RadioButton:RadioButton=ItemView.findViewById(R.id.option3RadioButton)
        var option4RadioButton:RadioButton=ItemView.findViewById(R.id.option4RadioButton)
    }
}