package p067l;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.᩵᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21084 extends BaseInputConnection {

    /* JADX INFO: renamed from: ֫ */
    public int f66234;

    /* JADX INFO: renamed from: ۜ */
    public boolean f66235;

    /* JADX INFO: renamed from: ۧ */
    public boolean f66236;

    /* JADX INFO: renamed from: ܳ */
    public boolean f66237;

    /* JADX INFO: renamed from: ܽ */
    public String f66238;

    /* JADX INFO: renamed from: ܿ */
    public final int f66239;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f66240;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C2977 f66241;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f66242;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21084(C2977 c2977) {
        super(c2977, true);
        this.f66241 = c2977;
        this.f66239 = c2977.f5259;
        this.f66238 = "";
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m47586() {
        if (this.f66236) {
            return false;
        }
        int i = this.f66239;
        C2977 c2977 = this.f66241;
        if (i != c2977.f5259) {
            return false;
        }
        c2977.f5239 = this;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        C2977 c2977 = this.f66241;
        if (this.f66236) {
            return;
        }
        try {
            if (c2977.f5239 == this && this.f66239 == c2977.f5259) {
                finishComposingText();
            }
        } finally {
            this.f66236 = true;
            if (c2977.f5239 == this) {
                c2977.f5239 = null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                super.closeConnection();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m47589() {
        if (this.f66238.length() == 0) {
            return;
        }
        getEditable().delete(0, this.f66238.length());
        this.f66238 = "";
        this.f66242 = false;
        if (this.f66234 == 0) {
            m47593();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47585(C21084 c21084, int i, int i2) {
        if (c21084.f66240) {
            return;
        }
        if (i == 67 && i2 == 0 && c21084.f66238.length() > 0) {
            int iOffsetByCodePoints = Character.offsetByCodePoints(c21084.getEditable(), c21084.f66238.length(), -1);
            c21084.getEditable().delete(iOffsetByCodePoints, c21084.f66238.length());
            c21084.f66238 = c21084.f66238.substring(0, iOffsetByCodePoints);
            if (c21084.f66234 == 0) {
                c21084.m47593();
                return;
            }
            return;
        }
        c21084.m47589();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47584(int i, String str) {
        int codePoint;
        boolean z;
        int i2;
        int i3;
        int i4;
        C2977 c2977 = this.f66241;
        if (c2977.f5239 != this) {
            return;
        }
        int iMin = Math.min(this.f66238.length(), str.length());
        int i5 = 0;
        while (i5 < iMin && this.f66238.charAt(i5) == str.charAt(i5)) {
            i5++;
        }
        if (i5 > 0 && Character.isHighSurrogate(this.f66238.charAt(i5 - 1))) {
            i5--;
        }
        String strSubstring = str.substring(i5);
        this.f66235 = true;
        this.f66237 = false;
        this.f66240 = true;
        try {
            String str2 = this.f66238;
            int iCodePointCount = str2.codePointCount(i5, str2.length()) + i;
            for (int i6 = 0; i6 < iCodePointCount; i6++) {
                c2977.m4992(67, 0);
            }
            int length = strSubstring.length();
            int i7 = 0;
            while (i7 < length && c2977.f5239 == this) {
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
                c2977.m4963(i2, z, false);
                i7++;
            }
            this.f66235 = false;
            this.f66240 = false;
            if (c2977.f5239 != this) {
                return;
            }
            this.f66238 = str;
            if (this.f66237) {
                m47589();
                return;
            }
            for (int i8 = 0; i8 < strSubstring.length(); i8++) {
                if (strSubstring.charAt(i8) < ' ' || strSubstring.charAt(i8) == 127) {
                    m47589();
                    return;
                }
            }
            int length2 = this.f66238.length();
            int i9 = length2 - 2048;
            if (i9 <= 0 || BaseInputConnection.getComposingSpanStart(getEditable()) >= 0) {
                return;
            }
            if (Character.isLowSurrogate(getEditable().charAt(i9))) {
                i9 = length2 - 2047;
            }
            getEditable().delete(0, i9);
            this.f66238 = this.f66238.substring(i9);
        } catch (Throwable th) {
            this.f66235 = false;
            this.f66240 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m47593() {
        C2977 c2977 = this.f66241;
        if (c2977.f5239 != this) {
            return;
        }
        Editable editable = getEditable();
        InputMethodManager inputMethodManager = (InputMethodManager) c2977.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.updateSelection(c2977, Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable), BaseInputConnection.getComposingSpanStart(editable), BaseInputConnection.getComposingSpanEnd(editable));
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            boolean composingText = super.setComposingText(charSequence, i);
            if (this.f66242) {
                m47584(0, getEditable().toString());
            }
            if (BaseInputConnection.getComposingSpanStart(getEditable()) < 0) {
                this.f66242 = false;
            }
            return composingText;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = false;
        if (!m47586()) {
            return false;
        }
        boolean composingRegion = super.setComposingRegion(i, i2);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        if (composingSpanStart >= 0 && composingSpanStart < this.f66238.length()) {
            z = true;
        }
        this.f66242 = z;
        return composingRegion;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m47591() {
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        return composingSpanStart < 0 ? this.f66238.length() : Math.min(composingSpanStart, this.f66238.length());
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            return super.setSelection(Math.max(i, m47591()), Math.max(i2, m47591()));
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m47586()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m47586()) {
            return false;
        }
        this.f66234++;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        int i;
        if (this.f66236) {
            return false;
        }
        if (this.f66239 != this.f66241.f5259 || (i = this.f66234) == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f66234 = i2;
        if (i2 == 0) {
            Editable editable = getEditable();
            int iM47591 = m47591();
            if (Selection.getSelectionStart(editable) < iM47591 || Selection.getSelectionEnd(editable) < iM47591) {
                Selection.setSelection(editable, iM47591);
            }
            m47593();
        }
        return this.f66234 > 0;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return m47587(i, i2, true);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.finishComposingText();
            this.f66242 = false;
            m47584(0, getEditable().toString());
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
            this.f66242 = false;
            if (this.f66241.f5237 == null) {
                return true;
            }
            m47584(0, getEditable().toString());
            return true;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return m47587(i, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:15:0x0045, B:17:0x004b, B:19:0x0054, B:18:0x0050), top: B:26:0x0045 }] */
    /* JADX INFO: renamed from: ֫ */
    private boolean m47587(int i, int i2, boolean z) {
        boolean zDeleteSurroundingTextInCodePoints;
        if (i < 0 || i2 < 0 || !beginBatchEdit()) {
            return false;
        }
        Editable editable = getEditable();
        Object obj = new Object();
        editable.setSpan(obj, this.f66238.length(), this.f66238.length(), 17);
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
        m47584(Math.max(0, i - iMin), editable.subSequence(0, editable.getSpanStart(obj)).toString());
        return zDeleteSurroundingTextInCodePoints;
    }
}
