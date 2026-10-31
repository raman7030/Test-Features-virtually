package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18760 extends AbstractC9568 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16724 f59267;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18760(Iterator it, InterfaceC16724 interfaceC16724) {
        super(it);
        this.f59267 = interfaceC16724;
    }

    @Override // l.AbstractC9568
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5897(Object obj) {
        return this.f59267.apply(obj);
    }
}
