package l;

/* JADX INFO: renamed from: l.᩶۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20053 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46240(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM46682 = C20361.m46682("fromIndex: ", i, ", toIndex: ", ", size: ", i2);
            sbM46682.append(i3);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C18307.m42646("fromIndex: ", i, i2, " > toIndex: "));
        }
    }
}
