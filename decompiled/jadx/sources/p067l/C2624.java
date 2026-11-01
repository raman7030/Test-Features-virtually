package p067l;

/* JADX INFO: renamed from: l.֡۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C2624 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        boolean z;
        c4697.m9955("local");
        String[] strArr = (String[]) C7480.stream(c4697.m9957()).map(new C4055(1)).toArray(new C20731());
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else {
                if (!strArr[i].toLowerCase().endsWith(".apk")) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        C16590.m37592(c4697.m9969(), strArr, strArr.length == 1 ? C23527.m52306(C18524.m42109(strArr[0], new String[0])) : null, z, false);
    }
}
