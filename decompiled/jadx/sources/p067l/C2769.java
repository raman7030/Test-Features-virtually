package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2769 implements IntConsumer {
    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int iM50818 = C22711.m50818(i);
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        if (iM50818 == 0) {
            interfaceC14770Edit.remove("amfbc");
        } else {
            interfaceC14770Edit.mo27875(iM50818, "amfbc");
        }
        interfaceC14770Edit.apply();
        ServiceC20700.m46776();
    }
}
