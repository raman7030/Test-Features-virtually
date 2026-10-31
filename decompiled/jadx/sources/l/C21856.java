package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.᩸᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9AL */
/* JADX INFO: loaded from: classes.dex */
public class C21856 implements CharSequence {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f70019;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f70020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Editable f70021;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f70022;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15504 f70023;

    /* JADX INFO: renamed from: ֫ */
    public void mo10818() {
    }

    public C21856(Editable editable) {
        this(editable, 10000);
    }

    public C21856(Editable editable, int i) {
        this.f70023 = new C15504();
        this.f70019 = -1;
        this.f70020 = -1;
        this.f70021 = editable;
        this.f70022 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m49241(int i) {
        return ((i - this.f70019) - this.f70023.length()) + this.f70020;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49243(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 == i3) {
            return;
        }
        if (i2 > i3 || i2 < 0 || i3 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = this.f70019;
        C15504 c15504 = this.f70023;
        if (i4 == -1) {
            this.f70020 = i;
            this.f70019 = i;
            c15504.m36577(c15504.length(), i2, i3, charSequence);
            return;
        }
        Editable editable = this.f70021;
        if (i < i4) {
            c15504.m36577(0, i2, i3, charSequence);
            c15504.m36577(i3 - i2, i, this.f70019, editable);
            this.f70019 = i;
            m49242();
            return;
        }
        if (i < i4 + c15504.length()) {
            c15504.m36577(i - this.f70019, i2, i3, charSequence);
            m49242();
            return;
        }
        int iM49241 = m49241(i);
        c15504.m36577(c15504.length(), this.f70020, iM49241, editable);
        c15504.m36577(c15504.length(), i2, i3, charSequence);
        this.f70020 = iM49241;
        m49242();
    }

    public final void delete(int i, int i2) {
        int length;
        if (i == i2) {
            return;
        }
        if (i > i2 || i < 0 || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.f70019;
        if (i3 == -1) {
            this.f70019 = i;
            this.f70020 = i2;
            return;
        }
        Editable editable = this.f70021;
        C15504 c15504 = this.f70023;
        if (i2 <= i3) {
            c15504.m36577(0, i2, i3, editable);
            this.f70019 = i;
            m49242();
            return;
        }
        if (i >= i3 + c15504.length()) {
            int iM49241 = m49241(i);
            int iM49242 = m49241(i2);
            c15504.m36577(c15504.length(), this.f70020, iM49241, editable);
            this.f70020 = iM49242;
            m49242();
            return;
        }
        int i4 = this.f70019;
        int i5 = i > i4 ? i - i4 : 0;
        if (i2 >= i4 + c15504.length()) {
            length = c15504.length();
            this.f70020 = m49241(i2);
        } else {
            length = i2 - this.f70019;
        }
        if (i <= this.f70019) {
            this.f70019 = i;
        }
        c15504.delete(i5, length);
        if (c15504.length() == 0 && this.f70019 == this.f70020) {
            this.f70020 = -1;
            this.f70019 = -1;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return (this.f70021.length() - this.f70020) + this.f70019 + this.f70023.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f70019;
        Editable editable = this.f70021;
        if (i < i2) {
            return editable.charAt(i);
        }
        C15504 c15504 = this.f70023;
        if (i < i2 + c15504.length()) {
            return c15504.charAt(i - this.f70019);
        }
        return editable.charAt(m49241(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3;
        int length;
        int i4 = this.f70019;
        Editable editable = this.f70021;
        if (i4 == -1) {
            return editable.subSequence(i, i2);
        }
        if (i2 <= i4) {
            return editable.subSequence(i, i2);
        }
        C15504 c15504 = this.f70023;
        if (i >= i4 + c15504.length()) {
            return editable.subSequence(m49241(i), m49241(i2));
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        int i5 = this.f70019;
        if (i < i5) {
            sb.append(editable.subSequence(i, i5));
            i3 = 0;
        } else {
            i3 = i - i5;
        }
        if (i2 > this.f70019 + c15504.length()) {
            length = c15504.length();
        } else {
            length = i2 - this.f70019;
        }
        sb.append((CharSequence) c15504, i3, length);
        if (i2 > this.f70019 + c15504.length()) {
            sb.append(editable.subSequence(this.f70020, m49241(i2)));
        }
        return sb;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m49245() {
        return this.f70023.length();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49244() {
        if (this.f70019 != -1) {
            mo10818();
            int i = this.f70019;
            int i2 = this.f70020;
            C15504 c15504 = this.f70023;
            this.f70021.replace(i, i2, c15504.toString());
            c15504.clear();
            this.f70020 = -1;
            this.f70019 = -1;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49242() {
        int i = this.f70022;
        if (i == -1 || this.f70023.length() < i) {
            return;
        }
        m49244();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m49244();
        return this.f70021.toString();
    }
}
