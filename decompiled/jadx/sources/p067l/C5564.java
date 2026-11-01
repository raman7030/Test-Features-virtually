package p067l;

import android.view.MenuItem;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5564 implements InterfaceC17161, InterfaceC1583, InterfaceC4595, InterfaceC11201 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f13447;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f13448;

    public /* synthetic */ C5564(int i, Object obj) {
        this.f13447 = i;
        this.f13448 = obj;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f13447) {
            case 1:
                C21126.m47747((C21126) this.f13448, menuItem);
                return true;
            default:
                return ActivityC3244.m5616((ActivityC3244) this.f13448, menuItem);
        }
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo9169() {
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        switch (this.f13447) {
            case 2:
                ((C3027) this.f13448).mo13474(i);
                break;
            default:
                ((InterfaceC23331) this.f13448).mo38156((int) (i * 0.6f));
                break;
        }
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public void mo9172(C16564 c16564, BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write((byte[]) this.f13448);
    }

    @Override // p067l.InterfaceC17161
    /* JADX INFO: renamed from: ֫ */
    public boolean mo12311(String str) {
        return ((String) this.f13448).equals(str);
    }
}
