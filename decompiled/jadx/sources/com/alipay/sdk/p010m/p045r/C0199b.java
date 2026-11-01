package com.alipay.sdk.p010m.p045r;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p047s.C0201a;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0242e;
import com.alipay.sdk.p010m.p058y.C0243f;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.alipay.sdk.p010m.p058y.C0255r;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p067l.C17588;

/* JADX INFO: renamed from: com.alipay.sdk.m.r.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0199b {

    /* JADX INFO: renamed from: b */
    public C0233a f925b;

    /* JADX INFO: renamed from: a */
    public final String f924a = "LocalWebPayManager";

    /* JADX INFO: renamed from: c */
    public String f926c = null;

    /* JADX INFO: renamed from: d */
    public String f927d = null;

    /* JADX INFO: renamed from: e */
    public String f928e = null;

    /* JADX INFO: renamed from: f */
    public String f929f = null;

    /* JADX INFO: renamed from: g */
    public String f930g = "0";

    /* JADX INFO: renamed from: h */
    public Map f931h = null;

    /* JADX INFO: renamed from: i */
    public C0198a f932i = null;

    /* JADX INFO: renamed from: j */
    public volatile boolean f933j = false;

    /* JADX INFO: renamed from: com.alipay.sdk.m.r.b$b */
    /* JADX INFO: compiled from: N673 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0198a f936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0201a.a f937b;

        public b(C0198a c0198a, C0201a.a aVar) {
            this.f936a = c0198a;
            this.f937b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = C0199b.this.f929f;
            File file = new File(str);
            if (file.exists()) {
                C0242e.m1188b(str);
            }
            file.mkdir();
            C0201a.m976a(this.f936a.m951b(), C0199b.this.f929f + "/downloading.zip", this.f937b);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.r.b$c */
    /* JADX INFO: compiled from: N673 */
    public final class c {

        /* JADX INFO: renamed from: a */
        public static final C0199b f939a = new C0199b();
    }

    /* JADX INFO: renamed from: e */
    public static C0199b m956e() {
        return c.f939a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m963b() {
        File file = new File(this.f926c);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(this.f927d);
            if (!file2.exists()) {
                file2.mkdir();
            }
            return new File(this.f927d).exists() && new File(this.f928e).exists();
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m964c() {
        if (this.f932i == null || this.f933j) {
            return false;
        }
        return TextUtils.equals(this.f932i.m952c(), C0198a.a.f922b) || TextUtils.equals(this.f932i.m952c(), C0198a.a.f923c);
    }

    /* JADX INFO: renamed from: d */
    public void m965d() {
        C0244g.m1201b(C0170a.f659B, "LocalWebPayManager clearData");
        this.f925b = null;
        this.f930g = "0";
        this.f932i = null;
        this.f931h = null;
    }

    /* JADX INFO: renamed from: f */
    public String m966f() {
        C0244g.m1203d("LocalWebPayManager", "getLocalConfigVersion=" + this.f930g);
        return this.f930g;
    }

    /* JADX INFO: renamed from: g */
    public final void m967g() {
        JSONObject jSONObjectM1190d = C0242e.m1190d(this.f928e);
        C0244g.m1201b(C0170a.f659B, "readContentFromConfigJson jsonConfigJson=" + jSONObjectM1190d);
        if (jSONObjectM1190d != null) {
            try {
                String string = jSONObjectM1190d.getString("version");
                JSONObject jSONObject = jSONObjectM1190d.getJSONObject("homeHtml");
                JSONObject jSONObject2 = jSONObjectM1190d.getJSONObject("fileList");
                this.f930g = string;
                JSONObject jSONObjectM1192a = C0243f.m1192a(jSONObject, jSONObject2);
                Iterator<String> itKeys = jSONObjectM1192a.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        this.f931h.put(next, jSONObjectM1192a.getString(next));
                    } catch (Throwable th) {
                        C0244g.m1199a(th);
                    }
                }
            } catch (Throwable th2) {
                C0244g.m1202c("LocalWebPayManager", "readContentFromConfigJson fileContent error");
                C0244g.m1199a(th2);
                C0167a.m751a(this.f925b, C0168b.f618l, "LocalWebPayManager.readContentFromConfigJsonError", th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.r.b$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements C0201a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0198a f934a;

        public a(C0198a c0198a) {
            this.f934a = c0198a;
        }

        @Override // com.alipay.sdk.p010m.p047s.C0201a.a
        /* JADX INFO: renamed from: a */
        public void mo968a(File file) {
            C0244g.m1203d("LocalWebPayManager", "checkAndUpdateLocalData downloadListener onSuccess");
            C0199b.this.m962b(this.f934a);
            C0199b.this.f933j = false;
        }

        @Override // com.alipay.sdk.p010m.p047s.C0201a.a
        /* JADX INFO: renamed from: a */
        public void mo969a(Throwable th) {
            C0244g.m1199a(th);
            C0199b.this.f933j = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m960a(C0233a c0233a) {
        if (this.f925b != null) {
            C0244g.m1202c(C0170a.f659B, "LocalWebPayManager.init mBizContext not null");
            C0167a.m755b(c0233a, C0168b.f618l, "LocalWebPayManager.init", "mBizContext not null");
            m965d();
        }
        this.f925b = c0233a;
        String absolutePath = c0233a.m1101b().getFilesDir().getAbsolutePath();
        this.f926c = C17588.m40053(absolutePath, "/localWebPay");
        this.f927d = C17588.m40053(absolutePath, "/localWebPay/localWebFiles");
        this.f928e = C17588.m40053(absolutePath, "/localWebPay/localWebFiles/sdkConfig.json");
        this.f929f = C17588.m40053(absolutePath, "/localWebPay/localWebPayDownloadingFiles");
        this.f931h = new HashMap();
        boolean zM963b = m963b();
        C0244g.m1201b(C0170a.f659B, "LocalWebPayManager init checkConfigFile=" + zM963b);
        if (zM963b) {
            m967g();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m962b(C0198a c0198a) {
        if (c0198a == null) {
            return;
        }
        C0244g.m1204e("LocalWebPayManager", "unzipAndCheckSHA256 dataSHA256:" + c0198a.m950a());
        try {
            File[] fileArrListFiles = new File(this.f929f).listFiles();
            File file = null;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].getName().endsWith(".zip")) {
                    file = fileArrListFiles[i];
                }
            }
            String strM1258a = C0254q.m1258a(file);
            C0244g.m1204e("LocalWebPayManager", "unzipAndCheckSHA256 fileSha256:" + strM1258a);
            if (TextUtils.equals(strM1258a, c0198a.m950a())) {
                C0244g.m1204e("LocalWebPayManager", "unzipAndCheckSHA256 unzip");
                C0255r.m1305a(file.getAbsolutePath(), this.f929f);
                File file2 = new File(this.f927d);
                File file3 = new File(this.f929f);
                if (file2.exists()) {
                    C0242e.m1188b(this.f927d);
                }
                C0244g.m1204e("LocalWebPayManager", "unzipAndCheckSHA256 resultReNameTo:" + file3.renameTo(file2));
            }
        } catch (Throwable th) {
            C0244g.m1199a(th);
            C0167a.m751a(this.f925b, C0168b.f618l, "LocalWebPayManager.unzipAndCheckSHA256Error", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m959a(C0198a c0198a) {
        C0244g.m1203d("LocalWebPayManager", "h5LocalData :" + c0198a);
        this.f932i = c0198a;
    }

    /* JADX INFO: renamed from: a */
    public void m958a() {
        C0244g.m1203d("LocalWebPayManager", "checkAndUpdateLocalData isDownloading=" + this.f933j);
        C0198a c0198a = this.f932i;
        if (c0198a != null && !this.f933j && ((TextUtils.equals(c0198a.m952c(), C0198a.a.f921a) || TextUtils.equals(c0198a.m952c(), C0198a.a.f922b)) && !TextUtils.isEmpty(c0198a.m951b()))) {
            this.f933j = true;
            new Thread(new b(c0198a, new a(c0198a))).start();
        } else {
            C0244g.m1203d("LocalWebPayManager", "checkAndUpdateLocalData return");
        }
    }

    /* JADX INFO: renamed from: b */
    public String m961b(String str) {
        String str2;
        if (m964c()) {
            String strM957a = m957a(str);
            if (TextUtils.isEmpty((String) this.f931h.get(strM957a))) {
                C0244g.m1204e("LocalWebPayManager", "getLocalFilePath get null, url：" + str);
                str2 = "";
            } else {
                str2 = this.f927d + "/" + ((String) this.f931h.get(strM957a));
            }
        } else {
            str2 = "";
        }
        C0244g.m1201b("LocalWebPayManager", "getLocalFilePath result:" + str2);
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m957a(String str) {
        int iIndexOf;
        return (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(63)) == -1) ? str : str.substring(0, iIndexOf);
    }
}
