package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3402 implements Consumer {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18904 f10765;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f10766;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14615 f10767;

    public /* synthetic */ C3402(boolean[] zArr, C14615 c14615, C18904 c18904) {
        this.f10766 = zArr;
        this.f10767 = c14615;
        this.f10765 = c18904;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f10766[0] = true;
        this.f10767.setText("/" + this.f10765.m43637((String) obj));
    }
}
