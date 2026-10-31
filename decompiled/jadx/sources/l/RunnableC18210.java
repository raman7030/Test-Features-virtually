package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18210 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f56603;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f56604;

    public RunnableC18210(List list, int i, Throwable th) {
        C13746.m33055(list, "initCallbacks cannot be null");
        this.f56603 = new ArrayList(list);
        this.f56604 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f56603;
        int size = arrayList.size();
        int i = 0;
        if (this.f56604 != 1) {
            while (i < size) {
                ((AbstractC16798) arrayList.get(i)).mo13121();
                i++;
            }
        } else {
            while (i < size) {
                ((AbstractC16798) arrayList.get(i)).mo2295();
                i++;
            }
        }
    }
}
