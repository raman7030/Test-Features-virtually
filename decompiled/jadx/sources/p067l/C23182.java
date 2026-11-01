package p067l;

import net.p069sf.sevenzipjbinding.ArchiveFormat;

/* JADX INFO: renamed from: l.᩸᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B7C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23182 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int[] f72824;

    static {
        int[] iArr = new int[ArchiveFormat.values().length];
        f72824 = iArr;
        try {
            iArr[ArchiveFormat.SEVEN_ZIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f72824[ArchiveFormat.ZIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f72824[ArchiveFormat.BZIP2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f72824[ArchiveFormat.GZIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f72824[ArchiveFormat.TAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
