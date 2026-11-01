package p067l;

import bin.p000mt.json.JSON;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۡۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10707 implements InterfaceC17905 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ String f29667;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f29668;

    public /* synthetic */ C10707(String str, String str2) {
        this.f29667 = str;
        this.f29668 = str2;
    }

    @Override // p067l.InterfaceC17905
    /* JADX INFO: renamed from: ֫ */
    public final C5276 mo24636(String str, String str2, String str3) {
        return C5276.m11411(str, str2, "fatal", null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, this.f29667, "policyRevision", this.f29668).add("operation", "check_parent_links").add("backendReason", str3).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }
}
