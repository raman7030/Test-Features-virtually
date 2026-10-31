package l;

import android.os.Build;
import com.alipay.sdk.m.w.a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C20245 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20245 f65456;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23255 f65457;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5428 f65458;

    public C20245() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + C10556.m26534().m26535() + "_" + Build.VERSION.RELEASE;
        try {
            this.f65458 = new C22361(str);
        } catch (NoClassDefFoundError unused) {
            C9145.m23518("openSDK_LOG.OpenHttpService", "initClient okHttp fail NoClassDefFoundError");
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th);
        }
        if (this.f65458 == null) {
            this.f65458 = new C1194(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20245 m46489() {
        if (f65456 == null) {
            synchronized (C20245.class) {
                if (f65456 == null) {
                    f65456 = new C20245();
                }
            }
        }
        f65456.m46490();
        return f65456;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46493(C23255 c23255) {
        this.f65457 = c23255;
        m46490();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46490() {
        C23255 c23255 = this.f65457;
        if (c23255 == null) {
            return;
        }
        int iM51575 = c23255.m51575("Common_HttpConnectionTimeout");
        if (iM51575 == 0) {
            iM51575 = 15000;
        }
        int iM51576 = this.f65457.m51575("Common_SocketConnectionTimeout");
        if (iM51576 == 0) {
            iM51576 = 30000;
        }
        long j = iM51575;
        long j2 = iM51576;
        InterfaceC5428 interfaceC5428 = this.f65458;
        if (interfaceC5428 != null) {
            interfaceC5428.a(j, j2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 m46492(HashMap map, String str) {
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder("");
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    sb.append(C12789.encode(str2, a.D));
                    sb.append("=");
                    sb.append(C12789.encode(str3, a.D));
                    sb.append(a.p);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return this.f65458.mo4042(str, sb.toString());
        }
        return this.f65458.mo4042(str, "");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 m46494(HashMap map, String str) {
        return this.f65458.mo4044(str, map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 m46491(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return this.f65458.mo4044(str, map);
        }
        return this.f65458.mo4043(str, map, map2);
    }
}
