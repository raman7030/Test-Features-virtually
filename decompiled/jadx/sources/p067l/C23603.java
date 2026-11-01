package p067l;

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
public final class C23603 {

    /* JADX INFO: renamed from: ۡ */
    public static final InterfaceC22097 f75127;

    /* JADX INFO: renamed from: ۢ */
    public static final InterfaceC22097 f75128;

    /* JADX INFO: renamed from: ۜ */
    public C4693 f75130;

    /* JADX INFO: renamed from: ᩳ */
    public C4908 f75135;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f75136;

    /* JADX INFO: renamed from: ᩻ */
    public C23623 f75137;

    /* JADX INFO: renamed from: ۧ */
    public LinkedHashMap f75131 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f75129 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public Map f75133 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f75134 = new HashMap();

    /* JADX INFO: renamed from: ܳ */
    public EnumMap f75132 = new EnumMap(EnumC2483.class);

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m52418(C23603 c23603, Collection collection, InterfaceC22097 interfaceC22097) {
        InterfaceC22097 interfaceC22098;
        c23603.getClass();
        if (collection != null) {
            if (interfaceC22097.getFileSystem().provider() == c23603.f75135.m10411()) {
                URI uri = interfaceC22097.toUri();
                if (uri.getScheme().equals("jar")) {
                    String schemeSpecificPart = uri.getSchemeSpecificPart();
                    int iLastIndexOf = schemeSpecificPart.lastIndexOf("!");
                    if (!schemeSpecificPart.startsWith("file:") || iLastIndexOf <= 0) {
                        interfaceC22098 = null;
                    } else {
                        interfaceC22098 = C10697.get(URI.create(schemeSpecificPart.substring(0, iLastIndexOf)));
                    }
                } else {
                    interfaceC22098 = null;
                }
            } else {
                interfaceC22098 = null;
            }
            InterfaceC22097 interfaceC22097M52416 = m52416(interfaceC22097);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                InterfaceC22097 interfaceC22097M52417 = m52416((InterfaceC22097) it.next());
                if (interfaceC22097M52417.getFileSystem() == interfaceC22097M52416.getFileSystem() && C18743.isDirectory(interfaceC22097M52417, new EnumC16060[0]) && interfaceC22097M52416.startsWith(interfaceC22097M52417)) {
                    return true;
                }
                if (interfaceC22098 != null && C18743.isSameFile(interfaceC22098, interfaceC22097M52417)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52419(C23603 c23603, InterfaceC22097 interfaceC22097) {
        c23603.getClass();
        String lowerCase = interfaceC22097.getFileName().toString().toLowerCase(Locale.US);
        if (c23603.f75135.mo10415(interfaceC22097)) {
            return lowerCase.endsWith(".jar") || lowerCase.endsWith(".zip");
        }
        return false;
    }

    static {
        InterfaceC22097 path = C3991.getDefault().getPath(System.getProperty("java.home"), new String[0]);
        f75128 = path;
        f75127 = path.resolve("lib").resolve("modules");
    }

    public C23603() {
        AbstractC15635[] abstractC15635Arr = {new C9601(this), new C4157(this), new C10192(this, EnumC22423.SOURCE_PATH, EnumC2483.f3955), new C10192(this, EnumC22423.ANNOTATION_PROCESSOR_PATH, EnumC2483.f3957), new C10192(this, EnumC22423.ANNOTATION_PROCESSOR_MODULE_PATH, EnumC2483.f3931), new C20251(this, EnumC22423.CLASS_OUTPUT, EnumC2483.f3985), new C20251(this, EnumC22423.SOURCE_OUTPUT, EnumC2483.f3972), new C20251(this, EnumC22423.NATIVE_HEADER_OUTPUT, EnumC2483.f3973), new C10863(this), new C20922(this), new C24944(this, EnumC22423.UPGRADE_MODULE_PATH, EnumC2483.f3974), new C24944(this, EnumC22423.MODULE_PATH, EnumC2483.f3983), new C22933(this)};
        for (int i = 0; i < 13; i++) {
            AbstractC15635 abstractC15635 = abstractC15635Arr[i];
            this.f75134.put(abstractC15635.f44741, abstractC15635);
            Iterator it = abstractC15635.f44742.iterator();
            while (it.hasNext()) {
                this.f75132.put((EnumC2483) it.next(), abstractC15635);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 m52425(String str, String... strArr) {
        try {
            return C10697.get(str, strArr);
        } catch (InvalidPathException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52426() throws IOException {
        C20271 c20271 = new C20271();
        C21230.forEach(this.f75129, new C3355(1, c20271));
        if (c20271.m45784()) {
            IOException iOException = new IOException();
            Iterator it = c20271.iterator();
            while (it.hasNext()) {
                iOException.addSuppressed((IOException) it.next());
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52428(C23623 c23623, boolean z, C4908 c4908) {
        this.f75137 = c23623;
        this.f75136 = z;
        this.f75135 = c4908;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20271 m52414(C23603 c23603, String str) {
        return c23603.m52413(str, (InterfaceC22097) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public C20271 m52413(String str, InterfaceC22097 interfaceC22097) {
        C20271 c20271 = new C20271();
        for (String str2 : str.split(Pattern.quote(File.pathSeparator), -1)) {
            if (!str2.isEmpty()) {
                try {
                    c20271.m45777(m52425(str2, new String[0]));
                } catch (IllegalArgumentException unused) {
                    if (this.f75136) {
                        C23623 c23623 = this.f75137;
                        EnumC21706 enumC21706 = EnumC21706.PATH;
                        C12895 c12895 = C15675.f45417;
                        c23623.m9361(enumC21706, new C12895("compiler", "invalid.path", str2));
                    }
                }
            } else if (interfaceC22097 != null) {
                c20271.m45777(interfaceC22097);
            }
        }
        return c20271;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52427(String str) {
        this.f75133 = Collections.singletonMap("releaseVersion", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12875 m52424(InterfaceC4317 interfaceC4317) {
        C12826.requireNonNull(interfaceC4317);
        return interfaceC4317 instanceof AbstractC12875 ? (AbstractC12875) interfaceC4317 : (AbstractC12875) this.f75134.get(interfaceC4317);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC22097 m52416(InterfaceC22097 interfaceC22097) {
        try {
            return interfaceC22097.toRealPath(new EnumC16060[0]);
        } catch (IOException unused) {
            return interfaceC22097.toAbsolutePath().normalize();
        }
    }
}
