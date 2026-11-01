package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۢۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9KA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11454 implements InterfaceC22910 {
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


    /* JADX INFO: renamed from: ᩸ */
    public long f31957;

    EnumC11454(long j) {
        this.f31957 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f31957;
    }
}
