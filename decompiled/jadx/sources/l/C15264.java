package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15264 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46845;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46846;

    public /* synthetic */ C15264(int i, Object obj) {
        this.f46845 = i;
        this.f46846 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i = this.f46845;
        Object obj2 = this.f46846;
        switch (i) {
            case 0:
                C22986 c22986 = ((C11738) obj2).f35026.f41206;
                EnumC11698 enumC11698 = EnumC11698.HEADER;
                c22986.getClass();
                c22986.f74006.f20042 = (C15869) obj;
                break;
            default:
                ((ArrayList) obj2).add((InterfaceC1800) obj);
                break;
        }
    }
}
