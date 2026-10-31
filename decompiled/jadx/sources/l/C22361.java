package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C22361 implements InterfaceC5428 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17209 f72447;

    public C22361(String str) {
        C21656 c21656 = new C21656(str);
        C17915 c17915 = new C17915();
        c17915.m41897(Arrays.asList(C2577.f8154, C2577.f8152));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c17915.m41896(15000L, timeUnit);
        c17915.m41904(30000L, timeUnit);
        c17915.m41906(30000L, timeUnit);
        c17915.m41900((C7787) null);
        c17915.m41903(c21656);
        this.f72447 = c17915.m41894();
    }

    @Override // l.InterfaceC5428
    public final void a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        if (this.f72447.m40482() == j && this.f72447.m40472() == j2) {
            return;
        }
        C9145.m23518("OkHttpServiceImpl", "setTimeout changed.");
        C17915 c17915M40470 = this.f72447.m40470();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c17915M40470.m41896(j, timeUnit);
        c17915M40470.m41904(j2, timeUnit);
        c17915M40470.m41906(j2, timeUnit);
        this.f72447 = c17915M40470.m41894();
    }

    @Override // l.InterfaceC5428
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4722 mo4042(String str, String str2) {
        C9145.m23520("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = C16014.m37867(str, "?");
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat(a.p);
            }
            str = C16014.m37867(str, str2);
        }
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24281();
        return new C15304(this.f72447.m40469(c9449.m24274()).execute(), str2.length());
    }

    @Override // l.InterfaceC5428
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4722 mo4044(String str, Map map) {
        C9145.m23520("OkHttpServiceImpl", "post data");
        C4693 c4693 = new C4693();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c4693.m13769(str2, str3);
                }
            }
        }
        C3282 c3282M13768 = c4693.m13768();
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("POST", c3282M13768);
        return new C15304(this.f72447.m40469(c9449.m24274()).execute(), (int) c3282M13768.mo1976());
    }

    @Override // l.InterfaceC5428
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4722 mo4043(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return mo4044(str, map);
        }
        C9145.m23520("OkHttpServiceImpl", "post data, has byte data");
        C7515 c7515 = new C7515();
        if (map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c7515.m20155(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = (byte[]) map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                c7515.m20156(str4, str4, AbstractC2393.m7755(C13864.m33217("content/unknown"), bArr));
                C9145.m23520("OkHttpServiceImpl", "post byte data.");
            }
        }
        C10860 c10860M20154 = c7515.m20154();
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("POST", c10860M20154);
        return new C15304(this.f72447.m40469(c9449.m24274()).execute(), (int) c10860M20154.mo1976());
    }
}
