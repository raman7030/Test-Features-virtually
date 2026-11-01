package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܳ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16369 {

    /* JADX INFO: renamed from: ֫ */
    public final int f48096;

    /* JADX INFO: renamed from: ۜ */
    public final int f48097;

    /* JADX INFO: renamed from: ۡ */
    public final int f48098;

    /* JADX INFO: renamed from: ۢ */
    public final int f48099;

    /* JADX INFO: renamed from: ۧ */
    public final int f48100;

    /* JADX INFO: renamed from: ܳ */
    public final int f48101;

    /* JADX INFO: renamed from: ܽ */
    public final int f48102;

    /* JADX INFO: renamed from: ܿ */
    public final int f48103;

    /* JADX INFO: renamed from: ᩳ */
    public final int f48104;

    /* JADX INFO: renamed from: ᩷ */
    public final int f48105;

    /* JADX INFO: renamed from: ᩻ */
    public final int f48106;

    public C16369(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f48106 = i;
        this.f48096 = i2;
        this.f48105 = i3;
        this.f48097 = i4;
        this.f48104 = i5;
        this.f48100 = i6;
        this.f48103 = i7;
        this.f48098 = i8;
        this.f48099 = i9;
        this.f48102 = i10;
        this.f48101 = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX INFO: renamed from: ֫ */
    public static C16369 m37186(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String strM37957 = C16726.m37957(strArrSplit[i11].trim());
            strM37957.getClass();
            switch (strM37957) {
                case "italic":
                    i7 = i11;
                    break;
                case "underline":
                    i8 = i11;
                    break;
                case "strikeout":
                    i9 = i11;
                    break;
                case "primarycolour":
                    i3 = i11;
                    break;
                case "bold":
                    i6 = i11;
                    break;
                case "name":
                    i = i11;
                    break;
                case "fontsize":
                    i5 = i11;
                    break;
                case "borderstyle":
                    i10 = i11;
                    break;
                case "alignment":
                    i2 = i11;
                    break;
                case "outlinecolour":
                    i4 = i11;
                    break;
            }
        }
        if (i != -1) {
            return new C16369(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
        }
        return null;
    }
}
