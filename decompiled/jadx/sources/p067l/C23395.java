package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 861N */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23395 {
    /* JADX INFO: renamed from: ֫ */
    public static void m52060(InterfaceC21384 interfaceC21384, int i) {
        int i2 = interfaceC21384.readInt();
        if (i2 != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52059(C14677 c14677, int i) {
        int iM33581 = c14677.m33581();
        if (iM33581 != i) {
            throw new IOException(String.format("Expected: 0x%04x, got: 0x%04x", Integer.valueOf(i), Integer.valueOf(iM33581)));
        }
    }
}
