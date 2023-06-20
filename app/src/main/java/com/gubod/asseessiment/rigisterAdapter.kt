package com.gubod.asseessiment

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class rigisterAdapter (var contactData: List<registerdata>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=registeritemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactData.get(position)
        var binding=holder.binding
        binding.tvName.text=currentContact.username
        binding.tvNumber.text=currentContact.phonenumber
        binding.tvEmail.text=currentContact.email
    }

    override fun getItemCount(): Int {
        return contactData.size
    }
}
class ContactViewHolder(var binding: reigisteritemBinding):RecyclerView.ViewHolder(binding.root){

}