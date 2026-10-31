package l;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: l.ۙۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H9VO */
/* JADX INFO: loaded from: classes3.dex */
public final class C4407 extends AbstractC10011 {

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public String f14107;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f14108;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public C13537 f14109;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public byte[] f14110;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f14111;

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

    public C4407(InterfaceC18663 interfaceC18663, C13537 c13537, String str, String str2, AbstractC11422 abstractC11422) {
        super(interfaceC18663.mo27540(), (byte) 117, abstractC11422);
        this.f14108 = interfaceC18663;
        this.f14109 = c13537;
        this.f34156 = str;
        this.f14107 = str2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C13537 c13537 = this.f14109;
        if (c13537.f40402 == 0) {
            InterfaceC18663 interfaceC18663 = this.f14108;
            if (interfaceC18663.mo6355() instanceof C18560) {
                C18560 c18560 = (C18560) interfaceC18663.mo6355();
                if ((c18560 instanceof C2332) && !((C2332) c18560).m7596() && c18560.getPassword().isEmpty()) {
                    this.f14111 = 1;
                } else if (c13537.f40397) {
                    try {
                        byte[] bArrM43099 = c18560.m43099(interfaceC18663, c13537.f40403);
                        this.f14110 = bArrM43099;
                        this.f14111 = bArrM43099.length;
                    } catch (GeneralSecurityException e) {
                        throw new C13017("Failed to encrypt password", e);
                    }
                } else {
                    if (((C13722) interfaceC18663.mo27540()).m32999()) {
                        throw new C13017("Plain text passwords are disabled");
                    }
                    this.f14110 = new byte[(c18560.getPassword().length() + 1) * 2];
                    this.f14111 = m28197(c18560.getPassword(), 0, this.f14110);
                }
            } else {
                this.f14111 = 1;
            }
        } else {
            this.f14111 = 1;
        }
        bArr[i] = 0;
        bArr[i + 1] = 0;
        C1480.m5122(this.f14111, i + 2, bArr);
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int i2;
        String str = this.f14107;
        if (this.f14109.f40402 == 0) {
            InterfaceC18663 interfaceC18663 = this.f14108;
            if (interfaceC18663.mo6355() instanceof C18560) {
                C18560 c18560 = (C18560) interfaceC18663.mo6355();
                if ((c18560 instanceof C2332) && !((C2332) c18560).m7596() && c18560.getPassword().isEmpty()) {
                    i2 = i + 1;
                    bArr[i] = 0;
                } else {
                    System.arraycopy(this.f14110, 0, bArr, i, this.f14111);
                    i2 = this.f14111 + i;
                }
            } else {
                i2 = i + 1;
                bArr[i] = 0;
            }
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int iM28197 = i2 + m28197(this.f34156, i2, bArr);
        try {
            System.arraycopy(str.getBytes("ASCII"), 0, bArr, iM28197, str.length());
            int length = str.length() + iM28197;
            bArr[length] = 0;
            return (length + 1) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndX[");
        sb.append(super.toString());
        sb.append(",disconnectTid=false,passwordLength=");
        sb.append(this.f14111);
        sb.append(",password=");
        sb.append(C12085.m29468(this.f14110, this.f14111, 0));
        sb.append(",path=");
        sb.append(this.f34156);
        sb.append(",service=");
        return new String(C9045.m23341(sb, this.f14107, "]"));
    }
}
