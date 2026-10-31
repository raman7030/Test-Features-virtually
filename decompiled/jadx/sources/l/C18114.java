package l;

import com.alipay.sdk.m.w.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18114 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f56375;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f56376;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f56377;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f56378;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f56374 = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f56372 = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f56373 = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    public C18114(String str) {
        this.f56377 = str;
        if (str == null) {
            this.f56376 = "";
            this.f56378 = a.D;
        } else {
            Matcher matcher = f56374.matcher(str);
            this.f56376 = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f56372.matcher(str);
            this.f56378 = matcher2.find() ? matcher2.group(2) : null;
        }
        if (!"multipart/form-data".equalsIgnoreCase(this.f56376)) {
            this.f56375 = null;
        } else {
            Matcher matcher3 = f56373.matcher(str);
            this.f56375 = matcher3.find() ? matcher3.group(2) : null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m42234() {
        return this.f56377;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m42232() {
        return this.f56376;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m42236() {
        String str = this.f56378;
        return str != null ? str : a.D;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m42231() {
        return this.f56375;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m42235() {
        return "multipart/form-data".equalsIgnoreCase(this.f56376);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18114 m42233() {
        return this.f56378 == null ? new C18114(C9045.m23341(new StringBuilder(), this.f56377, "; charset=UTF-8")) : this;
    }
}
