package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55BL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10888 {

    /* JADX INFO: renamed from: ֫ */
    public final String f30165;

    /* JADX INFO: renamed from: ۧ */
    public final C11559 f30166;

    /* JADX INFO: renamed from: ܽ */
    public C11559 f30167;

    public C10888(String str) {
        C11559 c11559 = new C11559();
        this.f30166 = c11559;
        this.f30167 = c11559;
        this.f30165 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25086(String str, boolean z) {
        m25081(str, String.valueOf(z));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25085(String str, int i) {
        m25081(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25082(long j, String str) {
        m25081(str, String.valueOf(j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f30165);
        sb.append('{');
        C11559 c11559 = this.f30166.f32219;
        String str = "";
        while (c11559 != null) {
            Object obj = c11559.f32220;
            sb.append(str);
            String str2 = c11559.f32218;
            if (str2 != null) {
                sb.append(str2);
                sb.append(C0184a.f880h);
            }
            if (obj != null && obj.getClass().isArray()) {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c11559 = c11559.f32219;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25083(Object obj) {
        C11559 c11559 = new C11559();
        this.f30167.f32219 = c11559;
        this.f30167 = c11559;
        c11559.f32220 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25084(Object obj, String str) {
        C11559 c11559 = new C11559();
        this.f30167.f32219 = c11559;
        this.f30167 = c11559;
        c11559.f32220 = obj;
        c11559.f32218 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25081(String str, String str2) {
        C22288 c22288 = new C22288();
        this.f30167.f32219 = c22288;
        this.f30167 = c22288;
        c22288.f32220 = str2;
        c22288.f32218 = str;
    }
}
