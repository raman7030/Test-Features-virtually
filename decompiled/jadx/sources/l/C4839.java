package l;

/* JADX INFO: renamed from: l.ۙᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91N0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4839 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m14083(InterfaceC12600 interfaceC12600, Object obj, Integer num) {
        boolean zContainsKey = interfaceC12600.containsKey(obj);
        int iMo21965 = interfaceC12600.mo21965(num.intValue(), obj);
        if (zContainsKey) {
            return Integer.valueOf(iMo21965);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m14082(InterfaceC12600 interfaceC12600, Object obj, C14450 c14450) {
        int iMo21968 = interfaceC12600.mo21968(obj);
        if (iMo21968 != 0 || interfaceC12600.containsKey(obj)) {
            return iMo21968;
        }
        int iMo21969 = c14450.mo21968(obj);
        interfaceC12600.mo21965(iMo21969, obj);
        return iMo21969;
    }
}
