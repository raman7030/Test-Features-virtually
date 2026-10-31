package l;

import java.net.URI;
import java.nio.file.FileSystemNotFoundException;

/* JADX INFO: renamed from: l.ۜ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6646 {
    public static InterfaceC20758 of(String str, String... strArr) {
        return C1707.getDefault().getPath(str, strArr);
    }

    public static InterfaceC20758 of(URI uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            throw new IllegalArgumentException("Missing scheme");
        }
        if (scheme.equalsIgnoreCase("file")) {
            return C1707.getDefault().provider().getPath(uri);
        }
        for (AbstractC13389 abstractC13389 : AbstractC13389.d()) {
            if (abstractC13389.getScheme().equalsIgnoreCase(scheme)) {
                return abstractC13389.getPath(uri);
            }
        }
        throw new FileSystemNotFoundException("Provider \"" + scheme + "\" not installed");
    }
}
