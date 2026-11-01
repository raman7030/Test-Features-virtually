package p067l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ۨᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13660 {

    /* JADX INFO: renamed from: ֫ */
    public final C14330 f38430;

    /* JADX INFO: renamed from: ۧ */
    public final long f38431;

    /* JADX INFO: renamed from: ܳ */
    public final Object f38432;

    /* JADX INFO: renamed from: ܽ */
    public final String f38433;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC16192 f38434;

    /* JADX INFO: renamed from: ᩳ */
    public final List f38435;

    /* JADX INFO: renamed from: ᩻ */
    public final Uri f38436;

    public C13660(Uri uri, String str, C14330 c14330, List list, AbstractC16192 abstractC16192, Object obj, long j) {
        this.f38436 = uri;
        this.f38433 = C11669.m26815(str);
        this.f38430 = c14330;
        this.f38435 = list;
        this.f38434 = abstractC16192;
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        for (int i2 = 0; i2 < abstractC16192.size(); i2++) {
            C4292 c4292 = (C4292) abstractC16192.get(i2);
            c4292.getClass();
            c4123.m18184(new C15670(new C9636(c4292)));
        }
        c4123.m8329();
        this.f38432 = obj;
        this.f38431 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13660)) {
            return false;
        }
        C13660 c13660 = (C13660) obj;
        return this.f38436.equals(c13660.f38436) && C12826.equals(this.f38433, c13660.f38433) && C12826.equals(this.f38430, c13660.f38430) && this.f38435.equals(c13660.f38435) && this.f38434.equals(c13660.f38434) && C12826.equals(this.f38432, c13660.f38432) && this.f38431 == c13660.f38431;
    }

    public final int hashCode() {
        int iHashCode = this.f38436.hashCode() * 31;
        String str = this.f38433;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C14330 c14330 = this.f38430;
        int iHashCode3 = (this.f38434.hashCode() + ((this.f38435.hashCode() + ((iHashCode2 + (c14330 == null ? 0 : c14330.hashCode())) * 961)) * 961)) * 31;
        Object obj = this.f38432;
        return (int) ((((long) (iHashCode3 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f38431);
    }

    static {
        C7470.m17250(0, 1, 2, 3, 4);
        C5792.m13032(5);
        C5792.m13032(6);
        C5792.m13032(7);
    }
}
