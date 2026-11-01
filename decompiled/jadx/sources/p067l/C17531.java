package p067l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17531 {

    /* JADX INFO: renamed from: ֫ */
    public int f52393;

    /* JADX INFO: renamed from: ۧ */
    public Set f52394;

    /* JADX INFO: renamed from: ܽ */
    public SparseArray f52395;

    /* JADX INFO: renamed from: ֫ */
    public final void m39901(AbstractC5462 abstractC5462) {
        int itemViewType = abstractC5462.getItemViewType();
        ArrayList arrayList = m39899(itemViewType).f29992;
        if (((C10827) this.f52395.get(itemViewType)).f29991 <= arrayList.size()) {
            C11848.m27155(abstractC5462.itemView);
        } else {
            if (C14849.sDebugAssertionsEnabled && arrayList.contains(abstractC5462)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC5462.resetInternal();
            arrayList.add(abstractC5462);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39903(int i, long j) {
        C10827 c10827M39899 = m39899(i);
        long j2 = c10827M39899.f29990;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c10827M39899.f29990 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39900(int i, long j) {
        C10827 c10827M39899 = m39899(i);
        long j2 = c10827M39899.f29989;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c10827M39899.f29989 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39904(long j, int i, long j2) {
        long j3 = m39899(i).f29990;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39902(long j, int i, long j2) {
        long j3 = m39899(i).f29989;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ֫ */
    private C10827 m39899(int i) {
        SparseArray sparseArray = this.f52395;
        C10827 c10827 = (C10827) sparseArray.get(i);
        if (c10827 != null) {
            return c10827;
        }
        C10827 c10828 = new C10827();
        sparseArray.put(i, c10828);
        return c10828;
    }
}
