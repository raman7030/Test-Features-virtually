package p067l;

import android.text.TextUtils;
import bin.p000mt.plugin.api.editor.BufferedText;
import bin.p000mt.plugin.api.regex.Matcher;
import bin.p000mt.plugin.api.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19530 implements BufferedText, InterfaceC6553 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C18859 f59469;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC9768 f59470;

    /* JADX INFO: renamed from: ᩹ */
    public C16709 f59471;

    public C19530(C18859 c18859) {
        this.f59469 = c18859;
        InterfaceC9768 interfaceC9768M32500 = c18859.f56334.m32500();
        this.f59470 = interfaceC9768M32500;
        this.f59471 = new C16709(interfaceC9768M32500);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int indexOf(char c) {
        return this.f59471.indexOf(c, 0);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i) {
        return this.f59471.indexOf(c, i);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i, int i2) {
        return this.f59471.indexOf(c, i, i2);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int indexOf(String str) {
        if (str.length() == 1) {
            return this.f59471.indexOf(str.charAt(0), 0);
        }
        return TextUtils.indexOf(this.f59471, str);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i) {
        if (str.length() == 1) {
            return this.f59471.indexOf(str.charAt(0), i);
        }
        return TextUtils.indexOf(this.f59471, str, i);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f59471.indexOf(str.charAt(0), i, i2);
        }
        return TextUtils.indexOf(this.f59471, str, i, i2);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c) {
        C16709 c16709 = this.f59471;
        return c16709.lastIndexOf(c, 0, c16709.length());
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i) {
        return this.f59471.lastIndexOf(c, 0, i + 1);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i, int i2) {
        return this.f59471.lastIndexOf(c, i, i2);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str) {
        if (str.length() == 1) {
            return this.f59471.lastIndexOf(str.charAt(0), 0, this.f59471.length());
        }
        C16709 c16709 = this.f59471;
        return C6112.m13902(0, c16709.length(), c16709, str);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i) {
        if (str.length() != 1) {
            return C6112.m13902(0, i + 1, this.f59471, str);
        }
        return this.f59471.lastIndexOf(str.charAt(0), 0, i + 1);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f59471.lastIndexOf(str.charAt(0), i, i2);
        }
        return C6112.m13902(i, i2, this.f59471, str);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final void reset() {
        C18859 c18859 = this.f59469;
        C18859.m42925(c18859);
        InterfaceC9768 interfaceC9768M32500 = c18859.f56334.m32500();
        if (interfaceC9768M32500 != this.f59470) {
            this.f59471 = new C16709(interfaceC9768M32500);
            this.f59470 = interfaceC9768M32500;
        } else {
            this.f59471.reset();
        }
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int count(int i, int i2, char c) {
        return this.f59471.count(i, i2, c);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int findLineStart(int i) {
        return this.f59471.lastIndexOf('\n', 0, i) + 1;
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final int findLineEnd(int i) {
        int iIndexOf = this.f59471.indexOf('\n', i);
        return iIndexOf == -1 ? this.f59471.length() : iIndexOf;
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final Matcher matcher(Pattern pattern) {
        return pattern.matcher(this.f59471);
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText
    public final Matcher matcher(String str) {
        return C13259.m30304(str).matcher((CharSequence) this.f59471);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f59471.getChars(i, i2, cArr, i3);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f59471.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f59471.length();
    }

    @Override // bin.p000mt.plugin.api.editor.BufferedText, java.lang.CharSequence
    public final String toString() {
        return this.f59471.subSequence(0, this.f59471.length()).toString();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f59471.subSequence(i, i2);
    }

    @Override // p067l.InterfaceC6553
    /* JADX INFO: renamed from: ۧ */
    public final CharSequence mo14992() {
        return this.f59471;
    }
}
