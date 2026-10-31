package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7486 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23069;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23071 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f23070 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23072 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20108(char c) {
        return c == ' ' || c == '\t';
    }

    public C7486(String str) {
        this.f23069 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f23072) {
            this.f23072 = true;
            int i = this.f23071;
            String str = this.f23069;
            if (i > str.length()) {
                this.f23070 = null;
            } else if (this.f23071 == str.length()) {
                int i2 = this.f23071;
                if (i2 > 0 && m20108(str.charAt(i2 - 1))) {
                    this.f23070 = "";
                    this.f23071++;
                } else {
                    this.f23070 = null;
                }
            } else if (this.f23071 == 0 && m20108(str.charAt(0))) {
                this.f23070 = "";
                while (this.f23071 < str.length() && m20108(str.charAt(this.f23071))) {
                    this.f23071++;
                }
            } else {
                int i3 = this.f23071;
                while (this.f23071 < str.length() && !m20108(str.charAt(this.f23071))) {
                    this.f23071++;
                }
                this.f23070 = str.substring(i3, this.f23071);
                while (this.f23071 < str.length() && m20108(str.charAt(this.f23071))) {
                    this.f23071++;
                }
            }
        }
        return this.f23070 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f23070;
        this.f23072 = false;
        this.f23070 = null;
        return str;
    }
}
