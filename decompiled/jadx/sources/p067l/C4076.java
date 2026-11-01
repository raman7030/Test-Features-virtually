package p067l;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: renamed from: l.֫ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P8JS */
/* JADX INFO: loaded from: classes2.dex */
public final class C4076 implements InterfaceC20446 {

    /* JADX INFO: renamed from: ܽ */
    public static final boolean f8974;

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f8975;

    /* JADX INFO: renamed from: ۧ */
    public final UUID f8976;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f8974 = z;
    }

    public C4076(UUID uuid, byte[] bArr) {
        this.f8976 = uuid;
        this.f8975 = bArr;
    }
}
