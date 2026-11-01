package p067l;

import android.text.Editable;

/* JADX INFO: renamed from: l.᩸᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9AL */
/* JADX INFO: loaded from: classes.dex */
public class C23141 implements CharSequence {

    /* JADX INFO: renamed from: ۗ */
    public int f72728;

    /* JADX INFO: renamed from: ۙ */
    public int f72729;

    /* JADX INFO: renamed from: ᩶ */
    public final Editable f72730;

    /* JADX INFO: renamed from: ᩸ */
    public final int f72731;

    /* JADX INFO: renamed from: ᩹ */
    public final C17104 f72732;

    /* JADX INFO: renamed from: ֫ */
    public void mo12798() {
    }

    public C23141(Editable editable) {
        this(editable, 10000);
    }

    public C23141(Editable editable, int i) {
        this.f72732 = new C17104();
        this.f72728 = -1;
        this.f72729 = -1;
        this.f72730 = editable;
        this.f72731 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m51592(int i) {
        return ((i - this.f72728) - this.f72732.length()) + this.f72729;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51594(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 == i3) {
            return;
        }
        if (i2 > i3 || i2 < 0 || i3 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = this.f72728;
        C17104 c17104 = this.f72732;
        if (i4 == -1) {
            this.f72729 = i;
            this.f72728 = i;
            c17104.m38736(c17104.length(), i2, i3, charSequence);
            return;
        }
        Editable editable = this.f72730;
        if (i < i4) {
            c17104.m38736(0, i2, i3, charSequence);
            c17104.m38736(i3 - i2, i, this.f72728, editable);
            this.f72728 = i;
            m51593();
            return;
        }
        if (i < i4 + c17104.length()) {
            c17104.m38736(i - this.f72728, i2, i3, charSequence);
            m51593();
            return;
        }
        int iM51592 = m51592(i);
        c17104.m38736(c17104.length(), this.f72729, iM51592, editable);
        c17104.m38736(c17104.length(), i2, i3, charSequence);
        this.f72729 = iM51592;
        m51593();
    }

    public final void delete(int i, int i2) {
        int length;
        if (i == i2) {
            return;
        }
        if (i > i2 || i < 0 || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.f72728;
        if (i3 == -1) {
            this.f72728 = i;
            this.f72729 = i2;
            return;
        }
        Editable editable = this.f72730;
        C17104 c17104 = this.f72732;
        if (i2 <= i3) {
            c17104.m38736(0, i2, i3, editable);
            this.f72728 = i;
            m51593();
            return;
        }
        if (i >= i3 + c17104.length()) {
            int iM51592 = m51592(i);
            int iM51593 = m51592(i2);
            c17104.m38736(c17104.length(), this.f72729, iM51592, editable);
            this.f72729 = iM51593;
            m51593();
            return;
        }
        int i4 = this.f72728;
        int i5 = i > i4 ? i - i4 : 0;
        if (i2 >= i4 + c17104.length()) {
            length = c17104.length();
            this.f72729 = m51592(i2);
        } else {
            length = i2 - this.f72728;
        }
        if (i <= this.f72728) {
            this.f72728 = i;
        }
        c17104.delete(i5, length);
        if (c17104.length() == 0 && this.f72728 == this.f72729) {
            this.f72729 = -1;
            this.f72728 = -1;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return (this.f72730.length() - this.f72729) + this.f72728 + this.f72732.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f72728;
        Editable editable = this.f72730;
        if (i < i2) {
            return editable.charAt(i);
        }
        C17104 c17104 = this.f72732;
        if (i < i2 + c17104.length()) {
            return c17104.charAt(i - this.f72728);
        }
        return editable.charAt(m51592(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3;
        int length;
        int i4 = this.f72728;
        Editable editable = this.f72730;
        if (i4 == -1) {
            return editable.subSequence(i, i2);
        }
        if (i2 <= i4) {
            return editable.subSequence(i, i2);
        }
        C17104 c17104 = this.f72732;
        if (i >= i4 + c17104.length()) {
            return editable.subSequence(m51592(i), m51592(i2));
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        int i5 = this.f72728;
        if (i < i5) {
            sb.append(editable.subSequence(i, i5));
            i3 = 0;
        } else {
            i3 = i - i5;
        }
        if (i2 > this.f72728 + c17104.length()) {
            length = c17104.length();
        } else {
            length = i2 - this.f72728;
        }
        sb.append((CharSequence) c17104, i3, length);
        if (i2 > this.f72728 + c17104.length()) {
            sb.append(editable.subSequence(this.f72729, m51592(i2)));
        }
        return sb;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m51596() {
        return this.f72732.length();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51595() {
        if (this.f72728 != -1) {
            mo12798();
            int i = this.f72728;
            int i2 = this.f72729;
            C17104 c17104 = this.f72732;
            this.f72730.replace(i, i2, c17104.toString());
            c17104.clear();
            this.f72729 = -1;
            this.f72728 = -1;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m51593() {
        int i = this.f72731;
        if (i == -1 || this.f72732.length() < i) {
            return;
        }
        m51595();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m51595();
        return this.f72730.toString();
    }
}
