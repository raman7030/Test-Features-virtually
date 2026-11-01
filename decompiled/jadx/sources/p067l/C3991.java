package p067l;

import java.net.URI;
import java.nio.file.ProviderNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.֫۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3991 {
    public static AbstractC9159 getDefault() {
        return AbstractC19789.f60197a;
    }

    public static AbstractC9159 getFileSystem(URI uri) {
        String scheme = uri.getScheme();
        for (AbstractC15094 abstractC15094 : AbstractC15094.m34488d()) {
            if (scheme.equalsIgnoreCase(abstractC15094.getScheme())) {
                return abstractC15094.getFileSystem(uri);
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC9159 newFileSystem(URI uri, Map map) {
        return newFileSystem(uri, map, null);
    }

    public static AbstractC9159 newFileSystem(URI uri, Map map, ClassLoader classLoader) {
        String scheme = uri.getScheme();
        for (AbstractC15094 abstractC15094 : AbstractC15094.m34488d()) {
            if (scheme.equalsIgnoreCase(abstractC15094.getScheme())) {
                try {
                    return abstractC15094.newFileSystem(uri, map);
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        if (classLoader != null) {
            for (AbstractC15094 abstractC15095 : ServiceLoader.load(AbstractC15094.class, classLoader)) {
                if (scheme.equalsIgnoreCase(abstractC15095.getScheme())) {
                    try {
                        return abstractC15095.newFileSystem(uri, map);
                    } catch (UnsupportedOperationException unused2) {
                    }
                }
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC9159 newFileSystem(InterfaceC22097 interfaceC22097, ClassLoader classLoader) {
        interfaceC22097.getClass();
        Map map = Collections.EMPTY_MAP;
        Iterator it = AbstractC15094.m34488d().iterator();
        while (it.hasNext()) {
            try {
                return ((AbstractC15094) it.next()).newFileSystem(interfaceC22097, map);
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (classLoader != null) {
            Iterator it2 = ServiceLoader.load(AbstractC15094.class, classLoader).iterator();
            while (it2.hasNext()) {
                try {
                    return ((AbstractC15094) it2.next()).newFileSystem(interfaceC22097, map);
                } catch (UnsupportedOperationException unused2) {
                }
            }
        }
        throw new ProviderNotFoundException("Provider not found");
    }
}
