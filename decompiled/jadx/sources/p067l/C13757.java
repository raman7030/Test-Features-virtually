package p067l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13757 extends AbstractC15599 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C13757 f38882 = new C13757();

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "trash";
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        if (z) {
            C23219.m51752();
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) {
        return interfaceC19370.mo26445().mo29987();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        C8392 c8392M31344 = m31344(str);
        if (c8392M31344 == null) {
            return null;
        }
        boolean zEndsWith = str.endsWith("/");
        C14427 c14427 = new C14427(c8392M31344.m19552(), C11419.m26416(str));
        if (c14427.isDirectory() != zEndsWith) {
            return null;
        }
        return c14427;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("trash".getBytes());
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        String strM41972 = AbstractC18422.m41972(str);
        int i = 0;
        if (str.equals("/") || str.isEmpty()) {
            List listM51759 = C23219.m51759();
            ArrayList arrayList = new ArrayList(listM51759.size());
            int size = listM51759.size();
            while (i < size) {
                arrayList.add(new C14427((C22549) listM51759.get(i)));
                i++;
            }
            return arrayList;
        }
        C8392 c8392M31344 = m31344(str);
        if (c8392M31344 == null) {
            return new ArrayList();
        }
        List listMo25500 = c8392M31344.m19552().mo25500(true);
        ArrayList arrayList2 = new ArrayList(listMo25500.size());
        int size2 = listMo25500.size();
        while (i < size2) {
            arrayList2.add(new C14427((AbstractC17043) listMo25500.get(i), strM41972));
            i++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C8392 m31344(String str) {
        boolean zStartsWith = str.startsWith("/");
        int iIndexOf = str.indexOf(47, zStartsWith ? 1 : 0);
        if (iIndexOf == -1) {
            return null;
        }
        return new C8392(str.substring(zStartsWith ? 1 : 0, iIndexOf), str.substring(iIndexOf));
    }
}
