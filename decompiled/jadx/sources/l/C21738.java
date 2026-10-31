package l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes.dex */
public final class C21738 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC11155 f69704;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23148 f69705;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23854 f69706;

    public C21738(C23148 c23148, C1982 c1982, InterfaceC11155 interfaceC11155, Set set) {
        this.f69706 = c1982;
        this.f69705 = c23148;
        this.f69704 = interfaceC11155;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m49061(str, 0, str.length(), 1, true, new C8332(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m49065(CharSequence charSequence, int i, int i2, boolean z) {
        C14660 c14660;
        AbstractC22443[] abstractC22443Arr;
        boolean z2 = charSequence instanceof C7626;
        if (z2) {
            ((C7626) charSequence).m20421();
        }
        if (z2) {
            c14660 = new C14660((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c14660 = new C14660((Spannable) charSequence);
                } else {
                    c14660 = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, AbstractC22443.class) > i2) ? null : new C14660(charSequence);
                }
            } finally {
                if (z2) {
                    ((C7626) charSequence).m20422();
                }
            }
        }
        if (c14660 != null && (abstractC22443Arr = (AbstractC22443[]) c14660.getSpans(i, i2, AbstractC22443.class)) != null && abstractC22443Arr.length > 0) {
            for (AbstractC22443 abstractC22443 : abstractC22443Arr) {
                int spanStart = c14660.getSpanStart(abstractC22443);
                int spanEnd = c14660.getSpanEnd(abstractC22443);
                if (spanStart != i2) {
                    c14660.removeSpan(abstractC22443);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            C14660 c14661 = (C14660) m49061(charSequence, i3, i4, Integer.MAX_VALUE, z, new C5510(c14660, this.f69706));
            if (c14661 != null) {
                return c14661.m34948();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m49061(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC1276 interfaceC1276) {
        int iCharCount;
        C15386 c15386 = new C15386(this.f69705.m51328());
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i4 = 0;
        boolean zMo4338 = true;
        loop0: while (true) {
            int iCodePointAt2 = iCodePointAt;
            iCharCount = i;
            while (true) {
                if (iCharCount < i2 && i4 < i3 && zMo4338) {
                    int iM36422 = c15386.m36422(iCodePointAt2);
                    if (iM36422 == 1) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                            break;
                        }
                    } else if (iM36422 == 2) {
                        iCharCount += Character.charCount(iCodePointAt2);
                        if (iCharCount < i2) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                        }
                    } else if (iM36422 == 3) {
                        if (z || !m49064(charSequence, i, iCharCount, c15386.m36424())) {
                            zMo4338 = interfaceC1276.mo4338(charSequence, i, iCharCount, c15386.m36424());
                            i4++;
                        }
                        i = iCharCount;
                    }
                    iCodePointAt = iCodePointAt2;
                    break;
                }
                break loop0;
            }
        }
        if (c15386.m36425() && i4 < i3 && zMo4338 && (z || !m49064(charSequence, i, iCharCount, c15386.m36423()))) {
            interfaceC1276.mo4338(charSequence, i, iCharCount, c15386.m36423());
        }
        return interfaceC1276.mo4337();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49062(Editable editable, int i, KeyEvent keyEvent) {
        boolean zM49063;
        if (i == 67) {
            zM49063 = m49063(editable, keyEvent, false);
        } else {
            zM49063 = i != 112 ? false : m49063(editable, keyEvent, true);
        }
        if (!zM49063) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49063(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC22443[] abstractC22443Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC22443Arr = (AbstractC22443[]) editable.getSpans(selectionStart, selectionEnd, AbstractC22443.class)) != null && abstractC22443Arr.length > 0) {
                for (AbstractC22443 abstractC22443 : abstractC22443Arr) {
                    int spanStart = editable.getSpanStart(abstractC22443);
                    int spanEnd = editable.getSpanEnd(abstractC22443);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m49064(CharSequence charSequence, int i, int i2, C1961 c1961) {
        if (c1961.m6460() == 0) {
            c1961.m6458(((C6173) this.f69704).m17078(i, i2, c1961.m6463(), charSequence));
        }
        return c1961.m6460() == 2;
    }
}
