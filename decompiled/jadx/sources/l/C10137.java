package l;

import android.content.ClipDescription;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10137 implements InterfaceC5903 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri f30504;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ClipDescription f30505;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Uri f30506;

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16561() {
        return null;
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ܽ */
    public final void mo16563() {
    }

    public C10137(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f30504 = uri;
        this.f30505 = clipDescription;
        this.f30506 = uri2;
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ۧ */
    public final Uri mo16562() {
        return this.f30504;
    }

    @Override // l.InterfaceC5903
    public final ClipDescription getDescription() {
        return this.f30505;
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ᩳ */
    public final Uri mo16564() {
        return this.f30506;
    }
}
