package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩸ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21360 extends C2310 {
    public final char g;
    public final int h;

    @Override // l.C2310, l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        return f(c3015.a.b).m(c3015, charSequence, i);
    }

    @Override // l.C2310, l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        return f(c10071.b.b).l(c10071, sb);
    }

    public C21360(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, EnumC23476.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // l.C2310
    public final C2310 d() {
        if (this.e == -1) {
            return this;
        }
        return new C21360(this.g, this.h, this.b, this.c, -1);
    }

    @Override // l.C2310
    public final C2310 e(int i) {
        return new C21360(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final C2310 f(Locale locale) {
        C13556 c13556;
        ConcurrentMapC10942 concurrentMapC10942 = C7207.g;
        C11003.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        C7207 c7207A = C7207.a(EnumC21878.a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + EnumC21878.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            c13556 = c7207A.d;
        } else {
            if (c == 'Y') {
                C13556 c13557 = c7207A.f;
                int i = this.h;
                if (i == 2) {
                    return new C0898(c13557, 2, 2, C0898.h, this.e);
                }
                return new C2310(c13557, i, 19, i < 4 ? EnumC23476.NORMAL : EnumC23476.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                c13556 = c7207A.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                c13556 = c7207A.e;
            }
        }
        return new C2310(c13556, this.b, this.c, EnumC23476.NOT_NEGATIVE, this.e);
    }

    @Override // l.C2310
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? EnumC23476.NORMAL : EnumC23476.EXCEEDS_PAD);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
