package l;

import android.view.View;
import android.widget.ListView;

/* JADX INFO: renamed from: l.֨۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1000 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3717;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3718;

    public /* synthetic */ RunnableC1000(int i, Object obj) {
        this.f3717 = i;
        this.f3718 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3717) {
            case 0:
                ((ActivityC16315) this.f3718).m38454(true);
                break;
            case 1:
                C1793.m5971((C1793) this.f3718);
                break;
            case 2:
                ((ActivityC12581) this.f3718).m30835();
                break;
            case 3:
                ListView listView = (ListView) this.f3718;
                listView.setSelector(C19890.m45738(listView.getContext()));
                break;
            default:
                ((View) this.f3718).requestLayout();
                break;
        }
    }
}
