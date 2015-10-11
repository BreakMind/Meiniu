/*
 * Copyright (C) 2015 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of Meizhi
 *
 * Meizhi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Meizhi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Meizhi.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.drakeet.meizhi.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import me.drakeet.meizhi.model.Gank;

/**
 * Created by drakeet on 8/11/15.
 */
public class GankData extends BaseData {

    public Result results;
    public List<String> category;

    public class Result {
        @SerializedName("Go") public List<Gank> goList;
        @SerializedName("搞笑视频") public List<Gank> 搞笑视频List;
        @SerializedName("今日视频") public List<Gank> 今日视频List;
        @SerializedName("Swift") public List<Gank> swiftList;
        @SerializedName("请您欣赏") public List<Gank> 妹纸List;
        @SerializedName("拓展资源") public List<Gank> 拓展资源List;
        @SerializedName("实用工具") public List<Gank> 实用工具List;
        @SerializedName("牛人设计") public List<Gank> 牛人设计List;
        @SerializedName("牛人轶事") public List<Gank> 牛人轶事List;
        @SerializedName("网络安全") public List<Gank> 网络安全List;
    }
}
