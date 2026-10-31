package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19208 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        C14163 c14163 = (C14163) abstractC5698;
        C7814 c7814M16089 = abstractC5698.m16089();
        c14163.f17561 = c7814M16089;
        c7814M16089.mo16101();
        c7814M16089.f24145.mo26382(abstractC5698);
        c14163.f42767 = abstractC5698.mo16083();
        c14163.f17562 = C12780.m31093(abstractC5698.mo16083());
        c14163.m33817();
    }
}
