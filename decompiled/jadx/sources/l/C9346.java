package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9UN */
/* JADX INFO: loaded from: classes4.dex */
public final class C9346 extends AbstractC11422 implements InterfaceC6482 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public String[] f28388;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final boolean f28389;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C9346(InterfaceC1023 interfaceC1023, boolean z) {
        super(interfaceC1023, (byte) 114);
        this.f28389 = z;
        C13722 c13722 = (C13722) interfaceC1023;
        m28211(c13722.m33016());
        if (c13722.m32981().m48660()) {
            this.f28388 = new String[]{"SMB 2.???", "SMB 2.002"};
        } else if (c13722.m32972().m48660()) {
            this.f28388 = new String[]{"NT LM 0.12", "SMB 2.???", "SMB 2.002"};
        } else {
            this.f28388 = new String[]{"NT LM 0.12"};
        }
    }

    @Override // l.InterfaceC6482
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo14179() {
        return this.f28389;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : this.f28388) {
            byteArrayOutputStream.write(2);
            try {
                byteArrayOutputStream.write(C9969.m25127(str));
                byteArrayOutputStream.write(0);
            } catch (IOException e) {
                throw new C13017(e);
            }
        }
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, byteArrayOutputStream.size());
        return byteArrayOutputStream.size();
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiate[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        return new String(C3200.m9831(this.f34157, ",dialects=NT LM 0.12]", sb));
    }
}
