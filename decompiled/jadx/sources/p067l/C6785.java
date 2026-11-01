package p067l;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۙ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6785 implements InterfaceC5761 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5444 f17567;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7556 f17568;

    public C6785(C5444 c5444, C7556 c7556) {
        this.f17567 = c5444;
        this.f17568 = c7556;
    }

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ֫ */
    public final void mo12854(int i, byte[] bArr) {
        this.f17568.m17473(new ByteArrayInputStream(bArr, 0, i), null);
    }

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ֫ */
    public final void mo12855(ByteBuffer byteBuffer) {
        this.f17568.m17474(byteBuffer);
    }

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ֫ */
    public final void mo12853(int i) {
        this.f17567.f12992.m53436(i);
    }

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ܳ֫ */
    public final void mo12856() {
        this.f17567.f12990 = true;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f17567.f12992.m53444();
    }
}
