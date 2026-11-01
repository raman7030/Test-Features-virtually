package p067l;

import android.database.Observable;

/* JADX INFO: renamed from: l.ۙۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6530 extends Observable {
    /* JADX INFO: renamed from: ֫ */
    public final boolean m14976() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14977() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC5189) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14979() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC5189) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14975(int i, int i2, Object obj) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC5189) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14978(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC5189) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14980(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC5189) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14974(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC5189) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
        }
    }
}
