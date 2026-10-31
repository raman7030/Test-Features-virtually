package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14671 implements InterfaceC23844 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23411 f44826;

    public C14671(C23411 c23411) {
        this.f44826 = c23411;
    }

    @Override // l.InterfaceC23844
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo34963(int i) throws IOException {
        long j = i;
        C23411 c23411 = this.f44826;
        c23411.seek(j);
        int i2 = c23411.read();
        if (i2 >= 0) {
            return i2 & 255;
        }
        throw new IOException("Unexpected end of string data");
    }

    @Override // l.InterfaceC23844
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo34962(int i) {
        long j = i;
        C23411 c23411 = this.f44826;
        c23411.seek(j);
        return c23411.mo21172();
    }
}
