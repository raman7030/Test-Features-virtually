package p067l;

/* JADX INFO: renamed from: l.ᩳۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19294 {

    /* JADX INFO: renamed from: ֫ */
    public final C16611 f57640;

    /* JADX INFO: renamed from: ۧ */
    public final C13221 f57641;

    /* JADX INFO: renamed from: ܽ */
    public final C17952 f57642;

    public C19294(C17952 c17952, C13221 c13221, C16611 c16611) {
        if (c17952.m40865() != c13221.m30238() || c17952.m40866() != c13221.m30239() || c16611.m37663() != c17952.m40866()) {
            throw new IllegalArgumentException("Window reuse metadata identity differs");
        }
        this.f57642 = c17952;
        this.f57641 = c13221;
        this.f57640 = c16611;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19294 m43988(C16611 c16611) {
        int iM37663 = c16611.m37663();
        C16611 c16611M37655 = this.f57640;
        if (iM37663 != c16611M37655.m37665()) {
            throw new IllegalArgumentException("Window reuse edit chain differs");
        }
        int iM37660 = c16611.m37660();
        while (true) {
            iM37660--;
            if (iM37660 >= 0) {
                c16611M37655 = c16611M37655.m37655(new C9906(c16611.m37664(iM37660), c16611.m37666(iM37660), c16611.m37658(iM37660) - c16611.m37661(iM37660)));
            } else {
                return new C19294(this.f57642, this.f57641, c16611M37655);
            }
        }
    }
}
