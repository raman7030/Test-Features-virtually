package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: renamed from: l.֨ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1247 extends AbstractC15357 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AlgorithmParameterSpec f4437;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f4438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f4439;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f4440;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f4441;

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo4096() {
        return 24;
    }

    public C1247(int i, String str, String str2, String str3, PSSParameterSpec pSSParameterSpec) {
        this.f4439 = i;
        this.f4440 = str;
        this.f4438 = str2;
        this.f4441 = str3;
        this.f4437 = pSSParameterSpec;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo4093() {
        return this.f4439;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo4095() {
        return this.f4438;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo4098() {
        return this.f4441;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AlgorithmParameterSpec mo4097() {
        return this.f4437;
    }

    @Override // l.AbstractC15357
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4094(InterfaceC0562 interfaceC0562, InterfaceC0562 interfaceC0563, InterfaceC0562 interfaceC0564, InterfaceC17066 interfaceC17066) throws NoSuchAlgorithmException, IOException {
        String str = this.f4440;
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        MessageDigest messageDigest2 = MessageDigest.getInstance(str);
        int iM36395 = AbstractC15357.m36395(interfaceC0562.size()) + AbstractC15357.m36395(interfaceC0563.size()) + AbstractC15357.m36395(interfaceC0564.size());
        C5481 c5481 = new C5481(messageDigest2);
        byte[] bArr = new byte[5];
        bArr[0] = 90;
        C22955.m51078(iM36395, 1, bArr);
        c5481.write(bArr);
        AbstractC15357.m36397(messageDigest, interfaceC0562, c5481, interfaceC17066);
        if (interfaceC17066.mo1526()) {
            return;
        }
        AbstractC15357.m36397(messageDigest, interfaceC0563, c5481, interfaceC17066);
        if (interfaceC17066.mo1526()) {
            return;
        }
        AbstractC15357.m36397(messageDigest, interfaceC0564, c5481, interfaceC17066);
        if (interfaceC17066.mo1526()) {
            return;
        }
        this.f47069 = messageDigest2.digest();
    }
}
