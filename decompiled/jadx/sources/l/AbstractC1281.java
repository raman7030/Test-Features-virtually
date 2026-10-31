package l;

/* JADX INFO: renamed from: l.֨ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1281 extends AbstractC13980 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f4507;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2609 f4508;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f4509;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1281(C11139 c11139, EnumC12075 enumC12075, C11865 c11865) {
        super(c11139, enumC12075, c11865);
        this.f4509 = c11139;
        this.f4508 = C2609.m8239();
    }

    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo4345(C2609 c2609) {
        this.f4508 = this.f4508.m8248(c2609);
        boolean z = this.f4507;
        if (z) {
            return;
        }
        this.f4507 = true;
        while (this.f4508.m8249()) {
            try {
                C2609 c26010 = this.f4508;
                C1755 c1755 = (C1755) c26010.f8240;
                this.f4508 = c26010.f8241;
                super.mo4345(C2609.of((Object) c1755));
            } catch (Throwable th) {
                this.f4507 = z;
                throw th;
            }
        }
        this.f4507 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4344(C14163 c14163, C1755 c1755) {
        C19955 c19955 = (C19955) c14163.f17560;
        C11139 c11139 = this.f4509;
        C12048 c12048 = new C12048(262160L, c11139.f33438.f18886, c14163.f17560, c14163);
        c12048.f36040 = 0;
        Object obj = c1755.f6073;
        ((C8604) obj).f26285.mo26382(c12048);
        if ((c14163.f17563 & 512) == 0 && c19955.f64618.m12913(EnumC9454.CLASS)) {
            C12048 c12049 = new C12048(262160L, c11139.f33438.f18898, c19955.f64618, c14163);
            c12049.f36040 = 0;
            ((C8604) obj).f26285.mo26382(c12049);
        }
    }
}
