package p067l;

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
public final class C16226 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C24944 f47749;

    /* JADX INFO: renamed from: ᩶ */
    public Iterator f47750;

    /* JADX INFO: renamed from: ᩹ */
    public int f47752 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public Set f47751 = null;

    public C16226(C24944 c24944) {
        this.f47749 = c24944;
        this.f47750 = c24944.f28258.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        Set setSingleton;
        Set setSingleton2;
        Throwable th;
        InterfaceC22097 interfaceC22097;
        C24944 c24944 = this.f47749;
        InterfaceC4317 interfaceC4317 = c24944.f44741;
        C23603 c23603 = c24944.f79652;
        int i = 1;
        if (this.f47751 != null) {
            return true;
        }
        while (this.f47751 == null) {
            Iterator it = this.f47750;
            int i2 = 0;
            if (!it.hasNext()) {
                return false;
            }
            InterfaceC22097 interfaceC22098 = (InterfaceC22097) it.next();
            String str = "[";
            String str2 = ":";
            String str3 = "]";
            if (C18743.isDirectory(interfaceC22098, new EnumC16060[0])) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    DirectoryStream directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22098);
                    try {
                        Iterator it2 = directoryStreamNewDirectoryStream.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                interfaceC22097 = null;
                                break;
                            }
                            try {
                                interfaceC22097 = (InterfaceC22097) it2.next();
                                if (interfaceC22097.endsWith("module-info.class")) {
                                    break;
                                }
                                linkedHashSet.add(interfaceC22097);
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
                                        C23623 c23623 = c23603.f75137;
                                        C14040 c14040 = C8300.f21997;
                                        c23623.m9355(new C14040("compiler", "locn.cant.read.directory", interfaceC22098));
                                        setSingleton2 = Collections.EMPTY_SET;
                                        this.f47751 = setSingleton2;
                                        this.f47752++;
                                        c24944 = c24944;
                                        i = 1;
                                    }
                                }
                                throw th;
                            }
                        }
                        directoryStreamNewDirectoryStream.close();
                        if (interfaceC22097 != null) {
                            try {
                                String strM36980 = m36980(interfaceC22097);
                                setSingleton2 = Collections.singleton(new C18238(c23603, c24944, interfaceC4317.getName() + "[" + this.f47752 + ":" + strM36980 + "]", strM36980, Collections.singletonList(interfaceC22098), false));
                            } catch (IOException unused2) {
                                c23603.f75137.m9355(C8300.m19129(interfaceC22098));
                                setSingleton2 = Collections.EMPTY_SET;
                            } catch (C17432 unused3) {
                                C23623 c23624 = c23603.f75137;
                                C14040 c14041 = C8300.f21997;
                                Object[] objArr = new Object[i];
                                objArr[0] = interfaceC22098;
                                c23624.m9355(new C14040("compiler", "locn.bad.module-info", objArr));
                                setSingleton2 = Collections.EMPTY_SET;
                            }
                            c24944 = c24944;
                        } else {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                C24293 c24293M36979 = m36979((InterfaceC22097) it3.next());
                                if (c24293M36979 != null) {
                                    String str4 = (String) c24293M36979.f76952;
                                    linkedHashSet2.add(new C18238(c23603, c24944, interfaceC4317.getName() + str + this.f47752 + "." + i2 + str2 + str4 + str3, str4, Collections.singletonList((InterfaceC22097) c24293M36979.f76953), false));
                                    str2 = str2;
                                    str = str;
                                    str3 = str3;
                                    i2++;
                                    c24944 = c24944;
                                    it3 = it3;
                                }
                            }
                            c24944 = c24944;
                            setSingleton2 = linkedHashSet2;
                        }
                        this.f47751 = setSingleton2;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException | DirectoryIteratorException unused4) {
                    c24944 = c24944;
                }
            } else {
                c24944 = c24944;
                C24293 c24293M369710 = m36979(interfaceC22098);
                if (c24293M369710 == null) {
                    setSingleton = Collections.EMPTY_SET;
                } else {
                    String str5 = (String) c24293M369710.f76952;
                    setSingleton = Collections.singleton(new C18238(c23603, c24944, interfaceC4317.getName() + "[" + this.f47752 + ":" + str5 + "]", str5, Collections.singletonList((InterfaceC22097) c24293M369710.f76953), false));
                }
                this.f47751 = setSingleton;
            }
            this.f47752++;
            c24944 = c24944;
            i = 1;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        hasNext();
        Set set = this.f47751;
        if (set != null) {
            this.f47751 = null;
            return set;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ֫ */
    private C24293 m36979(InterfaceC22097 interfaceC22097) throws Throwable {
        String value;
        boolean zM12688;
        C23603 c23603 = this.f47749.f79652;
        if (C18743.isDirectory(interfaceC22097, new EnumC16060[0])) {
            if (C18743.exists(interfaceC22097.resolve("module-info.class"), new EnumC16060[0]) || C18743.exists(interfaceC22097.resolve("module-info.sig"), new EnumC16060[0])) {
                String string = interfaceC22097.getFileName().toString();
                if (EnumC5698.m12688(string)) {
                    return new C24293(string, interfaceC22097);
                }
            }
            return null;
        }
        if (!interfaceC22097.getFileName().toString().endsWith(".jar") || !c23603.f75135.mo10412(interfaceC22097)) {
            if (interfaceC22097.getFileName().toString().endsWith(".jmod")) {
                try {
                    C11694.m26860(interfaceC22097);
                    if (((AbstractC9159) c23603.f75131.get(interfaceC22097)) == null) {
                        C3646 c3646M10411 = c23603.f75135.m10411();
                        if (c3646M10411 == null) {
                            c23603.f75137.m9355(C8300.m19129(interfaceC22097));
                            return null;
                        }
                        AbstractC9159 abstractC9159NewFileSystem = c3646M10411.newFileSystem(interfaceC22097, Collections.EMPTY_MAP);
                        try {
                            String strM36980 = m36980(abstractC9159NewFileSystem.getPath("classes/module-info.class", new String[0]));
                            InterfaceC22097 path = abstractC9159NewFileSystem.getPath("classes", new String[0]);
                            c23603.f75131.put(interfaceC22097, abstractC9159NewFileSystem);
                            c23603.f75129.add(abstractC9159NewFileSystem);
                            try {
                                return new C24293(strM36980, path);
                            } catch (Throwable th) {
                                th = th;
                                abstractC9159NewFileSystem = null;
                                if (abstractC9159NewFileSystem != null) {
                                    abstractC9159NewFileSystem.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (IOException unused) {
                    c23603.f75137.m9355(C8300.m19129(interfaceC22097));
                    return null;
                } catch (C17432 unused2) {
                    C23623 c23623 = c23603.f75137;
                    C14040 c14040 = C8300.f21997;
                    c23623.m9355(new C14040("compiler", "locn.bad.module-info", interfaceC22097));
                }
            }
            boolean unused3 = c23603.f75136;
            return null;
        }
        C3646 c3646M10412 = c23603.f75135.m10411();
        if (c3646M10412 == null) {
            C23623 c23624 = c23603.f75137;
            C14040 c14041 = C8300.f21997;
            c23624.m9355(new C14040("compiler", "no.zipfs.for.archive", interfaceC22097));
            return null;
        }
        try {
            AbstractC9159 abstractC9159NewFileSystem2 = c3646M10412.newFileSystem(interfaceC22097, c23603.f75133);
            try {
                InterfaceC22097 path2 = abstractC9159NewFileSystem2.getPath("module-info.class", new String[0]);
                if (C18743.exists(path2, new EnumC16060[0])) {
                    C24293 c24293 = new C24293(m36980(path2), interfaceC22097);
                    abstractC9159NewFileSystem2.close();
                    return c24293;
                }
                InterfaceC22097 path3 = abstractC9159NewFileSystem2.getPath("META-INF/MANIFEST.MF", new String[0]);
                if (C18743.exists(path3, new EnumC16060[0])) {
                    InputStream inputStreamNewInputStream = C18743.newInputStream(path3, new InterfaceC24778[0]);
                    try {
                        Attributes mainAttributes = new Manifest(inputStreamNewInputStream).getMainAttributes();
                        if (mainAttributes != null && (value = mainAttributes.getValue(new Attributes.Name("Automatic-Module-Name"))) != null) {
                            int i = 0;
                            while (true) {
                                int iIndexOf = value.indexOf(46, i);
                                if (iIndexOf == -1) {
                                    zM12688 = EnumC5698.m12688(value.substring(i));
                                    break;
                                }
                                if (!EnumC5698.m12688(value.substring(i, iIndexOf))) {
                                    zM12688 = false;
                                    break;
                                }
                                i = iIndexOf + 1;
                            }
                            if (zM12688) {
                                C24293 c24294 = new C24293(value, interfaceC22097);
                                if (inputStreamNewInputStream != null) {
                                    inputStreamNewInputStream.close();
                                }
                                abstractC9159NewFileSystem2.close();
                                return c24294;
                            }
                            C23623 c23625 = c23603.f75137;
                            C14040 c14042 = C8300.f21997;
                            c23625.m9355(new C14040("compiler", "locn.cant.get.module.name.for.jar", interfaceC22097));
                            if (inputStreamNewInputStream != null) {
                                inputStreamNewInputStream.close();
                            }
                            abstractC9159NewFileSystem2.close();
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
                abstractC9159NewFileSystem2.close();
                String strM38720 = C17073.m38720(4, 0, interfaceC22097.getFileName().toString());
                Matcher matcher = Pattern.compile("-(\\d+(\\.|$))").matcher(strM38720);
                if (matcher.find()) {
                    strM38720 = strM38720.substring(0, matcher.start());
                }
                String strReplaceAll = strM38720.replaceAll("[^A-Za-z0-9]", ".").replaceAll("(\\.)(\\1)+", ".").replaceAll("^\\.", "").replaceAll("\\.$", "");
                if (!strReplaceAll.isEmpty()) {
                    return new C24293(strReplaceAll, interfaceC22097);
                }
                C23623 c23626 = c23603.f75137;
                C14040 c14043 = C8300.f21997;
                c23626.m9355(new C14040("compiler", "locn.cant.get.module.name.for.jar", interfaceC22097));
                return null;
            } catch (Throwable th5) {
                try {
                    abstractC9159NewFileSystem2.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException unused4) {
            c23603.f75137.m9355(C8300.m19129(interfaceC22097));
            return null;
        } catch (C17432 unused5) {
            C23623 c23627 = c23603.f75137;
            C14040 c14044 = C8300.f21997;
            c23627.m9355(new C14040("compiler", "locn.bad.module-info", interfaceC22097));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private String m36980(InterfaceC22097 interfaceC22097) throws IOException {
        C23603 c23603 = this.f47749.f79652;
        if (c23603.f75130 == null) {
            c23603.f75130 = new C4693();
        }
        C4693 c4693 = c23603.f75130;
        c4693.getClass();
        InputStream inputStreamNewInputStream = C18743.newInputStream(interfaceC22097, new InterfaceC24778[0]);
        try {
            String strM9940 = c4693.m9940(inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return strM9940;
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
