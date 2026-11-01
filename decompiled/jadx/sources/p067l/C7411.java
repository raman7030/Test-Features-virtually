package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9EH */
/* JADX INFO: loaded from: classes2.dex */
public final class C7411 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC4410 f19389 = C13128.m30022(C7411.class);

    /* JADX INFO: renamed from: ֫ */
    public final C6485 f19390;

    /* JADX INFO: renamed from: ۧ */
    public C24845 f19391;

    /* JADX INFO: renamed from: ܽ */
    public final C8752 f19392;

    /* JADX INFO: renamed from: ᩳ */
    public C2716 f19393 = new C2716();

    public C7411(C24845 c24845, C6485 c6485, C8752 c8752) {
        this.f19391 = c24845;
        this.f19390 = c6485;
        this.f19392 = c8752;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17129() {
        C24193 c24193M17128;
        C6485 c6485 = this.f19390;
        EnumSet enumSetM14891 = c6485.m14891();
        InterfaceC4410 interfaceC4410 = f19389;
        interfaceC4410.mo9195(enumSetM14891, "Negotiating dialects {}");
        boolean zM14885 = c6485.m14885();
        C24845 c24845 = this.f19391;
        C2716 c2716 = this.f19393;
        if (zM14885) {
            C20685 c20685 = new C20685(c6485.m14891());
            long j = c24845.f79364.m51039(1)[0];
            if (j != 0) {
                throw new IllegalStateException("The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent.");
            }
            C20152 c20152 = new C20152(c20685, j, UUID.randomUUID(), false);
            c24845.f79359.m26424(c20152);
            c2716.f4558 = c20685;
            c24845.f79365.m6587(c20685);
            C12677 c12677M45601 = c20152.m45601((InterfaceC3959) null);
            long jM14887 = c6485.m14887();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC18040 interfaceC18040 = C4630.f10377;
            C18158 c18158 = (C18158) C19382.m44125(jM14887, c12677M45601);
            if (!(c18158 instanceof C24193)) {
                throw new IllegalStateException("Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: " + c18158);
            }
            c24193M17128 = (C24193) c18158;
            if (c24193M17128.m53497() == EnumC23366.SMB_2XX) {
                c24193M17128 = m17128();
            }
        } else {
            c24193M17128 = m17128();
        }
        c2716.f4560 = c24193M17128;
        if (!EnumC9460.m21962(((C24864) c24193M17128.mo5341()).m54605())) {
            throw new C3406((C24864) c24193M17128.mo5341(), "Failure during dialect negotiation");
        }
        EnumC23366 enumC23366M53497 = c2716.f4560.m53497();
        if (enumC23366M53497 == EnumC23366.SMB_3_1_1) {
            List<AbstractC3722> listM53489 = c2716.f4560.m53489();
            if (listM53489 == null) {
                throw new IllegalStateException("negotiate context list is null for SMB 3.1.1 dialect");
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (AbstractC3722 abstractC3722 : listM53489) {
                int i = C20823.f65427[abstractC3722.m7164().ordinal()];
                if (i == 1) {
                    if (z) {
                        throw new IllegalStateException("SMB2_PREAUTH_INTEGRITY_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    C23169 c23169 = (C23169) abstractC3722;
                    if (c23169.m51624().size() != 1) {
                        throw new IllegalStateException("The SMB2PreauthIntegrityCapabilities NegotiateContext does not contain exactly 1 hash algorithm");
                    }
                    c2716.f4559 = (EnumC7430) c23169.m51624().get(0);
                    byte[] bArrM46508 = C20567.m46508(c2716.f4558);
                    byte[] bArrM46509 = C20567.m46508(c2716.f4560);
                    String strM17169 = c2716.f4559.m17169();
                    try {
                        c6485.m14902().getClass();
                        C17212 c17212M9472 = C4473.m9472(strM17169);
                        byte[] bArr = new byte[c17212M9472.m38985()];
                        c17212M9472.m38986();
                        c17212M9472.m38982(bArr);
                        c17212M9472.m38982(bArrM46508);
                        byte[] bArrM38984 = c17212M9472.m38984();
                        c17212M9472.m38986();
                        c17212M9472.m38982(bArrM38984);
                        c17212M9472.m38982(bArrM46509);
                        c2716.f4557 = c17212M9472.m38984();
                        z = true;
                    } catch (C9994 e) {
                        throw new C12776(C21466.m48631("Cannot get the message digest for ", strM17169), e);
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("unknown negotiate context type");
                    }
                    if (z3) {
                        throw new IllegalStateException("SMB2_COMPRESSION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    ArrayList arrayListM47771 = ((C21158) abstractC3722).m47771();
                    if (arrayListM47771.size() == 0) {
                        throw new IllegalStateException("The SMB2CompressionCapabilities NegotiateContext should contain at least 1 algorithm");
                    }
                    if (arrayListM47771.size() == 1 && arrayListM47771.get(0) == EnumC6089.NONE) {
                        interfaceC4410.mo9191("SMB3CompressionAlgorithm is 'NONE', continuing without compression");
                    } else {
                        c2716.f4556 = EnumSet.copyOf((Collection) arrayListM47771);
                    }
                    z3 = true;
                } else {
                    if (z2) {
                        throw new IllegalStateException("SMB2_ENCRYPTION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    List listM5151 = ((C3051) abstractC3722).m5151();
                    if (listM5151.size() != 1) {
                        throw new IllegalStateException("The SMB2EncryptionCapabilities NegotiateContext does not contain exactly 1 cipher");
                    }
                    c2716.f4555 = (EnumC2735) listM5151.get(0);
                    z2 = true;
                }
            }
        } else if (enumC23366M53497.m52019() && c2716.f4560.m53491().contains(EnumC7943.SMB2_GLOBAL_CAP_ENCRYPTION)) {
            c2716.f4555 = EnumC2735.AES_128_CCM;
        }
        C8752 c8752 = this.f19392;
        C2872 c2872M20238 = c8752.m20238();
        C24193 c24193 = c2716.f4560;
        c2872M20238.m4617(c24193.m53495(), c24193.m53497(), c24193.m53490(), c24193.m53491());
        C2872 c2872M17479 = c24845.f79358.m17479(c2872M20238.m4621());
        if (c2872M17479 == null) {
            c24845.f79358.m17480(c2872M20238);
            c2716.f4561 = c2872M20238;
        } else {
            if (!c2872M20238.m4618(c2872M17479)) {
                throw new C4630(C6988.m16053("Different server found for same hostname '", c2872M20238.m4621(), "', disconnecting..."));
            }
            c2716.f4561 = c2872M17479;
        }
        c8752.m20227(c2716);
        interfaceC4410.mo9195(c8752, "Negotiated the following connection settings: {}");
    }

    /* JADX INFO: renamed from: ۧ */
    private C24193 m17128() {
        byte[] bArr = new byte[32];
        C6485 c6485 = this.f19390;
        c6485.m14898().nextBytes(bArr);
        C13465 c13465 = new C13465(c6485.m14891(), this.f19392.m20237(), false, c6485.m14886(), bArr);
        this.f19393.f4558 = c13465;
        return (C24193) this.f19391.m54558(c13465);
    }
}
