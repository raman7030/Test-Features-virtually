package l;

import android.view.MenuItem;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3362 implements InterfaceC15564, InterfaceC14930, InterfaceC2343, InterfaceC9294 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10639;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10640;

    public /* synthetic */ C3362(int i, Object obj) {
        this.f10639 = i;
        this.f10640 = obj;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f10639) {
            case 1:
                C19736.m45443((C19736) this.f10640, menuItem);
                return true;
            default:
                return ActivityC0921.m3297((ActivityC0921) this.f10640, menuItem);
        }
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo7074() {
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        switch (this.f10639) {
            case 2:
                ((C0692) this.f10640).mo11538(i);
                break;
            default:
                ((InterfaceC22057) this.f10640).mo35995((int) (i * 0.6f));
                break;
        }
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write((byte[]) this.f10640);
    }

    @Override // l.InterfaceC15564
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo10274(String str) {
        return ((String) this.f10640).equals(str);
    }
}
