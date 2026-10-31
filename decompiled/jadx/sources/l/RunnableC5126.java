package l;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5126 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f16049 = new ThreadLocal();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Comparator f16050 = new C18532();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f16053;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f16054;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f16052 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f16051 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14677(C13132 c13132, int i, int i2) {
        if (c13132.isAttachedToWindow()) {
            if (C13132.sDebugAssertionsEnabled && !this.f16052.contains(c13132)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f16054 == 0) {
                this.f16054 = c13132.getNanoTime();
                c13132.post(this);
            }
        }
        C19238 c19238 = c13132.mPrefetchRegistry;
        c19238.f60553 = i;
        c19238.f60554 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14676(long j) {
        C0186 c0186;
        C13132 c13132;
        C13132 c13133;
        C0186 c0187;
        ArrayList arrayList = this.f16052;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C13132 c13134 = (C13132) arrayList.get(i2);
            if (c13134.getWindowVisibility() == 0) {
                c13134.mPrefetchRegistry.m44374(c13134, false);
                i += c13134.mPrefetchRegistry.f60551;
            }
        }
        ArrayList arrayList2 = this.f16051;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C13132 c13135 = (C13132) arrayList.get(i4);
            if (c13135.getWindowVisibility() == 0) {
                C19238 c19238 = c13135.mPrefetchRegistry;
                int iAbs = Math.abs(c19238.f60554) + Math.abs(c19238.f60553);
                for (int i5 = 0; i5 < c19238.f60551 * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0187 = new C0186();
                        arrayList2.add(c0187);
                    } else {
                        c0187 = (C0186) arrayList2.get(i3);
                    }
                    int[] iArr = c19238.f60552;
                    int i6 = iArr[i5 + 1];
                    c0187.f1412 = i6 <= iAbs;
                    c0187.f1414 = iAbs;
                    c0187.f1411 = i6;
                    c0187.f1415 = c13135;
                    c0187.f1413 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f16050);
        for (int i7 = 0; i7 < arrayList2.size() && (c13132 = (c0186 = (C0186) arrayList2.get(i7)).f1415) != null; i7++) {
            AbstractC3255 abstractC3255M14675 = m14675(c13132, c0186.f1413, c0186.f1412 ? C13132.FOREVER_NS : j);
            if (abstractC3255M14675 != null && abstractC3255M14675.mNestedRecyclerView != null && abstractC3255M14675.isBound() && !abstractC3255M14675.isInvalid() && (c13133 = (C13132) abstractC3255M14675.mNestedRecyclerView.get()) != null) {
                if (c13133.mDataSetHasChangedAfterLayout && c13133.mChildHelper.m50474() != 0) {
                    c13133.removeAndRecycleViews();
                }
                C19238 c19239 = c13133.mPrefetchRegistry;
                c19239.m44374(c13133, true);
                if (c19239.f60551 != 0) {
                    try {
                        int i8 = C5342.f16662;
                        Trace.beginSection(C13132.TRACE_NESTED_PREFETCH_TAG);
                        C21600 c21600 = c13133.mState;
                        AbstractC19902 abstractC19902 = c13133.mAdapter;
                        c21600.f69352 = 1;
                        c21600.f69362 = abstractC19902.getItemCount();
                        c21600.f69359 = false;
                        c21600.f69351 = false;
                        c21600.f69356 = false;
                        for (int i9 = 0; i9 < c19239.f60551 * 2; i9 += 2) {
                            m14675(c13133, c19239.f60552[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = C5342.f16662;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0186.f1412 = false;
            c0186.f1414 = 0;
            c0186.f1411 = 0;
            c0186.f1415 = null;
            c0186.f1413 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3255 m14675(C13132 c13132, int i, long j) {
        int iM50474 = c13132.mChildHelper.m50474();
        for (int i2 = 0; i2 < iM50474; i2++) {
            AbstractC3255 abstractC3255M31833 = C13132.m31833(c13132.mChildHelper.m50477(i2));
            if (abstractC3255M31833.mPosition == i && !abstractC3255M31833.isInvalid()) {
                return null;
            }
        }
        C2550 c2550 = c13132.mRecycler;
        try {
            c13132.onEnterLayoutOrScroll();
            AbstractC3255 abstractC3255M8068 = c2550.m8068(i, j);
            if (abstractC3255M8068 != null) {
                if (abstractC3255M8068.isBound() && !abstractC3255M8068.isInvalid()) {
                    c2550.m8070(abstractC3255M8068.itemView);
                } else {
                    c2550.m8072(abstractC3255M8068, false);
                }
            }
            return abstractC3255M8068;
        } finally {
            c13132.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f16052;
        try {
            int i = C5342.f16662;
            Trace.beginSection(C13132.TRACE_PREFETCH_TAG);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C13132 c13132 = (C13132) arrayList.get(i2);
                    if (c13132.getWindowVisibility() == 0) {
                        jMax = Math.max(c13132.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m14676(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f16053);
                }
            }
            this.f16054 = 0L;
        } finally {
            this.f16054 = 0L;
            int i3 = C5342.f16662;
            Trace.endSection();
        }
    }
}
