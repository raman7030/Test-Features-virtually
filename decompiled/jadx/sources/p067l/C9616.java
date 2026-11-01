package p067l;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB2A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9616 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: ᩸ */
    public final Class f26485;

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f26486;

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    public C9616(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f26486 = new ArrayList();
        C1524.m35169(cls, "watcherClass cannot be null");
        this.f26485 = cls;
    }

    public C9616(Class cls, C9616 c9616, int i, int i2) {
        super(c9616, i, i2);
        this.f26486 = new ArrayList();
        C1524.m35169(cls, "watcherClass cannot be null");
        this.f26485 = cls;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9616 m22395(Class cls, CharSequence charSequence) {
        return new C9616(cls, charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22397(Object obj) {
        if (obj != null) {
            return this.f26485 == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f26485 == cls) {
            C15650[] c15650Arr = (C15650[]) super.getSpans(i, i2, C15650.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c15650Arr.length);
            for (int i3 = 0; i3 < c15650Arr.length; i3++) {
                objArr[i3] = c15650Arr[i3].f44770;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f26485 == cls) {
            cls = C15650.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C9616(this.f26485, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m22397(obj)) {
            C15650 c15650 = new C15650(obj);
            this.f26486.add(c15650);
            obj = c15650;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C15650 c15650M22396;
        if (m22397(obj)) {
            c15650M22396 = m22396(obj);
            if (c15650M22396 != null) {
                obj = c15650M22396;
            }
        } else {
            c15650M22396 = null;
        }
        super.removeSpan(obj);
        if (c15650M22396 != null) {
            this.f26486.remove(c15650M22396);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C15650 c15650M22396;
        if (m22397(obj) && (c15650M22396 = m22396(obj)) != null) {
            obj = c15650M22396;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C15650 c15650M22396;
        if (m22397(obj) && (c15650M22396 = m22396(obj)) != null) {
            obj = c15650M22396;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C15650 c15650M22396;
        if (m22397(obj) && (c15650M22396 = m22396(obj)) != null) {
            obj = c15650M22396;
        }
        return super.getSpanFlags(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    private C15650 m22396(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26486;
            if (i >= arrayList.size()) {
                return null;
            }
            C15650 c15650 = (C15650) arrayList.get(i);
            if (c15650.f44770 == obj) {
                return c15650;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22400() {
        m22399();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22401() {
        m22398();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26486;
            if (i >= arrayList.size()) {
                return;
            }
            ((C15650) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m22399() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26486;
            if (i >= arrayList.size()) {
                return;
            }
            ((C15650) arrayList.get(i)).m35545();
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m22398() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26486;
            if (i >= arrayList.size()) {
                return;
            }
            ((C15650) arrayList.get(i)).m35546();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m22399();
        super.replace(i, i2, charSequence);
        m22398();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m22399();
        super.replace(i, i2, charSequence, i3, i4);
        m22398();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
