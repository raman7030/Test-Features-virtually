package l;

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
public final class C17820 implements Appendable, CharSequence {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f54463 = new ArrayDeque(8);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f54462 = new StringBuilder((CharSequence) "");

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    public C17820() {
        m41746(0, "");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41753(String str) {
        this.f54462.append(str);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f54462.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        this.f54462.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.f54462;
        m41746(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        this.f54463.push(new C10765(obj, i, i2, i3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41747(C17820 c17820, Object obj, int i, int i2) {
        if (obj != null) {
            int length = c17820.f54462.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            m41748(c17820, obj, i, i2);
        }
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence) {
        StringBuilder sb = this.f54462;
        m41746(sb.length(), charSequence);
        sb.append(charSequence);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f54462.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m41749() {
        StringBuilder sb = this.f54462;
        return sb.charAt(sb.length() - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m41750(int i, int i2) {
        int i3;
        int length = this.f54462.length();
        if (i2 <= i || i < 0 || i2 > length) {
            return Collections.EMPTY_LIST;
        }
        ArrayDeque arrayDeque = this.f54463;
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(arrayDeque);
            Collections.reverse(arrayList);
            return C20195.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C10765 c10765 = (C10765) itDescendingIterator.next();
            int i4 = c10765.f32413;
            if ((i4 >= i && i4 < i2) || (((i3 = c10765.f32411) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(c10765);
            }
        }
        return C20195.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence m41752(int i) {
        C10765 c10765;
        int i2;
        StringBuilder sb = this.f54462;
        int length = sb.length();
        C16408 c16408 = new C16408(sb.subSequence(i, length));
        Iterator it = this.f54463.iterator();
        while (it.hasNext() && (c10765 = (C10765) it.next()) != null) {
            int i3 = c10765.f32413;
            if (i3 >= i && (i2 = c10765.f32411) <= length) {
                c16408.setSpan(c10765.f32414, i3 - i, i2 - i, 33);
                it.remove();
            }
        }
        sb.replace(i, length, "");
        return c16408;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f54462.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<C10765> listM41750 = m41750(i, i2);
        boolean zIsEmpty = listM41750.isEmpty();
        StringBuilder sb = this.f54462;
        if (zIsEmpty) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (C10765 c10765 : listM41750) {
            int iMax = Math.max(0, c10765.f32413 - i);
            int iMin = Math.min(length, (c10765.f32411 - c10765.f32413) + iMax);
            Object obj = c10765.f32414;
            int i3 = c10765.f32412;
            if (obj instanceof C8607) {
                i3 |= 16711680;
            }
            spannableStringBuilder.setSpan(obj, iMax, iMin, i3);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f54462.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m41751() {
        C16408 c16408 = new C16408(this.f54462);
        for (C10765 c10765 : this.f54463) {
            Object obj = c10765.f32414;
            int i = c10765.f32413;
            int i2 = c10765.f32411;
            int i3 = c10765.f32412;
            if (obj instanceof C8607) {
                i3 |= 16711680;
            }
            c16408.setSpan(obj, i, i2, i3);
        }
        return c16408;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41746(int i, CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        boolean z = spanned instanceof C16408;
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41748(C17820 c17820, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    m41748(c17820, obj2, i, i2);
                }
                return;
            }
            c17820.setSpan(obj, i, i2, 33);
        }
    }
}
