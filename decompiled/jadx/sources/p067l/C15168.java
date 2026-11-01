package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 698T */
/* JADX INFO: loaded from: classes4.dex */
public class C15168 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۖ֫ */
    public String f43277;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f43278;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79717;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("saveAsPath"), m13492("title"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        mo13482(m13492("title"));
        m13491(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        AbstractC17043 abstractC17043M13451 = m13451("inputPath1");
        AbstractC17043 abstractC17043M13452 = m13451("inputPath2");
        C20689 c20689 = new C20689(abstractC17043M13452.mo25101() + abstractC17043M13451.mo25101());
        c20689.m46753(new C6395(5, this));
        InterfaceC16942[] interfaceC16942Arr = {C10238.m23850(), C10238.m23851(), C10238.m23852(), C10238.m23849()};
        C7556 c7556 = new C7556(interfaceC16942Arr);
        try {
            InputStream inputStreamMo29987 = abstractC17043M13451.mo29987();
            try {
                c7556.m17473(inputStreamMo29987, c20689);
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
                c7556.close();
                InterfaceC16942[] interfaceC16942Arr2 = {C10238.m23850(), C10238.m23851(), C10238.m23852(), C10238.m23849()};
                C7556 c7557 = new C7556(interfaceC16942Arr2);
                try {
                    InputStream inputStreamMo29988 = abstractC17043M13452.mo29987();
                    try {
                        c7557.m17473(inputStreamMo29988, c20689);
                        if (inputStreamMo29988 != null) {
                            inputStreamMo29988.close();
                        }
                        c7557.close();
                        byte[][] bArr = {interfaceC16942Arr[0].mo6306(), interfaceC16942Arr[1].mo6306(), interfaceC16942Arr[2].mo6306(), interfaceC16942Arr[3].mo6306()};
                        byte[][] bArr2 = {interfaceC16942Arr2[0].mo6306(), interfaceC16942Arr2[1].mo6306(), interfaceC16942Arr2[2].mo6306(), interfaceC16942Arr2[3].mo6306()};
                        boolean zDeepEquals = Arrays.deepEquals(bArr, bArr2);
                        this.f43278 = !zDeepEquals;
                        if (!zDeepEquals) {
                            this.f43277 = abstractC17043M13451.mo25505() + "\n" + abstractC17043M13452.mo25505() + "\n\n" + m34586(bArr[0], "[MD5]", bArr2[0]) + "\n\n" + m34586(bArr[1], "[SHA1]", bArr2[1]) + "\n\n" + m34586(bArr[2], "[SHA256]", bArr2[2]) + "\n\n" + m34586(bArr[3], "[CRC32]", bArr2[3]);
                        }
                        return m13481();
                    } catch (Throwable th) {
                        if (inputStreamMo29988 != null) {
                            try {
                                inputStreamMo29988.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c7557.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c7556.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34586(byte[] bArr, String str, byte[] bArr2) {
        String strM36665 = C16111.m36665(bArr);
        String strM36666 = C16111.m36665(bArr2);
        if (strM36665.equals(strM36666)) {
            return str + "\n✔ " + strM36665 + "\n✔ " + strM36666;
        }
        return str + "\n✘ " + strM36665 + "\n✘ " + strM36666;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773()) {
            if (!this.f43278) {
                C22682.m50793(R.string.MT_Protector);
            } else {
                ActivityC16573.m37551(main, this.f43277, m13492("title"), m13492("saveAsPath"), null);
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
