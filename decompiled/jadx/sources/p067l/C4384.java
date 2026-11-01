package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩹ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O17J */
/* JADX INFO: loaded from: classes2.dex */
public final class C4384 extends AbstractC22410 {

    /* JADX INFO: renamed from: ܽ */
    public C19136 f9867;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C13102 f9868;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4384(C13102 c13102, C13102 c13103, InterfaceC8998 interfaceC8998) {
        super(c13103, interfaceC8998);
        this.f9868 = c13102;
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ۧ */
    public final int mo9137() {
        C21089 c21089Mo29998 = this.f9868.mo29998();
        try {
            this.f9867 = c21089Mo29998.m47663(this.f70689.mo25505());
            return this.f9867.m43537();
        } finally {
            c21089Mo29998.f66255 = 0L;
        }
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final void mo9135(int i) {
        C21089 c21089Mo29998 = null;
        try {
            c21089Mo29998 = this.f9868.mo29998();
            c21089Mo29998.m47653(this.f70689.mo25505(), i, false, false);
            this.f9868.mo29991();
            c21089Mo29998.f66255 = 0L;
        } catch (IOException unused) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final long mo9134() {
        C19136 c19136 = this.f9867;
        if (c19136 == null) {
            return -1L;
        }
        return ((long) c19136.m43529()) | (((long) this.f9867.m43527()) << 32);
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final void mo9136(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        C21089 c21089Mo29998 = null;
        try {
            c21089Mo29998 = this.f9868.mo29998();
            c21089Mo29998.m47652(this.f70689.mo25505(), i, i2, false, false);
            this.f9868.mo29991();
            c21089Mo29998.f66255 = 0L;
        } catch (IOException unused) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }
}
