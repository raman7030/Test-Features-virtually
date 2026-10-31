package l;

import com.google.android.material.badge.BadgeDrawable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.ۡ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C9206 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f27888;

    public C9206(AbstractC8333 abstractC8333) {
        this.f27888 = abstractC8333;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class clsM38778 = c16469.m38778();
        if (clsM38778 == Calendar.class || clsM38778 == GregorianCalendar.class) {
            return this.f27888;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + Calendar.class.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + GregorianCalendar.class.getName() + ",adapter=" + this.f27888 + "]";
    }
}
