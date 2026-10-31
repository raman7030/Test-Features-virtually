package l;

import com.alipay.sdk.m.p.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55BL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8964 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f27231;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9670 f27232;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9670 f27233;

    public C8964(String str) {
        C9670 c9670 = new C9670();
        this.f27232 = c9670;
        this.f27233 = c9670;
        this.f27231 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23112(String str, boolean z) {
        m23107(str, String.valueOf(z));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23111(String str, int i) {
        m23107(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23108(long j, String str) {
        m23107(str, String.valueOf(j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f27231);
        sb.append('{');
        C9670 c9670 = this.f27232.f29270;
        String str = "";
        while (c9670 != null) {
            Object obj = c9670.f29271;
            sb.append(str);
            String str2 = c9670.f29269;
            if (str2 != null) {
                sb.append(str2);
                sb.append(a.h);
            }
            if (obj != null && obj.getClass().isArray()) {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c9670 = c9670.f29270;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23109(Object obj) {
        C9670 c9670 = new C9670();
        this.f27233.f29270 = c9670;
        this.f27233 = c9670;
        c9670.f29271 = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23110(Object obj, String str) {
        C9670 c9670 = new C9670();
        this.f27233.f29270 = c9670;
        this.f27233 = c9670;
        c9670.f29271 = obj;
        c9670.f29269 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23107(String str, String str2) {
        C20959 c20959 = new C20959();
        this.f27233.f29270 = c20959;
        this.f27233 = c20959;
        c20959.f29271 = str2;
        c20959.f29269 = str;
    }
}
