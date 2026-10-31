package l;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.۫ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AII */
/* JADX INFO: loaded from: classes4.dex */
public final class C12519 extends C4739 implements InterfaceC13224 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public String f37618;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C3347 f37619;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f37620;

    public C12519(C3347 c3347) {
        this.f37619 = c3347;
        m15542();
        m15540();
        m13883();
    }

    @Override // l.InterfaceC13224
    public final C3347 getKey() {
        return this.f37619;
    }

    @Override // l.C15321, l.InterfaceC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo26243(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo26243(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo13861();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo13861();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ᩻ */
    public final IOException mo26245() throws SocketException {
        String strM36351 = m36351();
        String strValueOf = String.valueOf(m36355());
        throw new SocketException(strM36351.contains(strValueOf) ? "FTP reply: ".concat(strM36351) : C19462.m44858("FTP reply ", strValueOf, ": ", strM36351));
    }

    @Override // l.InterfaceC13224
    public final String getPath() {
        return this.f37618;
    }

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ᩷ */
    public final String mo26244() {
        return this.f37620;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m30702(String str) {
        String strSubstring = str.substring(4);
        if (strSubstring.startsWith("当前目录是")) {
            strSubstring = strSubstring.substring(5);
        }
        if (!strSubstring.startsWith("\"")) {
            return strSubstring;
        }
        StringBuilder sb = new StringBuilder(strSubstring.length());
        boolean z = false;
        for (int i = 1; i < strSubstring.length(); i++) {
            char cCharAt = strSubstring.charAt(i);
            if (cCharAt != '\"') {
                if (z) {
                    return sb.toString();
                }
                sb.append(cCharAt);
            } else if (z) {
                sb.append(cCharAt);
                z = false;
            } else {
                z = true;
            }
        }
        return z ? sb.toString() : strSubstring;
    }

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo26241(String str) throws SocketException {
        if (AbstractC16891.m39731(str).equals(this.f37618)) {
            return true;
        }
        if (!C11250.m27829(m36350(EnumC13205.CWD, str))) {
            return false;
        }
        mo26242();
        return true;
    }

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ܳ */
    public final String mo26242() throws SocketException {
        String strM30702 = m36350(EnumC13205.PWD, (String) null) != 257 ? null : m30702((String) C18566.m43105(this.f46975, 1));
        if (strM30702 == null) {
            mo26245();
            throw null;
        }
        String strM39731 = AbstractC16891.m39731(strM30702);
        this.f37618 = strM39731;
        if (this.f37620 == null) {
            this.f37620 = strM39731;
        }
        return strM30702;
    }
}
