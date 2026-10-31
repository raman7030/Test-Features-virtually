package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۘۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77U5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3833 extends AbstractC9478 {
    @Override // l.AbstractC9478
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7854(C7381 c7381) {
        super.mo7854(c7381);
        Vector vectorMo1739 = c7381.f22696.m46775().mo1739();
        synchronized (vectorMo1739) {
            if (vectorMo1739.size() <= 0) {
                return false;
            }
            String strM19856 = c7381.m19856("PubkeyAcceptedAlgorithms");
            c7381.f22696.m46777().getClass();
            String[] strArrM19866 = c7381.m19866();
            List listAsList = (strArrM19866 == null || strArrM19866.length <= 0) ? Collections.EMPTY_LIST : Arrays.asList(strArrM19866);
            if (!listAsList.isEmpty()) {
                c7381.f22696.m46777().getClass();
            }
            List<String> listAsList2 = Arrays.asList(C19356.m44594(strM19856));
            if (listAsList2.isEmpty()) {
                return false;
            }
            String[] strArrM19876 = c7381.m19876();
            if (strArrM19876 == null || strArrM19876.length <= 0) {
                c7381.f22696.m46777().getClass();
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList2) {
                    int length = strArrM19876.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            arrayList2.add(str);
                            break;
                        }
                        if (str.equals(strArrM19876[i])) {
                            arrayList.add(str);
                            break;
                        }
                        i++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    c7381.f22696.m46777().getClass();
                }
                if (!arrayList2.isEmpty()) {
                    c7381.f22696.m46777().getClass();
                }
                if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    if (m11588(c7381, vectorMo1739, arrayList, listAsList)) {
                        return true;
                    }
                    return m11588(c7381, vectorMo1739, arrayList2, listAsList);
                }
            }
            return m11588(c7381, vectorMo1739, listAsList2, listAsList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m11588(C7381 c7381, Vector vector, List list, List list2) throws IOException {
        String str;
        byte[] bytes;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        String str2;
        List list3;
        ArrayList arrayList4;
        int i;
        int i2 = c7381.f22699;
        C20413 c20413 = c7381.f22696;
        if (i2 >= c7381.f22680) {
            return false;
        }
        boolean zEquals = c7381.m19856("enable_pubkey_auth_query").equals("yes");
        boolean zEquals2 = c7381.m19856("try_additional_pubkey_algorithms").equals("yes");
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            str = OpenSSHPublicKeyUtil.RSA;
            if (!zHasNext) {
                break;
            }
            String str3 = (String) it2.next();
            if (str3.equals(OpenSSHPublicKeyUtil.RSA) || str3.equals("rsa-sha2-256") || str3.equals("rsa-sha2-512") || str3.equals("ssh-rsa-sha224@ssh.com") || str3.equals("ssh-rsa-sha256@ssh.com") || str3.equals("ssh-rsa-sha384@ssh.com") || str3.equals("ssh-rsa-sha512@ssh.com")) {
                arrayList5.add(str3);
            } else {
                arrayList6.add(str3);
            }
        }
        byte[] bArrM44592 = C19356.m44592(this.f28800, StandardCharsets.UTF_8);
        Iterator it3 = vector.iterator();
        List list4 = list2;
        while (it3.hasNext()) {
            InterfaceC0656 interfaceC0656 = (InterfaceC0656) it3.next();
            if (c7381.f22699 >= c7381.f22680) {
                return false;
            }
            int i3 = 5;
            while (true) {
                if (!interfaceC0656.mo2692()) {
                    bytes = null;
                } else {
                    if (this.f28799 == null) {
                        throw new C12651("USERAUTH fail");
                    }
                    if (interfaceC0656.mo2692() && !this.f28799.mo4551()) {
                        throw new C3479("publickey");
                    }
                    String strMo4548 = this.f28799.mo4548();
                    if (strMo4548 != null) {
                        byte[] bArr = C19356.f62660;
                        bytes = strMo4548.getBytes(StandardCharsets.UTF_8);
                    } else {
                        bytes = null;
                    }
                }
                if (!(interfaceC0656.mo2692() && bytes == null) && interfaceC0656.mo2688(bytes)) {
                    if (bytes == null || !(c20413.m46775() instanceof C8418)) {
                        break;
                        break;
                    }
                    ((C8418) c20413.m46775()).m22038();
                    break;
                }
                C19356.m44596(bytes);
                i3--;
                if (i3 == 0) {
                    bytes = null;
                    break;
                }
                list4 = list2;
            }
            C19356.m44596(bytes);
            String strMo2687 = interfaceC0656.mo2687();
            if (strMo2687.equals(str)) {
                arrayList = new ArrayList(arrayList5);
            } else if (arrayList6.contains(strMo2687)) {
                ArrayList arrayList7 = new ArrayList(1);
                arrayList7.add(strMo2687);
                arrayList = arrayList7;
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                zEquals = zEquals;
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
                it = it3;
                str2 = str;
                c20413.m46777().getClass();
            } else {
                char c = 5;
                while (true) {
                    if (arrayList.isEmpty()) {
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = arrayList5;
                        if (c7381.f22699 < c7381.f22680) {
                            byte[] bArrMo2690 = interfaceC0656.mo2690();
                            if (bArrMo2690 == null || !zEquals) {
                                zEquals = zEquals;
                                arrayList3 = arrayList6;
                                it = it3;
                                str2 = str;
                                list3 = list4;
                                arrayList4 = null;
                            } else {
                                Iterator it4 = arrayList.iterator();
                                int i4 = 51;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        zEquals = zEquals;
                                        arrayList3 = arrayList6;
                                        it = it3;
                                        str2 = str;
                                        list3 = list4;
                                        arrayList4 = null;
                                        i = i4;
                                        break;
                                    }
                                    zEquals = zEquals;
                                    String str4 = (String) it4.next();
                                    it4.remove();
                                    if (list4.contains(str4)) {
                                        c20413.m46777().getClass();
                                    } else {
                                        arrayList3 = arrayList6;
                                        this.f28798.m21457();
                                        it = it3;
                                        this.f28797.m38234((byte) 50);
                                        this.f28797.m38256(bArrM44592);
                                        C16261 c16261 = this.f28797;
                                        Charset charset = StandardCharsets.UTF_8;
                                        str2 = str;
                                        c16261.m38256("ssh-connection".getBytes(charset));
                                        this.f28797.m38256("publickey".getBytes(charset));
                                        this.f28797.m38234((byte) 0);
                                        this.f28797.m38256(C19356.m44592(str4, charset));
                                        C16261 c16262 = this.f28797;
                                        c16262.getClass();
                                        c16262.m38252(0, bArrMo2690.length, bArrMo2690);
                                        c7381.m19872(this.f28798);
                                        while (true) {
                                            C16261 c16263 = this.f28797;
                                            c7381.m19863(c16263);
                                            this.f28797 = c16263;
                                            i = c16263.f50016[c] & 255;
                                            if (i != 60) {
                                                if (i != 51) {
                                                    if (i != 53) {
                                                        c20413.m46777().getClass();
                                                        break;
                                                    }
                                                    c16263.m38250();
                                                    this.f28797.m38233();
                                                    this.f28797.m38233();
                                                    byte[] bArrM38257 = this.f28797.m38257();
                                                    this.f28797.m38257();
                                                    String str5 = str4;
                                                    new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8);
                                                    str4 = str5;
                                                    list4 = list4;
                                                } else {
                                                    c20413.m46777().getClass();
                                                    break;
                                                }
                                            } else {
                                                c20413.m46777().getClass();
                                                arrayList4 = new ArrayList(1);
                                                arrayList4.add(str4);
                                                list3 = list4;
                                                break;
                                            }
                                        }
                                        str = str2;
                                        i4 = i;
                                        arrayList6 = arrayList3;
                                        list4 = list4;
                                        it3 = it;
                                    }
                                }
                                if (i != 60) {
                                }
                                list4 = list3;
                            }
                            if (!interfaceC0656.mo2692()) {
                                if (bArrMo2690 == null) {
                                    bArrMo2690 = interfaceC0656.mo2690();
                                }
                                if (bArrMo2690 != null) {
                                    if (arrayList4 == null) {
                                        arrayList4 = arrayList;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        Iterator it5 = arrayList4.iterator();
                                        List list5 = list3;
                                        while (true) {
                                            if (!it5.hasNext() || c7381.f22699 >= c7381.f22680) {
                                                c = 5;
                                                it3 = it;
                                                str = str2;
                                                list4 = list2;
                                                arrayList5 = arrayList2;
                                                arrayList6 = arrayList3;
                                                zEquals = zEquals;
                                            } else {
                                                String str6 = (String) it5.next();
                                                it5.remove();
                                                if (list5.contains(str6)) {
                                                    c20413.m46777().getClass();
                                                } else {
                                                    this.f28798.m21457();
                                                    this.f28797.m38234((byte) 50);
                                                    this.f28797.m38256(bArrM44592);
                                                    C16261 c16264 = this.f28797;
                                                    Charset charset2 = StandardCharsets.UTF_8;
                                                    c16264.m38256("ssh-connection".getBytes(charset2));
                                                    this.f28797.m38256("publickey".getBytes(charset2));
                                                    this.f28797.m38234((byte) 1);
                                                    this.f28797.m38256(C19356.m44592(str6, charset2));
                                                    C16261 c16265 = this.f28797;
                                                    c16265.getClass();
                                                    c16265.m38252(0, bArrMo2690.length, bArrMo2690);
                                                    byte[] bArrM19873 = c7381.m19873();
                                                    int length = bArrM19873.length;
                                                    int i5 = length + 4;
                                                    byte[] bArr2 = new byte[(this.f28797.f50017 + i5) - 5];
                                                    Iterator it6 = it5;
                                                    bArr2[0] = (byte) (length >>> 24);
                                                    bArr2[1] = (byte) (length >>> 16);
                                                    bArr2[2] = (byte) (length >>> 8);
                                                    byte[] bArr3 = bArrMo2690;
                                                    bArr2[3] = (byte) length;
                                                    System.arraycopy(bArrM19873, 0, bArr2, 4, length);
                                                    C16261 c16266 = this.f28797;
                                                    System.arraycopy(c16266.f50016, 5, bArr2, i5, c16266.f50017 - 5);
                                                    byte[] bArrMo2689 = interfaceC0656.mo2689(str6, bArr2);
                                                    if (bArrMo2689 != null) {
                                                        C16261 c16267 = this.f28797;
                                                        c16267.getClass();
                                                        c16267.m38252(0, bArrMo2689.length, bArrMo2689);
                                                        c7381.m19872(this.f28798);
                                                        while (true) {
                                                            C16261 c16268 = this.f28797;
                                                            c7381.m19863(c16268);
                                                            this.f28797 = c16268;
                                                            int i6 = c16268.f50016[5] & 255;
                                                            if (i6 != 52) {
                                                                if (i6 != 53) {
                                                                    if (i6 != 51) {
                                                                        c20413.m46777().getClass();
                                                                        break;
                                                                    }
                                                                    c16268.m38250();
                                                                    this.f28797.m38233();
                                                                    this.f28797.m38233();
                                                                    byte[] bArrM38258 = this.f28797.m38257();
                                                                    if (this.f28797.m38233() != 0) {
                                                                        throw new C6301(new String(bArrM38258, 0, bArrM38258.length, StandardCharsets.UTF_8));
                                                                    }
                                                                    c7381.f22699++;
                                                                    c20413.m46777().getClass();
                                                                    if (c7381.f22699 < c7381.f22680) {
                                                                        if (!zEquals2) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    return false;
                                                                }
                                                                c16268.m38250();
                                                                this.f28797.m38233();
                                                                this.f28797.m38233();
                                                                byte[] bArrM38259 = this.f28797.m38257();
                                                                this.f28797.m38257();
                                                                new String(bArrM38259, 0, bArrM38259.length, StandardCharsets.UTF_8);
                                                            } else {
                                                                c20413.m46777().getClass();
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        c20413.m46777().getClass();
                                                    }
                                                    list5 = list2;
                                                    it5 = it6;
                                                    bArrMo2690 = bArr3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            list4 = list3;
                        }
                        it3 = it;
                        str = str2;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList3;
                        zEquals = zEquals;
                    }
                    arrayList3 = arrayList6;
                    it = it3;
                    str2 = str;
                }
            }
            list4 = list2;
            it3 = it;
            str = str2;
            arrayList5 = arrayList2;
            arrayList6 = arrayList3;
            zEquals = zEquals;
        }
        return false;
    }
}
