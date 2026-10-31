package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20877 extends AbstractC21315 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16724 f67561;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f67562;

    public C20877(Iterable iterable, InterfaceC16724 interfaceC16724) {
        this.f67562 = iterable;
        this.f67561 = interfaceC16724;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18760(this.f67562.iterator(), this.f67561);
    }
}
