package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19276 implements InterfaceC4524, InterfaceC5195, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f57605c = 0;
    public static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a */
    public final int f57606a;

    /* JADX INFO: renamed from: b */
    public final int f57607b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C19276 c19276 = (C19276) obj;
        int i = this.f57606a - c19276.f57606a;
        return i == 0 ? this.f57607b - c19276.f57607b : i;
    }

    static {
        C6575 c6575 = new C6575();
        c6575.m15016e("--");
        c6575.m15023l(EnumC19947.MONTH_OF_YEAR, 2);
        c6575.m15015d('-');
        c6575.m15023l(EnumC19947.DAY_OF_MONTH, 2);
        c6575.m15028q(Locale.getDefault(), EnumC18645.SMART, null);
    }

    public C19276(int i, int i2) {
        this.f57606a = i;
        this.f57607b = i2;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.MONTH_OF_YEAR || interfaceC11901 == EnumC19947.DAY_OF_MONTH;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        int i;
        if (interfaceC11901 == EnumC19947.MONTH_OF_YEAR) {
            return interfaceC11901.mo3657s();
        }
        if (interfaceC11901 != EnumC19947.DAY_OF_MONTH) {
            return AbstractC7877.m18196d(this, interfaceC11901);
        }
        EnumC12571 enumC12571M28960Y = EnumC12571.m28960Y(this.f57606a);
        enumC12571M28960Y.getClass();
        int i2 = AbstractC3853.f8297a[enumC12571M28960Y.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return C23970.m53120g(1L, i, EnumC12571.m28960Y(this.f57606a).m28963X());
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        return mo6953n(interfaceC11901).m53121a(mo6949G(interfaceC11901), interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        int i;
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        int i2 = AbstractC17934.f53568a[((EnumC19947) interfaceC11901).ordinal()];
        if (i2 == 1) {
            i = this.f57607b;
        } else {
            if (i2 != 2) {
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
            }
            i = this.f57606a;
        }
        return i;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20680b) {
            return C10361.f28676c;
        }
        return AbstractC7877.m18195c(this, c10500);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        if (!AbstractC17736.m40316r(interfaceC17263).equals(C10361.f28676c)) {
            throw new C17796("Adjustment only supported on ISO date-time");
        }
        InterfaceC17263 interfaceC17263Mo7152c = interfaceC17263.mo7152c(this.f57606a, EnumC19947.MONTH_OF_YEAR);
        EnumC19947 enumC19947 = EnumC19947.DAY_OF_MONTH;
        return interfaceC17263Mo7152c.mo7152c(Math.min(interfaceC17263Mo7152c.mo6953n(enumC19947).f76159d, this.f57607b), enumC19947);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19276) {
            C19276 c19276 = (C19276) obj;
            if (this.f57606a == c19276.f57606a && this.f57607b == c19276.f57607b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f57606a << 6) + this.f57607b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f57606a < 10 ? "0" : "");
        sb.append(this.f57606a);
        sb.append(this.f57607b < 10 ? "-0" : "-");
        sb.append(this.f57607b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21959(C0698cb.f2569k, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
