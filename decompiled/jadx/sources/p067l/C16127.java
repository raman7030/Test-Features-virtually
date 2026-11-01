package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16127 implements InterfaceC11336 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11336[] f47461;

    public C16127(InterfaceC11336... interfaceC11336Arr) {
        this.f47461 = interfaceC11336Arr;
    }

    @Override // p067l.InterfaceC11336
    public final InterfaceC7487 read(byte[] bArr) throws IOException {
        for (int i = 0; i < 4; i++) {
            InterfaceC11336 interfaceC11336 = this.f47461[i];
            if (interfaceC11336.mo10053(bArr)) {
                return (AbstractC9837) interfaceC11336.read(bArr);
            }
        }
        throw new IOException("Unknown packet format received.");
    }

    @Override // p067l.InterfaceC11336
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10053(byte[] bArr) {
        for (int i = 0; i < 4; i++) {
            if (this.f47461[i].mo10053(bArr)) {
                return true;
            }
        }
        return false;
    }
}
