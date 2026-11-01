package p067l;

import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9TZ */
/* JADX INFO: loaded from: classes5.dex */
public class C20008 implements Principal, InterfaceC7799, Serializable {
    public static final long serialVersionUID = -4090263879887877186L;

    /* JADX INFO: renamed from: ۬ */
    public static final InterfaceC4410 f60819 = C13128.m30022(C20008.class);

    /* JADX INFO: renamed from: ۗ */
    public String f60820;

    /* JADX INFO: renamed from: ۙ */
    public EnumC5926 f60821;

    /* JADX INFO: renamed from: ᩶ */
    public String f60822;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f60823;

    /* JADX INFO: renamed from: ᩹ */
    public String f60824;

    @Override // p067l.InterfaceC7799
    /* JADX INFO: renamed from: ۧ */
    public final C20008 mo18055() {
        if (InterfaceC7799.class.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    public C20008() {
        EnumC5926 enumC5926 = EnumC5926.NULL;
        this.f60823 = null;
        this.f60824 = "";
        this.f60820 = "";
        this.f60822 = "";
        this.f60821 = enumC5926;
    }

    public C20008(String str, String str2, String str3, EnumC5926 enumC5926) {
        this.f60823 = null;
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
        this.f60824 = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f60820 = str2;
        this.f60822 = str3 == null ? "" : str3;
        if (enumC5926 != null) {
            this.f60821 = enumC5926;
            return;
        }
        EnumC5926 enumC5927 = EnumC5926.USER;
        if ("guest".equalsIgnoreCase(str2)) {
            enumC5927 = EnumC5926.GUEST;
        } else {
            String str4 = this.f60824;
            if ((str4 == null || str4.isEmpty()) && this.f60820.isEmpty() && this.f60822.isEmpty()) {
                enumC5927 = EnumC5926.NULL;
            }
        }
        this.f60821 = enumC5927;
    }

    @Override // p067l.InterfaceC7799
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16653 mo18053(InterfaceC20106 interfaceC20106, String str, byte[] bArr, boolean z) throws C5255 {
        InterfaceC4410 interfaceC4410 = f60819;
        interfaceC20106.mo29602().getClass();
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    C9830 c9830 = new C9830(bArr);
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Have initial token " + c9830);
                    }
                    if (c9830.m22999() != null && !new HashSet(Arrays.asList(c9830.m22999())).contains(C17324.f51683)) {
                        throw new C2453("Server does not support NTLM authentication");
                    }
                }
            } catch (C5255 e) {
                throw e;
            } catch (IOException e2) {
                interfaceC4410.mo9176("Ignoring invalid initial token", (Exception) e2);
            }
        }
        InterfaceC3341 interfaceC3341Mo29602 = interfaceC20106.mo29602();
        C17324 c17324 = new C17324(interfaceC20106, this, z);
        if (str != null && ((C15410) interfaceC20106.mo29602()).m35104()) {
            c17324.m39307("cifs/".concat(str));
        }
        return new C7148(interfaceC3341Mo29602, c17324);
    }

    @Override // p067l.InterfaceC7799
    public C20008 clone() {
        C20008 c20008 = new C20008();
        c20008.f60824 = this.f60824;
        c20008.f60820 = this.f60820;
        c20008.f60822 = this.f60822;
        c20008.f60821 = this.f60821;
        return c20008;
    }

    @Override // p067l.InterfaceC7799
    /* JADX INFO: renamed from: ᩶֫ */
    public final String mo18057() {
        return this.f60824;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m45375() {
        return this.f60820;
    }

    public final String getPassword() {
        return this.f60822;
    }

    @Override // java.security.Principal
    public final String getName() {
        String str = this.f60824;
        if (str == null || str.length() <= 0) {
            return this.f60820;
        }
        return this.f60824 + "\\" + this.f60820;
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (obj instanceof C20008) {
            C20008 c20008 = (C20008) obj;
            String str = c20008.f60824;
            String upperCase = str != null ? str.toUpperCase() : null;
            String str2 = this.f60824;
            String upperCase2 = str2 != null ? str2.toUpperCase() : null;
            if (c20008.f60821 == this.f60821 && C12826.equals(upperCase, upperCase2) && c20008.f60820.equalsIgnoreCase(this.f60820) && C12826.equals(this.f60822, c20008.f60822)) {
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

    @Override // p067l.InterfaceC7799
    /* JADX INFO: renamed from: ܰ֫ */
    public final boolean mo18056() {
        return this.f60821 == EnumC5926.NULL;
    }

    @Override // p067l.InterfaceC7799
    /* JADX INFO: renamed from: ۗۧ */
    public final boolean mo18054() {
        return this.f60821 == EnumC5926.GUEST;
    }

    /* JADX INFO: renamed from: ֫ */
    public byte[] m45377(InterfaceC20106 interfaceC20106, byte[] bArr) {
        int iM35103 = ((C15410) interfaceC20106.mo29602()).m35103();
        if (iM35103 == 0 || iM35103 == 1) {
            return C20679.m46745(interfaceC20106, this.f60822, bArr);
        }
        if (iM35103 == 2) {
            return C20679.m46746(C20679.m46743(this.f60822), bArr);
        }
        if (iM35103 == 3 || iM35103 == 4 || iM35103 == 5) {
            if (this.f60823 == null) {
                this.f60823 = new byte[8];
                ((C15410) interfaceC20106.mo29602()).m35105().nextBytes(this.f60823);
            }
            String str = this.f60824;
            String str2 = this.f60820;
            String str3 = this.f60822;
            return C20679.m46744(str, str2, C20679.m46743(str3), bArr, this.f60823);
        }
        return C20679.m46745(interfaceC20106, this.f60822, bArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public byte[] m45378(InterfaceC20106 interfaceC20106, byte[] bArr) {
        int iM35103 = ((C15410) interfaceC20106.mo29602()).m35103();
        if (iM35103 == 0 || iM35103 == 1 || iM35103 == 2) {
            return C20679.m46746(C20679.m46743(this.f60822), bArr);
        }
        return (iM35103 == 3 || iM35103 == 4 || iM35103 == 5) ? new byte[0] : C20679.m46746(C20679.m46743(this.f60822), bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m45376(InterfaceC20106 interfaceC20106, byte[] bArr, byte[] bArr2) throws C5255 {
        try {
            MessageDigest messageDigestM14841 = C6478.m14841();
            MessageDigest messageDigestM14842 = C6478.m14841();
            messageDigestM14842.update(C11843.m27147(this.f60822));
            byte[] bArrDigest = messageDigestM14842.digest();
            int iM35103 = ((C15410) interfaceC20106.mo29602()).m35103();
            if (iM35103 == 0 || iM35103 == 1 || iM35103 == 2) {
                messageDigestM14841.update(bArrDigest);
                messageDigestM14841.digest(bArr2, 0, 16);
                return;
            }
            if (iM35103 == 3 || iM35103 == 4 || iM35103 == 5) {
                synchronized (this) {
                    if (this.f60823 == null) {
                        this.f60823 = new byte[8];
                        ((C15410) interfaceC20106.mo29602()).m35105().nextBytes(this.f60823);
                    }
                }
                MessageDigest messageDigestM14845 = C6478.m14845(bArrDigest);
                messageDigestM14845.update(C11843.m27147(this.f60820.toUpperCase()));
                messageDigestM14845.update(C11843.m27147(this.f60824.toUpperCase()));
                byte[] bArrDigest2 = messageDigestM14845.digest();
                MessageDigest messageDigestM14846 = C6478.m14845(bArrDigest2);
                messageDigestM14846.update(bArr);
                messageDigestM14846.update(this.f60823);
                MessageDigest messageDigestM14847 = C6478.m14845(bArrDigest2);
                messageDigestM14847.update(messageDigestM14846.digest());
                messageDigestM14847.digest(bArr2, 0, 16);
                return;
            }
            messageDigestM14841.update(bArrDigest);
            messageDigestM14841.digest(bArr2, 0, 16);
        } catch (Exception e) {
            throw new C5255("", e);
        }
    }
}
