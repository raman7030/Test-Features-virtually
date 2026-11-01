package p067l;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19FV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20979 implements InterfaceC6226 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20348 f65888 = new C20308();

    @Override // p067l.InterfaceC6226
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14099(C16953 c16953, C18139 c18139, InterfaceC4885 interfaceC4885) {
        return interfaceC4885.mo10364(c18139);
    }

    @Override // p067l.InterfaceC6226
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14100(C16953 c16953, C18158 c18158, C18139 c18139, InterfaceC4885 interfaceC4885) throws C17624 {
        C5261 c5261;
        String strM25286;
        if (((C24864) c18158.mo5341()).m54605() != EnumC9460.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            return interfaceC4885.mo10364(c18139);
        }
        C14648 c14648M41367 = c18158.m41367();
        if (c14648M41367 == null) {
            c5261 = null;
            break;
        }
        Iterator it = c14648M41367.m33516().iterator();
        while (true) {
            if (!it.hasNext()) {
                c5261 = null;
                break;
            }
            InterfaceC6602 interfaceC6602 = (InterfaceC6602) it.next();
            if (interfaceC6602 instanceof C5261) {
                c5261 = (C5261) interfaceC6602;
                break;
            }
        }
        if (c5261 == null) {
            throw new C17624(((C24864) c18158.mo5341()).m54605(), "Create failed for " + c18139 + ": missing symlink data");
        }
        String strM41321 = c18139.m41321();
        int iM11341 = c5261.m11341();
        byte[] bArrM27389 = C11967.m27389(strM41321);
        int length = bArrM27389.length - iM11341;
        Charset charset = C10169.f28135;
        String str = new String(bArrM27389, length, iM11341, charset);
        String strM11340 = c5261.m11340();
        if (c5261.m11342()) {
            strM25286 = C17588.m40053(strM11340, str);
        } else {
            byte[] bArrM273810 = C11967.m27389(strM41321);
            String str2 = new String(bArrM273810, 0, bArrM273810.length - iM11341, charset);
            StringBuilder sb = new StringBuilder();
            int iLastIndexOf = str2.lastIndexOf("\\");
            if (iLastIndexOf != -1) {
                sb.append((CharSequence) str2, 0, iLastIndexOf);
                sb.append('\\');
            }
            strM25286 = C10965.m25286(sb, strM11340, str);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iIndexOf = strM25286.indexOf(92, i);
            if (iIndexOf == -1) {
                break;
            }
            arrayList.add(strM25286.substring(i, iIndexOf));
            i = iIndexOf + 1;
        }
        arrayList.add(strM25286.substring(i));
        int i2 = 0;
        while (i2 < arrayList.size()) {
            String str3 = (String) arrayList.get(i2);
            if (".".equals(str3)) {
                arrayList.remove(i2);
            } else if ("..".equals(str3)) {
                if (i2 > 0) {
                    arrayList.remove(i2);
                    i2--;
                }
                arrayList.remove(i2);
            } else {
                i2++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (i3 > 0) {
                sb2.append('\\');
            }
            sb2.append((String) arrayList.get(i3));
        }
        return interfaceC4885.mo10364(new C18139(c18139.m41319(), c18139.m41323(), sb2.toString()));
    }

    @Override // p067l.InterfaceC6226
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20348 mo14101() {
        return this.f65888;
    }
}
