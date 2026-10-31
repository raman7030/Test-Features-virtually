package l;

import android.content.Intent;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19755 implements InterfaceC23332, InterfaceC19764 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63811;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63812;

    public /* synthetic */ C19755(Object obj, Object obj2) {
        this.f63811 = obj;
        this.f63812 = obj2;
    }

    @Override // l.InterfaceC19764
    /* JADX INFO: renamed from: ֫ */
    public void mo4668(Intent intent, int i) {
        ActivityC10582.m26595((ActivityC10582) this.f63811, (AbstractC15440) this.f63812);
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo35309(long j) throws IOException {
        AbstractC3163 abstractC3163 = (AbstractC3163) this.f63811;
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) this.f63812;
        if (abstractC3163.mo9689()) {
            return abstractC3163.mo9681(j, interfaceC17889.getPath());
        }
        throw new IOException();
    }
}
