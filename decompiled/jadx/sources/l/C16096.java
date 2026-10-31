package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܺᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K77A */
/* JADX INFO: loaded from: classes4.dex */
public final class C16096 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f49590;

    public C16096(boolean z) {
        this.f49590 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m37986() {
        JSONObject jSONObjectObject = JSON.object();
        boolean z = this.f49590;
        return jSONObjectObject.add("confused", z).add("appReferenceOutput", z ? "hex8_upper_no_0x" : "names_or_hex").add("appNameReferencesAccepted", !z).add("systemNameReferencesAccepted", true).add("hexPrefixAccepted", true);
    }
}
