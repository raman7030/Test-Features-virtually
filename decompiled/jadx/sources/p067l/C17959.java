package p067l;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17959 implements Function {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f53643;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f53644;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f53645;

    public /* synthetic */ C17959(int i, Object obj, Object obj2) {
        this.f53644 = i;
        this.f53645 = obj;
        this.f53643 = obj2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f53644) {
            case 0:
                C11216 c11216 = (C11216) this.f53645;
                Iterator it = (Iterator) this.f53643;
                return c11216.f31163.m38363((InterfaceC5323) it.next(), (AbstractC6462) obj);
            default:
                return ((AbstractC16026) obj).mo7905((AbstractC6462) this.f53645, (AbstractC6462) this.f53643);
        }
    }
}
