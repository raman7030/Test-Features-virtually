package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2C5O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6729 implements InterfaceC23662 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f20910;

    public /* synthetic */ C6729(Consumer consumer) {
        this.f20910 = consumer;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo18326(Character ch) {
        C14489.m34589((InterfaceC23662) this, ch);
    }

    @Override // l.InterfaceC23662
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo18328(char c) {
        this.f20910.accept(Character.valueOf(c));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C14489.m34587((InterfaceC23662) this, intConsumer);
    }

    @Override // l.InterfaceC23662
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17312 mo18327(InterfaceC23662 interfaceC23662) {
        return new C17312(this, interfaceC23662);
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
