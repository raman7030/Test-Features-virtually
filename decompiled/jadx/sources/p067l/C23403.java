package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public class C23403 extends AbstractC5298 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C12004 f74549;

    /* JADX INFO: renamed from: ۬ */
    public Predicate f74550;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f74550.test(this.f74549.m27499((AbstractC6462) obj));
    }

    public C23403(C12004 c12004, EnumC19998 enumC19998) {
        this(c12004, enumC19998, new C3572(2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23403(C12004 c12004, EnumC19998 enumC19998, Predicate predicate) {
        super(c12004, enumC19998);
        this.f74549 = c12004;
        this.f74550 = predicate;
    }

    @Override // p067l.AbstractC5298
    /* JADX INFO: renamed from: ֫ */
    public C3088 mo11457(AbstractC6462 abstractC6462) {
        return m39363(new C6639(this, this.f74549.m27499(abstractC6462)));
    }
}
