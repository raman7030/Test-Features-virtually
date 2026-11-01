package p067l;

/* JADX INFO: renamed from: l.۬ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8N3 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class C14733 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final String f41994;

    /* JADX INFO: renamed from: ۧ */
    public final String f41995;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    public C14733(String str, String str2) {
        this.f41994 = C16726.m37960(str);
        this.f41995 = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final void mo3422(C19715 c19715) {
        String str = this.f41994;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.f41995;
        switch (b) {
            case 0:
                Integer numM34549 = C15129.m34549(str2);
                if (numM34549 != null) {
                    c19715.m44846(numM34549);
                }
                break;
            case 1:
                Integer numM345410 = C15129.m34549(str2);
                if (numM345410 != null) {
                    c19715.m44832(numM345410);
                }
                break;
            case 2:
                Integer numM345411 = C15129.m34549(str2);
                if (numM345411 != null) {
                    c19715.m44834(numM345411);
                }
                break;
            case 3:
                c19715.m44835(str2);
                break;
            case 4:
                c19715.m44847(str2);
                break;
            case 5:
                c19715.m44845(str2);
                break;
            case 6:
                c19715.m44837(str2);
                break;
            case 7:
                Integer numM345412 = C15129.m34549(str2);
                if (numM345412 != null) {
                    c19715.m44829(numM345412);
                }
                break;
            case 8:
                c19715.m44828(str2);
                break;
            case 9:
                c19715.m44839(str2);
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f41994 + "=" + this.f41995;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C14733 c14733 = (C14733) obj;
            if (this.f41994.equals(c14733.f41994) && this.f41995.equals(c14733.f41995)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41995.hashCode() + C12832.m29411(527, 31, this.f41994);
    }
}
