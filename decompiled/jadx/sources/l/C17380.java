package l;

import java.nio.charset.Charset;
import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9I3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17380 extends C23730 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f53194;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f53195;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f53196;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f53197;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f53198;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f53199;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f53200;

    public C17380(byte[] bArr, byte[] bArr2, String str, String str2, String str3, byte[] bArr3, AbstractSet abstractSet, C19498 c19498) {
        super(abstractSet, c19498);
        byte[] bArr4 = C15968.f49277;
        this.f53196 = bArr == null ? bArr4 : bArr;
        this.f53194 = bArr2 == null ? bArr4 : bArr2;
        this.f53199 = str != null ? str.getBytes(C16674.f51186) : bArr4;
        this.f53198 = str2 != null ? str2.getBytes(C16674.f51186) : bArr4;
        this.f53195 = str3 != null ? str3.getBytes(C16674.f51186) : bArr4;
        this.f53197 = bArr3 == null ? bArr4 : bArr3;
        this.f76838 = abstractSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40726(C12441 c12441) {
        c12441.m26089("NTLMSSP\u0000", C8208.f25224);
        c12441.m26088(3L);
        Set set = this.f76838;
        EnumC20909 enumC20909 = EnumC20909.NTLMSSP_NEGOTIATE_VERSION;
        int i = (set.contains(enumC20909) || this.f53200 != null) ? 72 : 64;
        if (this.f53200 != null) {
            i += 16;
        }
        byte[] bArr = this.f53196;
        int iM37737 = C15968.m37737(c12441, bArr, i);
        byte[] bArr2 = this.f53194;
        int iM37738 = C15968.m37737(c12441, bArr2, iM37737);
        byte[] bArr3 = this.f53198;
        int iM37739 = C15968.m37737(c12441, bArr3, iM37738);
        byte[] bArr4 = this.f53199;
        int iM377310 = C15968.m37737(c12441, bArr4, iM37739);
        byte[] bArr5 = this.f53195;
        int iM377311 = C15968.m37737(c12441, bArr5, iM377310);
        byte[] bArr6 = this.f53197;
        C15968.m37737(c12441, bArr6, iM377311);
        c12441.m26088(C15262.m36277(this.f76838));
        if (this.f76838.contains(enumC20909)) {
            C12441 c12442 = new C12441();
            c12442.m26075((byte) 6);
            c12442.m26075((byte) 1);
            c12442.m26086(7600);
            c12442.m26077(3, new byte[]{0, 0, 0});
            c12442.m26075((byte) 15);
            byte[] bArrM26098 = c12442.m26098();
            c12441.m26077(bArrM26098.length, bArrM26098);
        } else if (this.f53200 != null) {
            c12441.m26093(0L);
        }
        byte[] bArr7 = this.f53200;
        if (bArr7 != null) {
            c12441.m26077(16, bArr7);
        }
        c12441.m26077(bArr.length, bArr);
        c12441.m26077(bArr2.length, bArr2);
        c12441.m26077(bArr3.length, bArr3);
        c12441.m26077(bArr4.length, bArr4);
        c12441.m26077(bArr5.length, bArr5);
        c12441.m26077(bArr6.length, bArr6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40727(byte[] bArr) {
        this.f53200 = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NtlmAuthenticate{\n  mic=");
        byte[] bArr = this.f53200;
        sb.append(bArr != null ? C1152.m3949(bArr) : "[]");
        sb.append(",\n  lmResponse=");
        sb.append(C1152.m3949(this.f53196));
        sb.append(",\n  ntResponse=");
        sb.append(C1152.m3949(this.f53194));
        sb.append(",\n  domainName='");
        byte[] bArr2 = this.f53198;
        if (bArr2 != null) {
            str = new String(bArr2, C16674.f51186);
        } else {
            Charset charset = C16674.f51186;
            str = "";
        }
        sb.append(str);
        sb.append("',\n  userName='");
        byte[] bArr3 = this.f53199;
        sb.append(bArr3 != null ? new String(bArr3, C16674.f51186) : "");
        sb.append("',\n  workstation='");
        byte[] bArr4 = this.f53195;
        return C9045.m23341(sb, bArr4 != null ? new String(bArr4, C16674.f51186) : "", "',\n  encryptedRandomSessionKey=[<secret>],\n}");
    }
}
