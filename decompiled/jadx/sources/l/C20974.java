package l;

import bin.mt.json.JSONArray;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩷ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20974 implements InterfaceC17445 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2629 f67751;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11459 f67752;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f67753;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONArray f67754;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8979 f67755;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11459 f67756;

    public C20974(C2629 c2629, C11459 c11459, C8979 c8979, LinkedHashMap linkedHashMap, JSONArray jSONArray, C11459 c114510) {
        this.f67751 = c2629;
        this.f67756 = c11459;
        this.f67755 = c8979;
        this.f67753 = linkedHashMap;
        this.f67754 = jSONArray;
        this.f67752 = c114510;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47789(C12619 c12619) {
        EnumC3447 enumC3447M30885 = c12619.m30885();
        EnumC3447 enumC3447 = EnumC3447.REGULAR;
        if (enumC3447M30885 == enumC3447) {
            JSONArray jSONArray = this.f67754;
            LinkedHashMap linkedHashMap = this.f67753;
            C8979 c8979 = this.f67755;
            C11459 c11459 = this.f67756;
            if (c11459 != null) {
                C12164 c12164Matcher = c11459.matcher((CharSequence) c12619.m30882().getName());
                boolean zMatches = c8979.f27286 ? c12164Matcher.matches() : c12164Matcher.find();
                C2629.m8282();
                if (!zMatches) {
                    if (c12164Matcher.m29603() || c12164Matcher.m29613()) {
                        C2629.m8284(linkedHashMap, "name_match_failed");
                        C2629.m8283(jSONArray, c12619, "name_match_failed");
                        return false;
                    }
                } else {
                    long jM30884 = c12619.m30884();
                    long jM30883 = c12619.m30883();
                    if (((c8979.f27279 == -1 || c8979.f27283 != -1) && jM30884 < 0) || (!(c8979.f27288 == null && c8979.f27285 == null) && jM30883 <= 0)) {
                        C2629.m8284(linkedHashMap, "metadata_unavailable");
                        C2629.m8283(jSONArray, c12619, "metadata_unavailable");
                        return false;
                    }
                    if ((c8979.f27279 == -1 || jM30884 >= c8979.f27279) && ((c8979.f27283 == -1 || jM30884 < c8979.f27283) && ((c8979.f27288 == null || jM30883 >= c8979.f27288.longValue()) && (c8979.f27285 == null || jM30883 < c8979.f27285.longValue())))) {
                        C11459 c114510 = this.f67752;
                        if (c114510 == null) {
                            return true;
                        }
                        try {
                            C12619 c12619M41613 = this.f67751.f8299.m41613(c12619.m30882().mo23554());
                            if (c12619M41613.m30885() != enumC3447) {
                                C2629.m8284(linkedHashMap, "file_unreadable");
                                C2629.m8283(jSONArray, c12619, "file_unreadable");
                                return false;
                            }
                            try {
                                InputStream inputStreamMo27926 = c12619M41613.m30882().mo27926();
                                try {
                                    boolean zM8285 = C2629.m8285(inputStreamMo27926, c114510);
                                    if (inputStreamMo27926 != null) {
                                        inputStreamMo27926.close();
                                    }
                                    return zM8285;
                                } catch (Throwable th) {
                                    if (inputStreamMo27926 == null) {
                                        throw th;
                                    }
                                    try {
                                        inputStreamMo27926.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException | IllegalArgumentException | SecurityException e) {
                                C2629.m8282();
                                String str = "content_search_failed";
                                C2629.m8284(linkedHashMap, "content_search_failed");
                                if (e instanceof CharacterCodingException) {
                                    str = "invalid_encoding";
                                } else if (e instanceof SocketTimeoutException) {
                                    str = "read_timeout";
                                }
                                C2629.m8283(jSONArray, c12619, str);
                                return false;
                            }
                        } catch (C3059 unused) {
                            C2629.m8284(linkedHashMap, "file_unreadable");
                            C2629.m8283(jSONArray, c12619, "file_unreadable");
                            return false;
                        }
                    }
                }
            } else {
                long jM30885 = c12619.m30884();
                long jM30886 = c12619.m30883();
                if (c8979.f27279 == -1) {
                }
                C2629.m8284(linkedHashMap, "metadata_unavailable");
                C2629.m8283(jSONArray, c12619, "metadata_unavailable");
                return false;
            }
        }
        return false;
    }
}
