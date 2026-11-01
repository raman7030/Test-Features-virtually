package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17727 implements InterfaceC22097 {

    /* JADX INFO: renamed from: ᩸ */
    public final String f52947;

    /* JADX INFO: renamed from: ֫ */
    public abstract C10352 mo23979(String str);

    public AbstractC17727(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        this.f52947 = m40284(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m40284(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String strReplaceAll = str.replaceAll("/+", "/");
        return (strReplaceAll.length() <= 1 || !strReplaceAll.endsWith("/")) ? strReplaceAll : C17073.m38720(1, 0, strReplaceAll);
    }

    @Override // p067l.InterfaceC22097
    public boolean isAbsolute() {
        return this.f52947.startsWith("/");
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 getRoot() {
        if (isAbsolute()) {
            return mo23979("/");
        }
        return null;
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 getFileName() {
        String str = this.f52947;
        if (str.isEmpty() || str.equals("/")) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return mo23979(str);
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.isEmpty()) {
            return null;
        }
        return mo23979(strSubstring);
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 getParent() {
        int iLastIndexOf;
        String str = this.f52947;
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        if (iLastIndexOf == 0) {
            return mo23979("/");
        }
        return mo23979(str.substring(0, iLastIndexOf));
    }

    @Override // p067l.InterfaceC22097
    public int getNameCount() {
        String str = this.f52947;
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
    @Override // p067l.InterfaceC22097
    public InterfaceC22097 getName(int i) {
        int nameCount = getNameCount();
        if (i < 0 || i >= nameCount) {
            throw new IllegalArgumentException(C20778.m46922(i, "Index out of bounds: "));
        }
        int i2 = 0;
        int iIsAbsolute = isAbsolute();
        while (true) {
            String str = this.f52947;
            if (i2 >= i) {
                int iIndexOf = str.indexOf(47, iIsAbsolute);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                return mo23979(str.substring(iIsAbsolute, iIndexOf));
            }
            int iIndexOf2 = str.indexOf(47, iIsAbsolute);
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException(C20778.m46922(i, "Index out of bounds: "));
            }
            i2++;
            iIsAbsolute = iIndexOf2 + 1;
        }
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 subpath(int i, int i2) {
        int nameCount = getNameCount();
        if (i < 0 || i2 > nameCount || i >= i2) {
            throw new IllegalArgumentException("Invalid subpath indices");
        }
        boolean zIsAbsolute = isAbsolute();
        String strSubstring = this.f52947;
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
        return mo23979(strSubstring.substring(iIndexOf, length));
    }

    @Override // p067l.InterfaceC22097
    public boolean startsWith(InterfaceC22097 interfaceC22097) {
        if (interfaceC22097 == null) {
            return false;
        }
        return startsWith(interfaceC22097.toString());
    }

    @Override // p067l.InterfaceC22097
    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM40284 = m40284(str);
        if (isAbsolute() != strM40284.startsWith("/")) {
            return false;
        }
        if (strM40284.equals("/") && isAbsolute()) {
            return true;
        }
        String str2 = this.f52947;
        return str2.equals(strM40284) || str2.startsWith(strM40284.concat("/"));
    }

    @Override // p067l.InterfaceC22097
    public boolean endsWith(InterfaceC22097 interfaceC22097) {
        if (interfaceC22097 == null) {
            return false;
        }
        return endsWith(interfaceC22097.toString());
    }

    @Override // p067l.InterfaceC22097
    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM40284 = m40284(str);
        boolean zStartsWith = strM40284.startsWith("/");
        String str2 = this.f52947;
        if (zStartsWith) {
            return str2.equals(strM40284);
        }
        return str2.equals(strM40284) || str2.endsWith("/".concat(strM40284));
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 normalize() {
        String str = this.f52947;
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
                    } else if (!arrayList.isEmpty() && !((String) C20013.m45383(arrayList, 1)).equals("..")) {
                        C19925.m45229(arrayList, 1);
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
        return mo23979((!string.isEmpty() || isAbsolute()) ? string : ".");
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 resolve(InterfaceC22097 interfaceC22097) {
        if (interfaceC22097 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolve(interfaceC22097.toString());
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 resolve(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        String strM40284 = m40284(str);
        if (strM40284.isEmpty()) {
            return this;
        }
        if (strM40284.startsWith("/")) {
            return mo23979(strM40284);
        }
        String str2 = this.f52947;
        if (str2.isEmpty()) {
            return mo23979(strM40284);
        }
        return str2.equals("/") ? mo23979("/".concat(strM40284)) : mo23979(C24104.m53357(str2, "/", strM40284));
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 resolveSibling(InterfaceC22097 interfaceC22097) {
        if (interfaceC22097 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolveSibling(interfaceC22097.toString());
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 resolveSibling(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        InterfaceC22097 parent = getParent();
        if (parent == null) {
            return mo23979(m40284(str));
        }
        return ((C10352) parent).resolve(str);
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 relativize(InterfaceC22097 interfaceC22097) {
        int i;
        if (interfaceC22097 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        if (isAbsolute() != interfaceC22097.toString().startsWith("/")) {
            throw new IllegalArgumentException("Cannot relativize absolute and relative paths");
        }
        InterfaceC22097 interfaceC22097Normalize = normalize();
        InterfaceC22097 interfaceC22097Normalize2 = interfaceC22097.normalize();
        String str = ((C10352) interfaceC22097Normalize).f52947;
        String string = interfaceC22097Normalize2.toString();
        if (str.equals(string)) {
            return mo23979("");
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
        return mo23979(sb.length() != 0 ? sb.toString() : "");
    }

    @Override // p067l.InterfaceC22097
    public InterfaceC22097 toAbsolutePath() {
        if (isAbsolute()) {
            return this;
        }
        return mo23979("/" + this.f52947);
    }

    @Override // p067l.InterfaceC22097, java.lang.Iterable
    public Iterator iterator() {
        return new C11023(this, getNameCount());
    }

    @Override // p067l.InterfaceC22097
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10352) {
            C10352 c10352 = (C10352) obj;
            if (C12826.equals(((C10352) this).getFileSystem(), c10352.getFileSystem()) && C12826.equals(this.f52947, c10352.f52947)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC22097
    public int hashCode() {
        return C12826.hash(((C10352) this).getFileSystem(), this.f52947);
    }

    @Override // java.lang.Comparable
    public int compareTo(InterfaceC22097 interfaceC22097) {
        return this.f52947.compareTo(interfaceC22097.toString());
    }
}
