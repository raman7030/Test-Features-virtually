package com.amazonaws.services.s3.internal;

import com.alipay.sdk.m.t.e;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.StringUtils;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class RestUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f497 = Arrays.asList("acl", "torrent", "logging", "location", am.bp, "requestPayment", "versioning", "versions", "versionId", "notification", "uploadId", "uploads", "partNumber", "website", "delete", "lifecycle", "tagging", "cors", "restore", "replication", "accelerate", "inventory", "analytics", "metrics", "response-cache-control", "response-content-disposition", "response-content-encoding", "response-content-language", "response-content-type", "response-expires");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m473(String str, String str2, DefaultRequest defaultRequest, Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append(str + "\n");
        HashMap mapM191 = defaultRequest.m191();
        TreeMap treeMap = new TreeMap();
        if (mapM191 != null && mapM191.size() > 0) {
            for (Map.Entry entry : mapM191.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (str3 != null) {
                    String strM789 = StringUtils.m789(str3);
                    if (e.f.equals(strM789) || "content-md5".equals(strM789) || "date".equals(strM789) || strM789.startsWith("x-amz-")) {
                        treeMap.put(strM789, str4);
                    }
                }
            }
        }
        if (treeMap.containsKey("x-amz-date")) {
            treeMap.put("date", "");
        }
        if (!treeMap.containsKey(e.f)) {
            treeMap.put(e.f, "");
        }
        if (!treeMap.containsKey("content-md5")) {
            treeMap.put("content-md5", "");
        }
        for (Map.Entry entry2 : defaultRequest.m190().entrySet()) {
            if (((String) entry2.getKey()).startsWith("x-amz-")) {
                treeMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            String str5 = (String) entry3.getKey();
            String str6 = (String) entry3.getValue();
            if (str5.startsWith("x-amz-")) {
                sb.append(str5);
                sb.append(':');
                if (str6 != null) {
                    sb.append(str6);
                }
            } else if (str6 != null) {
                sb.append(str6);
            }
            sb.append("\n");
        }
        sb.append(str2);
        String[] strArr = (String[]) defaultRequest.m190().keySet().toArray(new String[defaultRequest.m190().size()]);
        Arrays.sort(strArr);
        char c = '?';
        for (String str7 : strArr) {
            if (f497.contains(str7) || (collection != null && collection.contains(str7))) {
                if (sb.length() == 0) {
                    sb.append(c);
                }
                sb.append(str7);
                String str8 = (String) defaultRequest.m190().get(str7);
                if (str8 != null) {
                    sb.append("=");
                    sb.append(str8);
                }
                c = '&';
            }
        }
        return sb.toString();
    }
}
