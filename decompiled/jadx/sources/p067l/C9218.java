package p067l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9218 implements Serializable {

    /* JADX INFO: renamed from: g */
    public static final ConcurrentMapC12768 f24936g = new ConcurrentMapC12768(4, 0.75f, 2);

    /* JADX INFO: renamed from: h */
    public static final EnumC22630 f24937h;
    public static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a */
    public final EnumC23162 f24938a;

    /* JADX INFO: renamed from: b */
    public final int f24939b;

    /* JADX INFO: renamed from: c */
    public final transient C15252 f24940c;

    /* JADX INFO: renamed from: d */
    public final transient C15252 f24941d;

    /* JADX INFO: renamed from: e */
    public final transient C15252 f24942e;

    /* JADX INFO: renamed from: f */
    public final transient C15252 f24943f;

    static {
        new C9218(EnumC23162.MONDAY, 4);
        m21237a(EnumC23162.SUNDAY, 1);
        f24937h = AbstractC23300.f73305d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C9218 m21237a(EnumC23162 enumC23162, int i) {
        String str = enumC23162.toString() + i;
        ConcurrentMapC12768 concurrentMapC12768 = f24936g;
        C9218 c9218 = (C9218) concurrentMapC12768.get(str);
        if (c9218 != null) {
            return c9218;
        }
        concurrentMapC12768.putIfAbsent(str, new C9218(enumC23162, i));
        return (C9218) concurrentMapC12768.get(str);
    }

    public C9218(EnumC23162 enumC23162, int i) {
        EnumC10559 enumC10559 = EnumC10559.DAYS;
        EnumC10559 enumC105510 = EnumC10559.WEEKS;
        this.f24940c = new C15252("DayOfWeek", this, enumC10559, enumC105510, C15252.f43531f);
        this.f24941d = new C15252("WeekOfMonth", this, enumC105510, EnumC10559.MONTHS, C15252.f43532g);
        EnumC22630 enumC22630 = AbstractC23300.f73305d;
        this.f24942e = new C15252("WeekOfWeekBasedYear", this, enumC105510, enumC22630, C15252.f43534i);
        this.f24943f = new C15252("WeekBasedYear", this, enumC22630, EnumC10559.FOREVER, EnumC19947.YEAR.f60552b);
        C12826.requireNonNull(enumC23162, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f24938a = enumC23162;
        this.f24939b = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f24938a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.f24939b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return m21237a(this.f24938a, this.f24939b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9218) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f24938a.ordinal() * 7) + this.f24939b;
    }

    public final String toString() {
        return "WeekFields[" + this.f24938a + "," + this.f24939b + "]";
    }
}
