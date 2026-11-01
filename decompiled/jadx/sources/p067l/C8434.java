package p067l;

import android.content.res.Configuration;

/* JADX INFO: renamed from: l.ۛ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8434 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f22618;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Object f22619;

    public /* synthetic */ C8434(int i, Object obj) {
        this.f22618 = i;
        this.f22619 = obj;
    }

    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        switch (this.f22618) {
            case 0:
                AbstractC7291.m16751((AbstractC7291) this.f22619, (Configuration) obj);
                break;
            default:
                ((C19409) obj).m44189().setText(((C18028) this.f22619).m41067());
                break;
        }
    }
}
