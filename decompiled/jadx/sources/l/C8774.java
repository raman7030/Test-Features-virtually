package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۡۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8774 implements InterfaceC16348 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26741;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26742;

    public /* synthetic */ C8774(String str, String str2) {
        this.f26741 = str;
        this.f26742 = str2;
    }

    @Override // l.InterfaceC16348
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3059 mo22666(String str, String str2, String str3) {
        return C3059.m9369(str, str2, "fatal", null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, this.f26741, "policyRevision", this.f26742).add("operation", "check_parent_links").add("backendReason", str3).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }
}
