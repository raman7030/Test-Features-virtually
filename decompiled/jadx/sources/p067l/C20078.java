package p067l;

/* JADX INFO: renamed from: l.ᩴ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20078 implements InterfaceC11100 {
    @Override // p067l.InterfaceC11100
    /* JADX INFO: renamed from: ֫ */
    public final int mo10800(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence == null) {
            return -1;
        }
        return charSequence.length();
    }

    @Override // p067l.InterfaceC11100
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10801(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        return (charSequence == null ? -1 : charSequence.length()) == (charSequence2 != null ? charSequence2.length() : -1);
    }
}
