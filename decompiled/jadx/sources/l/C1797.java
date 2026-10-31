package l;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: renamed from: l.֫ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P8JS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1797 implements InterfaceC19021 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f6195;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f6196;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UUID f6197;

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
        f6195 = z;
    }

    public C1797(UUID uuid, byte[] bArr) {
        this.f6197 = uuid;
        this.f6196 = bArr;
    }
}
