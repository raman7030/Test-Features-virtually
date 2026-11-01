package p067l;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7240 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public static final ThreadLocal f18883 = new ThreadLocal();

    /* JADX INFO: renamed from: ۬ */
    public static Comparator f18884 = new C19981();

    /* JADX INFO: renamed from: ᩸ */
    public long f18887;

    /* JADX INFO: renamed from: ᩹ */
    public long f18888;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f18886 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public ArrayList f18885 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m16585(C14849 c14849, int i, int i2) {
        if (c14849.isAttachedToWindow()) {
            if (C14849.sDebugAssertionsEnabled && !this.f18886.contains(c14849)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f18888 == 0) {
                this.f18888 = c14849.getNanoTime();
                c14849.post(this);
            }
        }
        C20652 c20652 = c14849.mPrefetchRegistry;
        c20652.f63784 = i;
        c20652.f63785 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX INFO: renamed from: ֫ */
    public final void m16584(long j) {
        C2545 c2545;
        C14849 c14849;
        C14849 c148410;
        C2545 c2546;
        ArrayList arrayList = this.f18886;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C14849 c148411 = (C14849) arrayList.get(i2);
            if (c148411.getWindowVisibility() == 0) {
                c148411.mPrefetchRegistry.m46668(c148411, false);
                i += c148411.mPrefetchRegistry.f63782;
            }
        }
        ArrayList arrayList2 = this.f18885;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C14849 c148412 = (C14849) arrayList.get(i4);
            if (c148412.getWindowVisibility() == 0) {
                C20652 c20652 = c148412.mPrefetchRegistry;
                int iAbs = Math.abs(c20652.f63785) + Math.abs(c20652.f63784);
                for (int i5 = 0; i5 < c20652.f63782 * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c2546 = new C2545();
                        arrayList2.add(c2546);
                    } else {
                        c2546 = (C2545) arrayList2.get(i3);
                    }
                    int[] iArr = c20652.f63783;
                    int i6 = iArr[i5 + 1];
                    c2546.f4186 = i6 <= iAbs;
                    c2546.f4188 = iAbs;
                    c2546.f4185 = i6;
                    c2546.f4189 = c148412;
                    c2546.f4187 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f18884);
        for (int i7 = 0; i7 < arrayList2.size() && (c14849 = (c2545 = (C2545) arrayList2.get(i7)).f4189) != null; i7++) {
            AbstractC5462 abstractC5462M16583 = m16583(c14849, c2545.f4187, c2545.f4186 ? C14849.FOREVER_NS : j);
            if (abstractC5462M16583 != null && abstractC5462M16583.mNestedRecyclerView != null && abstractC5462M16583.isBound() && !abstractC5462M16583.isInvalid() && (c148410 = (C14849) abstractC5462M16583.mNestedRecyclerView.get()) != null) {
                if (c148410.mDataSetHasChangedAfterLayout && c148410.mChildHelper.m52816() != 0) {
                    c148410.removeAndRecycleViews();
                }
                C20652 c20653 = c148410.mPrefetchRegistry;
                c20653.m46668(c148410, true);
                if (c20653.f63782 != 0) {
                    try {
                        int i8 = C1107.f19501;
                        Trace.beginSection(C14849.TRACE_NESTED_PREFETCH_TAG);
                        C22897 c22897 = c148410.mState;
                        AbstractC21283 abstractC21283 = c148410.mAdapter;
                        c22897.f72056 = 1;
                        c22897.f72066 = abstractC21283.getItemCount();
                        c22897.f72063 = false;
                        c22897.f72055 = false;
                        c22897.f72060 = false;
                        for (int i9 = 0; i9 < c20653.f63782 * 2; i9 += 2) {
                            m16583(c148410, c20653.f63783[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = C1107.f19501;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c2545.f4186 = false;
            c2545.f4188 = 0;
            c2545.f4185 = 0;
            c2545.f4189 = null;
            c2545.f4187 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5462 m16583(C14849 c14849, int i, long j) {
        int iM52816 = c14849.mChildHelper.m52816();
        for (int i2 = 0; i2 < iM52816; i2++) {
            AbstractC5462 abstractC5462M33925 = C14849.m33925(c14849.mChildHelper.m52819(i2));
            if (abstractC5462M33925.mPosition == i && !abstractC5462M33925.isInvalid()) {
                return null;
            }
        }
        C4792 c4792 = c14849.mRecycler;
        try {
            c14849.onEnterLayoutOrScroll();
            AbstractC5462 abstractC5462M10099 = c4792.m10099(i, j);
            if (abstractC5462M10099 != null) {
                if (abstractC5462M10099.isBound() && !abstractC5462M10099.isInvalid()) {
                    c4792.m10101(abstractC5462M10099.itemView);
                } else {
                    c4792.m10103(abstractC5462M10099, false);
                }
            }
            return abstractC5462M10099;
        } finally {
            c14849.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f18886;
        try {
            int i = C1107.f19501;
            Trace.beginSection(C14849.TRACE_PREFETCH_TAG);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C14849 c14849 = (C14849) arrayList.get(i2);
                    if (c14849.getWindowVisibility() == 0) {
                        jMax = Math.max(c14849.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m16584(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f18887);
                }
            }
            this.f18888 = 0L;
        } finally {
            this.f18888 = 0L;
            int i3 = C1107.f19501;
            Trace.endSection();
        }
    }
}
