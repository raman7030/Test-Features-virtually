package p067l;

/* JADX INFO: renamed from: l.᩸ۤ */
/* JADX INFO: compiled from: F5I3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1909 implements InterfaceC1944 {

    /* JADX INFO: renamed from: ֫ */
    public static final C1909 f71865 = new C1909();

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // p067l.InterfaceC1944
    /* JADX INFO: renamed from: ֫ */
    public final int mo51015(int i, CharSequence charSequence) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            InterfaceC1594 interfaceC1594 = C0999.f12761;
            if (directionality == 0) {
                i2 = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        i2 = 1;
                        break;
                    case 16:
                    case 17:
                        i2 = 0;
                        break;
                    default:
                        i2 = 2;
                        break;
                }
            } else {
                i2 = 0;
            }
        }
        return i2;
    }
}
