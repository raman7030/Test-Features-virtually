package p067l;

import android.content.ClipDescription;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۤ۟ */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1345 implements InterfaceC1135 {

    /* JADX INFO: renamed from: ֫ */
    public final Uri f33466;

    /* JADX INFO: renamed from: ۧ */
    public final ClipDescription f33467;

    /* JADX INFO: renamed from: ܽ */
    public final Uri f33468;

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18487() {
        return null;
    }

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ܽ */
    public final void mo18489() {
    }

    public C1345(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f33466 = uri;
        this.f33467 = clipDescription;
        this.f33468 = uri2;
    }

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ۧ */
    public final Uri mo18488() {
        return this.f33466;
    }

    @Override // p067l.InterfaceC1135
    public final ClipDescription getDescription() {
        return this.f33467;
    }

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ᩳ */
    public final Uri mo18490() {
        return this.f33468;
    }
}
