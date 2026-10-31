package l;

import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20200 extends AbstractC3952 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f65358;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f65359;

    public C20200(C12918 c12918, int i) {
        this.f65358 = c12918;
        this.f65359 = i;
    }

    @Override // l.InterfaceC0531
    /* JADX INFO: renamed from: ۘ */
    public final List mo2257() {
        C12918 c12918 = this.f65358;
        int iMo11935 = c12918.m31418().mo11935(c12918.m31399(this.f65359) + 8);
        if (iMo11935 > 0) {
            return new C22316(this, iMo11935 + 4, c12918.m31418().mo11935(iMo11935));
        }
        return AbstractC14545.of();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46436(Writer writer) {
        C12918 c12918 = this.f65358;
        int iMo11935 = c12918.m31418().mo11935(c12918.m31399(this.f65359) + 8);
        if (iMo11935 > 0) {
            int iMo11936 = c12918.m31418().mo11935(iMo11935);
            int i = iMo11935 + 4;
            for (int i2 = 0; i2 < iMo11936; i2++) {
                c12918.m31386(writer, c12918.m31418().m11936((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC0531
    /* JADX INFO: renamed from: ᩳ */
    public final String mo2258() {
        C12918 c12918 = this.f65358;
        return c12918.m31401(c12918.m31418().mo11935(c12918.m31399(this.f65359) + 4));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46437(Writer writer) {
        C12918 c12918 = this.f65358;
        c12918.m31386(writer, c12918.m31418().mo11935(c12918.m31399(this.f65359) + 4));
    }

    @Override // l.AbstractC19475, l.InterfaceC8293
    /* JADX INFO: renamed from: ܿ */
    public final void mo10018() throws C1237 {
        int i = this.f65359;
        if (i < 0 || i >= this.f65358.m31400()) {
            throw new C1237("proto@" + i);
        }
    }
}
