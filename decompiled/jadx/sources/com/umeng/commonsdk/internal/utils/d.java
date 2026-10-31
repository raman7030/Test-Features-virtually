package com.umeng.commonsdk.internal.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: 648P */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: compiled from: 648P */
    public class a {
        public String a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f77949l;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[SYNTHETIC] */
    public static a a() throws Throwable {
        a aVar;
        BufferedReader bufferedReader;
        FileReader fileReader;
        Throwable th;
        int i;
        FileReader fileReader2 = null;
        BufferedReader bufferedReader2 = null;
        fileReader2 = null;
        int i2 = 0;
        try {
            try {
                aVar = new a();
                try {
                    fileReader = new FileReader("/proc/cpuinfo");
                    try {
                        bufferedReader = new BufferedReader(fileReader);
                        try {
                            try {
                                int i3 = 0;
                                boolean z = true;
                                i = 0;
                                for (String line = bufferedReader.readLine(); !TextUtils.isEmpty(line) && (i3 = i3 + 1) < 30; line = bufferedReader.readLine()) {
                                    try {
                                        String[] strArrSplit = line.split(":\\s+", 2);
                                        if (z && strArrSplit != null && strArrSplit.length > 1) {
                                            aVar.a = strArrSplit[1];
                                            z = false;
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("processor")) {
                                            i++;
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("Features")) {
                                            aVar.d = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("implementer")) {
                                            aVar.e = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("architecture")) {
                                            aVar.f = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("variant")) {
                                            aVar.g = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("part")) {
                                            aVar.h = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("revision")) {
                                            aVar.i = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("Hardware")) {
                                            aVar.j = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("Revision")) {
                                            aVar.k = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("Serial")) {
                                            aVar.f77949l = strArrSplit[1];
                                        }
                                        if (strArrSplit != null && strArrSplit.length > 1 && strArrSplit[0].contains("implementer")) {
                                            aVar.e = strArrSplit[1];
                                        }
                                    } catch (Exception unused) {
                                        i2 = i;
                                        fileReader2 = fileReader;
                                        if (fileReader2 != null) {
                                            try {
                                                fileReader2.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        i = i2;
                                    }
                                }
                                try {
                                    fileReader.close();
                                } catch (IOException unused4) {
                                }
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused5) {
                                }
                            } catch (Exception unused6) {
                                bufferedReader2 = bufferedReader;
                                bufferedReader = bufferedReader2;
                                fileReader2 = fileReader;
                                if (fileReader2 != null) {
                                    fileReader2.close();
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                i = i2;
                                aVar.c = i;
                                return aVar;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (IOException unused8) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused9) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                        th = th;
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Exception unused10) {
                    bufferedReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileReader = null;
            }
        } catch (Exception unused11) {
            aVar = null;
            bufferedReader = null;
        }
        aVar.c = i;
        return aVar;
    }

    public static String b() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    public static String c() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    public static String d() throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"));
            try {
                String strTrim = bufferedReader2.readLine().trim();
                try {
                    bufferedReader2.close();
                    return strTrim;
                } catch (Throwable unused) {
                    return strTrim;
                }
            } catch (Exception unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                return "";
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
