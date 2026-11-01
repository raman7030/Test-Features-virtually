package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K63E */
/* JADX INFO: loaded from: classes4.dex */
public final class C18344 {

    /* JADX INFO: renamed from: ֫ */
    public final int f54786;

    /* JADX INFO: renamed from: ۧ */
    public final String f54787;

    /* JADX INFO: renamed from: ܽ */
    public volatile C20125 f54788;

    /* JADX INFO: renamed from: ܿ */
    public final C16332[] f54789;

    /* JADX INFO: renamed from: ᩳ */
    public int f54790;

    /* JADX INFO: renamed from: ۡ */
    public static C18344 f54781 = m41779(1, Integer.MAX_VALUE, "style");

    /* JADX INFO: renamed from: ᩻ */
    public static C18344 f54785 = m41779(1, Integer.MAX_VALUE, "layout");

    /* JADX INFO: renamed from: ۜ */
    public static C18344 f54780 = m41779(2, Integer.MAX_VALUE, "package");

    /* JADX INFO: renamed from: ܳ */
    public static C18344 f54783 = m41779(8, Integer.MAX_VALUE, "coreApp");

    /* JADX INFO: renamed from: ᩷ */
    public static C18344 f54784 = m41779(4, Integer.MAX_VALUE, "platformBuildVersionCode");

    /* JADX INFO: renamed from: ۢ */
    public static C18344 f54782 = m41779(6, Integer.MAX_VALUE, "platformBuildVersionName");

    public C18344(int i, String str, C16332[] c16332Arr, int i2) {
        this.f54790 = i;
        this.f54787 = str;
        this.f54789 = c16332Arr;
        this.f54786 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13399 m41782() {
        if (this.f54788 == null) {
            synchronized (this) {
                if (this.f54788 == null) {
                    this.f54788 = m41780();
                }
            }
        }
        return this.f54788;
    }

    /* JADX INFO: renamed from: ܽ */
    private C20125 m41780() {
        C20125 c20125 = new C20125();
        c20125.add(1);
        c20125.add(2);
        int i = this.f54790;
        if ((i & 1) != 0) {
            c20125.add(0);
        }
        if ((i & 2) != 0) {
            c20125.add(3);
            c20125.add(0);
        }
        if ((i & 4) != 0) {
            c20125.add(16);
            c20125.add(17);
        }
        if ((i & 8) != 0) {
            c20125.add(18);
        }
        if ((i & 16) != 0) {
            c20125.add(28);
            c20125.add(29);
            c20125.add(30);
            c20125.add(31);
        }
        if ((i & 32) != 0) {
            c20125.add(4);
        }
        if ((i & 64) != 0) {
            c20125.add(5);
        }
        if ((i & 128) != 0) {
            c20125.add(6);
        }
        if ((65536 & i) != 0) {
            c20125.add(16);
            c20125.add(17);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c20125.add(16);
            c20125.add(17);
        }
        return c20125;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m41781(int i) {
        C16332[] c16332Arr = this.f54789;
        int length = c16332Arr.length;
        while (length > 0) {
            length--;
            C16332 c16332 = c16332Arr[length];
            if (c16332.f47991 == i) {
                return c16332.f47990;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m41784(int i) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (C16332 c16332 : this.f54789) {
            int i2 = c16332.f47991;
            if ((i & i2) == i2) {
                i &= ~i2;
                arrayList.add(c16332);
            }
        }
        if (i != 0 || arrayList.size() <= 0) {
            return null;
        }
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i3 = 0; i3 < size - 1; i3++) {
            if (!zArr[i3]) {
                for (int i4 = i3 + 1; i4 < size; i4++) {
                    if (!zArr[i4]) {
                        int i5 = ((C16332) arrayList.get(i3)).f47991;
                        int i6 = ((C16332) arrayList.get(i4)).f47991;
                        int i7 = i5 & i6;
                        if (i7 != i6) {
                            if (i7 == i5) {
                                zArr[i3] = true;
                                break;
                            }
                        } else {
                            zArr[i4] = true;
                        }
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!zArr[i8]) {
                sb.append(((C16332) arrayList.get(i8)).f47990);
                sb.append('|');
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18344 m41779(int i, int i2, String str) {
        return new C18344(i, str, new C16332[0], i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m41783() {
        int i = this.f54790;
        if (i == 65535) {
            return "any";
        }
        StringBuilder sb = new StringBuilder();
        if ((i & 1) != 0) {
            sb.append("|reference");
        }
        if ((i & 2) != 0) {
            sb.append("|string");
        }
        if ((i & 4) != 0) {
            sb.append("|integer");
        }
        if ((i & 8) != 0) {
            sb.append("|boolean");
        }
        if ((i & 16) != 0) {
            sb.append("|color");
        }
        if ((i & 32) != 0) {
            sb.append("|float");
        }
        if ((i & 64) != 0) {
            sb.append("|dimension");
        }
        if ((i & 128) != 0) {
            sb.append("|fraction");
        }
        if ((65536 & i) != 0) {
            sb.append("|enum");
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            sb.append("|flags");
        }
        if (sb.length() == 0) {
            return "null";
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C18344.class == obj.getClass() && this.f54786 == ((C18344) obj).f54786;
    }

    public final int hashCode() {
        return this.f54786;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54787);
        sb.append("[");
        sb.append(m41783());
        sb.append("], id=");
        return C1514.m34687(sb, this.f54786);
    }
}
