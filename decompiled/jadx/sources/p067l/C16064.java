package p067l;

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
public final class C16064 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC19418[] f47266;

    /* JADX INFO: renamed from: ۧ */
    public static final EnumC16060[] f47267;

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC24778[] f47268;

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC24778[] f47269 = {EnumC6003.CREATE, EnumC6003.TRUNCATE_EXISTING};

    /* JADX INFO: renamed from: ᩳ */
    @Deprecated
    public static final EnumC16060[] f47270;

    static {
        EnumC6003 enumC6003 = EnumC6003.APPEND;
        f47266 = new InterfaceC19418[0];
        f47267 = new EnumC16060[0];
        f47270 = new EnumC16060[]{EnumC16060.NOFOLLOW_LINKS};
        f47268 = new InterfaceC24778[0];
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC15413 m36569(InterfaceC22097 interfaceC22097, EnumC16060[] enumC16060Arr, InterfaceC19418... interfaceC19418Arr) throws Throwable {
        InterfaceC5332 interfaceC5332;
        InterfaceC16730 attributes;
        if (C18743.isDirectory(interfaceC22097, enumC16060Arr)) {
            C18747 c18747 = new C18747(C9379.m21804(), enumC16060Arr, interfaceC19418Arr, new String[0]);
            C18743.walkFileTree(interfaceC22097, c18747);
            return c18747.m41130();
        }
        if (C18743.isDirectory(interfaceC22097, enumC16060Arr)) {
            throw new NoSuchFileException(interfaceC22097.toString());
        }
        InterfaceC15413 interfaceC15413M21804 = C9379.m21804();
        long size = 0;
        long size2 = (!m36570(interfaceC22097, enumC16060Arr) || C18743.isSymbolicLink(interfaceC22097)) ? 0L : C18743.size(interfaceC22097);
        try {
            if (C18743.deleteIfExists(interfaceC22097)) {
                C12062 c12062 = (C12062) interfaceC15413M21804;
                c12062.mo27626().mo18632();
                c12062.m27627().add(size2);
                return interfaceC15413M21804;
            }
        } catch (AccessDeniedException unused) {
        }
        InterfaceC5332 interfaceC5333 = null;
        InterfaceC22097 parent = interfaceC22097 == null ? null : interfaceC22097.getParent();
        try {
            if (C18486.m42024of((Object[]) interfaceC19418Arr).anyMatch(new C23154(3))) {
                if (parent == null) {
                    attributes = null;
                } else {
                    try {
                        attributes = C18743.readAttributes(parent, InterfaceC5332.class, enumC16060Arr);
                    } catch (IOException | UnsupportedOperationException unused2) {
                        attributes = null;
                    }
                }
                interfaceC5332 = (InterfaceC5332) attributes;
                try {
                    m36571(interfaceC22097, enumC16060Arr);
                    interfaceC5333 = interfaceC5332;
                } catch (Throwable th) {
                    th = th;
                    if (interfaceC5332 != null) {
                        C18743.setPosixFilePermissions(parent, interfaceC5332.permissions());
                    }
                    throw th;
                }
            }
            if (m36570(interfaceC22097, enumC16060Arr) && !C18743.isSymbolicLink(interfaceC22097)) {
                size = C18743.size(interfaceC22097);
            }
            if (C18743.deleteIfExists(interfaceC22097)) {
                C12062 c12063 = (C12062) interfaceC15413M21804;
                c12063.mo27626().mo18632();
                c12063.m27627().add(size);
            }
            if (interfaceC5333 != null) {
                C18743.setPosixFilePermissions(parent, interfaceC5333.permissions());
            }
            return interfaceC15413M21804;
        } catch (Throwable th2) {
            th = th2;
            interfaceC5332 = interfaceC5333;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36570(InterfaceC22097 interfaceC22097, EnumC16060... enumC16060Arr) {
        if (interfaceC22097 != null) {
            if (enumC16060Arr != null) {
                if (C18743.exists(interfaceC22097, enumC16060Arr)) {
                    return true;
                }
            } else if (C18743.exists(interfaceC22097, new EnumC16060[0])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m36571(InterfaceC22097 interfaceC22097, EnumC16060... enumC16060Arr) throws IOException {
        try {
            InterfaceC22767 interfaceC22767 = (InterfaceC22767) C18743.getFileAttributeView(interfaceC22097, InterfaceC22767.class, enumC16060Arr);
            if (interfaceC22767 != null) {
                interfaceC22767.setReadOnly(false);
                return;
            }
        } catch (IOException unused) {
        }
        InterfaceC16730 attributes = null;
        InterfaceC22097 parent = interfaceC22097 == null ? null : interfaceC22097.getParent();
        if (m36570(parent, enumC16060Arr)) {
            if (parent != null) {
                try {
                    attributes = C18743.readAttributes(parent, InterfaceC5332.class, enumC16060Arr);
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            }
            if (((InterfaceC5332) attributes) != null) {
                List listAsList = Arrays.asList(EnumC14719.OWNER_WRITE, EnumC14719.OWNER_EXECUTE);
                if (parent != null) {
                    Set posixFilePermissions = C18743.getPosixFilePermissions(parent, enumC16060Arr);
                    HashSet hashSet = new HashSet(posixFilePermissions);
                    hashSet.addAll(listAsList);
                    if (hashSet.equals(posixFilePermissions)) {
                        return;
                    }
                    C18743.setPosixFilePermissions(parent, hashSet);
                    return;
                }
                return;
            }
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s', linkOptions %s", interfaceC22097, Arrays.toString(enumC16060Arr)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static OutputStream m36568(InterfaceC22097 interfaceC22097) {
        EnumC16060[] enumC16060Arr = f47267;
        if (!m36570(interfaceC22097, enumC16060Arr)) {
            InterfaceC22097 symbolicLink = null;
            EnumC16060 enumC16060 = (enumC16060Arr == null || enumC16060Arr.length <= 0) ? null : enumC16060Arr[0];
            InterfaceC23437[] interfaceC23437Arr = new InterfaceC23437[0];
            InterfaceC22097 parent = interfaceC22097 == null ? null : interfaceC22097.getParent();
            if (enumC16060 != EnumC16060.NOFOLLOW_LINKS) {
                if (parent != null) {
                    symbolicLink = C18743.isSymbolicLink(parent) ? C18743.readSymbolicLink(parent) : parent;
                }
                parent = symbolicLink;
            }
            if (parent != null) {
                if (!(enumC16060 == null ? C18743.exists(parent, new EnumC16060[0]) : C18743.exists(parent, enumC16060))) {
                    C18743.createDirectories(parent, interfaceC23437Arr);
                }
            }
        }
        InterfaceC24778[] interfaceC24778Arr = f47269;
        InterfaceC24778[] interfaceC24778Arr2 = f47268;
        if (interfaceC24778Arr == null) {
            interfaceC24778Arr = interfaceC24778Arr2;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(interfaceC24778Arr));
        arrayList.addAll(Arrays.asList(enumC16060Arr));
        return C18743.newOutputStream(interfaceC22097, (InterfaceC24778[]) arrayList.toArray(interfaceC24778Arr2));
    }
}
