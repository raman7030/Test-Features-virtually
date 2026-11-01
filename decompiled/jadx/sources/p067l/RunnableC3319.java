package p067l;

import android.view.View;
import android.widget.ListView;

/* JADX INFO: renamed from: l.֨۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3319 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f6492;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f6493;

    public /* synthetic */ RunnableC3319(int i, Object obj) {
        this.f6492 = i;
        this.f6493 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6492) {
            case 0:
                ((ActivityC17874) this.f6493).m40669(true);
                break;
            case 1:
                C4073.m8168((C4073) this.f6493);
                break;
            case 2:
                ((ActivityC14326) this.f6493).m32912();
                break;
            case 3:
                ListView listView = (ListView) this.f6493;
                listView.setSelector(C21272.m48049(listView.getContext()));
                break;
            default:
                ((View) this.f6493).requestLayout();
                break;
        }
    }
}
