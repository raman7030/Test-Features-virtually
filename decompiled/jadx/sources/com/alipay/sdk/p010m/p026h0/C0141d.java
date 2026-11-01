package com.alipay.sdk.p010m.p026h0;

import com.alipay.sdk.p010m.p018d0.C0106a;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.alipay.sdk.m.h0.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0141d {

    /* JADX INFO: renamed from: a */
    public static String f480a = "";

    /* JADX INFO: renamed from: b */
    public static String f481b = "";

    /* JADX INFO: renamed from: c */
    public static String f482c = "";

    /* JADX INFO: renamed from: a */
    public static synchronized void m689a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m692a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m690a(String str, String str2, String str3) {
        f480a = str;
        f481b = str2;
        f482c = str3;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m691a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m693b(th));
        m692a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m692a(List list) {
        if (!C0106a.m564a(f481b) && !C0106a.m564a(f482c)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f482c);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(", " + ((String) it.next()));
            }
            stringBuffer.append("\n");
            try {
                File file = new File(f480a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(f480a, f481b);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                fileWriter.write(stringBuffer.toString());
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m693b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
