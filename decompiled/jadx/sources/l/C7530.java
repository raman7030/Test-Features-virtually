package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAGN */
/* JADX INFO: loaded from: classes3.dex */
public class C7530 extends JSONValue {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f23175;

    @Override // bin.mt.json.JSONValue
    public boolean isString() {
        return true;
    }

    public C7530(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f23175 = str;
    }

    @Override // bin.mt.json.JSONValue
    public void write(C2158 c2158) throws IOException {
        c2158.m7125(this.f23175);
    }

    @Override // bin.mt.json.JSONValue
    public String asString() {
        return this.f23175;
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f23175.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f23175.equals(((C7530) obj).f23175);
        }
        return false;
    }
}
