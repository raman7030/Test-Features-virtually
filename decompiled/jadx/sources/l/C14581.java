package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14581 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23754 f44641;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f44642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f44644 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set f44643 = null;

    public C14581(C23754 c23754) {
        this.f44641 = c23754;
        this.f44642 = c23754.f25348.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        Set setSingleton;
        Set setSingleton2;
        Throwable th;
        InterfaceC20758 interfaceC20758;
        C23754 c23754 = this.f44641;
        InterfaceC2050 interfaceC2050 = c23754.f41661;
        C22343 c22343 = c23754.f76900;
        int i = 1;
        if (this.f44643 != null) {
            return true;
        }
        while (this.f44643 == null) {
            Iterator it = this.f44642;
            int i2 = 0;
            if (!it.hasNext()) {
                return false;
            }
            InterfaceC20758 interfaceC20759 = (InterfaceC20758) it.next();
            String str = "[";
            String str2 = ":";
            String str3 = "]";
            if (C17229.isDirectory(interfaceC20759, new EnumC14406[0])) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    DirectoryStream directoryStreamNewDirectoryStream = C17229.newDirectoryStream(interfaceC20759);
                    try {
                        Iterator it2 = directoryStreamNewDirectoryStream.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                interfaceC20758 = null;
                                break;
                            }
                            try {
                                interfaceC20758 = (InterfaceC20758) it2.next();
                                if (interfaceC20758.endsWith("module-info.class")) {
                                    break;
                                }
                                linkedHashSet.add(interfaceC20758);
                            } catch (Throwable th2) {
                                th = th2;
                                if (directoryStreamNewDirectoryStream != null) {
                                    try {
                                        try {
                                            directoryStreamNewDirectoryStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                    } catch (IOException | DirectoryIteratorException unused) {
                                        C22364 c22364 = c22343.f72411;
                                        C12281 c12281 = C6241.f19132;
                                        c22364.m7276(new C12281("compiler", "locn.cant.read.directory", interfaceC20759));
                                        setSingleton2 = Collections.EMPTY_SET;
                                        this.f44643 = setSingleton2;
                                        this.f44644++;
                                        c23754 = c23754;
                                        i = 1;
                                    }
                                }
                                throw th;
                            }
                        }
                        directoryStreamNewDirectoryStream.close();
                        if (interfaceC20758 != null) {
                            try {
                                String strM34829 = m34829(interfaceC20758);
                                setSingleton2 = Collections.singleton(new C16698(c22343, c23754, interfaceC2050.getName() + "[" + this.f44644 + ":" + strM34829 + "]", strM34829, Collections.singletonList(interfaceC20759), false));
                            } catch (IOException unused2) {
                                c22343.f72411.m7276(C6241.m17191(interfaceC20759));
                                setSingleton2 = Collections.EMPTY_SET;
                            } catch (C15850 unused3) {
                                C22364 c22365 = c22343.f72411;
                                C12281 c12282 = C6241.f19132;
                                Object[] objArr = new Object[i];
                                objArr[0] = interfaceC20759;
                                c22365.m7276(new C12281("compiler", "locn.bad.module-info", objArr));
                                setSingleton2 = Collections.EMPTY_SET;
                            }
                            c23754 = c23754;
                        } else {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                C23069 c23069M34828 = m34828((InterfaceC20758) it3.next());
                                if (c23069M34828 != null) {
                                    String str4 = (String) c23069M34828.f74207;
                                    linkedHashSet2.add(new C16698(c22343, c23754, interfaceC2050.getName() + str + this.f44644 + "." + i2 + str2 + str4 + str3, str4, Collections.singletonList((InterfaceC20758) c23069M34828.f74208), false));
                                    str2 = str2;
                                    str = str;
                                    str3 = str3;
                                    i2++;
                                    c23754 = c23754;
                                    it3 = it3;
                                }
                            }
                            c23754 = c23754;
                            setSingleton2 = linkedHashSet2;
                        }
                        this.f44643 = setSingleton2;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException | DirectoryIteratorException unused4) {
                    c23754 = c23754;
                }
            } else {
                c23754 = c23754;
                C23069 c23069M34829 = m34828(interfaceC20759);
                if (c23069M34829 == null) {
                    setSingleton = Collections.EMPTY_SET;
                } else {
                    String str5 = (String) c23069M34829.f74207;
                    setSingleton = Collections.singleton(new C16698(c22343, c23754, interfaceC2050.getName() + "[" + this.f44644 + ":" + str5 + "]", str5, Collections.singletonList((InterfaceC20758) c23069M34829.f74208), false));
                }
                this.f44643 = setSingleton;
            }
            this.f44644++;
            c23754 = c23754;
            i = 1;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        hasNext();
        Set set = this.f44643;
        if (set != null) {
            this.f44643 = null;
            return set;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23069 m34828(InterfaceC20758 interfaceC20758) throws Throwable {
        String value;
        boolean zM10693;
        C22343 c22343 = this.f44641.f76900;
        if (C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
            if (C17229.exists(interfaceC20758.resolve("module-info.class"), new EnumC14406[0]) || C17229.exists(interfaceC20758.resolve("module-info.sig"), new EnumC14406[0])) {
                String string = interfaceC20758.getFileName().toString();
                if (EnumC3503.m10693(string)) {
                    return new C23069(string, interfaceC20758);
                }
            }
            return null;
        }
        if (!interfaceC20758.getFileName().toString().endsWith(".jar") || !c22343.f72409.mo8366(interfaceC20758)) {
            if (interfaceC20758.getFileName().toString().endsWith(".jmod")) {
                try {
                    C9812.m24845(interfaceC20758);
                    if (((AbstractC7145) c22343.f72405.get(interfaceC20758)) == null) {
                        C1344 c1344M8365 = c22343.f72409.m8365();
                        if (c1344M8365 == null) {
                            c22343.f72411.m7276(C6241.m17191(interfaceC20758));
                            return null;
                        }
                        AbstractC7145 abstractC7145NewFileSystem = c1344M8365.newFileSystem(interfaceC20758, Collections.EMPTY_MAP);
                        try {
                            String strM34829 = m34829(abstractC7145NewFileSystem.getPath("classes/module-info.class", new String[0]));
                            InterfaceC20758 path = abstractC7145NewFileSystem.getPath("classes", new String[0]);
                            c22343.f72405.put(interfaceC20758, abstractC7145NewFileSystem);
                            c22343.f72403.add(abstractC7145NewFileSystem);
                            try {
                                return new C23069(strM34829, path);
                            } catch (Throwable th) {
                                th = th;
                                abstractC7145NewFileSystem = null;
                                if (abstractC7145NewFileSystem != null) {
                                    abstractC7145NewFileSystem.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (IOException unused) {
                    c22343.f72411.m7276(C6241.m17191(interfaceC20758));
                    return null;
                } catch (C15850 unused2) {
                    C22364 c22364 = c22343.f72411;
                    C12281 c12281 = C6241.f19132;
                    c22364.m7276(new C12281("compiler", "locn.bad.module-info", interfaceC20758));
                }
            }
            boolean unused3 = c22343.f72410;
            return null;
        }
        C1344 c1344M8366 = c22343.f72409.m8365();
        if (c1344M8366 == null) {
            C22364 c22365 = c22343.f72411;
            C12281 c12282 = C6241.f19132;
            c22365.m7276(new C12281("compiler", "no.zipfs.for.archive", interfaceC20758));
            return null;
        }
        try {
            AbstractC7145 abstractC7145NewFileSystem2 = c1344M8366.newFileSystem(interfaceC20758, c22343.f72407);
            try {
                InterfaceC20758 path2 = abstractC7145NewFileSystem2.getPath("module-info.class", new String[0]);
                if (C17229.exists(path2, new EnumC14406[0])) {
                    C23069 c23069 = new C23069(m34829(path2), interfaceC20758);
                    abstractC7145NewFileSystem2.close();
                    return c23069;
                }
                InterfaceC20758 path3 = abstractC7145NewFileSystem2.getPath("META-INF/MANIFEST.MF", new String[0]);
                if (C17229.exists(path3, new EnumC14406[0])) {
                    InputStream inputStreamNewInputStream = C17229.newInputStream(path3, new InterfaceC23579[0]);
                    try {
                        Attributes mainAttributes = new Manifest(inputStreamNewInputStream).getMainAttributes();
                        if (mainAttributes != null && (value = mainAttributes.getValue(new Attributes.Name("Automatic-Module-Name"))) != null) {
                            int i = 0;
                            while (true) {
                                int iIndexOf = value.indexOf(46, i);
                                if (iIndexOf == -1) {
                                    zM10693 = EnumC3503.m10693(value.substring(i));
                                    break;
                                }
                                if (!EnumC3503.m10693(value.substring(i, iIndexOf))) {
                                    zM10693 = false;
                                    break;
                                }
                                i = iIndexOf + 1;
                            }
                            if (zM10693) {
                                C23069 c230610 = new C23069(value, interfaceC20758);
                                if (inputStreamNewInputStream != null) {
                                    inputStreamNewInputStream.close();
                                }
                                abstractC7145NewFileSystem2.close();
                                return c230610;
                            }
                            C22364 c22366 = c22343.f72411;
                            C12281 c12283 = C6241.f19132;
                            c22366.m7276(new C12281("compiler", "locn.cant.get.module.name.for.jar", interfaceC20758));
                            if (inputStreamNewInputStream != null) {
                                inputStreamNewInputStream.close();
                            }
                            abstractC7145NewFileSystem2.close();
                            return null;
                        }
                        if (inputStreamNewInputStream != null) {
                            inputStreamNewInputStream.close();
                        }
                    } catch (Throwable th3) {
                        if (inputStreamNewInputStream != null) {
                            try {
                                inputStreamNewInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                abstractC7145NewFileSystem2.close();
                String strM36561 = C15472.m36561(4, 0, interfaceC20758.getFileName().toString());
                Matcher matcher = Pattern.compile("-(\\d+(\\.|$))").matcher(strM36561);
                if (matcher.find()) {
                    strM36561 = strM36561.substring(0, matcher.start());
                }
                String strReplaceAll = strM36561.replaceAll("[^A-Za-z0-9]", ".").replaceAll("(\\.)(\\1)+", ".").replaceAll("^\\.", "").replaceAll("\\.$", "");
                if (!strReplaceAll.isEmpty()) {
                    return new C23069(strReplaceAll, interfaceC20758);
                }
                C22364 c22367 = c22343.f72411;
                C12281 c12284 = C6241.f19132;
                c22367.m7276(new C12281("compiler", "locn.cant.get.module.name.for.jar", interfaceC20758));
                return null;
            } catch (Throwable th5) {
                try {
                    abstractC7145NewFileSystem2.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException unused4) {
            c22343.f72411.m7276(C6241.m17191(interfaceC20758));
            return null;
        } catch (C15850 unused5) {
            C22364 c22368 = c22343.f72411;
            C12281 c12285 = C6241.f19132;
            c22368.m7276(new C12281("compiler", "locn.bad.module-info", interfaceC20758));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m34829(InterfaceC20758 interfaceC20758) throws IOException {
        C22343 c22343 = this.f44641.f76900;
        if (c22343.f72404 == null) {
            c22343.f72404 = new C2446();
        }
        C2446 c2446 = c22343.f72404;
        c2446.getClass();
        InputStream inputStreamNewInputStream = C17229.newInputStream(interfaceC20758, new InterfaceC23579[0]);
        try {
            String strM7892 = c2446.m7892(inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return strM7892;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
