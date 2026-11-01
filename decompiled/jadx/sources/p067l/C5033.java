package p067l;

import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۖ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5033 {

    /* JADX INFO: renamed from: ᩴ */
    public static final InterfaceC8205 f11544 = C4362.m9096(new C9056());

    /* JADX INFO: renamed from: ᩵ */
    public static final AbstractC19785 f11545 = new C22468();

    /* JADX INFO: renamed from: ۖ */
    public EnumC3711 f11547;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC21087 f11548;

    /* JADX INFO: renamed from: ۜ */
    public InterfaceC6334 f11549;

    /* JADX INFO: renamed from: ۡ */
    public AbstractC19785 f11550;

    /* JADX INFO: renamed from: ܺ */
    public AbstractC12900 f11554;

    /* JADX INFO: renamed from: ܿ */
    public EnumC3711 f11556;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC12900 f11557;

    /* JADX INFO: renamed from: ۢ */
    public boolean f11551 = true;

    /* JADX INFO: renamed from: ֫ */
    public int f11546 = -1;

    /* JADX INFO: renamed from: ܳ */
    public long f11553 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public long f11559 = -1;

    /* JADX INFO: renamed from: ܽ */
    public long f11555 = -1;

    /* JADX INFO: renamed from: ۧ */
    public long f11552 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC8205 f11558 = f11544;

    /* JADX INFO: renamed from: ᩳ */
    public static C5033 m10712() {
        return new C5033();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10715(int i) {
        int i2 = this.f11546;
        if (i2 == -1) {
            C6194.m14030(i > 0);
            this.f11546 = i;
            return;
        }
        throw new IllegalStateException(C12229.m28208("concurrency level was already set to %s", Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10716(long j) {
        long j2 = this.f11553;
        C6194.m14033(j2, "maximum size was already set to %s", j2 == -1);
        long j3 = this.f11559;
        C6194.m14033(j3, "maximum weight was already set to %s", j3 == -1);
        C6194.m14035("maximum size can not be combined with weigher", this.f11548 == null);
        C6194.m14029("maximum size must not be negative", j >= 0);
        this.f11553 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10719(long j) {
        long j2 = this.f11559;
        C6194.m14033(j2, "maximum weight was already set to %s", j2 == -1);
        long j3 = this.f11553;
        C6194.m14033(j3, "maximum size was already set to %s", j3 == -1);
        C6194.m14029("maximum weight must not be negative", j >= 0);
        this.f11559 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10717(InterfaceC21087 interfaceC21087) {
        C6194.m14036(this.f11548 == null);
        if (this.f11551) {
            long j = this.f11553;
            C6194.m14033(j, "weigher can not be combined with maximum size (%s provided)", j == -1);
        }
        interfaceC21087.getClass();
        this.f11548 = interfaceC21087;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10718() {
        EnumC3711 enumC3711 = EnumC3711.f7854;
        EnumC3711 enumC3712 = this.f11547;
        C6194.m14034(enumC3712, "Value strength was already set to %s", enumC3712 == null);
        enumC3711.getClass();
        this.f11547 = enumC3711;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3020 m10713(AbstractC20456 abstractC20456) {
        m10711();
        abstractC20456.getClass();
        return new C9076(new ConcurrentMapC16391(this, abstractC20456), 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC25149 m10714() {
        m10711();
        return new C11759(this);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m10711() {
        if (this.f11548 == null) {
            C6194.m14035("maximumWeight requires weigher", this.f11559 == -1);
        } else if (this.f11551) {
            C6194.m14035("weigher requires maximumWeight", this.f11559 != -1);
        } else if (this.f11559 == -1) {
            C11739.f32777.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        int i = this.f11546;
        if (i != -1) {
            c10888M40057.m25085("concurrencyLevel", i);
        }
        long j = this.f11553;
        if (j != -1) {
            c10888M40057.m25082(j, "maximumSize");
        }
        long j2 = this.f11559;
        if (j2 != -1) {
            c10888M40057.m25082(j2, "maximumWeight");
        }
        if (this.f11555 != -1) {
            c10888M40057.m25084((Object) C17520.m39893(new StringBuilder(), this.f11555, "ns"), "expireAfterWrite");
        }
        if (this.f11552 != -1) {
            c10888M40057.m25084((Object) C17520.m39893(new StringBuilder(), this.f11552, "ns"), "expireAfterAccess");
        }
        EnumC3711 enumC3711 = this.f11556;
        if (enumC3711 != null) {
            c10888M40057.m25084((Object) C16726.m37957(enumC3711.toString()), "keyStrength");
        }
        EnumC3711 enumC3712 = this.f11547;
        if (enumC3712 != null) {
            c10888M40057.m25084((Object) C16726.m37957(enumC3712.toString()), "valueStrength");
        }
        if (this.f11557 != null) {
            c10888M40057.m25083("keyEquivalence");
        }
        if (this.f11554 != null) {
            c10888M40057.m25083("valueEquivalence");
        }
        if (this.f11549 != null) {
            c10888M40057.m25083("removalListener");
        }
        return c10888M40057.toString();
    }
}
