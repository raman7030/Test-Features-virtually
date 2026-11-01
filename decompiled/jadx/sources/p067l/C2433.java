package p067l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.֡֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A0A */
/* JADX INFO: loaded from: classes2.dex */
public final class C2433 implements InterfaceC6024 {

    /* JADX INFO: renamed from: ֫ */
    public Object f3756;

    /* JADX INFO: renamed from: ۧ */
    public String f3757;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m3407(String str) {
        if (Character.isDigit(str.charAt(0))) {
            int length = str.length();
            char[] charArray = str.toCharArray();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    return true;
                }
                if (i3 >= length || charArray[i3] != '.') {
                    i = i3;
                } else {
                    i2++;
                    i += 2;
                }
            }
        }
        return false;
    }

    public C2433(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.f3756 = obj;
    }

    public final int hashCode() {
        return this.f3756.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2433) {
            return this.f3756.equals(((C2433) obj).f3756);
        }
        return false;
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3412() {
        Object obj = this.f3756;
        if (obj instanceof C17185) {
            return ((C17185) obj).mo3412();
        }
        String hostName = ((InetAddress) obj).getHostName();
        this.f3757 = hostName;
        if (m3407(hostName)) {
            this.f3757 = "*SMBSERVER     ";
        } else {
            int iIndexOf = this.f3757.indexOf(46);
            if (iIndexOf > 1 && iIndexOf < 15) {
                this.f3757 = this.f3757.substring(0, iIndexOf).toUpperCase();
            } else if (this.f3757.length() > 15) {
                this.f3757 = "*SMBSERVER     ";
            } else {
                this.f3757 = this.f3757.toUpperCase();
            }
        }
        return this.f3757;
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ֫ */
    public final String mo3409(InterfaceC20106 interfaceC20106) {
        Object obj = this.f3756;
        if (obj instanceof C17185) {
            return ((C17185) obj).mo3409(interfaceC20106);
        }
        if (this.f3757 == "*SMBSERVER     ") {
            return null;
        }
        this.f3757 = "*SMBSERVER     ";
        return "*SMBSERVER     ";
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ۧ */
    public final String mo3411() {
        Object obj = this.f3756;
        if (obj instanceof C17185) {
            return ((C17185) obj).mo3411();
        }
        return ((InetAddress) obj).getHostName();
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ֫ */
    public final String mo3408() {
        Object obj = this.f3756;
        if (obj instanceof C17185) {
            return ((C17185) obj).mo3408();
        }
        return ((InetAddress) obj).getHostAddress();
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6024 mo3410(Class cls) {
        Object obj = this.f3756;
        if (obj instanceof InterfaceC6024) {
            return ((InterfaceC6024) obj).mo3410(InterfaceC6694.class);
        }
        if (C2433.class.isAssignableFrom(InterfaceC6694.class)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return this.f3756.toString();
    }
}
