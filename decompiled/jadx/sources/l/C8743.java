package l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8743 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2393 f26638;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C11044 f26639;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11749 f26640;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10338 f26641;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f26642;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f26643;

    public C8743(C9449 c9449) {
        Map mapUnmodifiableMap;
        this.f26640 = c9449.f28653;
        this.f26643 = c9449.f28652;
        C12454 c12454 = c9449.f28651;
        c12454.getClass();
        this.f26641 = new C10338(c12454);
        this.f26638 = c9449.f28650;
        Map map = c9449.f28654;
        byte[] bArr = C20032.f64884;
        if (map.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C20195.unmodifiableMap(new LinkedHashMap(map));
        }
        this.f26642 = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11749 m22622() {
        return this.f26640;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m22620() {
        return this.f26643;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10338 m22619() {
        return this.f26641;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m22615(String str) {
        return this.f26641.m26137(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2393 m22616() {
        return this.f26638;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9449 m22618() {
        C9449 c9449 = new C9449();
        Map linkedHashMap = Collections.EMPTY_MAP;
        c9449.f28654 = linkedHashMap;
        c9449.f28653 = this.f26640;
        c9449.f28652 = this.f26643;
        c9449.f28650 = this.f26638;
        Map map = this.f26642;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        c9449.f28654 = linkedHashMap;
        c9449.f28651 = this.f26641.m26138();
        return c9449;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11044 m22617() {
        C11044 c11044 = this.f26639;
        if (c11044 != null) {
            return c11044;
        }
        C11044 c11044M27422 = C11044.m27422(this.f26641);
        this.f26639 = c11044M27422;
        return c11044M27422;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m22621() {
        return this.f26640.m28780();
    }

    public final String toString() {
        return "Request{method=" + this.f26643 + ", url=" + this.f26640 + ", tags=" + this.f26642 + '}';
    }
}
