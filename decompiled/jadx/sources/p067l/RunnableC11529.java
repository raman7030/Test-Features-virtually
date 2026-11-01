package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11529 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ArrayList f32160;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7014 f32161;

    public RunnableC11529(C23598 c23598, ArrayList arrayList, C7014 c7014) {
        this.f32160 = arrayList;
        this.f32161 = c7014;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f32160;
        C7014 c7014 = this.f32161;
        if (arrayList.contains(c7014)) {
            arrayList.remove(c7014);
            c7014.m16143().m49056(c7014.m16145().mView);
        }
    }
}
