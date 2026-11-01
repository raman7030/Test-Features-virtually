package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3222 extends C4564 {

    /* JADX INFO: renamed from: h */
    public static final C20480 f6245h = C20480.m46187h0(2000, 1, 1);

    /* JADX INFO: renamed from: g */
    public final InterfaceC15114 f6246g;

    @Override // p067l.C4564
    /* JADX INFO: renamed from: b */
    public final boolean mo5561b(C5234 c5234) {
        if (c5234.f12336c) {
            return super.mo5561b(c5234);
        }
        return false;
    }

    public C3222(InterfaceC11901 interfaceC11901, int i, int i2, InterfaceC15114 interfaceC15114, int i3) {
        super(interfaceC11901, i, i2, EnumC24680.NOT_NEGATIVE, i3);
        this.f6246g = interfaceC15114;
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: a */
    public final long mo5560a(C11940 c11940, long j) {
        long jAbs = Math.abs(j);
        InterfaceC15114 interfaceC15114 = this.f6246g;
        long jMo6952l = interfaceC15114 != null ? AbstractC17736.m40316r(c11940.f33253a).mo10577E(interfaceC15114).mo6952l(this.f10232a) : 0;
        long[] jArr = C4564.f10231f;
        if (j >= jMo6952l) {
            long j2 = jArr[this.f10233b];
            if (j < jMo6952l + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.f10234c];
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: c */
    public final int mo5562c(final C5234 c5234, final long j, final int i, final int i2) {
        int iMo6952l;
        InterfaceC15114 interfaceC15114 = this.f6246g;
        if (interfaceC15114 != null) {
            InterfaceC4997 interfaceC4997 = c5234.m11288c().f53683c;
            if (interfaceC4997 == null && (interfaceC4997 = c5234.f12334a.f22325e) == null) {
                interfaceC4997 = C10361.f28676c;
            }
            iMo6952l = interfaceC4997.mo10577E(interfaceC15114).mo6952l(this.f10232a);
            Consumer consumer = new Consumer() { // from class: l.ۚۙᩴ
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C24719.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    this.f18906a.mo5562c(c5234, j, i, i2);
                }
            };
            if (c5234.f12338e == null) {
                c5234.f12338e = new ArrayList();
            }
            c5234.f12338e.add(consumer);
        } else {
            iMo6952l = 0;
        }
        int i3 = i2 - i;
        int i4 = this.f10233b;
        if (i3 == i4 && j >= 0) {
            long j2 = C4564.f10231f[i4];
            long j3 = iMo6952l;
            long j4 = j3 - (j3 % j2);
            j = iMo6952l > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return c5234.m11291f(this.f10232a, j, i, i2);
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: d */
    public final C4564 mo5563d() {
        if (this.f10236e == -1) {
            return this;
        }
        return new C3222(this.f10232a, this.f10233b, this.f10234c, this.f6246g, -1);
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: e */
    public final C4564 mo5564e(int i) {
        return new C3222(this.f10232a, this.f10233b, this.f10234c, this.f6246g, this.f10236e + i);
    }

    @Override // p067l.C4564
    public final String toString() {
        return "ReducedValue(" + this.f10232a + "," + this.f10233b + "," + this.f10234c + "," + C12826.requireNonNullElse(this.f6246g, 0) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
