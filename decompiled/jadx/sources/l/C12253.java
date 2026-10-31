package l;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: l.۫۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12253 implements InterfaceC5903 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputContentInfo f36513;

    public C12253(Object obj) {
        this.f36513 = (InputContentInfo) obj;
    }

    public C12253(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f36513 = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ۧ */
    public final Uri mo16562() {
        return this.f36513.getContentUri();
    }

    @Override // l.InterfaceC5903
    public final ClipDescription getDescription() {
        return this.f36513.getDescription();
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ᩳ */
    public final Uri mo16564() {
        return this.f36513.getLinkUri();
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16561() {
        return this.f36513;
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ܽ */
    public final void mo16563() {
        this.f36513.requestPermission();
    }
}
