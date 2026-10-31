package l;

import android.text.TextUtils;
import net.sf.sevenzipjbinding.IOutCreateArchive7z;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.۬ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C13178 {
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32002(C22351 c22351, InterfaceC4712 interfaceC4712) throws Throwable {
        C19783 c19783;
        C21646 c15294;
        String strMo9861 = interfaceC4712.mo9861();
        IOutCreateArchive7z iOutCreateArchive7z = null;
        c19783Mo9859 = null;
        C19783 c19783Mo9859 = null;
        iOutCreateArchive7z = null;
        try {
            if (!C2868.m8784()) {
                throw new SevenZipException(C2868.m8785());
            }
            IOutCreateArchive7z iOutCreateArchive7zM52894 = SevenZip.m52894();
            try {
                iOutCreateArchive7zM52894.setLevel(c22351.f72419);
                iOutCreateArchive7zM52894.setHeaderEncryption(c22351.f72420);
                iOutCreateArchive7zM52894.setThreadCount(-1);
                c19783Mo9859 = interfaceC4712.mo9859();
                if (TextUtils.isEmpty(strMo9861)) {
                    c15294 = new C21646(interfaceC4712);
                } else {
                    c15294 = new C15294(interfaceC4712, strMo9861);
                }
                iOutCreateArchive7zM52894.createArchive(c19783Mo9859, c22351.f72421, c15294);
                C0349.m1793(iOutCreateArchive7zM52894);
                C0349.m1793(c19783Mo9859);
            } catch (SevenZipException e) {
                e = e;
                c19783 = c19783Mo9859;
                iOutCreateArchive7z = iOutCreateArchive7zM52894;
                try {
                    if (!interfaceC4712.mo1526()) {
                        throw e;
                    }
                    if (iOutCreateArchive7z != null) {
                        C0349.m1793(iOutCreateArchive7z);
                    }
                    if (C12354.m29972(c19783)) {
                        C0349.m1793(c19783);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (iOutCreateArchive7z != null) {
                        C0349.m1793(iOutCreateArchive7z);
                    }
                    if (C12354.m29972(c19783)) {
                        C0349.m1793(c19783);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c19783 = c19783Mo9859;
                iOutCreateArchive7z = iOutCreateArchive7zM52894;
                if (iOutCreateArchive7z != null) {
                    C0349.m1793(iOutCreateArchive7z);
                }
                if (C12354.m29972(c19783)) {
                    C0349.m1793(c19783);
                }
                throw th;
            }
        } catch (SevenZipException e2) {
            e = e2;
            c19783 = null;
        } catch (Throwable th3) {
            th = th3;
            c19783 = null;
        }
    }
}
