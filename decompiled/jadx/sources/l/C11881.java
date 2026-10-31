package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ۨᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11881 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12586 f35420;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f35421;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f35422;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f35423;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f35424;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f35425;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Uri f35426;

    public C11881(Uri uri, String str, C12586 c12586, List list, AbstractC14545 abstractC14545, Object obj, long j) {
        this.f35426 = uri;
        this.f35423 = C9786.m24800(str);
        this.f35420 = c12586;
        this.f35425 = list;
        this.f35424 = abstractC14545;
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        for (int i2 = 0; i2 < abstractC14545.size(); i2++) {
            C2024 c2024 = (C2024) abstractC14545.get(i2);
            c2024.getClass();
            c1846.m16264(new C13996(new C7647(c2024)));
        }
        c1846.m6131();
        this.f35422 = obj;
        this.f35421 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11881)) {
            return false;
        }
        C11881 c11881 = (C11881) obj;
        return this.f35426.equals(c11881.f35426) && C11003.equals(this.f35423, c11881.f35423) && C11003.equals(this.f35420, c11881.f35420) && this.f35425.equals(c11881.f35425) && this.f35424.equals(c11881.f35424) && C11003.equals(this.f35422, c11881.f35422) && this.f35421 == c11881.f35421;
    }

    public final int hashCode() {
        int iHashCode = this.f35426.hashCode() * 31;
        String str = this.f35423;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C12586 c12586 = this.f35420;
        int iHashCode3 = (this.f35424.hashCode() + ((this.f35425.hashCode() + ((iHashCode2 + (c12586 == null ? 0 : c12586.hashCode())) * 961)) * 961)) * 31;
        Object obj = this.f35422;
        return (int) ((((long) (iHashCode3 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f35421);
    }

    static {
        C5368.m15341(0, 1, 2, 3, 4);
        C3603.m11056(5);
        C3603.m11056(6);
        C3603.m11056(7);
    }
}
