package l;

import java.io.Writer;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7980 extends AbstractC5363 implements InterfaceC8566 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24641;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f24642;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f24644;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f24645;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0924 f24646;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12918 f24648;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC10844 f24649;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f24650;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f24651;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f24643 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24640 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f24647 = 0;

    public C7980(C12918 c12918, int i, int i2) {
        this.f24648 = c12918;
        this.f24650 = i;
        int iMo11935 = c12918.m31418().mo11935(i + 24);
        if (iMo11935 == 0) {
            this.f24644 = -1;
            this.f24642 = 0;
            this.f24645 = 0;
            this.f24641 = 0;
            this.f24651 = 0;
        } else {
            C18729 c18729M11939 = c12918.m31418().m11939(iMo11935);
            this.f24642 = c18729M11939.m43368();
            this.f24645 = c18729M11939.m43368();
            this.f24641 = c18729M11939.m43368();
            this.f24651 = c18729M11939.m43368();
            this.f24644 = c18729M11939.m43364();
            c18729M11939.m43359();
        }
        if (i2 != 0) {
            this.f24646 = new C0924(this, i2);
        } else {
            this.f24646 = null;
        }
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        C12918 c12918 = this.f24648;
        return c12918.m31401(c12918.m31418().mo11935(this.f24650));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21295(Writer writer) {
        C12918 c12918 = this.f24648;
        c12918.m31386(writer, c12918.m31418().mo11935(this.f24650));
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۜܽ */
    public final String mo2695() {
        C12918 c12918 = this.f24648;
        int iM11938 = c12918.m31418().m11938(this.f24650 + 8);
        if (iM11938 == -1) {
            return null;
        }
        return c12918.m31401(iM11938);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m21303() {
        return this.f24648.m31418().m11938(this.f24650 + 8);
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܽ */
    public final int mo2700() {
        return this.f24648.m31418().mo11935(this.f24650 + 4);
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۜ */
    public final String mo2694() {
        C12918 c12918 = this.f24648;
        return c12918.m31424(c12918.m31418().m11938(this.f24650 + 16));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m21298() {
        return this.f24648.m31418().m11938(this.f24650 + 16);
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܳ֫ */
    public final List mo2699() {
        C12918 c12918 = this.f24648;
        int iMo11935 = c12918.m31418().mo11935(this.f24650 + 12);
        if (iMo11935 > 0) {
            return new C14329(this, iMo11935, c12918.m31418().mo11935(iMo11935));
        }
        return AbstractC14545.of();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] m21297() {
        C12918 c12918 = this.f24648;
        int iMo11935 = c12918.m31418().mo11935(this.f24650 + 12);
        int[] iArr = null;
        if (iMo11935 > 0) {
            int iMo11936 = c12918.m31418().mo11935(iMo11935);
            if (iMo11936 == 0) {
                return null;
            }
            iArr = new int[iMo11936];
            for (int i = 0; i < iMo11936; i++) {
                iArr[i] = c12918.m31418().m11936((i * 2) + iMo11935 + 4);
            }
        }
        return iArr;
    }

    @Override // l.InterfaceC8566
    public final Set getAnnotations() {
        return m21292().mo5671();
    }

    @Override // l.InterfaceC8566
    public final Iterable getFields() {
        return C8882.m22948(m21301(true), m21302(true));
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۨ֫ */
    public final Iterable mo2697() {
        return m21301(true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterable m21301(boolean z) {
        if (this.f24642 > 0) {
            AbstractC10844 abstractC10844M21292 = m21292();
            int iMo11935 = this.f24648.m31418().mo11935(this.f24650 + 28);
            C0924 c0924 = this.f24646;
            return new C6569(this, abstractC10844M21292, iMo11935, c0924 == null ? null : C0924.m3338(c0924), z);
        }
        this.f24643 = this.f24644;
        return AbstractC6079.of();
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܰۧ */
    public final Iterable mo2698() {
        return m21302(true);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Iterable m21302(boolean z) {
        if (this.f24645 > 0) {
            AbstractC10844 abstractC10844M21292 = m21292();
            int iM21284 = m21284();
            C0924 c0924 = this.f24646;
            return new C9392(this, abstractC10844M21292, iM21284, c0924 == null ? null : C0924.m3336(c0924), z);
        }
        int i = this.f24643;
        if (i > 0) {
            this.f24640 = i;
        }
        return AbstractC6079.of();
    }

    @Override // l.InterfaceC8566
    public final Iterable getMethods() {
        return C8882.m22948(m21300(true), m21299(true));
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۧܽ */
    public final Iterable mo2696() {
        return m21300(true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m21300(boolean z) {
        if (this.f24641 > 0) {
            AbstractC10844 abstractC10844M21292 = m21292();
            int iM21285 = m21285();
            C0924 c0924 = this.f24646;
            return new C15740(this, abstractC10844M21292, iM21285, c0924 == null ? null : C0924.m3333(c0924), z);
        }
        int i = this.f24640;
        if (i > 0) {
            this.f24647 = i;
        }
        return AbstractC6079.of();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Iterable m21299(boolean z) {
        if (this.f24651 > 0) {
            AbstractC10844 abstractC10844M21292 = m21292();
            int i = this.f24647;
            if (i <= 0) {
                C18729 c18729M11939 = this.f24648.m31418().m11939(m21285());
                int i2 = C16611.f51033;
                for (int i3 = 0; i3 < this.f24641; i3++) {
                    c18729M11939.m43354();
                    c18729M11939.m43354();
                    c18729M11939.m43354();
                }
                this.f24647 = c18729M11939.m43364();
                c18729M11939.m43359();
                i = this.f24647;
            }
            int i4 = i;
            C0924 c0924 = this.f24646;
            return new C3747(this, abstractC10844M21292, i4, c0924 == null ? null : C0924.m3340(c0924), z);
        }
        return AbstractC6079.of();
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܿܽ */
    public final Iterable mo2701() {
        return m21299(true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private AbstractC10844 m21292() {
        if (this.f24649 == null) {
            C12918 c12918 = this.f24648;
            this.f24649 = AbstractC10844.m27108(c12918, c12918.m31418().mo11935(this.f24650 + 20));
        }
        return this.f24649;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private int m21284() {
        int i = this.f24643;
        if (i > 0) {
            return i;
        }
        C18729 c18729M11939 = this.f24648.m31418().m11939(this.f24644);
        for (int i2 = 0; i2 < this.f24642; i2++) {
            c18729M11939.m43354();
            c18729M11939.m43354();
        }
        this.f24643 = c18729M11939.m43364();
        c18729M11939.m43359();
        return this.f24643;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m21285() {
        int i = this.f24640;
        if (i > 0) {
            return i;
        }
        C18729 c18729M11939 = this.f24648.m31418().m11939(m21284());
        for (int i2 = 0; i2 < this.f24645; i2++) {
            c18729M11939.m43354();
            c18729M11939.m43354();
        }
        this.f24640 = c18729M11939.m43364();
        c18729M11939.m43359();
        return this.f24640;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m21294() {
        return this.f24641 + this.f24651;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m21293() {
        return this.f24642 + this.f24645;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21296(C7980 c7980, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (mo2700() == c7980.mo2700() && this.f24642 == c7980.f24642 && this.f24645 == c7980.f24645 && this.f24641 == c7980.f24641 && this.f24651 == c7980.f24651 && getType().equals(c7980.getType()) && C11003.equals(mo2695(), c7980.mo2695())) {
            List listMo2699 = mo2699();
            List listMo26910 = c7980.mo2699();
            if (listMo2699.size() == listMo26910.size()) {
                int size = listMo2699.size();
                for (int i = 0; i < size; i++) {
                    if (listMo2699.get(i).equals(listMo26910.get(i))) {
                    }
                }
                if ((z || C11003.equals(mo2694(), c7980.mo2694())) && C3563.m10859(getAnnotations(), c7980.getAnnotations()) && C3563.m10857(m21301(false), c7980.m21301(false), z5) && C3563.m10857(m21302(false), c7980.m21302(false), z5) && C3563.m10858(m21300(false), c7980.m21300(false), z, z2, z3, z4, z5) && C3563.m10858(m21299(false), c7980.m21299(false), z, z2, z3, z4, z5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
