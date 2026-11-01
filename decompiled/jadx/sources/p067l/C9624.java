package p067l;

import android.media.Spatializer;

/* JADX INFO: renamed from: l.۟ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9624 implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8934 f26499;

    public C9624(C8934 c8934) {
        this.f26499 = c8934;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f26499.m20648();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f26499.m20648();
    }
}
