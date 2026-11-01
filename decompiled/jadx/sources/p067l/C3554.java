package p067l;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: renamed from: l.֨ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3554 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۜ */
    public AlgorithmParameterSpec f7206;

    /* JADX INFO: renamed from: ܳ */
    public String f7207;

    /* JADX INFO: renamed from: ܿ */
    public int f7208;

    /* JADX INFO: renamed from: ᩳ */
    public String f7209;

    /* JADX INFO: renamed from: ᩻ */
    public String f7210;

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ܽ */
    public final int mo6340() {
        return 24;
    }

    public C3554(int i, String str, String str2, String str3, PSSParameterSpec pSSParameterSpec) {
        this.f7208 = i;
        this.f7209 = str;
        this.f7207 = str2;
        this.f7210 = str3;
        this.f7206 = pSSParameterSpec;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ֫ */
    public final int mo6337() {
        return this.f7208;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ۧ */
    public final String mo6339() {
        return this.f7207;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6342() {
        return this.f7210;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ܿ */
    public final AlgorithmParameterSpec mo6341() {
        return this.f7206;
    }

    @Override // p067l.AbstractC16964
    /* JADX INFO: renamed from: ֫ */
    public final void mo6338(InterfaceC2903 interfaceC2903, InterfaceC2903 interfaceC2904, InterfaceC2903 interfaceC2905, InterfaceC18588 interfaceC18588) throws NoSuchAlgorithmException, IOException {
        String str = this.f7209;
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        MessageDigest messageDigest2 = MessageDigest.getInstance(str);
        int iM38553 = AbstractC16964.m38553(interfaceC2903.size()) + AbstractC16964.m38553(interfaceC2904.size()) + AbstractC16964.m38553(interfaceC2905.size());
        C7578 c7578 = new C7578(messageDigest2);
        byte[] bArr = new byte[5];
        bArr[0] = 90;
        C24185.m53469(iM38553, 1, bArr);
        c7578.write(bArr);
        AbstractC16964.m38555(messageDigest, interfaceC2903, c7578, interfaceC18588);
        if (interfaceC18588.mo3924()) {
            return;
        }
        AbstractC16964.m38555(messageDigest, interfaceC2904, c7578, interfaceC18588);
        if (interfaceC18588.mo3924()) {
            return;
        }
        AbstractC16964.m38555(messageDigest, interfaceC2905, c7578, interfaceC18588);
        if (interfaceC18588.mo3924()) {
            return;
        }
        this.f50194 = messageDigest2.digest();
    }
}
