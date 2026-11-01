package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10906 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String f30235;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16192 f30236;

    /* JADX WARN: Multi-variable type inference failed */
    public C10906(String str, String str2, List list) {
        super(str);
        C23877.m52957(!((AbstractCollection) list).isEmpty());
        this.f30235 = str2;
        AbstractC16192 abstractC16192CopyOf = AbstractC16192.copyOf((Collection) list);
        this.f30236 = abstractC16192CopyOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    @Override // p067l.AbstractC16269, p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final void mo3422(C19715 c19715) {
        byte b;
        switch (this.f47841) {
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
                b = C0698cb.f2569k;
                break;
            case "TDRC":
                b = C0698cb.f2570l;
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
        AbstractC16192 abstractC16192 = this.f30236;
        try {
            switch (b) {
                case 0:
                case 10:
                    c19715.m44835((CharSequence) abstractC16192.get(0));
                    break;
                case 1:
                case 11:
                    c19715.m44843((CharSequence) abstractC16192.get(0));
                    break;
                case 2:
                case 13:
                    String str = (String) abstractC16192.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    c19715.m44840(Integer.valueOf(i));
                    c19715.m44836(Integer.valueOf(i2));
                    break;
                case 3:
                case 18:
                    c19715.m44839((CharSequence) abstractC16192.get(0));
                    break;
                case 4:
                case 19:
                    c19715.m44828((CharSequence) abstractC16192.get(0));
                    break;
                case 5:
                case 20:
                    c19715.m44841((CharSequence) abstractC16192.get(0));
                    break;
                case 6:
                case 21:
                    String str2 = (String) abstractC16192.get(0);
                    String str3 = C5792.f14228;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c19715.m44834(Integer.valueOf(i3));
                    c19715.m44846(numValueOf);
                    break;
                case 7:
                case 17:
                    c19715.m44845((CharSequence) abstractC16192.get(0));
                    break;
                case 8:
                case 16:
                    c19715.m44833((CharSequence) abstractC16192.get(0));
                    break;
                case 9:
                case 22:
                    c19715.m44844(Integer.valueOf(Integer.parseInt((String) abstractC16192.get(0))));
                    break;
                case 12:
                    Integer numM34549 = C15129.m34549((String) abstractC16192.get(0));
                    if (numM34549 == null) {
                        c19715.m44847((CharSequence) abstractC16192.get(0));
                    } else {
                        String strM54886 = C24987.m54886(numM34549.intValue());
                        if (strM54886 != null) {
                            c19715.m44847(strM54886);
                        }
                    }
                    break;
                case 14:
                    ArrayList arrayListM25163 = m25163((String) abstractC16192.get(0));
                    int size = arrayListM25163.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c19715.m44836((Integer) arrayListM25163.get(2));
                            }
                        }
                        c19715.m44840((Integer) arrayListM25163.get(1));
                    }
                    c19715.m44844((Integer) arrayListM25163.get(0));
                    break;
                case 15:
                    ArrayList arrayListM25164 = m25163((String) abstractC16192.get(0));
                    int size2 = arrayListM25164.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c19715.m44842((Integer) arrayListM25164.get(2));
                            }
                        }
                        c19715.m44838((Integer) arrayListM25164.get(1));
                    }
                    c19715.m44848((Integer) arrayListM25164.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10906.class == obj.getClass()) {
            C10906 c10906 = (C10906) obj;
            if (C12826.equals(this.f47841, c10906.f47841) && C12826.equals(this.f30235, c10906.f30235) && this.f30236.equals(c10906.f30236)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM29411 = C12832.m29411(527, 31, this.f47841);
        String str = this.f30235;
        return this.f30236.hashCode() + ((iM29411 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p067l.AbstractC16269
    public final String toString() {
        return this.f47841 + ": description=" + this.f30235 + ": values=" + this.f30236;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m25163(String str) {
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
