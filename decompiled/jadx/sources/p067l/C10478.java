package p067l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10478 extends AbstractC22410 {
    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final long mo9134() {
        return -1L;
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final void mo9136(long j) {
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ۧ */
    public final int mo9137() throws IOException {
        try {
            return Os.lstat(this.f70689.mo25495()).st_mode & 4095;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final void mo9135(int i) {
        try {
            Os.chmod(this.f70689.mo25495(), i);
        } catch (ErrnoException unused) {
        }
    }
}
