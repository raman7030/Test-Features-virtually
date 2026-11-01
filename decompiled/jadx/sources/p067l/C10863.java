package p067l;

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
public final class C10863 extends AbstractC15635 {

    /* JADX INFO: renamed from: ܳ */
    public List f30104;

    /* JADX INFO: renamed from: ܿ */
    public C6169 f30105;

    /* JADX INFO: renamed from: ᩳ */
    public final C5364 f30106;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23603 f30107;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10863(C23603 c23603) {
        super(EnumC22423.MODULE_SOURCE_PATH, EnumC2483.f3949);
        this.f30107 = c23603;
        this.f30106 = new C5364(3);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22380(EnumC2483 enumC2483, String str) {
        boolean z;
        int i;
        char cCharAt;
        char c;
        int i2;
        InterfaceC22097 interfaceC22097M52425;
        this.f44740 = true;
        Pattern patternCompile = Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
        ArrayList arrayList = new ArrayList();
        InterfaceC22097 interfaceC22097 = null;
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
                m25020(str4, arrayList2);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            boolean z2 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                C23603 c23603 = this.f30107;
                if (zHasNext) {
                    String str5 = (String) it.next();
                    int iIndexOf = str5.indexOf("*");
                    if (iIndexOf == -1) {
                        InterfaceC22097 interfaceC22097M52426 = c23603.m52425(str5, new String[i3]);
                        m25024(linkedHashMap, interfaceC22097M52426, interfaceC22097);
                        arrayList3.add(interfaceC22097M52426);
                    } else {
                        if (iIndexOf == 0 || ((cCharAt = str5.charAt((i = iIndexOf - 1))) != (c = File.separatorChar) && cCharAt != '/')) {
                            throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                        }
                        InterfaceC22097 interfaceC22097M52427 = c23603.m52425(str5.substring(i3, i), new String[i3]);
                        int i4 = iIndexOf + 1;
                        if (i4 == str5.length()) {
                            interfaceC22097M52425 = null;
                            i2 = 0;
                        } else {
                            char cCharAt2 = str5.charAt(i4);
                            if ((cCharAt2 != c && cCharAt2 != '/') || str5.indexOf("*", i4) != -1) {
                                throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                            }
                            String strSubstring = str5.substring(iIndexOf + 2);
                            i2 = 0;
                            interfaceC22097M52425 = c23603.m52425(strSubstring, new String[0]);
                            z2 = true;
                        }
                        m25024(linkedHashMap, interfaceC22097M52427, interfaceC22097M52425);
                        if (interfaceC22097M52425 == null) {
                            arrayList3.add(interfaceC22097M52427);
                        }
                        i3 = i2;
                    }
                    interfaceC22097 = null;
                } else {
                    z = true;
                    this.f30105 = new C6169(c23603);
                    C15525.forEach(linkedHashMap, new C11534(this));
                    if (z2) {
                        arrayList3 = null;
                    }
                    this.f30104 = arrayList3;
                    break;
                }
            }
        } else {
            z = true;
        }
        C21230.forEach(arrayList, new Consumer() { // from class: l.ۜܳ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                String str6 = (String) obj;
                C10863 c10863 = this.f24023;
                c10863.getClass();
                int iIndexOf2 = str6.indexOf(61);
                String strSubstring2 = str6.substring(0, iIndexOf2);
                ArrayList arrayList4 = new ArrayList();
                for (String str7 : str6.substring(iIndexOf2 + 1).split(File.pathSeparator)) {
                    try {
                        arrayList4.add(C10697.get(str7, new String[0]));
                    } catch (InvalidPathException e) {
                        throw new IllegalArgumentException(C21466.m48631("invalid path: ", str7), e);
                    }
                }
                try {
                    c10863.mo25023(arrayList4, strSubstring2);
                } catch (IOException e2) {
                    throw new IllegalArgumentException(C21466.m48631("cannot set path for module ", strSubstring2), e2);
                }
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m25021(C10863 c10863, String str, List list) {
        if (C7480.stream(list).anyMatch(c10863.f30106)) {
            c10863.f30105.m13968(new C18238(c10863.f30107, c10863, c10863.f44741.getName() + "[" + str + "]", str, list, false));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25024(LinkedHashMap linkedHashMap, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        C12895 c12895;
        if (!C18743.isDirectory(interfaceC22097, new EnumC16060[0])) {
            C23603 c23603 = this.f30107;
            if (c23603.f75136) {
                if (C18743.exists(interfaceC22097, new EnumC16060[0])) {
                    C12895 c12896 = C15675.f45417;
                    c12895 = new C12895("compiler", "dir.path.element.not.directory", interfaceC22097);
                } else {
                    C12895 c12897 = C15675.f45417;
                    c12895 = new C12895("compiler", "dir.path.element.not.found", interfaceC22097);
                }
                c23603.f75137.m9361(EnumC21706.PATH, c12895);
                return;
            }
            return;
        }
        try {
            DirectoryStream<InterfaceC22097> directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22097, new C22263());
            try {
                for (InterfaceC22097 interfaceC22099 : directoryStreamNewDirectoryStream) {
                    InterfaceC22097 interfaceC22097Resolve = interfaceC22098 == null ? interfaceC22099 : interfaceC22099.resolve(interfaceC22098);
                    if (C18743.isDirectory(interfaceC22097Resolve, new EnumC16060[0])) {
                        String string = interfaceC22099.getFileName().toString();
                        List arrayList = (List) linkedHashMap.get(string);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(string, arrayList);
                        }
                        arrayList.add(interfaceC22097Resolve);
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

    /* JADX INFO: renamed from: ֫ */
    public static void m25020(String str, ArrayList arrayList) {
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
                        m25020(C24104.m53357(str2, str.substring(i, i3), strSubstring), arrayList);
                        return;
                    }
                    i2--;
                }
            } else if (i2 == 1) {
                m25020(C24104.m53357(str2, str.substring(i, i3), strSubstring), arrayList);
                i = i3 + 1;
            }
        }
        if (i2 > 0) {
            throw new IllegalArgumentException("mismatched braces");
        }
        arrayList.add(str);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo25027() {
        return this.f30105 != null;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo8427() {
        List list = this.f30104;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("paths not available");
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo22379(Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C7590) iterable).iterator();
        while (true) {
            C10272 c10272 = (C10272) it;
            if (!c10272.f28433.hasNext()) {
                this.f30105 = new C6169(this.f30107);
                C15525.forEach(linkedHashMap, new C11534(this));
                this.f44740 = true;
                this.f30104 = C21562.unmodifiableList(arrayList);
                return;
            }
            InterfaceC22097 interfaceC22097 = (InterfaceC22097) c10272.next();
            m25024(linkedHashMap, interfaceC22097, (InterfaceC22097) null);
            arrayList.add(interfaceC22097);
        }
    }

    @Override // p067l.AbstractC15635, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo25023(Iterable iterable, String str) {
        C12826.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC22097 interfaceC22097 = (InterfaceC22097) it.next();
            AbstractC15635.m35525(interfaceC22097);
            arrayList.add(interfaceC22097);
        }
        C6169 c6169 = this.f30105;
        C23603 c23603 = this.f30107;
        if (c6169 == null) {
            this.f30105 = new C6169(c23603);
        }
        C18238 c18238M13966 = this.f30105.m13966(str);
        if (c18238M13966 == null) {
            this.f30105.m13968(new C18238(c23603, this, this.f44741.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c18238M13966.f54448 = arrayList;
            this.f30105.m13972(c18238M13966);
        }
        this.f44740 = true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4317 mo25022(String str) {
        C6169 c6169 = this.f30105;
        if (c6169 == null) {
            return null;
        }
        return c6169.m13966(str);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo25025(InterfaceC22097 interfaceC22097) {
        C6169 c6169 = this.f30105;
        if (c6169 == null) {
            return null;
        }
        return c6169.m13971(interfaceC22097);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo25026() {
        C6169 c6169 = this.f30105;
        if (c6169 == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(c6169.m13974());
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22381(InterfaceC22097 interfaceC22097) {
        C6169 c6169 = this.f30105;
        if (c6169 == null) {
            return false;
        }
        return c6169.m13969(interfaceC22097);
    }
}
