package l;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16405 implements Function {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50471;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50472;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50473;

    public /* synthetic */ C16405(int i, Object obj, Object obj2) {
        this.f50472 = i;
        this.f50473 = obj;
        this.f50471 = obj2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f50472) {
            case 0:
                C9310 c9310 = (C9310) this.f50473;
                Iterator it = (Iterator) this.f50471;
                return c9310.f28214.m36202((InterfaceC3109) it.next(), (AbstractC4308) obj);
            default:
                return ((AbstractC14371) obj).mo5675((AbstractC4308) this.f50473, (AbstractC4308) this.f50471);
        }
    }
}
