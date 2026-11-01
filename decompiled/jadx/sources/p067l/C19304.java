package p067l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB2A */
/* JADX INFO: loaded from: classes4.dex */
public final class C19304 implements Appendable, CharSequence {

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayDeque f57659 = new ArrayDeque(8);

    /* JADX INFO: renamed from: ᩸ */
    public final StringBuilder f57658 = new StringBuilder((CharSequence) "");

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    public C19304() {
        m43992(0, "");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43999(String str) {
        this.f57658.append(str);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f57658.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        this.f57658.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.f57658;
        m43992(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        this.f57659.push(new C12599(obj, i, i2, i3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43993(C19304 c19304, Object obj, int i, int i2) {
        if (obj != null) {
            int length = c19304.f57658.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            m43994(c19304, obj, i, i2);
        }
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence) {
        StringBuilder sb = this.f57658;
        m43992(sb.length(), charSequence);
        sb.append(charSequence);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f57658.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m43995() {
        StringBuilder sb = this.f57658;
        return sb.charAt(sb.length() - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m43996(int i, int i2) {
        int i3;
        int length = this.f57658.length();
        if (i2 <= i || i < 0 || i2 > length) {
            return Collections.EMPTY_LIST;
        }
        ArrayDeque arrayDeque = this.f57659;
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(arrayDeque);
            Collections.reverse(arrayList);
            return C21562.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C12599 c12599 = (C12599) itDescendingIterator.next();
            int i4 = c12599.f35388;
            if ((i4 >= i && i4 < i2) || (((i3 = c12599.f35386) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(c12599);
            }
        }
        return C21562.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final CharSequence m43998(int i) {
        C12599 c12599;
        int i2;
        StringBuilder sb = this.f57658;
        int length = sb.length();
        C17962 c17962 = new C17962(sb.subSequence(i, length));
        Iterator it = this.f57659.iterator();
        while (it.hasNext() && (c12599 = (C12599) it.next()) != null) {
            int i3 = c12599.f35388;
            if (i3 >= i && (i2 = c12599.f35386) <= length) {
                c17962.setSpan(c12599.f35389, i3 - i, i2 - i, 33);
                it.remove();
            }
        }
        sb.replace(i, length, "");
        return c17962;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f57658.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<C12599> listM43996 = m43996(i, i2);
        boolean zIsEmpty = listM43996.isEmpty();
        StringBuilder sb = this.f57658;
        if (zIsEmpty) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (C12599 c12599 : listM43996) {
            int iMax = Math.max(0, c12599.f35388 - i);
            int iMin = Math.min(length, (c12599.f35386 - c12599.f35388) + iMax);
            Object obj = c12599.f35389;
            int i3 = c12599.f35387;
            if (obj instanceof C10548) {
                i3 |= 16711680;
            }
            spannableStringBuilder.setSpan(obj, iMax, iMin, i3);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f57658.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final SpannableStringBuilder m43997() {
        C17962 c17962 = new C17962(this.f57658);
        for (C12599 c12599 : this.f57659) {
            Object obj = c12599.f35389;
            int i = c12599.f35388;
            int i2 = c12599.f35386;
            int i3 = c12599.f35387;
            if (obj instanceof C10548) {
                i3 |= 16711680;
            }
            c17962.setSpan(obj, i, i2, i3);
        }
        return c17962;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43992(int i, CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        boolean z = spanned instanceof C17962;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        int length = spans != null ? spans.length : 0;
        if (length <= 0) {
            return;
        }
        if (!z) {
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = spans[i2];
                setSpan(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            Object obj2 = spans[length];
            setSpan(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43994(C19304 c19304, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    m43994(c19304, obj2, i, i2);
                }
                return;
            }
            c19304.setSpan(obj, i, i2, 33);
        }
    }
}
