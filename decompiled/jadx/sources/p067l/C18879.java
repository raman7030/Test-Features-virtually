package p067l;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ܿ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18879 extends AbstractC7739 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f56372d = 0;
    public static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b */
    public final String f56373b;

    /* JADX INFO: renamed from: c */
    public final transient C17537 f56374c;

    /* JADX INFO: renamed from: b0 */
    public static C18879 m42966b0(String str, boolean z) {
        C17537 c17537M13927a;
        C12826.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                    throw new C17796("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                c17537M13927a = C6139.m13927a(str);
            } catch (C4798 e) {
                if (z) {
                    throw e;
                }
                c17537M13927a = null;
            }
            return new C18879(str, c17537M13927a);
        }
        throw new C17796("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public C18879(String str, C17537 c17537) {
        this.f56373b = str;
        this.f56374c = c17537;
    }

    @Override // p067l.AbstractC7739
    /* JADX INFO: renamed from: k */
    public final String mo17866k() {
        return this.f56373b;
    }

    @Override // p067l.AbstractC7739
    /* JADX INFO: renamed from: W */
    public final C17537 mo17864W() {
        C17537 c17537 = this.f56374c;
        return c17537 != null ? c17537 : C6139.m13927a(this.f56373b);
    }

    private Object writeReplace() {
        return new C21959((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p067l.AbstractC7739
    /* JADX INFO: renamed from: a0 */
    public final void mo17865a0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f56373b);
    }
}
