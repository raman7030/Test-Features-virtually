package l;

import java.util.Comparator;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: renamed from: l.᩻ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CK5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23868 implements InterfaceC7961, InterfaceC16724 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52580(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ECFieldElement m52582(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        return (C14276) obj;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m52583(String str) {
        C18081.m42150();
        C14463.m34554(str, true);
        C16669.m39185();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Comparator m52581(InterfaceC6935 interfaceC6935, Comparator comparator) {
        return comparator instanceof InterfaceC6935 ? interfaceC6935.mo18748((InterfaceC6935) comparator) : C8200.$default$thenComparing(interfaceC6935, comparator);
    }
}
