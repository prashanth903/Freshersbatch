package com.capg.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {

	private static List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("thiru","111","java master"),
			new Topic("kp","112","hello"),
			new Topic("vani","113","trishaaaa")
			));
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public static  void addTopic(Topic topic)
	{
	topics.add(topic);	
	}
	public static void updateTopic(String id, Topic topic) 
	{
	for(int i=0;i<topics.size();i++)
	{
		Topic t=topics.get(i);
		if(t.getId().equals(id))
		{
			topics.set(i, topic);
			return;
		}
	}
		
	}
	public static void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}
	
	
}
