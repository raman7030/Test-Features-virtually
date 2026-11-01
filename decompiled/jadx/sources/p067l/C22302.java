package p067l;

import bin.p000mt.json.JSONArray;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩷ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22302 implements InterfaceC18948 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4867 f70437;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C13259 f70438;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ LinkedHashMap f70439;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ JSONArray f70440;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C10902 f70441;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C13259 f70442;

    public C22302(C4867 c4867, C13259 c13259, C10902 c10902, LinkedHashMap linkedHashMap, JSONArray jSONArray, C13259 c132510) {
        this.f70437 = c4867;
        this.f70442 = c13259;
        this.f70441 = c10902;
        this.f70439 = linkedHashMap;
        this.f70440 = jSONArray;
        this.f70438 = c132510;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m50119(C14362 c14362) {
        EnumC5645 enumC5645M32962 = c14362.m32962();
        EnumC5645 enumC5645 = EnumC5645.REGULAR;
        if (enumC5645M32962 == enumC5645) {
            JSONArray jSONArray = this.f70440;
            LinkedHashMap linkedHashMap = this.f70439;
            C10902 c10902 = this.f70441;
            C13259 c13259 = this.f70442;
            if (c13259 != null) {
                C13929 c13929Matcher = c13259.matcher((CharSequence) c14362.m32959().getName());
                boolean zMatches = c10902.f30221 ? c13929Matcher.matches() : c13929Matcher.find();
                C4867.m10326();
                if (!zMatches) {
                    if (c13929Matcher.m31668() || c13929Matcher.m31678()) {
                        C4867.m10328(linkedHashMap, "name_match_failed");
                        C4867.m10327(jSONArray, c14362, "name_match_failed");
                        return false;
                    }
                } else {
                    long jM32961 = c14362.m32961();
                    long jM32960 = c14362.m32960();
                    if (((c10902.f30214 == -1 || c10902.f30218 != -1) && jM32961 < 0) || (!(c10902.f30223 == null && c10902.f30220 == null) && jM32960 <= 0)) {
                        C4867.m10328(linkedHashMap, "metadata_unavailable");
                        C4867.m10327(jSONArray, c14362, "metadata_unavailable");
                        return false;
                    }
                    if ((c10902.f30214 == -1 || jM32961 >= c10902.f30214) && ((c10902.f30218 == -1 || jM32961 < c10902.f30218) && ((c10902.f30223 == null || jM32960 >= c10902.f30223.longValue()) && (c10902.f30220 == null || jM32960 < c10902.f30220.longValue())))) {
                        C13259 c132510 = this.f70438;
                        if (c132510 == null) {
                            return true;
                        }
                        try {
                            C14362 c14362M43858 = this.f70437.f11094.m43858(c14362.m32959().mo25505());
                            if (c14362M43858.m32962() != enumC5645) {
                                C4867.m10328(linkedHashMap, "file_unreadable");
                                C4867.m10327(jSONArray, c14362, "file_unreadable");
                                return false;
                            }
                            try {
                                InputStream inputStreamMo29987 = c14362M43858.m32959().mo29987();
                                try {
                                    boolean zM10329 = C4867.m10329(inputStreamMo29987, c132510);
                                    if (inputStreamMo29987 != null) {
                                        inputStreamMo29987.close();
                                    }
                                    return zM10329;
                                } catch (Throwable th) {
                                    if (inputStreamMo29987 == null) {
                                        throw th;
                                    }
                                    try {
                                        inputStreamMo29987.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException | IllegalArgumentException | SecurityException e) {
                                C4867.m10326();
                                String str = "content_search_failed";
                                C4867.m10328(linkedHashMap, "content_search_failed");
                                if (e instanceof CharacterCodingException) {
                                    str = "invalid_encoding";
                                } else if (e instanceof SocketTimeoutException) {
                                    str = "read_timeout";
                                }
                                C4867.m10327(jSONArray, c14362, str);
                                return false;
                            }
                        } catch (C5276 unused) {
                            C4867.m10328(linkedHashMap, "file_unreadable");
                            C4867.m10327(jSONArray, c14362, "file_unreadable");
                            return false;
                        }
                    }
                }
            } else {
                long jM32962 = c14362.m32961();
                long jM32963 = c14362.m32960();
                if (c10902.f30214 == -1) {
                }
                C4867.m10328(linkedHashMap, "metadata_unavailable");
                C4867.m10327(jSONArray, c14362, "metadata_unavailable");
                return false;
            }
        }
        return false;
    }
}
