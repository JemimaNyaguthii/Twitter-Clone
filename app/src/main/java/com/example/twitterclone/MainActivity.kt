package com.example.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        displayTweets()

}
    fun displayTweets(){
        var tweet =TweetData("ivImage","Jemima","@jemima","jjjjjjjjj",4,
            3,1)
        var tweet1 =TweetData("","maimy","","jjjjjj",0,9,
            1)
        var tweetsList = listOf(tweet,tweet1)
        var tweetsAdapter= TweetsRvAdapter(tweetsList)
        binding.rvTweets.layoutManager =LinearLayoutManager(this,)
        binding.rvTweets.adapter = tweetsAdapter

    }
}