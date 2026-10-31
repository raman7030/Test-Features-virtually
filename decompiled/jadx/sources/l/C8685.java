package l;

import android.content.ClipData;
import android.view.ContentInfo;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8685 implements InterfaceC15739 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentInfo f26465;

    public C8685(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f26465 = contentInfo;
    }

    @Override // l.InterfaceC15739
    /* JADX INFO: renamed from: ֫ */
    public final ContentInfo mo7597() {
        return this.f26465;
    }

    @Override // l.InterfaceC15739
    /* JADX INFO: renamed from: ۧ */
    public final ClipData mo7598() {
        return this.f26465.getClip();
    }

    @Override // l.InterfaceC15739
    public final int getSource() {
        return this.f26465.getSource();
    }

    @Override // l.InterfaceC15739
    /* JADX INFO: renamed from: ᩻ */
    public final int mo7599() {
        return this.f26465.getFlags();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.f26465 + l.d;
    }
}
