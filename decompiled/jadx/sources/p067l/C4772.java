package p067l;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۖ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4772 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f10814;

    /* JADX INFO: renamed from: ۜ */
    public final int f10815;

    /* JADX INFO: renamed from: ܳ */
    public int f10817;

    /* JADX INFO: renamed from: ܽ */
    public final int f10818;

    /* JADX INFO: renamed from: ܿ */
    public int[] f10819;

    /* JADX INFO: renamed from: ᩳ */
    public final int f10820;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f10822;

    /* JADX INFO: renamed from: ᩷ */
    public int f10821 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f10816 = -1;

    public C4772(int i, C10856 c10856) {
        this.f10818 = i;
        C10856 c10857 = c10856.f65695;
        this.f10820 = c10857 != null ? c10857.mo3481() : -1;
        this.f10815 = c10856.f30091.mo4432();
        this.f10822 = i == 57 && (c10856.f65695 instanceof C22623);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x004f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0068  */
    /* JADX WARN: Code duplicated, block: B:68:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m10073(InterfaceC2808 interfaceC2808) {
        int type = interfaceC2808.getType();
        int i = this.f10818;
        if (i != 1) {
            if (i == 15 || i == 18) {
                if (type != 136 && type != 133) {
                    return;
                }
            } else if (i != 25) {
                if (i != 34) {
                    if (i == 41) {
                        if (type != 136 && type != 95) {
                            return;
                        }
                    } else if (i == 54) {
                        if (type != 92) {
                            return;
                        }
                    } else if (i != 64 && i != 67) {
                        if (i != 68) {
                            switch (i) {
                                case 21:
                                    if (type != 18) {
                                    }
                                    break;
                                case 22:
                                    if (type != 17 && type != 38) {
                                    }
                                    break;
                                case 23:
                                    if (type != 91 && type != 92) {
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                            if (type != 136) {
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                        if (type != 92) {
                            return;
                        }
                    } else if (type != 136) {
                        return;
                    }
                } else if (type != 43 && type != 91 && type != 92) {
                    return;
                }
            } else if (type != 10 && type != 21) {
                return;
            }
        } else if (type != 93) {
            return;
        }
        int[] iArr = this.f10819;
        if (iArr == null) {
            this.f10819 = new int[2];
        } else {
            int i2 = this.f10817;
            if (i2 == iArr.length) {
                this.f10819 = Arrays.copyOf(iArr, i2 * 2);
            }
        }
        int[] iArr2 = this.f10819;
        int i3 = this.f10817;
        this.f10817 = i3 + 1;
        iArr2[i3] = interfaceC2808.mo4432();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10071(int i) {
        return this.f10819[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10072(int i, List list) {
        for (int i2 = 0; i2 < this.f10817; i2++) {
            if (((InterfaceC2808) list.get(this.f10819[i2])).getType() == i) {
                return this.f10819[i2];
            }
        }
        return -1;
    }
}
