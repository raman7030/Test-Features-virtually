package p067l;

import java.nio.charset.Charset;
import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9I3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18886 extends C24921 {

    /* JADX INFO: renamed from: ۜ */
    public byte[] f56380;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f56381;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f56382;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f56383;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f56384;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f56385;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f56386;

    public C18886(byte[] bArr, byte[] bArr2, String str, String str2, String str3, byte[] bArr3, AbstractSet abstractSet, C20899 c20899) {
        super(abstractSet, c20899);
        byte[] bArr4 = C17544.f52435;
        this.f56382 = bArr == null ? bArr4 : bArr;
        this.f56380 = bArr2 == null ? bArr4 : bArr2;
        this.f56385 = str != null ? str.getBytes(C18215.f54371) : bArr4;
        this.f56384 = str2 != null ? str2.getBytes(C18215.f54371) : bArr4;
        this.f56381 = str3 != null ? str3.getBytes(C18215.f54371) : bArr4;
        this.f56383 = bArr3 == null ? bArr4 : bArr3;
        this.f79589 = abstractSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42979(C14192 c14192) {
        c14192.m28114("NTLMSSP\u0000", C10169.f28134);
        c14192.m28113(3L);
        Set set = this.f79589;
        EnumC22240 enumC22240 = EnumC22240.NTLMSSP_NEGOTIATE_VERSION;
        int i = (set.contains(enumC22240) || this.f56386 != null) ? 72 : 64;
        if (this.f56386 != null) {
            i += 16;
        }
        byte[] bArr = this.f56382;
        int iM39921 = C17544.m39921(c14192, bArr, i);
        byte[] bArr2 = this.f56380;
        int iM39922 = C17544.m39921(c14192, bArr2, iM39921);
        byte[] bArr3 = this.f56384;
        int iM39923 = C17544.m39921(c14192, bArr3, iM39922);
        byte[] bArr4 = this.f56385;
        int iM39924 = C17544.m39921(c14192, bArr4, iM39923);
        byte[] bArr5 = this.f56381;
        int iM39925 = C17544.m39921(c14192, bArr5, iM39924);
        byte[] bArr6 = this.f56383;
        C17544.m39921(c14192, bArr6, iM39925);
        c14192.m28113(C16873.m38438(this.f79589));
        if (this.f79589.contains(enumC22240)) {
            C14192 c14193 = new C14192();
            c14193.m28100((byte) 6);
            c14193.m28100((byte) 1);
            c14193.m28111(7600);
            c14193.m28102(3, new byte[]{0, 0, 0});
            c14193.m28100((byte) 15);
            byte[] bArrM28123 = c14193.m28123();
            c14192.m28102(bArrM28123.length, bArrM28123);
        } else if (this.f56386 != null) {
            c14192.m28118(0L);
        }
        byte[] bArr7 = this.f56386;
        if (bArr7 != null) {
            c14192.m28102(16, bArr7);
        }
        c14192.m28102(bArr.length, bArr);
        c14192.m28102(bArr2.length, bArr2);
        c14192.m28102(bArr3.length, bArr3);
        c14192.m28102(bArr4.length, bArr4);
        c14192.m28102(bArr5.length, bArr5);
        c14192.m28102(bArr6.length, bArr6);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42980(byte[] bArr) {
        this.f56386 = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NtlmAuthenticate{\n  mic=");
        byte[] bArr = this.f56386;
        sb.append(bArr != null ? C3463.m6190(bArr) : "[]");
        sb.append(",\n  lmResponse=");
        sb.append(C3463.m6190(this.f56382));
        sb.append(",\n  ntResponse=");
        sb.append(C3463.m6190(this.f56380));
        sb.append(",\n  domainName='");
        byte[] bArr2 = this.f56384;
        if (bArr2 != null) {
            str = new String(bArr2, C18215.f54371);
        } else {
            Charset charset = C18215.f54371;
            str = "";
        }
        sb.append(str);
        sb.append("',\n  userName='");
        byte[] bArr3 = this.f56385;
        sb.append(bArr3 != null ? new String(bArr3, C18215.f54371) : "");
        sb.append("',\n  workstation='");
        byte[] bArr4 = this.f56381;
        return C10965.m25286(sb, bArr4 != null ? new String(bArr4, C18215.f54371) : "", "',\n  encryptedRandomSessionKey=[<secret>],\n}");
    }
}
