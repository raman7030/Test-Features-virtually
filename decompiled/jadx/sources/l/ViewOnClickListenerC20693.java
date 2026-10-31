package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩷ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9SO */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC20693 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֨ۚۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f66663 = {1223, 23825, 23821, 23821, 23817, 23818, 23875, 23894, 23894, 23838, 23824, 23821, 23825, 23820, 23835, 23895, 23834, 23830, 23828, 23894, 23861, 23892, 23859, 23856, 23863, 23867, 23856, 23863, 23894, 23860, 23853, 23869, 23832, 23821, 23832, 23871, 23824, 23829, 23836, 23818, 23849, 23819, 23830, 23823, 23824, 23837, 23836, 23819};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f66664;

    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C2520.f8000 < 0) {
            short[] sArr = f66663;
            if (C3432.m10477() <= 0) {
                C3019.m9255();
                if (RunnableC3474.f10992 <= 0) {
                    if (C0422.f1886 > 0) {
                        C0382.m1848();
                        if (C0714.m2805()) {
                            C3911.m11924();
                            RunnableC1937.m6387();
                        }
                    }
                }
            } else if (C4075.f12947 >= 0) {
                C0382.m1848();
                if (C0714.m2805()) {
                    C3911.m11924();
                    RunnableC1937.m6387();
                }
            } else {
                short s = sArr[0];
                if (C7106.f21815 == 0) {
                    int i = s + 9562;
                    if (C22628.f73083 <= 0) {
                        C3019.m9255();
                        if (RunnableC3474.f10992 <= 0) {
                            if (C0422.f1886 > 0) {
                                C0382.m1848();
                                if (C0714.m2805()) {
                                    C3911.m11924();
                                    RunnableC1937.m6387();
                                }
                            }
                        }
                    } else {
                        int i2 = i * i;
                        int i3 = s * s;
                        if (C0798.m2998() == 0) {
                            if (ServiceConnectionC3453.f10921 >= 0) {
                                C3019.m9255();
                                if (RunnableC3474.f10992 <= 0) {
                                    if (C0422.f1886 > 0) {
                                    }
                                }
                            } else {
                                int i4 = i3 + 91431844;
                                int i5 = (i4 + i4) - i2 >= 0 ? 23929 : 37244;
                                Main mainM49336 = C21923.m49336(this.f66664);
                                if (C3432.f10845 < 0) {
                                    short[] sArr2 = f66663;
                                    if (C0422.f1886 > 0 && C1047.f3863 < 0) {
                                        C21923.m49335(mainM49336, C21923.m49334(sArr2, 1, 47, i5));
                                        return;
                                    }
                                }
                                C3911.m11924();
                                RunnableC1937.m6387();
                            }
                        } else if (C0422.f1886 > 0) {
                        }
                        C0382.m1848();
                        if (C0714.m2805()) {
                            C3911.m11924();
                            RunnableC1937.m6387();
                        }
                    }
                }
            }
        } else if (C0422.f1886 > 0) {
            C0382.m1848();
            if (C0714.m2805()) {
                C3911.m11924();
                RunnableC1937.m6387();
            }
        }
        ViewOnClickListenerC1958.m6429();
    }

    public ViewOnClickListenerC20693(C16560 c16560) {
        this.f66664 = c16560;
    }
}
