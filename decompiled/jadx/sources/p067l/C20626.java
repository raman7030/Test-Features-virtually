package p067l;

import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩵ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20626 {

    /* JADX INFO: renamed from: ֡ */
    public int f63713;

    /* JADX INFO: renamed from: ۖ */
    public int f63716;

    /* JADX INFO: renamed from: ۘ */
    public int f63717;

    /* JADX INFO: renamed from: ۙ */
    public final C16601 f63718;

    /* JADX INFO: renamed from: ۜ */
    public final C2519 f63720;

    /* JADX INFO: renamed from: ۡ */
    public int f63722;

    /* JADX INFO: renamed from: ۢ */
    public int[] f63723;

    /* JADX INFO: renamed from: ܳ */
    public int[] f63725;

    /* JADX INFO: renamed from: ܺ */
    public final C7214 f63727;

    /* JADX INFO: renamed from: ܽ */
    public int f63728;

    /* JADX INFO: renamed from: ᩳ */
    public int f63730;

    /* JADX INFO: renamed from: ᩴ */
    public int f63731;

    /* JADX INFO: renamed from: ᩵ */
    public int f63732;

    /* JADX INFO: renamed from: ᩶ */
    public int f63733;

    /* JADX INFO: renamed from: ᩷ */
    public int f63734;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f63736;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f63737;

    /* JADX INFO: renamed from: ۬ */
    public static final int[] f63712 = {0, 1, 3, 7, 15, 31, 63, 127, 255, SecP521R1Field.P16, 1023, 2047, 4095, 8191, ASN1RelativeOID.MAX_IDENTIFIER_LENGTH, EnumC8055.f21261, 65535};

    /* JADX INFO: renamed from: ۗ */
    public static final int[] f63711 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: ֫ */
    public int[] f63715 = new int[1];

    /* JADX INFO: renamed from: ۚ */
    public int[] f63719 = new int[1];

    /* JADX INFO: renamed from: ܿ */
    public int[] f63729 = new int[1];

    /* JADX INFO: renamed from: ۧ */
    public int[] f63724 = new int[1];

    /* JADX INFO: renamed from: ܶ */
    public int[][] f63726 = new int[1][];

    /* JADX INFO: renamed from: ֨ */
    public int[][] f63714 = new int[1][];

    /* JADX INFO: renamed from: ᩸ */
    public int[] f63735 = new int[1];

    /* JADX INFO: renamed from: ۠ */
    public int[] f63721 = new int[1];

    public C20626(C16601 c16601, int i) {
        C7214 c7214 = new C7214();
        c7214.f18830 = null;
        c7214.f18833 = null;
        c7214.f18829 = null;
        c7214.f18832 = null;
        c7214.f18834 = null;
        c7214.f18831 = null;
        this.f63727 = c7214;
        this.f63718 = c16601;
        this.f63720 = new C2519(c16601, this);
        this.f63723 = new int[4320];
        this.f63736 = new byte[i];
        this.f63734 = i;
        this.f63737 = c16601.f66998.f27433 != 0;
        this.f63731 = 0;
        m46624();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46624() {
        this.f63731 = 0;
        this.f63730 = 0;
        this.f63728 = 0;
        this.f63733 = 0;
        this.f63732 = 0;
        if (this.f63737) {
            this.f63718.f66990.reset();
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
    /* JADX INFO: renamed from: ۧ */
    public final int m46625(int r34) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C20626.m46625(int):int");
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46623(int i) {
        C16601 c16601 = this.f63718;
        int i2 = c16601.f66993;
        int i3 = this.f63732;
        int i4 = this.f63733;
        int i5 = this.f63734;
        if (i3 > i4) {
            i4 = i5;
        }
        int i6 = i4 - i3;
        int i7 = c16601.f66997;
        if (i6 > i7) {
            i6 = i7;
        }
        if (i6 != 0 && i == -5) {
            i = 0;
        }
        c16601.f66997 = i7 - i6;
        c16601.f66996 += (long) i6;
        boolean z = this.f63737;
        if (z && i6 > 0) {
            c16601.f66990.update(this.f63736, i3, i6);
        }
        System.arraycopy(this.f63736, i3, c16601.f67000, i2, i6);
        int i8 = i2 + i6;
        int i9 = i3 + i6;
        if (i9 == i5) {
            if (this.f63733 == i5) {
                this.f63733 = 0;
            }
            i9 = this.f63733;
            int i10 = c16601.f66997;
            if (i9 > i10) {
                i9 = i10;
            }
            if (i9 != 0 && i == -5) {
                i = 0;
            }
            c16601.f66997 = i10 - i9;
            c16601.f66996 += (long) i9;
            if (z && i9 > 0) {
                c16601.f66990.update(this.f63736, 0, i9);
            }
            System.arraycopy(this.f63736, 0, c16601.f67000, i8, i9);
            i8 += i9;
        }
        c16601.f66993 = i8;
        this.f63732 = i9;
        return i;
    }
}
