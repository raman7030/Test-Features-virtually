package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC8483 {
    ZIP("zip", ".zip", null, false),
    SEVEN_ZIP("7z", ".7z", null, false),
    TAR("tar", ".tar", null, false),
    GZIP("gzip", ".gz", null, true),
    XZ("xz", ".xz", null, true),
    ZSTD("zstd", ".zst", null, true),
    BZIP2("bzip2", ".bz2", null, true),
    LZ4("lz4", ".lz4", null, true),
    TAR_GZIP("tar.gz", ".tar.gz", GZIP, false),
    TAR_XZ("tar.xz", ".tar.xz", XZ, false),
    TAR_ZSTD("tar.zst", ".tar.zst", ZSTD, false),
    TAR_BZIP2("tar.bz2", ".tar.bz2", BZIP2, false),
    TAR_LZ4("tar.lz4", ".tar.lz4", LZ4, false);


    /* JADX INFO: renamed from: ۙ */
    public final String f22771;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f22772;

    /* JADX INFO: renamed from: ᩸ */
    public final String f22773;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC8483 f22774;

    EnumC8483(String str, String str2, EnumC8483 enumC8483, boolean z) {
        this.f22773 = str;
        this.f22771 = str2;
        this.f22774 = enumC8483;
        this.f22772 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f22773;
    }

    /* JADX INFO: renamed from: ֫ */
    public OutputStream m19741(OutputStream outputStream, int i, long j) {
        switch (C24576.f77807[ordinal()]) {
            case 9:
                return EnumC17494.GZIP.m39855(outputStream, i, j);
            case 10:
                return EnumC17494.XZ.m39855(outputStream, i, j);
            case 11:
                return EnumC17494.ZSTD.m39855(outputStream, i, j);
            case 12:
                return EnumC17494.BZIP2.m39855(outputStream, i, j);
            case 13:
                return EnumC17494.LZ4.m39855(outputStream, i, j);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
