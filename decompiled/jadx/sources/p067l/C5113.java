package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5113 {

    /* JADX INFO: renamed from: ֫ */
    public final char[] f12017 = new char[8];

    /* JADX INFO: renamed from: ۧ */
    public int f12018;

    /* JADX INFO: renamed from: ֫ */
    public static C5113 m10897(C7933 c7933) {
        int i;
        if (!(c7933 instanceof C13160)) {
            return null;
        }
        C5113 c5113 = new C5113();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c7933);
        while (!arrayList.isEmpty()) {
            C7933 c7934 = (C7933) C6406.m14670(arrayList, 1);
            if (c7934 instanceof C13160) {
                C13160 c13160 = (C13160) c7934;
                for (int i2 = c13160.f36987 - 1; i2 >= 0; i2--) {
                    C7933 c7935 = c13160.f36986[i2];
                    if (c7935 == null) {
                        return null;
                    }
                    arrayList.add(c7935);
                }
            } else {
                Class<?> cls = c7934.getClass();
                int i3 = 0;
                char[] cArr = c5113.f12017;
                if (cls == C11168.class) {
                    int[] iArr = ((C11168) c7934).f10016;
                    if (iArr.length == 0 || (i = iArr[0]) > 65535) {
                        return null;
                    }
                    char c = (char) i;
                    while (true) {
                        int i4 = c5113.f12018;
                        if (i3 >= i4) {
                            if (i4 != cArr.length) {
                                c5113.f12018 = i4 + 1;
                                cArr[i4] = c;
                                break;
                            }
                            return null;
                        }
                        if (cArr[i3] == c) {
                            break;
                        }
                        i3++;
                    }
                } else if (c7934 instanceof C21207) {
                    int iM42219 = C18543.m42219((C21207) c7934);
                    if (iM42219 < 0) {
                        return null;
                    }
                    char c2 = (char) iM42219;
                    while (true) {
                        int i5 = c5113.f12018;
                        if (i3 >= i5) {
                            if (i5 != cArr.length) {
                                c5113.f12018 = i5 + 1;
                                cArr[i5] = c2;
                                break;
                            }
                            return null;
                        }
                        if (cArr[i3] == c2) {
                            break;
                        }
                        i3++;
                    }
                } else {
                    if (!(c7934 instanceof C22016)) {
                        return null;
                    }
                    C22016 c22016 = (C22016) c7934;
                    C7933 c7936 = c22016.f69297;
                    if (c22016.f69300 <= 0) {
                        return null;
                    }
                    if (c7936.getClass() != C11168.class && !(c7936 instanceof C21207)) {
                        return null;
                    }
                    arrayList.add(c7936);
                }
            }
        }
        if (c5113.f12018 > 1) {
            return c5113;
        }
        return null;
    }
}
