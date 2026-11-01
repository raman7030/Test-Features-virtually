package p067l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10771 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C17631 f29844;

    /* JADX INFO: renamed from: ۙ */
    public final long f29845;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C19644 f29846;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f29847;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC20315 f29848;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC20315 f29849;

    public C10771(C19644 c19644, InterfaceC20315 interfaceC20315, InterfaceC20315 interfaceC20316, C17631 c17631, boolean z, long j) {
        this.f29846 = c19644;
        this.f29849 = interfaceC20315;
        this.f29848 = interfaceC20316;
        this.f29844 = c17631;
        this.f29847 = z;
        this.f29845 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m24813() {
        return this.f29844.m40153();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24814(DataOutputStream dataOutputStream) {
        C17631 c17631 = this.f29844;
        c17631.m40157();
        C19644.m44580(dataOutputStream, this.f29849, c17631, this.f29847);
        c17631.m40157();
        C19644.m44588(this.f29846, this);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f29844.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f29848.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }
}
