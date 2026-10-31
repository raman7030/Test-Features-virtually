package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ܶܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4IO */
/* JADX INFO: loaded from: classes5.dex */
public final class C15259 extends AbstractC15945 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f46831;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f46832;

    public C15259(C12918 c12918, int i) {
        this.f46831 = c12918;
        this.f46832 = i;
    }

    @Override // l.InterfaceC18877
    /* JADX INFO: renamed from: ܳ */
    public final String mo8192() {
        C12918 c12918 = this.f46831;
        return c12918.m31401(c12918.m31418().m11936(c12918.m31404(this.f46832)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36270(Writer writer) {
        C12918 c12918 = this.f46831;
        c12918.m31386(writer, c12918.m31418().m11936(c12918.m31404(this.f46832)));
    }

    @Override // l.InterfaceC18877
    public final String getName() {
        C12918 c12918 = this.f46831;
        return c12918.m31422(c12918.m31418().mo11935(c12918.m31404(this.f46832) + 4));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36271(Writer writer) {
        C12918 c12918 = this.f46831;
        c12918.m31406(c12918.m31418().mo11935(c12918.m31404(this.f46832) + 4), writer, false);
    }

    @Override // l.InterfaceC18877
    public final String getType() {
        C12918 c12918 = this.f46831;
        return c12918.m31401(c12918.m31418().m11936(c12918.m31404(this.f46832) + 2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36272(Writer writer) {
        C12918 c12918 = this.f46831;
        c12918.m31386(writer, c12918.m31418().m11936(c12918.m31404(this.f46832) + 2));
    }

    @Override // l.AbstractC19475, l.InterfaceC8293
    /* JADX INFO: renamed from: ܿ */
    public final void mo10018() throws C1237 {
        int i = this.f46832;
        if (i < 0 || i >= this.f46831.m31423()) {
            throw new C1237("field@" + i);
        }
    }
}
