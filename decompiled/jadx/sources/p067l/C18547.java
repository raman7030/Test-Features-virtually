package p067l;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: renamed from: l.ܿ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18547 implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC16653 f55376;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] f55377;

    public C18547(InterfaceC16653 interfaceC16653, byte[] bArr) {
        this.f55376 = interfaceC16653;
        this.f55377 = bArr;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        byte[] bArr = this.f55377;
        return this.f55376.mo16429(bArr == null ? 0 : bArr.length, bArr);
    }
}
