package l;

import java.io.IOException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ᩳۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B3K */
/* JADX INFO: loaded from: classes4.dex */
public final class C17852 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f54529;

    static {
        AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526(TextBundle.TEXT_ENTRY);
        f54529 = abstractC15440M36526;
        if (abstractC15440M36526.mo23120() && !abstractC15440M36526.mo23113()) {
            abstractC15440M36526.mo23552();
        }
        try {
            abstractC15440M36526.m36508();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41819() {
        return f54529;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41821() {
        return f54529.m36526("current");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41823() {
        return f54529.m36526("list");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41822(String str) {
        return f54529.m36526(str + ".dat");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41824(String str) {
        return f54529.m36526(str.concat(".tat"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41820(String str) {
        return f54529.m36526(str.concat(".lit"));
    }
}
