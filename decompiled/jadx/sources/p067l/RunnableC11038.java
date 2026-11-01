package p067l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V68I */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11038 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ ArrayList f30572;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ArrayList f30573;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ArrayList f30574;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ArrayList f30575;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f30576;

    public RunnableC11038(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f30576 = i;
        this.f30573 = arrayList;
        this.f30575 = arrayList2;
        this.f30572 = arrayList3;
        this.f30574 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f30576; i++) {
            C1717.m43552((View) this.f30573.get(i), (String) this.f30575.get(i));
            C1717.m43552((View) this.f30572.get(i), (String) this.f30574.get(i));
        }
    }
}
