package p067l;

import com.google.android.material.badge.BadgeDrawable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ᩳ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19550 extends AbstractC7739 implements InterfaceC4524, InterfaceC5195, Comparable {

    /* JADX INFO: renamed from: d */
    public static final ConcurrentMapC12768 f59515d = new ConcurrentMapC12768(16, 0.75f, 4);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentMapC12768 f59516e = new ConcurrentMapC12768(16, 0.75f, 4);

    /* JADX INFO: renamed from: f */
    public static final C19550 f59517f = m44395e0(0);

    /* JADX INFO: renamed from: g */
    public static final C19550 f59518g = m44395e0(-64800);

    /* JADX INFO: renamed from: h */
    public static final C19550 f59519h = m44395e0(64800);
    public static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b */
    public final int f59520b;

    /* JADX INFO: renamed from: c */
    public final transient String f59521c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C19550) obj).f59520b - this.f59520b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public static C19550 m44393c0(String str) {
        int iM44396f0;
        int iM44396f1;
        int iM44396f2;
        char cCharAt;
        C12826.requireNonNull(str, "offsetId");
        C19550 c19550 = (C19550) f59516e.get(str);
        if (c19550 != null) {
            return c19550;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iM44396f0 = m44396f0(str, 1, false);
                    iM44396f1 = m44396f0(str, 3, false);
                } else {
                    if (length == 6) {
                        iM44396f0 = m44396f0(str, 1, false);
                        iM44396f1 = m44396f0(str, 4, true);
                    } else if (length == 7) {
                        iM44396f0 = m44396f0(str, 1, false);
                        iM44396f1 = m44396f0(str, 3, false);
                        iM44396f2 = m44396f0(str, 5, false);
                    } else if (length == 9) {
                        iM44396f0 = m44396f0(str, 1, false);
                        iM44396f1 = m44396f0(str, 4, true);
                        iM44396f2 = m44396f0(str, 7, true);
                    } else {
                        throw new C17796("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new C17796("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                    }
                    if (cCharAt == '-') {
                        return m44394d0(-iM44396f0, -iM44396f1, -iM44396f2);
                    }
                    return m44394d0(iM44396f0, iM44396f1, iM44396f2);
                }
            }
            iM44396f2 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt == '+') {
            }
            if (cCharAt == '-') {
                return m44394d0(-iM44396f0, -iM44396f1, -iM44396f2);
            }
            return m44394d0(iM44396f0, iM44396f1, iM44396f2);
        }
        iM44396f0 = m44396f0(str, 1, false);
        iM44396f1 = 0;
        iM44396f2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return m44394d0(-iM44396f0, -iM44396f1, -iM44396f2);
        }
        return m44394d0(iM44396f0, iM44396f1, iM44396f2);
    }

    @Override // p067l.AbstractC7739
    /* JADX INFO: renamed from: W */
    public final C17537 mo17864W() {
        C12826.requireNonNull(this, "offset");
        return new C17537(this);
    }

    /* JADX INFO: renamed from: f0 */
    public static int m44396f0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new C17796("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new C17796("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    /* JADX INFO: renamed from: b0 */
    public static C19550 m44392b0(InterfaceC4524 interfaceC4524) {
        C12826.requireNonNull(interfaceC4524, "temporal");
        C19550 c19550 = (C19550) interfaceC4524.mo6950T(AbstractC7877.f20682d);
        if (c19550 != null) {
            return c19550;
        }
        throw new C17796("Unable to obtain ZoneOffset from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName());
    }

    /* JADX INFO: renamed from: d0 */
    public static C19550 m44394d0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C17796("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C17796("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C17796("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C17796("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C17796("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C17796("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return m44395e0((i2 * 60) + (i * 3600) + i3);
        }
        throw new C17796("Zone offset not in valid range: -18:00 to +18:00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public static C19550 m44395e0(int i) {
        if (i < -64800 || i > 64800) {
            throw new C17796("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % EnumC5674.f13824 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentMapC12768 concurrentMapC12768 = f59515d;
            C19550 c19550 = (C19550) concurrentMapC12768.get(numValueOf);
            if (c19550 != null) {
                return c19550;
            }
            concurrentMapC12768.putIfAbsent(numValueOf, new C19550(i));
            C19550 c19551 = (C19550) concurrentMapC12768.get(numValueOf);
            f59516e.putIfAbsent(c19551.f59521c, c19551);
            return c19551;
        }
        return new C19550(i);
    }

    public C19550(int i) {
        String string;
        this.f59520b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.f59521c = string;
    }

    @Override // p067l.AbstractC7739
    /* JADX INFO: renamed from: k */
    public final String mo17866k() {
        return this.f59521c;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.OFFSET_SECONDS;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.OFFSET_SECONDS) {
            return this.f59520b;
        }
        if (interfaceC11901 instanceof EnumC19947) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        return AbstractC7877.m18196d(this, interfaceC11901).m53121a(mo6949G(interfaceC11901), interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.OFFSET_SECONDS) {
            return this.f59520b;
        }
        if (interfaceC11901 instanceof EnumC19947) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        return interfaceC11901.mo3652C(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        return (c10500 == AbstractC7877.f20682d || c10500 == AbstractC7877.f20683e) ? this : AbstractC7877.m18195c(this, c10500);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(this.f59520b, EnumC19947.OFFSET_SECONDS);
    }

    @Override // p067l.AbstractC7739
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19550) && this.f59520b == ((C19550) obj).f59520b;
    }

    @Override // p067l.AbstractC7739
    public final int hashCode() {
        return this.f59520b;
    }

    @Override // p067l.AbstractC7739
    public final String toString() {
        return this.f59521c;
    }

    private Object writeReplace() {
        return new C21959((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p067l.AbstractC7739
    /* JADX INFO: renamed from: a0 */
    public final void mo17865a0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        m44398h0(dataOutput);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m44398h0(DataOutput dataOutput) throws IOException {
        int i = this.f59520b;
        int i2 = i % EnumC5674.f13824 == 0 ? i / EnumC5674.f13824 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static C19550 m44397g0(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? m44395e0(dataInput.readInt()) : m44395e0(b * 900);
    }
}
