package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C16312 implements InterfaceC25030 {

    /* JADX INFO: renamed from: ֫ */
    public final C24618 f47936;

    public C16312(C24618 c24618) {
        this.f47936 = c24618;
    }

    @Override // p067l.InterfaceC25030
    /* JADX INFO: renamed from: ۧ */
    public final int mo37110(int i) throws IOException {
        long j = i;
        C24618 c24618 = this.f47936;
        c24618.seek(j);
        int i2 = c24618.read();
        if (i2 >= 0) {
            return i2 & 255;
        }
        throw new IOException("Unexpected end of string data");
    }

    @Override // p067l.InterfaceC25030
    /* JADX INFO: renamed from: ֫ */
    public final int mo37109(int i) {
        long j = i;
        C24618 c24618 = this.f47936;
        c24618.seek(j);
        return c24618.mo23137();
    }
}
