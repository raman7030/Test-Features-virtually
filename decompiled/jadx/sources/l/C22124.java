package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 861N */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22124 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49722(InterfaceC20008 interfaceC20008, int i) {
        int i2 = interfaceC20008.readInt();
        if (i2 != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49721(C12951 c12951, int i) {
        int iM31494 = c12951.m31494();
        if (iM31494 != i) {
            throw new IOException(String.format("Expected: 0x%04x, got: 0x%04x", Integer.valueOf(i), Integer.valueOf(iM31494)));
        }
    }
}
