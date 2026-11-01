package p067l;

import android.content.Intent;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21144 implements InterfaceC24544, InterfaceC21153 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f66446;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f66447;

    public /* synthetic */ C21144(Object obj, Object obj2) {
        this.f66446 = obj;
        this.f66447 = obj2;
    }

    @Override // p067l.InterfaceC21153
    /* JADX INFO: renamed from: ֫ */
    public void mo6900(Intent intent, int i) {
        ActivityC12426.m28632((ActivityC12426) this.f66446, (AbstractC17043) this.f66447);
    }

    @Override // p067l.InterfaceC24544
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo37461(long j) throws IOException {
        AbstractC5375 abstractC5375 = (AbstractC5375) this.f66446;
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) this.f66447;
        if (abstractC5375.mo11733()) {
            return abstractC5375.mo11725(j, interfaceC19370.getPath());
        }
        throw new IOException();
    }
}
