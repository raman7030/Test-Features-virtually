package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩳ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8J7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19723 {

    /* JADX INFO: renamed from: ֫ */
    public final int f60000;

    /* JADX INFO: renamed from: ۧ */
    public final int f60001;

    /* JADX INFO: renamed from: ܳ */
    public final int f60002;

    /* JADX INFO: renamed from: ܽ */
    public final int f60003;

    /* JADX INFO: renamed from: ܿ */
    public final int f60004;

    /* JADX INFO: renamed from: ᩳ */
    public final int f60005;

    public C19723(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f60001 = i;
        this.f60005 = i2;
        this.f60000 = i3;
        this.f60004 = i4;
        this.f60002 = i5;
        this.f60003 = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX INFO: renamed from: ֫ */
    public static C19723 m44855(String str) {
        C23877.m52957(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strM37957 = C16726.m37957(strArrSplit[i6].trim());
            strM37957.getClass();
            switch (strM37957) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "layer":
                    i = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new C19723(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
