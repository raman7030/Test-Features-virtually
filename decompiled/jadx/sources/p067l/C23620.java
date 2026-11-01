package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C23620 implements InterfaceC7527 {

    /* JADX INFO: renamed from: ֫ */
    public C18724 f75173;

    public C23620(String str) {
        C22950 c22950 = new C22950(str);
        C19395 c19395 = new C19395();
        c19395.m44146(Arrays.asList(C4818.f10946, C4818.f10944));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c19395.m44145(15000L, timeUnit);
        c19395.m44153(30000L, timeUnit);
        c19395.m44155(30000L, timeUnit);
        c19395.m44149((C9770) null);
        c19395.m44152(c22950);
        this.f75173 = c19395.m44143();
    }

    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: a */
    public final void mo6284a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        if (this.f75173.m42729() == j && this.f75173.m42719() == j2) {
            return;
        }
        C11060.m25469("OkHttpServiceImpl", "setTimeout changed.");
        C19395 c19395M42717 = this.f75173.m42717();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c19395M42717.m44145(j, timeUnit);
        c19395M42717.m44153(j2, timeUnit);
        c19395M42717.m44155(j2, timeUnit);
        this.f75173 = c19395M42717.m44143();
    }

    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 mo6285(String str, String str2) {
        C11060.m25471("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = C17588.m40053(str, "?");
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat(C0233a.f1084p);
            }
            str = C17588.m40053(str, str2);
        }
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26291();
        return new C16913(this.f75173.m42716(c11349.m26284()).execute(), str2.length());
    }

    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 mo6287(String str, Map map) {
        C11060.m25471("OkHttpServiceImpl", "post data");
        C6829 c6829 = new C6829();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c6829.m15644(str2, str3);
                }
            }
        }
        C5488 c5488M15643 = c6829.m15643();
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26287("POST", c5488M15643);
        return new C16913(this.f75173.m42716(c11349.m26284()).execute(), (int) c5488M15643.mo4352());
    }

    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 mo6286(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return mo6287(str, map);
        }
        C11060.m25471("OkHttpServiceImpl", "post data, has byte data");
        C9511 c9511 = new C9511();
        if (map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c9511.m22131(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = (byte[]) map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                c9511.m22132(str4, str4, AbstractC4643.m9818(C15545.m35336("content/unknown"), bArr));
                C11060.m25471("OkHttpServiceImpl", "post byte data.");
            }
        }
        C12690 c12690M22130 = c9511.m22130();
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26287("POST", c12690M22130);
        return new C16913(this.f75173.m42716(c11349.m26284()).execute(), (int) c12690M22130.mo4352());
    }
}
