package l;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۡܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8938 extends AbstractC13959 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f27169;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3999 f27170;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3152 f27171;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f27172;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8938(C22343 c22343) {
        super(EnumC21101.MODULE_SOURCE_PATH, EnumC0121.f1173);
        this.f27172 = c22343;
        this.f27171 = new C3152(3);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        boolean z;
        int i;
        char cCharAt;
        char c;
        int i2;
        InterfaceC20758 interfaceC20758M50086;
        this.f41660 = true;
        Pattern patternCompile = Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
        ArrayList arrayList = new ArrayList();
        InterfaceC20758 interfaceC20758 = null;
        int i3 = 0;
        String str2 = null;
        for (String str3 : str.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            if (patternCompile.matcher(str3).matches()) {
                arrayList.add(str3);
            } else {
                str2 = str3;
            }
        }
        if (str2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str4 : str2.split(File.pathSeparator)) {
                m23046(str4, arrayList2);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            boolean z2 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                C22343 c22343 = this.f27172;
                if (zHasNext) {
                    String str5 = (String) it.next();
                    int iIndexOf = str5.indexOf("*");
                    if (iIndexOf == -1) {
                        InterfaceC20758 interfaceC20758M50087 = c22343.m50086(str5, new String[i3]);
                        m23050(linkedHashMap, interfaceC20758M50087, interfaceC20758);
                        arrayList3.add(interfaceC20758M50087);
                    } else {
                        if (iIndexOf == 0 || ((cCharAt = str5.charAt((i = iIndexOf - 1))) != (c = File.separatorChar) && cCharAt != '/')) {
                            throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                        }
                        InterfaceC20758 interfaceC20758M50088 = c22343.m50086(str5.substring(i3, i), new String[i3]);
                        int i4 = iIndexOf + 1;
                        if (i4 == str5.length()) {
                            interfaceC20758M50086 = null;
                            i2 = 0;
                        } else {
                            char cCharAt2 = str5.charAt(i4);
                            if ((cCharAt2 != c && cCharAt2 != '/') || str5.indexOf("*", i4) != -1) {
                                throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                            }
                            String strSubstring = str5.substring(iIndexOf + 2);
                            i2 = 0;
                            interfaceC20758M50086 = c22343.m50086(strSubstring, new String[0]);
                            z2 = true;
                        }
                        m23050(linkedHashMap, interfaceC20758M50088, interfaceC20758M50086);
                        if (interfaceC20758M50086 == null) {
                            arrayList3.add(interfaceC20758M50088);
                        }
                        i3 = i2;
                    }
                    interfaceC20758 = null;
                } else {
                    z = true;
                    this.f27170 = new C3999(c22343);
                    C13843.forEach(linkedHashMap, new C9644(this));
                    if (z2) {
                        arrayList3 = null;
                    }
                    this.f27169 = arrayList3;
                    break;
                }
            }
        } else {
            z = true;
        }
        C19846.forEach(arrayList, new Consumer() { // from class: l.ۜܳ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                String str6 = (String) obj;
                C8938 c8938 = this.f21146;
                c8938.getClass();
                int iIndexOf2 = str6.indexOf(61);
                String strSubstring2 = str6.substring(0, iIndexOf2);
                ArrayList arrayList4 = new ArrayList();
                for (String str7 : str6.substring(iIndexOf2 + 1).split(File.pathSeparator)) {
                    try {
                        arrayList4.add(C8763.get(str7, new String[0]));
                    } catch (InvalidPathException e) {
                        throw new IllegalArgumentException(C20094.m46315("invalid path: ", str7), e);
                    }
                }
                try {
                    c8938.mo23049(arrayList4, strSubstring2);
                } catch (IOException e2) {
                    throw new IllegalArgumentException(C20094.m46315("cannot set path for module ", strSubstring2), e2);
                }
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23047(C8938 c8938, String str, List list) {
        if (C5378.stream(list).anyMatch(c8938.f27171)) {
            c8938.f27170.m12048(new C16698(c8938.f27172, c8938, c8938.f41661.getName() + "[" + str + "]", str, list, false));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23050(LinkedHashMap linkedHashMap, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) {
        C11076 c11076;
        if (!C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
            C22343 c22343 = this.f27172;
            if (c22343.f72410) {
                if (C17229.exists(interfaceC20758, new EnumC14406[0])) {
                    C11076 c11077 = C14001.f42334;
                    c11076 = new C11076("compiler", "dir.path.element.not.directory", interfaceC20758);
                } else {
                    C11076 c11078 = C14001.f42334;
                    c11076 = new C11076("compiler", "dir.path.element.not.found", interfaceC20758);
                }
                c22343.f72411.m7282(EnumC20347.PATH, c11076);
                return;
            }
            return;
        }
        try {
            DirectoryStream<InterfaceC20758> directoryStreamNewDirectoryStream = C17229.newDirectoryStream(interfaceC20758, new C20933());
            try {
                for (InterfaceC20758 interfaceC207510 : directoryStreamNewDirectoryStream) {
                    InterfaceC20758 interfaceC20758Resolve = interfaceC20759 == null ? interfaceC207510 : interfaceC207510.resolve(interfaceC20759);
                    if (C17229.isDirectory(interfaceC20758Resolve, new EnumC14406[0])) {
                        String string = interfaceC207510.getFileName().toString();
                        List arrayList = (List) linkedHashMap.get(string);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(string, arrayList);
                        }
                        arrayList.add(interfaceC20758Resolve);
                    }
                }
                directoryStreamNewDirectoryStream.close();
            } catch (Throwable th) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23046(String str, ArrayList arrayList) {
        int i = -1;
        String str2 = null;
        String strSubstring = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            int i4 = 1;
            if (cCharAt != ',') {
                if (cCharAt == '{') {
                    i2++;
                    if (i2 == 1) {
                        String strSubstring2 = str.substring(0, i3);
                        int i5 = i3 + 1;
                        int i6 = i5;
                        while (true) {
                            if (i6 >= str.length()) {
                                throw new IllegalArgumentException("mismatched braces");
                            }
                            char cCharAt2 = str.charAt(i6);
                            if (cCharAt2 != '{') {
                                if (cCharAt2 == '}' && (i4 = i4 - 1) == 0) {
                                    strSubstring = str.substring(i6 + 1);
                                    str2 = strSubstring2;
                                    i = i5;
                                    break;
                                }
                            } else {
                                i4++;
                            }
                            i6++;
                        }
                    } else {
                        continue;
                    }
                } else if (cCharAt != '}') {
                    continue;
                } else {
                    if (i2 == 0) {
                        throw new IllegalArgumentException("mismatched braces");
                    }
                    if (i2 == 1) {
                        m23046(C22870.m50967(str2, str.substring(i, i3), strSubstring), arrayList);
                        return;
                    }
                    i2--;
                }
            } else if (i2 == 1) {
                m23046(C22870.m50967(str2, str.substring(i, i3), strSubstring), arrayList);
                i = i3 + 1;
            }
        }
        if (i2 > 0) {
            throw new IllegalArgumentException("mismatched braces");
        }
        arrayList.add(str);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo23053() {
        return this.f27170 != null;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo6225() {
        List list = this.f27169;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("paths not available");
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C5494) iterable).iterator();
        while (true) {
            C8316 c8316 = (C8316) it;
            if (!c8316.f25522.hasNext()) {
                this.f27170 = new C3999(this.f27172);
                C13843.forEach(linkedHashMap, new C9644(this));
                this.f41660 = true;
                this.f27169 = C20195.unmodifiableList(arrayList);
                return;
            }
            InterfaceC20758 interfaceC20758 = (InterfaceC20758) c8316.next();
            m23050(linkedHashMap, interfaceC20758, (InterfaceC20758) null);
            arrayList.add(interfaceC20758);
        }
    }

    @Override // l.AbstractC13959, l.AbstractC11055
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23049(Iterable iterable, String str) {
        C11003.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
            AbstractC13959.m33406(interfaceC20758);
            arrayList.add(interfaceC20758);
        }
        C3999 c3999 = this.f27170;
        C22343 c22343 = this.f27172;
        if (c3999 == null) {
            this.f27170 = new C3999(c22343);
        }
        C16698 c16698M12046 = this.f27170.m12046(str);
        if (c16698M12046 == null) {
            this.f27170.m12048(new C16698(c22343, this, this.f41661.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c16698M12046.f51263 = arrayList;
            this.f27170.m12052(c16698M12046);
        }
        this.f41660 = true;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2050 mo23048(String str) {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return null;
        }
        return c3999.m12046(str);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return null;
        }
        return c3999.m12051(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Iterable mo23052() {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(c3999.m12054());
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return false;
        }
        return c3999.m12049(interfaceC20758);
    }
}
