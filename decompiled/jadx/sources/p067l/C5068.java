package p067l;

/* JADX INFO: renamed from: l.ۖ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5068 implements InterfaceC11100 {
    @Override // p067l.InterfaceC11100
    /* JADX INFO: renamed from: ֫ */
    public final int mo10800(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        int length = charSequence.length();
        if (length < 100) {
            return charSequence.hashCode();
        }
        return charSequence.charAt(length / 2) | (length << 16);
    }

    @Override // p067l.InterfaceC11100
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10801(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence instanceof C22700) {
            C22700 c22700 = (C22700) charSequence;
            if (charSequence2 instanceof C22700) {
                return c22700.equals((C22700) charSequence2);
            }
            return c22700.m50811(charSequence2);
        }
        if (charSequence2 instanceof C22700) {
            return ((C22700) charSequence2).m50811(charSequence);
        }
        return charSequence.equals(charSequence2);
    }
}
