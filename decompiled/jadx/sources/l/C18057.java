package l;

import android.text.TextUtils;
import bin.mt.plugin.api.editor.BufferedText;
import bin.mt.plugin.api.regex.Matcher;
import bin.mt.plugin.api.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C18057 implements BufferedText, InterfaceC4403 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17351 f56267;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f56268;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15089 f56269;

    public C18057(C17351 c17351) {
        this.f56267 = c17351;
        InterfaceC7785 interfaceC7785M30436 = c17351.f53150.m30436();
        this.f56268 = interfaceC7785M30436;
        this.f56269 = new C15089(interfaceC7785M30436);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c) {
        return this.f56269.indexOf(c, 0);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i) {
        return this.f56269.indexOf(c, i);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i, int i2) {
        return this.f56269.indexOf(c, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str) {
        if (str.length() == 1) {
            return this.f56269.indexOf(str.charAt(0), 0);
        }
        return TextUtils.indexOf(this.f56269, str);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i) {
        if (str.length() == 1) {
            return this.f56269.indexOf(str.charAt(0), i);
        }
        return TextUtils.indexOf(this.f56269, str, i);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f56269.indexOf(str.charAt(0), i, i2);
        }
        return TextUtils.indexOf(this.f56269, str, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c) {
        C15089 c15089 = this.f56269;
        return c15089.lastIndexOf(c, 0, c15089.length());
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i) {
        return this.f56269.lastIndexOf(c, 0, i + 1);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i, int i2) {
        return this.f56269.lastIndexOf(c, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str) {
        if (str.length() == 1) {
            return this.f56269.lastIndexOf(str.charAt(0), 0, this.f56269.length());
        }
        C15089 c15089 = this.f56269;
        return C3939.m11982(0, c15089.length(), c15089, str);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i) {
        if (str.length() != 1) {
            return C3939.m11982(0, i + 1, this.f56269, str);
        }
        return this.f56269.lastIndexOf(str.charAt(0), 0, i + 1);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f56269.lastIndexOf(str.charAt(0), i, i2);
        }
        return C3939.m11982(i, i2, this.f56269, str);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final void reset() {
        C17351 c17351 = this.f56267;
        C17351.m40673(c17351);
        InterfaceC7785 interfaceC7785M30436 = c17351.f53150.m30436();
        if (interfaceC7785M30436 != this.f56268) {
            this.f56269 = new C15089(interfaceC7785M30436);
            this.f56268 = interfaceC7785M30436;
        } else {
            this.f56269.reset();
        }
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int count(int i, int i2, char c) {
        return this.f56269.count(i, i2, c);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int findLineStart(int i) {
        return this.f56269.lastIndexOf('\n', 0, i) + 1;
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int findLineEnd(int i) {
        int iIndexOf = this.f56269.indexOf('\n', i);
        return iIndexOf == -1 ? this.f56269.length() : iIndexOf;
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final Matcher matcher(Pattern pattern) {
        return pattern.matcher(this.f56269);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final Matcher matcher(String str) {
        return C11459.m28260(str).matcher((CharSequence) this.f56269);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f56269.getChars(i, i2, cArr, i3);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f56269.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f56269.length();
    }

    @Override // bin.mt.plugin.api.editor.BufferedText, java.lang.CharSequence
    public final String toString() {
        return this.f56269.subSequence(0, this.f56269.length()).toString();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f56269.subSequence(i, i2);
    }

    @Override // l.InterfaceC4403
    /* JADX INFO: renamed from: ۧ */
    public final CharSequence mo13128() {
        return this.f56269;
    }
}
