package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0667ay;
import com.umeng.analytics.pro.C0674be;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.InterfaceC0817d;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.proto.C0827d;
import com.umeng.commonsdk.statistics.proto.C0828e;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class ImprintHandler implements FileLockCallback {

    /* JADX INFO: renamed from: a */
    public static final String f3390a = "ImprintHandler";

    /* JADX INFO: renamed from: c */
    public static final String f3392c = ".imprint";

    /* JADX INFO: renamed from: k */
    public static Context f3397k = null;

    /* JADX INFO: renamed from: l */
    public static FileLockUtil f3398l = null;

    /* JADX INFO: renamed from: m */
    public static final int f3399m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f3400n = 1;

    /* JADX INFO: renamed from: e */
    public InterfaceC0817d f3403e;

    /* JADX INFO: renamed from: h */
    public C0801a f3404h = new C0801a();

    /* JADX INFO: renamed from: i */
    public C0827d f3405i = null;

    /* JADX INFO: renamed from: b */
    public static Object f3391b = new Object();

    /* JADX INFO: renamed from: d */
    public static final byte[] f3393d = "pbl0".getBytes();

    /* JADX INFO: renamed from: f */
    public static Map f3394f = new HashMap();

    /* JADX INFO: renamed from: g */
    public static Object f3395g = new Object();

    /* JADX INFO: renamed from: j */
    public static ImprintHandler f3396j = null;

    /* JADX INFO: renamed from: o */
    public static Map f3401o = new HashMap();

    /* JADX INFO: renamed from: p */
    public static Object f3402p = new Object();

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        if (f3396j == null) {
            f3396j = new ImprintHandler(context);
            f3398l = new FileLockUtil();
            f3398l.doFileOperateion(new File(f3397k.getFilesDir(), f3392c), f3396j, 0);
        }
        return f3396j;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i) {
        if (i == 0) {
            f3396j.m3042e();
        } else if (i == 1) {
            f3396j.m3035a(file);
        }
        return true;
    }

    public ImprintHandler(Context context) {
        f3397k = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static void m3036a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f3395g) {
            try {
                int i = 0;
                if (f3394f.containsKey(str)) {
                    ArrayList arrayList = (ArrayList) f3394f.get(str);
                    int size = arrayList.size();
                    ULog.m2983i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i < size) {
                        if (uMImprintChangeCallback == arrayList.get(i)) {
                            ULog.m2983i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.m2983i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList2.size();
                    ULog.m2983i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i)) {
                            ULog.m2983i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.m2983i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f3394f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f3397k, th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3038b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        synchronized (f3395g) {
            try {
                if (f3394f.containsKey(str)) {
                    ArrayList arrayList = (ArrayList) f3394f.get(str);
                    if (arrayList.size() > 0) {
                        int size = arrayList.size();
                        ULog.m2983i("--->>> removeCallback: before remove: callbacks size is: " + size);
                        for (int i = 0; i < size; i++) {
                            if (uMImprintChangeCallback == arrayList.get(i)) {
                                ULog.m2983i("--->>> removeCallback: remove index " + i);
                                arrayList.remove(i);
                                break;
                            }
                        }
                        ULog.m2983i("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                        if (arrayList.size() == 0) {
                            ULog.m2983i("--->>> removeCallback: remove key from map: key = " + str);
                            f3394f.remove(str);
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f3397k, th);
            }
        }
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        m3036a(str, uMImprintChangeCallback);
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        m3038b(str, uMImprintChangeCallback);
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (TextUtils.isEmpty(str) || uMImprintPreProcessCallback == null) {
            return;
        }
        synchronized (f3402p) {
            try {
                if (!f3401o.containsKey(str)) {
                    f3401o.put(str, uMImprintPreProcessCallback);
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                } else {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f3397k, th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3045a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f3402p) {
            try {
                if (f3401o.containsKey(str)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f3394f.remove(str);
                } else {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f3397k, th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3044a(InterfaceC0817d interfaceC0817d) {
        this.f3403e = interfaceC0817d;
    }

    /* JADX INFO: renamed from: a */
    public String m3043a(C0827d c0827d) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(c0827d.m3241c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((C0828e) entry.getValue()).m3277d()) {
                sb.append(((C0828e) entry.getValue()).m3273b());
            }
        }
        sb.append(c0827d.f3534b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: c */
    private boolean m3039c(C0827d c0827d) {
        if (!c0827d.m3248i().equals(m3043a(c0827d))) {
            return false;
        }
        for (C0828e c0828e : c0827d.m3241c().values()) {
            String strM3281h = c0828e.m3281h();
            if (!TextUtils.isEmpty(strM3281h)) {
                byte[] bArrReverseHexString = DataHelper.reverseHexString(strM3281h);
                byte[] bArrM3047a = m3047a(c0828e);
                for (int i = 0; i < 4; i++) {
                    if (bArrReverseHexString[i] != bArrM3047a[i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m3047a(C0828e c0828e) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(null);
        byteBufferAllocate.putLong(c0828e.m3278e());
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = f3393d;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (bArrArray[i] ^ bArr[i]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m3046a() {
        try {
            synchronized (this) {
                C0827d c0827d = this.f3405i;
                if (c0827d == null) {
                    return null;
                }
                if (c0827d.m3238b() <= 0) {
                    return null;
                }
                return new C0674be().m2321a(this.f3405i);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f3397k, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private C0827d m3040d(C0827d c0827d) {
        Map mapM3241c = c0827d.m3241c();
        if (mapM3241c.containsKey(C0655am.f2345f)) {
            mapM3241c.remove(C0655am.f2345f);
            this.f3404h.m3055a(C0655am.f2345f);
            c0827d.m3233a(c0827d.m3245f());
            c0827d.m3234a(m3043a(c0827d));
        }
        return c0827d;
    }

    /* JADX INFO: renamed from: b */
    public void m3049b(C0827d c0827d) {
        C0827d c0827dM3034a;
        boolean zM3037a;
        if (c0827d == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m2755d(UMRTLog.RTLOG_TAG, "Imprint is null");
                return;
            }
            return;
        }
        if (!m3039c(c0827d)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
                return;
            }
            return;
        }
        String str = AnalyticsConstants.f3338OS;
        HashMap map = new HashMap();
        synchronized (this) {
            C0827d c0827d2 = this.f3405i;
            C0827d c0827dM3040d = m3040d(c0827d);
            String strM3248i = null;
            String strM3248i2 = c0827d2 == null ? null : c0827d2.m3248i();
            if (c0827d2 == null) {
                c0827dM3034a = m3041e(c0827dM3040d);
            } else {
                c0827dM3034a = m3034a(c0827d2, c0827dM3040d, map);
            }
            this.f3405i = c0827dM3034a;
            if (c0827dM3034a != null) {
                strM3248i = c0827dM3034a.m3248i();
            }
            zM3037a = m3037a(strM3248i2, strM3248i);
        }
        C0827d c0827d3 = this.f3405i;
        if (c0827d3 != null && !zM3037a) {
            this.f3404h.m3054a(c0827d3);
            InterfaceC0817d interfaceC0817d = this.f3403e;
            if (interfaceC0817d != null) {
                interfaceC0817d.onImprintChanged(this.f3404h);
            }
        }
        if (map.size() > 0) {
            synchronized (f3395g) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str2) && f3394f.containsKey(str2)) {
                        ULog.m2983i("--->>> target imprint key is: " + str2 + "; value is: " + str3);
                        ArrayList arrayList = (ArrayList) f3394f.get(str2);
                        if (arrayList != null) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((UMImprintChangeCallback) arrayList.get(i)).onImprintValueChanged(str2, str3);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3037a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* JADX INFO: renamed from: a */
    private C0827d m3034a(C0827d c0827d, C0827d c0827d2, Map map) {
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        ArrayList arrayList;
        if (c0827d2 == null) {
            return c0827d;
        }
        Map mapM3241c = c0827d.m3241c();
        for (Map.Entry entry : c0827d2.m3241c().entrySet()) {
            int i = 0;
            if (((C0828e) entry.getValue()).m3277d()) {
                String str = (String) entry.getKey();
                String str2 = ((C0828e) entry.getValue()).f3552a;
                synchronized (f3402p) {
                    if (!TextUtils.isEmpty(str) && f3401o.containsKey(str) && (uMImprintPreProcessCallback = (UMImprintPreProcessCallback) f3401o.get(str)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2)) {
                        i = 1;
                    }
                }
                if (i == 0) {
                    mapM3241c.put(entry.getKey(), entry.getValue());
                    synchronized (f3395g) {
                        if (!TextUtils.isEmpty(str) && f3394f.containsKey(str) && ((ArrayList) f3394f.get(str)) != null) {
                            map.put(str, str2);
                        }
                    }
                } else {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + str + "] should be ignored.");
                }
            } else {
                String str3 = (String) entry.getKey();
                synchronized (f3395g) {
                    if (!TextUtils.isEmpty(str3) && f3394f.containsKey(str3) && (arrayList = (ArrayList) f3394f.get(str3)) != null) {
                        while (i < arrayList.size()) {
                            ((UMImprintChangeCallback) arrayList.get(i)).onImprintValueChanged(str3, null);
                            i++;
                        }
                    }
                }
                mapM3241c.remove(str3);
                this.f3404h.m3055a(str3);
            }
        }
        c0827d.m3233a(c0827d2.m3245f());
        c0827d.m3234a(m3043a(c0827d));
        return c0827d;
    }

    /* JADX INFO: renamed from: e */
    private C0827d m3041e(C0827d c0827d) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map mapM3241c = c0827d.m3241c();
        ArrayList<String> arrayList3 = new ArrayList(mapM3241c.size() / 2);
        Iterator it = mapM3241c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!((C0828e) entry.getValue()).m3277d()) {
                arrayList3.add(entry.getKey());
            } else {
                String str = (String) entry.getKey();
                String str2 = ((C0828e) entry.getValue()).f3552a;
                synchronized (f3402p) {
                    z = !TextUtils.isEmpty(str) && f3401o.containsKey(str) && (uMImprintPreProcessCallback = (UMImprintPreProcessCallback) f3401o.get(str)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2);
                }
                if (z) {
                    arrayList3.add(str);
                }
                synchronized (f3395g) {
                    if (!TextUtils.isEmpty(str) && f3394f.containsKey(str) && (arrayList2 = (ArrayList) f3394f.get(str)) != null) {
                        for (int i = 0; i < arrayList2.size(); i++) {
                            ((UMImprintChangeCallback) arrayList2.get(i)).onImprintValueChanged(str, str2);
                        }
                    }
                }
            }
        }
        for (String str3 : arrayList3) {
            synchronized (f3395g) {
                if (!TextUtils.isEmpty(str3) && f3394f.containsKey(str3) && (arrayList = (ArrayList) f3394f.get(str3)) != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((UMImprintChangeCallback) arrayList.get(i2)).onImprintValueChanged(str3, null);
                    }
                }
            }
            mapM3241c.remove(str3);
        }
        return c0827d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized C0827d m3048b() {
        return this.f3405i;
    }

    /* JADX INFO: renamed from: c */
    public C0801a m3050c() {
        return this.f3404h;
    }

    /* JADX INFO: renamed from: e */
    private void m3042e() {
        byte[] bArr;
        File file = new File(f3397k.getFilesDir(), f3392c);
        synchronized (f3391b) {
            if (file.exists()) {
                FileInputStream fileInputStream = null;
                byte[] streamToByteArray = null;
                FileInputStream fileInputStream2 = null;
                try {
                    FileInputStream fileInputStreamOpenFileInput = f3397k.openFileInput(f3392c);
                    try {
                        streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStreamOpenFileInput);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStreamOpenFileInput;
                        HelperUtils.safeClose(fileInputStream);
                        throw th;
                    }
                    bArr = streamToByteArray;
                    fileInputStream2 = fileInputStreamOpenFileInput;
                } catch (Exception unused2) {
                    bArr = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                HelperUtils.safeClose(fileInputStream2);
                if (bArr != null) {
                    try {
                        C0827d c0827d = new C0827d();
                        new C0667ay().m2304a(c0827d, bArr);
                        this.f3405i = c0827d;
                        this.f3404h.m3054a(c0827d);
                        this.f3405i = m3040d(this.f3405i);
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3035a(File file) {
        if (this.f3405i == null) {
            return;
        }
        try {
            synchronized (f3391b) {
                byte[] bArrM2321a = new C0674be().m2321a(this.f3405i);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArrM2321a);
                    fileOutputStream.flush();
                    HelperUtils.safeClose(fileOutputStream);
                } catch (Throwable th) {
                    HelperUtils.safeClose(fileOutputStream);
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3051d() {
        if (this.f3405i == null || f3398l == null) {
            return;
        }
        File file = new File(f3397k.getFilesDir(), f3392c);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    UMCrashManager.reportCrash(f3397k, e);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f3398l.doFileOperateion(file, f3396j, 1);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a */
    public class C0801a {

        /* JADX INFO: renamed from: a */
        public Map f3406a = new HashMap();

        /* JADX INFO: renamed from: b */
        private synchronized void m3052b(C0827d c0827d) {
            C0828e c0828e;
            if (c0827d != null) {
                try {
                    if (c0827d.m3244e()) {
                        Map mapM3241c = c0827d.m3241c();
                        for (String str : mapM3241c.keySet()) {
                            if (!TextUtils.isEmpty(str) && (c0828e = (C0828e) mapM3241c.get(str)) != null) {
                                String strM3273b = c0828e.m3273b();
                                if (TextUtils.isEmpty(strM3273b)) {
                                    continue;
                                } else {
                                    this.f3406a.put(str, strM3273b);
                                    String str2 = AnalyticsConstants.f3338OS;
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public C0801a() {
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m3055a(String str) {
            Map map = this.f3406a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f3406a.containsKey(str)) {
                this.f3406a.remove(str);
            }
        }

        public C0801a(C0827d c0827d) {
            m3054a(c0827d);
        }

        /* JADX INFO: renamed from: a */
        public void m3054a(C0827d c0827d) {
            if (c0827d == null) {
                return;
            }
            m3052b(c0827d);
        }

        /* JADX INFO: renamed from: a */
        public synchronized String m3053a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f3406a.size() > 0) {
                String str3 = (String) this.f3406a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }
    }
}
