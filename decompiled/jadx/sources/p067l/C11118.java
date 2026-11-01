package p067l;

import com.google.android.material.badge.BadgeDrawable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.ۡ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11118 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC10288 f30834;

    public C11118(AbstractC10288 abstractC10288) {
        this.f30834 = abstractC10288;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Class clsM41004 = c18020.m41004();
        if (clsM41004 == Calendar.class || clsM41004 == GregorianCalendar.class) {
            return this.f30834;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + Calendar.class.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + GregorianCalendar.class.getName() + ",adapter=" + this.f30834 + "]";
    }
}
