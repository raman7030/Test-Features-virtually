package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩳ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8J7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18260 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56783;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56784;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f56785;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f56786;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f56787;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56788;

    public C18260(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f56784 = i;
        this.f56788 = i2;
        this.f56783 = i3;
        this.f56787 = i4;
        this.f56785 = i5;
        this.f56786 = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18260 m42596(String str) {
        C22632.m50631(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strM35799 = C15107.m35799(strArrSplit[i6].trim());
            strM35799.getClass();
            switch (strM35799) {
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
        return new C18260(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
