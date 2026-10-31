package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17N1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11764 extends JSONValue {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f35117;

    @Override // bin.mt.json.JSONValue
    public boolean isNumber() {
        return true;
    }

    public C11764(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f35117 = str;
    }

    @Override // bin.mt.json.JSONValue
    public String toString() {
        return this.f35117;
    }

    @Override // bin.mt.json.JSONValue
    public void write(C2158 c2158) throws IOException {
        c2158.m7127(this.f35117);
    }

    @Override // bin.mt.json.JSONValue
    public int asInt() {
        return Integer.parseInt(this.f35117, 10);
    }

    @Override // bin.mt.json.JSONValue
    public long asLong() {
        return Long.parseLong(this.f35117, 10);
    }

    @Override // bin.mt.json.JSONValue
    public float asFloat() {
        return Float.parseFloat(this.f35117);
    }

    @Override // bin.mt.json.JSONValue
    public double asDouble() {
        return Double.parseDouble(this.f35117);
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f35117.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f35117.equals(((C11764) obj).f35117);
        }
        return false;
    }
}
