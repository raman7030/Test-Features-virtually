package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6434 {
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


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19899;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f19900;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f19901;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC6434 f19902;

    EnumC6434(String str, String str2, EnumC6434 enumC6434, boolean z) {
        this.f19901 = str;
        this.f19899 = str2;
        this.f19902 = enumC6434;
        this.f19900 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f19901;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public OutputStream m17794(OutputStream outputStream, int i, long j) {
        switch (C23367.f75061[ordinal()]) {
            case 9:
                return EnumC15915.GZIP.m37681(outputStream, i, j);
            case 10:
                return EnumC15915.XZ.m37681(outputStream, i, j);
            case 11:
                return EnumC15915.ZSTD.m37681(outputStream, i, j);
            case 12:
                return EnumC15915.BZIP2.m37681(outputStream, i, j);
            case 13:
                return EnumC15915.LZ4.m37681(outputStream, i, j);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
