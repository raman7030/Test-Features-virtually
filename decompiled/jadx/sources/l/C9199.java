package l;

import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ۡ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9199 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int[] f27874;

    static {
        int[] iArr = new int[PropID.values().length];
        f27874 = iArr;
        try {
            iArr[PropID.SIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27874[PropID.PACKED_SIZE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27874[PropID.IS_FOLDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f27874[PropID.ENCRYPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f27874[PropID.TIME_TYPE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
