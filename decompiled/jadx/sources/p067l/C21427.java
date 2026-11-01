package p067l;

/* JADX INFO: renamed from: l.᩶۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21427 {
    /* JADX INFO: renamed from: ֫ */
    public static void m48556(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM49005 = C21720.m49005("fromIndex: ", i, ", toIndex: ", ", size: ", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C19768.m44907("fromIndex: ", i, i2, " > toIndex: "));
        }
    }
}
