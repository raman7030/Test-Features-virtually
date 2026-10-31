package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܺۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15705 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int[] f48457;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f48457 = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48457[ImageView.ScaleType.FIT_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48457[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48457[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
