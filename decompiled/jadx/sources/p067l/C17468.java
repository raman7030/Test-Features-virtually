package p067l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: l.ܺۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17468 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC4410 f52240 = C13128.m30022(C17468.class);

    /* JADX INFO: renamed from: ֫ */
    public EnumC2735 f52241;

    /* JADX INFO: renamed from: ۧ */
    public EnumC23366 f52242;

    /* JADX INFO: renamed from: ܽ */
    public C4473 f52243;

    public C17468(C4473 c4473) {
        this.f52243 = c4473;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39834(C8752 c8752) {
        this.f52242 = c8752.m20233().m49973();
        if (c8752.m20233().m49973().equals(EnumC23366.SMB_3_1_1)) {
            this.f52241 = c8752.m20232();
        } else {
            this.f52241 = EnumC2735.AES_128_CCM;
        }
        f52240.mo9182(this.f52241, "Initialized PacketEncryptor with Cipher << {} >>");
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39835(C20171 c20171) {
        return this.f52242.m52019() && c20171.m23025().m28117() != 0 && ((C10783) c20171.m23026()).m24847() == 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m39837(C20171 c20171, SecretKey secretKey) {
        InterfaceC4410 interfaceC4410 = f52240;
        try {
            C2460 c2460M23025 = c20171.m23025();
            int iM39827 = m39827(c20171, c2460M23025);
            byte[] bArrM39830 = m39830((C10783) c20171.m23026());
            byte[] bArrM24844 = ((C10783) c20171.m23026()).m24844();
            C4473 c4473 = this.f52243;
            String strM4270 = this.f52241.m4270();
            c4473.getClass();
            InterfaceC5971 interfaceC5971M11475 = C5300.m11475(strM4270);
            interfaceC5971M11475.mo13384(EnumC20053.DECRYPT, secretKey.getEncoded(), new GCMParameterSpec(128, ((C10783) c20171.m23026()).m24849(), 0, this.f52241.m4272()));
            interfaceC5971M11475.mo13385(bArrM39830);
            byte[] bArrUpdate = interfaceC5971M11475.update(c2460M23025.m28106(), c2460M23025.m28108(), iM39827);
            byte[] bArrMo13386 = interfaceC5971M11475.mo13386(bArrM24844.length, bArrM24844);
            int length = bArrUpdate.length;
            int length2 = bArrMo13386.length;
            if (length == 0) {
                return bArrMo13386;
            }
            if (length2 == 0) {
                return bArrUpdate;
            }
            byte[] bArr = new byte[length + length2];
            System.arraycopy(bArrUpdate, 0, bArr, 0, length);
            System.arraycopy(bArrMo13386, 0, bArr, length, length2);
            return bArr;
        } catch (C9994 e) {
            interfaceC4410.mo9174(c20171, "Security exception while decrypting packet << {} >>");
            throw new C12776(e);
        } catch (C14862 e2) {
            interfaceC4410.mo9174(c20171, "Could not read cipherText from packet << {} >>");
            throw new C12776("Could not read cipherText from packet", e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18158 m39833(C18158 c18158, SecretKey secretKey) {
        if (secretKey != null) {
            return new C10764(this, c18158, secretKey);
        }
        f52240.mo9195(((C24864) c18158.mo5341()).m54620(), "Not wrapping {} as encrypted, as no key is set.");
        return c18158;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m39830(C10783 c10783) {
        byte[] bArr = new byte[32];
        byte[] bArrM24849 = c10783.m24849();
        System.arraycopy(bArrM24849, 0, bArr, 0, Math.min(bArrM24849.length, 16));
        int iM24848 = c10783.m24848();
        bArr[16] = (byte) iM24848;
        bArr[17] = (byte) (iM24848 >>> 8);
        bArr[18] = (byte) (iM24848 >>> 16);
        bArr[19] = (byte) (iM24848 >>> 24);
        int iM24846 = c10783.m24846();
        bArr[20] = (byte) iM24846;
        bArr[21] = (byte) (iM24846 >>> 8);
        int iM24847 = c10783.m24847();
        bArr[22] = (byte) iM24847;
        bArr[23] = (byte) (iM24847 >>> 8);
        m39829(c10783.m24850(), 24, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m39836() {
        long jNanoTime = System.nanoTime();
        byte[] bArr = new byte[this.f52241.m4272()];
        m39829(jNanoTime, 0, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m39827(C20171 c20171, C2460 c2460) throws C14862 {
        int iM24848 = ((C10783) c20171.m23026()).m24848();
        if (c2460.m28117() >= iM24848) {
            return iM24848;
        }
        throw new C14862("Underflow");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39829(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >>> 8);
        bArr[i + 2] = (byte) (j >>> 16);
        bArr[i + 3] = (byte) (j >>> 24);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 5] = (byte) (j >>> 40);
        bArr[i + 6] = (byte) (j >>> 48);
        bArr[i + 7] = (byte) (j >>> 56);
    }
}
