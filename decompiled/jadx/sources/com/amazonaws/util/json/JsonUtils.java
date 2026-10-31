package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public class JsonUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AwsJsonFactory f867 = new GsonFactory();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m811(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        StringReader stringReader = new StringReader(str);
        ((GsonFactory) f867).getClass();
        GsonFactory.GsonReader gsonReader = new GsonFactory.GsonReader(stringReader);
        try {
            if (gsonReader.m803() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            gsonReader.m802();
            while (gsonReader.m808()) {
                String strM805 = gsonReader.m805();
                if (gsonReader.m807()) {
                    gsonReader.m809();
                } else {
                    map.put(strM805, gsonReader.m810());
                }
            }
            gsonReader.m806();
            gsonReader.m804();
            return C20195.unmodifiableMap(map);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse JSON String.", e);
        }
    }
}
