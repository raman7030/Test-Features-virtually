package l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩶᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5XV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20486 implements Editable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66042;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final WeakReference f66043;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f66044;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f66045;

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C20486(C12392 c12392, int i) {
        this.f66043 = new WeakReference(c12392);
        this.f66044 = c12392.m30436();
        this.f66042 = c12392.m30414();
        this.f66045 = i;
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i3);
            boolean z = iIndexOf != -1 && iIndexOf < i4;
            InterfaceC7785 interfaceC7785 = this.f66044;
            if (z) {
                interfaceC7785.replace(i, i2, C22686.m50681(charSequence.subSequence(i3, i4)));
                return this;
            }
            interfaceC7785.replace(i, i2, charSequence, i3, i4);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence) {
        C12392 c12392;
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        if (charSequence == null) {
            charSequence = "";
        }
        try {
            if (charSequence.length() == 1 && charSequence.charAt(0) == '\n' && (c12392 = (C12392) this.f66043.get()) != null) {
                c12392.m30497(i, i2);
                return this;
            }
            this.f66044.replace(i, i2, C22686.m50681(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i2);
            boolean z = iIndexOf != -1 && iIndexOf < i3;
            InterfaceC7785 interfaceC7785 = this.f66044;
            if (z) {
                interfaceC7785.insert(i, C22686.m50681(charSequence.subSequence(i2, i3)));
                return this;
            }
            interfaceC7785.insert(i, charSequence, i2, i3);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        try {
            this.f66044.insert(i, C22686.m50681(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        try {
            this.f66044.delete(i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        try {
            this.f66044.append(C22686.m50681(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i);
            boolean z = iIndexOf != -1 && iIndexOf < i2;
            InterfaceC7785 interfaceC7785 = this.f66044;
            if (z) {
                interfaceC7785.append(C22686.m50681(charSequence.subSequence(i, i2)));
                return this;
            }
            interfaceC7785.append(charSequence, i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        if (!m46938()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f66042;
        atomicInteger.incrementAndGet();
        try {
            this.f66044.append(c);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final void clear() {
        if (m46938()) {
            AtomicInteger atomicInteger = this.f66042;
            atomicInteger.incrementAndGet();
            try {
                this.f66044.clear();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        if (m46938()) {
            this.f66044.clearSpans();
        }
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (m46938()) {
            this.f66044.setFilters(inputFilterArr);
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f66044.getFilters();
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f66044.getChars(i, i2, cArr, i3);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m46938()) {
            this.f66044.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f66044.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f66044.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f66044.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f66044.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f66044.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f66044.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f66044.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f66044.subSequence(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46938() {
        C12392 c12392 = (C12392) this.f66043.get();
        return c12392 != null && c12392.m30488(this.f66045);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C12392 c12392 = (C12392) this.f66043.get();
        if (c12392 == null || !c12392.m30502(this.f66045)) {
            return;
        }
        this.f66044.removeSpan(obj);
    }
}
