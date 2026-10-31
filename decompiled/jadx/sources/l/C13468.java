package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 698T */
/* JADX INFO: loaded from: classes4.dex */
public class C13468 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f40207;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f40208;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("saveAsPath"), m11556("title"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        mo11546(m11556("title"));
        m11555(R.string.MT_Protector);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        AbstractC15440 abstractC15440M11515 = m11515("inputPath1");
        AbstractC15440 abstractC15440M11516 = m11515("inputPath2");
        C19277 c19277 = new C19277(abstractC15440M11516.mo23127() + abstractC15440M11515.mo23127());
        c19277.m44459(new C4236(5, this));
        InterfaceC15334[] interfaceC15334Arr = {C8280.m21880(), C8280.m21881(), C8280.m21882(), C8280.m21879()};
        C5458 c5458 = new C5458(interfaceC15334Arr);
        try {
            InputStream inputStreamMo27926 = abstractC15440M11515.mo27926();
            try {
                c5458.m15562(inputStreamMo27926, c19277);
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
                c5458.close();
                InterfaceC15334[] interfaceC15334Arr2 = {C8280.m21880(), C8280.m21881(), C8280.m21882(), C8280.m21879()};
                C5458 c5459 = new C5458(interfaceC15334Arr2);
                try {
                    InputStream inputStreamMo27927 = abstractC15440M11516.mo27926();
                    try {
                        c5459.m15562(inputStreamMo27927, c19277);
                        if (inputStreamMo27927 != null) {
                            inputStreamMo27927.close();
                        }
                        c5459.close();
                        byte[][] bArr = {interfaceC15334Arr[0].mo4062(), interfaceC15334Arr[1].mo4062(), interfaceC15334Arr[2].mo4062(), interfaceC15334Arr[3].mo4062()};
                        byte[][] bArr2 = {interfaceC15334Arr2[0].mo4062(), interfaceC15334Arr2[1].mo4062(), interfaceC15334Arr2[2].mo4062(), interfaceC15334Arr2[3].mo4062()};
                        boolean zDeepEquals = Arrays.deepEquals(bArr, bArr2);
                        this.f40208 = !zDeepEquals;
                        if (!zDeepEquals) {
                            this.f40207 = abstractC15440M11515.mo23554() + "\n" + abstractC15440M11516.mo23554() + "\n\n" + m32484(bArr[0], "[MD5]", bArr2[0]) + "\n\n" + m32484(bArr[1], "[SHA1]", bArr2[1]) + "\n\n" + m32484(bArr[2], "[SHA256]", bArr2[2]) + "\n\n" + m32484(bArr[3], "[CRC32]", bArr2[3]);
                        }
                        return m11545();
                    } catch (Throwable th) {
                        if (inputStreamMo27927 != null) {
                            try {
                                inputStreamMo27927.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c5459.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c5458.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32484(byte[] bArr, String str, byte[] bArr2) {
        String strM34531 = C14460.m34531(bArr);
        String strM34532 = C14460.m34531(bArr2);
        if (strM34531.equals(strM34532)) {
            return str + "\n✔ " + strM34531 + "\n✔ " + strM34532;
        }
        return str + "\n✘ " + strM34531 + "\n✘ " + strM34532;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526()) {
            if (!this.f40208) {
                C21374.m48457(R.string.MT_Protector);
            } else {
                ActivityC14946.m35399(main, this.f40207, m11556("title"), m11556("saveAsPath"), null);
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
