package p067l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12052 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final int f33575;

    /* JADX INFO: renamed from: ۧ */
    public final String f33576;

    /* JADX INFO: renamed from: ܳ */
    public final String f33577;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f33578;

    /* JADX INFO: renamed from: ܿ */
    public final String f33579;

    /* JADX INFO: renamed from: ᩳ */
    public final int f33580;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12052 m27609(Map map) {
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
                        C21334.m48351("Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        C6988.m16054("Invalid bitrate header: ", str4);
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
                        C21334.m48351("Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        C6988.m16054("Invalid metadata interval: ", str5);
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
            return new C12052(i, str, str2, str3, zEquals, i2);
        }
        return null;
    }

    public C12052(int i, String str, String str2, String str3, boolean z, int i2) {
        C23877.m52957(i2 == -1 || i2 > 0);
        this.f33575 = i;
        this.f33576 = str;
        this.f33579 = str2;
        this.f33577 = str3;
        this.f33578 = z;
        this.f33580 = i2;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final void mo3422(C19715 c19715) {
        String str = this.f33579;
        if (str != null) {
            c19715.m44831(str);
        }
        String str2 = this.f33576;
        if (str2 != null) {
            c19715.m44847(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12052.class == obj.getClass()) {
            C12052 c12052 = (C12052) obj;
            if (this.f33575 == c12052.f33575 && C12826.equals(this.f33576, c12052.f33576) && C12826.equals(this.f33579, c12052.f33579) && C12826.equals(this.f33577, c12052.f33577) && this.f33578 == c12052.f33578 && this.f33580 == c12052.f33580) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f33575 + 527) * 31;
        String str = this.f33576;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f33579;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f33577;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f33578 ? 1 : 0)) * 31) + this.f33580;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f33579 + "\", genre=\"" + this.f33576 + "\", bitrate=" + this.f33575 + ", metadataInterval=" + this.f33580;
    }
}
