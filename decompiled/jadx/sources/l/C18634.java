package l;

/* JADX INFO: renamed from: l.ᩴ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18634 implements InterfaceC9187 {
    @Override // l.InterfaceC9187
    /* JADX INFO: renamed from: ֫ */
    public final int mo8733(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence == null) {
            return -1;
        }
        return charSequence.length();
    }

    @Override // l.InterfaceC9187
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8734(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        return (charSequence == null ? -1 : charSequence.length()) == (charSequence2 != null ? charSequence2.length() : -1);
    }
}
