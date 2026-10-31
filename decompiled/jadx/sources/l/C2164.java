package l;

/* JADX INFO: renamed from: l.֫᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2164 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7153 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f7154 = new int[128];

    static {
        for (int i = 0; i < 128; i++) {
            f7154[i] = Character.getType(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m7146(int i) {
        if (i < 128) {
            return f7154[i];
        }
        return Character.getType(i);
    }
}
