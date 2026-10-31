package l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15954 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f49246;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f49247;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public SparseArray f49248;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37726(AbstractC3255 abstractC3255) {
        int itemViewType = abstractC3255.getItemViewType();
        ArrayList arrayList = m37724(itemViewType).f27068;
        if (((C8900) this.f49248.get(itemViewType)).f27067 <= arrayList.size()) {
            C9975.m25138(abstractC3255.itemView);
        } else {
            if (C13132.sDebugAssertionsEnabled && arrayList.contains(abstractC3255)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC3255.resetInternal();
            arrayList.add(abstractC3255);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37728(int i, long j) {
        C8900 c8900M37724 = m37724(i);
        long j2 = c8900M37724.f27066;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c8900M37724.f27066 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37725(int i, long j) {
        C8900 c8900M37724 = m37724(i);
        long j2 = c8900M37724.f27065;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c8900M37724.f27065 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37729(long j, int i, long j2) {
        long j3 = m37724(i).f27066;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37727(long j, int i, long j2) {
        long j3 = m37724(i).f27065;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8900 m37724(int i) {
        SparseArray sparseArray = this.f49248;
        C8900 c8900 = (C8900) sparseArray.get(i);
        if (c8900 != null) {
            return c8900;
        }
        C8900 c8901 = new C8900();
        sparseArray.put(i, c8901);
        return c8901;
    }
}
