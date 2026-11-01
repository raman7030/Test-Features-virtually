package p067l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16875 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f49969;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f49970;

    public /* synthetic */ C16875(int i, Object obj) {
        this.f49969 = i;
        this.f49970 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        int i = this.f49969;
        Object obj2 = this.f49970;
        switch (i) {
            case 0:
                C24214 c24214 = ((C13524) obj2).f38026.f44284;
                EnumC13486 enumC13486 = EnumC13486.HEADER;
                c24214.getClass();
                c24214.f76741.f22916 = (C17450) obj;
                break;
            default:
                ((ArrayList) obj2).add((InterfaceC4079) obj);
                break;
        }
    }
}
