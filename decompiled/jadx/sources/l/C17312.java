package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATH */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17312 implements InterfaceC23662 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23662 f53022;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23662 f53023;

    public /* synthetic */ C17312(InterfaceC23662 interfaceC23662, InterfaceC23662 interfaceC23663) {
        this.f53022 = interfaceC23662;
        this.f53023 = interfaceC23663;
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C14489.m34588(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo18326((Character) obj);
    }

    @Override // l.InterfaceC23662
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo18326(Character ch) {
        C14489.m34589((InterfaceC23662) this, ch);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C14489.m34587((InterfaceC23662) this, intConsumer);
    }

    @Override // l.InterfaceC23662
    /* JADX INFO: renamed from: ܽ */
    public final C17312 mo18327(InterfaceC23662 interfaceC23662) {
        return new C17312(this, interfaceC23662);
    }

    @Override // l.InterfaceC23662
    /* JADX INFO: renamed from: ܽ */
    public final void mo18328(char c) {
        this.f53022.mo18328(c);
        this.f53023.mo18328(c);
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
