package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K63E */
/* JADX INFO: loaded from: classes4.dex */
public final class C16809 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f51604;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f51605;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C18683 f51606;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14692[] f51607;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f51608;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C16809 f51599 = m39543(1, Integer.MAX_VALUE, "style");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C16809 f51603 = m39543(1, Integer.MAX_VALUE, "layout");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C16809 f51598 = m39543(2, Integer.MAX_VALUE, "package");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C16809 f51601 = m39543(8, Integer.MAX_VALUE, "coreApp");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16809 f51602 = m39543(4, Integer.MAX_VALUE, "platformBuildVersionCode");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C16809 f51600 = m39543(6, Integer.MAX_VALUE, "platformBuildVersionName");

    public C16809(int i, String str, C14692[] c14692Arr, int i2) {
        this.f51608 = i;
        this.f51605 = str;
        this.f51607 = c14692Arr;
        this.f51604 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11606 m39546() {
        if (this.f51606 == null) {
            synchronized (this) {
                if (this.f51606 == null) {
                    this.f51606 = m39544();
                }
            }
        }
        return this.f51606;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C18683 m39544() {
        C18683 c18683 = new C18683();
        c18683.add(1);
        c18683.add(2);
        int i = this.f51608;
        if ((i & 1) != 0) {
            c18683.add(0);
        }
        if ((i & 2) != 0) {
            c18683.add(3);
            c18683.add(0);
        }
        if ((i & 4) != 0) {
            c18683.add(16);
            c18683.add(17);
        }
        if ((i & 8) != 0) {
            c18683.add(18);
        }
        if ((i & 16) != 0) {
            c18683.add(28);
            c18683.add(29);
            c18683.add(30);
            c18683.add(31);
        }
        if ((i & 32) != 0) {
            c18683.add(4);
        }
        if ((i & 64) != 0) {
            c18683.add(5);
        }
        if ((i & 128) != 0) {
            c18683.add(6);
        }
        if ((65536 & i) != 0) {
            c18683.add(16);
            c18683.add(17);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c18683.add(16);
            c18683.add(17);
        }
        return c18683;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m39545(int i) {
        C14692[] c14692Arr = this.f51607;
        int length = c14692Arr.length;
        while (length > 0) {
            length--;
            C14692 c14692 = c14692Arr[length];
            if (c14692.f44876 == i) {
                return c14692.f44875;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m39548(int i) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (C14692 c14692 : this.f51607) {
            int i2 = c14692.f44876;
            if ((i & i2) == i2) {
                i &= ~i2;
                arrayList.add(c14692);
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
                        int i5 = ((C14692) arrayList.get(i3)).f44876;
                        int i6 = ((C14692) arrayList.get(i4)).f44876;
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
                sb.append(((C14692) arrayList.get(i8)).f44875);
                sb.append('|');
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16809 m39543(int i, int i2, String str) {
        return new C16809(i, str, new C14692[0], i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m39547() {
        int i = this.f51608;
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
        return obj != null && C16809.class == obj.getClass() && this.f51604 == ((C16809) obj).f51604;
    }

    public final int hashCode() {
        return this.f51604;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f51605);
        sb.append("[");
        sb.append(m39547());
        sb.append("], id=");
        return C13540.m32584(sb, this.f51604);
    }
}
