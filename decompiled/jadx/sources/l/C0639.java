package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֡᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBK5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0639 implements Cloneable, Serializable {
    public static final long serialVersionUID = 1330973210523860834L;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f2440 = {4, 5, 4, 5, 2, 3, 6, 7};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public double f2441;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f2442;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient int f2443;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f2444;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double f2445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double f2446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f2447;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f2448;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2607(C8401 c8401, C8401 c8402) {
        double d = c8401.f25752;
        double d2 = c8401.f25753;
        switch (this.f2444) {
            case 0:
            case 1:
                c8402.mo22010(d, d2);
                return;
            case 2:
            case 3:
                c8402.mo22010(d * this.f2447, d2 * this.f2441);
                return;
            case 4:
            case 5:
                c8402.mo22010(d2 * this.f2448, d * this.f2442);
                return;
            case 6:
            case 7:
                c8402.mo22010((this.f2448 * d2) + (this.f2447 * d), (d2 * this.f2441) + (d * this.f2442));
                return;
            default:
                m2600();
                throw null;
        }
    }

    public C0639() {
        this.f2441 = 1.0d;
        this.f2447 = 1.0d;
    }

    public C0639(float f, float f2) {
        double d = 1.0f;
        this.f2447 = d;
        double d2 = 0.0f;
        this.f2442 = d2;
        this.f2448 = d2;
        this.f2441 = d;
        this.f2446 = f;
        this.f2445 = f2;
        m2613();
    }

    public C0639(double d, double d2) {
        this.f2447 = d;
        this.f2442 = 0.0d;
        this.f2448 = 0.0d;
        this.f2441 = d2;
        this.f2446 = 0.0d;
        this.f2445 = 0.0d;
        m2613();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd A[PHI: r1
      0x00dd: PHI (r1v7 int) = (r1v4 int), (r1v10 int) binds: [B:82:0x00db, B:54:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4 A[PHI: r1
      0x00e4: PHI (r1v9 int) = (r1v4 int), (r1v10 int) binds: [B:85:0x00e2, B:59:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7 A[PHI: r1
      0x00e7: PHI (r1v8 int) = (r1v4 int), (r1v10 int), (r1v10 int) binds: [B:85:0x00e2, B:57:0x00a4, B:59:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fe  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m2614() {
        int i;
        double d;
        int i2;
        double d2;
        double d3;
        int i3;
        double d4;
        int i4;
        double d5;
        double d6;
        double d7;
        double d8;
        int i5;
        if (this.f2443 == -1) {
            m2613();
            int i6 = 1;
            switch (this.f2444) {
                case 0:
                    i6 = 0;
                case 1:
                    this.f2443 = i6;
                    break;
                case 2:
                    i = 0;
                    d = this.f2447;
                    if (d >= 0.0d) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    d2 = this.f2441;
                    if (i2 == (d2 < 0.0d ? 0 : 1)) {
                        if (i2 != 0) {
                            if (d == d2) {
                                i6 = i | 2;
                            } else {
                                i6 = i | 4;
                            }
                        } else if (d != d2) {
                            i6 = i | 12;
                        } else if (d != -1.0d) {
                            i6 = i | 10;
                        } else {
                            i6 = i | 8;
                        }
                    } else if (d == (-d2)) {
                        i6 = i | 68;
                    } else if (d != 1.0d || d == -1.0d) {
                        i6 = i | 64;
                    } else {
                        i6 = i | 66;
                    }
                    this.f2443 = i6;
                    break;
                case 3:
                    i = 1;
                    d = this.f2447;
                    if (d >= 0.0d) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    d2 = this.f2441;
                    if (i2 == (d2 < 0.0d ? 0 : 1)) {
                        if (i2 != 0) {
                            if (d == d2) {
                                i6 = i | 2;
                            } else {
                                i6 = i | 4;
                            }
                        } else if (d != d2) {
                            i6 = i | 12;
                        } else if (d != -1.0d) {
                            i6 = i | 10;
                        } else {
                            i6 = i | 8;
                        }
                    } else if (d == (-d2)) {
                        i6 = i | 68;
                    } else if (d != 1.0d) {
                        i6 = i | 64;
                    } else {
                        i6 = i | 64;
                    }
                    this.f2443 = i6;
                    break;
                case 4:
                    i = 0;
                    d3 = this.f2448;
                    if (d3 >= 0.0d) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    d4 = this.f2442;
                    if (i3 != (d4 < 0.0d ? 0 : 1)) {
                        if (d3 != (-d4)) {
                            i6 = i | 12;
                        } else if (d3 != 1.0d || d3 == -1.0d) {
                            i6 = i | 8;
                        } else {
                            i6 = i | 10;
                        }
                    } else if (d3 == d4) {
                        i6 = i | 74;
                    } else {
                        i6 = i | 76;
                    }
                    this.f2443 = i6;
                    break;
                case 5:
                    i = 1;
                    d3 = this.f2448;
                    if (d3 >= 0.0d) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    d4 = this.f2442;
                    if (i3 != (d4 < 0.0d ? 0 : 1)) {
                        if (d3 != (-d4)) {
                            i6 = i | 12;
                        } else {
                            if (d3 != 1.0d) {
                            }
                            i6 = i | 8;
                        }
                        break;
                    } else if (d3 == d4) {
                        i6 = i | 74;
                    } else {
                        i6 = i | 76;
                    }
                    this.f2443 = i6;
                    break;
                case 6:
                    i4 = 0;
                    d5 = this.f2447;
                    d6 = this.f2448;
                    d7 = this.f2442;
                    d8 = this.f2441;
                    if ((d7 * d8) + (d5 * d6) != 0.0d) {
                        this.f2443 = 32;
                    } else {
                        if (d5 >= 0.0d) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        if (i5 == (d8 < 0.0d ? 0 : 1)) {
                            if (d5 == d8 || d6 != (-d7)) {
                                i6 = i4 | 20;
                            } else {
                                i6 = (d5 * d8) - (d6 * d7) != 1.0d ? i4 | 18 : i4 | 16;
                            }
                        } else if (d5 == (-d8) || d6 != d7) {
                            i6 = i4 | 84;
                        } else {
                            i6 = (d5 * d8) - (d6 * d7) != 1.0d ? i4 | 82 : i4 | 80;
                        }
                        this.f2443 = i6;
                    }
                    break;
                case 7:
                    i4 = 1;
                    d5 = this.f2447;
                    d6 = this.f2448;
                    d7 = this.f2442;
                    d8 = this.f2441;
                    if ((d7 * d8) + (d5 * d6) != 0.0d) {
                        this.f2443 = 32;
                    } else {
                        if (d5 >= 0.0d) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        if (i5 == (d8 < 0.0d ? 0 : 1)) {
                            if (d5 == d8) {
                                i6 = i4 | 20;
                            } else {
                                i6 = i4 | 20;
                            }
                        } else if (d5 == (-d8)) {
                            i6 = i4 | 84;
                        } else {
                            i6 = i4 | 84;
                        }
                        this.f2443 = i6;
                    }
                    break;
                default:
                    m2600();
                    throw null;
            }
        }
        return this.f2443;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m2601() {
        switch (this.f2444) {
            case 0:
            case 1:
                return 1.0d;
            case 2:
            case 3:
                return this.f2447 * this.f2441;
            case 4:
            case 5:
                return -(this.f2448 * this.f2442);
            case 6:
            case 7:
                return (this.f2447 * this.f2441) - (this.f2448 * this.f2442);
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m2613() {
        if (this.f2448 == 0.0d && this.f2442 == 0.0d) {
            if (this.f2447 == 1.0d && this.f2441 == 1.0d) {
                if (this.f2446 == 0.0d && this.f2445 == 0.0d) {
                    this.f2444 = 0;
                    this.f2443 = 0;
                    return;
                } else {
                    this.f2444 = 1;
                    this.f2443 = 1;
                    return;
                }
            }
            if (this.f2446 == 0.0d && this.f2445 == 0.0d) {
                this.f2444 = 2;
                this.f2443 = -1;
                return;
            } else {
                this.f2444 = 3;
                this.f2443 = -1;
                return;
            }
        }
        if (this.f2447 == 0.0d && this.f2441 == 0.0d) {
            if (this.f2446 == 0.0d && this.f2445 == 0.0d) {
                this.f2444 = 4;
                this.f2443 = -1;
                return;
            } else {
                this.f2444 = 5;
                this.f2443 = -1;
                return;
            }
        }
        if (this.f2446 == 0.0d && this.f2445 == 0.0d) {
            this.f2444 = 6;
            this.f2443 = -1;
        } else {
            this.f2444 = 7;
            this.f2443 = -1;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m2600() {
        throw new InternalError("missing case in transform state switch");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2615(double d, double d2) {
        switch (this.f2444) {
            case 0:
                this.f2446 = d;
                this.f2445 = d2;
                if (d == 0.0d && d2 == 0.0d) {
                    return;
                }
                this.f2444 = 1;
                this.f2443 = 1;
                return;
            case 1:
                double d3 = d + this.f2446;
                this.f2446 = d3;
                double d4 = d2 + this.f2445;
                this.f2445 = d4;
                if (d3 == 0.0d && d4 == 0.0d) {
                    this.f2444 = 0;
                    this.f2443 = 0;
                    return;
                }
                return;
            case 2:
                double d5 = d * this.f2447;
                this.f2446 = d5;
                double d6 = d2 * this.f2441;
                this.f2445 = d6;
                if (d5 == 0.0d && d6 == 0.0d) {
                    return;
                }
                this.f2444 = 3;
                this.f2443 |= 1;
                return;
            case 3:
                double d7 = (d * this.f2447) + this.f2446;
                this.f2446 = d7;
                double d8 = (d2 * this.f2441) + this.f2445;
                this.f2445 = d8;
                if (d7 == 0.0d && d8 == 0.0d) {
                    this.f2444 = 2;
                    int i = this.f2443;
                    if (i != -1) {
                        this.f2443 = i - 1;
                        return;
                    }
                    return;
                }
                return;
            case 4:
                double d9 = d2 * this.f2448;
                this.f2446 = d9;
                double d10 = d * this.f2442;
                this.f2445 = d10;
                if (d9 == 0.0d && d10 == 0.0d) {
                    return;
                }
                this.f2444 = 5;
                this.f2443 |= 1;
                return;
            case 5:
                double d11 = (d2 * this.f2448) + this.f2446;
                this.f2446 = d11;
                double d12 = (d * this.f2442) + this.f2445;
                this.f2445 = d12;
                if (d11 == 0.0d && d12 == 0.0d) {
                    this.f2444 = 4;
                    int i2 = this.f2443;
                    if (i2 != -1) {
                        this.f2443 = i2 - 1;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                double d13 = (this.f2448 * d2) + (this.f2447 * d);
                this.f2446 = d13;
                double d14 = (d2 * this.f2441) + (d * this.f2442);
                this.f2445 = d14;
                if (d13 == 0.0d && d14 == 0.0d) {
                    return;
                }
                this.f2444 = 7;
                this.f2443 |= 1;
                return;
            case 7:
                double d15 = (this.f2448 * d2) + (this.f2447 * d) + this.f2446;
                this.f2446 = d15;
                double d16 = (d2 * this.f2441) + (d * this.f2442) + this.f2445;
                this.f2445 = d16;
                if (d15 == 0.0d && d16 == 0.0d) {
                    this.f2444 = 6;
                    int i3 = this.f2443;
                    if (i3 != -1) {
                        this.f2443 = i3 - 1;
                        return;
                    }
                    return;
                }
                return;
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2604(double d, double d2, double d3) {
        m2615(d2, d3);
        double dSin = Math.sin(d);
        int[] iArr = f2440;
        if (dSin == 1.0d) {
            double d4 = this.f2447;
            double d5 = this.f2448;
            this.f2447 = d5;
            this.f2448 = -d4;
            double d6 = this.f2442;
            this.f2442 = this.f2441;
            double d7 = -d6;
            this.f2441 = d7;
            int i = iArr[this.f2444];
            if ((i & 6) == 2 && d5 == 1.0d && d7 == 1.0d) {
                i -= 2;
            }
            this.f2444 = i;
            this.f2443 = -1;
        } else if (dSin == -1.0d) {
            double d8 = this.f2447;
            double d9 = -this.f2448;
            this.f2447 = d9;
            this.f2448 = d8;
            double d10 = this.f2442;
            this.f2442 = -this.f2441;
            this.f2441 = d10;
            int i2 = iArr[this.f2444];
            if ((i2 & 6) == 2 && d9 == 1.0d && d10 == 1.0d) {
                i2 -= 2;
            }
            this.f2444 = i2;
            this.f2443 = -1;
        } else {
            double dCos = Math.cos(d);
            if (dCos == -1.0d) {
                double d11 = -this.f2447;
                this.f2447 = d11;
                double d12 = -this.f2441;
                this.f2441 = d12;
                int i3 = this.f2444;
                if ((i3 & 4) != 0) {
                    this.f2448 = -this.f2448;
                    this.f2442 = -this.f2442;
                } else if (d11 == 1.0d && d12 == 1.0d) {
                    this.f2444 = i3 & (-3);
                } else {
                    this.f2444 = i3 | 2;
                }
                this.f2443 = -1;
            } else if (dCos != 1.0d) {
                double d13 = this.f2447;
                double d14 = this.f2448;
                this.f2447 = (dSin * d14) + (dCos * d13);
                double d15 = -dSin;
                this.f2448 = (d14 * dCos) + (d13 * d15);
                double d16 = this.f2442;
                double d17 = this.f2441;
                this.f2442 = (dSin * d17) + (dCos * d16);
                this.f2441 = (dCos * d17) + (d15 * d16);
                m2613();
            }
        }
        m2615(-d2, -d3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2603(double d, double d2) {
        int i = this.f2444;
        switch (i) {
            case 0:
            case 1:
                this.f2447 = d;
                this.f2441 = d2;
                if (d == 1.0d && d2 == 1.0d) {
                    return;
                }
                this.f2444 = i | 2;
                this.f2443 = -1;
                return;
            case 2:
            case 3:
                double d3 = this.f2447 * d;
                this.f2447 = d3;
                double d4 = this.f2441 * d2;
                this.f2441 = d4;
                if (d3 == 1.0d && d4 == 1.0d) {
                    int i2 = i & 1;
                    this.f2444 = i2;
                    this.f2443 = i2 != 0 ? 1 : 0;
                    return;
                }
                this.f2443 = -1;
                return;
            case 4:
            case 5:
                break;
            case 6:
            case 7:
                this.f2447 *= d;
                this.f2441 *= d2;
                break;
            default:
                m2600();
                throw null;
        }
        double d5 = this.f2448 * d2;
        this.f2448 = d5;
        double d6 = this.f2442 * d;
        this.f2442 = d6;
        if (d5 == 0.0d && d6 == 0.0d) {
            int i3 = i & 1;
            if (this.f2447 == 1.0d && this.f2441 == 1.0d) {
                this.f2443 = i3 != 0 ? 1 : 0;
            } else {
                i3 |= 2;
                this.f2443 = -1;
            }
            this.f2444 = i3;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2610(double d, double d2) {
        int i = this.f2444;
        switch (i) {
            case 0:
            case 1:
                this.f2448 = d;
                this.f2442 = d2;
                if (d == 0.0d && d2 == 0.0d) {
                    return;
                }
                this.f2444 = i | 6;
                this.f2443 = -1;
                return;
            case 2:
            case 3:
                double d3 = this.f2447 * d;
                this.f2448 = d3;
                double d4 = this.f2441 * d2;
                this.f2442 = d4;
                if (d3 != 0.0d || d4 != 0.0d) {
                    this.f2444 = i | 4;
                }
                this.f2443 = -1;
                return;
            case 4:
            case 5:
                double d5 = this.f2448 * d2;
                this.f2447 = d5;
                double d6 = this.f2442 * d;
                this.f2441 = d6;
                if (d5 != 0.0d || d6 != 0.0d) {
                    this.f2444 = i | 2;
                }
                this.f2443 = -1;
                return;
            case 6:
            case 7:
                double d7 = this.f2447;
                double d8 = this.f2448;
                this.f2447 = (d8 * d2) + d7;
                this.f2448 = (d7 * d) + d8;
                double d9 = this.f2442;
                double d10 = this.f2441;
                this.f2442 = (d2 * d10) + d9;
                this.f2441 = (d9 * d) + d10;
                m2613();
                return;
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2616(C0639 c0639) {
        this.f2447 = c0639.f2447;
        this.f2442 = c0639.f2442;
        this.f2448 = c0639.f2448;
        this.f2441 = c0639.f2441;
        this.f2446 = c0639.f2446;
        this.f2445 = c0639.f2445;
        this.f2444 = c0639.f2444;
        this.f2443 = c0639.f2443;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2605(double d, double d2, double d3, double d4, double d5, double d6) {
        this.f2447 = d;
        this.f2442 = d2;
        this.f2448 = d3;
        this.f2441 = d4;
        this.f2446 = d5;
        this.f2445 = d6;
        m2613();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2606(C0639 c0639) {
        int i = this.f2444;
        int i2 = c0639.f2444;
        int i3 = (i2 << 3) | i;
        if (i3 != 48) {
            if (i3 == 56) {
                this.f2448 = c0639.f2448;
                this.f2442 = c0639.f2442;
            } else {
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return;
                    case 8:
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        m2615(c0639.f2446, c0639.f2445);
                        return;
                    case 16:
                        break;
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        m2603(c0639.f2447, c0639.f2441);
                        return;
                    case 24:
                        break;
                    default:
                        switch (i3) {
                            case 32:
                                break;
                            case 33:
                                this.f2447 = 0.0d;
                                this.f2448 = c0639.f2448;
                                this.f2442 = c0639.f2442;
                                this.f2441 = 0.0d;
                                this.f2444 = 5;
                                this.f2443 = -1;
                                return;
                            case 34:
                            case 35:
                                this.f2448 = this.f2447 * c0639.f2448;
                                this.f2447 = 0.0d;
                                this.f2442 = this.f2441 * c0639.f2442;
                                this.f2441 = 0.0d;
                                this.f2444 = i ^ 6;
                                this.f2443 = -1;
                                return;
                            case 36:
                            case 37:
                                this.f2447 = this.f2448 * c0639.f2442;
                                this.f2448 = 0.0d;
                                this.f2441 = this.f2442 * c0639.f2448;
                                this.f2442 = 0.0d;
                                this.f2444 = i ^ 6;
                                this.f2443 = -1;
                                return;
                            case 38:
                            case 39:
                                double d = c0639.f2448;
                                double d2 = c0639.f2442;
                                double d3 = this.f2447;
                                this.f2447 = this.f2448 * d2;
                                this.f2448 = d3 * d;
                                double d4 = this.f2442;
                                this.f2442 = this.f2441 * d2;
                                this.f2441 = d4 * d;
                                this.f2443 = -1;
                                return;
                            case 40:
                                this.f2446 = c0639.f2446;
                                this.f2445 = c0639.f2445;
                                break;
                            default:
                                double d5 = c0639.f2447;
                                double d6 = c0639.f2448;
                                double d7 = c0639.f2446;
                                double d8 = c0639.f2442;
                                double d9 = c0639.f2441;
                                double d10 = c0639.f2445;
                                switch (i) {
                                    case 1:
                                        this.f2447 = d5;
                                        this.f2448 = d6;
                                        this.f2446 += d7;
                                        this.f2442 = d8;
                                        this.f2441 = d9;
                                        this.f2445 += d10;
                                        this.f2444 = i2 | 1;
                                        this.f2443 = -1;
                                        return;
                                    case 2:
                                    case 3:
                                        double d11 = this.f2447;
                                        this.f2447 = d5 * d11;
                                        this.f2448 = d6 * d11;
                                        this.f2446 = (d7 * d11) + this.f2446;
                                        double d12 = this.f2441;
                                        this.f2442 = d8 * d12;
                                        this.f2441 = d9 * d12;
                                        this.f2445 = (d10 * d12) + this.f2445;
                                        m2613();
                                        return;
                                    case 4:
                                    case 5:
                                        double d13 = this.f2448;
                                        this.f2447 = d8 * d13;
                                        this.f2448 = d9 * d13;
                                        this.f2446 = (d10 * d13) + this.f2446;
                                        double d14 = this.f2442;
                                        this.f2442 = d5 * d14;
                                        this.f2441 = d6 * d14;
                                        this.f2445 = (d7 * d14) + this.f2445;
                                        m2613();
                                        return;
                                    case 6:
                                        this.f2444 = i | i2;
                                    case 7:
                                        double d15 = this.f2447;
                                        double d16 = this.f2448;
                                        this.f2447 = (d8 * d16) + (d5 * d15);
                                        this.f2448 = (d9 * d16) + (d6 * d15);
                                        this.f2446 = (d16 * d10) + (d15 * d7) + this.f2446;
                                        double d17 = this.f2442;
                                        double d18 = this.f2441;
                                        this.f2442 = (d8 * d18) + (d5 * d17);
                                        this.f2441 = (d9 * d18) + (d6 * d17);
                                        this.f2445 = (d10 * d18) + (d7 * d17) + this.f2445;
                                        this.f2443 = -1;
                                        return;
                                    default:
                                        m2600();
                                        throw null;
                                }
                                break;
                        }
                        this.f2448 = c0639.f2448;
                        this.f2442 = c0639.f2442;
                        this.f2441 = 0.0d;
                        this.f2447 = 0.0d;
                        this.f2444 = i2;
                        this.f2443 = c0639.f2443;
                        return;
                }
                this.f2446 = c0639.f2446;
                this.f2445 = c0639.f2445;
                this.f2444 = i2;
                this.f2443 = c0639.f2443;
                return;
            }
            this.f2447 = c0639.f2447;
            this.f2441 = c0639.f2441;
            this.f2446 = c0639.f2446;
            this.f2445 = c0639.f2445;
            this.f2444 = i2;
            this.f2443 = c0639.f2443;
            return;
        }
        this.f2448 = c0639.f2448;
        this.f2442 = c0639.f2442;
        this.f2447 = c0639.f2447;
        this.f2441 = c0639.f2441;
        this.f2444 = i2;
        this.f2443 = c0639.f2443;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2611(C0639 c0639) {
        int i = this.f2444;
        int i2 = c0639.f2444;
        int i3 = (i2 << 3) | i;
        switch (i3) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            case 8:
            case 10:
            case 12:
            case 14:
                this.f2446 = c0639.f2446;
                this.f2445 = c0639.f2445;
                this.f2444 = i | 1;
                this.f2443 |= 1;
                return;
            case 9:
            case 11:
            case 13:
            case 15:
                this.f2446 += c0639.f2446;
                this.f2445 += c0639.f2445;
                return;
            case 16:
            case 17:
                this.f2444 = i | 2;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                switch (i3) {
                    case 36:
                    case 37:
                        i |= 2;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        this.f2444 = i ^ 4;
                    case 38:
                    case 39:
                        double d = c0639.f2448;
                        double d2 = c0639.f2442;
                        double d3 = this.f2447;
                        this.f2447 = this.f2442 * d;
                        this.f2442 = d3 * d2;
                        double d4 = this.f2448;
                        this.f2448 = this.f2441 * d;
                        this.f2441 = d4 * d2;
                        double d5 = this.f2446;
                        this.f2446 = this.f2445 * d;
                        this.f2445 = d5 * d2;
                        this.f2443 = -1;
                        return;
                    default:
                        double d6 = c0639.f2447;
                        double d7 = c0639.f2448;
                        double d8 = c0639.f2446;
                        double d9 = c0639.f2442;
                        double d10 = c0639.f2441;
                        double d11 = c0639.f2445;
                        switch (i) {
                            case 0:
                                this.f2446 = d8;
                                this.f2445 = d11;
                                this.f2447 = d6;
                                this.f2442 = d9;
                                this.f2448 = d7;
                                this.f2441 = d10;
                                this.f2444 = i | i2;
                                this.f2443 = -1;
                                return;
                            case 1:
                                double d12 = this.f2446;
                                double d13 = this.f2445;
                                d8 = (d13 * d7) + (d12 * d6) + d8;
                                d11 = (d13 * d10) + (d12 * d9) + d11;
                                this.f2446 = d8;
                                this.f2445 = d11;
                                this.f2447 = d6;
                                this.f2442 = d9;
                                this.f2448 = d7;
                                this.f2441 = d10;
                                this.f2444 = i | i2;
                                this.f2443 = -1;
                                return;
                            case 2:
                                this.f2446 = d8;
                                this.f2445 = d11;
                                double d14 = this.f2447;
                                this.f2447 = d6 * d14;
                                this.f2442 = d14 * d9;
                                double d15 = this.f2441;
                                this.f2448 = d7 * d15;
                                this.f2441 = d15 * d10;
                                m2613();
                                return;
                            case 3:
                                double d16 = this.f2446;
                                double d17 = this.f2445;
                                d8 = (d17 * d7) + (d16 * d6) + d8;
                                d11 += (d17 * d10) + (d16 * d9);
                                this.f2446 = d8;
                                this.f2445 = d11;
                                double d18 = this.f2447;
                                this.f2447 = d6 * d18;
                                this.f2442 = d18 * d9;
                                double d19 = this.f2441;
                                this.f2448 = d7 * d19;
                                this.f2441 = d19 * d10;
                                m2613();
                                return;
                            case 4:
                                this.f2446 = d8;
                                this.f2445 = d11;
                                double d20 = this.f2442;
                                this.f2447 = d7 * d20;
                                this.f2442 = d20 * d10;
                                double d21 = this.f2448;
                                this.f2448 = d6 * d21;
                                this.f2441 = d21 * d9;
                                m2613();
                                return;
                            case 5:
                                double d22 = this.f2446;
                                double d23 = this.f2445;
                                d8 = (d23 * d7) + (d22 * d6) + d8;
                                d11 += (d23 * d10) + (d22 * d9);
                                this.f2446 = d8;
                                this.f2445 = d11;
                                double d24 = this.f2442;
                                this.f2447 = d7 * d24;
                                this.f2442 = d24 * d10;
                                double d25 = this.f2448;
                                this.f2448 = d6 * d25;
                                this.f2441 = d25 * d9;
                                m2613();
                                return;
                            case 6:
                                this.f2446 = d8;
                                this.f2445 = d11;
                                double d26 = this.f2447;
                                double d27 = this.f2442;
                                this.f2447 = (d27 * d7) + (d26 * d6);
                                this.f2442 = (d27 * d10) + (d26 * d9);
                                double d28 = this.f2448;
                                double d29 = this.f2441;
                                this.f2448 = (d7 * d29) + (d6 * d28);
                                this.f2441 = (d29 * d10) + (d28 * d9);
                                m2613();
                                return;
                            case 7:
                                double d30 = this.f2446;
                                double d31 = this.f2445;
                                d8 = (d31 * d7) + (d30 * d6) + d8;
                                d11 += (d31 * d10) + (d30 * d9);
                                this.f2446 = d8;
                                this.f2445 = d11;
                                double d210 = this.f2447;
                                double d211 = this.f2442;
                                this.f2447 = (d211 * d7) + (d210 * d6);
                                this.f2442 = (d211 * d10) + (d210 * d9);
                                double d212 = this.f2448;
                                double d213 = this.f2441;
                                this.f2448 = (d7 * d213) + (d6 * d212);
                                this.f2441 = (d213 * d10) + (d212 * d9);
                                m2613();
                                return;
                            default:
                                m2600();
                                throw null;
                        }
                }
                break;
        }
        double d32 = c0639.f2447;
        double d33 = c0639.f2441;
        if ((i & 4) != 0) {
            this.f2448 *= d32;
            this.f2442 *= d33;
            if ((i & 2) != 0) {
                this.f2447 *= d32;
                this.f2441 *= d33;
            }
        } else {
            this.f2447 *= d32;
            this.f2441 *= d33;
        }
        if ((i & 1) != 0) {
            this.f2446 *= d32;
            this.f2445 *= d33;
        }
        this.f2443 = -1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2618() throws C1345 {
        switch (this.f2444) {
            case 0:
                return;
            case 1:
                this.f2446 = -this.f2446;
                this.f2445 = -this.f2445;
                return;
            case 2:
                double d = this.f2447;
                double d2 = this.f2441;
                if (d == 0.0d || d2 == 0.0d) {
                    throw new C1345("Determinant is 0");
                }
                this.f2447 = 1.0d / d;
                this.f2441 = 1.0d / d2;
                return;
            case 3:
                double d3 = this.f2447;
                double d4 = this.f2446;
                double d5 = this.f2441;
                double d6 = this.f2445;
                if (d3 == 0.0d || d5 == 0.0d) {
                    throw new C1345("Determinant is 0");
                }
                this.f2447 = 1.0d / d3;
                this.f2441 = 1.0d / d5;
                this.f2446 = (-d4) / d3;
                this.f2445 = (-d6) / d5;
                return;
            case 4:
                double d7 = this.f2448;
                double d8 = this.f2442;
                if (d7 == 0.0d || d8 == 0.0d) {
                    throw new C1345("Determinant is 0");
                }
                this.f2442 = 1.0d / d7;
                this.f2448 = 1.0d / d8;
                return;
            case 5:
                double d9 = this.f2448;
                double d10 = this.f2446;
                double d11 = this.f2442;
                double d12 = this.f2445;
                if (d9 == 0.0d || d11 == 0.0d) {
                    throw new C1345("Determinant is 0");
                }
                this.f2442 = 1.0d / d9;
                this.f2448 = 1.0d / d11;
                this.f2446 = (-d12) / d11;
                this.f2445 = (-d10) / d9;
                return;
            case 6:
                double d13 = this.f2447;
                double d14 = this.f2448;
                double d15 = this.f2442;
                double d16 = this.f2441;
                double d17 = (d13 * d16) - (d14 * d15);
                if (Math.abs(d17) <= Double.MIN_VALUE) {
                    throw new C1345("Determinant is " + d17);
                }
                this.f2447 = d16 / d17;
                this.f2442 = (-d15) / d17;
                this.f2448 = (-d14) / d17;
                this.f2441 = d13 / d17;
                return;
            case 7:
                double d18 = this.f2447;
                double d19 = this.f2448;
                double d20 = this.f2446;
                double d21 = this.f2442;
                double d22 = this.f2441;
                double d23 = this.f2445;
                double d24 = (d18 * d22) - (d19 * d21);
                if (Math.abs(d24) <= Double.MIN_VALUE) {
                    throw new C1345("Determinant is " + d24);
                }
                this.f2447 = d22 / d24;
                this.f2442 = (-d21) / d24;
                this.f2448 = (-d19) / d24;
                this.f2441 = d18 / d24;
                this.f2446 = ((d19 * d23) - (d22 * d20)) / d24;
                this.f2445 = ((d21 * d20) - (d18 * d23)) / d24;
                return;
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21807 m2602(C8401 c8401) {
        C8401 c8402 = new C8401();
        double d = c8401.f25752;
        double d2 = c8401.f25753;
        switch (this.f2444) {
            case 0:
                c8402.mo22010(d, d2);
                return c8402;
            case 1:
                c8402.mo22010(d + this.f2446, d2 + this.f2445);
                return c8402;
            case 2:
                c8402.mo22010(d * this.f2447, d2 * this.f2441);
                return c8402;
            case 3:
                c8402.mo22010((d * this.f2447) + this.f2446, (d2 * this.f2441) + this.f2445);
                return c8402;
            case 4:
                c8402.mo22010(d2 * this.f2448, d * this.f2442);
                return c8402;
            case 5:
                c8402.mo22010((d2 * this.f2448) + this.f2446, (d * this.f2442) + this.f2445);
                return c8402;
            case 6:
                c8402.mo22010((this.f2448 * d2) + (this.f2447 * d), (d2 * this.f2441) + (d * this.f2442));
                return c8402;
            case 7:
                c8402.mo22010((this.f2448 * d2) + (this.f2447 * d) + this.f2446, (d2 * this.f2441) + (d * this.f2442) + this.f2445);
                return c8402;
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2609(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        float[] fArr3 = fArr;
        int i4 = i;
        int i5 = i2;
        if (fArr2 == fArr3 && i5 > i4) {
            int i6 = i3 * 2;
            if (i5 < i4 + i6) {
                System.arraycopy(fArr3, i4, fArr2, i5, i6);
                i4 = i5;
            }
        }
        switch (this.f2444) {
            case 0:
                if (fArr3 == fArr2 && i4 == i5) {
                    return;
                }
                System.arraycopy(fArr3, i4, fArr2, i5, i3 * 2);
                return;
            case 1:
                double d = this.f2446;
                double d2 = this.f2445;
                int i7 = i3;
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        return;
                    }
                    int i8 = i5 + 1;
                    int i9 = i4 + 1;
                    fArr2[i5] = (float) (((double) fArr3[i4]) + d);
                    i5 += 2;
                    i4 += 2;
                    fArr2[i8] = (float) (((double) fArr3[i9]) + d2);
                }
                break;
            case 2:
                double d3 = this.f2447;
                double d4 = this.f2441;
                int i10 = i3;
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        return;
                    }
                    int i11 = i5 + 1;
                    int i12 = i4 + 1;
                    fArr2[i5] = (float) (((double) fArr3[i4]) * d3);
                    i5 += 2;
                    i4 += 2;
                    fArr2[i11] = (float) (((double) fArr3[i12]) * d4);
                }
                break;
            case 3:
                double d5 = this.f2447;
                double d6 = this.f2446;
                double d7 = this.f2441;
                double d8 = this.f2445;
                int i13 = i3;
                while (true) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        int i15 = i5 + 1;
                        int i16 = i4 + 1;
                        fArr2[i5] = (float) ((((double) fArr3[i4]) * d5) + d6);
                        i5 += 2;
                        i4 += 2;
                        fArr2[i15] = (float) ((((double) fArr3[i16]) * d7) + d8);
                        i13 = i14;
                    }
                    break;
                }
                break;
            case 4:
                double d9 = this.f2448;
                double d10 = this.f2442;
                int i17 = i3;
                while (true) {
                    i17--;
                    if (i17 < 0) {
                        return;
                    }
                    int i18 = i4 + 1;
                    double d11 = fArr[i4];
                    int i19 = i5 + 1;
                    i4 += 2;
                    fArr2[i5] = (float) (((double) fArr[i18]) * d9);
                    i5 += 2;
                    fArr2[i19] = (float) (d11 * d10);
                }
                break;
            case 5:
                double d12 = this.f2448;
                double d13 = this.f2446;
                double d14 = this.f2442;
                double d15 = this.f2445;
                int i20 = i3;
                while (true) {
                    int i21 = i20 - 1;
                    if (i21 >= 0) {
                        int i22 = i4 + 1;
                        double d16 = fArr[i4];
                        int i23 = i5 + 1;
                        i4 += 2;
                        fArr2[i5] = (float) ((((double) fArr[i22]) * d12) + d13);
                        i5 += 2;
                        fArr2[i23] = (float) ((d16 * d14) + d15);
                        i20 = i21;
                    }
                    break;
                }
                break;
            case 6:
                double d17 = this.f2447;
                double d18 = this.f2448;
                double d19 = this.f2442;
                double d20 = this.f2441;
                int i24 = i3;
                while (true) {
                    int i25 = i24 - 1;
                    if (i25 >= 0) {
                        int i26 = i4 + 1;
                        double d21 = fArr[i4];
                        i4 += 2;
                        double d22 = fArr[i26];
                        int i27 = i5 + 1;
                        fArr2[i5] = (float) ((d18 * d22) + (d17 * d21));
                        i5 += 2;
                        fArr2[i27] = (float) ((d22 * d20) + (d21 * d19));
                        i24 = i25;
                        d17 = d17;
                    }
                    break;
                }
                break;
            case 7:
                double d23 = this.f2447;
                double d24 = this.f2448;
                double d25 = this.f2446;
                double d26 = this.f2442;
                double d27 = this.f2441;
                double d28 = this.f2445;
                int i28 = i4;
                int i29 = i3;
                while (true) {
                    int i30 = i29 - 1;
                    if (i30 < 0) {
                        return;
                    }
                    int i31 = i28 + 1;
                    double d29 = d28;
                    double d30 = fArr3[i28];
                    i28 += 2;
                    double d31 = fArr3[i31];
                    int i32 = i5 + 1;
                    fArr2[i5] = (float) ((d24 * d31) + (d23 * d30) + d25);
                    i5 += 2;
                    fArr2[i32] = (float) ((d31 * d27) + (d30 * d26) + d29);
                    fArr3 = fArr;
                    i29 = i30;
                    d28 = d29;
                    d23 = d23;
                }
                break;
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2612(double[] dArr, double[] dArr2, int i) {
        switch (this.f2444) {
            case 0:
                if (dArr == dArr2) {
                    return;
                }
                System.arraycopy(dArr, 0, dArr2, 0, i * 2);
                return;
            case 1:
                double d = this.f2446;
                double d2 = this.f2445;
                int i2 = i;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        return;
                    }
                    int i5 = i3 + 1;
                    int i6 = i4 + 1;
                    dArr2[i3] = dArr[i4] + d;
                    i3 += 2;
                    i4 += 2;
                    dArr2[i5] = dArr[i6] + d2;
                }
                break;
            case 2:
                double d3 = this.f2447;
                double d4 = this.f2441;
                int i7 = i;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        return;
                    }
                    int i10 = i8 + 1;
                    int i11 = i9 + 1;
                    dArr2[i8] = dArr[i9] * d3;
                    i8 += 2;
                    i9 += 2;
                    dArr2[i10] = dArr[i11] * d4;
                }
                break;
            case 3:
                double d5 = this.f2447;
                double d6 = this.f2446;
                double d7 = this.f2441;
                double d8 = this.f2445;
                int i12 = i;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i12--;
                    if (i12 < 0) {
                        return;
                    }
                    int i15 = i13 + 1;
                    int i16 = i14 + 1;
                    dArr2[i13] = (dArr[i14] * d5) + d6;
                    i13 += 2;
                    i14 += 2;
                    dArr2[i15] = (dArr[i16] * d7) + d8;
                }
                break;
            case 4:
                double d9 = this.f2448;
                double d10 = this.f2442;
                int i17 = i;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    i17--;
                    if (i17 < 0) {
                        return;
                    }
                    int i20 = i18 + 1;
                    double d11 = dArr[i18];
                    int i21 = i19 + 1;
                    i18 += 2;
                    dArr2[i19] = dArr[i20] * d9;
                    i19 += 2;
                    dArr2[i21] = d11 * d10;
                }
                break;
            case 5:
                double d12 = this.f2448;
                double d13 = this.f2446;
                double d14 = this.f2442;
                double d15 = this.f2445;
                int i22 = i;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    i22--;
                    if (i22 < 0) {
                        return;
                    }
                    int i25 = i23 + 1;
                    double d16 = dArr[i23];
                    int i26 = i24 + 1;
                    i23 += 2;
                    dArr2[i24] = (dArr[i25] * d12) + d13;
                    i24 += 2;
                    dArr2[i26] = (d16 * d14) + d15;
                }
                break;
            case 6:
                double d17 = this.f2447;
                double d18 = this.f2448;
                double d19 = this.f2442;
                double d20 = this.f2441;
                int i27 = i;
                int i28 = 0;
                int i29 = 0;
                while (true) {
                    i27--;
                    if (i27 < 0) {
                        return;
                    }
                    int i30 = i28 + 1;
                    double d21 = dArr[i28];
                    i28 += 2;
                    double d22 = dArr[i30];
                    int i31 = i29 + 1;
                    dArr2[i29] = (d18 * d22) + (d17 * d21);
                    i29 += 2;
                    dArr2[i31] = (d22 * d20) + (d21 * d19);
                }
                break;
            case 7:
                double d23 = this.f2447;
                double d24 = this.f2448;
                double d25 = this.f2446;
                double d26 = this.f2442;
                double d27 = this.f2441;
                double d28 = this.f2445;
                int i32 = i;
                int i33 = 0;
                int i34 = 0;
                while (true) {
                    i32--;
                    if (i32 < 0) {
                        return;
                    }
                    int i35 = i33 + 1;
                    double d29 = dArr[i33];
                    i33 += 2;
                    double d30 = dArr[i35];
                    int i36 = i34 + 1;
                    dArr2[i34] = (d24 * d30) + (d23 * d29) + d25;
                    i34 += 2;
                    dArr2[i36] = (d30 * d27) + (d29 * d26) + d28;
                }
                break;
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2608(double[] dArr, double[] dArr2, int i) {
        switch (this.f2444) {
            case 0:
            case 1:
                if (dArr == dArr2) {
                    return;
                }
                System.arraycopy(dArr, 0, dArr2, 0, i * 2);
                return;
            case 2:
            case 3:
                double d = this.f2447;
                double d2 = this.f2441;
                int i2 = i;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        return;
                    }
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    dArr2[i4] = dArr[i3] * d;
                    i4 += 2;
                    i3 += 2;
                    dArr2[i5] = dArr[i6] * d2;
                }
                break;
            case 4:
            case 5:
                double d3 = this.f2448;
                double d4 = this.f2442;
                int i7 = i;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        return;
                    }
                    int i10 = i9 + 1;
                    double d5 = dArr[i9];
                    int i11 = i8 + 1;
                    i9 += 2;
                    dArr2[i8] = dArr[i10] * d3;
                    i8 += 2;
                    dArr2[i11] = d5 * d4;
                }
                break;
            case 6:
            case 7:
                double d6 = this.f2447;
                double d7 = this.f2448;
                double d8 = this.f2442;
                double d9 = this.f2441;
                int i12 = i;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i12--;
                    if (i12 < 0) {
                        return;
                    }
                    int i15 = i14 + 1;
                    double d10 = dArr[i14];
                    i14 += 2;
                    double d11 = dArr[i15];
                    int i16 = i13 + 1;
                    dArr2[i13] = (d11 * d7) + (d10 * d6);
                    i13 += 2;
                    dArr2[i16] = (d11 * d9) + (d10 * d8);
                }
                break;
            default:
                m2600();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m2599(double d) {
        return Math.rint(d * 1.0E15d) / 1.0E15d;
    }

    public final String toString() {
        return "AffineTransform[[" + m2599(this.f2447) + ", " + m2599(this.f2448) + ", " + m2599(this.f2446) + "], [" + m2599(this.f2442) + ", " + m2599(this.f2441) + ", " + m2599(this.f2445) + "]]";
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m2617() {
        return this.f2444 == 0 || m2614() == 0;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2445) + ((Double.doubleToLongBits(this.f2441) + ((Double.doubleToLongBits(this.f2442) + ((Double.doubleToLongBits(this.f2446) + ((Double.doubleToLongBits(this.f2448) + (Double.doubleToLongBits(this.f2447) * 31)) * 31)) * 31)) * 31)) * 31);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0639)) {
            return false;
        }
        C0639 c0639 = (C0639) obj;
        return this.f2447 == c0639.f2447 && this.f2448 == c0639.f2448 && this.f2446 == c0639.f2446 && this.f2442 == c0639.f2442 && this.f2441 == c0639.f2441 && this.f2445 == c0639.f2445;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        m2613();
    }
}
