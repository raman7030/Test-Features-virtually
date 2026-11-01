package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATH */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18822 implements InterfaceC24857 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC24857 f56203;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC24857 f56204;

    public /* synthetic */ C18822(InterfaceC24857 interfaceC24857, InterfaceC24857 interfaceC24858) {
        this.f56203 = interfaceC24857;
        this.f56204 = interfaceC24858;
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C16139.m36729(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo20274((Character) obj);
    }

    @Override // p067l.InterfaceC24857
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo20274(Character ch) {
        C16139.m36730((InterfaceC24857) this, ch);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C16139.m36728((InterfaceC24857) this, intConsumer);
    }

    @Override // p067l.InterfaceC24857
    /* JADX INFO: renamed from: ܽ */
    public final C18822 mo20275(InterfaceC24857 interfaceC24857) {
        return new C18822(this, interfaceC24857);
    }

    @Override // p067l.InterfaceC24857
    /* JADX INFO: renamed from: ܽ */
    public final void mo20276(char c) {
        this.f56203.mo20276(c);
        this.f56204.mo20276(c);
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
