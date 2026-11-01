package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20293 {

    /* JADX INFO: renamed from: ֫ */
    public final long f62693;

    /* JADX INFO: renamed from: ۧ */
    public final String f62694;

    /* JADX INFO: renamed from: ܽ */
    public final int f62695;

    /* JADX INFO: renamed from: ܿ */
    public final int f62696;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f62697;

    public C20293(JSONObject jSONObject) {
        this.f62694 = jSONObject.getString("arch", "");
        this.f62695 = jSONObject.getInt("bits", 0);
        this.f62693 = C24614.m54251(jSONObject, "address", 0L);
        String string = jSONObject.getString("hex", "");
        this.f62696 = jSONObject.getInt("size", 0);
        int length = string.length();
        if ((length & 1) != 0) {
            throw new C24315("Invalid hex length from radare2");
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            int iDigit = Character.digit(string.charAt(i3), 16);
            int iDigit2 = Character.digit(string.charAt(i3 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw new C24315("Invalid hex digit from radare2");
            }
            bArr[i2] = (byte) (iDigit2 | (iDigit << 4));
        }
        this.f62697 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20293 m45826(JSONObject jSONObject) {
        return new C20293(jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m45827() {
        return (byte[]) this.f62697.clone();
    }
}
