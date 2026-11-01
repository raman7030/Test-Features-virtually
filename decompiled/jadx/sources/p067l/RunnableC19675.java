package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19675 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f59816;

    /* JADX INFO: renamed from: ᩹ */
    public final int f59817;

    public RunnableC19675(List list, int i, Throwable th) {
        C1524.m35169(list, "initCallbacks cannot be null");
        this.f59816 = new ArrayList(list);
        this.f59817 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f59816;
        int size = arrayList.size();
        int i = 0;
        if (this.f59817 != 1) {
            while (i < size) {
                ((AbstractC18333) arrayList.get(i)).mo14985();
                i++;
            }
        } else {
            while (i < size) {
                ((AbstractC18333) arrayList.get(i)).mo4663();
                i++;
            }
        }
    }
}
