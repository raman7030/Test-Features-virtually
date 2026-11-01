package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܶ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16515 extends AbstractC7128 {

    /* JADX INFO: renamed from: ۜ */
    public byte[] f48541;

    /* JADX INFO: renamed from: ۢ */
    public String f48542;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f48543;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f48544;

    /* JADX INFO: renamed from: ᩳ */
    public String f48545;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f48546;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f48547;

    /* JADX WARN: Code duplicated, block: B:108:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x0201  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v16 l.￡ﾩﾶￖﾡ￡ﾩﾵ, still in use, count: 2, list:
          (r10v16 l.￡ﾩﾶￖﾡ￡ﾩﾵ) from 0x0178: INVOKE (r10v16 l.￡ﾩﾶￖﾡ￡ﾩﾵ) VIRTUAL call: l.￡ﾩﾶￖﾡ￡ﾩﾵ.ￛﾧ():int A[MD:():int (m), WRAPPED] (LINE:102)
          (r10v16 l.￡ﾩﾶￖﾡ￡ﾩﾵ) from 0x0180: PHI (r10 I:??) = (r10v12 l.￡ﾩﾶￖﾡ￡ﾩﾵ), (r10v16 l.￡ﾩﾶￖﾡ￡ﾩﾵ) binds: [B:85:0x017f, B:175:0x0180] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public C16515(p067l.InterfaceC20106 r17, p067l.C9810 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C16515.<init>(l.ᩴۡ᩵, l.۠֡᩵, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37470(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f48543;
        if (bArr3 == null) {
            return;
        }
        MessageDigest messageDigestM14845 = C6478.m14845(bArr3);
        messageDigestM14845.update(bArr);
        messageDigestM14845.update(bArr2);
        messageDigestM14845.update(m37472());
        this.f48547 = messageDigestM14845.digest();
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m37471() {
        return this.f48543;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m37472() {
        int length;
        byte[] bytes;
        byte[] bytes2;
        int i;
        int i2;
        boolean zM16401 = m16401(1);
        String str = zM16401 ? null : "Cp850";
        String str2 = this.f48545;
        if (str2 == null || str2.length() == 0) {
            length = 64;
            bytes = null;
        } else {
            bytes = zM16401 ? str2.getBytes("UTF-16LE") : str2.getBytes(str);
            length = bytes.length + 64;
        }
        String str3 = this.f48542;
        if (str3 == null || str3.length() == 0) {
            bytes2 = null;
        } else {
            bytes2 = zM16401 ? str3.getBytes("UTF-16LE") : str3.toUpperCase().getBytes(str);
            length += bytes2.length;
        }
        byte[] bArr = this.f48547;
        if (bArr != null) {
            length += 24;
        } else if (m16401(33554432)) {
            length += 8;
        }
        byte[] bArr2 = this.f48544;
        int length2 = length + (bArr2 != null ? bArr2.length : 0);
        byte[] bArr3 = this.f48541;
        int length3 = length2 + (bArr3 != null ? bArr3.length : 0);
        byte[] bArr4 = this.f48546;
        byte[] bArr5 = new byte[length3 + (bArr4 != null ? bArr4.length : 0)];
        System.arraycopy(AbstractC7128.f18612, 0, bArr5, 0, 8);
        AbstractC7128.m16397(8, 3, bArr5);
        int iM16396 = AbstractC7128.m16396(12, bArr5, bArr2);
        int iM16397 = AbstractC7128.m16396(20, bArr5, bArr3);
        int iM16398 = AbstractC7128.m16396(28, bArr5, bytes);
        int iM16399 = AbstractC7128.m16396(36, bArr5, bytes2);
        int iM163910 = AbstractC7128.m16396(44, bArr5, (byte[]) null);
        int iM163911 = AbstractC7128.m16396(52, bArr5, bArr4);
        AbstractC7128.m16397(60, m16400(), bArr5);
        if (m16401(33554432)) {
            i2 = 0;
            System.arraycopy(AbstractC7128.f18613, 0, bArr5, 64, 8);
        } else {
            i = 64;
            i2 = 0;
            if (bArr != null) {
            }
            if (bArr != null) {
                System.arraycopy(bArr, i2, bArr5, i, 16);
                i += 16;
            }
            int iM16395 = i + AbstractC7128.m16395(i, iM16396, bArr5, bArr2);
            int iM163912 = iM16395 + AbstractC7128.m16395(iM16395, iM16397, bArr5, bArr3);
            int iM163913 = iM163912 + AbstractC7128.m16395(iM163912, iM16398, bArr5, bytes);
            int iM163914 = iM163913 + AbstractC7128.m16395(iM163913, iM16399, bArr5, bytes2);
            AbstractC7128.m16395(iM163914 + AbstractC7128.m16395(iM163914, iM163910, bArr5, null), iM163911, bArr5, bArr4);
            return bArr5;
        }
        i = 72;
        if (bArr != null) {
            System.arraycopy(bArr, i2, bArr5, i, 16);
            i += 16;
        }
        int iM163915 = i + AbstractC7128.m16395(i, iM16396, bArr5, bArr2);
        int iM163916 = iM163915 + AbstractC7128.m16395(iM163915, iM16397, bArr5, bArr3);
        int iM163917 = iM163916 + AbstractC7128.m16395(iM163916, iM16398, bArr5, bytes);
        int iM163918 = iM163917 + AbstractC7128.m16395(iM163917, iM16399, bArr5, bytes2);
        AbstractC7128.m16395(iM163918 + AbstractC7128.m16395(iM163918, iM163910, bArr5, null), iM163911, bArr5, bArr4);
        return bArr5;
    }

    public final String toString() {
        String strM11876;
        String strM11877;
        StringBuilder sbM12525 = C5633.m12525("Type3Message[domain=", this.f48545, ",user=", this.f48542, ",workstation=null,lmResponse=");
        String strM11878 = "null";
        byte[] bArr = this.f48544;
        if (bArr == null) {
            strM11876 = "null";
        } else {
            strM11876 = C5410.m11876(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM12525.append(strM11876);
        sbM12525.append(",ntResponse=");
        byte[] bArr2 = this.f48541;
        if (bArr2 == null) {
            strM11877 = "null";
        } else {
            strM11877 = C5410.m11876(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM12525.append(strM11877);
        sbM12525.append(",sessionKey=");
        byte[] bArr3 = this.f48546;
        if (bArr3 != null) {
            strM11878 = C5410.m11876(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM12525.append(strM11878);
        sbM12525.append(",flags=0x");
        sbM12525.append(C13854.m31529(m16400(), 8));
        sbM12525.append("]");
        return sbM12525.toString();
    }
}
