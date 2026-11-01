package p067l;

import java.net.URI;
import java.nio.file.FileSystemNotFoundException;

/* JADX INFO: renamed from: l.ۜ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8685 {
    /* JADX INFO: renamed from: of */
    public static InterfaceC22097 m20115of(String str, String... strArr) {
        return C3991.getDefault().getPath(str, strArr);
    }

    /* JADX INFO: renamed from: of */
    public static InterfaceC22097 m20116of(URI uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            throw new IllegalArgumentException("Missing scheme");
        }
        if (scheme.equalsIgnoreCase("file")) {
            return C3991.getDefault().provider().getPath(uri);
        }
        for (AbstractC15094 abstractC15094 : AbstractC15094.m34488d()) {
            if (abstractC15094.getScheme().equalsIgnoreCase(scheme)) {
                return abstractC15094.getPath(uri);
            }
        }
        throw new FileSystemNotFoundException("Provider \"" + scheme + "\" not installed");
    }
}
