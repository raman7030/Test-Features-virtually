package l;

/* JADX INFO: renamed from: l.۬ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8N3 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class C13010 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f38947;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f38948;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C13010(String str, String str2) {
        this.f38947 = C15107.m35802(str);
        this.f38948 = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        String str = this.f38947;
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
        String str2 = this.f38948;
        switch (b) {
            case 0:
                Integer numM32447 = C13426.m32447(str2);
                if (numM32447 != null) {
                    c18252.m42587(numM32447);
                }
                break;
            case 1:
                Integer numM32448 = C13426.m32447(str2);
                if (numM32448 != null) {
                    c18252.m42573(numM32448);
                }
                break;
            case 2:
                Integer numM32449 = C13426.m32447(str2);
                if (numM32449 != null) {
                    c18252.m42575(numM32449);
                }
                break;
            case 3:
                c18252.m42576(str2);
                break;
            case 4:
                c18252.m42588(str2);
                break;
            case 5:
                c18252.m42586(str2);
                break;
            case 6:
                c18252.m42578(str2);
                break;
            case 7:
                Integer numM324410 = C13426.m32447(str2);
                if (numM324410 != null) {
                    c18252.m42570(numM324410);
                }
                break;
            case 8:
                c18252.m42569(str2);
                break;
            case 9:
                c18252.m42580(str2);
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f38947 + "=" + this.f38948;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C13010 c13010 = (C13010) obj;
            if (this.f38947.equals(c13010.f38947) && this.f38948.equals(c13010.f38948)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38948.hashCode() + C11010.m27349(527, 31, this.f38947);
    }
}
