package p067l;

import android.os.Build;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21609 {

    /* JADX INFO: renamed from: ܽ */
    public static C21609 f68105;

    /* JADX INFO: renamed from: ֫ */
    public C24470 f68106;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC7527 f68107;

    public C21609() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + C12401.m28567().m28568() + "_" + Build.VERSION.RELEASE;
        try {
            this.f68107 = new C23620(str);
        } catch (NoClassDefFoundError unused) {
            C11060.m25469("openSDK_LOG.OpenHttpService", "initClient okHttp fail NoClassDefFoundError");
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th);
        }
        if (this.f68107 == null) {
            this.f68107 = new C3503(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21609 m48810() {
        if (f68105 == null) {
            synchronized (C21609.class) {
                if (f68105 == null) {
                    f68105 = new C21609();
                }
            }
        }
        f68105.m48811();
        return f68105;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48814(C24470 c24470) {
        this.f68106 = c24470;
        m48811();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48811() {
        C24470 c24470 = this.f68106;
        if (c24470 == null) {
            return;
        }
        int iM53971 = c24470.m53971("Common_HttpConnectionTimeout");
        if (iM53971 == 0) {
            iM53971 = 15000;
        }
        int iM53972 = this.f68106.m53971("Common_SocketConnectionTimeout");
        if (iM53972 == 0) {
            iM53972 = 30000;
        }
        long j = iM53971;
        long j2 = iM53972;
        InterfaceC7527 interfaceC7527 = this.f68107;
        if (interfaceC7527 != null) {
            interfaceC7527.mo6284a(j, j2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 m48813(HashMap map, String str) {
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder("");
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    sb.append(C14523.encode(str2, C0233a.f1077D));
                    sb.append("=");
                    sb.append(C14523.encode(str3, C0233a.f1077D));
                    sb.append(C0233a.f1084p);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return this.f68107.mo6285(str, sb.toString());
        }
        return this.f68107.mo6285(str, "");
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6856 m48815(HashMap map, String str) {
        return this.f68107.mo6287(str, map);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 m48812(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return this.f68107.mo6287(str, map);
        }
        return this.f68107.mo6286(str, map, map2);
    }
}
