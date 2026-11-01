package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11515 {

    /* JADX INFO: renamed from: ֫ */
    public final C11103 f32119;

    /* JADX INFO: renamed from: ۧ */
    public boolean f32120 = true;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C10844 f32121;

    /* JADX INFO: renamed from: ᩳ */
    public final C19561 f32122;

    public C11515(C19561 c19561, C10844 c10844) {
        this.f32121 = c10844;
        C11103 c11103 = c10844.f30045;
        C12826.requireNonNull(c11103);
        this.f32119 = c11103;
        this.f32122 = c19561;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26564(InterfaceC3693 interfaceC3693) throws IOException {
        C10844 c10844 = this.f32121;
        C24618 c24618Mo23139 = this.f32122.m44473().mo23139();
        try {
            long length = c24618Mo23139.length();
            C15841.m35957(new C14196(c24618Mo23139, 0L, length, false), c10844.m24981(), length, interfaceC3693);
            c10844.m24997();
            c24618Mo23139.close();
            this.f32120 = false;
        } catch (Throwable th) {
            try {
                c24618Mo23139.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m26562() {
        return this.f32119.f30769;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m26563(String str) throws IOException {
        C10844 c10844 = this.f32121;
        if (c10844.f30047 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        boolean z = this.f32120;
        C19561 c19561 = this.f32122;
        if (z) {
            C24618 c24618Mo23139 = c19561.m44473().mo23139();
            try {
                c10844.m24985(new C14196(c24618Mo23139, 0L, c24618Mo23139.length(), false));
                c10844.m24997();
                c24618Mo23139.close();
                this.f32120 = false;
            } catch (Throwable th) {
                try {
                    c24618Mo23139.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C5738 c5738M44470 = c19561.m44470(str);
        C11103 c11103 = new C11103(c5738M44470, c10844.f30044);
        C10844.m24974(c11103);
        c11103.f30777 = c5738M44470.m12777();
        long jM12758 = c5738M44470.m12758();
        C11103 c11104 = this.f32119;
        long j = jM12758 + c11104.f30774;
        c11103.f30769 = j;
        c11103.f30776 = j;
        c11103.f30774 = c5738M44470.m12792() + c11104.f30774;
        c10844.f30039.add(c11103);
        return c11103.f30769 - c11104.f30769;
    }
}
