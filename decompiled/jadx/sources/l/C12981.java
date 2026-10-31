package l;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: l.۬۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12981 implements InterfaceC15097 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10160 f38886;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Context f38887;

    public C12981(Application application) {
        C10160 c10160 = new C10160();
        this.f38887 = application.getApplicationContext();
        this.f38886 = c10160;
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21449 mo6247() {
        return new C12276(this.f38887, this.f38886.mo6247());
    }
}
