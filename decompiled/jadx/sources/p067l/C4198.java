package p067l;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֫ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4198 {
    /* JADX INFO: renamed from: ֫ */
    public static InputStream m8510(InterfaceC12916 interfaceC12916) {
        InputStream inputStream = interfaceC12916.getInputStream();
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
    }
}
