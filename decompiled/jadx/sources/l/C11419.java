package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 770B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11419 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C10545[] f34127 = new C10545[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10545[] f34128;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23097 f34129;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f34130;

    public C11419(C23097 c23097, int i, C10545[] c10545Arr) {
        C11003.requireNonNull(c23097, "program");
        this.f34129 = c23097;
        C11003.requireNonNull(c10545Arr, "indexes");
        this.f34128 = c10545Arr;
        if (i < 0 || c10545Arr.length > 16) {
            throw new IllegalArgumentException("Invalid syntax window checkpoint cache");
        }
        long jM26485 = 0;
        long jM26510 = 0;
        for (C10545 c10545 : c10545Arr) {
            C11003.requireNonNull(c10545, "index");
            if (c10545.m26515() != c23097 || c10545.m26496() != i || c10545.m26520() == 0) {
                throw new IllegalArgumentException("Checkpoint cache index identity differs");
            }
            jM26485 += (long) c10545.m26485();
            jM26510 += (long) c10545.m26510();
            if (jM26485 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS || jM26510 > 262144) {
                throw new IllegalArgumentException("Checkpoint cache exceeds state budget");
            }
        }
        this.f34130 = i;
        if (c10545Arr.length != 0) {
            C10545 c10546 = c10545Arr[0];
        } else {
            C10545.m26476(c23097, i, false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11419 m28188(C23097 c23097, int i) {
        return new C11419(c23097, i, f34127);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10545 m28191(C23097 c23097, int i) {
        C11003.requireNonNull(c23097, "expectedProgram");
        C10545 c10545 = null;
        C23097 c23098 = this.f34129;
        if (c23098 != c23097) {
            return null;
        }
        C11003.checkFromToIndex(i, i, this.f34130);
        int i2 = -1;
        int i3 = -1;
        for (C10545 c10546 : this.f34128) {
            int iM26488 = c10546.m26488(c23098, i);
            if (iM26488 >= 0) {
                int iM26531 = c10546.m26531(iM26488);
                int iM26518 = c10546.m26518(iM26488);
                if (iM26531 > i2 || (iM26531 == i2 && iM26518 > i3)) {
                    c10545 = c10546;
                    i3 = iM26518;
                    i2 = iM26531;
                }
            }
        }
        return c10545;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11419 m28193(C10545 c10545) {
        C10545[] c10545Arr;
        long j;
        C10545 c10546 = c10545;
        C23097 c23097M26515 = c10545.m26515();
        C23097 c23097 = this.f34129;
        if (c23097M26515 == c23097) {
            int iM26496 = c10545.m26496();
            int i = this.f34130;
            if (iM26496 == i) {
                if (c10545.m26520() != 0) {
                    C10545[] c10545Arr2 = this.f34128;
                    int i2 = 0;
                    if (c10545Arr2.length <= 0 || c10545Arr2[0] != c10546) {
                        int i3 = 0;
                        while (true) {
                            int i4 = 1;
                            if (i3 < c10545Arr2.length) {
                                C10545 c10547 = c10545Arr2[i3];
                                if (c10547 == c10546 || (m28187(c10547, c10546) && m28187(c10546, c10547))) {
                                    break;
                                }
                                i3++;
                            } else {
                                for (int i5 = 0; i5 < c10545.m26520(); i5++) {
                                    if (c10546.m26521(i5).m45899() == EnumC21338.COMPLETE) {
                                        int iM26531 = c10546.m26531(i5);
                                        int iM26518 = c10546.m26518(i5);
                                        int length = c10545Arr2.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                int iM26485 = c10545.m26485();
                                                int iM26510 = c10545.m26510();
                                                if (iM26485 > 1024 || iM26510 > 262144) {
                                                    throw new IllegalArgumentException("Checkpoint cache update exceeds state budget");
                                                }
                                                int iMin = Math.min(16, c10545Arr2.length + 1);
                                                C10545[] c10545Arr3 = new C10545[iMin];
                                                long j2 = iM26485;
                                                long j3 = iM26510;
                                                c10545Arr3[0] = c10546;
                                                int length2 = c10545Arr2.length;
                                                while (i2 < length2) {
                                                    C10545 c10548 = c10545Arr2[i2];
                                                    if (m28187(c10546, c10548) || i4 == iMin) {
                                                        c10545Arr = c10545Arr2;
                                                        j = j2;
                                                    } else {
                                                        c10545Arr = c10545Arr2;
                                                        long jM26485 = ((long) c10548.m26485()) + j2;
                                                        j = j2;
                                                        long jM26510 = ((long) c10548.m26510()) + j3;
                                                        if (jM26485 <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && jM26510 <= 262144) {
                                                            c10545Arr3[i4] = c10548;
                                                            i4++;
                                                            j3 = jM26510;
                                                            j2 = jM26485;
                                                        }
                                                        i2++;
                                                        c10546 = c10545;
                                                        c10545Arr2 = c10545Arr;
                                                    }
                                                    j2 = j;
                                                    i2++;
                                                    c10546 = c10545;
                                                    c10545Arr2 = c10545Arr;
                                                }
                                                if (i4 != iMin) {
                                                    c10545Arr3 = (C10545[]) Arrays.copyOf(c10545Arr3, i4);
                                                }
                                                return new C11419(c23097, i, c10545Arr3);
                                            }
                                            C10545 c10549 = c10545Arr2[i6];
                                            int iM26488 = c10549.m26488(c10549.m26515(), iM26531);
                                            if (iM26488 >= 0 && c10549.m26531(iM26488) == iM26531 && c10549.m26518(iM26488) >= iM26518) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                            }
                        }
                        if (i3 != 0) {
                            C10545[] c10545Arr4 = (C10545[]) c10545Arr2.clone();
                            C10545 c105410 = c10545Arr4[i3];
                            System.arraycopy(c10545Arr4, 0, c10545Arr4, 1, i3);
                            c10545Arr4[0] = c105410;
                            return new C11419(c23097, i, c10545Arr4);
                        }
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Checkpoint cache update identity differs");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11419 m28192(C10545 c10545) {
        C11003.requireNonNull(c10545, "used");
        C23097 c23097M26515 = c10545.m26515();
        C23097 c23097 = this.f34129;
        if (c23097M26515 == c23097) {
            int iM26496 = c10545.m26496();
            int i = this.f34130;
            if (iM26496 == i) {
                int i2 = 0;
                while (true) {
                    C10545[] c10545Arr = this.f34128;
                    if (i2 < c10545Arr.length) {
                        if (c10545Arr[i2] == c10545) {
                            if (i2 == 0) {
                                return this;
                            }
                            C10545[] c10545Arr2 = (C10545[]) c10545Arr.clone();
                            C10545 c10546 = c10545Arr2[i2];
                            System.arraycopy(c10545Arr2, 0, c10545Arr2, 1, i2);
                            c10545Arr2[0] = c10546;
                            return new C11419(c23097, i, c10545Arr2);
                        }
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Touched checkpoint is not cached");
                    }
                }
            }
        }
        throw new IllegalArgumentException("Touched checkpoint identity differs");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28187(C10545 c10545, C10545 c10546) {
        for (int i = 0; i < c10546.m26520(); i++) {
            if (c10546.m26521(i).m45899() == EnumC21338.COMPLETE) {
                int iM26531 = c10546.m26531(i);
                int iM26518 = c10546.m26518(i);
                int iM26488 = c10545.m26488(c10545.m26515(), iM26531);
                if (iM26488 < 0 || c10545.m26531(iM26488) != iM26531 || c10545.m26518(iM26488) < iM26518) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10545 m28190(int i) {
        return this.f34128[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23097 m28194() {
        return this.f34129;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m28195() {
        return this.f34130;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28189() {
        return this.f34128.length;
    }
}
