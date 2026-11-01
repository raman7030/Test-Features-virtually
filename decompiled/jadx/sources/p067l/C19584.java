package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19584 {

    /* JADX INFO: renamed from: ֫ */
    public final String f59588;

    /* JADX INFO: renamed from: ۧ */
    public final String f59589;

    /* JADX INFO: renamed from: ܽ */
    public final String f59590;

    /* JADX INFO: renamed from: ᩳ */
    public final String f59591;

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f59587 = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f59585 = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f59586 = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    public C19584(String str) {
        this.f59590 = str;
        if (str == null) {
            this.f59589 = "";
            this.f59591 = C0233a.f1077D;
        } else {
            Matcher matcher = f59587.matcher(str);
            this.f59589 = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59585.matcher(str);
            this.f59591 = matcher2.find() ? matcher2.group(2) : null;
        }
        if (!"multipart/form-data".equalsIgnoreCase(this.f59589)) {
            this.f59588 = null;
        } else {
            Matcher matcher3 = f59586.matcher(str);
            this.f59588 = matcher3.find() ? matcher3.group(2) : null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m44493() {
        return this.f59590;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m44491() {
        return this.f59589;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m44495() {
        String str = this.f59591;
        return str != null ? str : C0233a.f1077D;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44490() {
        return this.f59588;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m44494() {
        return "multipart/form-data".equalsIgnoreCase(this.f59589);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C19584 m44492() {
        return this.f59591 == null ? new C19584(C10965.m25286(new StringBuilder(), this.f59590, "; charset=UTF-8")) : this;
    }
}
