package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.e */
/* JADX INFO: compiled from: F48I */
/* JADX INFO: loaded from: classes.dex */
public class C0780e {

    /* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.e$a */
    /* JADX INFO: compiled from: F48I */
    public enum a {
        check_su_binary(new String[]{"/system/xbin/which", "su"});


        /* JADX INFO: renamed from: b */
        public String[] f3292b;

        a(String[] strArr) {
            this.f3292b = strArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public ArrayList m2857a(a aVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                Process processExec = Runtime.getRuntime().exec(aVar.f3292b);
                new BufferedWriter(new OutputStreamWriter(processExec.getOutputStream()));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                return null;
            }
        }
        return arrayList;
    }
}
