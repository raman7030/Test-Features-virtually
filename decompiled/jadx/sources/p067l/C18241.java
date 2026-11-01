package p067l;

import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܽܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18241 implements InterfaceC9934, InterfaceC18263, InterfaceC24686 {
    /* JADX INFO: renamed from: ֫ */
    public static String m41502(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return str + algorithmParameterSpec;
    }

    @Override // p067l.InterfaceC24686
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        return ((InterfaceC3669) obj).mo7081().getClass().getSimpleName();
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
