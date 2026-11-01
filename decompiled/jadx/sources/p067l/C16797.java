package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ܶۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16797 {

    /* JADX INFO: renamed from: ֫ */
    public final C6485 f49513;

    /* JADX INFO: renamed from: ۧ */
    public final C24845 f49514;

    /* JADX INFO: renamed from: ܳ */
    public final C23504 f49515;

    /* JADX INFO: renamed from: ܽ */
    public final C8752 f49516;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC10093 f49517;

    /* JADX INFO: renamed from: ᩳ */
    public final C23504 f49518;

    /* JADX INFO: renamed from: ۘ */
    public static final byte[] f49503 = C5595.m12399("SMBC2SCipherKey");

    /* JADX INFO: renamed from: ۡ */
    public static final byte[] f49506 = C5595.m12399("SMBS2CCipherKey");

    /* JADX INFO: renamed from: ܺ */
    public static final byte[] f49508 = C5595.m12399("SMB2AESCCM");

    /* JADX INFO: renamed from: ۖ */
    public static final byte[] f49502 = C5595.m12399("ServerIn ");

    /* JADX INFO: renamed from: ۢ */
    public static final byte[] f49507 = C5595.m12399("ServerOut");

    /* JADX INFO: renamed from: ᩴ */
    public static final byte[] f49509 = C5595.m12399("SmbSign");

    /* JADX INFO: renamed from: ᩵ */
    public static final byte[] f49510 = C5595.m12399("SMB2AESCMAC");

    /* JADX INFO: renamed from: ֡ */
    public static final byte[] f49501 = C5595.m12399("SMBSigningKey");

    /* JADX INFO: renamed from: ᩻ */
    public static final byte[] f49512 = C5595.m12399("SmbRpc");

    /* JADX INFO: renamed from: ۜ */
    public static final byte[] f49505 = C5595.m12399("SMB2APP");

    /* JADX INFO: renamed from: ᩷ */
    public static final byte[] f49511 = C5595.m12399("SMBAppKey");

    /* JADX INFO: renamed from: ۚ */
    public static final InterfaceC4410 f49504 = C13128.m30022(C16797.class);

    public C16797(C24845 c24845, C6485 c6485, InterfaceC10093 interfaceC10093) {
        this.f49514 = c24845;
        this.f49513 = c6485;
        this.f49516 = c24845.m54570();
        this.f49515 = c24845.m54568();
        this.f49518 = c24845.m54562();
        this.f49517 = interfaceC10093;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16953 m38069(C5144 c5144) {
        try {
            InterfaceC14531 interfaceC14531M38067 = m38067(c5144);
            boolean z = interfaceC14531M38067 instanceof C13191;
            C6485 c6485 = this.f49513;
            if (z && c6485.m14896().m49193() && (!c5144.m10987() || c5144.m10986())) {
                interfaceC14531M38067 = new C23919((C13191) interfaceC14531M38067);
            }
            C3387 c3387 = new C3387();
            c3387.f6697 = interfaceC14531M38067;
            c3387.f6695 = c5144;
            interfaceC14531M38067.mo30198(c6485);
            m38066(c3387, this.f49516.m20236());
            C16953 c16953M38068 = m38068(c3387);
            f49504.mo9180(c5144.m10985(), this.f49514.m54563(), Long.valueOf(c16953M38068.m38541()));
            this.f49515.m52277(Long.valueOf(c16953M38068.m38541()), c16953M38068);
            return c16953M38068;
        } catch (IOException | C21689 e) {
            throw new C12776(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C16953 m38068(C3387 c3387) throws IOException {
        byte[] bArr = c3387.f6698;
        C8752 c8752 = this.f49516;
        C25180 c25180 = new C25180(c8752.m20233().m49973(), EnumSet.of(c8752.m20231() ? EnumC19145.SMB2_NEGOTIATE_SIGNING_REQUIRED : EnumC19145.SMB2_NEGOTIATE_SIGNING_ENABLED), c8752.m20235());
        c25180.m55244(bArr);
        ((C24864) c25180.mo5341()).m54615(c3387.f6702);
        c3387.f6701 = c25180;
        C24845 c24845 = this.f49514;
        c3387.f6700 = (C25180) c24845.m54558(c25180);
        C25180 c25181 = c3387.f6700;
        c3387.f6702 = ((C24864) c25181.mo5341()).m54606();
        EnumC23366 enumC23366M49973 = c8752.m20233().m49973();
        long jM54605 = ((C24864) c25181.mo5341()).m54605();
        long value = EnumC9460.STATUS_MORE_PROCESSING_REQUIRED.getValue();
        C23504 c23504 = this.f49518;
        if (jM54605 == value) {
            if (enumC23366M49973 == EnumC23366.SMB_3_1_1) {
                C16953 c16953M52276 = c23504.m52276(Long.valueOf(c3387.f6702));
                if (c16953M52276 == null) {
                    c16953M52276 = m38064(c3387);
                    c23504.m52277(Long.valueOf(c3387.f6702), c16953M52276);
                }
                m38065(c3387, c16953M52276.m38540(), c3387.f6701);
                m38065(c3387, c16953M52276.m38540(), c3387.f6700);
            }
            f49504.mo9177("More processing required for authentication of {} using {}", c3387.f6695.m10985(), c3387.f6697);
            m38066(c3387, c25181.m55245());
            return m38068(c3387);
        }
        if (((C24864) c25181.mo5341()).m54605() != EnumC9460.STATUS_SUCCESS.getValue()) {
            throw new C3406((C24864) c25181.mo5341(), String.format("Authentication failed for '%s' using %s", c3387.f6695.m10985(), c3387.f6697));
        }
        C16953 c16953M52277 = c23504.m52276(Long.valueOf(c3387.f6702));
        EnumC23366 enumC23366 = EnumC23366.SMB_3_1_1;
        if (enumC23366M49973 == enumC23366 && c16953M52277 != null) {
            c23504.m52278(Long.valueOf(c16953M52277.m38541()));
        } else {
            c16953M52277 = m38064(c3387);
        }
        C22990 c22990M38540 = c16953M52277.m38540();
        m38066(c3387, c25181.m55245());
        if (c3387.f6696 != null) {
            c22990M38540.m51332(new SecretKeySpec(c3387.f6696, "HmacSHA256"));
        }
        if (enumC23366M49973 == enumC23366) {
            m38065(c3387, c22990M38540, c3387.f6701);
        }
        C6485 c6485 = this.f49513;
        c6485.getClass();
        c22990M38540.m51326(c24845.m54570().m20231());
        EnumSet enumSetM55246 = c3387.f6700.m55246();
        EnumC16462 enumC16462 = EnumC16462.SMB2_SESSION_FLAG_IS_NULL;
        if (enumSetM55246.contains(enumC16462)) {
            c22990M38540.m51326(false);
        }
        EnumSet enumSetM55247 = c3387.f6700.m55246();
        EnumC16462 enumC16463 = EnumC16462.SMB2_SESSION_FLAG_IS_GUEST;
        boolean zContains = enumSetM55247.contains(enumC16463);
        if (zContains && c22990M38540.m51337()) {
            if (zContains && c6485.m14884() && !c6485.m14889()) {
                c22990M38540.m51326(false);
            } else {
                throw new C3543("Cannot require message signing when authenticating with a guest account");
            }
        } else if (zContains) {
            c22990M38540.m51326(false);
        }
        if (c24845.m54564().m49973().m52019() && c24845.m54570().m20230() && c3387.f6700.m55246().contains(EnumC16462.SMB2_SESSION_FLAG_ENCRYPT_DATA)) {
            c22990M38540.m51328();
            c22990M38540.m51326(false);
        }
        if (enumC23366M49973.m52019() && !c25181.m55246().contains(enumC16462) && !c25181.m55246().contains(enumC16463)) {
            if (enumC23366M49973 == enumC23366) {
                c22990M38540.m51336(m38063(this.f49513, c22990M38540.m51335(), f49501, c22990M38540.m51333(), "AesCmac", 16));
            } else {
                c22990M38540.m51336(m38063(this.f49513, c22990M38540.m51335(), f49510, f49509, "AesCmac", 16));
            }
            if (c8752.m20230()) {
                String strM4270 = c8752.m20232().m4270();
                int iM4271 = c8752.m20232().m4271();
                if (enumC23366M49973 == enumC23366) {
                    c22990M38540.m51330(m38063(this.f49513, c22990M38540.m51335(), f49503, c22990M38540.m51333(), strM4270, iM4271));
                    c22990M38540.m51325(m38063(this.f49513, c22990M38540.m51335(), f49506, c22990M38540.m51333(), strM4270, iM4271));
                    m38063(this.f49513, c22990M38540.m51335(), f49511, c22990M38540.m51333(), strM4270, 16);
                    return c16953M52277;
                }
                SecretKeySpec secretKeySpecM51335 = c22990M38540.m51335();
                byte[] bArr2 = f49502;
                C6485 c6486 = this.f49513;
                byte[] bArr3 = f49508;
                c22990M38540.m51330(m38063(c6486, secretKeySpecM51335, bArr3, bArr2, strM4270, iM4271));
                c22990M38540.m51325(m38063(this.f49513, c22990M38540.m51335(), bArr3, f49507, strM4270, iM4271));
                m38063(this.f49513, c22990M38540.m51335(), f49505, f49512, strM4270, 16);
            }
        }
        return c16953M52277;
    }

    /* JADX INFO: renamed from: ֫ */
    private C16953 m38064(C3387 c3387) {
        C5144 c5144 = c3387.f6695;
        C19481 c19481 = (C19481) this.f49517;
        c19481.getClass();
        C24845 c24845 = c19481.f59355;
        C16953 c16953 = new C16953(c24845, c24845.f79356, c5144, c24845.f79367, c24845.f79361, c24845.f79360, c24845.f79363);
        c16953.m38538(c3387.f6702);
        c16953.m38540().m51327(this.f49516.m20229());
        return c16953;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38066(C3387 c3387, byte[] bArr) throws IOException {
        InterfaceC14531 interfaceC14531 = c3387.f6697;
        C5144 c5144 = c3387.f6695;
        C8752 c8752 = this.f49516;
        C24622 c24622Mo30197 = interfaceC14531.mo30197(c5144, bArr, c8752);
        if (c24622Mo30197 == null) {
            return;
        }
        c8752.getClass();
        c3387.f6696 = c24622Mo30197.m54271();
        AbstractC6936 abstractC6936M54260 = c24622Mo30197.m54260();
        C14192 c14192 = new C14192();
        try {
            abstractC6936M54260.mo15896(c14192);
            c3387.f6698 = c14192.m28123();
        } catch (C21689 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private InterfaceC14531 m38067(C5144 c5144) throws C21689 {
        ArrayList arrayList = new ArrayList(this.f49513.m14892());
        ArrayList arrayList2 = new ArrayList();
        C8752 c8752 = this.f49516;
        if (c8752.m20236().length > 0) {
            C10289 c10289 = new C10289();
            c10289.m38586(c8752.m20236());
            arrayList2 = c10289.m38584();
        }
        for (InterfaceC23580 interfaceC23580 : new ArrayList(arrayList)) {
            if (arrayList2.isEmpty() || arrayList2.contains(new C22872(interfaceC23580.getName()))) {
                InterfaceC14531 interfaceC14531 = (InterfaceC14531) interfaceC23580.create();
                if (interfaceC14531.mo30199(c5144)) {
                    return interfaceC14531;
                }
            }
        }
        throw new C12776("Could not find a configured authenticator for mechtypes: " + arrayList2 + " and authentication context: " + c5144);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38065(C3387 c3387, C22990 c22990, C25180 c25180) {
        if (c3387.f6699 == null) {
            String strM17169 = this.f49514.m54570().m20239().m17169();
            try {
                this.f49513.m14902().getClass();
                c3387.f6699 = C4473.m9472(strM17169);
            } catch (C9994 e) {
                throw new C12776(C21466.m48631("Cannot get the message digest for ", strM17169), e);
            }
        }
        InterfaceC3288 interfaceC3288 = c3387.f6699;
        byte[] bArrM51333 = c22990.m51333();
        byte[] bArrM46508 = C20567.m46508(c25180);
        C17212 c17212 = (C17212) interfaceC3288;
        c17212.m38986();
        c17212.m38982(bArrM51333);
        c17212.m38982(bArrM46508);
        c22990.m51327(c17212.m38984());
    }

    /* JADX INFO: renamed from: ֫ */
    public static SecretKeySpec m38063(C6485 c6485, SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2, String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(25);
        int i2 = i * 8;
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) (i2 >> 8), (byte) i2});
            try {
                c6485.m14902().getClass();
                InterfaceC2617 interfaceC2617M40688 = C17883.m40688();
                interfaceC2617M40688.mo3926(new C5814(secretKeySpec.getEncoded(), byteArrayOutputStream.toByteArray()));
                byte[] bArr3 = new byte[i];
                interfaceC2617M40688.mo3925(i, bArr3);
                return new SecretKeySpec(bArr3, str);
            } catch (C9994 e) {
                throw new C12776(e);
            }
        } catch (IOException e2) {
            f49504.mo9186("Unable to format suffix, error occur : ", (Throwable) e2);
            return null;
        }
    }
}
