package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9483 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f25982;

    /* JADX INFO: renamed from: ᩸ */
    public int f25984 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public String f25983 = null;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f25985 = false;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22084(char c) {
        return c == ' ' || c == '\t';
    }

    public C9483(String str) {
        this.f25982 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f25985) {
            this.f25985 = true;
            int i = this.f25984;
            String str = this.f25982;
            if (i > str.length()) {
                this.f25983 = null;
            } else if (this.f25984 == str.length()) {
                int i2 = this.f25984;
                if (i2 > 0 && m22084(str.charAt(i2 - 1))) {
                    this.f25983 = "";
                    this.f25984++;
                } else {
                    this.f25983 = null;
                }
            } else if (this.f25984 == 0 && m22084(str.charAt(0))) {
                this.f25983 = "";
                while (this.f25984 < str.length() && m22084(str.charAt(this.f25984))) {
                    this.f25984++;
                }
            } else {
                int i3 = this.f25984;
                while (this.f25984 < str.length() && !m22084(str.charAt(this.f25984))) {
                    this.f25984++;
                }
                this.f25983 = str.substring(i3, this.f25984);
                while (this.f25984 < str.length() && m22084(str.charAt(this.f25984))) {
                    this.f25984++;
                }
            }
        }
        return this.f25983 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f25983;
        this.f25985 = false;
        this.f25983 = null;
        return str;
    }
}
