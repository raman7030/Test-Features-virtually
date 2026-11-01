package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ۡۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAJE */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10753 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۘ۫ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f82091 = {3426, 24325, 24345, 24345, 24349, 24350, 24407, 24386, 24386, 24330, 24324, 24345, 24325, 24344, 24335, 24387, 24334, 24322, 24320, 24386, 24353, 24384, 24359, 24356, 24355, 24367, 24356, 24355, 24386, 24364, 24349, 24326, 24361, 24332, 24345, 24332, 24352, 24344, 24321, 24345, 24324, 24349, 24321, 24328, 24341, 24324, 24323, 24330};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18107 f29816;

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C1048.m56305() >= 0) {
            C0946.m55980();
            if (C1404.f82149 < 0) {
                C0955.m56025();
                C1124.m56367();
            }
        } else if (C1964.f83032 > 0) {
            short[] sArr = f82091;
            if (C0873.m55678()) {
                if (C0992.m56107() > 0) {
                    C0955.m56025();
                    C1124.m56367();
                } else if (C0873.f81841 <= 0) {
                    C0946.m55980();
                    if (C1404.f82149 < 0) {
                        C0955.m56025();
                        C1124.m56367();
                    }
                }
            } else if (C1964.f83032 > 0) {
                short s = sArr[0];
                if (C1404.f82149 < 0) {
                    int i = 38650 * s;
                    int i2 = s * s;
                    if (C1036.f81953 < 0) {
                        if (C0882.m55710() == 0) {
                            int i3 = i - (i2 + 373455625) <= 0 ? 24429 : 59200;
                            Main mainM56594 = C1964.m56594(this.f29816);
                            if (C0989.f81920 < 0) {
                                short[] sArr2 = f82091;
                                if (C1012.m56134() <= 0) {
                                    if (C0992.m56107() > 0) {
                                        if (C0873.f81841 <= 0) {
                                        }
                                    }
                                } else if (C1012.m56134() > 0) {
                                    C1929.m56559(mainM56594, C0863.m55635(sArr2, 1, 47, i3));
                                    return;
                                }
                            }
                        } else if (C0873.f81841 <= 0) {
                        }
                        C0946.m55980();
                        if (C1404.f82149 < 0) {
                        }
                    } else if (C0992.m56107() > 0) {
                        if (C0873.f81841 <= 0) {
                            C0946.m55980();
                            if (C1404.f82149 < 0) {
                            }
                        }
                    }
                } else if (C0992.m56107() > 0) {
                    if (C0873.f81841 <= 0) {
                        C0946.m55980();
                        if (C1404.f82149 < 0) {
                        }
                    }
                }
                C0955.m56025();
                C1124.m56367();
            }
        } else if (C0992.m56107() > 0) {
            C0955.m56025();
            C1124.m56367();
        } else if (C0873.f81841 <= 0) {
            C0946.m55980();
            if (C1404.f82149 < 0) {
                C0955.m56025();
                C1124.m56367();
            }
        }
        C0861.m55626();
        C1025.m56230();
    }

    public ViewOnClickListenerC10753(C18107 c18107) {
        this.f29816 = c18107;
    }
}
