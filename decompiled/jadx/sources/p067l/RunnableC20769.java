package p067l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20769 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public WeakReference f65292;

    /* JADX INFO: renamed from: ᩹ */
    public List f65293;

    public RunnableC20769(ActivityC9368 activityC9368) {
        this.f65292 = new WeakReference(activityC9368);
        this.f65293 = activityC9368.f25530;
        if (m46915().isEmpty()) {
            return;
        }
        C7050.m16213(this, 1000L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m46915() {
        ArrayList arrayList = new ArrayList();
        for (C18280 c18280 : this.f65293) {
            int i = c18280.f54575;
            if (i == 0 || i == 1) {
                arrayList.add(c18280);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ActivityC9368 activityC9368 = (ActivityC9368) this.f65292.get();
        if (activityC9368 == null || activityC9368.isFinishing() || this.f65293 != activityC9368.f25530) {
            return;
        }
        if (!activityC9368.f25539) {
            C7050.m16213(this, 5000L);
            return;
        }
        final ArrayList arrayListM46915 = m46915();
        if (arrayListM46915.isEmpty()) {
            return;
        }
        int size = arrayListM46915.size();
        final int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((C18280) arrayListM46915.get(i)).f54571;
        }
        C4081.f8987.execute(new Runnable() { // from class: l.ۘۡۢ
            /* JADX WARN: Code duplicated, block: B:14:0x0033 A[PHI: r4
              0x0033: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean), (r4v4 boolean) binds: [B:7:0x0014, B:12:0x002f, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr2 = iArr;
                ArrayList arrayList = arrayListM46915;
                final ActivityC9368 activityC9369 = activityC9368;
                try {
                    int[] iArrM8513 = C4199.m8513(iArr2);
                    boolean z = false;
                    boolean z2 = false;
                    for (int i2 = 0; i2 < iArrM8513.length; i2++) {
                        if (iArrM8513[i2] == -1) {
                            z2 = true;
                        } else {
                            if (((C18280) arrayList.get(i2)).f54575 != iArrM8513[i2]) {
                                ((C18280) arrayList.get(i2)).f54575 = iArrM8513[i2];
                                z = true;
                            }
                            int i3 = iArrM8513[i2];
                            if (i3 == 0 || i3 == 1) {
                                z2 = true;
                            }
                        }
                    }
                    if (z) {
                        activityC9369.runOnUiThread(new Runnable() { // from class: l.ᩴۡۢ
                            @Override // java.lang.Runnable
                            public final void run() {
                                activityC9369.f25537.notifyDataSetChanged();
                            }
                        });
                    }
                    if (!z2) {
                        return;
                    }
                } catch (C3924 unused) {
                }
                C7050.m16213(this.f15070, 5000L);
            }
        });
    }
}
