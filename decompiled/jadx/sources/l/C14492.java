package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ܳۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I23M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14492 implements InterfaceC4644 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44389;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f44390;

    public /* synthetic */ C14492(AbstractC15440 abstractC15440, int i) {
        this.f44389 = i;
        this.f44390 = abstractC15440;
    }

    @Override // l.InterfaceC4644
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap mo5660() {
        switch (this.f44389) {
            case 0:
                return C17447.m40793(this.f44390);
            default:
                return C17447.m40783(this.f44390);
        }
    }
}
