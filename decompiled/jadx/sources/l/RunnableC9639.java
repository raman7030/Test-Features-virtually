package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9639 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f29211;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f29212;

    public RunnableC9639(C22338 c22338, ArrayList arrayList, C4888 c4888) {
        this.f29211 = arrayList;
        this.f29212 = c4888;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f29211;
        C4888 c4888 = this.f29212;
        if (arrayList.contains(c4888)) {
            arrayList.remove(c4888);
            c4888.m14246().m46733(c4888.m14248().mView);
        }
    }
}
