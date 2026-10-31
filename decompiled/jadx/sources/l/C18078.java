package l;

import com.google.android.material.badge.BadgeDrawable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ᩳ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18078 extends AbstractC5650 implements InterfaceC2268, InterfaceC2974, Comparable {
    public static final ConcurrentMapC10942 d = new ConcurrentMapC10942(16, 0.75f, 4);
    public static final ConcurrentMapC10942 e = new ConcurrentMapC10942(16, 0.75f, 4);
    public static final C18078 f = e0(0);
    public static final C18078 g = e0(-64800);
    public static final C18078 h = e0(64800);
    public static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C18078) obj).b - this.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static C18078 c0(String str) {
        int iF0;
        int iF1;
        int iF2;
        char cCharAt;
        C11003.requireNonNull(str, "offsetId");
        C18078 c18078 = (C18078) e.get(str);
        if (c18078 != null) {
            return c18078;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iF0 = f0(str, 1, false);
                    iF1 = f0(str, 3, false);
                } else {
                    if (length == 6) {
                        iF0 = f0(str, 1, false);
                        iF1 = f0(str, 4, true);
                    } else if (length == 7) {
                        iF0 = f0(str, 1, false);
                        iF1 = f0(str, 3, false);
                        iF2 = f0(str, 5, false);
                    } else if (length == 9) {
                        iF0 = f0(str, 1, false);
                        iF1 = f0(str, 4, true);
                        iF2 = f0(str, 7, true);
                    } else {
                        throw new C16232("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new C16232("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                    }
                    if (cCharAt == '-') {
                        return d0(-iF0, -iF1, -iF2);
                    }
                    return d0(iF0, iF1, iF2);
                }
            }
            iF2 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt == '+') {
            }
            if (cCharAt == '-') {
                return d0(-iF0, -iF1, -iF2);
            }
            return d0(iF0, iF1, iF2);
        }
        iF0 = f0(str, 1, false);
        iF1 = 0;
        iF2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return d0(-iF0, -iF1, -iF2);
        }
        return d0(iF0, iF1, iF2);
    }

    @Override // l.AbstractC5650
    public final C15960 W() {
        C11003.requireNonNull(this, "offset");
        return new C15960(this);
    }

    public static int f0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new C16232("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new C16232("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static C18078 b0(InterfaceC2268 interfaceC2268) {
        C11003.requireNonNull(interfaceC2268, "temporal");
        C18078 c18078 = (C18078) interfaceC2268.T(AbstractC5796.d);
        if (c18078 != null) {
            return c18078;
        }
        throw new C16232("Unable to obtain ZoneOffset from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName());
    }

    public static C18078 d0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C16232("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C16232("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C16232("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C16232("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C16232("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C16232("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return e0((i2 * 60) + (i * 3600) + i3);
        }
        throw new C16232("Zone offset not in valid range: -18:00 to +18:00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C18078 e0(int i) {
        if (i < -64800 || i > 64800) {
            throw new C16232("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % EnumC3478.f11019 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentMapC10942 concurrentMapC10942 = d;
            C18078 c18078 = (C18078) concurrentMapC10942.get(numValueOf);
            if (c18078 != null) {
                return c18078;
            }
            concurrentMapC10942.putIfAbsent(numValueOf, new C18078(i));
            C18078 c18079 = (C18078) concurrentMapC10942.get(numValueOf);
            e.putIfAbsent(c18079.c, c18079);
            return c18079;
        }
        return new C18078(i);
    }

    public C18078(int i) {
        String string;
        this.b = i;
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
        this.c = string;
    }

    @Override // l.AbstractC5650
    public final String k() {
        return this.c;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.OFFSET_SECONDS;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return AbstractC5796.d(this, interfaceC10030).a(G(interfaceC10030), interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        return (c8556 == AbstractC5796.d || c8556 == AbstractC5796.e) ? this : AbstractC5796.c(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(this.b, EnumC18496.OFFSET_SECONDS);
    }

    @Override // l.AbstractC5650
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18078) && this.b == ((C18078) obj).b;
    }

    @Override // l.AbstractC5650
    public final int hashCode() {
        return this.b;
    }

    @Override // l.AbstractC5650
    public final String toString() {
        return this.c;
    }

    private Object writeReplace() {
        return new C20613((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.AbstractC5650
    public final void a0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        h0(dataOutput);
    }

    public final void h0(DataOutput dataOutput) throws IOException {
        int i = this.b;
        int i2 = i % EnumC3478.f11019 == 0 ? i / EnumC3478.f11019 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static C18078 g0(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? e0(dataInput.readInt()) : e0(b * 900);
    }
}
