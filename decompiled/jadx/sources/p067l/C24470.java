package p067l;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.alipay.sdk.p010m.p052u0.C0227c;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.umeng.analytics.pro.C0655am;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩺᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C24470 {

    /* JADX INFO: renamed from: ܳ */
    public static Map f77437 = C21562.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ᩻ */
    public static String f77438 = null;

    /* JADX INFO: renamed from: ֫ */
    public Context f77439;

    /* JADX INFO: renamed from: ۧ */
    public String f77440;

    /* JADX INFO: renamed from: ܽ */
    public JSONObject f77441;

    /* JADX INFO: renamed from: ᩳ */
    public long f77443 = 0;

    /* JADX INFO: renamed from: ܿ */
    public int f77442 = 0;

    /* JADX INFO: renamed from: ֫ */
    public static C24470 m53965(Context context, String str) {
        C24470 c24470;
        Map map = f77437;
        synchronized (map) {
            C11060.m25471("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                f77438 = str;
            }
            if (str == null && (str = f77438) == null) {
                str = "0";
            }
            c24470 = (C24470) map.get(str);
            if (c24470 == null) {
                c24470 = new C24470(context, str);
                map.put(str, c24470);
            }
            C11060.m25471("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return c24470;
    }

    public C24470(Context context, String str) {
        String strConcat;
        InputStream inputStreamOpen;
        this.f77439 = null;
        this.f77440 = null;
        this.f77441 = null;
        Context applicationContext = context.getApplicationContext();
        this.f77439 = applicationContext;
        this.f77440 = str;
        String string = "";
        try {
            if (str != null) {
                try {
                    strConcat = "com.tencent.open.config.json.".concat(str);
                } catch (FileNotFoundException unused) {
                    inputStreamOpen = applicationContext.getAssets().open("com.tencent.open.config.json");
                }
            } else {
                strConcat = "com.tencent.open.config.json";
            }
            inputStreamOpen = applicationContext.openFileInput(strConcat);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName(C0233a.f1077D)));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        stringBuffer.append(line);
                    }
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    try {
                        inputStreamOpen.close();
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
            string = stringBuffer.toString();
            inputStreamOpen.close();
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        try {
            this.f77441 = new JSONObject(string);
        } catch (JSONException unused5) {
            this.f77441 = new JSONObject();
        }
        m53966();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53966() {
        if (this.f77442 != 0) {
            m53970("update thread is running, return");
            return;
        }
        this.f77442 = 1;
        HashMap map = new HashMap();
        map.put(C0227c.f1027d, this.f77440);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", C14412.f41214.m28572());
        map.put("status_version", Build.VERSION.SDK);
        map.put("sdkv", "3.5.18.lite");
        map.put("sdkp", C0655am.f2320av);
        try {
            C18455.f55168.execute(new RunnableC13742(this, map));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53968(C24470 c24470, JSONObject jSONObject) {
        String strConcat;
        c24470.m53970("cgi back, do update");
        c24470.f77441 = jSONObject;
        String string = jSONObject.toString();
        String str = c24470.f77440;
        if (str != null) {
            try {
                strConcat = "com.tencent.open.config.json.".concat(str);
            } catch (IOException unused) {
            }
        } else {
            strConcat = "com.tencent.open.config.json";
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c24470.f77439.openFileOutput(strConcat, 0), Charset.forName(C0233a.f1077D));
        outputStreamWriter.write(string);
        outputStreamWriter.flush();
        outputStreamWriter.close();
        c24470.f77443 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53969() {
        int iOptInt = this.f77441.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f77443 >= iOptInt * 3600000) {
            m53966();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53971(String str) {
        m53970("get ".concat(str));
        m53969();
        return this.f77441.optInt(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53972(String str) {
        m53970("get ".concat(str));
        m53969();
        Object objOpt = this.f77441.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof Integer) {
                return !objOpt.equals(0);
            }
            if (objOpt instanceof Boolean) {
                return ((Boolean) objOpt).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m53970(String str) {
        StringBuilder sbM21133 = C9179.m21133(str, "; appid: ");
        sbM21133.append(this.f77440);
        C11060.m25471("openSDK_LOG.OpenConfig", sbM21133.toString());
    }
}
