package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ܶۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15182 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4332 f46388;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23650 f46389;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22239 f46390;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6717 f46391;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8128 f46392;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22239 f46393;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46378 = C3395.m10360("SMBC2SCipherKey");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46381 = C3395.m10360("SMBS2CCipherKey");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46383 = C3395.m10360("SMB2AESCCM");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46377 = C3395.m10360("ServerIn ");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46382 = C3395.m10360("ServerOut");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46384 = C3395.m10360("SmbSign");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f46385 = C3395.m10360("SMB2AESCMAC");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f46376 = C3395.m10360("SMBSigningKey");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f46387 = C3395.m10360("SmbRpc");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46380 = C3395.m10360("SMB2APP");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f46386 = C3395.m10360("SMBAppKey");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f46379 = C11321.m27961(C15182.class);

    public C15182(C23650 c23650, C4332 c4332, InterfaceC8128 interfaceC8128) {
        this.f46389 = c23650;
        this.f46388 = c4332;
        this.f46391 = c23650.m52167();
        this.f46390 = c23650.m52165();
        this.f46393 = c23650.m52159();
        this.f46392 = interfaceC8128;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15346 m35909(C2921 c2921) {
        try {
            InterfaceC12798 interfaceC12798M35907 = m35907(c2921);
            boolean z = interfaceC12798M35907 instanceof C11388;
            C4332 c4332 = this.f46388;
            if (z && c4332.m13032().m46870() && (!c2921.m8919() || c2921.m8918())) {
                interfaceC12798M35907 = new C22676((C11388) interfaceC12798M35907);
            }
            C1072 c1072 = new C1072();
            c1072.f3926 = interfaceC12798M35907;
            c1072.f3924 = c2921;
            interfaceC12798M35907.mo28154(c4332);
            m35906(c1072, this.f46391.m18288());
            C15346 c15346M35908 = m35908(c1072);
            f46379.mo7085(c2921.m8917(), this.f46389.m52160(), Long.valueOf(c15346M35908.m36383()));
            this.f46390.m49949(Long.valueOf(c15346M35908.m36383()), c15346M35908);
            return c15346M35908;
        } catch (IOException | C20329 e) {
            throw new C10951(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C15346 m35908(C1072 c1072) throws IOException {
        byte[] bArr = c1072.f3927;
        C6717 c6717 = this.f46391;
        C24002 c24002 = new C24002(c6717.m18285().m47645(), EnumSet.of(c6717.m18283() ? EnumC17652.SMB2_NEGOTIATE_SIGNING_REQUIRED : EnumC17652.SMB2_NEGOTIATE_SIGNING_ENABLED), c6717.m18287());
        c24002.m52838(bArr);
        ((C23670) c24002.mo3028()).m52212(c1072.f3931);
        c1072.f3930 = c24002;
        C23650 c23650 = this.f46389;
        c1072.f3929 = (C24002) c23650.m52155(c24002);
        C24002 c24003 = c1072.f3929;
        c1072.f3931 = ((C23670) c24003.mo3028()).m52203();
        EnumC22094 enumC22094M47645 = c6717.m18285().m47645();
        long jM52202 = ((C23670) c24003.mo3028()).m52202();
        long value = EnumC7462.STATUS_MORE_PROCESSING_REQUIRED.getValue();
        C22239 c22239 = this.f46393;
        if (jM52202 == value) {
            if (enumC22094M47645 == EnumC22094.SMB_3_1_1) {
                C15346 c15346M49948 = c22239.m49948(Long.valueOf(c1072.f3931));
                if (c15346M49948 == null) {
                    c15346M49948 = m35904(c1072);
                    c22239.m49949(Long.valueOf(c1072.f3931), c15346M49948);
                }
                m35905(c1072, c15346M49948.m36382(), c1072.f3930);
                m35905(c1072, c15346M49948.m36382(), c1072.f3929);
            }
            f46379.mo7082("More processing required for authentication of {} using {}", c1072.f3924.m8917(), c1072.f3926);
            m35906(c1072, c24003.m52839());
            return m35908(c1072);
        }
        if (((C23670) c24003.mo3028()).m52202() != EnumC7462.STATUS_SUCCESS.getValue()) {
            throw new C1092((C23670) c24003.mo3028(), String.format("Authentication failed for '%s' using %s", c1072.f3924.m8917(), c1072.f3926));
        }
        C15346 c15346M49949 = c22239.m49948(Long.valueOf(c1072.f3931));
        EnumC22094 enumC22094 = EnumC22094.SMB_3_1_1;
        if (enumC22094M47645 == enumC22094 && c15346M49949 != null) {
            c22239.m49950(Long.valueOf(c15346M49949.m36383()));
        } else {
            c15346M49949 = m35904(c1072);
        }
        C21698 c21698M36382 = c15346M49949.m36382();
        m35906(c1072, c24003.m52839());
        if (c1072.f3925 != null) {
            c21698M36382.m48983(new SecretKeySpec(c1072.f3925, "HmacSHA256"));
        }
        if (enumC22094M47645 == enumC22094) {
            m35905(c1072, c21698M36382, c1072.f3930);
        }
        C4332 c4332 = this.f46388;
        c4332.getClass();
        c21698M36382.m48977(c23650.m52167().m18283());
        EnumSet enumSetM52840 = c1072.f3929.m52840();
        EnumC14829 enumC14829 = EnumC14829.SMB2_SESSION_FLAG_IS_NULL;
        if (enumSetM52840.contains(enumC14829)) {
            c21698M36382.m48977(false);
        }
        EnumSet enumSetM52841 = c1072.f3929.m52840();
        EnumC14829 enumC148210 = EnumC14829.SMB2_SESSION_FLAG_IS_GUEST;
        boolean zContains = enumSetM52841.contains(enumC148210);
        if (zContains && c21698M36382.m48988()) {
            if (zContains && c4332.m13020() && !c4332.m13025()) {
                c21698M36382.m48977(false);
            } else {
                throw new C1236("Cannot require message signing when authenticating with a guest account");
            }
        } else if (zContains) {
            c21698M36382.m48977(false);
        }
        if (c23650.m52161().m47645().m49681() && c23650.m52167().m18282() && c1072.f3929.m52840().contains(EnumC14829.SMB2_SESSION_FLAG_ENCRYPT_DATA)) {
            c21698M36382.m48979();
            c21698M36382.m48977(false);
        }
        if (enumC22094M47645.m49681() && !c24003.m52840().contains(enumC14829) && !c24003.m52840().contains(enumC148210)) {
            if (enumC22094M47645 == enumC22094) {
                c21698M36382.m48987(m35903(this.f46388, c21698M36382.m48986(), f46376, c21698M36382.m48984(), "AesCmac", 16));
            } else {
                c21698M36382.m48987(m35903(this.f46388, c21698M36382.m48986(), f46385, f46384, "AesCmac", 16));
            }
            if (c6717.m18282()) {
                String strM1879 = c6717.m18284().m1879();
                int iM1880 = c6717.m18284().m1880();
                if (enumC22094M47645 == enumC22094) {
                    c21698M36382.m48981(m35903(this.f46388, c21698M36382.m48986(), f46378, c21698M36382.m48984(), strM1879, iM1880));
                    c21698M36382.m48976(m35903(this.f46388, c21698M36382.m48986(), f46381, c21698M36382.m48984(), strM1879, iM1880));
                    m35903(this.f46388, c21698M36382.m48986(), f46386, c21698M36382.m48984(), strM1879, 16);
                    return c15346M49949;
                }
                SecretKeySpec secretKeySpecM48986 = c21698M36382.m48986();
                byte[] bArr2 = f46377;
                C4332 c4333 = this.f46388;
                byte[] bArr3 = f46383;
                c21698M36382.m48981(m35903(c4333, secretKeySpecM48986, bArr3, bArr2, strM1879, iM1880));
                c21698M36382.m48976(m35903(this.f46388, c21698M36382.m48986(), bArr3, f46382, strM1879, iM1880));
                m35903(this.f46388, c21698M36382.m48986(), f46380, f46387, strM1879, 16);
            }
        }
        return c15346M49949;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15346 m35904(C1072 c1072) {
        C2921 c2921 = c1072.f3924;
        C18006 c18006 = (C18006) this.f46392;
        c18006.getClass();
        C23650 c23650 = c18006.f56158;
        C15346 c15346 = new C15346(c23650, c23650.f76610, c2921, c23650.f76621, c23650.f76615, c23650.f76614, c23650.f76617);
        c15346.m36380(c1072.f3931);
        c15346.m36382().m48978(this.f46391.m18281());
        return c15346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35906(C1072 c1072, byte[] bArr) throws IOException {
        InterfaceC12798 interfaceC12798 = c1072.f3926;
        C2921 c2921 = c1072.f3924;
        C6717 c6717 = this.f46391;
        C23415 c23415Mo28153 = interfaceC12798.mo28153(c2921, bArr, c6717);
        if (c23415Mo28153 == null) {
            return;
        }
        c6717.getClass();
        c1072.f3925 = c23415Mo28153.m51873();
        AbstractC4806 abstractC4806M51862 = c23415Mo28153.m51862();
        C12441 c12441 = new C12441();
        try {
            abstractC4806M51862.mo14016(c12441);
            c1072.f3927 = c12441.m26098();
        } catch (C20329 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private InterfaceC12798 m35907(C2921 c2921) throws C20329 {
        ArrayList arrayList = new ArrayList(this.f46388.m13028());
        ArrayList arrayList2 = new ArrayList();
        C6717 c6717 = this.f46391;
        if (c6717.m18288().length > 0) {
            C8334 c8334 = new C8334();
            c8334.m36428(c6717.m18288());
            arrayList2 = c8334.m36426();
        }
        for (InterfaceC22319 interfaceC22319 : new ArrayList(arrayList)) {
            if (arrayList2.isEmpty() || arrayList2.contains(new C21574(interfaceC22319.getName()))) {
                InterfaceC12798 interfaceC12798 = (InterfaceC12798) interfaceC22319.create();
                if (interfaceC12798.mo28155(c2921)) {
                    return interfaceC12798;
                }
            }
        }
        throw new C10951("Could not find a configured authenticator for mechtypes: " + arrayList2 + " and authentication context: " + c2921);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35905(C1072 c1072, C21698 c21698, C24002 c24002) {
        if (c1072.f3928 == null) {
            String strM15263 = this.f46389.m52167().m18291().m15263();
            try {
                this.f46388.m13038().getClass();
                c1072.f3928 = C2215.m7389(strM15263);
            } catch (C8024 e) {
                throw new C10951(C20094.m46315("Cannot get the message digest for ", strM15263), e);
            }
        }
        InterfaceC0968 interfaceC0968 = c1072.f3928;
        byte[] bArrM48984 = c21698.m48984();
        byte[] bArrM44214 = C19149.m44214(c24002);
        C15619 c15619 = (C15619) interfaceC0968;
        c15619.m36820();
        c15619.m36816(bArrM48984);
        c15619.m36816(bArrM44214);
        c21698.m48978(c15619.m36818());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SecretKeySpec m35903(C4332 c4332, SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2, String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(25);
        int i2 = i * 8;
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) (i2 >> 8), (byte) i2});
            try {
                c4332.m13038().getClass();
                InterfaceC0262 interfaceC0262M38473 = C16325.m38473();
                interfaceC0262M38473.mo1528(new C3626(secretKeySpec.getEncoded(), byteArrayOutputStream.toByteArray()));
                byte[] bArr3 = new byte[i];
                interfaceC0262M38473.mo1527(i, bArr3);
                return new SecretKeySpec(bArr3, str);
            } catch (C8024 e) {
                throw new C10951(e);
            }
        } catch (IOException e2) {
            f46379.mo7091("Unable to format suffix, error occur : ", (Throwable) e2);
            return null;
        }
    }
}
