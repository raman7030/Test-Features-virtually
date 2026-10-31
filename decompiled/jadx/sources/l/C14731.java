package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܳ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14731 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44983;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f44984;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f44985;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f44986;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f44987;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f44988;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f44989;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f44990;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f44991;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f44992;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f44993;

    public C14731(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f44993 = i;
        this.f44983 = i2;
        this.f44992 = i3;
        this.f44984 = i4;
        this.f44991 = i5;
        this.f44987 = i6;
        this.f44990 = i7;
        this.f44985 = i8;
        this.f44986 = i9;
        this.f44989 = i10;
        this.f44988 = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14731 m35039(String str) {
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
            String strM35799 = C15107.m35799(strArrSplit[i11].trim());
            strM35799.getClass();
            switch (strM35799) {
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
            return new C14731(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
        }
        return null;
    }
}
