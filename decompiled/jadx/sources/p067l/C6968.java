package p067l;

/* JADX INFO: renamed from: l.ۙᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91N0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6968 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Integer m15963(InterfaceC14344 interfaceC14344, Object obj, Integer num) {
        boolean zContainsKey = interfaceC14344.containsKey(obj);
        int iMo23936 = interfaceC14344.mo23936(num.intValue(), obj);
        if (zContainsKey) {
            return Integer.valueOf(iMo23936);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m15962(InterfaceC14344 interfaceC14344, Object obj, C16102 c16102) {
        int iMo23939 = interfaceC14344.mo23939(obj);
        if (iMo23939 != 0 || interfaceC14344.containsKey(obj)) {
            return iMo23939;
        }
        int iMo239310 = c16102.mo23939(obj);
        interfaceC14344.mo23936(iMo239310, obj);
        return iMo239310;
    }
}
