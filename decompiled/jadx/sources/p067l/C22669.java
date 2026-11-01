package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩸ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22669 extends C4564 {

    /* JADX INFO: renamed from: g */
    public final char f71501g;

    /* JADX INFO: renamed from: h */
    public final int f71502h;

    @Override // p067l.C4564, p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        return m50733f(c5234.f12334a.f22322b).mo9637m(c5234, charSequence, i);
    }

    @Override // p067l.C4564, p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        return m50733f(c11940.f33254b.f22322b).mo9636l(c11940, sb);
    }

    public C22669(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, EnumC24680.NOT_NEGATIVE, i4);
        this.f71501g = c;
        this.f71502h = i;
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: d */
    public final C4564 mo5563d() {
        if (this.f10236e == -1) {
            return this;
        }
        return new C22669(this.f71501g, this.f71502h, this.f10233b, this.f10234c, -1);
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: e */
    public final C4564 mo5564e(int i) {
        return new C22669(this.f71501g, this.f71502h, this.f10233b, this.f10234c, this.f10236e + i);
    }

    /* JADX INFO: renamed from: f */
    public final C4564 m50733f(Locale locale) {
        C15252 c15252;
        ConcurrentMapC12768 concurrentMapC12768 = C9218.f24936g;
        C12826.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        C9218 c9218M21237a = C9218.m21237a(EnumC23162.f72771a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + EnumC23162.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c = this.f71501g;
        if (c == 'W') {
            c15252 = c9218M21237a.f24941d;
        } else {
            if (c == 'Y') {
                C15252 c15253 = c9218M21237a.f24943f;
                int i = this.f71502h;
                if (i == 2) {
                    return new C3222(c15253, 2, 2, C3222.f6245h, this.f10236e);
                }
                return new C4564(c15253, i, 19, i < 4 ? EnumC24680.NORMAL : EnumC24680.EXCEEDS_PAD, this.f10236e);
            }
            if (c == 'c' || c == 'e') {
                c15252 = c9218M21237a.f24940c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                c15252 = c9218M21237a.f24942e;
            }
        }
        return new C4564(c15252, this.f10233b, this.f10234c, EnumC24680.NOT_NEGATIVE, this.f10236e);
    }

    @Override // p067l.C4564
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.f71502h;
        char c = this.f71501g;
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
            sb.append(i < 4 ? EnumC24680.NORMAL : EnumC24680.EXCEEDS_PAD);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
