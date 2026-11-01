package p067l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩸᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S978 */
/* JADX INFO: loaded from: classes.dex */
public final class C23120 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f72662;

    /* JADX INFO: renamed from: ۧ */
    public final int f72663;

    /* JADX INFO: renamed from: ܳ */
    public final int f72664;

    /* JADX INFO: renamed from: ܽ */
    public final int f72665;

    /* JADX INFO: renamed from: ܿ */
    public final int f72666;

    /* JADX INFO: renamed from: ᩳ */
    public final int f72667;

    /* JADX INFO: renamed from: ᩷ */
    public static final C21545 f72660 = new C21545();

    /* JADX INFO: renamed from: ۢ */
    public static final AtomicReference f72659 = new AtomicReference(new C17083());

    /* JADX INFO: renamed from: ᩻ */
    public static final ConcurrentMapC12768 f72661 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ۜ */
    public static final C23120 f72658 = m51549(null, 1447446, 1447446, 1447446, 1447446, 0);

    public C23120(String str, int i, int i2, int i3, int i4, int i5) {
        this.f72665 = i;
        this.f72663 = i2;
        this.f72664 = i3;
        this.f72666 = i4;
        this.f72667 = i5;
        this.f72662 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m51551() {
        return this.f72662;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m51560() {
        return this.f72663;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m51561() {
        return this.f72665;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m51562() {
        return this.f72666;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m51563() {
        return this.f72664;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m51564() {
        return this.f72667;
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m51556() {
        return C23223.m51768() ? this.f72664 : this.f72665;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m51558() {
        return C23223.m51768() ? this.f72666 : this.f72663;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m51557() {
        return (this.f72667 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m51552(int i) {
        if (i == this.f72667) {
            return this;
        }
        return m51549(this.f72662, this.f72665, this.f72663, this.f72664, this.f72666, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m51553(String str) {
        if (C12826.equals(str, this.f72662)) {
            return this;
        }
        return m51549(str, this.f72665, this.f72663, this.f72664, this.f72666, this.f72667);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C23120 m51559() {
        return m51552(this.f72667 | 128);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m51554(C23120 c23120) {
        C23120 c23121;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        if (this == c23120 || (c23121 = f72658) == c23120) {
            return this;
        }
        if (this == c23121) {
            return c23120;
        }
        int i7 = c23120.f72667;
        if ((i7 & 128) != 0) {
            return c23120;
        }
        int i8 = c23120.f72665;
        boolean z2 = true;
        if (i8 != 1447446 || i8 == (i6 = this.f72665)) {
            i = i8;
            z = false;
        } else {
            z = true;
            i = i6;
        }
        int i9 = c23120.f72663;
        if (i9 != 1447446 || i9 == (i2 = this.f72663)) {
            i2 = i9;
        } else {
            z = true;
        }
        int i10 = c23120.f72664;
        if (i10 != 1447446 || i10 == (i3 = this.f72664)) {
            i3 = i10;
        } else {
            z = true;
        }
        int i11 = c23120.f72666;
        if (i11 != 1447446 || i11 == (i5 = this.f72666)) {
            i4 = i11;
        } else {
            z = true;
            i4 = i5;
        }
        String str2 = c23120.f72662;
        if (str2 != null || (str = this.f72662) == null) {
            z2 = z;
            str = str2;
        }
        int i12 = this.f72667 | i7;
        return (z2 || i12 != i7) ? m51549(str, i, i2, i3, i4, i12) : c23120;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51555(C11996 c11996) {
        int i = this.f72666;
        int i2 = this.f72663;
        boolean z = (i2 == 0 && i == 0) ? false : true;
        String str = this.f72662;
        boolean z2 = str != null;
        if (z2) {
            c11996.writeByte(243);
        } else if (z) {
            c11996.writeByte(242);
        } else {
            c11996.writeByte(241);
        }
        c11996.writeInt(this.f72665);
        c11996.writeInt(this.f72664);
        if (z || z2) {
            c11996.writeInt(i2);
            c11996.writeInt(i);
        }
        if (z2) {
            c11996.m27459(str);
        }
        c11996.writeByte(this.f72667);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23120 m51550(C14677 c14677) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5 = c14677.readByte() & 255;
        int i6 = c14677.readInt();
        int i7 = c14677.readInt();
        String strM33593 = null;
        if (i5 == 241) {
            str = null;
            i4 = 0;
            i3 = 0;
        } else {
            if (i5 == 242) {
                i = c14677.readInt();
                i2 = c14677.readInt();
            } else if (i5 == 243) {
                i = c14677.readInt();
                i2 = c14677.readInt();
                strM33593 = c14677.m33593();
            } else {
                throw new RuntimeException();
            }
            i3 = i2;
            str = strM33593;
            i4 = i;
        }
        return m51549(str, i6, i4, i7, i3, c14677.readByte() & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23120 m51549(String str, int i, int i2, int i3, int i4, int i5) {
        C17083 c17083;
        if ((i5 & 64) != 0 || str != null) {
            return new C23120(str, i, i2, i3, i4, i5);
        }
        AtomicReference atomicReference = f72659;
        C17083 c17084 = (C17083) atomicReference.getAndSet(null);
        ConcurrentMapC12768 concurrentMapC12768 = f72661;
        if (c17084 != null) {
            C23120 c23120 = (C23120) concurrentMapC12768.get(c17084);
            atomicReference.set(c17084);
            if (c23120 != null) {
                return c23120;
            }
            c17083 = new C17083();
        } else {
            c17083 = new C17083();
            C23120 c23121 = (C23120) concurrentMapC12768.get(c17083);
            if (c23121 != null) {
                return c23121;
            }
        }
        C23120 c23122 = new C23120(null, i, i2, i3, i4, i5);
        concurrentMapC12768.put(c17083, c23122);
        return c23122;
    }

    public final String toString() {
        return String.format("StyleItem{dayColor=#%08X, dayBgColor=#%08X, nightColor=#%08X, nightBgColor=#%08X, flags=%s, colorParserMark=%s}", Integer.valueOf(this.f72665), Integer.valueOf(this.f72663), Integer.valueOf(this.f72664), Integer.valueOf(this.f72666), Integer.toBinaryString(this.f72667), this.f72662);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C23120.class == obj.getClass()) {
            C23120 c23120 = (C23120) obj;
            if (this.f72667 == c23120.f72667 && this.f72665 == c23120.f72665 && this.f72663 == c23120.f72663 && this.f72664 == c23120.f72664 && this.f72666 == c23120.f72666 && C12826.equals(this.f72662, c23120.f72662)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hashCode(this.f72662) + (((((((((this.f72665 * 31) + this.f72663) * 31) + this.f72664) * 31) + this.f72666) * 31) + this.f72667) * 31);
    }
}
