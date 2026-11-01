package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܺᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K77A */
/* JADX INFO: loaded from: classes4.dex */
public final class C17666 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f52753;

    public C17666(boolean z) {
        this.f52753 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m40176() {
        JSONObject jSONObjectObject = JSON.object();
        boolean z = this.f52753;
        return jSONObjectObject.add("confused", z).add("appReferenceOutput", z ? "hex8_upper_no_0x" : "names_or_hex").add("appNameReferencesAccepted", !z).add("systemNameReferencesAccepted", true).add("hexPrefixAccepted", true);
    }
}
