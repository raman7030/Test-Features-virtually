package l;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֫ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1925 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m6337(InterfaceC11098 interfaceC11098) {
        InputStream inputStream = interfaceC11098.getInputStream();
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
    }
}
