package p067l;

import bin.p000mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAGN */
/* JADX INFO: loaded from: classes3.dex */
public class C9525 extends JSONValue {

    /* JADX INFO: renamed from: ᩸ */
    public final String f26088;

    @Override // bin.p000mt.json.JSONValue
    public boolean isString() {
        return true;
    }

    public C9525(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f26088 = str;
    }

    @Override // bin.p000mt.json.JSONValue
    public void write(C4420 c4420) throws IOException {
        c4420.m9220(this.f26088);
    }

    @Override // bin.p000mt.json.JSONValue
    public String asString() {
        return this.f26088;
    }

    @Override // bin.p000mt.json.JSONValue
    public int hashCode() {
        return this.f26088.hashCode();
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f26088.equals(((C9525) obj).f26088);
        }
        return false;
    }
}
