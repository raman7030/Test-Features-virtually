package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0898 extends C2310 {
    public static final C19056 h = C19056.h0(2000, 1, 1);
    public final InterfaceC13410 g;

    @Override // l.C2310
    public final boolean b(C3015 c3015) {
        if (c3015.c) {
            return super.b(c3015);
        }
        return false;
    }

    public C0898(InterfaceC10030 interfaceC10030, int i, int i2, InterfaceC13410 interfaceC13410, int i3) {
        super(interfaceC10030, i, i2, EnumC23476.NOT_NEGATIVE, i3);
        this.g = interfaceC13410;
    }

    @Override // l.C2310
    public final long a(C10071 c10071, long j) {
        long jAbs = Math.abs(j);
        InterfaceC13410 interfaceC13410 = this.g;
        long jL = interfaceC13410 != null ? AbstractC16169.r(c10071.a).E(interfaceC13410).l(this.a) : 0;
        long[] jArr = C2310.f;
        if (j >= jL) {
            long j2 = jArr[this.b];
            if (j < jL + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // l.C2310
    public final int c(final C3015 c3015, final long j, final int i, final int i2) {
        int iL;
        InterfaceC13410 interfaceC13410 = this.g;
        if (interfaceC13410 != null) {
            InterfaceC2765 interfaceC2765 = c3015.c().c;
            if (interfaceC2765 == null && (interfaceC2765 = c3015.a.e) == null) {
                interfaceC2765 = C8409.c;
            }
            iL = interfaceC2765.E(interfaceC13410).l(this.a);
            Consumer consumer = new Consumer() { // from class: l.ۚۙᩴ
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C23517.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.a.c(c3015, j, i, i2);
                }
            };
            if (c3015.e == null) {
                c3015.e = new ArrayList();
            }
            c3015.e.add(consumer);
        } else {
            iL = 0;
        }
        int i3 = i2 - i;
        int i4 = this.b;
        if (i3 == i4 && j >= 0) {
            long j2 = C2310.f[i4];
            long j3 = iL;
            long j4 = j3 - (j3 % j2);
            j = iL > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return c3015.f(this.a, j, i, i2);
    }

    @Override // l.C2310
    public final C2310 d() {
        if (this.e == -1) {
            return this;
        }
        return new C0898(this.a, this.b, this.c, this.g, -1);
    }

    @Override // l.C2310
    public final C2310 e(int i) {
        return new C0898(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // l.C2310
    public final String toString() {
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + C11003.requireNonNullElse(this.g, 0) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
