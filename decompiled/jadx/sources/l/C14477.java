package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14477 implements InterfaceC9436 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC9436[] f44360;

    public C14477(InterfaceC9436... interfaceC9436Arr) {
        this.f44360 = interfaceC9436Arr;
    }

    @Override // l.InterfaceC9436
    public final InterfaceC5386 read(byte[] bArr) throws IOException {
        for (int i = 0; i < 4; i++) {
            InterfaceC9436 interfaceC9436 = this.f44360[i];
            if (interfaceC9436.mo8005(bArr)) {
                return (AbstractC7859) interfaceC9436.read(bArr);
            }
        }
        throw new IOException("Unknown packet format received.");
    }

    @Override // l.InterfaceC9436
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8005(byte[] bArr) {
        for (int i = 0; i < 4; i++) {
            if (this.f44360[i].mo8005(bArr)) {
                return true;
            }
        }
        return false;
    }
}
