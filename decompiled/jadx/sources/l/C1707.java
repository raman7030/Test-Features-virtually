package l;

import java.net.URI;
import java.nio.file.ProviderNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.֫۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1707 {
    public static AbstractC7145 getDefault() {
        return AbstractC18329.a;
    }

    public static AbstractC7145 getFileSystem(URI uri) {
        String scheme = uri.getScheme();
        for (AbstractC13389 abstractC13389 : AbstractC13389.d()) {
            if (scheme.equalsIgnoreCase(abstractC13389.getScheme())) {
                return abstractC13389.getFileSystem(uri);
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC7145 newFileSystem(URI uri, Map map) {
        return newFileSystem(uri, map, null);
    }

    public static AbstractC7145 newFileSystem(URI uri, Map map, ClassLoader classLoader) {
        String scheme = uri.getScheme();
        for (AbstractC13389 abstractC13389 : AbstractC13389.d()) {
            if (scheme.equalsIgnoreCase(abstractC13389.getScheme())) {
                try {
                    return abstractC13389.newFileSystem(uri, map);
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        if (classLoader != null) {
            for (AbstractC13389 abstractC133810 : ServiceLoader.load(AbstractC13389.class, classLoader)) {
                if (scheme.equalsIgnoreCase(abstractC133810.getScheme())) {
                    try {
                        return abstractC133810.newFileSystem(uri, map);
                    } catch (UnsupportedOperationException unused2) {
                    }
                }
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC7145 newFileSystem(InterfaceC20758 interfaceC20758, ClassLoader classLoader) {
        interfaceC20758.getClass();
        Map map = Collections.EMPTY_MAP;
        Iterator it = AbstractC13389.d().iterator();
        while (it.hasNext()) {
            try {
                return ((AbstractC13389) it.next()).newFileSystem(interfaceC20758, map);
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (classLoader != null) {
            Iterator it2 = ServiceLoader.load(AbstractC13389.class, classLoader).iterator();
            while (it2.hasNext()) {
                try {
                    return ((AbstractC13389) it2.next()).newFileSystem(interfaceC20758, map);
                } catch (UnsupportedOperationException unused2) {
                }
            }
        }
        throw new ProviderNotFoundException("Provider not found");
    }
}
