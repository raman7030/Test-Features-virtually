package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.᩸۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC22881 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙۘۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f83007 = {4995, -27689, -27701, -27701, -27697, -27700, -27771, -27760, -27760, -27688, -27690, -27701, -27689, -27702, -27683, -27759, -27684, -27696, -27694, -27760, -27661, -27758, -27659, -27658, -27663, -27651, -27658, -27663, -27760, -27650, -27697, -27692, -27668, -27690, -27688, -27695, -27682, -27701, -27702, -27699, -27686, -27660, -27690, -27693, -27693, -27686, -27699, -27654, -27705};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18107 f72018;

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C0861.f81831) {
            if (C1044.f81959 >= 0) {
                C0882.m55710();
                if (C1003.f81929 > 0) {
                    C0917.m55854();
                    if (AbstractC0942.f81890 > 0) {
                        RunnableC0871.m55672();
                        if (C1028.f81950 <= 0) {
                        }
                    }
                }
                C0863.m55643();
            } else {
                short[] sArr = f83007;
                if (C0930.m55885() <= 0) {
                    C0863.m55643();
                } else if (C0967.f81910 >= 0) {
                    C0917.m55854();
                    if (AbstractC0942.f81890 > 0) {
                        C0863.m55643();
                    } else {
                        RunnableC0871.m55672();
                        if (C1028.f81950 <= 0) {
                            C0863.m55643();
                        }
                    }
                } else {
                    short s = sArr[0];
                    if (C1194.m56396() <= 0) {
                        C0882.m55710();
                        if (C1003.f81929 > 0) {
                            C0917.m55854();
                            if (AbstractC0942.f81890 > 0) {
                                RunnableC0871.m55672();
                                if (C1028.f81950 <= 0) {
                                }
                            }
                        }
                    } else {
                        int i = s * 19340;
                        if (C1017.f81942 < 0) {
                            int i2 = s + 4835;
                            if (C0937.f81884) {
                                int i3 = (i2 * i2) - i >= 0 ? 37823 : 30089;
                                Main mainM56594 = C1964.m56594(this.f72018);
                                if (C1964.m56597() != 0) {
                                    RunnableC0871.m55672();
                                    if (C1028.f81950 <= 0) {
                                    }
                                } else {
                                    short[] sArr2 = f83007;
                                    if (C0892.f81851) {
                                        if (RunnableC0897.f81856) {
                                            C1964.m56590(mainM56594, C1964.m56584(sArr2, 1, 48, i3));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C0863.m55643();
                }
            }
        }
        C1003.m56123();
        C1929.m56553();
    }

    public ViewOnClickListenerC22881(C18107 c18107) {
        this.f72018 = c18107;
    }
}
