package l;

/* JADX INFO: renamed from: l.ۖۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2430 extends C17535 {
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 m7865() {
        return (AbstractC15834) m40978(size() - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7866(InterfaceC8780 interfaceC8780) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((AbstractC15834) m40978(i)).mo3531(interfaceC8780);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7867(C2430 c2430) {
        int size;
        if (c2430 != null && (size = size()) == c2430.size()) {
            for (int i = 0; i < size; i++) {
                if (((AbstractC15834) m40978(i)).mo16681((AbstractC15834) c2430.m40978(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
