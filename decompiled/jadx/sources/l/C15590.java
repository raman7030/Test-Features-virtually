package l;

import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ܺ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15590 implements InterfaceC4551 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48029;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f48030;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16296 f48031;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f48032;

    public C15590(C16296 c16296, int i) {
        this.f48031 = c16296;
        this.f48029 = i;
    }

    public C15590(C16296 c16296, int i, int i2) {
        this.f48031 = c16296;
        this.f48029 = i;
        this.f48032 = true;
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3846 mo1014(Class cls) {
        if (cls.isAssignableFrom(C15590.class)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ᩳ */
    public final String mo1016() {
        String str = this.f48031.f50125;
        this.f48030 = str;
        int i = 0;
        if (Character.isDigit(str.charAt(0))) {
            int length = this.f48030.length();
            char[] charArray = this.f48030.toCharArray();
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    this.f48030 = "*SMBSERVER     ";
                    break;
                }
                if (i3 >= length || charArray[i3] != '.') {
                    i = i3;
                } else {
                    i2++;
                    i += 2;
                }
            }
        } else {
            switch (this.f48031.f50124) {
                case 27:
                case 28:
                case 29:
                    this.f48030 = "*SMBSERVER     ";
                    break;
            }
        }
        return this.f48030;
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ֫ */
    public final String mo1013(InterfaceC18663 interfaceC18663) {
        String str = this.f48030;
        if (str == this.f48031.f50125) {
            this.f48030 = "*SMBSERVER     ";
        } else if ("*SMBSERVER     ".equals(str)) {
            try {
                C15590[] c15590ArrM23706 = ((RunnableC9242) interfaceC18663.mo27539()).m23706(this);
                if (this.f48031.f50124 == 29) {
                    for (C15590 c15590 : c15590ArrM23706) {
                        if (c15590.f48031.f50124 == 32) {
                            return c15590.mo1015();
                        }
                    }
                    return null;
                }
                if (this.f48032) {
                    this.f48030 = null;
                    return mo1015();
                }
            } catch (UnknownHostException unused) {
                this.f48030 = null;
            }
        } else {
            this.f48030 = null;
        }
        return this.f48030;
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ۧ */
    public final String mo1015() {
        if (this.f48031.m38332()) {
            return mo1012();
        }
        return this.f48031.f50125;
    }

    @Override // l.InterfaceC3846
    /* JADX INFO: renamed from: ֫ */
    public final String mo1012() {
        StringBuilder sb = new StringBuilder();
        int i = this.f48029;
        sb.append((i >>> 24) & 255);
        sb.append(".");
        sb.append((i >>> 16) & 255);
        sb.append(".");
        sb.append((i >>> 8) & 255);
        sb.append(".");
        sb.append(i & 255);
        return sb.toString();
    }

    @Override // l.InterfaceC4551
    /* JADX INFO: renamed from: ܽ */
    public final int mo13389() {
        return this.f48031.f50124;
    }

    public final int hashCode() {
        return this.f48029;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C15590) && ((C15590) obj).f48029 == this.f48029;
    }

    public final String toString() {
        return this.f48031.toString() + "/" + mo1012();
    }
}
