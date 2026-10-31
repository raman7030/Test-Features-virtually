package l;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/* JADX INFO: renamed from: l.ۖܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U42P */
/* JADX INFO: loaded from: classes2.dex */
public class C2672 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1344 f8375 = new C1344();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C1344 m8365() {
        return this.f8375;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC20758 mo8367(InterfaceC20758 interfaceC20758) {
        try {
            return interfaceC20758.toRealPath(new EnumC14406[0]);
        } catch (IOException unused) {
            return interfaceC20758.toAbsolutePath().normalize();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo8366(InterfaceC20758 interfaceC20758) {
        return C17229.exists(interfaceC20758, new EnumC14406[0]);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo8369(InterfaceC20758 interfaceC20758) {
        return C17229.isRegularFile(interfaceC20758, new EnumC14406[0]);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List mo8368(InterfaceC20758 interfaceC20758) throws IOException {
        JarFile jarFile = new JarFile(interfaceC20758.toFile());
        try {
            Manifest manifest = jarFile.getManifest();
            if (manifest == null) {
                List list = Collections.EMPTY_LIST;
                jarFile.close();
                return list;
            }
            Attributes mainAttributes = manifest.getMainAttributes();
            if (mainAttributes == null) {
                List list2 = Collections.EMPTY_LIST;
                jarFile.close();
                return list2;
            }
            String value = mainAttributes.getValue(Attributes.Name.CLASS_PATH);
            if (value == null) {
                List list3 = Collections.EMPTY_LIST;
                jarFile.close();
                return list3;
            }
            ArrayList arrayList = new ArrayList();
            URL url = interfaceC20758.toUri().toURL();
            StringTokenizer stringTokenizer = new StringTokenizer(value);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URL url2 = new URL(url, strNextToken);
                    if (strNextToken.indexOf(58) >= 0 && !"file".equalsIgnoreCase(url2.getProtocol())) {
                        url2 = null;
                    }
                    if (url2 != null) {
                        arrayList.add(C6646.of(url2.toURI()));
                    }
                } catch (URISyntaxException e) {
                    throw new IOException(e);
                }
            }
            jarFile.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                jarFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
