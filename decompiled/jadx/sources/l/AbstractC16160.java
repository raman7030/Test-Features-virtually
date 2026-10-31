package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16160 implements InterfaceC20758 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f49781;

    /* JADX INFO: renamed from: ֫ */
    public abstract C8400 mo22009(String str);

    public AbstractC16160(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        this.f49781 = m38092(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m38092(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String strReplaceAll = str.replaceAll("/+", "/");
        return (strReplaceAll.length() <= 1 || !strReplaceAll.endsWith("/")) ? strReplaceAll : C15472.m36561(1, 0, strReplaceAll);
    }

    @Override // l.InterfaceC20758
    public boolean isAbsolute() {
        return this.f49781.startsWith("/");
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 getRoot() {
        if (isAbsolute()) {
            return mo22009("/");
        }
        return null;
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 getFileName() {
        String str = this.f49781;
        if (str.isEmpty() || str.equals("/")) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return mo22009(str);
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.isEmpty()) {
            return null;
        }
        return mo22009(strSubstring);
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 getParent() {
        int iLastIndexOf;
        String str = this.f49781;
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        if (iLastIndexOf == 0) {
            return mo22009("/");
        }
        return mo22009(str.substring(0, iLastIndexOf));
    }

    @Override // l.InterfaceC20758
    public int getNameCount() {
        String str = this.f49781;
        int i = 0;
        if (str.isEmpty() || str.equals("/")) {
            return 0;
        }
        int i2 = !isAbsolute() ? 1 : 0;
        while (true) {
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf == -1) {
                return i2;
            }
            i2++;
            i = iIndexOf + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC20758
    public InterfaceC20758 getName(int i) {
        int nameCount = getNameCount();
        if (i < 0 || i >= nameCount) {
            throw new IllegalArgumentException(C19370.m44628(i, "Index out of bounds: "));
        }
        int i2 = 0;
        int iIsAbsolute = isAbsolute();
        while (true) {
            String str = this.f49781;
            if (i2 >= i) {
                int iIndexOf = str.indexOf(47, iIsAbsolute);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                return mo22009(str.substring(iIsAbsolute, iIndexOf));
            }
            int iIndexOf2 = str.indexOf(47, iIsAbsolute);
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException(C19370.m44628(i, "Index out of bounds: "));
            }
            i2++;
            iIsAbsolute = iIndexOf2 + 1;
        }
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 subpath(int i, int i2) {
        int nameCount = getNameCount();
        if (i < 0 || i2 > nameCount || i >= i2) {
            throw new IllegalArgumentException("Invalid subpath indices");
        }
        boolean zIsAbsolute = isAbsolute();
        String strSubstring = this.f49781;
        if (zIsAbsolute) {
            strSubstring = strSubstring.substring(1);
        }
        int iIndexOf = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iIndexOf = strSubstring.indexOf(47, iIndexOf) + 1;
        }
        int length = strSubstring.length();
        if (i2 < nameCount) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int iIndexOf2 = strSubstring.indexOf(47, i4);
                if (i5 == i2 - 1) {
                    length = iIndexOf2;
                    break;
                }
                i4 = iIndexOf2 + 1;
            }
        }
        return mo22009(strSubstring.substring(iIndexOf, length));
    }

    @Override // l.InterfaceC20758
    public boolean startsWith(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            return false;
        }
        return startsWith(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM38092 = m38092(str);
        if (isAbsolute() != strM38092.startsWith("/")) {
            return false;
        }
        if (strM38092.equals("/") && isAbsolute()) {
            return true;
        }
        String str2 = this.f49781;
        return str2.equals(strM38092) || str2.startsWith(strM38092.concat("/"));
    }

    @Override // l.InterfaceC20758
    public boolean endsWith(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            return false;
        }
        return endsWith(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM38092 = m38092(str);
        boolean zStartsWith = strM38092.startsWith("/");
        String str2 = this.f49781;
        if (zStartsWith) {
            return str2.equals(strM38092);
        }
        return str2.equals(strM38092) || str2.endsWith("/".concat(strM38092));
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 normalize() {
        String str = this.f49781;
        if (str.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            if (iIndexOf > i) {
                String strSubstring = str.substring(i, iIndexOf);
                if (!strSubstring.equals(".")) {
                    if (!strSubstring.equals("..")) {
                        arrayList.add(strSubstring);
                    } else if (!arrayList.isEmpty() && !((String) C18566.m43105(arrayList, 1)).equals("..")) {
                        C18473.m42953(arrayList, 1);
                    } else if (!isAbsolute()) {
                        arrayList.add("..");
                    }
                }
            }
            i = iIndexOf + 1;
        }
        StringBuilder sb = new StringBuilder();
        if (isAbsolute()) {
            sb.append("/");
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 > 0) {
                sb.append("/");
            }
            sb.append((String) arrayList.get(i2));
        }
        String string = sb.toString();
        return mo22009((!string.isEmpty() || isAbsolute()) ? string : ".");
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolve(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolve(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolve(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        String strM38092 = m38092(str);
        if (strM38092.isEmpty()) {
            return this;
        }
        if (strM38092.startsWith("/")) {
            return mo22009(strM38092);
        }
        String str2 = this.f49781;
        if (str2.isEmpty()) {
            return mo22009(strM38092);
        }
        return str2.equals("/") ? mo22009("/".concat(strM38092)) : mo22009(C22870.m50967(str2, "/", strM38092));
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolveSibling(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolveSibling(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolveSibling(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        InterfaceC20758 parent = getParent();
        if (parent == null) {
            return mo22009(m38092(str));
        }
        return ((C8400) parent).resolve(str);
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 relativize(InterfaceC20758 interfaceC20758) {
        int i;
        if (interfaceC20758 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        if (isAbsolute() != interfaceC20758.toString().startsWith("/")) {
            throw new IllegalArgumentException("Cannot relativize absolute and relative paths");
        }
        InterfaceC20758 interfaceC20758Normalize = normalize();
        InterfaceC20758 interfaceC20758Normalize2 = interfaceC20758.normalize();
        String str = ((C8400) interfaceC20758Normalize).f49781;
        String string = interfaceC20758Normalize2.toString();
        if (str.equals(string)) {
            return mo22009("");
        }
        int iMin = Math.min(str.length(), string.length());
        int i2 = 0;
        for (int i3 = 0; i3 < iMin && str.charAt(i3) == string.charAt(i3); i3++) {
            i2++;
        }
        while (i2 > 0 && i2 < str.length() && i2 < string.length() && str.charAt(i2) != '/' && string.charAt(i2) != '/') {
            i2--;
        }
        String strSubstring = str.substring(i2);
        if (strSubstring.startsWith("/")) {
            strSubstring = strSubstring.substring(1);
        }
        if (strSubstring.isEmpty()) {
            i = 0;
        } else {
            i = 1;
            for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                if (strSubstring.charAt(i4) == '/') {
                    i++;
                }
            }
        }
        String strSubstring2 = string.substring(i2);
        if (strSubstring2.startsWith("/")) {
            strSubstring2 = strSubstring2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 > 0) {
                sb.append("/");
            }
            sb.append("..");
        }
        if (!strSubstring2.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("/");
            }
            sb.append(strSubstring2);
        }
        return mo22009(sb.length() != 0 ? sb.toString() : "");
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 toAbsolutePath() {
        if (isAbsolute()) {
            return this;
        }
        return mo22009("/" + this.f49781);
    }

    @Override // l.InterfaceC20758, java.lang.Iterable
    public Iterator iterator() {
        return new C9106(this, getNameCount());
    }

    @Override // l.InterfaceC20758
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8400) {
            C8400 c8400 = (C8400) obj;
            if (C11003.equals(((C8400) this).getFileSystem(), c8400.getFileSystem()) && C11003.equals(this.f49781, c8400.f49781)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC20758
    public int hashCode() {
        return C11003.hash(((C8400) this).getFileSystem(), this.f49781);
    }

    @Override // java.lang.Comparable
    public int compareTo(InterfaceC20758 interfaceC20758) {
        return this.f49781.compareTo(interfaceC20758.toString());
    }
}
