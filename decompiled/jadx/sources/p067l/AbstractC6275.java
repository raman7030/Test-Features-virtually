package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9QQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6275 implements InterfaceC17832 {

    /* JADX INFO: renamed from: ᩸ */
    public String f15874;

    /* JADX INFO: renamed from: ᩹ */
    public String f15875;

    public AbstractC6275(String str, String str2) {
        this.f15875 = str;
        this.f15874 = str2;
    }

    @Override // p067l.InterfaceC17832
    public final String getName() {
        return this.f15875;
    }

    @Override // p067l.InterfaceC17832
    /* JADX INFO: renamed from: ᩴۧ */
    public final String mo14244() {
        return this.f15874;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m14243() {
        return new C13651(mo4679(), new InterfaceC14680() { // from class: l.ۖᩳܽ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C5293.m11447(this, obj);
            }

            @Override // p067l.InterfaceC14680
            public final Object get(int i) {
                return this.f11235.mo4678(i);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ Object get(Object obj) {
                return C5293.m11448(this, obj);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ֫ */
            public final /* synthetic */ boolean mo4793(int i) {
                return true;
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ Object mo4687() {
                return null;
            }

            @Override // p067l.InterfaceC14680, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4686(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // p067l.InterfaceC14680
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC17832 interfaceC17832 = (InterfaceC17832) interfaceC10457;
        if (!C12826.equals(this.f15875, interfaceC17832.getName())) {
            throw new RuntimeException();
        }
        if (!C12826.equals(this.f15874, interfaceC17832.mo14244())) {
            throw new RuntimeException();
        }
        if (mo4679() != interfaceC17832.mo4679()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo4679(); i++) {
            mo4678(i).mo14241(interfaceC17832.mo4678(i));
        }
    }

    @Override // p067l.InterfaceC17832
    /* JADX INFO: renamed from: ܶ֫ */
    public Iterable mo14242() {
        return m14243();
    }
}
