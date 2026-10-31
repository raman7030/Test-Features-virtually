package l;

/* JADX INFO: renamed from: l.ܺۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes5.dex */
public final class C15737 extends C18675 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0921 f48563;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15737(ActivityC0921 activityC0921, ActivityC0921 activityC0922) {
        super(activityC0922);
        this.f48563 = activityC0921;
    }

    @Override // l.C18675, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ActivityC0921 activityC0921 = this.f48563;
        if (activityC0921.f3526 != null) {
            activityC0921.f3526.m46057();
        }
    }
}
