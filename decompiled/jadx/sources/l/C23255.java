package l;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.alipay.sdk.m.u0.c;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;
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
public final class C23255 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Map f74694 = C20195.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String f74695 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Context f74696;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f74697;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public JSONObject f74698;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f74700 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74699 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23255 m51569(Context context, String str) {
        C23255 c23255;
        Map map = f74694;
        synchronized (map) {
            C9145.m23520("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                f74695 = str;
            }
            if (str == null && (str = f74695) == null) {
                str = "0";
            }
            c23255 = (C23255) map.get(str);
            if (c23255 == null) {
                c23255 = new C23255(context, str);
                map.put(str, c23255);
            }
            C9145.m23520("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return c23255;
    }

    public C23255(Context context, String str) {
        String strConcat;
        InputStream inputStreamOpen;
        this.f74696 = null;
        this.f74697 = null;
        this.f74698 = null;
        Context applicationContext = context.getApplicationContext();
        this.f74696 = applicationContext;
        this.f74697 = str;
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
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName(a.D)));
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
            this.f74698 = new JSONObject(string);
        } catch (JSONException unused5) {
            this.f74698 = new JSONObject();
        }
        m51570();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51570() {
        if (this.f74699 != 0) {
            m51574("update thread is running, return");
            return;
        }
        this.f74699 = 1;
        HashMap map = new HashMap();
        map.put(c.d, this.f74697);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", C12672.f38187.m26539());
        map.put("status_version", Build.VERSION.SDK);
        map.put("sdkv", "3.5.18.lite");
        map.put("sdkp", am.av);
        try {
            C16926.f51987.execute(new RunnableC11967(this, map));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51572(C23255 c23255, JSONObject jSONObject) {
        String strConcat;
        c23255.m51574("cgi back, do update");
        c23255.f74698 = jSONObject;
        String string = jSONObject.toString();
        String str = c23255.f74697;
        if (str != null) {
            try {
                strConcat = "com.tencent.open.config.json.".concat(str);
            } catch (IOException unused) {
            }
        } else {
            strConcat = "com.tencent.open.config.json";
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c23255.f74696.openFileOutput(strConcat, 0), Charset.forName(a.D));
        outputStreamWriter.write(string);
        outputStreamWriter.flush();
        outputStreamWriter.close();
        c23255.f74700 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51573() {
        int iOptInt = this.f74698.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f74700 >= iOptInt * 3600000) {
            m51570();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51575(String str) {
        m51574("get ".concat(str));
        m51573();
        return this.f74698.optInt(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51576(String str) {
        m51574("get ".concat(str));
        m51573();
        Object objOpt = this.f74698.opt(str);
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51574(String str) {
        StringBuilder sbM19190 = C7166.m19190(str, "; appid: ");
        sbM19190.append(this.f74697);
        C9145.m23520("openSDK_LOG.OpenConfig", sbM19190.toString());
    }
}
