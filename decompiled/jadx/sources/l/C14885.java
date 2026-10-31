package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܶ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14885 extends AbstractC5008 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f45426;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f45427;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f45428;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f45429;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f45430;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f45431;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f45432;

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
    public C14885(l.InterfaceC18663 r17, l.C7830 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14885.<init>(l.ᩴۡ᩵, l.۠֡᩵, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35318(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f45428;
        if (bArr3 == null) {
            return;
        }
        MessageDigest messageDigestM12981 = C4324.m12981(bArr3);
        messageDigestM12981.update(bArr);
        messageDigestM12981.update(bArr2);
        messageDigestM12981.update(m35320());
        this.f45432 = messageDigestM12981.digest();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m35319() {
        return this.f45428;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m35320() {
        int length;
        byte[] bytes;
        byte[] bytes2;
        int i;
        int i2;
        boolean zM14497 = m14497(1);
        String str = zM14497 ? null : "Cp850";
        String str2 = this.f45430;
        if (str2 == null || str2.length() == 0) {
            length = 64;
            bytes = null;
        } else {
            bytes = zM14497 ? str2.getBytes("UTF-16LE") : str2.getBytes(str);
            length = bytes.length + 64;
        }
        String str3 = this.f45427;
        if (str3 == null || str3.length() == 0) {
            bytes2 = null;
        } else {
            bytes2 = zM14497 ? str3.getBytes("UTF-16LE") : str3.toUpperCase().getBytes(str);
            length += bytes2.length;
        }
        byte[] bArr = this.f45432;
        if (bArr != null) {
            length += 24;
        } else if (m14497(33554432)) {
            length += 8;
        }
        byte[] bArr2 = this.f45429;
        int length2 = length + (bArr2 != null ? bArr2.length : 0);
        byte[] bArr3 = this.f45426;
        int length3 = length2 + (bArr3 != null ? bArr3.length : 0);
        byte[] bArr4 = this.f45431;
        byte[] bArr5 = new byte[length3 + (bArr4 != null ? bArr4.length : 0)];
        System.arraycopy(AbstractC5008.f15779, 0, bArr5, 0, 8);
        AbstractC5008.m14493(8, 3, bArr5);
        int iM14492 = AbstractC5008.m14492(12, bArr5, bArr2);
        int iM14493 = AbstractC5008.m14492(20, bArr5, bArr3);
        int iM14494 = AbstractC5008.m14492(28, bArr5, bytes);
        int iM14495 = AbstractC5008.m14492(36, bArr5, bytes2);
        int iM14496 = AbstractC5008.m14492(44, bArr5, (byte[]) null);
        int iM14497 = AbstractC5008.m14492(52, bArr5, bArr4);
        AbstractC5008.m14493(60, m14496(), bArr5);
        if (m14497(33554432)) {
            i2 = 0;
            System.arraycopy(AbstractC5008.f15780, 0, bArr5, 64, 8);
        } else {
            i = 64;
            i2 = 0;
            if (bArr != null) {
            }
            if (bArr != null) {
                System.arraycopy(bArr, i2, bArr5, i, 16);
                i += 16;
            }
            int iM14491 = i + AbstractC5008.m14491(i, iM14492, bArr5, bArr2);
            int iM14498 = iM14491 + AbstractC5008.m14491(iM14491, iM14493, bArr5, bArr3);
            int iM14499 = iM14498 + AbstractC5008.m14491(iM14498, iM14494, bArr5, bytes);
            int iM144910 = iM14499 + AbstractC5008.m14491(iM14499, iM14495, bArr5, bytes2);
            AbstractC5008.m14491(iM144910 + AbstractC5008.m14491(iM144910, iM14496, bArr5, null), iM14497, bArr5, bArr4);
            return bArr5;
        }
        i = 72;
        if (bArr != null) {
            System.arraycopy(bArr, i2, bArr5, i, 16);
            i += 16;
        }
        int iM144911 = i + AbstractC5008.m14491(i, iM14492, bArr5, bArr2);
        int iM144912 = iM144911 + AbstractC5008.m14491(iM144911, iM14493, bArr5, bArr3);
        int iM144913 = iM144912 + AbstractC5008.m14491(iM144912, iM14494, bArr5, bytes);
        int iM144914 = iM144913 + AbstractC5008.m14491(iM144913, iM14495, bArr5, bytes2);
        AbstractC5008.m14491(iM144914 + AbstractC5008.m14491(iM144914, iM14496, bArr5, null), iM14497, bArr5, bArr4);
        return bArr5;
    }

    public final String toString() {
        String strM9831;
        String strM9832;
        StringBuilder sbM10501 = C3435.m10501("Type3Message[domain=", this.f45430, ",user=", this.f45427, ",workstation=null,lmResponse=");
        String strM9833 = "null";
        byte[] bArr = this.f45429;
        if (bArr == null) {
            strM9831 = "null";
        } else {
            strM9831 = C3200.m9831(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM10501.append(strM9831);
        sbM10501.append(",ntResponse=");
        byte[] bArr2 = this.f45426;
        if (bArr2 == null) {
            strM9832 = "null";
        } else {
            strM9832 = C3200.m9831(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM10501.append(strM9832);
        sbM10501.append(",sessionKey=");
        byte[] bArr3 = this.f45431;
        if (bArr3 != null) {
            strM9833 = C3200.m9831(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM10501.append(strM9833);
        sbM10501.append(",flags=0x");
        sbM10501.append(C12085.m29467(m14496(), 8));
        sbM10501.append("]");
        return sbM10501.toString();
    }
}
