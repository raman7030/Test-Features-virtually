package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public class C11088 extends AbstractC21127 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC12900 f30716;

    /* JADX INFO: renamed from: ۙ */
    public final long f30717;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC6334 f30718;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC21087 f30719;

    /* JADX INFO: renamed from: ۤ */
    public final long f30720;

    /* JADX INFO: renamed from: ۨ */
    public final AbstractC19785 f30721;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC20456 f30722;

    /* JADX INFO: renamed from: ۬ */
    public final EnumC3711 f30723;

    /* JADX INFO: renamed from: ܰ */
    public final EnumC3711 f30724;

    /* JADX INFO: renamed from: ᩶ */
    public final long f30725;

    /* JADX INFO: renamed from: ᩸ */
    public final int f30726;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC25149 f30727;

    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC12900 f30728;

    public C11088(ConcurrentMapC16391 concurrentMapC16391) {
        EnumC3711 enumC3711 = concurrentMapC16391.f48168;
        EnumC3711 enumC3712 = concurrentMapC16391.f48181;
        AbstractC12900 abstractC12900 = concurrentMapC16391.f48166;
        AbstractC12900 abstractC12901 = concurrentMapC16391.f48172;
        long j = concurrentMapC16391.f48170;
        long j2 = concurrentMapC16391.f48161;
        long j3 = concurrentMapC16391.f48180;
        InterfaceC21087 interfaceC21087 = concurrentMapC16391.f48177;
        int i = concurrentMapC16391.f48178;
        InterfaceC6334 interfaceC6334 = concurrentMapC16391.f48165;
        AbstractC19785 abstractC19785 = concurrentMapC16391.f48174;
        AbstractC20456 abstractC20456 = concurrentMapC16391.f48179;
        this.f30723 = enumC3711;
        this.f30724 = enumC3712;
        this.f30716 = abstractC12900;
        this.f30728 = abstractC12901;
        this.f30717 = j;
        this.f30725 = j2;
        this.f30720 = j3;
        this.f30719 = interfaceC21087;
        this.f30726 = i;
        this.f30718 = interfaceC6334;
        this.f30721 = (abstractC19785 == AbstractC19785.m44967() || abstractC19785 == C5033.f11545) ? null : abstractC19785;
        this.f30722 = abstractC20456;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C5033 m25533() {
        char c;
        char c2;
        C5033 c5033M10712 = C5033.m10712();
        EnumC3711 enumC3711 = c5033M10712.f11556;
        C6194.m14034(enumC3711, "Key strength was already set to %s", enumC3711 == null);
        EnumC3711 enumC3712 = this.f30723;
        enumC3712.getClass();
        c5033M10712.f11556 = enumC3712;
        EnumC3711 enumC3713 = c5033M10712.f11547;
        C6194.m14034(enumC3713, "Value strength was already set to %s", enumC3713 == null);
        EnumC3711 enumC3714 = this.f30724;
        enumC3714.getClass();
        c5033M10712.f11547 = enumC3714;
        AbstractC12900 abstractC12900 = c5033M10712.f11557;
        C6194.m14034(abstractC12900, "key equivalence was already set to %s", abstractC12900 == null);
        AbstractC12900 abstractC12901 = this.f30716;
        abstractC12901.getClass();
        c5033M10712.f11557 = abstractC12901;
        AbstractC12900 abstractC12902 = c5033M10712.f11554;
        C6194.m14034(abstractC12902, "value equivalence was already set to %s", abstractC12902 == null);
        AbstractC12900 abstractC12903 = this.f30728;
        abstractC12903.getClass();
        c5033M10712.f11554 = abstractC12903;
        c5033M10712.m10715(this.f30726);
        C6194.m14036(c5033M10712.f11549 == null);
        InterfaceC6334 interfaceC6334 = this.f30718;
        interfaceC6334.getClass();
        c5033M10712.f11549 = interfaceC6334;
        c5033M10712.f11551 = false;
        long j = this.f30717;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = c5033M10712.f11555;
            c = 1;
            c2 = 0;
            C6194.m14033(j2, "expireAfterWrite was already set to %s ns", j2 == -1);
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C12229.m28208("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
            }
            c5033M10712.f11555 = timeUnit.toNanos(j);
        } else {
            c = 1;
            c2 = 0;
        }
        long j3 = this.f30725;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = c5033M10712.f11552;
            C6194.m14033(j4, "expireAfterAccess was already set to %s ns", j4 == -1);
            if (!(j3 >= 0)) {
                Object[] objArr = new Object[2];
                objArr[c2] = Long.valueOf(j3);
                objArr[c] = timeUnit2;
                throw new IllegalArgumentException(C12229.m28208("duration cannot be negative: %s %s", objArr));
            }
            c5033M10712.f11552 = timeUnit2.toNanos(j3);
        }
        EnumC17772 enumC17772 = EnumC17772.INSTANCE;
        long j5 = this.f30720;
        InterfaceC21087 interfaceC21087 = this.f30719;
        if (interfaceC21087 != enumC17772) {
            c5033M10712.m10717(interfaceC21087);
            if (j5 != -1) {
                c5033M10712.m10719(j5);
            }
        } else if (j5 != -1) {
            c5033M10712.m10716(j5);
        }
        AbstractC19785 abstractC19785 = this.f30721;
        if (abstractC19785 != null) {
            C6194.m14036(c5033M10712.f11550 == null);
            c5033M10712.f11550 = abstractC19785;
        }
        return c5033M10712;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f30727 = m25533().m10714();
    }

    private Object readResolve() {
        return this.f30727;
    }

    @Override // p067l.AbstractC6532
    /* JADX INFO: renamed from: ܿ */
    public final Object mo14984() {
        return this.f30727;
    }
}
