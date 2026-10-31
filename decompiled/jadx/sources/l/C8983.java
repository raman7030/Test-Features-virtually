package l;

import com.umeng.analytics.pro.cb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8983 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f27300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f27301;

    /* JADX WARN: Multi-variable type inference failed */
    public C8983(String str, String str2, List list) {
        super(str);
        C22632.m50631(!((AbstractCollection) list).isEmpty());
        this.f27300 = str2;
        AbstractC14545 abstractC14545CopyOf = AbstractC14545.copyOf((Collection) list);
        this.f27301 = abstractC14545CopyOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    @Override // l.AbstractC14626, l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        byte b;
        switch (this.f44734) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = cb.k;
                break;
            case "TDRC":
                b = cb.f77931l;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        AbstractC14545 abstractC14545 = this.f27301;
        try {
            switch (b) {
                case 0:
                case 10:
                    c18252.m42576((CharSequence) abstractC14545.get(0));
                    break;
                case 1:
                case 11:
                    c18252.m42584((CharSequence) abstractC14545.get(0));
                    break;
                case 2:
                case 13:
                    String str = (String) abstractC14545.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    c18252.m42581(Integer.valueOf(i));
                    c18252.m42577(Integer.valueOf(i2));
                    break;
                case 3:
                case 18:
                    c18252.m42580((CharSequence) abstractC14545.get(0));
                    break;
                case 4:
                case 19:
                    c18252.m42569((CharSequence) abstractC14545.get(0));
                    break;
                case 5:
                case 20:
                    c18252.m42582((CharSequence) abstractC14545.get(0));
                    break;
                case 6:
                case 21:
                    String str2 = (String) abstractC14545.get(0);
                    String str3 = C3603.f11424;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c18252.m42575(Integer.valueOf(i3));
                    c18252.m42587(numValueOf);
                    break;
                case 7:
                case 17:
                    c18252.m42586((CharSequence) abstractC14545.get(0));
                    break;
                case 8:
                case 16:
                    c18252.m42574((CharSequence) abstractC14545.get(0));
                    break;
                case 9:
                case 22:
                    c18252.m42585(Integer.valueOf(Integer.parseInt((String) abstractC14545.get(0))));
                    break;
                case 12:
                    Integer numM32447 = C13426.m32447((String) abstractC14545.get(0));
                    if (numM32447 == null) {
                        c18252.m42588((CharSequence) abstractC14545.get(0));
                    } else {
                        String strM52477 = C23799.m52477(numM32447.intValue());
                        if (strM52477 != null) {
                            c18252.m42588(strM52477);
                        }
                    }
                    break;
                case 14:
                    ArrayList arrayListM23219 = m23219((String) abstractC14545.get(0));
                    int size = arrayListM23219.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c18252.m42577((Integer) arrayListM23219.get(2));
                            }
                        }
                        c18252.m42581((Integer) arrayListM23219.get(1));
                    }
                    c18252.m42585((Integer) arrayListM23219.get(0));
                    break;
                case 15:
                    ArrayList arrayListM232110 = m23219((String) abstractC14545.get(0));
                    int size2 = arrayListM232110.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c18252.m42583((Integer) arrayListM232110.get(2));
                            }
                        }
                        c18252.m42579((Integer) arrayListM232110.get(1));
                    }
                    c18252.m42589((Integer) arrayListM232110.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8983.class == obj.getClass()) {
            C8983 c8983 = (C8983) obj;
            if (C11003.equals(this.f44734, c8983.f44734) && C11003.equals(this.f27300, c8983.f27300) && this.f27301.equals(c8983.f27301)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM27349 = C11010.m27349(527, 31, this.f44734);
        String str = this.f27300;
        return this.f27301.hashCode() + ((iM27349 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": description=" + this.f27300 + ": values=" + this.f27301;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23219(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
