package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.᩷ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9SO */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC22035 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֨ۚۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f82984 = {1223, 23825, 23821, 23821, 23817, 23818, 23875, 23894, 23894, 23838, 23824, 23821, 23825, 23820, 23835, 23895, 23834, 23830, 23828, 23894, 23861, 23892, 23859, 23856, 23863, 23867, 23856, 23863, 23894, 23860, 23853, 23869, 23832, 23821, 23832, 23871, 23824, 23829, 23836, 23818, 23849, 23819, 23830, 23823, 23824, 23837, 23836, 23819};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18107 f69345;

    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C0967.f81910 < 0) {
            short[] sArr = f82984;
            if (C1012.m56134() <= 0) {
                C0992.m56107();
                if (RunnableC1014.f81941 <= 0) {
                    if (C0863.f81833 > 0) {
                        C0861.m55626();
                        if (C0877.m55696()) {
                            C1036.m56257();
                            RunnableC0938.m55938();
                        }
                    }
                }
            } else if (C1044.f81959 >= 0) {
                C0861.m55626();
                if (C0877.m55696()) {
                    C1036.m56257();
                    RunnableC0938.m55938();
                }
            } else {
                short s = sArr[0];
                if (C1194.f82045 == 0) {
                    int i = s + 9562;
                    if (C1964.f83032 <= 0) {
                        C0992.m56107();
                        if (RunnableC1014.f81941 <= 0) {
                            if (C0863.f81833 > 0) {
                                C0861.m55626();
                                if (C0877.m55696()) {
                                    C1036.m56257();
                                    RunnableC0938.m55938();
                                }
                            }
                        }
                    } else {
                        int i2 = i * i;
                        int i3 = s * s;
                        if (C0882.m55710() == 0) {
                            if (ServiceConnectionC1013.f81940 >= 0) {
                                C0992.m56107();
                                if (RunnableC1014.f81941 <= 0) {
                                    if (C0863.f81833 > 0) {
                                    }
                                }
                            } else {
                                int i4 = i3 + 91431844;
                                int i5 = (i4 + i4) - i2 >= 0 ? 23929 : 37244;
                                Main mainM56560 = C1929.m56560(this.f69345);
                                if (C1012.f81938 < 0) {
                                    short[] sArr2 = f82984;
                                    if (C0863.f81833 > 0 && C0894.f81854 < 0) {
                                        C1929.m56559(mainM56560, C1929.m56558(sArr2, 1, 47, i5));
                                        return;
                                    }
                                }
                                C1036.m56257();
                                RunnableC0938.m55938();
                            }
                        } else if (C0863.f81833 > 0) {
                        }
                        C0861.m55626();
                        if (C0877.m55696()) {
                            C1036.m56257();
                            RunnableC0938.m55938();
                        }
                    }
                }
            }
        } else if (C0863.f81833 > 0) {
            C0861.m55626();
            if (C0877.m55696()) {
                C1036.m56257();
                RunnableC0938.m55938();
            }
        }
        ViewOnClickListenerC0939.m55941();
    }

    public ViewOnClickListenerC22035(C18107 c18107) {
        this.f69345 = c18107;
    }
}
