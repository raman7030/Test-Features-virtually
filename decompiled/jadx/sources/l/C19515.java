package l;

/* JADX INFO: renamed from: l.᩵ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AR0 */
/* JADX INFO: loaded from: classes5.dex */
public class C19515 implements InterfaceC16174 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63074;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8931 f63075;

    @Override // l.InterfaceC16174
    public int getChildCount() {
        throw null;
    }

    @Override // l.InterfaceC16174
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC16174 mo23040(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo1085() {
        return -1;
    }

    @Override // l.InterfaceC16174
    public final String getText() {
        if (getChildCount() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getChildCount(); i++) {
            sb.append(mo23040(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (C19515 c19515 = this; c19515 != null; c19515 = c19515.f63075) {
            int i = c19515.f63074;
            if (i != -1) {
                sb.append(i);
            }
            C8931 c8931 = c19515.f63075;
            if (c8931 != null && c8931.f63074 != -1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
