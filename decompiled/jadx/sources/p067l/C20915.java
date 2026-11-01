package p067l;

/* JADX INFO: renamed from: l.᩵ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AR0 */
/* JADX INFO: loaded from: classes5.dex */
public class C20915 implements InterfaceC17740 {

    /* JADX INFO: renamed from: ֫ */
    public int f65694;

    /* JADX INFO: renamed from: ۧ */
    public C10856 f65695;

    @Override // p067l.InterfaceC17740
    public int getChildCount() {
        throw null;
    }

    @Override // p067l.InterfaceC17740
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC17740 mo25014(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo3481() {
        return -1;
    }

    @Override // p067l.InterfaceC17740
    public final String getText() {
        if (getChildCount() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getChildCount(); i++) {
            sb.append(mo25014(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (C20915 c20915 = this; c20915 != null; c20915 = c20915.f65695) {
            int i = c20915.f65694;
            if (i != -1) {
                sb.append(i);
            }
            C10856 c10856 = c20915.f65695;
            if (c10856 != null && c10856.f65694 != -1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
