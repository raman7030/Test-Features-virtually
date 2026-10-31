package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19361 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public WeakReference f62679;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f62680;

    public RunnableC19361(ActivityC7365 activityC7365) {
        this.f62679 = new WeakReference(activityC7365);
        this.f62680 = activityC7365.f22617;
        if (m44621().isEmpty()) {
            return;
        }
        C4925.m14316(this, 1000L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m44621() {
        ArrayList arrayList = new ArrayList();
        for (C16742 c16742 : this.f62680) {
            int i = c16742.f51392;
            if (i == 0 || i == 1) {
                arrayList.add(c16742);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ActivityC7365 activityC7365 = (ActivityC7365) this.f62679.get();
        if (activityC7365 == null || activityC7365.isFinishing() || this.f62680 != activityC7365.f22617) {
            return;
        }
        if (!activityC7365.f22626) {
            C4925.m14316(this, 5000L);
            return;
        }
        final ArrayList arrayListM44621 = m44621();
        if (arrayListM44621.isEmpty()) {
            return;
        }
        int size = arrayListM44621.size();
        final int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((C16742) arrayListM44621.get(i)).f51388;
        }
        C1802.f6208.execute(new Runnable() { // from class: l.ۘۡۢ
            /* JADX WARN: Code duplicated, block: B:14:0x0033 A[PHI: r4
              0x0033: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean), (r4v4 boolean) binds: [B:7:0x0014, B:12:0x002f, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr2 = iArr;
                ArrayList arrayList = arrayListM44621;
                final ActivityC7365 activityC7366 = activityC7365;
                try {
                    int[] iArrM6340 = C1926.m6340(iArr2);
                    boolean z = false;
                    boolean z2 = false;
                    for (int i2 = 0; i2 < iArrM6340.length; i2++) {
                        if (iArrM6340[i2] == -1) {
                            z2 = true;
                        } else {
                            if (((C16742) arrayList.get(i2)).f51392 != iArrM6340[i2]) {
                                ((C16742) arrayList.get(i2)).f51392 = iArrM6340[i2];
                                z = true;
                            }
                            int i3 = iArrM6340[i2];
                            if (i3 == 0 || i3 == 1) {
                                z2 = true;
                            }
                        }
                    }
                    if (z) {
                        activityC7366.runOnUiThread(new Runnable() { // from class: l.ᩴۡۢ
                            @Override // java.lang.Runnable
                            public final void run() {
                                activityC7366.f22624.notifyDataSetChanged();
                            }
                        });
                    }
                    if (!z2) {
                        return;
                    }
                } catch (C1637 unused) {
                }
                C4925.m14316(this.f12262, 5000L);
            }
        });
    }
}
