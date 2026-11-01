package com.tencent.p062mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0626d {

    /* JADX INFO: renamed from: D */
    public static Context f2127D;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.d$a */
    public final class a {

        /* JADX INFO: renamed from: E */
        public static ThreadPoolExecutor f2128E;

        static {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 9, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque());
            f2128E = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static int m2029a(ContentResolver contentResolver, Uri uri) {
        Log.m2022i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.m2024w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e) {
                            Log.m2021e("MicroMsg.SDK.Util", "getFileSize exception: " + e.getMessage());
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                    return iAvailable;
                } catch (IOException e2) {
                    Log.m2021e("MicroMsg.SDK.Util", "getFileSize exception: " + e2.getMessage());
                    return iAvailable;
                }
            } catch (Exception e3) {
                Log.m2024w("MicroMsg.SDK.Util", "getFileSize fail, " + e3.getMessage());
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        Log.m2021e("MicroMsg.SDK.Util", "getFileSize exception: " + e4.getMessage());
                    }
                }
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    Log.m2021e("MicroMsg.SDK.Util", "getFileSize exception: " + e5.getMessage());
                }
            }
            throw th;
        }
        if (0 != 0) {
            inputStream.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2030a(int i) {
        return i == 36 || i == 46;
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m2031b() {
        return a.f2128E;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2032b(int i) {
        return i == 101;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2033b(String str) {
        return str == null || str.length() <= 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m2034c(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int getFileSize(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f2127D != null && str.startsWith("content")) {
            try {
                return m2029a(f2127D.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
