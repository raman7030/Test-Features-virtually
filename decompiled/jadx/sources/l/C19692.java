package l;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.᩵᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19692 extends BaseInputConnection {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63613;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f63614;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63615;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f63616;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f63617;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f63618;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f63619;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0640 f63620;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f63621;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19692(C0640 c0640) {
        super(c0640, true);
        this.f63620 = c0640;
        this.f63618 = c0640.f2487;
        this.f63617 = "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45289() {
        if (this.f63615) {
            return false;
        }
        int i = this.f63618;
        C0640 c0640 = this.f63620;
        if (i != c0640.f2487) {
            return false;
        }
        c0640.f2467 = this;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        C0640 c0640 = this.f63620;
        if (this.f63615) {
            return;
        }
        try {
            if (c0640.f2467 == this && this.f63618 == c0640.f2487) {
                finishComposingText();
            }
        } finally {
            this.f63615 = true;
            if (c0640.f2467 == this) {
                c0640.f2467 = null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                super.closeConnection();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m45292() {
        if (this.f63617.length() == 0) {
            return;
        }
        getEditable().delete(0, this.f63617.length());
        this.f63617 = "";
        this.f63621 = false;
        if (this.f63613 == 0) {
            m45296();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45288(C19692 c19692, int i, int i2) {
        if (c19692.f63619) {
            return;
        }
        if (i == 67 && i2 == 0 && c19692.f63617.length() > 0) {
            int iOffsetByCodePoints = Character.offsetByCodePoints(c19692.getEditable(), c19692.f63617.length(), -1);
            c19692.getEditable().delete(iOffsetByCodePoints, c19692.f63617.length());
            c19692.f63617 = c19692.f63617.substring(0, iOffsetByCodePoints);
            if (c19692.f63613 == 0) {
                c19692.m45296();
                return;
            }
            return;
        }
        c19692.m45292();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45287(int i, String str) {
        int codePoint;
        boolean z;
        int i2;
        int i3;
        int i4;
        C0640 c0640 = this.f63620;
        if (c0640.f2467 != this) {
            return;
        }
        int iMin = Math.min(this.f63617.length(), str.length());
        int i5 = 0;
        while (i5 < iMin && this.f63617.charAt(i5) == str.charAt(i5)) {
            i5++;
        }
        if (i5 > 0 && Character.isHighSurrogate(this.f63617.charAt(i5 - 1))) {
            i5--;
        }
        String strSubstring = str.substring(i5);
        this.f63614 = true;
        this.f63616 = false;
        this.f63619 = true;
        try {
            String str2 = this.f63617;
            int iCodePointCount = str2.codePointCount(i5, str2.length()) + i;
            for (int i6 = 0; i6 < iCodePointCount; i6++) {
                c0640.m2652(67, 0);
            }
            int length = strSubstring.length();
            int i7 = 0;
            while (i7 < length && c0640.f2467 == this) {
                char cCharAt = strSubstring.charAt(i7);
                if (Character.isHighSurrogate(cCharAt)) {
                    i7++;
                    if (i7 < length) {
                        codePoint = cCharAt;
                        codePoint = Character.toCodePoint(cCharAt, strSubstring.charAt(i7));
                    } else {
                        codePoint = cCharAt;
                        codePoint = 65533;
                    }
                }
                codePoint = cCharAt;
                if (codePoint > 31 || codePoint == 27) {
                    z = false;
                    i2 = codePoint;
                } else {
                    if (codePoint == 10) {
                        i3 = codePoint;
                        i3 = 13;
                    }
                    switch (i3) {
                        case 28:
                            i4 = 92;
                            break;
                        case 29:
                            i4 = 93;
                            break;
                        case 30:
                            i4 = 94;
                            break;
                        case 31:
                            i4 = 95;
                            break;
                        default:
                            i4 = i3 + 96;
                            break;
                    }
                    z = true;
                    i2 = i4;
                }
                c0640.m2623(i2, z, false);
                i7++;
            }
            this.f63614 = false;
            this.f63619 = false;
            if (c0640.f2467 != this) {
                return;
            }
            this.f63617 = str;
            if (this.f63616) {
                m45292();
                return;
            }
            for (int i8 = 0; i8 < strSubstring.length(); i8++) {
                if (strSubstring.charAt(i8) < ' ' || strSubstring.charAt(i8) == 127) {
                    m45292();
                    return;
                }
            }
            int length2 = this.f63617.length();
            int i9 = length2 - 2048;
            if (i9 <= 0 || BaseInputConnection.getComposingSpanStart(getEditable()) >= 0) {
                return;
            }
            if (Character.isLowSurrogate(getEditable().charAt(i9))) {
                i9 = length2 - 2047;
            }
            getEditable().delete(0, i9);
            this.f63617 = this.f63617.substring(i9);
        } catch (Throwable th) {
            this.f63614 = false;
            this.f63619 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45296() {
        C0640 c0640 = this.f63620;
        if (c0640.f2467 != this) {
            return;
        }
        Editable editable = getEditable();
        InputMethodManager inputMethodManager = (InputMethodManager) c0640.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.updateSelection(c0640, Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable), BaseInputConnection.getComposingSpanStart(editable), BaseInputConnection.getComposingSpanEnd(editable));
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            boolean composingText = super.setComposingText(charSequence, i);
            if (this.f63621) {
                m45287(0, getEditable().toString());
            }
            if (BaseInputConnection.getComposingSpanStart(getEditable()) < 0) {
                this.f63621 = false;
            }
            return composingText;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = false;
        if (!m45289()) {
            return false;
        }
        boolean composingRegion = super.setComposingRegion(i, i2);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        if (composingSpanStart >= 0 && composingSpanStart < this.f63617.length()) {
            z = true;
        }
        this.f63621 = z;
        return composingRegion;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m45294() {
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        return composingSpanStart < 0 ? this.f63617.length() : Math.min(composingSpanStart, this.f63617.length());
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            return super.setSelection(Math.max(i, m45294()), Math.max(i2, m45294()));
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m45289()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m45289()) {
            return false;
        }
        this.f63613++;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        int i;
        if (this.f63615) {
            return false;
        }
        if (this.f63618 != this.f63620.f2487 || (i = this.f63613) == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f63613 = i2;
        if (i2 == 0) {
            Editable editable = getEditable();
            int iM45294 = m45294();
            if (Selection.getSelectionStart(editable) < iM45294 || Selection.getSelectionEnd(editable) < iM45294) {
                Selection.setSelection(editable, iM45294);
            }
            m45296();
        }
        return this.f63613 > 0;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return m45290(i, i2, true);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.finishComposingText();
            this.f63621 = false;
            m45287(0, getEditable().toString());
            return true;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.commitText(charSequence, i);
            this.f63621 = false;
            if (this.f63620.f2465 == null) {
                return true;
            }
            m45287(0, getEditable().toString());
            return true;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return m45290(i, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:15:0x0045, B:17:0x004b, B:19:0x0054, B:18:0x0050), top: B:26:0x0045 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45290(int i, int i2, boolean z) {
        boolean zDeleteSurroundingTextInCodePoints;
        if (i < 0 || i2 < 0 || !beginBatchEdit()) {
            return false;
        }
        Editable editable = getEditable();
        Object obj = new Object();
        editable.setSpan(obj, this.f63617.length(), this.f63617.length(), 17);
        int iMin = Math.min(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable));
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
        if (composingSpanStart >= 0) {
            iMin = Math.min(iMin, composingSpanStart);
        }
        if (z) {
            iMin = Character.codePointCount(editable, 0, iMin);
        }
        if (z) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    zDeleteSurroundingTextInCodePoints = super.deleteSurroundingTextInCodePoints(i, i2);
                } else {
                    zDeleteSurroundingTextInCodePoints = super.deleteSurroundingText(i, i2);
                }
            } finally {
                editable.removeSpan(obj);
                endBatchEdit();
            }
        } else {
            zDeleteSurroundingTextInCodePoints = super.deleteSurroundingText(i, i2);
        }
        m45287(Math.max(0, i - iMin), editable.subSequence(0, editable.getSpanStart(obj)).toString());
        return zDeleteSurroundingTextInCodePoints;
    }
}
