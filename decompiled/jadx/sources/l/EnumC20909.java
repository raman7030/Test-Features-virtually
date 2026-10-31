package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩷ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09CW */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20909 implements InterfaceC21614 {
    NTLMSSP_NEGOTIATE_56(2147483648L),
    NTLMSSP_NEGOTIATE_KEY_EXCH(1073741824),
    NTLMSSP_NEGOTIATE_128(536870912),
    NTLMSSP_NEGOTIATE_VERSION(33554432),
    NTLMSSP_NEGOTIATE_TARGET_INFO(X931RNG.BLOCK128_RESEED_MAX),
    NTLMSSP_REQUEST_NON_NT_SESSION_KEY(4194304),
    NTLMSSP_NEGOTIATE_IDENTIFY(1048576),
    NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY(524288),
    NTLMSSP_TARGET_TYPE_SERVER(131072),
    NTLMSSP_TARGET_TYPE_DOMAIN(65536),
    NTLMSSP_NEGOTIATE_ALWAYS_SIGN(X931RNG.BLOCK64_RESEED_MAX),
    NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED(8192),
    NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
    NTLMSSP_NEGOTIATE_ANONYMOUS(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
    NTLMSSP_NEGOTIATE_NTLM(512),
    NTLMSSP_NEGOTIATE_LM_KEY(128),
    NTLMSSP_NEGOTIATE_DATAGRAM(64),
    NTLMSSP_NEGOTIATE_SEAL(32),
    NTLMSSP_NEGOTIATE_SIGN(16),
    NTLMSSP_REQUEST_TARGET(4),
    NTLM_NEGOTIATE_OEM(2),
    NTLMSSP_NEGOTIATE_UNICODE(1);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f67629;

    EnumC20909(long j) {
        this.f67629 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f67629;
    }
}
