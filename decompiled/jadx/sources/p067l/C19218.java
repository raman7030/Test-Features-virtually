package p067l;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ᩳ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9XF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19218 implements InterfaceC8035, Cloneable {

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC4410 f57421 = C13128.m30022(C19218.class);

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC17245 f57422 = null;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC20106 f57423;

    /* JADX INFO: renamed from: ۛ */
    public final URL f57424;

    /* JADX INFO: renamed from: ۤ */
    public String f57425;

    /* JADX INFO: renamed from: ۫ */
    public int f57426;

    /* JADX INFO: renamed from: ۬ */
    public String f57427;

    /* JADX INFO: renamed from: ᩶ */
    public String f57428;

    /* JADX INFO: renamed from: ᩸ */
    public int f57429;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC6024[] f57430;

    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX INFO: renamed from: ֡ */
    private synchronized void m43758() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char[] charArray = this.f57424.getPath().toCharArray();
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
                    throw new C14740("Invalid smb: URL: " + this.f57424);
                }
                i = i6 + 1;
                cArr[i6] = c4;
                c2 = 1;
            }
            i6 = i;
            i5++;
        }
        String str = new String(cArr, 0, i6);
        this.f57428 = str;
        if (i6 > 1) {
            int i8 = i6 - 1;
            int iIndexOf = str.indexOf(47, 1);
            if (iIndexOf < 0) {
                this.f57427 = this.f57428.substring(1);
                this.f57425 = "\\";
            } else if (iIndexOf == i8) {
                this.f57427 = this.f57428.substring(1, iIndexOf);
                this.f57425 = "\\";
            } else {
                this.f57427 = this.f57428.substring(1, iIndexOf);
                this.f57425 = this.f57428.substring(iIndexOf, i6).replace('/', '\\');
            }
        } else {
            this.f57428 = "/";
            this.f57427 = null;
            this.f57425 = "\\";
        }
    }

    public C19218(URL url, InterfaceC20106 interfaceC20106) {
        this.f57423 = interfaceC20106;
        this.f57424 = url;
    }

    public final C19218 clone() {
        C19218 c19218 = new C19218(this.f57424, this.f57423);
        c19218.f57428 = this.f57428;
        c19218.f57427 = this.f57427;
        c19218.f57422 = this.f57422;
        c19218.f57425 = this.f57425;
        InterfaceC6024[] interfaceC6024Arr = this.f57430;
        if (interfaceC6024Arr != null) {
            C2433[] c2433Arr = new C2433[interfaceC6024Arr.length];
            c19218.f57430 = c2433Arr;
            InterfaceC6024[] interfaceC6024Arr2 = this.f57430;
            System.arraycopy(interfaceC6024Arr2, 0, c2433Arr, 0, interfaceC6024Arr2.length);
        }
        c19218.f57429 = this.f57429;
        c19218.f57426 = this.f57426;
        return c19218;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43763(InterfaceC8035 interfaceC8035, String str) {
        boolean z;
        C19218 c19218 = (C19218) interfaceC8035;
        String strM43769 = c19218.m43769();
        if (strM43769 != null) {
            this.f57422 = c19218.f57422;
        }
        int length = str.length() - 1;
        if (length < 0 || str.charAt(length) != '/') {
            z = false;
        } else {
            str = str.substring(0, length);
            z = true;
        }
        if (strM43769 != null) {
            String strM43775 = c19218.m43775();
            if (strM43775.equals("\\")) {
                StringBuilder sb = new StringBuilder("\\");
                sb.append(str.replace('/', '\\'));
                sb.append(z ? "\\" : "");
                this.f57425 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c19218.m43767());
                sb2.append(str);
                sb2.append(z ? "/" : "");
                this.f57428 = sb2.toString();
                this.f57427 = strM43769;
                return;
            }
            StringBuilder sbM17248 = C7470.m17248(strM43775);
            sbM17248.append(str.replace('/', '\\'));
            sbM17248.append(z ? "\\" : "");
            this.f57425 = sbM17248.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c19218.m43767());
            sb3.append(str);
            sb3.append(z ? "/" : "");
            this.f57428 = sb3.toString();
            this.f57427 = strM43769;
            return;
        }
        String[] strArrSplit = str.split("/");
        int i = c19218.m43773() != null ? 0 : 1;
        if (strArrSplit.length > i) {
            this.f57427 = strArrSplit[i];
            i++;
        }
        if (strArrSplit.length <= i) {
            this.f57425 = "\\";
            if (this.f57427 == null) {
                this.f57428 = "/";
                return;
            }
            StringBuilder sb4 = new StringBuilder("/");
            sb4.append(this.f57427);
            sb4.append(z ? "/" : "");
            this.f57428 = sb4.toString();
            return;
        }
        String[] strArr = new String[strArrSplit.length - i];
        System.arraycopy(strArrSplit, i, strArr, 0, strArrSplit.length - i);
        StringBuilder sb5 = new StringBuilder("\\");
        sb5.append(C6112.m13906("\\", strArr));
        sb5.append(z ? "\\" : "");
        this.f57425 = sb5.toString();
        StringBuilder sb6 = new StringBuilder("/");
        sb6.append(this.f57427);
        sb6.append("/");
        sb6.append(C6112.m13906("/", strArr));
        sb6.append(z ? "/" : "");
        this.f57428 = sb6.toString();
    }

    public final String getName() {
        String strM43767 = m43767();
        String strM43769 = m43769();
        if (strM43767.length() > 1) {
            int length = strM43767.length() - 2;
            while (strM43767.charAt(length) != '/') {
                length--;
            }
            return strM43767.substring(length + 1);
        }
        if (strM43769 != null) {
            return strM43769.concat("/");
        }
        URL url = this.f57424;
        if (url.getHost().length() <= 0) {
            return "smb://";
        }
        return url.getHost() + '/';
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m43775() {
        if (this.f57425 == null) {
            m43758();
        }
        return this.f57425;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m43767() {
        if (this.f57425 == null) {
            m43758();
        }
        return this.f57428;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m43769() {
        if (this.f57425 == null) {
            m43758();
        }
        return this.f57427;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m43772() {
        InterfaceC17245 interfaceC17245 = this.f57422;
        if (interfaceC17245 != null) {
            return interfaceC17245.mo24298();
        }
        return m43773();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m43773() {
        String host = this.f57424.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43771() {
        return this.f57424.getPort();
    }

    /* JADX INFO: renamed from: ۢ */
    public final URL m43768() {
        return this.f57424;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m43774() {
        InterfaceC20106 interfaceC20106 = this.f57423;
        return ((C15410) interfaceC20106.mo29602()).m35098() && !interfaceC20106.mo8528().mo18056() && m43770();
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m43770() {
        if (m43769() != null && !"IPC$".equals(m43769())) {
            return false;
        }
        InterfaceC4410 interfaceC4410 = f57421;
        if (!interfaceC4410.mo9181()) {
            return true;
        }
        interfaceC4410.mo9183("Share is IPC " + this.f57427);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43762(int i) {
        this.f57426 = i;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m43766() {
        int iMo15277;
        if (this.f57426 == 0) {
            if (m43775().length() > 1) {
                this.f57426 = 1;
            } else if (m43769() != null) {
                if (m43769().equals("IPC$")) {
                    this.f57426 = 16;
                } else {
                    this.f57426 = 8;
                }
            } else {
                URL url = this.f57424;
                if (url.getAuthority() == null || url.getAuthority().isEmpty()) {
                    this.f57426 = 2;
                } else {
                    try {
                        InterfaceC6694 interfaceC6694 = (InterfaceC6694) m43761().mo3410(InterfaceC6694.class);
                        if (interfaceC6694 != null && ((iMo15277 = interfaceC6694.mo15277()) == 29 || iMo15277 == 27)) {
                            this.f57426 = 2;
                            return 2;
                        }
                    } catch (C20777 e) {
                        if (!(e.getCause() instanceof UnknownHostException)) {
                            throw e;
                        }
                        f57421.mo9176("Unknown host", (Exception) e);
                    }
                    this.f57426 = 4;
                }
            }
        }
        return this.f57426;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m43765() {
        int iMo15277;
        if (this.f57426 == 2 || this.f57424.getHost().length() == 0) {
            this.f57426 = 2;
            return true;
        }
        if (m43769() != null) {
            return false;
        }
        InterfaceC6694 interfaceC6694 = (InterfaceC6694) m43761().mo3410(InterfaceC6694.class);
        if (interfaceC6694 != null && ((iMo15277 = interfaceC6694.mo15277()) == 29 || iMo15277 == 27)) {
            this.f57426 = 2;
            return true;
        }
        this.f57426 = 4;
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6024 m43761() throws C20777 {
        int i = this.f57429;
        if (i != 0) {
            return this.f57430[i - 1];
        }
        this.f57429 = 0;
        if (this.f57430 == null) {
            URL url = this.f57424;
            String host = url.getHost();
            String path = url.getPath();
            String query = url.getQuery();
            InterfaceC20106 interfaceC20106 = this.f57423;
            try {
                if (query != null) {
                    String strM43759 = m43759(query, "server");
                    if (strM43759 != null && strM43759.length() > 0) {
                        this.f57430 = new C2433[]{((RunnableC11152) interfaceC20106.mo29601()).m25692(strM43759)};
                    }
                    String strM437510 = m43759(query, "address");
                    if (strM437510 != null && strM437510.length() > 0) {
                        this.f57430 = new C2433[]{new C2433(InetAddress.getByAddress(host, InetAddress.getByName(strM437510).getAddress()))};
                    }
                } else if (host.length() == 0) {
                    try {
                        this.f57430 = new C2433[]{runnableC11152.m25692(((RunnableC11152) interfaceC20106.mo29601()).m25693(1, "\u0001\u0002__MSBROWSE__\u0002").mo3408())};
                        RunnableC11152 runnableC11152 = (RunnableC11152) interfaceC20106.mo29601();
                    } catch (UnknownHostException e) {
                        f57421.mo9176("Unknown host", (Exception) e);
                        interfaceC20106.mo29602().getClass();
                        throw e;
                    }
                } else if (path.length() == 0 || path.equals("/")) {
                    this.f57430 = ((RunnableC11152) interfaceC20106.mo29601()).m25703(host, true);
                } else {
                    this.f57430 = ((RunnableC11152) interfaceC20106.mo29601()).m25703(host, false);
                }
            } catch (UnknownHostException e2) {
                throw new C20777(C21466.m48631("Failed to lookup address for name ", host), e2);
            }
        }
        int i2 = this.f57429;
        InterfaceC6024[] interfaceC6024Arr = this.f57430;
        if (i2 >= interfaceC6024Arr.length) {
            return null;
        }
        this.f57429 = i2 + 1;
        return interfaceC6024Arr[i2];
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m43759(String str, String str2) {
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

    /* JADX INFO: renamed from: ۖ */
    public final boolean m43764() {
        return m43775().length() <= 1;
    }

    public final int hashCode() {
        int iHashCode;
        try {
            iHashCode = m43761().hashCode();
        } catch (C20777 unused) {
            iHashCode = m43773().toUpperCase().hashCode();
        }
        return m43767().toUpperCase().hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19218)) {
            return false;
        }
        C19218 c19218 = (C19218) obj;
        String path = this.f57424.getPath();
        String path2 = c19218.f57424.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        int iLastIndexOf2 = path2.lastIndexOf(47);
        int length = path.length() - iLastIndexOf;
        int length2 = path2.length() - iLastIndexOf2;
        if (((length <= 1 || path.charAt(iLastIndexOf + 1) != '.') && ((length2 <= 1 || path2.charAt(iLastIndexOf2 + 1) != '.') && !(length == length2 && path.regionMatches(true, iLastIndexOf, path2, iLastIndexOf2, length)))) || !m43767().equalsIgnoreCase(c19218.m43767())) {
            return false;
        }
        try {
            return m43761().equals(c19218.m43761());
        } catch (C20777 e) {
            f57421.mo9176("Unknown host", (Exception) e);
            return m43773().equalsIgnoreCase(c19218.m43773());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43760(InterfaceC17245 interfaceC17245, String str) {
        if (C12826.equals(this.f57422, interfaceC17245)) {
            return this.f57425;
        }
        this.f57422 = interfaceC17245;
        String strM43775 = m43775();
        int iMo24305 = interfaceC17245.mo24305();
        InterfaceC4410 interfaceC4410 = f57421;
        if (iMo24305 < 0) {
            interfaceC4410.mo9199("Path consumed out of range " + iMo24305);
            iMo24305 = 0;
        } else if (iMo24305 > this.f57425.length()) {
            interfaceC4410.mo9199("Path consumed out of range " + iMo24305);
            iMo24305 = strM43775.length();
        }
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("UNC is '" + strM43775 + "'");
            interfaceC4410.mo9183("Consumed '" + strM43775.substring(0, iMo24305) + "'");
        }
        String strSubstring = strM43775.substring(iMo24305);
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Remaining '" + strSubstring + "'");
        }
        if (strSubstring.equals("") || strSubstring.equals("\\")) {
            this.f57426 = 8;
            strSubstring = "\\";
        }
        if (!interfaceC17245.getPath().isEmpty()) {
            strSubstring = "\\" + interfaceC17245.getPath() + strSubstring;
        }
        if (strSubstring.charAt(0) != '\\') {
            interfaceC4410.mo9199("No slash at start of remaining DFS path ".concat(strSubstring));
        }
        this.f57425 = strSubstring;
        if (interfaceC17245.mo24310() != null && !interfaceC17245.mo24310().isEmpty()) {
            this.f57427 = interfaceC17245.mo24310();
        }
        return (str == null || !str.endsWith("\\") || strSubstring.endsWith("\\")) ? strSubstring : strSubstring.concat("\\");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f57424.toString());
        sb.append('[');
        if (this.f57425 != null) {
            sb.append("unc=");
            sb.append(this.f57425);
        }
        if (this.f57428 != null) {
            sb.append("canon=");
            sb.append(this.f57428);
        }
        if (this.f57422 != null) {
            sb.append("dfsReferral=");
            sb.append(this.f57422);
        }
        sb.append(']');
        return sb.toString();
    }
}
