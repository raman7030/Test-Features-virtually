package p067l;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.ܳܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16301 implements Spannable {

    /* JADX INFO: renamed from: ᩸ */
    public Spannable f47912;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f47913 = false;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C4405.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C4405.convert(codePoints());
    }

    public C16301(Spannable spannable) {
        this.f47912 = spannable;
    }

    public C16301(CharSequence charSequence) {
        this.f47912 = new SpannableString(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m37094() {
        Spannable spannable = this.f47912;
        if (!this.f47913) {
            if ((Build.VERSION.SDK_INT < 28 ? new C19655() : new C18984()).mo43133(spannable)) {
                this.f47912 = new SpannableString(spannable);
            }
        }
        this.f47913 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Spannable m37095() {
        return this.f47912;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m37094();
        this.f47912.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m37094();
        this.f47912.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f47912.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f47912.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f47912.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f47912.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f47912.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f47912.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f47912.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f47912.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f47912.toString();
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13123 chars() {
        return C18313.m41747(this.f47912);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13123 codePoints() {
        return C18313.m41748(this.f47912);
    }
}
