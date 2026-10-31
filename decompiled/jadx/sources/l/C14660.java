package l;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.ܳܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14660 implements Spannable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Spannable f44802;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44803 = false;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C2142.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C2142.convert(codePoints());
    }

    public C14660(Spannable spannable) {
        this.f44802 = spannable;
    }

    public C14660(CharSequence charSequence) {
        this.f44802 = new SpannableString(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m34947() {
        Spannable spannable = this.f44802;
        if (!this.f44803) {
            if ((Build.VERSION.SDK_INT < 28 ? new C18189() : new C17483()).mo40875(spannable)) {
                this.f44802 = new SpannableString(spannable);
            }
        }
        this.f44803 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spannable m34948() {
        return this.f44802;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m34947();
        this.f44802.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m34947();
        this.f44802.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f44802.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f44802.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f44802.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f44802.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f44802.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f44802.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f44802.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f44802.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f44802.toString();
    }

    @Override // java.lang.CharSequence
    public final InterfaceC11315 chars() {
        return C16777.m39511(this.f44802);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC11315 codePoints() {
        return C16777.m39512(this.f44802);
    }
}
