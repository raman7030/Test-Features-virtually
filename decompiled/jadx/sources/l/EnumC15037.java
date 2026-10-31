package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܶۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9HS */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15037 implements InterfaceC21614 {
    FILE_DIRECTORY_FILE(1),
    FILE_WRITE_THROUGH(2),
    FILE_SEQUENTIAL_ONLY(4),
    FILE_NO_INTERMEDIATE_BUFFERING(8),
    FILE_SYNCHRONOUS_IO_ALERT(16),
    FILE_SYNCHRONOUS_IO_NONALERT(32),
    FILE_NON_DIRECTORY_FILE(64),
    FILE_COMPLETE_IF_OPLOCKED(256),
    FILE_NO_EA_KNOWLEDGE(512),
    FILE_RANDOM_ACCESS(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
    FILE_DELETE_ON_CLOSE(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
    FILE_OPEN_BY_FILE_ID(8192),
    FILE_OPEN_FOR_BACKUP_INTENT(16384),
    FILE_NO_COMPRESSION(X931RNG.BLOCK64_RESEED_MAX),
    FILE_OPEN_REMOTE_INSTANCE(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS),
    FILE_OPEN_REQUIRING_OPLOCK(65536),
    FILE_DISALLOW_EXCLUSIVE(131072),
    FILE_RESERVE_OPFILTER(1048576),
    FILE_OPEN_REPARSE_POINT(2097152),
    FILE_OPEN_NO_RECALL(4194304),
    FILE_OPEN_FOR_FREE_SPACE_QUERY(X931RNG.BLOCK128_RESEED_MAX);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f45845;

    EnumC15037(long j) {
        this.f45845 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f45845;
    }
}
