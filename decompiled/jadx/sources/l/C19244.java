package l;

/* JADX INFO: renamed from: l.᩵ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19244 extends C0192 {
    @Override // l.C0192
    public final C0192 d(String str, String str2, C0192 c0192) {
        return new C19244(str, str2, c0192);
    }

    @Override // l.C0192
    public final boolean b(char c, char c2) {
        return C3015.b(c, c2);
    }

    @Override // l.C0192
    public final boolean e(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!C3015.b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
