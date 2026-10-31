package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۡ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8906 implements Serializable {
    public static final long serialVersionUID = 6889046316657758795L;
    public final EnumC10735 a;
    public final byte b;
    public final EnumC21878 c;
    public final C7248 d;
    public final boolean e;
    public final EnumC9612 f;
    public final C18078 g;
    public final C18078 h;
    public final C18078 i;

    public C8906(EnumC10735 enumC10735, int i, EnumC21878 enumC21878, C7248 c7248, boolean z, EnumC9612 enumC9612, C18078 c18078, C18078 c18079, C18078 c180710) {
        this.a = enumC10735;
        this.b = (byte) i;
        this.c = enumC21878;
        this.d = c7248;
        this.e = z;
        this.f = enumC9612;
        this.g = c18078;
        this.h = c18079;
        this.i = c180710;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C23722((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b;
        int iI0 = this.e ? 86400 : this.d.i0();
        int i = this.g.b;
        int i2 = this.h.b - i;
        int i3 = this.i.b - i;
        if (iI0 % 3600 == 0) {
            b = this.e ? (byte) 24 : this.d.a;
        } else {
            b = bo.j;
        }
        int i4 = i % EnumC3478.f11019 == 0 ? (i / EnumC3478.f11019) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        EnumC21878 enumC21878 = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + UTF8.S_CS3) << 22) + ((enumC21878 == null ? 0 : enumC21878.getValue()) << 19) + (b << cb.f77931l) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(iI0);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public static C8906 a(DataInput dataInput) {
        C7248 c7248W;
        int i;
        int i2;
        int i3 = dataInput.readInt();
        EnumC10735 enumC10735Y = EnumC10735.Y(i3 >>> 28);
        int i4 = ((264241152 & i3) >>> 22) - 32;
        int i5 = (3670016 & i3) >>> 19;
        EnumC21878 enumC21878V = i5 == 0 ? null : EnumC21878.V(i5);
        int i6 = (507904 & i3) >>> 14;
        EnumC9612 enumC9612 = EnumC9612.values()[(i3 & 12288) >>> 12];
        int i7 = (i3 & 4080) >>> 4;
        int i8 = (i3 & 12) >>> 2;
        int i9 = i3 & 3;
        if (i6 == 31) {
            long j = dataInput.readInt();
            C7248 c7248 = C7248.e;
            EnumC18496.SECOND_OF_DAY.T(j);
            int i10 = (int) (j / 3600);
            long j2 = j - ((long) (i10 * 3600));
            int i11 = (int) (j2 / 60);
            c7248W = C7248.W(i10, i11, (int) (j2 - ((long) (i11 * 60))), 0);
        } else {
            int i12 = i6 % 24;
            C7248 c7249 = C7248.e;
            EnumC18496.HOUR_OF_DAY.T(i12);
            c7248W = C7248.h[i12];
        }
        C18078 c18078E0 = C18078.e0(i7 == 255 ? dataInput.readInt() : (i7 + a.g) * EnumC3478.f11019);
        if (i8 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i8 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS) + c18078E0.b;
        }
        C18078 c18078E1 = C18078.e0(i);
        if (i9 == 3) {
            i2 = dataInput.readInt();
        } else {
            i2 = c18078E0.b + (i9 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
        }
        C18078 c18078E2 = C18078.e0(i2);
        boolean z = i6 == 24;
        C11003.requireNonNull(enumC10735Y, "month");
        C11003.requireNonNull(c7248W, "time");
        C11003.requireNonNull(enumC9612, "timeDefnition");
        C11003.requireNonNull(c18078E0, "standardOffset");
        C11003.requireNonNull(c18078E1, "offsetBefore");
        C11003.requireNonNull(c18078E2, "offsetAfter");
        if (i4 < -28 || i4 > 31 || i4 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !c7248W.equals(C7248.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c7248W.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C8906(enumC10735Y, i4, enumC21878V, c7248W, z, enumC9612, c18078E0, c18078E1, c18078E2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8906) {
            C8906 c8906 = (C8906) obj;
            if (this.a == c8906.a && this.b == c8906.b && this.c == c8906.c && this.f == c8906.f && this.d.equals(c8906.d) && this.e == c8906.e && this.g.equals(c8906.g) && this.h.equals(c8906.h) && this.i.equals(c8906.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iI0 = ((this.d.i0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + UTF8.S_CS3) << 5);
        EnumC21878 enumC21878 = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (iI0 + ((enumC21878 == null ? 7 : enumC21878.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        EnumC21878 enumC21878 = this.c;
        if (enumC21878 != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(enumC21878.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(enumC21878.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(enumC21878.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
