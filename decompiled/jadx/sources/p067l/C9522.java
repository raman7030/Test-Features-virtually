package p067l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1KT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9522 {

    /* JADX INFO: renamed from: ֫ */
    public WeakReference f26066;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f26067 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public String f26068;

    /* JADX INFO: renamed from: ܽ */
    public int f26069;

    /* JADX INFO: renamed from: ܿ */
    public String f26070;

    /* JADX INFO: renamed from: ᩳ */
    public C9522 f26071;

    public C9522(C18676 c18676, C9522 c9522) {
        this.f26068 = c18676.m42502();
        this.f26070 = c18676.m42501();
        this.f26071 = c9522;
        m22155(c9522 == null ? 0 : c9522.m22160() + 1);
        m22163(false);
    }

    public C9522(C12642 c12642, C9522 c9522) {
        this.f26068 = c12642.m29072();
        this.f26070 = c12642.m29073();
        this.f26071 = c9522;
        m22155(c9522 == null ? 0 : c9522.m22160() + 1);
        m22163(true);
    }

    public C9522(int i, C9522 c9522) {
        this.f26071 = c9522;
        m22155(c9522 == null ? 0 : c9522.m22160() + 1);
        m22163(true);
        this.f26069 |= 2;
        m22148(i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m22165() {
        return (this.f26069 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22163(boolean z) {
        if (z) {
            this.f26069 |= 1;
        } else {
            this.f26069 &= -2;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m22164() {
        return (this.f26069 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m22157() {
        return (this.f26069 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22159(boolean z) {
        if (z) {
            this.f26069 |= 4;
        } else {
            this.f26069 &= -5;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m22153() {
        return (this.f26069 & 8) != 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m22161(boolean z) {
        if (z) {
            this.f26069 |= 8;
        } else {
            this.f26069 &= -9;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m22158() {
        return (this.f26069 >>> 4) & 3;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22146(int i) {
        if ((i & 3) != i) {
            throw new RuntimeException();
        }
        this.f26069 = (i << 4) | (this.f26069 & (-49));
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m22160() {
        return (this.f26069 >>> 6) & 255;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22155(int i) {
        if ((i & 255) != i) {
            throw new RuntimeException();
        }
        this.f26069 = (i << 6) | (this.f26069 & (-16321));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m22162() {
        return (this.f26069 >>> 16) & 65535;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22148(int i) {
        if ((i & 65535) != i) {
            throw new RuntimeException();
        }
        this.f26069 = (i << 16) | (65535 & this.f26069);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m22152() {
        WeakReference weakReference = this.f26066;
        C8026 c8026 = weakReference == null ? null : (C8026) weakReference.get();
        if (c8026 != null) {
            c8026.m18605(m22158());
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m22151() {
        if (m22165()) {
            return m22158() == 2;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22147() {
        m22146(0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22154() {
        m22146(2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22156(boolean z) {
        if (z == m22151()) {
            return;
        }
        m22146(z ? 2 : 0);
        C9522 c9522 = this.f26071;
        if (c9522 != null) {
            c9522.m22150(true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22150(boolean z) {
        C9522 c9522;
        if (m22165()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f26067;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iM22158 = ((C9522) it.next()).m22158();
            if (iM22158 == 1) {
                i = -1;
                break;
            } else if (iM22158 == 2) {
                i++;
            }
        }
        if (i > 0 && i == arrayList.size()) {
            m22146(2);
        } else if (i == 0) {
            m22146(0);
        } else {
            m22146(1);
        }
        WeakReference weakReference = this.f26066;
        C8026 c8026 = weakReference == null ? null : (C8026) weakReference.get();
        if (c8026 != null) {
            c8026.m18605(m22158());
        }
        if (!z || (c9522 = this.f26071) == null) {
            return;
        }
        c9522.m22150(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22149(C8026 c8026) {
        C9522 c9522 = (C9522) c8026.getTag();
        if (c9522 != null) {
            WeakReference weakReference = c9522.f26066;
            if ((weakReference == null ? null : (C8026) weakReference.get()) == c8026) {
                c9522.f26066 = null;
            }
        }
        c8026.m18605(m22158());
        this.f26066 = new WeakReference(c8026);
        c8026.setTag(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9522.class == obj.getClass()) {
            C9522 c9522 = (C9522) obj;
            if (C12826.equals(this.f26070, c9522.f26070) && m22165() == c9522.m22165() && m22164() == c9522.m22164()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26070.hashCode() * 31) + (this.f26069 & 3);
    }
}
