package p067l;

import android.text.GetChars;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.֡۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B94 */
/* JADX INFO: loaded from: classes2.dex */
public class C2758 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩸ */
    public final String f4641;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C4405.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C4405.convert(codePoints());
    }

    public C2758(String str) {
        this.f4641 = str;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4641.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4641.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f4641.substring(i, i2);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13123 chars() {
        return C9453.convert(this.f4641.chars());
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13123 codePoints() {
        return C9453.convert(this.f4641.codePoints());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4641;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f4641.getChars(i, i2, cArr, i3);
    }
}
