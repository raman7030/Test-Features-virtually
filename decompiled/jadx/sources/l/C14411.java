package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: FC0P */
/* JADX INFO: loaded from: classes3.dex */
public final class C14411 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17940[] f44172;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC14406[] f44173;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23579[] f44174;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23579[] f44175 = {EnumC3824.CREATE, EnumC3824.TRUNCATE_EXISTING};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final EnumC14406[] f44176;

    static {
        EnumC3824 enumC3824 = EnumC3824.APPEND;
        f44172 = new InterfaceC17940[0];
        f44173 = new EnumC14406[0];
        f44176 = new EnumC14406[]{EnumC14406.NOFOLLOW_LINKS};
        f44174 = new InterfaceC23579[0];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC13726 m34436(InterfaceC20758 interfaceC20758, EnumC14406[] enumC14406Arr, InterfaceC17940... interfaceC17940Arr) throws Throwable {
        InterfaceC3118 interfaceC3118;
        InterfaceC15111 attributes;
        if (C17229.isDirectory(interfaceC20758, enumC14406Arr)) {
            C17234 c17234 = new C17234(C7377.m19831(), enumC14406Arr, interfaceC17940Arr, new String[0]);
            C17229.walkFileTree(interfaceC20758, c17234);
            return c17234.m38904();
        }
        if (C17229.isDirectory(interfaceC20758, enumC14406Arr)) {
            throw new NoSuchFileException(interfaceC20758.toString());
        }
        InterfaceC13726 interfaceC13726M19831 = C7377.m19831();
        long size = 0;
        long size2 = (!m34437(interfaceC20758, enumC14406Arr) || C17229.isSymbolicLink(interfaceC20758)) ? 0L : C17229.size(interfaceC20758);
        try {
            if (C17229.deleteIfExists(interfaceC20758)) {
                C10200 c10200 = (C10200) interfaceC13726M19831;
                c10200.mo25604().mo16706();
                c10200.m25605().add(size2);
                return interfaceC13726M19831;
            }
        } catch (AccessDeniedException unused) {
        }
        InterfaceC3118 interfaceC3119 = null;
        InterfaceC20758 parent = interfaceC20758 == null ? null : interfaceC20758.getParent();
        try {
            if (C16958.of((Object[]) interfaceC17940Arr).anyMatch(new C21870(3))) {
                if (parent == null) {
                    attributes = null;
                } else {
                    try {
                        attributes = C17229.readAttributes(parent, InterfaceC3118.class, enumC14406Arr);
                    } catch (IOException | UnsupportedOperationException unused2) {
                        attributes = null;
                    }
                }
                interfaceC3118 = (InterfaceC3118) attributes;
                try {
                    m34438(interfaceC20758, enumC14406Arr);
                    interfaceC3119 = interfaceC3118;
                } catch (Throwable th) {
                    th = th;
                    if (interfaceC3118 != null) {
                        C17229.setPosixFilePermissions(parent, interfaceC3118.permissions());
                    }
                    throw th;
                }
            }
            if (m34437(interfaceC20758, enumC14406Arr) && !C17229.isSymbolicLink(interfaceC20758)) {
                size = C17229.size(interfaceC20758);
            }
            if (C17229.deleteIfExists(interfaceC20758)) {
                C10200 c10201 = (C10200) interfaceC13726M19831;
                c10201.mo25604().mo16706();
                c10201.m25605().add(size);
            }
            if (interfaceC3119 != null) {
                C17229.setPosixFilePermissions(parent, interfaceC3119.permissions());
            }
            return interfaceC13726M19831;
        } catch (Throwable th2) {
            th = th2;
            interfaceC3118 = interfaceC3119;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34437(InterfaceC20758 interfaceC20758, EnumC14406... enumC14406Arr) {
        if (interfaceC20758 != null) {
            if (enumC14406Arr != null) {
                if (C17229.exists(interfaceC20758, enumC14406Arr)) {
                    return true;
                }
            } else if (C17229.exists(interfaceC20758, new EnumC14406[0])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34438(InterfaceC20758 interfaceC20758, EnumC14406... enumC14406Arr) throws IOException {
        try {
            InterfaceC21463 interfaceC21463 = (InterfaceC21463) C17229.getFileAttributeView(interfaceC20758, InterfaceC21463.class, enumC14406Arr);
            if (interfaceC21463 != null) {
                interfaceC21463.setReadOnly(false);
                return;
            }
        } catch (IOException unused) {
        }
        InterfaceC15111 attributes = null;
        InterfaceC20758 parent = interfaceC20758 == null ? null : interfaceC20758.getParent();
        if (m34437(parent, enumC14406Arr)) {
            if (parent != null) {
                try {
                    attributes = C17229.readAttributes(parent, InterfaceC3118.class, enumC14406Arr);
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            }
            if (((InterfaceC3118) attributes) != null) {
                List listAsList = Arrays.asList(EnumC12995.OWNER_WRITE, EnumC12995.OWNER_EXECUTE);
                if (parent != null) {
                    Set posixFilePermissions = C17229.getPosixFilePermissions(parent, enumC14406Arr);
                    HashSet hashSet = new HashSet(posixFilePermissions);
                    hashSet.addAll(listAsList);
                    if (hashSet.equals(posixFilePermissions)) {
                        return;
                    }
                    C17229.setPosixFilePermissions(parent, hashSet);
                    return;
                }
                return;
            }
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s', linkOptions %s", interfaceC20758, Arrays.toString(enumC14406Arr)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OutputStream m34435(InterfaceC20758 interfaceC20758) {
        EnumC14406[] enumC14406Arr = f44173;
        if (!m34437(interfaceC20758, enumC14406Arr)) {
            InterfaceC20758 symbolicLink = null;
            EnumC14406 enumC14406 = (enumC14406Arr == null || enumC14406Arr.length <= 0) ? null : enumC14406Arr[0];
            InterfaceC22168[] interfaceC22168Arr = new InterfaceC22168[0];
            InterfaceC20758 parent = interfaceC20758 == null ? null : interfaceC20758.getParent();
            if (enumC14406 != EnumC14406.NOFOLLOW_LINKS) {
                if (parent != null) {
                    symbolicLink = C17229.isSymbolicLink(parent) ? C17229.readSymbolicLink(parent) : parent;
                }
                parent = symbolicLink;
            }
            if (parent != null) {
                if (!(enumC14406 == null ? C17229.exists(parent, new EnumC14406[0]) : C17229.exists(parent, enumC14406))) {
                    C17229.createDirectories(parent, interfaceC22168Arr);
                }
            }
        }
        InterfaceC23579[] interfaceC23579Arr = f44175;
        InterfaceC23579[] interfaceC23579Arr2 = f44174;
        if (interfaceC23579Arr == null) {
            interfaceC23579Arr = interfaceC23579Arr2;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(interfaceC23579Arr));
        arrayList.addAll(Arrays.asList(enumC14406Arr));
        return C17229.newOutputStream(interfaceC20758, (InterfaceC23579[]) arrayList.toArray(interfaceC23579Arr2));
    }
}
