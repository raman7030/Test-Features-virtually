package l;

/* JADX INFO: renamed from: l.᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5I3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21509 implements InterfaceC22214 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21509 f69169 = new C21509();

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // l.InterfaceC22214
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo48678(int i, CharSequence charSequence) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            InterfaceC15157 interfaceC15157 = C3164.f9958;
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
