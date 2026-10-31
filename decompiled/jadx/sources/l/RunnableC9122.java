package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V68I */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9122 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f27632;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f27633;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f27634;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f27635;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27636;

    public RunnableC9122(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f27636 = i;
        this.f27633 = arrayList;
        this.f27635 = arrayList2;
        this.f27632 = arrayList3;
        this.f27634 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f27636; i++) {
            C17648.m41306((View) this.f27633.get(i), (String) this.f27635.get(i));
            C17648.m41306((View) this.f27632.get(i), (String) this.f27634.get(i));
        }
    }
}
