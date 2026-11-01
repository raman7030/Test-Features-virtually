package p067l;

import java.io.IOException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ᩳۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B3K */
/* JADX INFO: loaded from: classes4.dex */
public final class C19335 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17043 f57727;

    static {
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684(TextBundle.TEXT_ENTRY);
        f57727 = abstractC17043M38684;
        if (abstractC17043M38684.mo25094() && !abstractC17043M38684.mo25087()) {
            abstractC17043M38684.mo25503();
        }
        try {
            abstractC17043M38684.m38666();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m44065() {
        return f57727;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m44067() {
        return f57727.m38684("current");
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m44069() {
        return f57727.m38684("list");
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m44068(String str) {
        return f57727.m38684(str + ".dat");
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m44070(String str) {
        return f57727.m38684(str.concat(".tat"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m44066(String str) {
        return f57727.m38684(str.concat(".lit"));
    }
}
