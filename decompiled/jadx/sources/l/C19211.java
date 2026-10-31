package l;

import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩵ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19211 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f60482;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f60485;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f60486;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14976 f60487;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0159 f60489;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f60491;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f60492;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f60494;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5099 f60496;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f60497;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f60499;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f60500;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f60501;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60502;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60503;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f60505;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f60506;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f60481 = {0, 1, 3, 7, 15, 31, 63, 127, 255, SecP521R1Field.P16, 1023, 2047, 4095, 8191, ASN1RelativeOID.MAX_IDENTIFIER_LENGTH, EnumC5983.f18409, 65535};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final int[] f60480 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f60484 = new int[1];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f60488 = new int[1];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f60498 = new int[1];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f60493 = new int[1];

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[][] f60495 = new int[1][];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[][] f60483 = new int[1][];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f60504 = new int[1];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int[] f60490 = new int[1];

    public C19211(C14976 c14976, int i) {
        C5099 c5099 = new C5099();
        c5099.f15995 = null;
        c5099.f15998 = null;
        c5099.f15994 = null;
        c5099.f15997 = null;
        c5099.f15999 = null;
        c5099.f15996 = null;
        this.f60496 = c5099;
        this.f60487 = c14976;
        this.f60489 = new C0159(c14976, this);
        this.f60492 = new int[4320];
        this.f60505 = new byte[i];
        this.f60503 = i;
        this.f60506 = c14976.f64360.f24518 != 0;
        this.f60500 = 0;
        m44330();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44330() {
        this.f60500 = 0;
        this.f60499 = 0;
        this.f60497 = 0;
        this.f60502 = 0;
        this.f60501 = 0;
        if (this.f60506) {
            this.f60487.f64352.reset();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:217:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0115 A[LOOP:4: B:39:0x0115->B:42:0x011a, LOOP_START, PHI: r1 r9 r10 r11 r12
      0x0115: PHI (r1v39 int) = (r1v38 int), (r1v44 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r9v8 int) = (r9v6 int), (r9v9 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r10v10 int) = (r10v8 int), (r10v11 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r11v16 int) = (r11v15 int), (r11v18 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r12v14 int) = (r12v12 int), (r12v16 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x011a A[LOOP:4: B:39:0x0115->B:42:0x011a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0144 -> B:46:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m44331(int r34) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19211.m44331(int):int");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44329(int i) {
        C14976 c14976 = this.f60487;
        int i2 = c14976.f64355;
        int i3 = this.f60501;
        int i4 = this.f60502;
        int i5 = this.f60503;
        if (i3 > i4) {
            i4 = i5;
        }
        int i6 = i4 - i3;
        int i7 = c14976.f64359;
        if (i6 > i7) {
            i6 = i7;
        }
        if (i6 != 0 && i == -5) {
            i = 0;
        }
        c14976.f64359 = i7 - i6;
        c14976.f64358 += (long) i6;
        boolean z = this.f60506;
        if (z && i6 > 0) {
            c14976.f64352.update(this.f60505, i3, i6);
        }
        System.arraycopy(this.f60505, i3, c14976.f64362, i2, i6);
        int i8 = i2 + i6;
        int i9 = i3 + i6;
        if (i9 == i5) {
            if (this.f60502 == i5) {
                this.f60502 = 0;
            }
            i9 = this.f60502;
            int i10 = c14976.f64359;
            if (i9 > i10) {
                i9 = i10;
            }
            if (i9 != 0 && i == -5) {
                i = 0;
            }
            c14976.f64359 = i10 - i9;
            c14976.f64358 += (long) i9;
            if (z && i9 > 0) {
                c14976.f64352.update(this.f60505, 0, i9);
            }
            System.arraycopy(this.f60505, 0, c14976.f64362, i8, i9);
            i8 += i9;
        }
        c14976.f64355 = i8;
        this.f60501 = i9;
        return i;
    }
}
