package p067l;

import java.io.IOException;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13191 implements InterfaceC14531 {

    /* JADX INFO: renamed from: ֫ */
    public C21828 f37067;

    /* JADX INFO: renamed from: ۧ */
    public C19557 f37068;

    /* JADX INFO: renamed from: ܳ */
    public C4473 f37069;

    /* JADX INFO: renamed from: ܽ */
    public AbstractSet f37070;

    /* JADX INFO: renamed from: ܿ */
    public Random f37071;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f37072;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC7826 f37073;

    /* JADX INFO: renamed from: ᩷ */
    public static final InterfaceC4410 f37066 = C13128.m30022(C13191.class);

    /* JADX INFO: renamed from: ۜ */
    public static final C22872 f37065 = new C22872("1.3.6.1.4.1.311.2.2.10");

    @Override // p067l.InterfaceC14531
    /* JADX INFO: renamed from: ֫ */
    public final C24622 mo30197(C5144 c5144, byte[] bArr, C8752 c8752) throws IOException {
        try {
            EnumC7826 enumC7826 = this.f37073;
            EnumC7826 enumC7827 = EnumC7826.COMPLETE;
            if (enumC7826 == enumC7827) {
                return null;
            }
            EnumC7826 enumC7828 = EnumC7826.NEGOTIATE;
            InterfaceC4410 interfaceC4410 = f37066;
            if (enumC7826 == enumC7828) {
                interfaceC4410.mo9195(c5144.m10985(), "Initialized Authentication of {} using NTLM");
                this.f37073 = EnumC7826.AUTHENTICATE;
                return m30196(c5144);
            }
            interfaceC4410.mo9195(C3463.m6190(bArr), "Received token: {}");
            C23030 c23030 = new C23030();
            c23030.m51415(bArr);
            C16203 c16203 = new C16203();
            try {
                c16203.m36894(new C14192(c23030.m51416()));
                interfaceC4410.mo9190(c16203, "Received NTLM challenge: {}");
                interfaceC4410.mo9195(c16203.m36898(), "Received NTLM challenge from: {}");
                final EnumSet enumSetM36893 = c16203.m36893();
                EnumC22240 enumC22240 = EnumC22240.NTLMSSP_NEGOTIATE_128;
                Boolean boolValueOf = Boolean.valueOf(enumSetM36893.contains(enumC22240));
                EnumC22240 enumC22241 = EnumC22240.NTLMSSP_NEGOTIATE_56;
                interfaceC4410.mo9187("Server NTLM negotiate flags: {}, supports128Bit={}, supports56Bit={}", enumSetM36893, boolValueOf, Boolean.valueOf(enumSetM36893.contains(enumC22241)));
                C7480.removeIf(this.f37070, new Predicate() { // from class: l.۫֫ۘ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m31532or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return !enumSetM36893.contains((EnumC22240) obj);
                    }
                });
                if (this.f37070.contains(enumC22240)) {
                    interfaceC4410.mo9195(enumSetM36893, "Using NTLM 128-bit session security, serverFlags={}");
                } else {
                    AbstractSet abstractSet = this.f37070;
                    if (abstractSet.contains(enumC22240) || abstractSet.contains(enumC22241)) {
                        interfaceC4410.mo9198(enumSetM36893, "Falling back to NTLM 56-bit session security, serverFlags={}");
                    } else {
                        interfaceC4410.mo9198(enumSetM36893, "Falling back to legacy NTLM session security (<56-bit), serverFlags={}");
                    }
                }
                C24622 c24622M30195 = m30195(c5144, c8752, c16203, c23030.m51416());
                this.f37073 = enumC7827;
                return c24622M30195;
            } catch (C14862 e) {
                throw new IOException(e);
            }
        } catch (C21689 e2) {
            throw new C12776(e2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C24622 m30196(C5144 c5144) {
        C24622 c24622 = new C24622();
        this.f37070 = EnumSet.of(EnumC22240.NTLMSSP_NEGOTIATE_128, EnumC22240.NTLMSSP_NEGOTIATE_56, EnumC22240.NTLMSSP_REQUEST_TARGET, EnumC22240.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY);
        this.f37067.getClass();
        if (this.f37067.m49192() != null) {
            this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_VERSION);
        }
        if (!c5144.m10987()) {
            this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_SIGN);
            this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_ALWAYS_SIGN);
            this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else if (c5144.m10986()) {
            this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else {
            this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_ANONYMOUS);
        }
        if (!this.f37070.contains(EnumC22240.NTLMSSP_NEGOTIATE_VERSION)) {
            if (C5595.m12400(c5144.m10983())) {
                this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
            }
            this.f37067.getClass();
        }
        AbstractSet abstractSet = this.f37070;
        String strM10983 = c5144.m10983();
        this.f37067.getClass();
        C20899 c20899M49192 = this.f37067.m49192();
        this.f37067.getClass();
        C8828 c8828 = new C8828(abstractSet, strM10983, null, c20899M49192, false);
        f37066.mo9190(this.f37072, "Sending NTLM negotiate message: {}");
        C16993 c16993 = new C16993();
        c16993.m38585(f37065);
        C14192 c14192 = new C14192();
        c8828.m20389(c14192);
        byte[] bArrM28123 = c14192.m28123();
        this.f37072 = bArrM28123;
        c16993.m38588(bArrM28123);
        c24622.m54262(c16993);
        c24622.m54261(this.f37070);
        return c24622;
    }

    /* JADX INFO: renamed from: ֫ */
    private C24622 m30195(C5144 c5144, C8752 c8752, C16203 c16203, byte[] bArr) {
        C10840 c10840M24956;
        byte[] bArrM41435;
        C24622 c24622 = new C24622();
        c24622.m54263(c16203.m36897());
        if (c16203.m36896() != null) {
            C10840 c10840M36896 = c16203.m36896();
            EnumC5734 enumC5734 = EnumC5734.MsvAvNbComputerName;
            if (c10840M36896.m24961(enumC5734)) {
            }
        }
        if (c5144.m10987() && !c8752.m20233().m49973().m52019()) {
            String strM10985 = c5144.m10985();
            String strM10983 = c5144.m10983();
            this.f37067.getClass();
            C18886 c18886 = new C18886(null, null, strM10985, strM10983, null, null, this.f37070, this.f37067.m49192());
            C23030 c23030 = new C23030();
            C14192 c14192 = new C14192();
            c18886.m42979(c14192);
            c23030.m51418(c14192.m28123());
            c24622.m54262(c23030);
            return c24622;
        }
        this.f37070.add(EnumC22240.NTLMSSP_NEGOTIATE_TARGET_INFO);
        if (c16203.m36896() == null) {
            c10840M24956 = null;
        } else {
            c10840M24956 = c16203.m36896().m24956();
            if (this.f37067.m49193() && c16203.m36896().m24961(EnumC5734.MsvAvTimestamp)) {
                EnumC5734 enumC5735 = EnumC5734.MsvAvFlags;
                c10840M24956.m24959(new C24509(enumC5735, Long.valueOf(c10840M24956.m24961(enumC5735) ? ((Long) c10840M24956.m24957(enumC5735).m34537()).longValue() | 2 : 2L)));
            }
            if (c16203.m36893().contains(EnumC22240.NTLMSSP_REQUEST_TARGET)) {
                C9757 c9757 = (C9757) c10840M24956.m24957(EnumC5734.MsvAvDnsComputerName);
                if (c9757 != null) {
                    c10840M24956.m24959(new C9757(EnumC5734.MsvAvTargetName, String.format("cifs/%s", c9757.m34537())));
                }
            } else {
                c10840M24956.m24959(new C9757(EnumC5734.MsvAvTargetName, ""));
            }
        }
        long jM53525 = new C24212((TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) / 100) + 116444736000000000L).m53525();
        if (c10840M24956 != null) {
            EnumC5734 enumC5736 = EnumC5734.MsvAvTimestamp;
            if (c10840M24956.m24961(enumC5736)) {
                jM53525 = ((C24212) ((C4134) c10840M24956.m24957(enumC5736)).m34537()).m53525();
            }
        }
        C12852 c12852M44417 = this.f37068.m44417(c5144.m10985(), c5144.m10983(), c5144.m10984(), c16203, jM53525, c10840M24956);
        byte[] bArrM29434 = c12852M44417.m29434();
        byte[] bArrM29433 = c12852M44417.m29433();
        byte[] bArr2 = new byte[0];
        this.f37068.getClass();
        EnumSet enumSetM36893 = c16203.m36893();
        if (enumSetM36893.contains(EnumC22240.NTLMSSP_NEGOTIATE_KEY_EXCH) && (enumSetM36893.contains(EnumC22240.NTLMSSP_NEGOTIATE_SEAL) || enumSetM36893.contains(EnumC22240.NTLMSSP_NEGOTIATE_SIGN) || enumSetM36893.contains(EnumC22240.NTLMSSP_NEGOTIATE_ALWAYS_SIGN))) {
            byte[] bArr3 = new byte[16];
            this.f37071.nextBytes(bArr3);
            bArrM41435 = C18215.m41435(this.f37069, bArrM29434, bArr3);
            bArrM29434 = bArr3;
        } else {
            bArrM41435 = bArrM29434;
        }
        String strM10986 = c5144.m10985();
        String strM10984 = c5144.m10983();
        this.f37067.getClass();
        C18886 c18887 = new C18886(bArr2, bArrM29433, strM10986, strM10984, null, bArrM41435, enumSetM36893, this.f37067.m49192());
        C24509 c24509 = c10840M24956 != null ? (C24509) c10840M24956.m24957(EnumC5734.MsvAvFlags) : null;
        if (c24509 != null && (((Long) c24509.m34537()).longValue() & 2) > 0) {
            c18887.m42980(new byte[16]);
            C14192 c14193 = new C14192();
            c18887.m42979(c14193);
            c18887.m42980(C18215.m41436(this.f37069, bArrM29434, this.f37072, bArr, c14193.m28123()));
        }
        c24622.m54264(bArrM29434);
        f37066.mo9190(c18887, "Sending NTLM authenticate message: {}");
        C23030 c23031 = new C23030();
        C14192 c14194 = new C14192();
        c18887.m42979(c14194);
        c23031.m51418(c14194.m28123());
        c24622.m54262(c23031);
        c24622.m54261(this.f37070);
        return c24622;
    }

    @Override // p067l.InterfaceC14531
    /* JADX INFO: renamed from: ֫ */
    public final void mo30198(C6485 c6485) {
        this.f37069 = c6485.m14902();
        this.f37071 = c6485.m14898();
        this.f37067 = c6485.m14896();
        this.f37073 = EnumC7826.NEGOTIATE;
        this.f37070 = new HashSet();
        this.f37068 = new C19557(this.f37071, this.f37069);
    }

    @Override // p067l.InterfaceC14531
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30199(C5144 c5144) {
        return c5144.getClass().equals(C5144.class);
    }
}
