package p067l;

/* JADX INFO: renamed from: l.۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class C9425 {

    /* JADX INFO: renamed from: ֫ */
    public String f25728;

    /* JADX INFO: renamed from: ۧ */
    public C9425[] f25729;

    public C9425(String str, C9425... c9425Arr) {
        this.f25728 = str;
        this.f25729 = c9425Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo21932(Object obj) {
        C18258 c18258 = (C18258) obj;
        Object[] objArrM41590 = c18258.m41590();
        if (c18258.mo31353().matches(this.f25728)) {
            C9425[] c9425Arr = this.f25729;
            if (c9425Arr.length == c18258.m41590().length) {
                for (int i = 0; i < objArrM41590.length; i++) {
                    if (!c9425Arr[i].mo21932(objArrM41590[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
