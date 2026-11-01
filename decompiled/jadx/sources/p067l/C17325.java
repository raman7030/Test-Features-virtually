package p067l;

/* JADX INFO: renamed from: l.ܺۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes5.dex */
public final class C17325 extends C20117 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ ActivityC3244 f51703;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17325(ActivityC3244 activityC3244, ActivityC3244 activityC3245) {
        super(activityC3245);
        this.f51703 = activityC3244;
    }

    @Override // p067l.C20117, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ActivityC3244 activityC3244 = this.f51703;
        if (activityC3244.f6301 != null) {
            activityC3244.f6301.m48371();
        }
    }
}
