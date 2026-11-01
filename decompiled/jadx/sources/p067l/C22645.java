package p067l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.᩸ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes4.dex */
public final class C22645 {

    /* JADX INFO: renamed from: ֫ */
    public static final ExecutorService f71452 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ֫ */
    public static void m50703(C12255 c12255, C18362 c18362) {
        C13596 c13596M41826 = c18362.m41826();
        if (c13596M41826 != null) {
            c12255.m28261(c13596M41826);
            c12255.setTag(null);
            return;
        }
        C19033 c19033M41834 = c18362.m41834();
        if (c19033M41834 != null) {
            C21265 c21265M12008 = c19033M41834.m43235() ? C21265.f66817 : C5463.m12008(new C17278(C11419.m26414(c18362.m41824()), "/", null, 0L, 0L, true));
            C13596 c13596 = c21265M12008.f66886;
            c18362.m41821(c21265M12008, c13596);
            c12255.m28261(c13596);
            c12255.setTag(null);
            return;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(c18362.m41824(), new String[0]);
        if (!abstractC17043M42109.mo38688()) {
            C21265 c21265M41833 = c18362.m41833();
            if (c21265M41833 == null) {
                c21265M41833 = C21265.f66872;
            }
            c12255.m28261(c21265M41833.f66886);
            C23315 c23315M48180 = C21304.m48180(c18362);
            c12255.setTag(c23315M48180.m51921());
            C21304.m48182(c18362, c23315M48180, c12255);
            if (c23315M48180.m51923()) {
                C4081.f8987.submit(new RunnableC16608(c18362, abstractC17043M42109, c23315M48180));
                return;
            }
            return;
        }
        C11450 c11450 = abstractC17043M42109.mo25094() ? new C11450(abstractC17043M42109) : null;
        if (c11450 == null) {
            C21265 c21265 = C21265.f66872;
            C13596 c13597 = c21265.f66886;
            c18362.m41821(c21265, c13597);
            c12255.m28261(c13597);
            c12255.setTag(null);
            return;
        }
        C22179 c22179 = C22179.f70167;
        C21265 c21265Mo13204 = c22179.mo13204(c11450);
        c18362.m41820(c21265Mo13204);
        C13596 c13598 = c21265Mo13204.f66886;
        c12255.m28261(c13598);
        int iMo11393 = c22179.mo11393(c11450);
        if (iMo11393 == 0) {
            c18362.m41821(c21265Mo13204, c13598);
            c12255.setTag(null);
            return;
        }
        C23315 c23315M48181 = C21304.m48180(c18362);
        c12255.setTag(c23315M48181.m51921());
        C21304.m48182(c18362, c23315M48181, c12255);
        if (c23315M48181.m51923()) {
            f71452.submit(new RunnableC7221(c18362, c11450, iMo11393, c21265Mo13204, c23315M48181));
        }
    }
}
