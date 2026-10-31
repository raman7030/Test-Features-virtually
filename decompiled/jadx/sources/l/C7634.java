package l;

import android.media.Spatializer;

/* JADX INFO: renamed from: l.۟ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7634 implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6908 f23586;

    public C7634(C6908 c6908) {
        this.f23586 = c6908;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f23586.m18699();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f23586.m18699();
    }
}
