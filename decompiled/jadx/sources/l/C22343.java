package l;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩹ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes.dex */
public final class C22343 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20758 f72401;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20758 f72402;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2446 f72404;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2672 f72409;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72410;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22364 f72411;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f72405 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f72403 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Map f72407 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f72408 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumMap f72406 = new EnumMap(EnumC0121.class);

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50079(C22343 c22343, Collection collection, InterfaceC20758 interfaceC20758) {
        InterfaceC20758 interfaceC20759;
        c22343.getClass();
        if (collection != null) {
            if (interfaceC20758.getFileSystem().provider() == c22343.f72409.m8365()) {
                URI uri = interfaceC20758.toUri();
                if (uri.getScheme().equals("jar")) {
                    String schemeSpecificPart = uri.getSchemeSpecificPart();
                    int iLastIndexOf = schemeSpecificPart.lastIndexOf("!");
                    if (!schemeSpecificPart.startsWith("file:") || iLastIndexOf <= 0) {
                        interfaceC20759 = null;
                    } else {
                        interfaceC20759 = C8763.get(URI.create(schemeSpecificPart.substring(0, iLastIndexOf)));
                    }
                } else {
                    interfaceC20759 = null;
                }
            } else {
                interfaceC20759 = null;
            }
            InterfaceC20758 interfaceC20758M50077 = m50077(interfaceC20758);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                InterfaceC20758 interfaceC20758M50078 = m50077((InterfaceC20758) it.next());
                if (interfaceC20758M50078.getFileSystem() == interfaceC20758M50077.getFileSystem() && C17229.isDirectory(interfaceC20758M50078, new EnumC14406[0]) && interfaceC20758M50077.startsWith(interfaceC20758M50078)) {
                    return true;
                }
                if (interfaceC20759 != null && C17229.isSameFile(interfaceC20759, interfaceC20758M50078)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50080(C22343 c22343, InterfaceC20758 interfaceC20758) {
        c22343.getClass();
        String lowerCase = interfaceC20758.getFileName().toString().toLowerCase(Locale.US);
        if (c22343.f72409.mo8369(interfaceC20758)) {
            return lowerCase.endsWith(".jar") || lowerCase.endsWith(".zip");
        }
        return false;
    }

    static {
        InterfaceC20758 path = C1707.getDefault().getPath(System.getProperty("java.home"), new String[0]);
        f72402 = path;
        f72401 = path.resolve("lib").resolve("modules");
    }

    public C22343() {
        AbstractC13959[] abstractC13959Arr = {new C7610(this), new C1882(this), new C8232(this, EnumC21101.SOURCE_PATH, EnumC0121.f1179), new C8232(this, EnumC21101.ANNOTATION_PROCESSOR_PATH, EnumC0121.f1181), new C8232(this, EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH, EnumC0121.f1155), new C18816(this, EnumC21101.CLASS_OUTPUT, EnumC0121.f1209), new C18816(this, EnumC21101.SOURCE_OUTPUT, EnumC0121.f1196), new C18816(this, EnumC21101.NATIVE_HEADER_OUTPUT, EnumC0121.f1197), new C8938(this), new C19522(this), new C23754(this, EnumC21101.UPGRADE_MODULE_PATH, EnumC0121.f1198), new C23754(this, EnumC21101.MODULE_PATH, EnumC0121.f1207), new C21638(this)};
        for (int i = 0; i < 13; i++) {
            AbstractC13959 abstractC13959 = abstractC13959Arr[i];
            this.f72408.put(abstractC13959.f41661, abstractC13959);
            Iterator it = abstractC13959.f41662.iterator();
            while (it.hasNext()) {
                this.f72406.put((EnumC0121) it.next(), abstractC13959);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m50086(String str, String... strArr) {
        try {
            return C8763.get(str, strArr);
        } catch (InvalidPathException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50087() throws IOException {
        C18837 c18837 = new C18837();
        C19846.forEach(this.f72403, new C1038(1, c18837));
        if (c18837.m43518()) {
            IOException iOException = new IOException();
            Iterator it = c18837.iterator();
            while (it.hasNext()) {
                iOException.addSuppressed((IOException) it.next());
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50089(C22364 c22364, boolean z, C2672 c2672) {
        this.f72411 = c22364;
        this.f72410 = z;
        this.f72409 = c2672;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18837 m50075(C22343 c22343, String str) {
        return c22343.m50074(str, (InterfaceC20758) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18837 m50074(String str, InterfaceC20758 interfaceC20758) {
        C18837 c18837 = new C18837();
        for (String str2 : str.split(Pattern.quote(File.pathSeparator), -1)) {
            if (!str2.isEmpty()) {
                try {
                    c18837.m43511(m50086(str2, new String[0]));
                } catch (IllegalArgumentException unused) {
                    if (this.f72410) {
                        C22364 c22364 = this.f72411;
                        EnumC20347 enumC20347 = EnumC20347.PATH;
                        C11076 c11076 = C14001.f42334;
                        c22364.m7282(enumC20347, new C11076("compiler", "invalid.path", str2));
                    }
                }
            } else if (interfaceC20758 != null) {
                c18837.m43511(interfaceC20758);
            }
        }
        return c18837;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50088(String str) {
        this.f72407 = Collections.singletonMap("releaseVersion", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11055 m50085(InterfaceC2050 interfaceC2050) {
        C11003.requireNonNull(interfaceC2050);
        return interfaceC2050 instanceof AbstractC11055 ? (AbstractC11055) interfaceC2050 : (AbstractC11055) this.f72408.get(interfaceC2050);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m50077(InterfaceC20758 interfaceC20758) {
        try {
            return interfaceC20758.toRealPath(new EnumC14406[0]);
        } catch (IOException unused) {
            return interfaceC20758.toAbsolutePath().normalize();
        }
    }
}
