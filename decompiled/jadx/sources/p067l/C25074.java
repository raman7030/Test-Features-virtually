package p067l;

/* JADX INFO: renamed from: l.᩻ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NA1Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C25074 extends AbstractC19039 {

    /* JADX INFO: renamed from: ᩳۧ */
    public final byte[] f80001;

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10509(byte[] bArr) {
        return 0;
    }

    public C25074(InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341);
        this.f80001 = bArr;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10508(int i, int i2, byte[] bArr) throws C19258 {
        byte[] bArr2 = this.f80001;
        if (i2 > bArr2.length) {
            throw new C19258("Payload exceeds buffer size");
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return i2;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final int m55046() {
        return this.f56760;
    }

    @Override // p067l.AbstractC19039, p067l.AbstractC13224
    public final String toString() {
        return new String(C10965.m25286(new StringBuilder("TransCallNamedPipeResponse["), super.toString(), "]"));
    }
}
