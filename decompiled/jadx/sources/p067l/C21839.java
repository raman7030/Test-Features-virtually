package p067l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩶᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5XV */
/* JADX INFO: loaded from: classes4.dex */
public final class C21839 implements Editable {

    /* JADX INFO: renamed from: ۙ */
    public final AtomicInteger f68719;

    /* JADX INFO: renamed from: ᩶ */
    public final WeakReference f68720;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9768 f68721;

    /* JADX INFO: renamed from: ᩹ */
    public final int f68722;

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

    public C21839(C14146 c14146, int i) {
        this.f68720 = new WeakReference(c14146);
        this.f68721 = c14146.m32500();
        this.f68719 = c14146.m32478();
        this.f68722 = i;
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i3);
            boolean z = iIndexOf != -1 && iIndexOf < i4;
            InterfaceC9768 interfaceC9768 = this.f68721;
            if (z) {
                interfaceC9768.replace(i, i2, C23929.m53007(charSequence.subSequence(i3, i4)));
                return this;
            }
            interfaceC9768.replace(i, i2, charSequence, i3, i4);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence) {
        C14146 c14146;
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        if (charSequence == null) {
            charSequence = "";
        }
        try {
            if (charSequence.length() == 1 && charSequence.charAt(0) == '\n' && (c14146 = (C14146) this.f68720.get()) != null) {
                c14146.m32561(i, i2);
                return this;
            }
            this.f68721.replace(i, i2, C23929.m53007(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i2);
            boolean z = iIndexOf != -1 && iIndexOf < i3;
            InterfaceC9768 interfaceC9768 = this.f68721;
            if (z) {
                interfaceC9768.insert(i, C23929.m53007(charSequence.subSequence(i2, i3)));
                return this;
            }
            interfaceC9768.insert(i, charSequence, i2, i3);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        try {
            this.f68721.insert(i, C23929.m53007(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        try {
            this.f68721.delete(i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        try {
            this.f68721.append(C23929.m53007(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i);
            boolean z = iIndexOf != -1 && iIndexOf < i2;
            InterfaceC9768 interfaceC9768 = this.f68721;
            if (z) {
                interfaceC9768.append(C23929.m53007(charSequence.subSequence(i, i2)));
                return this;
            }
            interfaceC9768.append(charSequence, i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        if (!m49261()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f68719;
        atomicInteger.incrementAndGet();
        try {
            this.f68721.append(c);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final void clear() {
        if (m49261()) {
            AtomicInteger atomicInteger = this.f68719;
            atomicInteger.incrementAndGet();
            try {
                this.f68721.clear();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        if (m49261()) {
            this.f68721.clearSpans();
        }
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (m49261()) {
            this.f68721.setFilters(inputFilterArr);
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f68721.getFilters();
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f68721.getChars(i, i2, cArr, i3);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m49261()) {
            this.f68721.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f68721.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f68721.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f68721.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f68721.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f68721.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f68721.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f68721.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f68721.subSequence(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m49261() {
        C14146 c14146 = (C14146) this.f68720.get();
        return c14146 != null && c14146.m32552(this.f68722);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C14146 c14146 = (C14146) this.f68720.get();
        if (c14146 == null || !c14146.m32566(this.f68722)) {
            return;
        }
        this.f68721.removeSpan(obj);
    }
}
