package p067l;

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
public final class C23028 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC12970 f72411;

    /* JADX INFO: renamed from: ۧ */
    public final C24368 f72412;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC25039 f72413;

    public C23028(C24368 c24368, C4252 c4252, InterfaceC12970 interfaceC12970, Set set) {
        this.f72413 = c4252;
        this.f72412 = c24368;
        this.f72411 = interfaceC12970;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m51410(str, 0, str.length(), 1, true, new C10287(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m51414(CharSequence charSequence, int i, int i2, boolean z) {
        C16301 c16301;
        AbstractC23698[] abstractC23698Arr;
        boolean z2 = charSequence instanceof C9616;
        if (z2) {
            ((C9616) charSequence).m22400();
        }
        if (z2) {
            c16301 = new C16301((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c16301 = new C16301((Spannable) charSequence);
                } else {
                    c16301 = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, AbstractC23698.class) > i2) ? null : new C16301(charSequence);
                }
            } finally {
                if (z2) {
                    ((C9616) charSequence).m22401();
                }
            }
        }
        if (c16301 != null && (abstractC23698Arr = (AbstractC23698[]) c16301.getSpans(i, i2, AbstractC23698.class)) != null && abstractC23698Arr.length > 0) {
            for (AbstractC23698 abstractC23698 : abstractC23698Arr) {
                int spanStart = c16301.getSpanStart(abstractC23698);
                int spanEnd = c16301.getSpanEnd(abstractC23698);
                if (spanStart != i2) {
                    c16301.removeSpan(abstractC23698);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            C16301 c16302 = (C16301) m51410(charSequence, i3, i4, Integer.MAX_VALUE, z, new C7605(c16301, this.f72413));
            if (c16302 != null) {
                return c16302.m37095();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m51410(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC3581 interfaceC3581) {
        int iCharCount;
        C16991 c16991 = new C16991(this.f72412.m53723());
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i4 = 0;
        boolean zMo6584 = true;
        loop0: while (true) {
            int iCodePointAt2 = iCodePointAt;
            iCharCount = i;
            while (true) {
                if (iCharCount < i2 && i4 < i3 && zMo6584) {
                    int iM38580 = c16991.m38580(iCodePointAt2);
                    if (iM38580 == 1) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                            break;
                        }
                    } else if (iM38580 == 2) {
                        iCharCount += Character.charCount(iCodePointAt2);
                        if (iCharCount < i2) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                        }
                    } else if (iM38580 == 3) {
                        if (z || !m51413(charSequence, i, iCharCount, c16991.m38582())) {
                            zMo6584 = interfaceC3581.mo6584(charSequence, i, iCharCount, c16991.m38582());
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
        if (c16991.m38583() && i4 < i3 && zMo6584 && (z || !m51413(charSequence, i, iCharCount, c16991.m38581()))) {
            interfaceC3581.mo6584(charSequence, i, iCharCount, c16991.m38581());
        }
        return interfaceC3581.mo6583();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m51411(Editable editable, int i, KeyEvent keyEvent) {
        boolean zM51412;
        if (i == 67) {
            zM51412 = m51412(editable, keyEvent, false);
        } else {
            zM51412 = i != 112 ? false : m51412(editable, keyEvent, true);
        }
        if (!zM51412) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m51412(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC23698[] abstractC23698Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC23698Arr = (AbstractC23698[]) editable.getSpans(selectionStart, selectionEnd, AbstractC23698.class)) != null && abstractC23698Arr.length > 0) {
                for (AbstractC23698 abstractC23698 : abstractC23698Arr) {
                    int spanStart = editable.getSpanStart(abstractC23698);
                    int spanEnd = editable.getSpanEnd(abstractC23698);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m51413(CharSequence charSequence, int i, int i2, C4232 c4232) {
        if (c4232.m8601() == 0) {
            c4232.m8599(((C8235) this.f72411).m19010(i, i2, c4232.m8604(), charSequence));
        }
        return c4232.m8601() == 2;
    }
}
