package p067l;

import android.net.Uri;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6196 {

    /* JADX INFO: renamed from: ۜ */
    public static final AbstractC17043 f15591 = C17853.f53284.m38684("localStorageMap");

    /* JADX INFO: renamed from: ۧ */
    public final String f15593;

    /* JADX INFO: renamed from: ܳ */
    public final Uri f15594;

    /* JADX INFO: renamed from: ܿ */
    public String f15596;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f15597;

    /* JADX INFO: renamed from: ᩻ */
    public final String f15598;

    /* JADX INFO: renamed from: ܽ */
    public final Map f15595 = C21562.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ֫ */
    public boolean f15592 = false;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m14042() {
        this.f15592 = true;
        f15591.m38684(this.f15598).mo29990();
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m14043() {
        if (this.f15592) {
            return;
        }
        AbstractC17043 abstractC17043 = this.f15597;
        try {
            abstractC17043.mo37342();
            C11996 c11996 = new C11996();
            synchronized (this.f15595) {
                c11996.writeInt(this.f15595.size());
                for (Map.Entry entry : this.f15595.entrySet()) {
                    c11996.m27443((CharSequence) entry.getKey());
                    c11996.m27443((CharSequence) entry.getValue());
                }
            }
            try {
                abstractC17043.m38654(c11996);
            } catch (IOException unused) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C6196(Uri uri, String str, String str2) {
        this.f15594 = uri;
        this.f15598 = str;
        this.f15596 = str2;
        String strConcat = uri.getPathSegments().get(1);
        if (!strConcat.endsWith("/") && !strConcat.endsWith(":")) {
            strConcat = strConcat.concat("/");
        }
        this.f15593 = strConcat;
        AbstractC17043 abstractC17043M38684 = f15591.m38684(str);
        this.f15597 = abstractC17043M38684;
        if (abstractC17043M38684.mo25094()) {
            try {
                C14677 c14677M38686 = abstractC17043M38684.m38686();
                int i = c14677M38686.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    this.f15595.put(c14677M38686.m33591(), c14677M38686.m33591());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m14041(String str, boolean z) {
        int iLastIndexOf;
        String str2;
        if (str.isEmpty()) {
            return this.f15594.getPathSegments().get(1);
        }
        String strM25286 = C10965.m25286(new StringBuilder(), this.f15593, str);
        Map map = this.f15595;
        String str3 = (String) map.get(strM25286);
        if (str3 != null) {
            return str3;
        }
        return (!z || (iLastIndexOf = strM25286.lastIndexOf(47)) == -1 || (str2 = (String) map.get(strM25286.substring(0, iLastIndexOf))) == null) ? strM25286 : C21459.m48621(iLastIndexOf, strM25286, C7470.m17248(str2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m14040() {
        return "/storage/" + this.f15598;
    }
}
