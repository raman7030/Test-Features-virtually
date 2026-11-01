package p067l;

/* JADX INFO: renamed from: l.ۖۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4678 extends C19034 {
    /* JADX INFO: renamed from: ֨ */
    public final AbstractC17417 m9913() {
        return (AbstractC17417) m43238(size() - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9914(InterfaceC10713 interfaceC10713) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((AbstractC17417) m43238(i)).mo5818(interfaceC10713);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9915(C4678 c4678) {
        int size;
        if (c4678 != null && (size = size()) == c4678.size()) {
            for (int i = 0; i < size; i++) {
                if (((AbstractC17417) m43238(i)).mo18607((AbstractC17417) c4678.m43238(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
