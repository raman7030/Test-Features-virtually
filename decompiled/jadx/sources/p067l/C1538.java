package p067l;

import android.app.Person;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.ܰ᩶ */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1538 {

    /* JADX INFO: renamed from: ֫ */
    public C1073 f45513;

    /* JADX INFO: renamed from: ۧ */
    public boolean f45514;

    /* JADX INFO: renamed from: ܳ */
    public String f45515;

    /* JADX INFO: renamed from: ܽ */
    public boolean f45516;

    /* JADX INFO: renamed from: ܿ */
    public CharSequence f45517;

    /* JADX INFO: renamed from: ᩳ */
    public String f45518;

    /* JADX INFO: renamed from: ֫ */
    public static C1538 m35768(PersistableBundle persistableBundle) {
        return C1433.m31135(persistableBundle);
    }

    /* JADX INFO: renamed from: ۧ */
    public final PersistableBundle m35770() {
        return C1433.m31134(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Person m35769() {
        return C1993.m53898(this);
    }

    public final int hashCode() {
        String str = this.f45518;
        return str != null ? str.hashCode() : C12826.hash(this.f45517, this.f45515, Boolean.valueOf(this.f45514), Boolean.valueOf(this.f45516));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1538)) {
            return false;
        }
        C1538 c1538 = (C1538) obj;
        String str = this.f45518;
        String str2 = c1538.f45518;
        if (str == null && str2 == null) {
            return C12826.equals(C12826.toString(this.f45517), C12826.toString(c1538.f45517)) && C12826.equals(this.f45515, c1538.f45515) && Boolean.valueOf(this.f45514).equals(Boolean.valueOf(c1538.f45514)) && Boolean.valueOf(this.f45516).equals(Boolean.valueOf(c1538.f45516));
        }
        return C12826.equals(str, str2);
    }
}
