package l;

import java.io.EOFException;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: l.۠ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8303 extends AbstractC15357 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f25498;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f25499;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f25500;

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ܽ */
    public final int mo4096() {
        return 28;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ܿ */
    public final AlgorithmParameterSpec mo4097() {
        return null;
    }

    public C8303(int i, String str, String str2) {
        this.f25500 = i;
        this.f25499 = str;
        this.f25498 = str2;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ֫ */
    public final int mo4093() {
        return this.f25500;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ۧ */
    public final String mo4095() {
        return this.f25499;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ᩳ */
    public final String mo4098() {
        return this.f25498;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ֫ */
    public final void mo4094(InterfaceC0562 interfaceC0562, InterfaceC0562 interfaceC0563, InterfaceC0562 interfaceC0564, InterfaceC17066 interfaceC17066) throws EOFException {
        byte[] bArrM12344 = new C4112(new byte[8]).m12344(interfaceC0562, interfaceC0563, interfaceC0564, interfaceC17066);
        if (interfaceC17066.mo1526()) {
            return;
        }
        byte[] bArr = new byte[bArrM12344.length + 8];
        System.arraycopy(bArrM12344, 0, bArr, 0, bArrM12344.length);
        C22955.m51079(interfaceC0564.size() + interfaceC0563.size() + interfaceC0562.size(), bArrM12344.length, bArr);
        this.f47069 = bArr;
    }
}
