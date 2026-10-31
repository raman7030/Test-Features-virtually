package l;

import android.media.MediaFormat;

/* JADX INFO: renamed from: l.ۢۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9352 implements InterfaceC22618, InterfaceC20711, InterfaceC5783 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f28398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f28399;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20711 f28400;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC20711 f28401;

    @Override // l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        if (i == 7) {
            this.f28398 = (InterfaceC22618) obj;
            return;
        }
        if (i == 8) {
            this.f28400 = (InterfaceC20711) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C20005 c20005 = (C20005) obj;
        if (c20005 == null) {
            this.f28399 = null;
            this.f28401 = null;
        } else {
            this.f28399 = c20005.m46142();
            this.f28401 = c20005.m46140();
        }
    }

    @Override // l.InterfaceC22618
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24148(long j, long j2, C8353 c8353, MediaFormat mediaFormat) {
        InterfaceC22618 interfaceC22618 = this.f28399;
        if (interfaceC22618 != null) {
            interfaceC22618.mo24148(j, j2, c8353, mediaFormat);
        }
        InterfaceC22618 interfaceC22619 = this.f28398;
        if (interfaceC22619 != null) {
            interfaceC22619.mo24148(j, j2, c8353, mediaFormat);
        }
    }

    @Override // l.InterfaceC20711
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24149(long j, float[] fArr) {
        InterfaceC20711 interfaceC20711 = this.f28401;
        if (interfaceC20711 != null) {
            interfaceC20711.mo24149(j, fArr);
        }
        InterfaceC20711 interfaceC20712 = this.f28400;
        if (interfaceC20712 != null) {
            interfaceC20712.mo24149(j, fArr);
        }
    }

    @Override // l.InterfaceC20711
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo24150() {
        InterfaceC20711 interfaceC20711 = this.f28401;
        if (interfaceC20711 != null) {
            interfaceC20711.mo24150();
        }
        InterfaceC20711 interfaceC20712 = this.f28400;
        if (interfaceC20712 != null) {
            interfaceC20712.mo24150();
        }
    }
}
