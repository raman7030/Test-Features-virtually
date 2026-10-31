package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10189 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30613;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f30614;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f30615;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f30616;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f30617;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f30618;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10189 m25587(Map map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        int i3;
        List list = (List) map.get("icy-br");
        boolean z2 = true;
        int i4 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i3 = Integer.parseInt(str4) * 1000;
                if (i3 > 0) {
                    z = true;
                } else {
                    try {
                        C19956.m46037("Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        C4860.m14173("Invalid bitrate header: ", str4);
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i3 = -1;
            }
            i = i3;
        } else {
            z = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i5 = Integer.parseInt(str5);
                if (i5 > 0) {
                    i4 = i5;
                } else {
                    try {
                        C19956.m46037("Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        C4860.m14173("Invalid metadata interval: ", str5);
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
            i2 = i4;
        } else {
            i2 = -1;
        }
        if (z) {
            return new C10189(i, str, str2, str3, zEquals, i2);
        }
        return null;
    }

    public C10189(int i, String str, String str2, String str3, boolean z, int i2) {
        C22632.m50631(i2 == -1 || i2 > 0);
        this.f30613 = i;
        this.f30614 = str;
        this.f30617 = str2;
        this.f30615 = str3;
        this.f30616 = z;
        this.f30618 = i2;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        String str = this.f30617;
        if (str != null) {
            c18252.m42572(str);
        }
        String str2 = this.f30614;
        if (str2 != null) {
            c18252.m42588(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10189.class == obj.getClass()) {
            C10189 c10189 = (C10189) obj;
            if (this.f30613 == c10189.f30613 && C11003.equals(this.f30614, c10189.f30614) && C11003.equals(this.f30617, c10189.f30617) && C11003.equals(this.f30615, c10189.f30615) && this.f30616 == c10189.f30616 && this.f30618 == c10189.f30618) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f30613 + 527) * 31;
        String str = this.f30614;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30617;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30615;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f30616 ? 1 : 0)) * 31) + this.f30618;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f30617 + "\", genre=\"" + this.f30614 + "\", bitrate=" + this.f30613 + ", metadataInterval=" + this.f30618;
    }
}
