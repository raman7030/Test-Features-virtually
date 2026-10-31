package l;

import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܽܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16701 implements InterfaceC7961, InterfaceC16724, InterfaceC23483 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39266(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return str + algorithmParameterSpec;
    }

    @Override // l.InterfaceC23483
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        return ((InterfaceC1368) obj).mo4843().getClass().getSimpleName();
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
