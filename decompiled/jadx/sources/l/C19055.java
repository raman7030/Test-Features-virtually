package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19055 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60023;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f60024;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12951 f60025;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60027 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f60026 = new Object();

    public C19055(C12951 c12951) {
        this.f60025 = c12951;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m43914() {
        int i;
        C12951 c12951 = this.f60025;
        int i2 = c12951.readInt();
        int i3 = c12951.readInt();
        if (i2 < 8 || i2 > 65536 || (i2 & 1) != 0 || i3 < 4 || i3 > 256 || (i3 & 1) != 0 || ((i = this.f60023) != 0 && (i != i2 || this.f60024 != i3))) {
            throw new IllegalArgumentException("Invalid text graph configuration");
        }
        this.f60023 = i2;
        this.f60024 = i3;
        return new C11999(m43913(0), i2, i3, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20466 m43913(int i) {
        AbstractC20466 c23993;
        if (i > 32) {
            throw new IllegalArgumentException("Text graph is too deep");
        }
        C12951 c12951 = this.f60025;
        int i2 = c12951.readInt();
        if (i2 == -1) {
            return null;
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.f60027;
            if (i2 <= arrayList.size()) {
                if (i2 < arrayList.size()) {
                    AbstractC20466 abstractC20466 = (AbstractC20466) arrayList.get(i2);
                    if (abstractC20466 != null) {
                        return abstractC20466;
                    }
                    throw new IllegalArgumentException("Cyclic text graph");
                }
                arrayList.add(null);
                int i3 = c12951.readByte() & 255;
                int i4 = c12951.readInt();
                Object obj = this.f60026;
                if (i3 == 1) {
                    int i5 = c12951.readByte() & 255;
                    if (i4 >= 1 && i4 <= this.f60023 && i5 <= 1) {
                        if (((long) i4) * ((long) (i5 == 1 ? 1 : 2)) <= c12951.available()) {
                            char[] cArr = new char[i4];
                            for (int i6 = 0; i6 < i4; i6++) {
                                cArr[i6] = i5 == 1 ? (char) (c12951.readByte() & 255) : c12951.m31507();
                            }
                            c23993 = new C21877(obj, this.f60023, cArr, 0, i4, null);
                        }
                    }
                    throw new IllegalArgumentException("Invalid text page length");
                }
                if (i3 == 2) {
                    if (i4 < 2 || i4 > this.f60024 || i4 > c12951.available() / 4) {
                        throw new IllegalArgumentException("Invalid text branch size");
                    }
                    AbstractC20466[] abstractC20466Arr = new AbstractC20466[i4];
                    for (int i7 = 0; i7 < i4; i7++) {
                        AbstractC20466 abstractC20466M43913 = m43913(i + 1);
                        abstractC20466Arr[i7] = abstractC20466M43913;
                        if (abstractC20466M43913 == null || (i7 > 0 && abstractC20466M43913.f65975 != abstractC20466Arr[0].f65975)) {
                            throw new IllegalArgumentException("Invalid text branch height");
                        }
                    }
                    c23993 = new C23993(obj, abstractC20466Arr);
                } else {
                    throw new IllegalArgumentException("Invalid text node type");
                }
                arrayList.set(i2, c23993);
                return c23993;
            }
        }
        throw new IllegalArgumentException("Invalid text node identity");
    }
}
