package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۢۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9KA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9560 implements InterfaceC21614 {
    SMB2_SHAREFLAG_MANUAL_CACHING(0),
    SMB2_SHAREFLAG_AUTO_CACHING(16),
    SMB2_SHAREFLAG_VDO_CACHING(32),
    SMB2_SHAREFLAG_NO_CACHING(48),
    SMB2_SHAREFLAG_DFS(1),
    SMB2_SHAREFLAG_DFS_ROOT(2),
    SMB2_SHAREFLAG_RESTRICT_EXCLUSIVE_OPENS(256),
    SMB2_SHAREFLAG_FORCE_SHARED_DELETE(512),
    SMB2_SHAREFLAG_ALLOW_NAMESPACE_CACHING(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS),
    SMB2_SHAREFLAG_ACCESS_BASED_DIRECTORY_ENUM(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
    SMB2_SHAREFLAG_FORCE_LEVELII_OPLOCK(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
    SMB2_SHAREFLAG_ENABLE_HASH_V1(8192),
    SMB2_SHAREFLAG_ENABLE_HASH_V2(16384),
    SMB2_SHAREFLAG_ENCRYPT_DATA(X931RNG.BLOCK64_RESEED_MAX),
    SMB2_SHAREFLAG_IDENTITY_REMOTING(262144);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f29010;

    EnumC9560(long j) {
        this.f29010 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f29010;
    }
}
