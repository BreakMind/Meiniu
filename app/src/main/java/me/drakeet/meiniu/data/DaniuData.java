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

package me.drakeet.meiniu.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import me.drakeet.meiniu.model.Daniu;

/**
 * Created by drakeet on 8/11/15.
 */
public class DaniuData extends BaseData {

    public Result results;
    public List<String> category;

    public class Result {
        @SerializedName("Go") public List<Daniu> goList;
        @SerializedName("搞笑视频") public List<Daniu> 搞笑视频List;
        @SerializedName("今日视频") public List<Daniu> 今日视频List;
        @SerializedName("Swift") public List<Daniu> swiftList;
        @SerializedName("请您欣赏") public List<Daniu> 妹纸List;
        @SerializedName("拓展资源") public List<Daniu> 拓展资源List;
        @SerializedName("实用工具") public List<Daniu> 实用工具List;
        @SerializedName("牛人设计") public List<Daniu> 牛人设计List;
        @SerializedName("牛人轶事") public List<Daniu> 牛人轶事List;
        @SerializedName("网络安全") public List<Daniu> 网络安全List;
    }
}
