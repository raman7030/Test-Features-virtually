package p067l;

import java.util.Comparator;
import org.bouncycastle.math.p080ec.ECFieldElement;

/* JADX INFO: renamed from: l.᩻ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CK5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25053 implements InterfaceC9934, InterfaceC18263 {
    /* JADX INFO: renamed from: ֫ */
    public static int m54989(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ECFieldElement m54991(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        return (C15936) obj;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public void m54992(String str) {
        C19553.m44409();
        C16114.m36688(str, true);
        C18211.m41420();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Comparator m54990(InterfaceC8960 interfaceC8960, Comparator comparator) {
        return comparator instanceof InterfaceC8960 ? interfaceC8960.mo20698((InterfaceC8960) comparator) : C10162.$default$thenComparing(interfaceC8960, comparator);
    }
}
