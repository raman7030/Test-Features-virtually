package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩶֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C19866 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f64151;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f64150 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f64149 = new HashMap();

    public C19866(String str) {
        this.f64151 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m45696() {
        return this.f64151;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45689() {
        this.f64149.clear();
        this.f64150.clear();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45692(String str) {
        return this.f64149.containsKey(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2932 m45688(String str) {
        return (C2932) this.f64149.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45690(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        HashMap map = this.f64149;
        C2932 c2932 = (C2932) map.get(str);
        if (c2932 != null) {
            c2932.f9328 = str2;
            return;
        }
        C2932 c2933 = new C2932();
        c2933.f9329 = str;
        c2933.f9328 = str2;
        this.f64150.add(c2933);
        map.put(str, c2933);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m45694() {
        return C20195.unmodifiableList(this.f64150);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m45691() {
        return C1789.m5957(this.f64151);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m45693() throws IOException {
        AbstractC15440 abstractC15440M5957 = C1789.m5957(this.f64151);
        StringBuilder sb = new StringBuilder(1024);
        for (C2932 c2932 : this.f64150) {
            String str = c2932.f9329;
            String str2 = c2932.f9328;
            if (str != null && str2 != null && !str.equals(str2)) {
                sb.append("{\r\n  \"");
                sb.append(C8845.m22847(str));
                sb.append("\"\r\n  \"");
                sb.append(C8845.m22847(str2));
                sb.append("\"\r\n}\r\n");
            }
        }
        abstractC15440M5957.m36497(new C9092(sb.toString()));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m45695() throws Throwable {
        m45689();
        C8845 c8845 = null;
        try {
            C8845 c8846 = new C8845(C1789.m5957(this.f64151).m36489());
            while (true) {
                try {
                    String strM22852 = c8846.m22852();
                    if (strM22852.length() == 0) {
                        return;
                    }
                    C8845.m22846(strM22852);
                    c8846.m22851("\"");
                    String strM22853 = c8846.m22853();
                    c8846.m22851("\"");
                    String strM22854 = c8846.m22853();
                    c8846.m22851(l.d);
                    m45690(strM22853, strM22854);
                } catch (Throwable th) {
                    th = th;
                    c8845 = c8846;
                    if (c8845 != null) {
                        throw new C4343(th.getMessage(), c8845.m22850());
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45687(CharSequence charSequence) throws C4343 {
        if (charSequence instanceof InterfaceC20445) {
            C7744 c7744Mo26556 = ((InterfaceC20445) charSequence).mo26556();
            try {
                m45687(c7744Mo26556);
                c7744Mo26556.close();
                return;
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C8845 c8845 = new C8845(charSequence);
        while (true) {
            try {
                String strM22852 = c8845.m22852();
                if (strM22852.length() == 0) {
                    return;
                }
                C8845.m22846(strM22852);
                c8845.m22851("\"");
                c8845.m22853();
                c8845.m22851("\"");
                c8845.m22853();
                c8845.m22851(l.d);
            } catch (Throwable th3) {
                throw new C4343(th3.getMessage(), c8845.m22850());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19866.class != obj.getClass()) {
            return false;
        }
        return this.f64151.equals(((C19866) obj).f64151);
    }

    public final int hashCode() {
        return C11003.hash(this.f64151);
    }
}
