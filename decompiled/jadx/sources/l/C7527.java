package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1KT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7527 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f23153;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f23154 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f23155;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f23156;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f23157;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7527 f23158;

    public C7527(C17159 c17159, C7527 c7527) {
        this.f23155 = c17159.m40257();
        this.f23157 = c17159.m40256();
        this.f23158 = c7527;
        m20179(c7527 == null ? 0 : c7527.m20184() + 1);
        m20187(false);
    }

    public C7527(C10810 c10810, C7527 c7527) {
        this.f23155 = c10810.m27027();
        this.f23157 = c10810.m27028();
        this.f23158 = c7527;
        m20179(c7527 == null ? 0 : c7527.m20184() + 1);
        m20187(true);
    }

    public C7527(int i, C7527 c7527) {
        this.f23158 = c7527;
        m20179(c7527 == null ? 0 : c7527.m20184() + 1);
        m20187(true);
        this.f23156 |= 2;
        m20172(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m20189() {
        return (this.f23156 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20187(boolean z) {
        if (z) {
            this.f23156 |= 1;
        } else {
            this.f23156 &= -2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m20188() {
        return (this.f23156 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m20181() {
        return (this.f23156 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20183(boolean z) {
        if (z) {
            this.f23156 |= 4;
        } else {
            this.f23156 &= -5;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m20177() {
        return (this.f23156 & 8) != 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20185(boolean z) {
        if (z) {
            this.f23156 |= 8;
        } else {
            this.f23156 &= -9;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m20182() {
        return (this.f23156 >>> 4) & 3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20170(int i) {
        if ((i & 3) != i) {
            throw new RuntimeException();
        }
        this.f23156 = (i << 4) | (this.f23156 & (-49));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m20184() {
        return (this.f23156 >>> 6) & 255;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20179(int i) {
        if ((i & 255) != i) {
            throw new RuntimeException();
        }
        this.f23156 = (i << 6) | (this.f23156 & (-16321));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m20186() {
        return (this.f23156 >>> 16) & 65535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20172(int i) {
        if ((i & 65535) != i) {
            throw new RuntimeException();
        }
        this.f23156 = (i << 16) | (65535 & this.f23156);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m20176() {
        WeakReference weakReference = this.f23153;
        C5953 c5953 = weakReference == null ? null : (C5953) weakReference.get();
        if (c5953 != null) {
            c5953.m16679(m20182());
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m20175() {
        if (m20189()) {
            return m20182() == 2;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20171() {
        m20170(0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20178() {
        m20170(2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20180(boolean z) {
        if (z == m20175()) {
            return;
        }
        m20170(z ? 2 : 0);
        C7527 c7527 = this.f23158;
        if (c7527 != null) {
            c7527.m20174(true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20174(boolean z) {
        C7527 c7527;
        if (m20189()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f23154;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iM20182 = ((C7527) it.next()).m20182();
            if (iM20182 == 1) {
                i = -1;
                break;
            } else if (iM20182 == 2) {
                i++;
            }
        }
        if (i > 0 && i == arrayList.size()) {
            m20170(2);
        } else if (i == 0) {
            m20170(0);
        } else {
            m20170(1);
        }
        WeakReference weakReference = this.f23153;
        C5953 c5953 = weakReference == null ? null : (C5953) weakReference.get();
        if (c5953 != null) {
            c5953.m16679(m20182());
        }
        if (!z || (c7527 = this.f23158) == null) {
            return;
        }
        c7527.m20174(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20173(C5953 c5953) {
        C7527 c7527 = (C7527) c5953.getTag();
        if (c7527 != null) {
            WeakReference weakReference = c7527.f23153;
            if ((weakReference == null ? null : (C5953) weakReference.get()) == c5953) {
                c7527.f23153 = null;
            }
        }
        c5953.m16679(m20182());
        this.f23153 = new WeakReference(c5953);
        c5953.setTag(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7527.class == obj.getClass()) {
            C7527 c7527 = (C7527) obj;
            if (C11003.equals(this.f23157, c7527.f23157) && m20189() == c7527.m20189() && m20188() == c7527.m20188()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23157.hashCode() * 31) + (this.f23156 & 3);
    }
}
