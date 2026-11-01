package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9UN */
/* JADX INFO: loaded from: classes4.dex */
public final class C11251 extends AbstractC13224 implements InterfaceC8529 {

    /* JADX INFO: renamed from: ֡֫ */
    public String[] f31337;

    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean f31338;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        return 0;
    }

    public C11251(InterfaceC3341 interfaceC3341, boolean z) {
        super(interfaceC3341, (byte) 114);
        this.f31338 = z;
        C15410 c15410 = (C15410) interfaceC3341;
        m30255(c15410.m35130());
        if (c15410.m35095().m50997()) {
            this.f31337 = new String[]{"SMB 2.???", "SMB 2.002"};
        } else if (c15410.m35086().m50997()) {
            this.f31337 = new String[]{"NT LM 0.12", "SMB 2.???", "SMB 2.002"};
        } else {
            this.f31337 = new String[]{"NT LM 0.12"};
        }
    }

    @Override // p067l.InterfaceC8529
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo16060() {
        return this.f31338;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : this.f31337) {
            byteArrayOutputStream.write(2);
            try {
                byteArrayOutputStream.write(C11843.m27144(str));
                byteArrayOutputStream.write(0);
            } catch (IOException e) {
                throw new C14740(e);
            }
        }
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, byteArrayOutputStream.size());
        return byteArrayOutputStream.size();
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiate[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        return new String(C5410.m11876(this.f37153, ",dialects=NT LM 0.12]", sb));
    }
}
