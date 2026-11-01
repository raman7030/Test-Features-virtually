package p067l;

import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ܺ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17185 implements InterfaceC6694 {

    /* JADX INFO: renamed from: ֫ */
    public int f51161;

    /* JADX INFO: renamed from: ۧ */
    public String f51162;

    /* JADX INFO: renamed from: ܽ */
    public C17856 f51163;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f51164;

    public C17185(C17856 c17856, int i) {
        this.f51163 = c17856;
        this.f51161 = i;
    }

    public C17185(C17856 c17856, int i, int i2) {
        this.f51163 = c17856;
        this.f51161 = i;
        this.f51164 = true;
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6024 mo3410(Class cls) {
        if (cls.isAssignableFrom(C17185.class)) {
            return this;
        }
        return null;
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3412() {
        String str = this.f51163.f53292;
        this.f51162 = str;
        int i = 0;
        if (Character.isDigit(str.charAt(0))) {
            int length = this.f51162.length();
            char[] charArray = this.f51162.toCharArray();
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    this.f51162 = "*SMBSERVER     ";
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
            switch (this.f51163.f53291) {
                case 27:
                case 28:
                case 29:
                    this.f51162 = "*SMBSERVER     ";
                    break;
            }
        }
        return this.f51162;
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ֫ */
    public final String mo3409(InterfaceC20106 interfaceC20106) {
        String str = this.f51162;
        if (str == this.f51163.f53292) {
            this.f51162 = "*SMBSERVER     ";
        } else if ("*SMBSERVER     ".equals(str)) {
            try {
                C17185[] c17185ArrM25706 = ((RunnableC11152) interfaceC20106.mo29601()).m25706(this);
                if (this.f51163.f53291 == 29) {
                    for (C17185 c17185 : c17185ArrM25706) {
                        if (c17185.f51163.f53291 == 32) {
                            return c17185.mo3411();
                        }
                    }
                    return null;
                }
                if (this.f51164) {
                    this.f51162 = null;
                    return mo3411();
                }
            } catch (UnknownHostException unused) {
                this.f51162 = null;
            }
        } else {
            this.f51162 = null;
        }
        return this.f51162;
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ۧ */
    public final String mo3411() {
        if (this.f51163.m40547()) {
            return mo3408();
        }
        return this.f51163.f53292;
    }

    @Override // p067l.InterfaceC6024
    /* JADX INFO: renamed from: ֫ */
    public final String mo3408() {
        StringBuilder sb = new StringBuilder();
        int i = this.f51161;
        sb.append((i >>> 24) & 255);
        sb.append(".");
        sb.append((i >>> 16) & 255);
        sb.append(".");
        sb.append((i >>> 8) & 255);
        sb.append(".");
        sb.append(i & 255);
        return sb.toString();
    }

    @Override // p067l.InterfaceC6694
    /* JADX INFO: renamed from: ܽ */
    public final int mo15277() {
        return this.f51163.f53291;
    }

    public final int hashCode() {
        return this.f51161;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C17185) && ((C17185) obj).f51161 == this.f51161;
    }

    public final String toString() {
        return this.f51163.toString() + "/" + mo3408();
    }
}
