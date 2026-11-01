package p067l;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.۫ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AII */
/* JADX INFO: loaded from: classes4.dex */
public final class C14267 extends C6872 implements InterfaceC14937 {

    /* JADX INFO: renamed from: ܳ֫ */
    public String f40642;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C5550 f40643;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f40644;

    public C14267(C5550 c5550) {
        this.f40643 = c5550;
        m17453();
        m17451();
        m15763();
    }

    @Override // p067l.InterfaceC14937
    public final C5550 getKey() {
        return this.f40643;
    }

    @Override // p067l.C16929, p067l.InterfaceC14937
    /* JADX INFO: renamed from: ܽ */
    public final int mo28272(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo28272(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo15741();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo15741();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ᩻ */
    public final IOException mo28274() throws SocketException {
        String strM38509 = m38509();
        String strValueOf = String.valueOf(m38513());
        throw new SocketException(strM38509.contains(strValueOf) ? "FTP reply: ".concat(strM38509) : C20865.m47154("FTP reply ", strValueOf, ": ", strM38509));
    }

    @Override // p067l.InterfaceC14937
    public final String getPath() {
        return this.f40642;
    }

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ᩷ */
    public final String mo28273() {
        return this.f40644;
    }

    /* JADX INFO: renamed from: ܺ */
    public static String m32776(String str) {
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

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo28270(String str) throws SocketException {
        if (AbstractC18422.m41972(str).equals(this.f40642)) {
            return true;
        }
        if (!C13061.m29891(m38508(EnumC14918.CWD, str))) {
            return false;
        }
        mo28271();
        return true;
    }

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ܳ */
    public final String mo28271() throws SocketException {
        String strM32776 = m38508(EnumC14918.PWD, (String) null) != 257 ? null : m32776((String) C20013.m45383(this.f50101, 1));
        if (strM32776 == null) {
            mo28274();
            throw null;
        }
        String strM41972 = AbstractC18422.m41972(strM32776);
        this.f40642 = strM41972;
        if (this.f40644 == null) {
            this.f40644 = strM41972;
        }
        return strM32776;
    }
}
