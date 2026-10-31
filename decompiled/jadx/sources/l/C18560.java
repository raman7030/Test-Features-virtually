package l;

import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9TZ */
/* JADX INFO: loaded from: classes5.dex */
public class C18560 implements Principal, InterfaceC5714, Serializable {
    public static final long serialVersionUID = -4090263879887877186L;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f57596 = C11321.m27961(C18560.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f57597;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC3743 f57598;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f57599;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f57600;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f57601;

    @Override // l.InterfaceC5714
    /* JADX INFO: renamed from: ۧ */
    public final C18560 mo16136() {
        if (InterfaceC5714.class.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    public C18560() {
        EnumC3743 enumC3743 = EnumC3743.NULL;
        this.f57600 = null;
        this.f57601 = "";
        this.f57597 = "";
        this.f57599 = "";
        this.f57598 = enumC3743;
    }

    public C18560(String str, String str2, String str3, EnumC3743 enumC3743) {
        this.f57600 = null;
        if (str2 != null) {
            int iIndexOf = str2.indexOf(64);
            if (iIndexOf > 0) {
                str = str2.substring(iIndexOf + 1);
                str2 = str2.substring(0, iIndexOf);
            } else {
                int iIndexOf2 = str2.indexOf(92);
                if (iIndexOf2 > 0) {
                    str = str2.substring(0, iIndexOf2);
                    str2 = str2.substring(iIndexOf2 + 1);
                }
            }
        }
        this.f57601 = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f57597 = str2;
        this.f57599 = str3 == null ? "" : str3;
        if (enumC3743 != null) {
            this.f57598 = enumC3743;
            return;
        }
        EnumC3743 enumC3744 = EnumC3743.USER;
        if ("guest".equalsIgnoreCase(str2)) {
            enumC3744 = EnumC3743.GUEST;
        } else {
            String str4 = this.f57601;
            if ((str4 == null || str4.isEmpty()) && this.f57597.isEmpty() && this.f57599.isEmpty()) {
                enumC3744 = EnumC3743.NULL;
            }
        }
        this.f57598 = enumC3744;
    }

    @Override // l.InterfaceC5714
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15030 mo16134(InterfaceC18663 interfaceC18663, String str, byte[] bArr, boolean z) throws C3037 {
        InterfaceC2148 interfaceC2148 = f57596;
        interfaceC18663.mo27540().getClass();
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    C7851 c7851 = new C7851(bArr);
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Have initial token " + c7851);
                    }
                    if (c7851.m21034() != null && !new HashSet(Arrays.asList(c7851.m21034())).contains(C15736.f48543)) {
                        throw new C0089("Server does not support NTLM authentication");
                    }
                }
            } catch (C3037 e) {
                throw e;
            } catch (IOException e2) {
                interfaceC2148.mo7081("Ignoring invalid initial token", (Exception) e2);
            }
        }
        InterfaceC1023 interfaceC1023Mo27540 = interfaceC18663.mo27540();
        C15736 c15736 = new C15736(interfaceC18663, this, z);
        if (str != null && ((C13722) interfaceC18663.mo27540()).m32990()) {
            c15736.m37138("cifs/".concat(str));
        }
        return new C5029(interfaceC1023Mo27540, c15736);
    }

    @Override // l.InterfaceC5714
    public C18560 clone() {
        C18560 c18560 = new C18560();
        c18560.f57601 = this.f57601;
        c18560.f57597 = this.f57597;
        c18560.f57599 = this.f57599;
        c18560.f57598 = this.f57598;
        return c18560;
    }

    @Override // l.InterfaceC5714
    /* JADX INFO: renamed from: ᩶֫ */
    public final String mo16138() {
        return this.f57601;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m43097() {
        return this.f57597;
    }

    public final String getPassword() {
        return this.f57599;
    }

    @Override // java.security.Principal
    public final String getName() {
        String str = this.f57601;
        if (str == null || str.length() <= 0) {
            return this.f57597;
        }
        return this.f57601 + "\\" + this.f57597;
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (obj instanceof C18560) {
            C18560 c18560 = (C18560) obj;
            String str = c18560.f57601;
            String upperCase = str != null ? str.toUpperCase() : null;
            String str2 = this.f57601;
            String upperCase2 = str2 != null ? str2.toUpperCase() : null;
            if (c18560.f57598 == this.f57598 && C11003.equals(upperCase, upperCase2) && c18560.f57597.equalsIgnoreCase(this.f57597) && C11003.equals(this.f57599, c18560.f57599)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return getName().toUpperCase().hashCode();
    }

    @Override // java.security.Principal
    public final String toString() {
        return getName();
    }

    @Override // l.InterfaceC5714
    /* JADX INFO: renamed from: ܰ֫ */
    public final boolean mo16137() {
        return this.f57598 == EnumC3743.NULL;
    }

    @Override // l.InterfaceC5714
    /* JADX INFO: renamed from: ۗۧ */
    public final boolean mo16135() {
        return this.f57598 == EnumC3743.GUEST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] m43099(InterfaceC18663 interfaceC18663, byte[] bArr) {
        int iM32989 = ((C13722) interfaceC18663.mo27540()).m32989();
        if (iM32989 == 0 || iM32989 == 1) {
            return C19266.m44451(interfaceC18663, this.f57599, bArr);
        }
        if (iM32989 == 2) {
            return C19266.m44452(C19266.m44449(this.f57599), bArr);
        }
        if (iM32989 == 3 || iM32989 == 4 || iM32989 == 5) {
            if (this.f57600 == null) {
                this.f57600 = new byte[8];
                ((C13722) interfaceC18663.mo27540()).m32991().nextBytes(this.f57600);
            }
            String str = this.f57601;
            String str2 = this.f57597;
            String str3 = this.f57599;
            return C19266.m44450(str, str2, C19266.m44449(str3), bArr, this.f57600);
        }
        return C19266.m44451(interfaceC18663, this.f57599, bArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] m43100(InterfaceC18663 interfaceC18663, byte[] bArr) {
        int iM32989 = ((C13722) interfaceC18663.mo27540()).m32989();
        if (iM32989 == 0 || iM32989 == 1 || iM32989 == 2) {
            return C19266.m44452(C19266.m44449(this.f57599), bArr);
        }
        return (iM32989 == 3 || iM32989 == 4 || iM32989 == 5) ? new byte[0] : C19266.m44452(C19266.m44449(this.f57599), bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m43098(InterfaceC18663 interfaceC18663, byte[] bArr, byte[] bArr2) throws C3037 {
        try {
            MessageDigest messageDigestM12977 = C4324.m12977();
            MessageDigest messageDigestM12978 = C4324.m12977();
            messageDigestM12978.update(C9969.m25130(this.f57599));
            byte[] bArrDigest = messageDigestM12978.digest();
            int iM32989 = ((C13722) interfaceC18663.mo27540()).m32989();
            if (iM32989 == 0 || iM32989 == 1 || iM32989 == 2) {
                messageDigestM12977.update(bArrDigest);
                messageDigestM12977.digest(bArr2, 0, 16);
                return;
            }
            if (iM32989 == 3 || iM32989 == 4 || iM32989 == 5) {
                synchronized (this) {
                    if (this.f57600 == null) {
                        this.f57600 = new byte[8];
                        ((C13722) interfaceC18663.mo27540()).m32991().nextBytes(this.f57600);
                    }
                }
                MessageDigest messageDigestM12981 = C4324.m12981(bArrDigest);
                messageDigestM12981.update(C9969.m25130(this.f57597.toUpperCase()));
                messageDigestM12981.update(C9969.m25130(this.f57601.toUpperCase()));
                byte[] bArrDigest2 = messageDigestM12981.digest();
                MessageDigest messageDigestM12982 = C4324.m12981(bArrDigest2);
                messageDigestM12982.update(bArr);
                messageDigestM12982.update(this.f57600);
                MessageDigest messageDigestM12983 = C4324.m12981(bArrDigest2);
                messageDigestM12983.update(messageDigestM12982.digest());
                messageDigestM12983.digest(bArr2, 0, 16);
                return;
            }
            messageDigestM12977.update(bArrDigest);
            messageDigestM12977.digest(bArr2, 0, 16);
        } catch (Exception e) {
            throw new C3037("", e);
        }
    }
}
