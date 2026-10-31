package l;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ܺۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15756 {
    public volatile /* synthetic */ Object _next = null;
    public volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public /* synthetic */ AtomicReferenceArray f48587;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f48588;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f48589;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f48590;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C15050 f48585 = new C15050("REMOVE_FROZEN");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48584 = AtomicReferenceFieldUpdater.newUpdater(C15756.class, Object.class, "_next");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f48586 = AtomicLongFieldUpdater.newUpdater(C15756.class, "_state");

    public C15756(int i, boolean z) {
        this.f48588 = i;
        this.f48590 = z;
        int i2 = i - 1;
        this.f48589 = i2;
        this.f48587 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m37154() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37153() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37152() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f48586.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37151(Object obj) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f48589;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f48590 && this.f48587.get(i2 & i3) != null) {
                int i4 = this.f48588;
                if (i4 < 1024 || ((i2 - i) & Mod.M30) > (i4 >> 1)) {
                    return 1;
                }
            } else {
                if (f48586.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & Mod.M30)) << 30))) {
                    this.f48587.set(i2 & i3, obj);
                    C15756 c15756M37156 = this;
                    while ((c15756M37156._state & 1152921504606846976L) != 0) {
                        c15756M37156 = c15756M37156.m37156();
                        AtomicReferenceArray atomicReferenceArray = c15756M37156.f48587;
                        int i5 = c15756M37156.f48589 & i2;
                        Object obj2 = atomicReferenceArray.get(i5);
                        if ((obj2 instanceof C8702) && ((C8702) obj2).f26492 == i2) {
                            atomicReferenceArray.set(i5, obj);
                        } else {
                            c15756M37156 = null;
                        }
                        if (c15756M37156 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m37155() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f48585;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f48589;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                Object obj = this.f48587.get(i4);
                if (obj == null) {
                    if (this.f48590) {
                    }
                } else if (!(obj instanceof C8702)) {
                    long j2 = (i + 1) & Mod.M30;
                    if (f48586.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                        this.f48587.set(this.f48589 & i, null);
                        return obj;
                    }
                    if (this.f48590) {
                        C15756 c15756M37156 = this;
                        while (true) {
                            long j3 = c15756M37156._state;
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                c15756M37156 = c15756M37156.m37156();
                            } else {
                                if (f48586.compareAndSet(c15756M37156, j3, (j3 & (-1073741824)) | j2)) {
                                    c15756M37156.f48587.set(c15756M37156.f48589 & i5, null);
                                    c15756M37156 = null;
                                } else {
                                    continue;
                                }
                            }
                            if (c15756M37156 == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15756 m37156() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f48586.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            C15756 c15756 = (C15756) this._next;
            if (c15756 != null) {
                return c15756;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48584;
            C15756 c15757 = new C15756(this.f48588 * 2, this.f48590);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f48589;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c8702 = this.f48587.get(i4);
                if (c8702 == null) {
                    c8702 = new C8702(i);
                }
                c15757.f48587.set(c15757.f48589 & i, c8702);
                i++;
            }
            c15757._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c15757) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }
}
