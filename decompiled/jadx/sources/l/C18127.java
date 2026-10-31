package l;

/* JADX INFO: renamed from: l.ᩳܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55UE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18127 extends AbstractC15452 {
    public C18127(AbstractC15452 abstractC15452) {
        super(589824, abstractC15452);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26971(Object obj) {
        if (obj == null) {
            mo28279(1);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue >= -1 && iIntValue <= 5) {
                mo28279(iIntValue + 3);
                return;
            }
            if (iIntValue <= 127 && iIntValue >= -128) {
                mo28290(16, iIntValue);
                return;
            } else if (iIntValue <= 32767 && iIntValue >= -32768) {
                mo28290(17, iIntValue);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            if (jLongValue == 0 || jLongValue == 1) {
                mo28279(((int) jLongValue) + 9);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (fFloatValue == 0.0f) {
                mo28279(11);
                return;
            }
            if (fFloatValue == 1.0f) {
                mo28279(12);
                return;
            } else if (fFloatValue == 2.0f) {
                mo28279(13);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue == 0.0d) {
                mo28279(14);
                return;
            } else if (dDoubleValue == 1.0d) {
                mo28279(15);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof C11926) {
            switch (((C11926) obj).m29102()) {
                case 1:
                    mo26972("java/lang/Boolean", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 2:
                    mo26972("java/lang/Character", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 3:
                    mo26972("java/lang/Byte", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 4:
                    mo26972("java/lang/Short", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 5:
                    mo26972("java/lang/Integer", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 6:
                    mo26972("java/lang/Float", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 7:
                    mo26972("java/lang/Long", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 8:
                    mo26972("java/lang/Double", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                default:
                    super.mo26971(obj);
                    break;
            }
            return;
        }
        super.mo26971(obj);
    }
}
