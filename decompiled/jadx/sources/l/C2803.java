package l;

import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۖ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2803 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6141 f8750 = C2097.m6970(new C7036());

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC18325 f8751 = new C21148();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC1412 f8753;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC19695 f8754;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC4172 f8755;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC18325 f8756;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC11081 f8760;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC1412 f8762;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC11081 f8763;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f8757 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f8752 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f8759 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f8765 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f8761 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f8758 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC6141 f8764 = f8750;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C2803 m8652() {
        return new C2803();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8655(int i) {
        int i2 = this.f8752;
        if (i2 == -1) {
            C4025.m12110(i > 0);
            this.f8752 = i;
            return;
        }
        throw new IllegalStateException(C10375.m26179("concurrency level was already set to %s", Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8656(long j) {
        long j2 = this.f8759;
        C4025.m12113(j2, "maximum size was already set to %s", j2 == -1);
        long j3 = this.f8765;
        C4025.m12113(j3, "maximum weight was already set to %s", j3 == -1);
        C4025.m12115("maximum size can not be combined with weigher", this.f8754 == null);
        C4025.m12109("maximum size must not be negative", j >= 0);
        this.f8759 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8659(long j) {
        long j2 = this.f8765;
        C4025.m12113(j2, "maximum weight was already set to %s", j2 == -1);
        long j3 = this.f8759;
        C4025.m12113(j3, "maximum size was already set to %s", j3 == -1);
        C4025.m12109("maximum weight must not be negative", j >= 0);
        this.f8765 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8657(InterfaceC19695 interfaceC19695) {
        C4025.m12116(this.f8754 == null);
        if (this.f8757) {
            long j = this.f8759;
            C4025.m12113(j, "weigher can not be combined with maximum size (%s provided)", j == -1);
        }
        interfaceC19695.getClass();
        this.f8754 = interfaceC19695;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8658() {
        EnumC1412 enumC1412 = EnumC1412.f5083;
        EnumC1412 enumC1413 = this.f8753;
        C4025.m12114(enumC1413, "Value strength was already set to %s", enumC1413 == null);
        enumC1412.getClass();
        this.f8753 = enumC1412;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0685 m8653(AbstractC19031 abstractC19031) {
        m8651();
        abstractC19031.getClass();
        return new C7057(new ConcurrentMapC14754(this, abstractC19031), 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23969 m8654() {
        m8651();
        return new C9880(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m8651() {
        if (this.f8754 == null) {
            C4025.m12115("maximumWeight requires weigher", this.f8765 == -1);
        } else if (this.f8757) {
            C4025.m12115("weigher requires maximumWeight", this.f8765 != -1);
        } else if (this.f8765 == -1) {
            C9859.f29824.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        int i = this.f8752;
        if (i != -1) {
            c8964M37871.m23111("concurrencyLevel", i);
        }
        long j = this.f8759;
        if (j != -1) {
            c8964M37871.m23108(j, "maximumSize");
        }
        long j2 = this.f8765;
        if (j2 != -1) {
            c8964M37871.m23108(j2, "maximumWeight");
        }
        if (this.f8761 != -1) {
            c8964M37871.m23110((Object) C15942.m37718(new StringBuilder(), this.f8761, "ns"), "expireAfterWrite");
        }
        if (this.f8758 != -1) {
            c8964M37871.m23110((Object) C15942.m37718(new StringBuilder(), this.f8758, "ns"), "expireAfterAccess");
        }
        EnumC1412 enumC1412 = this.f8762;
        if (enumC1412 != null) {
            c8964M37871.m23110((Object) C15107.m35799(enumC1412.toString()), "keyStrength");
        }
        EnumC1412 enumC1413 = this.f8753;
        if (enumC1413 != null) {
            c8964M37871.m23110((Object) C15107.m35799(enumC1413.toString()), "valueStrength");
        }
        if (this.f8763 != null) {
            c8964M37871.m23109("keyEquivalence");
        }
        if (this.f8760 != null) {
            c8964M37871.m23109("valueEquivalence");
        }
        if (this.f8755 != null) {
            c8964M37871.m23109("removalListener");
        }
        return c8964M37871.toString();
    }
}
