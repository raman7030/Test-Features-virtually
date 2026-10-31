package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes4.dex */
public class C11102 extends AbstractC13717 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1929 f33325;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public String mo8292() {
        return "array";
    }

    public C11102(C1929 c1929) {
        c1929.m43732();
        this.f33325 = c1929;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11102)) {
            return false;
        }
        return this.f33325.equals(((C11102) obj).f33325);
    }

    public int hashCode() {
        return this.f33325.hashCode();
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public int mo2228(AbstractC13717 abstractC13717) {
        return this.f33325.compareTo(((C11102) abstractC13717).f33325);
    }

    public String toString() {
        return this.f33325.m40979("array{");
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public String mo2463() {
        return this.f33325.m40980("{", l.d);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1929 m27534() {
        return this.f33325;
    }
}
