package p067l;

import bin.p000mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17N1 */
/* JADX INFO: loaded from: classes4.dex */
public class C13549 extends JSONValue {

    /* JADX INFO: renamed from: ᩸ */
    public final String f38116;

    @Override // bin.p000mt.json.JSONValue
    public boolean isNumber() {
        return true;
    }

    public C13549(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f38116 = str;
    }

    @Override // bin.p000mt.json.JSONValue
    public String toString() {
        return this.f38116;
    }

    @Override // bin.p000mt.json.JSONValue
    public void write(C4420 c4420) throws IOException {
        c4420.m9222(this.f38116);
    }

    @Override // bin.p000mt.json.JSONValue
    public int asInt() {
        return Integer.parseInt(this.f38116, 10);
    }

    @Override // bin.p000mt.json.JSONValue
    public long asLong() {
        return Long.parseLong(this.f38116, 10);
    }

    @Override // bin.p000mt.json.JSONValue
    public float asFloat() {
        return Float.parseFloat(this.f38116);
    }

    @Override // bin.p000mt.json.JSONValue
    public double asDouble() {
        return Double.parseDouble(this.f38116);
    }

    @Override // bin.p000mt.json.JSONValue
    public int hashCode() {
        return this.f38116.hashCode();
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f38116.equals(((C13549) obj).f38116);
        }
        return false;
    }
}
