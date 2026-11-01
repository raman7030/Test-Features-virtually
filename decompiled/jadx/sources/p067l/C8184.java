package p067l;

import bin.p000mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O6 */
/* JADX INFO: loaded from: classes3.dex */
public class C8184 extends JSONValue {

    /* JADX INFO: renamed from: ۙ */
    public final String f21608;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f21609;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f21610;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f21611;

    public C8184(String str) {
        this.f21608 = str;
        this.f21611 = "null".equals(str);
        this.f21609 = "true".equals(str);
        this.f21610 = "false".equals(str);
    }

    @Override // bin.p000mt.json.JSONValue
    public void write(C4420 c4420) throws IOException {
        c4420.m9215(this.f21608);
    }

    @Override // bin.p000mt.json.JSONValue
    public String toString() {
        return this.f21608;
    }

    @Override // bin.p000mt.json.JSONValue
    public int hashCode() {
        return this.f21608.hashCode();
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean isNull() {
        return this.f21611;
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean isTrue() {
        return this.f21609;
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean isFalse() {
        return this.f21610;
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean isBoolean() {
        return this.f21609 || this.f21610;
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean asBoolean() {
        return this.f21611 ? super.asBoolean() : this.f21609;
    }

    @Override // bin.p000mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f21608.equals(((C8184) obj).f21608);
        }
        return false;
    }
}
