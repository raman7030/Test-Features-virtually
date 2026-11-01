package p067l;

import java.io.EOFException;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: l.۠ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10260 extends AbstractC16964 {

    /* JADX INFO: renamed from: ܳ */
    public String f28408;

    /* JADX INFO: renamed from: ܿ */
    public String f28409;

    /* JADX INFO: renamed from: ᩳ */
    public int f28410;

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ܽ */
    public final int mo6340() {
        return 28;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ܿ */
    public final AlgorithmParameterSpec mo6341() {
        return null;
    }

    public C10260(int i, String str, String str2) {
        this.f28410 = i;
        this.f28409 = str;
        this.f28408 = str2;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ֫ */
    public final int mo6337() {
        return this.f28410;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ۧ */
    public final String mo6339() {
        return this.f28409;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6342() {
        return this.f28408;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ֫ */
    public final void mo6338(InterfaceC2903 interfaceC2903, InterfaceC2903 interfaceC2904, InterfaceC2903 interfaceC2905, InterfaceC18588 interfaceC18588) throws EOFException {
        byte[] bArrM14249 = new C6277(new byte[8]).m14249(interfaceC2903, interfaceC2904, interfaceC2905, interfaceC18588);
        if (interfaceC18588.mo3924()) {
            return;
        }
        byte[] bArr = new byte[bArrM14249.length + 8];
        System.arraycopy(bArrM14249, 0, bArr, 0, bArrM14249.length);
        C24185.m53470(interfaceC2905.size() + interfaceC2904.size() + interfaceC2903.size(), bArrM14249.length, bArr);
        this.f50194 = bArr;
    }
}
