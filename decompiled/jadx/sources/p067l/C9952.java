package p067l;

import java.io.Writer;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9952 extends AbstractC7465 implements InterfaceC10509 {

    /* JADX INFO: renamed from: ۙ */
    public final int f27554;

    /* JADX INFO: renamed from: ۛ */
    public final int f27555;

    /* JADX INFO: renamed from: ۨ */
    public final int f27557;

    /* JADX INFO: renamed from: ۫ */
    public final int f27558;

    /* JADX INFO: renamed from: ۬ */
    public final C3246 f27559;

    /* JADX INFO: renamed from: ᩶ */
    public final C14645 f27561;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC12674 f27562;

    /* JADX INFO: renamed from: ᩹ */
    public final int f27563;

    /* JADX INFO: renamed from: ᩺ */
    public final int f27564;

    /* JADX INFO: renamed from: ۤ */
    public int f27556 = 0;

    /* JADX INFO: renamed from: ۗ */
    public int f27553 = 0;

    /* JADX INFO: renamed from: ܰ */
    public int f27560 = 0;

    public C9952(C14645 c14645, int i, int i2) {
        this.f27561 = c14645;
        this.f27563 = i;
        int iMo13855 = c14645.m33504().mo13855(i + 24);
        if (iMo13855 == 0) {
            this.f27557 = -1;
            this.f27555 = 0;
            this.f27558 = 0;
            this.f27554 = 0;
            this.f27564 = 0;
        } else {
            C20168 c20168M13859 = c14645.m33504().m13859(iMo13855);
            this.f27555 = c20168M13859.m45635();
            this.f27558 = c20168M13859.m45635();
            this.f27554 = c20168M13859.m45635();
            this.f27564 = c20168M13859.m45635();
            this.f27557 = c20168M13859.m45631();
            c20168M13859.m45626();
        }
        if (i2 != 0) {
            this.f27559 = new C3246(this, i2);
        } else {
            this.f27559 = null;
        }
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        C14645 c14645 = this.f27561;
        return c14645.m33487(c14645.m33504().mo13855(this.f27563));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23261(Writer writer) {
        C14645 c14645 = this.f27561;
        c14645.m33472(writer, c14645.m33504().mo13855(this.f27563));
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۜܽ */
    public final String mo5034() {
        C14645 c14645 = this.f27561;
        int iM13858 = c14645.m33504().m13858(this.f27563 + 8);
        if (iM13858 == -1) {
            return null;
        }
        return c14645.m33487(iM13858);
    }

    /* JADX INFO: renamed from: ᩸ */
    public final int m23269() {
        return this.f27561.m33504().m13858(this.f27563 + 8);
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܽ */
    public final int mo5039() {
        return this.f27561.m33504().mo13855(this.f27563 + 4);
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۜ */
    public final String mo5033() {
        C14645 c14645 = this.f27561;
        return c14645.m33510(c14645.m33504().m13858(this.f27563 + 16));
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m23264() {
        return this.f27561.m33504().m13858(this.f27563 + 16);
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܳ֫ */
    public final List mo5038() {
        C14645 c14645 = this.f27561;
        int iMo13855 = c14645.m33504().mo13855(this.f27563 + 12);
        if (iMo13855 > 0) {
            return new C15986(this, iMo13855, c14645.m33504().mo13855(iMo13855));
        }
        return AbstractC16192.m36872of();
    }

    /* JADX INFO: renamed from: ۚ */
    public final int[] m23263() {
        C14645 c14645 = this.f27561;
        int iMo13855 = c14645.m33504().mo13855(this.f27563 + 12);
        int[] iArr = null;
        if (iMo13855 > 0) {
            int iMo13856 = c14645.m33504().mo13855(iMo13855);
            if (iMo13856 == 0) {
                return null;
            }
            iArr = new int[iMo13856];
            for (int i = 0; i < iMo13856; i++) {
                iArr[i] = c14645.m33504().m13856((i * 2) + iMo13855 + 4);
            }
        }
        return iArr;
    }

    @Override // p067l.InterfaceC10509
    public final Set getAnnotations() {
        return m23258().mo7901();
    }

    @Override // p067l.InterfaceC10509
    public final Iterable getFields() {
        return C10810.m24919(m23267(true), m23268(true));
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۨ֫ */
    public final Iterable mo5036() {
        return m23267(true);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Iterable m23267(boolean z) {
        if (this.f27555 > 0) {
            AbstractC12674 abstractC12674M23258 = m23258();
            int iMo13855 = this.f27561.m33504().mo13855(this.f27563 + 28);
            C3246 c3246 = this.f27559;
            return new C8611(this, abstractC12674M23258, iMo13855, c3246 == null ? null : C3246.m5657(c3246), z);
        }
        this.f27556 = this.f27557;
        return AbstractC8146.m18915of();
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܰۧ */
    public final Iterable mo5037() {
        return m23268(true);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Iterable m23268(boolean z) {
        if (this.f27558 > 0) {
            AbstractC12674 abstractC12674M23258 = m23258();
            int iM23250 = m23250();
            C3246 c3246 = this.f27559;
            return new C11294(this, abstractC12674M23258, iM23250, c3246 == null ? null : C3246.m5655(c3246), z);
        }
        int i = this.f27556;
        if (i > 0) {
            this.f27553 = i;
        }
        return AbstractC8146.m18915of();
    }

    @Override // p067l.InterfaceC10509
    public final Iterable getMethods() {
        return C10810.m24919(m23266(true), m23265(true));
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۧܽ */
    public final Iterable mo5035() {
        return m23266(true);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m23266(boolean z) {
        if (this.f27554 > 0) {
            AbstractC12674 abstractC12674M23258 = m23258();
            int iM23251 = m23251();
            C3246 c3246 = this.f27559;
            return new C17327(this, abstractC12674M23258, iM23251, c3246 == null ? null : C3246.m5652(c3246), z);
        }
        int i = this.f27553;
        if (i > 0) {
            this.f27560 = i;
        }
        return AbstractC8146.m18915of();
    }

    /* JADX INFO: renamed from: ܳ */
    public final Iterable m23265(boolean z) {
        if (this.f27564 > 0) {
            AbstractC12674 abstractC12674M23258 = m23258();
            int i = this.f27560;
            if (i <= 0) {
                C20168 c20168M13859 = this.f27561.m33504().m13859(m23251());
                int i2 = C18155.f54210;
                for (int i3 = 0; i3 < this.f27554; i3++) {
                    c20168M13859.m45621();
                    c20168M13859.m45621();
                    c20168M13859.m45621();
                }
                this.f27560 = c20168M13859.m45631();
                c20168M13859.m45626();
                i = this.f27560;
            }
            int i4 = i;
            C3246 c3246 = this.f27559;
            return new C5929(this, abstractC12674M23258, i4, c3246 == null ? null : C3246.m5659(c3246), z);
        }
        return AbstractC8146.m18915of();
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܿܽ */
    public final Iterable mo5040() {
        return m23265(true);
    }

    /* JADX INFO: renamed from: ᩹ */
    private AbstractC12674 m23258() {
        if (this.f27562 == null) {
            C14645 c14645 = this.f27561;
            this.f27562 = AbstractC12674.m29153(c14645, c14645.m33504().mo13855(this.f27563 + 20));
        }
        return this.f27562;
    }

    /* JADX INFO: renamed from: ۗ */
    private int m23250() {
        int i = this.f27556;
        if (i > 0) {
            return i;
        }
        C20168 c20168M13859 = this.f27561.m33504().m13859(this.f27557);
        for (int i2 = 0; i2 < this.f27555; i2++) {
            c20168M13859.m45621();
            c20168M13859.m45621();
        }
        this.f27556 = c20168M13859.m45631();
        c20168M13859.m45626();
        return this.f27556;
    }

    /* JADX INFO: renamed from: ۙ */
    private int m23251() {
        int i = this.f27553;
        if (i > 0) {
            return i;
        }
        C20168 c20168M13859 = this.f27561.m33504().m13859(m23250());
        for (int i2 = 0; i2 < this.f27558; i2++) {
            c20168M13859.m45621();
            c20168M13859.m45621();
        }
        this.f27553 = c20168M13859.m45631();
        c20168M13859.m45626();
        return this.f27553;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m23260() {
        return this.f27554 + this.f27564;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m23259() {
        return this.f27555 + this.f27558;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23262(C9952 c9952, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (mo5039() == c9952.mo5039() && this.f27555 == c9952.f27555 && this.f27558 == c9952.f27558 && this.f27554 == c9952.f27554 && this.f27564 == c9952.f27564 && getType().equals(c9952.getType()) && C12826.equals(mo5034(), c9952.mo5034())) {
            List listMo5038 = mo5038();
            List listMo5039 = c9952.mo5038();
            if (listMo5038.size() == listMo5039.size()) {
                int size = listMo5038.size();
                for (int i = 0; i < size; i++) {
                    if (listMo5038.get(i).equals(listMo5039.get(i))) {
                    }
                }
                if ((z || C12826.equals(mo5033(), c9952.mo5033())) && C5755.m12839(getAnnotations(), c9952.getAnnotations()) && C5755.m12837(m23267(false), c9952.m23267(false), z5) && C5755.m12837(m23268(false), c9952.m23268(false), z5) && C5755.m12838(m23266(false), c9952.m23266(false), z, z2, z3, z4, z5) && C5755.m12838(m23265(false), c9952.m23265(false), z, z2, z3, z4, z5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
