package p067l;

/* JADX INFO: renamed from: l.ᩳܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55UE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19596 extends AbstractC17054 {
    public C19596(AbstractC17054 abstractC17054) {
        super(589824, abstractC17054);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29016(Object obj) {
        if (obj == null) {
            mo30323(1);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue >= -1 && iIntValue <= 5) {
                mo30323(iIntValue + 3);
                return;
            }
            if (iIntValue <= 127 && iIntValue >= -128) {
                mo30334(16, iIntValue);
                return;
            } else if (iIntValue <= 32767 && iIntValue >= -32768) {
                mo30334(17, iIntValue);
                return;
            } else {
                super.mo29016(obj);
                return;
            }
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            if (jLongValue == 0 || jLongValue == 1) {
                mo30323(((int) jLongValue) + 9);
                return;
            } else {
                super.mo29016(obj);
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (fFloatValue == 0.0f) {
                mo30323(11);
                return;
            }
            if (fFloatValue == 1.0f) {
                mo30323(12);
                return;
            } else if (fFloatValue == 2.0f) {
                mo30323(13);
                return;
            } else {
                super.mo29016(obj);
                return;
            }
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue == 0.0d) {
                mo30323(14);
                return;
            } else if (dDoubleValue == 1.0d) {
                mo30323(15);
                return;
            } else {
                super.mo29016(obj);
                return;
            }
        }
        if (obj instanceof C13703) {
            switch (((C13703) obj).m31155()) {
                case 1:
                    mo29017("java/lang/Boolean", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 2:
                    mo29017("java/lang/Character", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 3:
                    mo29017("java/lang/Byte", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 4:
                    mo29017("java/lang/Short", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 5:
                    mo29017("java/lang/Integer", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 6:
                    mo29017("java/lang/Float", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 7:
                    mo29017("java/lang/Long", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 8:
                    mo29017("java/lang/Double", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                default:
                    super.mo29016(obj);
                    break;
            }
            return;
        }
        super.mo29016(obj);
    }
}
