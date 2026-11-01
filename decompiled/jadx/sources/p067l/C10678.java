package p067l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10678 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4643 f29564;

    /* JADX INFO: renamed from: ۧ */
    public volatile C12865 f29565;

    /* JADX INFO: renamed from: ܳ */
    public final C13535 f29566;

    /* JADX INFO: renamed from: ܽ */
    public final C12194 f29567;

    /* JADX INFO: renamed from: ܿ */
    public final Map f29568;

    /* JADX INFO: renamed from: ᩳ */
    public final String f29569;

    public C10678(C11349 c11349) {
        Map mapUnmodifiableMap;
        this.f29566 = c11349.f31602;
        this.f29569 = c11349.f31601;
        C14205 c14205 = c11349.f31600;
        c14205.getClass();
        this.f29567 = new C12194(c14205);
        this.f29564 = c11349.f31599;
        Map map = c11349.f31603;
        byte[] bArr = C21407.f67526;
        if (map.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C21562.unmodifiableMap(new LinkedHashMap(map));
        }
        this.f29568 = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C13535 m24591() {
        return this.f29566;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m24589() {
        return this.f29569;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C12194 m24588() {
        return this.f29567;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m24584(String str) {
        return this.f29567.m28162(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4643 m24585() {
        return this.f29564;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C11349 m24587() {
        C11349 c11349 = new C11349();
        Map linkedHashMap = Collections.EMPTY_MAP;
        c11349.f31603 = linkedHashMap;
        c11349.f31602 = this.f29566;
        c11349.f31601 = this.f29569;
        c11349.f31599 = this.f29564;
        Map map = this.f29568;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        c11349.f31603 = linkedHashMap;
        c11349.f31600 = this.f29567.m28163();
        return c11349;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12865 m24586() {
        C12865 c12865 = this.f29565;
        if (c12865 != null) {
            return c12865;
        }
        C12865 c12865M29484 = C12865.m29484(this.f29567);
        this.f29565 = c12865M29484;
        return c12865M29484;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m24590() {
        return this.f29566.m30827();
    }

    public final String toString() {
        return "Request{method=" + this.f29569 + ", url=" + this.f29566 + ", tags=" + this.f29568 + '}';
    }
}
