package l;

/* JADX INFO: renamed from: l.۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7665 extends AbstractC12604 {
    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20463(C1462 c1462, Thread thread) {
        c1462.f5215 = thread;
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20464(C1462 c1462, C1462 c1463) {
        c1462.f5214 = c1463;
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20466(AbstractC10635 abstractC10635, C1462 c1462, C1462 c1463) {
        synchronized (abstractC10635) {
            if (abstractC10635.f31970 != c1462) {
                return false;
            }
            abstractC10635.f31970 = c1463;
            return true;
        }
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20467(AbstractC10635 abstractC10635, C11899 c11899, C11899 c118910) {
        synchronized (abstractC10635) {
            if (abstractC10635.f31971 != c11899) {
                return false;
            }
            abstractC10635.f31971 = c118910;
            return true;
        }
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20465(AbstractC10635 abstractC10635, Object obj, Object obj2) {
        synchronized (abstractC10635) {
            if (abstractC10635.f31972 != obj) {
                return false;
            }
            abstractC10635.f31972 = obj2;
            return true;
        }
    }
}
