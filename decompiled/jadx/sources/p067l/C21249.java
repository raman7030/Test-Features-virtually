package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩶֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C21249 {

    /* JADX INFO: renamed from: ܽ */
    public String f66788;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f66787 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f66786 = new HashMap();

    public C21249(String str) {
        this.f66788 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m48007() {
        return this.f66788;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48000() {
        this.f66786.clear();
        this.f66787.clear();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m48003(String str) {
        return this.f66786.containsKey(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5155 m47999(String str) {
        return (C5155) this.f66786.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48001(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        HashMap map = this.f66786;
        C5155 c5155 = (C5155) map.get(str);
        if (c5155 != null) {
            c5155.f12127 = str2;
            return;
        }
        C5155 c5156 = new C5155();
        c5156.f12128 = str;
        c5156.f12127 = str2;
        this.f66787.add(c5156);
        map.put(str, c5156);
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m48005() {
        return C21562.unmodifiableList(this.f66787);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 m48002() {
        return C4069.m8152(this.f66788);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m48004() throws IOException {
        AbstractC17043 abstractC17043M8152 = C4069.m8152(this.f66788);
        StringBuilder sb = new StringBuilder(1024);
        for (C5155 c5155 : this.f66787) {
            String str = c5155.f12128;
            String str2 = c5155.f12127;
            if (str != null && str2 != null && !str.equals(str2)) {
                sb.append("{\r\n  \"");
                sb.append(C10775.m24817(str));
                sb.append("\"\r\n  \"");
                sb.append(C10775.m24817(str2));
                sb.append("\"\r\n}\r\n");
            }
        }
        abstractC17043M8152.m38655(new C11010(sb.toString()));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m48006() throws Throwable {
        m48000();
        C10775 c10775 = null;
        try {
            C10775 c10776 = new C10775(C4069.m8152(this.f66788).m38647());
            while (true) {
                try {
                    String strM24822 = c10776.m24822();
                    if (strM24822.length() == 0) {
                        return;
                    }
                    C10775.m24816(strM24822);
                    c10776.m24821("\"");
                    String strM24823 = c10776.m24823();
                    c10776.m24821("\"");
                    String strM24824 = c10776.m24823();
                    c10776.m24821(C0249l.f1198d);
                    m48001(strM24823, strM24824);
                } catch (Throwable th) {
                    th = th;
                    c10775 = c10776;
                    if (c10775 != null) {
                        throw new C6496(th.getMessage(), c10775.m24820());
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47998(CharSequence charSequence) throws C6496 {
        if (charSequence instanceof InterfaceC21800) {
            C9729 c9729Mo28589 = ((InterfaceC21800) charSequence).mo28589();
            try {
                m47998(c9729Mo28589);
                c9729Mo28589.close();
                return;
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C10775 c10775 = new C10775(charSequence);
        while (true) {
            try {
                String strM24822 = c10775.m24822();
                if (strM24822.length() == 0) {
                    return;
                }
                C10775.m24816(strM24822);
                c10775.m24821("\"");
                c10775.m24823();
                c10775.m24821("\"");
                c10775.m24823();
                c10775.m24821(C0249l.f1198d);
            } catch (Throwable th3) {
                throw new C6496(th3.getMessage(), c10775.m24820());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21249.class != obj.getClass()) {
            return false;
        }
        return this.f66788.equals(((C21249) obj).f66788);
    }

    public final int hashCode() {
        return C12826.hash(this.f66788);
    }
}
