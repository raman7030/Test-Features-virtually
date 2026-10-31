package l;

import android.text.GetChars;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.֡۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B94 */
/* JADX INFO: loaded from: classes2.dex */
public class C0410 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f1864;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C2142.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C2142.convert(codePoints());
    }

    public C0410(String str) {
        this.f1864 = str;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1864.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1864.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f1864.substring(i, i2);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC11315 chars() {
        return C7454.convert(this.f1864.chars());
    }

    @Override // java.lang.CharSequence
    public final InterfaceC11315 codePoints() {
        return C7454.convert(this.f1864.codePoints());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1864;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f1864.getChars(i, i2, cArr, i3);
    }
}
