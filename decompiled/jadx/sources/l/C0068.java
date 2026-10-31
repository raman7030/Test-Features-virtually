package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.֡֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A0A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0068 implements InterfaceC3846 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f981;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f982;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1011(String str) {
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

    public C0068(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.f981 = obj;
    }

    public final int hashCode() {
        return this.f981.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0068) {
            return this.f981.equals(((C0068) obj).f981);
        }
        return false;
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo1016() {
        Object obj = this.f981;
        if (obj instanceof C15590) {
            return ((C15590) obj).mo1016();
        }
        String hostName = ((InetAddress) obj).getHostName();
        this.f982 = hostName;
        if (m1011(hostName)) {
            this.f982 = "*SMBSERVER     ";
        } else {
            int iIndexOf = this.f982.indexOf(46);
            if (iIndexOf > 1 && iIndexOf < 15) {
                this.f982 = this.f982.substring(0, iIndexOf).toUpperCase();
            } else if (this.f982.length() > 15) {
                this.f982 = "*SMBSERVER     ";
            } else {
                this.f982 = this.f982.toUpperCase();
            }
        }
        return this.f982;
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo1013(InterfaceC18663 interfaceC18663) {
        Object obj = this.f981;
        if (obj instanceof C15590) {
            return ((C15590) obj).mo1013(interfaceC18663);
        }
        if (this.f982 == "*SMBSERVER     ") {
            return null;
        }
        this.f982 = "*SMBSERVER     ";
        return "*SMBSERVER     ";
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo1015() {
        Object obj = this.f981;
        if (obj instanceof C15590) {
            return ((C15590) obj).mo1015();
        }
        return ((InetAddress) obj).getHostName();
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo1012() {
        Object obj = this.f981;
        if (obj instanceof C15590) {
            return ((C15590) obj).mo1012();
        }
        return ((InetAddress) obj).getHostAddress();
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3846 mo1014(Class cls) {
        Object obj = this.f981;
        if (obj instanceof InterfaceC3846) {
            return ((InterfaceC3846) obj).mo1014(InterfaceC4551.class);
        }
        if (C0068.class.isAssignableFrom(InterfaceC4551.class)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return this.f981.toString();
    }
}
