package p067l;

import android.text.TextUtils;
import net.p069sf.sevenzipjbinding.IOutCreateArchive7z;
import net.p069sf.sevenzipjbinding.SevenZip;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.۬ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C14893 {
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX INFO: renamed from: ֫ */
    public static void m34098(C23611 c23611, InterfaceC6847 interfaceC6847) throws Throwable {
        C21171 c21171;
        C22941 c16904;
        String strMo11908 = interfaceC6847.mo11908();
        IOutCreateArchive7z iOutCreateArchive7z = null;
        c21171Mo11906 = null;
        C21171 c21171Mo11906 = null;
        iOutCreateArchive7z = null;
        try {
            if (!C5095.m10851()) {
                throw new SevenZipException(C5095.m10852());
            }
            IOutCreateArchive7z iOutCreateArchive7zM55300 = SevenZip.m55300();
            try {
                iOutCreateArchive7zM55300.setLevel(c23611.f75145);
                iOutCreateArchive7zM55300.setHeaderEncryption(c23611.f75146);
                iOutCreateArchive7zM55300.setThreadCount(-1);
                c21171Mo11906 = interfaceC6847.mo11906();
                if (TextUtils.isEmpty(strMo11908)) {
                    c16904 = new C22941(interfaceC6847);
                } else {
                    c16904 = new C16904(interfaceC6847, strMo11908);
                }
                iOutCreateArchive7zM55300.createArchive(c21171Mo11906, c23611.f75147, c16904);
                C2700.m4192(iOutCreateArchive7zM55300);
                C2700.m4192(c21171Mo11906);
            } catch (SevenZipException e) {
                e = e;
                c21171 = c21171Mo11906;
                iOutCreateArchive7z = iOutCreateArchive7zM55300;
                try {
                    if (!interfaceC6847.mo3924()) {
                        throw e;
                    }
                    if (iOutCreateArchive7z != null) {
                        C2700.m4192(iOutCreateArchive7z);
                    }
                    if (C14110.m32033(c21171)) {
                        C2700.m4192(c21171);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (iOutCreateArchive7z != null) {
                        C2700.m4192(iOutCreateArchive7z);
                    }
                    if (C14110.m32033(c21171)) {
                        C2700.m4192(c21171);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c21171 = c21171Mo11906;
                iOutCreateArchive7z = iOutCreateArchive7zM55300;
                if (iOutCreateArchive7z != null) {
                    C2700.m4192(iOutCreateArchive7z);
                }
                if (C14110.m32033(c21171)) {
                    C2700.m4192(c21171);
                }
                throw th;
            }
        } catch (SevenZipException e2) {
            e = e2;
            c21171 = null;
        } catch (Throwable th3) {
            th = th3;
            c21171 = null;
        }
    }
}
