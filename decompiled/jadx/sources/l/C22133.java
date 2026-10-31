package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public class C22133 extends AbstractC3083 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f71827;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Predicate f71828;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f71828.test(this.f71827.m25480((AbstractC4308) obj));
    }

    public C22133(C10139 c10139, EnumC18550 enumC18550) {
        this(c10139, enumC18550, new C1266(2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22133(C10139 c10139, EnumC18550 enumC18550, Predicate predicate) {
        super(c10139, enumC18550);
        this.f71827 = c10139;
        this.f71828 = predicate;
    }

    @Override // l.AbstractC3083
    /* JADX INFO: renamed from: ֫ */
    public C0758 mo9414(AbstractC4308 abstractC4308) {
        return m37193(new C4494(this, this.f71827.m25480(abstractC4308)));
    }
}
