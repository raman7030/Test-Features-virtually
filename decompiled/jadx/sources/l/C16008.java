package l;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74D */
/* JADX INFO: loaded from: classes5.dex */
public final class C16008 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C16008 f49387 = new C16008();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C8954 f49386 = new C8954(0);

    @Override // l.InterfaceC21449
    public final void close() {
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return null;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        return Collections.EMPTY_MAP;
    }
}
