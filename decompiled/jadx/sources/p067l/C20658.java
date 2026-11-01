package p067l;

/* JADX INFO: renamed from: l.᩵ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20658 extends C2551 {
    @Override // p067l.C2551
    /* JADX INFO: renamed from: d */
    public final C2551 mo3745d(String str, String str2, C2551 c2551) {
        return new C20658(str, str2, c2551);
    }

    @Override // p067l.C2551
    /* JADX INFO: renamed from: b */
    public final boolean mo3743b(char c, char c2) {
        return C5234.m11286b(c, c2);
    }

    @Override // p067l.C2551
    /* JADX INFO: renamed from: e */
    public final boolean mo3746e(CharSequence charSequence, int i, int i2) {
        int length = this.f4203a.length();
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
            if (!C5234.m11286b(this.f4203a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
