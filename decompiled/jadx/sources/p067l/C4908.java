package p067l;

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
public class C4908 {

    /* JADX INFO: renamed from: ֫ */
    public C3646 f11170 = new C3646();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C3646 m10411() {
        return this.f11170;
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC22097 mo10413(InterfaceC22097 interfaceC22097) {
        try {
            return interfaceC22097.toRealPath(new EnumC16060[0]);
        } catch (IOException unused) {
            return interfaceC22097.toAbsolutePath().normalize();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo10412(InterfaceC22097 interfaceC22097) {
        return C18743.exists(interfaceC22097, new EnumC16060[0]);
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo10415(InterfaceC22097 interfaceC22097) {
        return C18743.isRegularFile(interfaceC22097, new EnumC16060[0]);
    }

    /* JADX INFO: renamed from: ܽ */
    public List mo10414(InterfaceC22097 interfaceC22097) throws IOException {
        JarFile jarFile = new JarFile(interfaceC22097.toFile());
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
            URL url = interfaceC22097.toUri().toURL();
            StringTokenizer stringTokenizer = new StringTokenizer(value);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URL url2 = new URL(url, strNextToken);
                    if (strNextToken.indexOf(58) >= 0 && !"file".equalsIgnoreCase(url2.getProtocol())) {
                        url2 = null;
                    }
                    if (url2 != null) {
                        arrayList.add(C8685.m20116of(url2.toURI()));
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
