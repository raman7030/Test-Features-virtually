package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩸᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S978 */
/* JADX INFO: loaded from: classes.dex */
public final class C21834 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69953;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f69954;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f69955;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f69956;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69957;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f69958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C20177 f69951 = new C20177();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f69950 = new AtomicReference(new C15482());

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f69952 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C21834 f69949 = m49198(null, 1447446, 1447446, 1447446, 1447446, 0);

    public C21834(String str, int i, int i2, int i3, int i4, int i5) {
        this.f69956 = i;
        this.f69954 = i2;
        this.f69955 = i3;
        this.f69957 = i4;
        this.f69958 = i5;
        this.f69953 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m49200() {
        return this.f69953;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m49209() {
        return this.f69954;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m49210() {
        return this.f69956;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m49211() {
        return this.f69957;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m49212() {
        return this.f69955;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m49213() {
        return this.f69958;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m49205() {
        return C21943.m49431() ? this.f69955 : this.f69956;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m49207() {
        return C21943.m49431() ? this.f69957 : this.f69954;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m49206() {
        return (this.f69958 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m49201(int i) {
        if (i == this.f69958) {
            return this;
        }
        return m49198(this.f69953, this.f69956, this.f69954, this.f69955, this.f69957, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m49202(String str) {
        if (C11003.equals(str, this.f69953)) {
            return this;
        }
        return m49198(str, this.f69956, this.f69954, this.f69955, this.f69957, this.f69958);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21834 m49208() {
        return m49201(this.f69958 | 128);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m49203(C21834 c21834) {
        C21834 c21835;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        if (this == c21834 || (c21835 = f69949) == c21834) {
            return this;
        }
        if (this == c21835) {
            return c21834;
        }
        int i7 = c21834.f69958;
        if ((i7 & 128) != 0) {
            return c21834;
        }
        int i8 = c21834.f69956;
        boolean z2 = true;
        if (i8 != 1447446 || i8 == (i6 = this.f69956)) {
            i = i8;
            z = false;
        } else {
            z = true;
            i = i6;
        }
        int i9 = c21834.f69954;
        if (i9 != 1447446 || i9 == (i2 = this.f69954)) {
            i2 = i9;
        } else {
            z = true;
        }
        int i10 = c21834.f69955;
        if (i10 != 1447446 || i10 == (i3 = this.f69955)) {
            i3 = i10;
        } else {
            z = true;
        }
        int i11 = c21834.f69957;
        if (i11 != 1447446 || i11 == (i5 = this.f69957)) {
            i4 = i11;
        } else {
            z = true;
            i4 = i5;
        }
        String str2 = c21834.f69953;
        if (str2 != null || (str = this.f69953) == null) {
            z2 = z;
            str = str2;
        }
        int i12 = this.f69958 | i7;
        return (z2 || i12 != i7) ? m49198(str, i, i2, i3, i4, i12) : c21834;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49204(C10130 c10130) {
        int i = this.f69957;
        int i2 = this.f69954;
        boolean z = (i2 == 0 && i == 0) ? false : true;
        String str = this.f69953;
        boolean z2 = str != null;
        if (z2) {
            c10130.writeByte(243);
        } else if (z) {
            c10130.writeByte(242);
        } else {
            c10130.writeByte(241);
        }
        c10130.writeInt(this.f69956);
        c10130.writeInt(this.f69955);
        if (z || z2) {
            c10130.writeInt(i2);
            c10130.writeInt(i);
        }
        if (z2) {
            c10130.m25439(str);
        }
        c10130.writeByte(this.f69958);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21834 m49199(C12951 c12951) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5 = c12951.readByte() & 255;
        int i6 = c12951.readInt();
        int i7 = c12951.readInt();
        String strM31506 = null;
        if (i5 == 241) {
            str = null;
            i4 = 0;
            i3 = 0;
        } else {
            if (i5 == 242) {
                i = c12951.readInt();
                i2 = c12951.readInt();
            } else if (i5 == 243) {
                i = c12951.readInt();
                i2 = c12951.readInt();
                strM31506 = c12951.m31506();
            } else {
                throw new RuntimeException();
            }
            i3 = i2;
            str = strM31506;
            i4 = i;
        }
        return m49198(str, i6, i4, i7, i3, c12951.readByte() & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21834 m49198(String str, int i, int i2, int i3, int i4, int i5) {
        C15482 c15482;
        if ((i5 & 64) != 0 || str != null) {
            return new C21834(str, i, i2, i3, i4, i5);
        }
        AtomicReference atomicReference = f69950;
        C15482 c15483 = (C15482) atomicReference.getAndSet(null);
        ConcurrentMapC10942 concurrentMapC10942 = f69952;
        if (c15483 != null) {
            C21834 c21834 = (C21834) concurrentMapC10942.get(c15483);
            atomicReference.set(c15483);
            if (c21834 != null) {
                return c21834;
            }
            c15482 = new C15482();
        } else {
            c15482 = new C15482();
            C21834 c21835 = (C21834) concurrentMapC10942.get(c15482);
            if (c21835 != null) {
                return c21835;
            }
        }
        C21834 c21836 = new C21834(null, i, i2, i3, i4, i5);
        concurrentMapC10942.put(c15482, c21836);
        return c21836;
    }

    public final String toString() {
        return String.format("StyleItem{dayColor=#%08X, dayBgColor=#%08X, nightColor=#%08X, nightBgColor=#%08X, flags=%s, colorParserMark=%s}", Integer.valueOf(this.f69956), Integer.valueOf(this.f69954), Integer.valueOf(this.f69955), Integer.valueOf(this.f69957), Integer.toBinaryString(this.f69958), this.f69953);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C21834.class == obj.getClass()) {
            C21834 c21834 = (C21834) obj;
            if (this.f69958 == c21834.f69958 && this.f69956 == c21834.f69956 && this.f69954 == c21834.f69954 && this.f69955 == c21834.f69955 && this.f69957 == c21834.f69957 && C11003.equals(this.f69953, c21834.f69953)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hashCode(this.f69953) + (((((((((this.f69956 * 31) + this.f69954) * 31) + this.f69955) * 31) + this.f69957) * 31) + this.f69958) * 31);
    }
}
