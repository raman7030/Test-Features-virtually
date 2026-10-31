package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7207 implements Serializable {
    public static final ConcurrentMapC10942 g = new ConcurrentMapC10942(4, 0.75f, 2);
    public static final EnumC21319 h;
    public static final long serialVersionUID = -1177360819670808121L;
    public final EnumC21878 a;
    public final int b;
    public final transient C13556 c;
    public final transient C13556 d;
    public final transient C13556 e;
    public final transient C13556 f;

    static {
        new C7207(EnumC21878.MONDAY, 4);
        a(EnumC21878.SUNDAY, 1);
        h = AbstractC22024.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C7207 a(EnumC21878 enumC21878, int i) {
        String str = enumC21878.toString() + i;
        ConcurrentMapC10942 concurrentMapC10942 = g;
        C7207 c7207 = (C7207) concurrentMapC10942.get(str);
        if (c7207 != null) {
            return c7207;
        }
        concurrentMapC10942.putIfAbsent(str, new C7207(enumC21878, i));
        return (C7207) concurrentMapC10942.get(str);
    }

    public C7207(EnumC21878 enumC21878, int i) {
        EnumC8618 enumC8618 = EnumC8618.DAYS;
        EnumC8618 enumC8619 = EnumC8618.WEEKS;
        this.c = new C13556("DayOfWeek", this, enumC8618, enumC8619, C13556.f);
        this.d = new C13556("WeekOfMonth", this, enumC8619, EnumC8618.MONTHS, C13556.g);
        EnumC21319 enumC21319 = AbstractC22024.d;
        this.e = new C13556("WeekOfWeekBasedYear", this, enumC8619, enumC21319, C13556.i);
        this.f = new C13556("WeekBasedYear", this, enumC21319, EnumC8618.FOREVER, EnumC18496.YEAR.b);
        C11003.requireNonNull(enumC21878, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = enumC21878;
        this.b = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7207) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
