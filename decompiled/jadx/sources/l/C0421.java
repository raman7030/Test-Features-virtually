package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0421 implements IntConsumer {
    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int iM48482 = C21404.m48482(i);
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        if (iM48482 == 0) {
            interfaceC13049Edit.remove("amfbc");
        } else {
            interfaceC13049Edit.mo25853(iM48482, "amfbc");
        }
        interfaceC13049Edit.apply();
        ServiceC19288.m44482();
    }
}
