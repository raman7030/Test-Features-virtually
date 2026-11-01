package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 770B */
/* JADX INFO: loaded from: classes3.dex */
public final class C13221 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C12391[] f37123 = new C12391[0];

    /* JADX INFO: renamed from: ֫ */
    public final C12391[] f37124;

    /* JADX INFO: renamed from: ۧ */
    public final C24320 f37125;

    /* JADX INFO: renamed from: ܽ */
    public final int f37126;

    public C13221(C24320 c24320, int i, C12391[] c12391Arr) {
        C12826.requireNonNull(c24320, "program");
        this.f37125 = c24320;
        C12826.requireNonNull(c12391Arr, "indexes");
        this.f37124 = c12391Arr;
        if (i < 0 || c12391Arr.length > 16) {
            throw new IllegalArgumentException("Invalid syntax window checkpoint cache");
        }
        long jM28518 = 0;
        long jM28543 = 0;
        for (C12391 c12391 : c12391Arr) {
            C12826.requireNonNull(c12391, "index");
            if (c12391.m28548() != c24320 || c12391.m28529() != i || c12391.m28553() == 0) {
                throw new IllegalArgumentException("Checkpoint cache index identity differs");
            }
            jM28518 += (long) c12391.m28518();
            jM28543 += (long) c12391.m28543();
            if (jM28518 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS || jM28543 > 262144) {
                throw new IllegalArgumentException("Checkpoint cache exceeds state budget");
            }
        }
        this.f37126 = i;
        if (c12391Arr.length != 0) {
            C12391 c12392 = c12391Arr[0];
        } else {
            C12391.m28509(c24320, i, false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13221 m30232(C24320 c24320, int i) {
        return new C13221(c24320, i, f37123);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12391 m30235(C24320 c24320, int i) {
        C12826.requireNonNull(c24320, "expectedProgram");
        C12391 c12391 = null;
        C24320 c24321 = this.f37125;
        if (c24321 != c24320) {
            return null;
        }
        C12826.checkFromToIndex(i, i, this.f37126);
        int i2 = -1;
        int i3 = -1;
        for (C12391 c12392 : this.f37124) {
            int iM28521 = c12392.m28521(c24321, i);
            if (iM28521 >= 0) {
                int iM28564 = c12392.m28564(iM28521);
                int iM28551 = c12392.m28551(iM28521);
                if (iM28564 > i2 || (iM28564 == i2 && iM28551 > i3)) {
                    c12391 = c12392;
                    i3 = iM28551;
                    i2 = iM28564;
                }
            }
        }
        return c12391;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13221 m30237(C12391 c12391) {
        C12391[] c12391Arr;
        long j;
        C12391 c12392 = c12391;
        C24320 c24320M28548 = c12391.m28548();
        C24320 c24320 = this.f37125;
        if (c24320M28548 == c24320) {
            int iM28529 = c12391.m28529();
            int i = this.f37126;
            if (iM28529 == i) {
                if (c12391.m28553() != 0) {
                    C12391[] c12391Arr2 = this.f37124;
                    int i2 = 0;
                    if (c12391Arr2.length <= 0 || c12391Arr2[0] != c12392) {
                        int i3 = 0;
                        while (true) {
                            int i4 = 1;
                            if (i3 < c12391Arr2.length) {
                                C12391 c12393 = c12391Arr2[i3];
                                if (c12393 == c12392 || (m30231(c12393, c12392) && m30231(c12392, c12393))) {
                                    break;
                                }
                                i3++;
                            } else {
                                for (int i5 = 0; i5 < c12391.m28553(); i5++) {
                                    if (c12392.m28554(i5).m48212() == EnumC22648.COMPLETE) {
                                        int iM28564 = c12392.m28564(i5);
                                        int iM28551 = c12392.m28551(i5);
                                        int length = c12391Arr2.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                int iM28518 = c12391.m28518();
                                                int iM28543 = c12391.m28543();
                                                if (iM28518 > 1024 || iM28543 > 262144) {
                                                    throw new IllegalArgumentException("Checkpoint cache update exceeds state budget");
                                                }
                                                int iMin = Math.min(16, c12391Arr2.length + 1);
                                                C12391[] c12391Arr3 = new C12391[iMin];
                                                long j2 = iM28518;
                                                long j3 = iM28543;
                                                c12391Arr3[0] = c12392;
                                                int length2 = c12391Arr2.length;
                                                while (i2 < length2) {
                                                    C12391 c12394 = c12391Arr2[i2];
                                                    if (m30231(c12392, c12394) || i4 == iMin) {
                                                        c12391Arr = c12391Arr2;
                                                        j = j2;
                                                    } else {
                                                        c12391Arr = c12391Arr2;
                                                        long jM28518 = ((long) c12394.m28518()) + j2;
                                                        j = j2;
                                                        long jM28543 = ((long) c12394.m28543()) + j3;
                                                        if (jM28518 <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && jM28543 <= 262144) {
                                                            c12391Arr3[i4] = c12394;
                                                            i4++;
                                                            j3 = jM28543;
                                                            j2 = jM28518;
                                                        }
                                                        i2++;
                                                        c12392 = c12391;
                                                        c12391Arr2 = c12391Arr;
                                                    }
                                                    j2 = j;
                                                    i2++;
                                                    c12392 = c12391;
                                                    c12391Arr2 = c12391Arr;
                                                }
                                                if (i4 != iMin) {
                                                    c12391Arr3 = (C12391[]) Arrays.copyOf(c12391Arr3, i4);
                                                }
                                                return new C13221(c24320, i, c12391Arr3);
                                            }
                                            C12391 c12395 = c12391Arr2[i6];
                                            int iM28521 = c12395.m28521(c12395.m28548(), iM28564);
                                            if (iM28521 >= 0 && c12395.m28564(iM28521) == iM28564 && c12395.m28551(iM28521) >= iM28551) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                            }
                        }
                        if (i3 != 0) {
                            C12391[] c12391Arr4 = (C12391[]) c12391Arr2.clone();
                            C12391 c12396 = c12391Arr4[i3];
                            System.arraycopy(c12391Arr4, 0, c12391Arr4, 1, i3);
                            c12391Arr4[0] = c12396;
                            return new C13221(c24320, i, c12391Arr4);
                        }
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Checkpoint cache update identity differs");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13221 m30236(C12391 c12391) {
        C12826.requireNonNull(c12391, "used");
        C24320 c24320M28548 = c12391.m28548();
        C24320 c24320 = this.f37125;
        if (c24320M28548 == c24320) {
            int iM28529 = c12391.m28529();
            int i = this.f37126;
            if (iM28529 == i) {
                int i2 = 0;
                while (true) {
                    C12391[] c12391Arr = this.f37124;
                    if (i2 < c12391Arr.length) {
                        if (c12391Arr[i2] == c12391) {
                            if (i2 == 0) {
                                return this;
                            }
                            C12391[] c12391Arr2 = (C12391[]) c12391Arr.clone();
                            C12391 c12392 = c12391Arr2[i2];
                            System.arraycopy(c12391Arr2, 0, c12391Arr2, 1, i2);
                            c12391Arr2[0] = c12392;
                            return new C13221(c24320, i, c12391Arr2);
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30231(C12391 c12391, C12391 c12392) {
        for (int i = 0; i < c12392.m28553(); i++) {
            if (c12392.m28554(i).m48212() == EnumC22648.COMPLETE) {
                int iM28564 = c12392.m28564(i);
                int iM28551 = c12392.m28551(i);
                int iM28521 = c12391.m28521(c12391.m28548(), iM28564);
                if (iM28521 < 0 || c12391.m28564(iM28521) != iM28564 || c12391.m28551(iM28521) < iM28551) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12391 m30234(int i) {
        return this.f37124[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24320 m30238() {
        return this.f37125;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m30239() {
        return this.f37126;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30233() {
        return this.f37124.length;
    }
}
