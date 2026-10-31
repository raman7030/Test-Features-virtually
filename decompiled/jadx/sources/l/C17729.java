package l;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ᩳ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9XF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17729 implements InterfaceC5962, Cloneable {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f54229 = C11321.m27961(C17729.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC15653 f54230 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f54231;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final URL f54232;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f54233;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f54234;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f54235;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f54236;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f54237;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC3846[] f54238;

    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private synchronized void m41512() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char[] charArray = this.f54232.getPath().toCharArray();
        char[] cArr = new char[charArray.length];
        int length = charArray.length;
        int i5 = 0;
        char c2 = 0;
        int i6 = 0;
        while (i5 < length) {
            if (c2 != 0) {
                if (c2 == 1) {
                    char c3 = charArray[i5];
                    if (c3 != '/') {
                        if (c3 != '.' || ((i4 = i5 + 1) < length && charArray[i4] != '/')) {
                            int i7 = i5 + 1;
                            if (i7 >= length || c3 != '.' || charArray[i7] != '.' || ((i2 = i5 + 2) < length && charArray[i2] != '/')) {
                                c2 = 2;
                                c = charArray[i5];
                                if (c == '/') {
                                    c2 = 1;
                                }
                                i = i6 + 1;
                                cArr[i6] = c;
                            } else {
                                if (i6 != 1) {
                                    while (true) {
                                        i3 = i6 - 1;
                                        if (i3 <= 1 || cArr[i6 - 2] == '/') {
                                            break;
                                            break;
                                        }
                                        i6 = i3;
                                    }
                                    i6 = i3;
                                }
                                i5 = i2;
                            }
                        } else {
                            i5 = i4;
                        }
                    }
                } else if (c2 == 2) {
                    c = charArray[i5];
                    if (c == '/') {
                        c2 = 1;
                    }
                    i = i6 + 1;
                    cArr[i6] = c;
                }
                i5++;
            } else {
                char c4 = charArray[i5];
                if (c4 != '/') {
                    throw new C13017("Invalid smb: URL: " + this.f54232);
                }
                i = i6 + 1;
                cArr[i6] = c4;
                c2 = 1;
            }
            i6 = i;
            i5++;
        }
        String str = new String(cArr, 0, i6);
        this.f54236 = str;
        if (i6 > 1) {
            int i8 = i6 - 1;
            int iIndexOf = str.indexOf(47, 1);
            if (iIndexOf < 0) {
                this.f54235 = this.f54236.substring(1);
                this.f54233 = "\\";
            } else if (iIndexOf == i8) {
                this.f54235 = this.f54236.substring(1, iIndexOf);
                this.f54233 = "\\";
            } else {
                this.f54235 = this.f54236.substring(1, iIndexOf);
                this.f54233 = this.f54236.substring(iIndexOf, i6).replace('/', '\\');
            }
        } else {
            this.f54236 = "/";
            this.f54235 = null;
            this.f54233 = "\\";
        }
    }

    public C17729(URL url, InterfaceC18663 interfaceC18663) {
        this.f54231 = interfaceC18663;
        this.f54232 = url;
    }

    public final C17729 clone() {
        C17729 c17729 = new C17729(this.f54232, this.f54231);
        c17729.f54236 = this.f54236;
        c17729.f54235 = this.f54235;
        c17729.f54230 = this.f54230;
        c17729.f54233 = this.f54233;
        InterfaceC3846[] interfaceC3846Arr = this.f54238;
        if (interfaceC3846Arr != null) {
            C0068[] c0068Arr = new C0068[interfaceC3846Arr.length];
            c17729.f54238 = c0068Arr;
            InterfaceC3846[] interfaceC3846Arr2 = this.f54238;
            System.arraycopy(interfaceC3846Arr2, 0, c0068Arr, 0, interfaceC3846Arr2.length);
        }
        c17729.f54237 = this.f54237;
        c17729.f54234 = this.f54234;
        return c17729;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41517(InterfaceC5962 interfaceC5962, String str) {
        boolean z;
        C17729 c17729 = (C17729) interfaceC5962;
        String strM41523 = c17729.m41523();
        if (strM41523 != null) {
            this.f54230 = c17729.f54230;
        }
        int length = str.length() - 1;
        if (length < 0 || str.charAt(length) != '/') {
            z = false;
        } else {
            str = str.substring(0, length);
            z = true;
        }
        if (strM41523 != null) {
            String strM41529 = c17729.m41529();
            if (strM41529.equals("\\")) {
                StringBuilder sb = new StringBuilder("\\");
                sb.append(str.replace('/', '\\'));
                sb.append(z ? "\\" : "");
                this.f54233 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c17729.m41521());
                sb2.append(str);
                sb2.append(z ? "/" : "");
                this.f54236 = sb2.toString();
                this.f54235 = strM41523;
                return;
            }
            StringBuilder sbM15339 = C5368.m15339(strM41529);
            sbM15339.append(str.replace('/', '\\'));
            sbM15339.append(z ? "\\" : "");
            this.f54233 = sbM15339.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c17729.m41521());
            sb3.append(str);
            sb3.append(z ? "/" : "");
            this.f54236 = sb3.toString();
            this.f54235 = strM41523;
            return;
        }
        String[] strArrSplit = str.split("/");
        int i = c17729.m41527() != null ? 0 : 1;
        if (strArrSplit.length > i) {
            this.f54235 = strArrSplit[i];
            i++;
        }
        if (strArrSplit.length <= i) {
            this.f54233 = "\\";
            if (this.f54235 == null) {
                this.f54236 = "/";
                return;
            }
            StringBuilder sb4 = new StringBuilder("/");
            sb4.append(this.f54235);
            sb4.append(z ? "/" : "");
            this.f54236 = sb4.toString();
            return;
        }
        String[] strArr = new String[strArrSplit.length - i];
        System.arraycopy(strArrSplit, i, strArr, 0, strArrSplit.length - i);
        StringBuilder sb5 = new StringBuilder("\\");
        sb5.append(C3939.m11986("\\", strArr));
        sb5.append(z ? "\\" : "");
        this.f54233 = sb5.toString();
        StringBuilder sb6 = new StringBuilder("/");
        sb6.append(this.f54235);
        sb6.append("/");
        sb6.append(C3939.m11986("/", strArr));
        sb6.append(z ? "/" : "");
        this.f54236 = sb6.toString();
    }

    public final String getName() {
        String strM41521 = m41521();
        String strM41523 = m41523();
        if (strM41521.length() > 1) {
            int length = strM41521.length() - 2;
            while (strM41521.charAt(length) != '/') {
                length--;
            }
            return strM41521.substring(length + 1);
        }
        if (strM41523 != null) {
            return strM41523.concat("/");
        }
        URL url = this.f54232;
        if (url.getHost().length() <= 0) {
            return "smb://";
        }
        return url.getHost() + '/';
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m41529() {
        if (this.f54233 == null) {
            m41512();
        }
        return this.f54233;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m41521() {
        if (this.f54233 == null) {
            m41512();
        }
        return this.f54236;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m41523() {
        if (this.f54233 == null) {
            m41512();
        }
        return this.f54235;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m41526() {
        InterfaceC15653 interfaceC15653 = this.f54230;
        if (interfaceC15653 != null) {
            return interfaceC15653.mo22329();
        }
        return m41527();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m41527() {
        String host = this.f54232.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41525() {
        return this.f54232.getPort();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final URL m41522() {
        return this.f54232;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m41528() {
        InterfaceC18663 interfaceC18663 = this.f54231;
        return ((C13722) interfaceC18663.mo27540()).m32984() && !interfaceC18663.mo6355().mo16137() && m41524();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m41524() {
        if (m41523() != null && !"IPC$".equals(m41523())) {
            return false;
        }
        InterfaceC2148 interfaceC2148 = f54229;
        if (!interfaceC2148.mo7086()) {
            return true;
        }
        interfaceC2148.mo7088("Share is IPC " + this.f54235);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41516(int i) {
        this.f54234 = i;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m41520() {
        int iMo13389;
        if (this.f54234 == 0) {
            if (m41529().length() > 1) {
                this.f54234 = 1;
            } else if (m41523() != null) {
                if (m41523().equals("IPC$")) {
                    this.f54234 = 16;
                } else {
                    this.f54234 = 8;
                }
            } else {
                URL url = this.f54232;
                if (url.getAuthority() == null || url.getAuthority().isEmpty()) {
                    this.f54234 = 2;
                } else {
                    try {
                        InterfaceC4551 interfaceC4551 = (InterfaceC4551) m41515().mo1014(InterfaceC4551.class);
                        if (interfaceC4551 != null && ((iMo13389 = interfaceC4551.mo13389()) == 29 || iMo13389 == 27)) {
                            this.f54234 = 2;
                            return 2;
                        }
                    } catch (C19369 e) {
                        if (!(e.getCause() instanceof UnknownHostException)) {
                            throw e;
                        }
                        f54229.mo7081("Unknown host", (Exception) e);
                    }
                    this.f54234 = 4;
                }
            }
        }
        return this.f54234;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m41519() {
        int iMo13389;
        if (this.f54234 == 2 || this.f54232.getHost().length() == 0) {
            this.f54234 = 2;
            return true;
        }
        if (m41523() != null) {
            return false;
        }
        InterfaceC4551 interfaceC4551 = (InterfaceC4551) m41515().mo1014(InterfaceC4551.class);
        if (interfaceC4551 != null && ((iMo13389 = interfaceC4551.mo13389()) == 29 || iMo13389 == 27)) {
            this.f54234 = 2;
            return true;
        }
        this.f54234 = 4;
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3846 m41515() throws C19369 {
        int i = this.f54237;
        if (i != 0) {
            return this.f54238[i - 1];
        }
        this.f54237 = 0;
        if (this.f54238 == null) {
            URL url = this.f54232;
            String host = url.getHost();
            String path = url.getPath();
            String query = url.getQuery();
            InterfaceC18663 interfaceC18663 = this.f54231;
            try {
                if (query != null) {
                    String strM41513 = m41513(query, "server");
                    if (strM41513 != null && strM41513.length() > 0) {
                        this.f54238 = new C0068[]{((RunnableC9242) interfaceC18663.mo27539()).m23692(strM41513)};
                    }
                    String strM41514 = m41513(query, "address");
                    if (strM41514 != null && strM41514.length() > 0) {
                        this.f54238 = new C0068[]{new C0068(InetAddress.getByAddress(host, InetAddress.getByName(strM41514).getAddress()))};
                    }
                } else if (host.length() == 0) {
                    try {
                        this.f54238 = new C0068[]{runnableC9242.m23692(((RunnableC9242) interfaceC18663.mo27539()).m23693(1, "\u0001\u0002__MSBROWSE__\u0002").mo1012())};
                        RunnableC9242 runnableC9242 = (RunnableC9242) interfaceC18663.mo27539();
                    } catch (UnknownHostException e) {
                        f54229.mo7081("Unknown host", (Exception) e);
                        interfaceC18663.mo27540().getClass();
                        throw e;
                    }
                } else if (path.length() == 0 || path.equals("/")) {
                    this.f54238 = ((RunnableC9242) interfaceC18663.mo27539()).m23703(host, true);
                } else {
                    this.f54238 = ((RunnableC9242) interfaceC18663.mo27539()).m23703(host, false);
                }
            } catch (UnknownHostException e2) {
                throw new C19369(C20094.m46315("Failed to lookup address for name ", host), e2);
            }
        }
        int i2 = this.f54237;
        InterfaceC3846[] interfaceC3846Arr = this.f54238;
        if (i2 >= interfaceC3846Arr.length) {
            return null;
        }
        this.f54237 = i2 + 1;
        return interfaceC3846Arr[i2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41513(String str, String str2) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            char c = charArray[i3];
            if (c == '&') {
                if (i > i2 && new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
                    int i4 = i + 1;
                    return new String(charArray, i4, i3 - i4);
                }
                i2 = i3 + 1;
            } else if (c == '=') {
                i = i3;
            }
        }
        if (i <= i2 || !new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
            return null;
        }
        int i5 = i + 1;
        return new String(charArray, i5, charArray.length - i5);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m41518() {
        return m41529().length() <= 1;
    }

    public final int hashCode() {
        int iHashCode;
        try {
            iHashCode = m41515().hashCode();
        } catch (C19369 unused) {
            iHashCode = m41527().toUpperCase().hashCode();
        }
        return m41521().toUpperCase().hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17729)) {
            return false;
        }
        C17729 c17729 = (C17729) obj;
        String path = this.f54232.getPath();
        String path2 = c17729.f54232.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        int iLastIndexOf2 = path2.lastIndexOf(47);
        int length = path.length() - iLastIndexOf;
        int length2 = path2.length() - iLastIndexOf2;
        if (((length <= 1 || path.charAt(iLastIndexOf + 1) != '.') && ((length2 <= 1 || path2.charAt(iLastIndexOf2 + 1) != '.') && !(length == length2 && path.regionMatches(true, iLastIndexOf, path2, iLastIndexOf2, length)))) || !m41521().equalsIgnoreCase(c17729.m41521())) {
            return false;
        }
        try {
            return m41515().equals(c17729.m41515());
        } catch (C19369 e) {
            f54229.mo7081("Unknown host", (Exception) e);
            return m41527().equalsIgnoreCase(c17729.m41527());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41514(InterfaceC15653 interfaceC15653, String str) {
        if (C11003.equals(this.f54230, interfaceC15653)) {
            return this.f54233;
        }
        this.f54230 = interfaceC15653;
        String strM41529 = m41529();
        int iMo22336 = interfaceC15653.mo22336();
        InterfaceC2148 interfaceC2148 = f54229;
        if (iMo22336 < 0) {
            interfaceC2148.mo7104("Path consumed out of range " + iMo22336);
            iMo22336 = 0;
        } else if (iMo22336 > this.f54233.length()) {
            interfaceC2148.mo7104("Path consumed out of range " + iMo22336);
            iMo22336 = strM41529.length();
        }
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("UNC is '" + strM41529 + "'");
            interfaceC2148.mo7088("Consumed '" + strM41529.substring(0, iMo22336) + "'");
        }
        String strSubstring = strM41529.substring(iMo22336);
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Remaining '" + strSubstring + "'");
        }
        if (strSubstring.equals("") || strSubstring.equals("\\")) {
            this.f54234 = 8;
            strSubstring = "\\";
        }
        if (!interfaceC15653.getPath().isEmpty()) {
            strSubstring = "\\" + interfaceC15653.getPath() + strSubstring;
        }
        if (strSubstring.charAt(0) != '\\') {
            interfaceC2148.mo7104("No slash at start of remaining DFS path ".concat(strSubstring));
        }
        this.f54233 = strSubstring;
        if (interfaceC15653.mo22341() != null && !interfaceC15653.mo22341().isEmpty()) {
            this.f54235 = interfaceC15653.mo22341();
        }
        return (str == null || !str.endsWith("\\") || strSubstring.endsWith("\\")) ? strSubstring : strSubstring.concat("\\");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f54232.toString());
        sb.append('[');
        if (this.f54233 != null) {
            sb.append("unc=");
            sb.append(this.f54233);
        }
        if (this.f54236 != null) {
            sb.append("canon=");
            sb.append(this.f54236);
        }
        if (this.f54230 != null) {
            sb.append("dfsReferral=");
            sb.append(this.f54230);
        }
        sb.append(']');
        return sb.toString();
    }
}
