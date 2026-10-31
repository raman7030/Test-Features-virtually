package l;

/* JADX INFO: renamed from: l.۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class C7425 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f22815;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7425[] f22816;

    public C7425(String str, C7425... c7425Arr) {
        this.f22815 = str;
        this.f22816 = c7425Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo19958(Object obj) {
        C16719 c16719 = (C16719) obj;
        Object[] objArrM39354 = c16719.m39354();
        if (c16719.mo29298().matches(this.f22815)) {
            C7425[] c7425Arr = this.f22816;
            if (c7425Arr.length == c16719.m39354().length) {
                for (int i = 0; i < objArrM39354.length; i++) {
                    if (!c7425Arr[i].mo19958(objArrM39354[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
