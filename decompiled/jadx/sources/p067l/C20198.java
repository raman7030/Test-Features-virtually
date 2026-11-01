package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20198 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC18263 f62490;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20198(Iterator it, InterfaceC18263 interfaceC18263) {
        super(it);
        this.f62490 = interfaceC18263;
    }

    @Override // p067l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8107(Object obj) {
        return this.f62490.apply(obj);
    }
}
