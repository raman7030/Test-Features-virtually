package com.alipay.sdk.p010m.p058y;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0242e {
    /* JADX INFO: renamed from: a */
    public static WebResourceResponse m1187a(String str) {
        WebResourceResponse webResourceResponse = null;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(m1189c(str));
                    HashMap map = new HashMap();
                    map.put("Access-Control-Allow-Origin", "*");
                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(mimeTypeFromExtension, C0233a.f1077D, fileInputStream);
                    try {
                        webResourceResponse2.setResponseHeaders(map);
                        return webResourceResponse2;
                    } catch (Throwable th) {
                        th = th;
                        webResourceResponse = webResourceResponse2;
                        C0244g.m1199a(th);
                        return webResourceResponse;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return webResourceResponse;
    }

    /* JADX INFO: renamed from: b */
    public static void m1188b(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        m1188b(file2.getAbsolutePath());
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1189c(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m1190d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    String string = sb.toString();
                    C0244g.m1201b(C0170a.f659B, "readFileToJSON result=" + string);
                    return new JSONObject(string);
                }
                sb.append(line);
            }
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return null;
        }
    }
}
