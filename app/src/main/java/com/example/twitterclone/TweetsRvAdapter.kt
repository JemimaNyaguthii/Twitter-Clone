package com.example.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.twitterclone.databinding.TweetListItemBinding

class TweetsRvAdapter(var tweetList:List<TweetData>):RecyclerView.Adapter<TweetsRvAdapter.TweetsViewHolder>
    (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        val binding =TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        var binding =holder.binding
        binding.ivAvatar.tag =currentTweet.avatar
        binding.ivImage.tag =currentTweet.avatar
        binding.tvHandle.text =currentTweet.handle
        binding.tvDisplayName.text =currentTweet.displayName
        binding.tvCommentCount.setText(currentTweet.commentCount)
        binding.tvRtCount.setText(currentTweet.rtCount)
       binding.tvTweet.text=currentTweet.tweet
    }
    override fun getItemCount(): Int {
        return tweetList.size
    }
class TweetsViewHolder(var binding: TweetListItemBinding):RecyclerView.ViewHolder(binding.root)
}





