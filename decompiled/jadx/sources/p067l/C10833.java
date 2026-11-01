package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۡ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10833 implements Serializable {
    public static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a */
    public final EnumC12571 f30010a;

    /* JADX INFO: renamed from: b */
    public final byte f30011b;

    /* JADX INFO: renamed from: c */
    public final EnumC23162 f30012c;

    /* JADX INFO: renamed from: d */
    public final C9257 f30013d;

    /* JADX INFO: renamed from: e */
    public final boolean f30014e;

    /* JADX INFO: renamed from: f */
    public final EnumC11504 f30015f;

    /* JADX INFO: renamed from: g */
    public final C19550 f30016g;

    /* JADX INFO: renamed from: h */
    public final C19550 f30017h;

    /* JADX INFO: renamed from: i */
    public final C19550 f30018i;

    public C10833(EnumC12571 enumC12571, int i, EnumC23162 enumC23162, C9257 c9257, boolean z, EnumC11504 enumC11504, C19550 c19550, C19550 c19551, C19550 c19552) {
        this.f30010a = enumC12571;
        this.f30011b = (byte) i;
        this.f30012c = enumC23162;
        this.f30013d = c9257;
        this.f30014e = z;
        this.f30015f = enumC11504;
        this.f30016g = c19550;
        this.f30017h = c19551;
        this.f30018i = c19552;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C24914((byte) 3, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m24952b(DataOutput dataOutput) {
        byte b;
        int iM21357i0 = this.f30014e ? 86400 : this.f30013d.m21357i0();
        int i = this.f30016g.f59520b;
        int i2 = this.f30017h.f59520b - i;
        int i3 = this.f30018i.f59520b - i;
        if (iM21357i0 % 3600 == 0) {
            b = this.f30014e ? (byte) 24 : this.f30013d.f25133a;
        } else {
            b = C0684bo.f2505j;
        }
        int i4 = i % EnumC5674.f13824 == 0 ? (i / EnumC5674.f13824) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        EnumC23162 enumC23162 = this.f30012c;
        dataOutput.writeInt((this.f30010a.getValue() << 28) + ((this.f30011b + UTF8.S_CS3) << 22) + ((enumC23162 == null ? 0 : enumC23162.getValue()) << 19) + (b << C0698cb.f2570l) + (this.f30015f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(iM21357i0);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.f30017h.f59520b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.f30018i.f59520b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C10833 m24951a(DataInput dataInput) {
        C9257 c9257M21344W;
        int i;
        int i2;
        int i3 = dataInput.readInt();
        EnumC12571 enumC12571M28960Y = EnumC12571.m28960Y(i3 >>> 28);
        int i4 = ((264241152 & i3) >>> 22) - 32;
        int i5 = (3670016 & i3) >>> 19;
        EnumC23162 enumC23162M51623V = i5 == 0 ? null : EnumC23162.m51623V(i5);
        int i6 = (507904 & i3) >>> 14;
        EnumC11504 enumC11504 = EnumC11504.values()[(i3 & 12288) >>> 12];
        int i7 = (i3 & 4080) >>> 4;
        int i8 = (i3 & 12) >>> 2;
        int i9 = i3 & 3;
        if (i6 == 31) {
            long j = dataInput.readInt();
            C9257 c9257 = C9257.f25129e;
            EnumC19947.SECOND_OF_DAY.m45273T(j);
            int i10 = (int) (j / 3600);
            long j2 = j - ((long) (i10 * 3600));
            int i11 = (int) (j2 / 60);
            c9257M21344W = C9257.m21344W(i10, i11, (int) (j2 - ((long) (i11 * 60))), 0);
        } else {
            int i12 = i6 % 24;
            C9257 c9258 = C9257.f25129e;
            EnumC19947.HOUR_OF_DAY.m45273T(i12);
            c9257M21344W = C9257.f25132h[i12];
        }
        C19550 c19550M44395e0 = C19550.m44395e0(i7 == 255 ? dataInput.readInt() : (i7 + C0184a.f879g) * EnumC5674.f13824);
        if (i8 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i8 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS) + c19550M44395e0.f59520b;
        }
        C19550 c19550M44395e1 = C19550.m44395e0(i);
        if (i9 == 3) {
            i2 = dataInput.readInt();
        } else {
            i2 = c19550M44395e0.f59520b + (i9 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
        }
        C19550 c19550M44395e2 = C19550.m44395e0(i2);
        boolean z = i6 == 24;
        C12826.requireNonNull(enumC12571M28960Y, "month");
        C12826.requireNonNull(c9257M21344W, "time");
        C12826.requireNonNull(enumC11504, "timeDefnition");
        C12826.requireNonNull(c19550M44395e0, "standardOffset");
        C12826.requireNonNull(c19550M44395e1, "offsetBefore");
        C12826.requireNonNull(c19550M44395e2, "offsetAfter");
        if (i4 < -28 || i4 > 31 || i4 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !c9257M21344W.equals(C9257.f25131g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c9257M21344W.f25136d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C10833(enumC12571M28960Y, i4, enumC23162M51623V, c9257M21344W, z, enumC11504, c19550M44395e0, c19550M44395e1, c19550M44395e2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10833) {
            C10833 c10833 = (C10833) obj;
            if (this.f30010a == c10833.f30010a && this.f30011b == c10833.f30011b && this.f30012c == c10833.f30012c && this.f30015f == c10833.f30015f && this.f30013d.equals(c10833.f30013d) && this.f30014e == c10833.f30014e && this.f30016g.equals(c10833.f30016g) && this.f30017h.equals(c10833.f30017h) && this.f30018i.equals(c10833.f30018i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM21357i0 = ((this.f30013d.m21357i0() + (this.f30014e ? 1 : 0)) << 15) + (this.f30010a.ordinal() << 11) + ((this.f30011b + UTF8.S_CS3) << 5);
        EnumC23162 enumC23162 = this.f30012c;
        return ((this.f30016g.f59520b ^ (this.f30015f.ordinal() + (iM21357i0 + ((enumC23162 == null ? 7 : enumC23162.ordinal()) << 2)))) ^ this.f30017h.f59520b) ^ this.f30018i.f59520b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.f30018i.f59520b - this.f30017h.f59520b > 0 ? "Gap " : "Overlap ");
        sb.append(this.f30017h);
        sb.append(" to ");
        sb.append(this.f30018i);
        sb.append(", ");
        EnumC23162 enumC23162 = this.f30012c;
        if (enumC23162 != null) {
            byte b = this.f30011b;
            if (b == -1) {
                sb.append(enumC23162.name());
                sb.append(" on or before last day of ");
                sb.append(this.f30010a.name());
            } else if (b < 0) {
                sb.append(enumC23162.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.f30011b) - 1);
                sb.append(" of ");
                sb.append(this.f30010a.name());
            } else {
                sb.append(enumC23162.name());
                sb.append(" on or after ");
                sb.append(this.f30010a.name());
                sb.append(' ');
                sb.append((int) this.f30011b);
            }
        } else {
            sb.append(this.f30010a.name());
            sb.append(' ');
            sb.append((int) this.f30011b);
        }
        sb.append(" at ");
        sb.append(this.f30014e ? "24:00" : this.f30013d.toString());
        sb.append(" ");
        sb.append(this.f30015f);
        sb.append(", standard offset ");
        sb.append(this.f30016g);
        sb.append(']');
        return sb.toString();
    }
}
