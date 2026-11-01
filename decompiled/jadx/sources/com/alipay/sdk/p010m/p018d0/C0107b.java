package com.alipay.sdk.p010m.p018d0;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.alipay.sdk.m.d0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0107b {
    /* JADX WARN: Code duplicated, block: B:23:0x0041 A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:11:0x002d, B:23:0x0041), top: B:29:0x0006 }] */
    /* JADX INFO: renamed from: a */
    public static String m573a(String str, String str2) throws Throwable {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists()) {
                    return null;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), C0233a.f1077D));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return sb.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader == null) {
                            throw th;
                        }
                        try {
                            bufferedReader.close();
                            throw th;
                        } catch (Throwable unused2) {
                            throw th;
                        }
                    }
                }
                bufferedReader2.close();
                return sb.toString();
            } catch (Throwable unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        return sb.toString();
    }
}
