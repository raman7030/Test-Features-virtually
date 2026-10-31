package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15782 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f48630;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f48633;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16646 f48632 = C16646.empty();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2609 f48631 = C2609.m8239();

    public AbstractC15782(C10139 c10139, EnumC18550 enumC18550) {
        this.f48630 = c10139;
        this.f48633 = c10139.m25482(enumC18550);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 m37193(Predicate predicate) {
        return (C0758) C16958.of((Object[]) this.f48632.orElseGet(new Supplier() { // from class: l.ۢ۟֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC15782.m37192(this.f28615);
            }
        })).filter(predicate).findFirst().orElse(this.f48630.f30517);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0758[] m37192(AbstractC15782 abstractC15782) {
        C0758[] c0758Arr = (C0758[]) C5378.stream(abstractC15782.f48631).map(new C16571(1)).toArray(new C8728());
        abstractC15782.f48632 = C16646.of(c0758Arr);
        abstractC15782.f48631 = null;
        return c0758Arr;
    }
}
