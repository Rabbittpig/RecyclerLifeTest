package com.example.recyclerlifetest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwp
 * @description: 封装Activity收集器类
 * @date: 2020/11/13 13:24
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    // 向集合中添加Activity
    public static void addActivity(Activity activity){
        if(activity!=null){
        activities.add(activity);
        }
    }

    // 从集合中移除Activity
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    //移除并关闭所有的Activity
    public static void finishAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
