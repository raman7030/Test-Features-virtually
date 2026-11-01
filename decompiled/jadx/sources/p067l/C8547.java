package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۜۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8547 implements InterfaceC13912, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C8547 f22959d = new C8547(0, 0, 0);
    public static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a */
    public final int f22960a;

    /* JADX INFO: renamed from: b */
    public final int f22961b;

    /* JADX INFO: renamed from: c */
    public final int f22962c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC24029.m53212B(new Object[]{EnumC10559.YEARS, EnumC10559.MONTHS, EnumC10559.DAYS});
    }

    /* JADX INFO: renamed from: a */
    public static C8547 m19933a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return f22959d;
        }
        return new C8547(i, i2, i3);
    }

    public C8547(int i, int i2, int i3) {
        this.f22960a = i;
        this.f22961b = i2;
        this.f22962c = i3;
    }

    @Override // p067l.InterfaceC13912
    /* JADX INFO: renamed from: l */
    public final InterfaceC17263 mo10794l(InterfaceC17263 interfaceC17263) {
        C12826.requireNonNull(interfaceC17263, "temporal");
        InterfaceC4997 interfaceC4997 = (InterfaceC4997) interfaceC17263.mo6950T(AbstractC7877.f20680b);
        if (interfaceC4997 == null || C10361.f28676c.equals(interfaceC4997)) {
            int i = this.f22961b;
            if (i != 0) {
                long j = (((long) this.f22960a) * 12) + ((long) i);
                if (j != 0) {
                    interfaceC17263 = interfaceC17263.mo7153d(j, EnumC10559.MONTHS);
                }
            } else {
                int i2 = this.f22960a;
                if (i2 != 0) {
                    interfaceC17263 = interfaceC17263.mo7153d(i2, EnumC10559.YEARS);
                }
            }
            int i3 = this.f22962c;
            return i3 != 0 ? interfaceC17263.mo7153d(i3, EnumC10559.DAYS) : interfaceC17263;
        }
        throw new C17796("Chronology mismatch, expected: ISO, actual: " + interfaceC4997.mo10584k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8547) {
            C8547 c8547 = (C8547) obj;
            if (this.f22960a == c8547.f22960a && this.f22961b == c8547.f22961b && this.f22962c == c8547.f22962c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f22962c, 16) + Integer.rotateLeft(this.f22961b, 8) + this.f22960a;
    }

    public final String toString() {
        if (this == f22959d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f22960a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f22961b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f22962c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21959(C0698cb.f2570l, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
