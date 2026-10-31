package l;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB2A */
/* JADX INFO: loaded from: classes3.dex */
public final class C7626 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Class f23572;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f23573;

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

    public C7626(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f23573 = new ArrayList();
        C13746.m33055(cls, "watcherClass cannot be null");
        this.f23572 = cls;
    }

    public C7626(Class cls, C7626 c7626, int i, int i2) {
        super(c7626, i, i2);
        this.f23573 = new ArrayList();
        C13746.m33055(cls, "watcherClass cannot be null");
        this.f23572 = cls;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7626 m20416(Class cls, CharSequence charSequence) {
        return new C7626(cls, charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20418(Object obj) {
        if (obj != null) {
            return this.f23572 == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f23572 == cls) {
            C13975[] c13975Arr = (C13975[]) super.getSpans(i, i2, C13975.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c13975Arr.length);
            for (int i3 = 0; i3 < c13975Arr.length; i3++) {
                objArr[i3] = c13975Arr[i3].f41687;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f23572 == cls) {
            cls = C13975.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C7626(this.f23572, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m20418(obj)) {
            C13975 c13975 = new C13975(obj);
            this.f23573.add(c13975);
            obj = c13975;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C13975 c13975M20417;
        if (m20418(obj)) {
            c13975M20417 = m20417(obj);
            if (c13975M20417 != null) {
                obj = c13975M20417;
            }
        } else {
            c13975M20417 = null;
        }
        super.removeSpan(obj);
        if (c13975M20417 != null) {
            this.f23573.remove(c13975M20417);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C13975 c13975M20417;
        if (m20418(obj) && (c13975M20417 = m20417(obj)) != null) {
            obj = c13975M20417;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C13975 c13975M20417;
        if (m20418(obj) && (c13975M20417 = m20417(obj)) != null) {
            obj = c13975M20417;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C13975 c13975M20417;
        if (m20418(obj) && (c13975M20417 = m20417(obj)) != null) {
            obj = c13975M20417;
        }
        return super.getSpanFlags(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13975 m20417(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23573;
            if (i >= arrayList.size()) {
                return null;
            }
            C13975 c13975 = (C13975) arrayList.get(i);
            if (c13975.f41687 == obj) {
                return c13975;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20421() {
        m20420();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20422() {
        m20419();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23573;
            if (i >= arrayList.size()) {
                return;
            }
            ((C13975) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20420() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23573;
            if (i >= arrayList.size()) {
                return;
            }
            ((C13975) arrayList.get(i)).m33425();
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20419() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23573;
            if (i >= arrayList.size()) {
                return;
            }
            ((C13975) arrayList.get(i)).m33426();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m20420();
        super.replace(i, i2, charSequence);
        m20419();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m20420();
        super.replace(i, i2, charSequence, i3, i4);
        m20419();
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
