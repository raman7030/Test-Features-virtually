package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18860 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f59464;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f59465;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f59466;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f59467;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f59468;

    public C18860(JSONObject jSONObject) {
        this.f59465 = jSONObject.getString("arch", "");
        this.f59466 = jSONObject.getInt("bits", 0);
        this.f59464 = C23407.m51853(jSONObject, "address", 0L);
        String string = jSONObject.getString("hex", "");
        this.f59467 = jSONObject.getInt("size", 0);
        int length = string.length();
        if ((length & 1) != 0) {
            throw new C23092("Invalid hex length from radare2");
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            int iDigit = Character.digit(string.charAt(i3), 16);
            int iDigit2 = Character.digit(string.charAt(i3 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw new C23092("Invalid hex digit from radare2");
            }
            bArr[i2] = (byte) (iDigit2 | (iDigit << 4));
        }
        this.f59468 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18860 m43560(JSONObject jSONObject) {
        return new C18860(jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43561() {
        return (byte[]) this.f59468.clone();
    }
}
