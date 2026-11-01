package p067l;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: l.ۙۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H9VO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6557 extends AbstractC11883 {

    /* JADX INFO: renamed from: ۙ֫ */
    public String f16923;

    /* JADX INFO: renamed from: ܶ֫ */
    public InterfaceC20106 f16924;

    /* JADX INFO: renamed from: ᩶֫ */
    public C15234 f16925;

    /* JADX INFO: renamed from: ᩸֫ */
    public byte[] f16926;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f16927;

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

    public C6557(InterfaceC20106 interfaceC20106, C15234 c15234, String str, String str2, AbstractC13224 abstractC13224) {
        super(interfaceC20106.mo29602(), (byte) 117, abstractC13224);
        this.f16924 = interfaceC20106;
        this.f16925 = c15234;
        this.f37152 = str;
        this.f16923 = str2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C15234 c15234 = this.f16925;
        if (c15234.f43472 == 0) {
            InterfaceC20106 interfaceC20106 = this.f16924;
            if (interfaceC20106.mo8528() instanceof C20008) {
                C20008 c20008 = (C20008) interfaceC20106.mo8528();
                if ((c20008 instanceof C4585) && !((C4585) c20008).m9667() && c20008.getPassword().isEmpty()) {
                    this.f16927 = 1;
                } else if (c15234.f43467) {
                    try {
                        byte[] bArrM45377 = c20008.m45377(interfaceC20106, c15234.f43473);
                        this.f16926 = bArrM45377;
                        this.f16927 = bArrM45377.length;
                    } catch (GeneralSecurityException e) {
                        throw new C14740("Failed to encrypt password", e);
                    }
                } else {
                    if (((C15410) interfaceC20106.mo29602()).m35113()) {
                        throw new C14740("Plain text passwords are disabled");
                    }
                    this.f16926 = new byte[(c20008.getPassword().length() + 1) * 2];
                    this.f16927 = m30241(c20008.getPassword(), 0, this.f16926);
                }
            } else {
                this.f16927 = 1;
            }
        } else {
            this.f16927 = 1;
        }
        bArr[i] = 0;
        bArr[i + 1] = 0;
        C3775.m7364(this.f16927, i + 2, bArr);
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int i2;
        String str = this.f16923;
        if (this.f16925.f43472 == 0) {
            InterfaceC20106 interfaceC20106 = this.f16924;
            if (interfaceC20106.mo8528() instanceof C20008) {
                C20008 c20008 = (C20008) interfaceC20106.mo8528();
                if ((c20008 instanceof C4585) && !((C4585) c20008).m9667() && c20008.getPassword().isEmpty()) {
                    i2 = i + 1;
                    bArr[i] = 0;
                } else {
                    System.arraycopy(this.f16926, 0, bArr, i, this.f16927);
                    i2 = this.f16927 + i;
                }
            } else {
                i2 = i + 1;
                bArr[i] = 0;
            }
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int iM30241 = i2 + m30241(this.f37152, i2, bArr);
        try {
            System.arraycopy(str.getBytes("ASCII"), 0, bArr, iM30241, str.length());
            int length = str.length() + iM30241;
            bArr[length] = 0;
            return (length + 1) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndX[");
        sb.append(super.toString());
        sb.append(",disconnectTid=false,passwordLength=");
        sb.append(this.f16927);
        sb.append(",password=");
        sb.append(C13854.m31530(this.f16926, this.f16927, 0));
        sb.append(",path=");
        sb.append(this.f37152);
        sb.append(",service=");
        return new String(C10965.m25286(sb, this.f16923, "]"));
    }
}
