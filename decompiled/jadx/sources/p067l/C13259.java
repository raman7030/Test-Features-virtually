package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import bin.p000mt.plugin.api.regex.Pattern;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۨۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: NATX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13259 implements Serializable, Pattern {
    public static final long serialVersionUID = 5073258162644648461L;

    /* JADX INFO: renamed from: ᩶ */
    public String f37227;

    /* JADX INFO: renamed from: ᩸ */
    public volatile transient C3771 f37228;

    /* JADX INFO: renamed from: ᩹ */
    public int f37229;

    /* JADX INFO: renamed from: ֫ */
    public static C13259 m30304(String str) {
        return new C13259(str, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13259 m30303(int i, String str) {
        return new C13259(str, i);
    }

    @Override // bin.p000mt.plugin.api.regex.Pattern
    public final String pattern() {
        return this.f37227;
    }

    public final String toString() {
        return this.f37227;
    }

    @Override // bin.p000mt.plugin.api.regex.Pattern
    public final C13929 matcher(CharSequence charSequence) {
        m30306();
        if (charSequence instanceof InterfaceC6553) {
            charSequence = ((InterfaceC6553) charSequence).mo14992();
        }
        return new C13929(this, charSequence);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m30309() {
        return m30306().f8065;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30307(int i) {
        return i > 0 && m30306().m7348(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9235 m30308() {
        return m30306().f8064;
    }

    @Override // bin.p000mt.plugin.api.regex.Pattern
    public final int flags() {
        C3771 c3771 = this.f37228;
        return c3771 == null ? this.f37229 : c3771.f8062;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m30305(String str) {
        int iIndexOf = str.indexOf("\\E");
        if (iIndexOf == -1) {
            return C6988.m16053("\\Q", str, "\\E");
        }
        int length = str.length();
        StringBuilder sbM34407 = C15033.m34407(length < 2147483639 - length ? length << 1 : 2147483639, "\\Q");
        int i = 0;
        do {
            sbM34407.append((CharSequence) str, i, iIndexOf);
            sbM34407.append("\\E\\\\E\\Q");
            i = iIndexOf + 2;
            iIndexOf = str.indexOf("\\E", i);
        } while (iIndexOf != -1);
        sbM34407.append((CharSequence) str, i, str.length());
        sbM34407.append("\\E");
        return sbM34407.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f37227.isEmpty()) {
            this.f37228 = C22389.m50253(this.f37229, this.f37227);
        }
    }

    public C13259(String str, int i) {
        if ((i & (-1024)) != 0) {
            throw new IllegalArgumentException(C1514.m34687(new StringBuilder("Unknown flag 0x"), i));
        }
        this.f37227 = str;
        i = (i & 256) != 0 ? i | 64 : i;
        this.f37229 = i;
        this.f37228 = C22389.m50253(i, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static SpannableStringBuilder m30302(PatternSyntaxException patternSyntaxException) {
        String message = patternSyntaxException.getMessage();
        C12826.requireNonNull(message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(message);
        int iLastIndexOf = message.lastIndexOf(10);
        if (iLastIndexOf != -1) {
            iLastIndexOf = message.lastIndexOf(10, iLastIndexOf - 1);
        }
        if (iLastIndexOf != -1) {
            spannableStringBuilder.setSpan(new TypefaceSpan("monospace"), iLastIndexOf, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), iLastIndexOf, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3771 m30306() {
        C3771 c3771M50253;
        C3771 c3771 = this.f37228;
        if (c3771 != null) {
            return c3771;
        }
        synchronized (this) {
            c3771M50253 = this.f37228;
            if (c3771M50253 == null) {
                c3771M50253 = C22389.m50253(this.f37229, this.f37227);
                this.f37228 = c3771M50253;
            }
        }
        return c3771M50253;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Map m30310() {
        C3771 c3771 = this.f37228;
        return c3771 == null ? Collections.EMPTY_MAP : c3771.f8059;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Map m30311() {
        return m30310();
    }
}
