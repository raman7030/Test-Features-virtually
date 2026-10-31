package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7364 implements InterfaceC11098 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f22613;

    @Override // l.InterfaceC11098
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InputStream mo10616() {
        return C1925.m6337(this);
    }

    @Override // l.InterfaceC11098
    public final InputStream getInputStream() {
        return new C9301(this.f22613);
    }

    public C7364(byte[] bArr) {
        this.f22613 = bArr;
    }

    @Override // l.InterfaceC11098
    public final long length() {
        return this.f22613.length;
    }
}
