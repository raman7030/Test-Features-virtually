package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58MT */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C4770 extends AbstractC9277 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C8298 f15131;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C3104 f15132;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C11197 f15133;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f15134;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0486 f15135;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f15137;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C8353 f15139;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f15136 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean f15138 = true;

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ۧ */
    public final void mo9823() {
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9824() {
    }

    public C4770(C2024 c2024, InterfaceC15097 interfaceC15097, InterfaceC11058 interfaceC11058) {
        this.f15134 = interfaceC15097;
        this.f15137 = interfaceC11058;
        C22464 c22464 = new C22464();
        c22464.m50395(Uri.EMPTY);
        c22464.m50397(c2024.f6754.toString());
        c22464.m50398((List) AbstractC14545.of((Object) c2024));
        c22464.m50396((Object) null);
        C11197 c11197M50394 = c22464.m50394();
        this.f15133 = c11197M50394;
        C1297 c1297 = new C1297();
        c1297.m4465((String) C16018.m37870(c2024.f6753, "text/x-unknown"));
        c1297.m4471(c2024.f6751);
        c1297.m4466(c2024.f6750);
        c1297.m4454(c2024.f6752);
        c1297.m4473(c2024.f6749);
        String str = c2024.f6748;
        c1297.m4469(str != null ? str : null);
        this.f15139 = c1297.m4440();
        C4515 c4515 = new C4515();
        c4515.m13281(c2024.f6754);
        c4515.m13279(1);
        this.f15132 = c4515.m13278();
        this.f15131 = new C8298(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, c11197M50394, null);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final C11197 mo9817() {
        return this.f15133;
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ֫ */
    public final void mo9820(InterfaceC0486 interfaceC0486) {
        this.f15135 = interfaceC0486;
        m23794(this.f15131);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9546 mo9816(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        return new C22409(this.f15132, this.f15134, this.f15135, this.f15139, this.f15136, this.f15137, m23797(c15894), this.f15138, null);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo9821(InterfaceC9546 interfaceC9546) {
        ((C22409) interfaceC9546).f72624.m23064((InterfaceC6824) null);
    }
}
