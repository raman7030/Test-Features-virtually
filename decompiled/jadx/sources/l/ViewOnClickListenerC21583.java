package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩸۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC21583 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙۘۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f69316 = {4995, -27689, -27701, -27701, -27697, -27700, -27771, -27760, -27760, -27688, -27690, -27701, -27689, -27702, -27683, -27759, -27684, -27696, -27694, -27760, -27661, -27758, -27659, -27658, -27663, -27651, -27658, -27663, -27760, -27650, -27697, -27692, -27668, -27690, -27688, -27695, -27682, -27701, -27702, -27699, -27686, -27660, -27690, -27693, -27693, -27686, -27699, -27654, -27705};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f69317;

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C0382.f1805) {
            if (C4075.f12947 >= 0) {
                C0798.m2998();
                if (C3245.f10203 > 0) {
                    C1504.m5179();
                    if (AbstractC2021.f6743 > 0) {
                        RunnableC0588.m2441();
                        if (C3746.f11829 <= 0) {
                        }
                    }
                }
                C0422.m1963();
            } else {
                short[] sArr = f69316;
                if (C1773.m5908() <= 0) {
                    C0422.m1963();
                } else if (C2520.f8000 >= 0) {
                    C1504.m5179();
                    if (AbstractC2021.f6743 > 0) {
                        C0422.m1963();
                    } else {
                        RunnableC0588.m2441();
                        if (C3746.f11829 <= 0) {
                            C0422.m1963();
                        }
                    }
                } else {
                    short s = sArr[0];
                    if (C7106.m19120() <= 0) {
                        C0798.m2998();
                        if (C3245.f10203 > 0) {
                            C1504.m5179();
                            if (AbstractC2021.f6743 > 0) {
                                RunnableC0588.m2441();
                                if (C3746.f11829 <= 0) {
                                }
                            }
                        }
                    } else {
                        int i = s * 19340;
                        if (C3537.f11231 < 0) {
                            int i2 = s + 4835;
                            if (C1916.f6442) {
                                int i3 = (i2 * i2) - i >= 0 ? 37823 : 30089;
                                Main mainM50612 = C22628.m50612(this.f69317);
                                if (C22628.m50615() != 0) {
                                    RunnableC0588.m2441();
                                    if (C3746.f11829 <= 0) {
                                    }
                                } else {
                                    short[] sArr2 = f69316;
                                    if (C1005.f3721) {
                                        if (RunnableC1108.f4040) {
                                            C22628.m50608(mainM50612, C22628.m50602(sArr2, 1, 48, i3));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C0422.m1963();
                }
            }
        }
        C3245.m9925();
        C21923.m49329();
    }

    public ViewOnClickListenerC21583(C16560 c16560) {
        this.f69317 = c16560;
    }
}
