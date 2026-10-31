package l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes4.dex */
public final class C11982 extends AbstractC13921 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C11982 f35872 = new C11982();

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return "trash";
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        if (z) {
            C21939.m49415();
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        return interfaceC17889.mo24433().mo27926();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        C6337 c6337M29289 = m29289(str);
        if (c6337M29289 == null) {
            return null;
        }
        boolean zEndsWith = str.endsWith("/");
        C12687 c12687 = new C12687(c6337M29289.m17612(), C9523.m24406(str));
        if (c12687.isDirectory() != zEndsWith) {
            return null;
        }
        return c12687;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("trash".getBytes());
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String strM39731 = AbstractC16891.m39731(str);
        int i = 0;
        if (str.equals("/") || str.isEmpty()) {
            List listM49422 = C21939.m49422();
            ArrayList arrayList = new ArrayList(listM49422.size());
            int size = listM49422.size();
            while (i < size) {
                arrayList.add(new C12687((C21234) listM49422.get(i)));
                i++;
            }
            return arrayList;
        }
        C6337 c6337M29289 = m29289(str);
        if (c6337M29289 == null) {
            return new ArrayList();
        }
        List listMo23549 = c6337M29289.m17612().mo23549(true);
        ArrayList arrayList2 = new ArrayList(listMo23549.size());
        int size2 = listMo23549.size();
        while (i < size2) {
            arrayList2.add(new C12687((AbstractC15440) listMo23549.get(i), strM39731));
            i++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C6337 m29289(String str) {
        boolean zStartsWith = str.startsWith("/");
        int iIndexOf = str.indexOf(47, zStartsWith ? 1 : 0);
        if (iIndexOf == -1) {
            return null;
        }
        return new C6337(str.substring(zStartsWith ? 1 : 0, iIndexOf), str.substring(iIndexOf));
    }
}
