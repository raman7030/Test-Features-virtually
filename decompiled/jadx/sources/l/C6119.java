package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O6 */
/* JADX INFO: loaded from: classes3.dex */
public class C6119 extends JSONValue {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f18753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f18754;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f18755;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f18756;

    public C6119(String str) {
        this.f18753 = str;
        this.f18756 = "null".equals(str);
        this.f18754 = "true".equals(str);
        this.f18755 = "false".equals(str);
    }

    @Override // bin.mt.json.JSONValue
    public void write(C2158 c2158) throws IOException {
        c2158.m7120(this.f18753);
    }

    @Override // bin.mt.json.JSONValue
    public String toString() {
        return this.f18753;
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f18753.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean isNull() {
        return this.f18756;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isTrue() {
        return this.f18754;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isFalse() {
        return this.f18755;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isBoolean() {
        return this.f18754 || this.f18755;
    }

    @Override // bin.mt.json.JSONValue
    public boolean asBoolean() {
        return this.f18756 ? super.asBoolean() : this.f18754;
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f18753.equals(((C6119) obj).f18753);
        }
        return false;
    }
}
