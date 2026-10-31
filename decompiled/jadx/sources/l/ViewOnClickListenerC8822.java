package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۡۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAJE */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8822 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۘ۫ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f26891 = {3426, 24325, 24345, 24345, 24349, 24350, 24407, 24386, 24386, 24330, 24324, 24345, 24325, 24344, 24335, 24387, 24334, 24322, 24320, 24386, 24353, 24384, 24359, 24356, 24355, 24367, 24356, 24355, 24386, 24364, 24349, 24326, 24361, 24332, 24345, 24332, 24352, 24344, 24321, 24345, 24324, 24349, 24321, 24328, 24341, 24324, 24323, 24330};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f26892;

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C4159.m12565() >= 0) {
            C2105.m6982();
            if (C11340.f33930 < 0) {
                C2272.m7503();
                C5695.m16023();
            }
        } else if (C22628.f73083 > 0) {
            short[] sArr = f26891;
            if (C0630.m2564()) {
                if (C3019.m9255() > 0) {
                    C2272.m7503();
                    C5695.m16023();
                } else if (C0630.f2410 <= 0) {
                    C2105.m6982();
                    if (C11340.f33930 < 0) {
                        C2272.m7503();
                        C5695.m16023();
                    }
                }
            } else if (C22628.f73083 > 0) {
                short s = sArr[0];
                if (C11340.f33930 < 0) {
                    int i = 38650 * s;
                    int i2 = s * s;
                    if (C3911.f12484 < 0) {
                        if (C0798.m2998() == 0) {
                            int i3 = i - (i2 + 373455625) <= 0 ? 24429 : 59200;
                            Main mainM50612 = C22628.m50612(this.f26892);
                            if (C2958.f9394 < 0) {
                                short[] sArr2 = f26891;
                                if (C3432.m10477() <= 0) {
                                    if (C3019.m9255() > 0) {
                                        if (C0630.f2410 <= 0) {
                                        }
                                    }
                                } else if (C3432.m10477() > 0) {
                                    C21923.m49335(mainM50612, C0422.m1955(sArr2, 1, 47, i3));
                                    return;
                                }
                            }
                        } else if (C0630.f2410 <= 0) {
                        }
                        C2105.m6982();
                        if (C11340.f33930 < 0) {
                        }
                    } else if (C3019.m9255() > 0) {
                        if (C0630.f2410 <= 0) {
                            C2105.m6982();
                            if (C11340.f33930 < 0) {
                            }
                        }
                    }
                } else if (C3019.m9255() > 0) {
                    if (C0630.f2410 <= 0) {
                        C2105.m6982();
                        if (C11340.f33930 < 0) {
                        }
                    }
                }
                C2272.m7503();
                C5695.m16023();
            }
        } else if (C3019.m9255() > 0) {
            C2272.m7503();
            C5695.m16023();
        } else if (C0630.f2410 <= 0) {
            C2105.m6982();
            if (C11340.f33930 < 0) {
                C2272.m7503();
                C5695.m16023();
            }
        }
        C0382.m1848();
        C3683.m11222();
    }

    public ViewOnClickListenerC8822(C16560 c16560) {
        this.f26892 = c16560;
    }
}
