package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class JsonUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final AwsJsonFactory f2027 = new GsonFactory();

    /* JADX INFO: renamed from: ֫ */
    public static Map m1976(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        StringReader stringReader = new StringReader(str);
        ((GsonFactory) f2027).getClass();
        GsonFactory.GsonReader gsonReader = new GsonFactory.GsonReader(stringReader);
        try {
            if (gsonReader.m1968() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            gsonReader.m1967();
            while (gsonReader.m1973()) {
                String strM1970 = gsonReader.m1970();
                if (gsonReader.m1972()) {
                    gsonReader.m1974();
                } else {
                    map.put(strM1970, gsonReader.m1975());
                }
            }
            gsonReader.m1971();
            gsonReader.m1969();
            return C21562.unmodifiableMap(map);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse JSON String.", e);
        }
    }
}
