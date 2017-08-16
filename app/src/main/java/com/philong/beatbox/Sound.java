package com.philong.beatbox;

/**
 * Created by Long on 8/16/2017.
 */

public class Sound {

    private String mAssetPath;
    private String mName;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".waw", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
