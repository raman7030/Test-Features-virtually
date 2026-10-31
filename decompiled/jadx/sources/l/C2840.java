package l;

/* JADX INFO: renamed from: l.ۖ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2840 implements InterfaceC9187 {
    @Override // l.InterfaceC9187
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8733(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        int length = charSequence.length();
        if (length < 100) {
            return charSequence.hashCode();
        }
        return charSequence.charAt(length / 2) | (length << 16);
    }

    @Override // l.InterfaceC9187
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8734(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence instanceof C21393) {
            C21393 c21393 = (C21393) charSequence;
            if (charSequence2 instanceof C21393) {
                return c21393.equals((C21393) charSequence2);
            }
            return c21393.m48475(charSequence2);
        }
        if (charSequence2 instanceof C21393) {
            return ((C21393) charSequence2).m48475(charSequence);
        }
        return charSequence.equals(charSequence2);
    }
}
