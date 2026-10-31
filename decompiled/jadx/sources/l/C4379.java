package l;

import android.database.Observable;

/* JADX INFO: renamed from: l.ۙۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4379 extends Observable {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13112() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13113() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC2968) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m13115() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC2968) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13111(int i, int i2, Object obj) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC2968) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13114(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC2968) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m13116(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC2968) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13110(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC2968) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
        }
    }
}
