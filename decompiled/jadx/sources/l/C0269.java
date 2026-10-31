package l;

/* JADX INFO: renamed from: l.֡۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0269 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        boolean z;
        c2450.m7907("local");
        String[] strArr = (String[]) C5378.stream(c2450.m7909()).map(new C1775(1)).toArray(new C19321());
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
        C14964.m35440(c2450.m7921(), strArr, strArr.length == 1 ? C22263.m49978(C16999.m39866(strArr[0], new String[0])) : null, z, false);
    }
}
