package p067l;

/* JADX INFO: renamed from: l.֫᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4426 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f9939 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f9940 = new int[128];

    static {
        for (int i = 0; i < 128; i++) {
            f9940[i] = Character.getType(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m9241(int i) {
        if (i < 128) {
            return f9940[i];
        }
        return Character.getType(i);
    }
}
