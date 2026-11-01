package p067l;

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
public final class C6011 extends AbstractC11376 {
    @Override // p067l.AbstractC11376
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9902(C9383 c9383) {
        super.mo9902(c9383);
        Vector vectorMo4137 = c9383.f25608.m49098().mo4137();
        synchronized (vectorMo4137) {
            if (vectorMo4137.size() <= 0) {
                return false;
            }
            String strM21829 = c9383.m21829("PubkeyAcceptedAlgorithms");
            c9383.f25608.m49100().getClass();
            String[] strArrM21839 = c9383.m21839();
            List listAsList = (strArrM21839 == null || strArrM21839.length <= 0) ? Collections.EMPTY_LIST : Arrays.asList(strArrM21839);
            if (!listAsList.isEmpty()) {
                c9383.f25608.m49100().getClass();
            }
            List<String> listAsList2 = Arrays.asList(C20764.m46888(strM21829));
            if (listAsList2.isEmpty()) {
                return false;
            }
            String[] strArrM21849 = c9383.m21849();
            if (strArrM21849 == null || strArrM21849.length <= 0) {
                c9383.f25608.m49100().getClass();
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList2) {
                    int length = strArrM21849.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            arrayList2.add(str);
                            break;
                        }
                        if (str.equals(strArrM21849[i])) {
                            arrayList.add(str);
                            break;
                        }
                        i++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    c9383.f25608.m49100().getClass();
                }
                if (!arrayList2.isEmpty()) {
                    c9383.f25608.m49100().getClass();
                }
                if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    if (m13524(c9383, vectorMo4137, arrayList, listAsList)) {
                        return true;
                    }
                    return m13524(c9383, vectorMo4137, arrayList2, listAsList);
                }
            }
            return m13524(c9383, vectorMo4137, listAsList2, listAsList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m13524(C9383 c9383, Vector vector, List list, List list2) throws IOException {
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
        int i2 = c9383.f25611;
        C21769 c21769 = c9383.f25608;
        if (i2 >= c9383.f25592) {
            return false;
        }
        boolean zEquals = c9383.m21829("enable_pubkey_auth_query").equals("yes");
        boolean zEquals2 = c9383.m21829("try_additional_pubkey_algorithms").equals("yes");
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
        byte[] bArrM46886 = C20764.m46886(this.f31749, StandardCharsets.UTF_8);
        Iterator it3 = vector.iterator();
        List list4 = list2;
        while (it3.hasNext()) {
            InterfaceC2992 interfaceC2992 = (InterfaceC2992) it3.next();
            if (c9383.f25611 >= c9383.f25592) {
                return false;
            }
            int i3 = 5;
            while (true) {
                if (!interfaceC2992.mo5031()) {
                    bytes = null;
                } else {
                    if (this.f31748 == null) {
                        throw new C14392("USERAUTH fail");
                    }
                    if (interfaceC2992.mo5031() && !this.f31748.mo6783()) {
                        throw new C5675("publickey");
                    }
                    String strMo6780 = this.f31748.mo6780();
                    if (strMo6780 != null) {
                        byte[] bArr = C20764.f65273;
                        bytes = strMo6780.getBytes(StandardCharsets.UTF_8);
                    } else {
                        bytes = null;
                    }
                }
                if (!(interfaceC2992.mo5031() && bytes == null) && interfaceC2992.mo5027(bytes)) {
                    if (bytes == null || !(c21769.m49098() instanceof C10369)) {
                        break;
                        break;
                    }
                    ((C10369) c21769.m49098()).m24008();
                    break;
                }
                C20764.m46890(bytes);
                i3--;
                if (i3 == 0) {
                    bytes = null;
                    break;
                }
                list4 = list2;
            }
            C20764.m46890(bytes);
            String strMo5026 = interfaceC2992.mo5026();
            if (strMo5026.equals(str)) {
                arrayList = new ArrayList(arrayList5);
            } else if (arrayList6.contains(strMo5026)) {
                ArrayList arrayList7 = new ArrayList(1);
                arrayList7.add(strMo5026);
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
                c21769.m49100().getClass();
            } else {
                char c = 5;
                while (true) {
                    if (arrayList.isEmpty()) {
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = arrayList5;
                        if (c9383.f25611 < c9383.f25592) {
                            byte[] bArrMo5029 = interfaceC2992.mo5029();
                            if (bArrMo5029 == null || !zEquals) {
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
                                        c21769.m49100().getClass();
                                    } else {
                                        arrayList3 = arrayList6;
                                        this.f31747.m23425();
                                        it = it3;
                                        this.f31746.m40448((byte) 50);
                                        this.f31746.m40470(bArrM46886);
                                        C17823 c17823 = this.f31746;
                                        Charset charset = StandardCharsets.UTF_8;
                                        str2 = str;
                                        c17823.m40470("ssh-connection".getBytes(charset));
                                        this.f31746.m40470("publickey".getBytes(charset));
                                        this.f31746.m40448((byte) 0);
                                        this.f31746.m40470(C20764.m46886(str4, charset));
                                        C17823 c17824 = this.f31746;
                                        c17824.getClass();
                                        c17824.m40466(0, bArrMo5029.length, bArrMo5029);
                                        c9383.m21845(this.f31747);
                                        while (true) {
                                            C17823 c17825 = this.f31746;
                                            c9383.m21836(c17825);
                                            this.f31746 = c17825;
                                            i = c17825.f53185[c] & 255;
                                            if (i != 60) {
                                                if (i != 51) {
                                                    if (i != 53) {
                                                        c21769.m49100().getClass();
                                                        break;
                                                    }
                                                    c17825.m40464();
                                                    this.f31746.m40447();
                                                    this.f31746.m40447();
                                                    byte[] bArrM40471 = this.f31746.m40471();
                                                    this.f31746.m40471();
                                                    String str5 = str4;
                                                    new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                                                    str4 = str5;
                                                    list4 = list4;
                                                } else {
                                                    c21769.m49100().getClass();
                                                    break;
                                                }
                                            } else {
                                                c21769.m49100().getClass();
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
                            if (!interfaceC2992.mo5031()) {
                                if (bArrMo5029 == null) {
                                    bArrMo5029 = interfaceC2992.mo5029();
                                }
                                if (bArrMo5029 != null) {
                                    if (arrayList4 == null) {
                                        arrayList4 = arrayList;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        Iterator it5 = arrayList4.iterator();
                                        List list5 = list3;
                                        while (true) {
                                            if (!it5.hasNext() || c9383.f25611 >= c9383.f25592) {
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
                                                    c21769.m49100().getClass();
                                                } else {
                                                    this.f31747.m23425();
                                                    this.f31746.m40448((byte) 50);
                                                    this.f31746.m40470(bArrM46886);
                                                    C17823 c17826 = this.f31746;
                                                    Charset charset2 = StandardCharsets.UTF_8;
                                                    c17826.m40470("ssh-connection".getBytes(charset2));
                                                    this.f31746.m40470("publickey".getBytes(charset2));
                                                    this.f31746.m40448((byte) 1);
                                                    this.f31746.m40470(C20764.m46886(str6, charset2));
                                                    C17823 c17827 = this.f31746;
                                                    c17827.getClass();
                                                    c17827.m40466(0, bArrMo5029.length, bArrMo5029);
                                                    byte[] bArrM21846 = c9383.m21846();
                                                    int length = bArrM21846.length;
                                                    int i5 = length + 4;
                                                    byte[] bArr2 = new byte[(this.f31746.f53186 + i5) - 5];
                                                    Iterator it6 = it5;
                                                    bArr2[0] = (byte) (length >>> 24);
                                                    bArr2[1] = (byte) (length >>> 16);
                                                    bArr2[2] = (byte) (length >>> 8);
                                                    byte[] bArr3 = bArrMo5029;
                                                    bArr2[3] = (byte) length;
                                                    System.arraycopy(bArrM21846, 0, bArr2, 4, length);
                                                    C17823 c17828 = this.f31746;
                                                    System.arraycopy(c17828.f53185, 5, bArr2, i5, c17828.f53186 - 5);
                                                    byte[] bArrMo5028 = interfaceC2992.mo5028(str6, bArr2);
                                                    if (bArrMo5028 != null) {
                                                        C17823 c17829 = this.f31746;
                                                        c17829.getClass();
                                                        c17829.m40466(0, bArrMo5028.length, bArrMo5028);
                                                        c9383.m21845(this.f31747);
                                                        while (true) {
                                                            C17823 c178210 = this.f31746;
                                                            c9383.m21836(c178210);
                                                            this.f31746 = c178210;
                                                            int i6 = c178210.f53185[5] & 255;
                                                            if (i6 != 52) {
                                                                if (i6 != 53) {
                                                                    if (i6 != 51) {
                                                                        c21769.m49100().getClass();
                                                                        break;
                                                                    }
                                                                    c178210.m40464();
                                                                    this.f31746.m40447();
                                                                    this.f31746.m40447();
                                                                    byte[] bArrM40472 = this.f31746.m40471();
                                                                    if (this.f31746.m40447() != 0) {
                                                                        throw new C8357(new String(bArrM40472, 0, bArrM40472.length, StandardCharsets.UTF_8));
                                                                    }
                                                                    c9383.f25611++;
                                                                    c21769.m49100().getClass();
                                                                    if (c9383.f25611 < c9383.f25592) {
                                                                        if (!zEquals2) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    return false;
                                                                }
                                                                c178210.m40464();
                                                                this.f31746.m40447();
                                                                this.f31746.m40447();
                                                                byte[] bArrM40473 = this.f31746.m40471();
                                                                this.f31746.m40471();
                                                                new String(bArrM40473, 0, bArrM40473.length, StandardCharsets.UTF_8);
                                                            } else {
                                                                c21769.m49100().getClass();
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        c21769.m49100().getClass();
                                                    }
                                                    list5 = list2;
                                                    it5 = it6;
                                                    bArrMo5029 = bArr3;
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
