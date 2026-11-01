package p067l;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ܺۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17343 {
    public volatile /* synthetic */ Object _next = null;
    public volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ AtomicReferenceArray f51726;

    /* JADX INFO: renamed from: ۧ */
    public final int f51727;

    /* JADX INFO: renamed from: ܽ */
    public final int f51728;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f51729;

    /* JADX INFO: renamed from: ܿ */
    public static final C16672 f51724 = new C16672("REMOVE_FROZEN");

    /* JADX INFO: renamed from: ܳ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f51723 = AtomicReferenceFieldUpdater.newUpdater(C17343.class, Object.class, "_next");

    /* JADX INFO: renamed from: ᩻ */
    public static final /* synthetic */ AtomicLongFieldUpdater f51725 = AtomicLongFieldUpdater.newUpdater(C17343.class, "_state");

    public C17343(int i, boolean z) {
        this.f51727 = i;
        this.f51729 = z;
        int i2 = i - 1;
        this.f51728 = i2;
        this.f51726 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m39324() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m39323() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39322() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f51725.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m39321(Object obj) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f51728;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f51729 && this.f51726.get(i2 & i3) != null) {
                int i4 = this.f51727;
                if (i4 < 1024 || ((i2 - i) & Mod.M30) > (i4 >> 1)) {
                    return 1;
                }
            } else {
                if (f51725.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & Mod.M30)) << 30))) {
                    this.f51726.set(i2 & i3, obj);
                    C17343 c17343M39326 = this;
                    while ((c17343M39326._state & 1152921504606846976L) != 0) {
                        c17343M39326 = c17343M39326.m39326();
                        AtomicReferenceArray atomicReferenceArray = c17343M39326.f51726;
                        int i5 = c17343M39326.f51728 & i2;
                        Object obj2 = atomicReferenceArray.get(i5);
                        if ((obj2 instanceof C10639) && ((C10639) obj2).f29417 == i2) {
                            atomicReferenceArray.set(i5, obj);
                        } else {
                            c17343M39326 = null;
                        }
                        if (c17343M39326 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m39325() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f51724;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f51728;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                Object obj = this.f51726.get(i4);
                if (obj == null) {
                    if (this.f51729) {
                    }
                } else if (!(obj instanceof C10639)) {
                    long j2 = (i + 1) & Mod.M30;
                    if (f51725.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                        this.f51726.set(this.f51728 & i, null);
                        return obj;
                    }
                    if (this.f51729) {
                        C17343 c17343M39326 = this;
                        while (true) {
                            long j3 = c17343M39326._state;
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                c17343M39326 = c17343M39326.m39326();
                            } else {
                                if (f51725.compareAndSet(c17343M39326, j3, (j3 & (-1073741824)) | j2)) {
                                    c17343M39326.f51726.set(c17343M39326.f51728 & i5, null);
                                    c17343M39326 = null;
                                } else {
                                    continue;
                                }
                            }
                            if (c17343M39326 == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17343 m39326() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f51725.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            C17343 c17343 = (C17343) this._next;
            if (c17343 != null) {
                return c17343;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51723;
            C17343 c17344 = new C17343(this.f51727 * 2, this.f51729);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f51728;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c10639 = this.f51726.get(i4);
                if (c10639 == null) {
                    c10639 = new C10639(i);
                }
                c17344.f51726.set(c17344.f51728 & i, c10639);
                i++;
            }
            c17344._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c17344) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }
}
