package l;

import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12677 implements InterfaceC7961, InterfaceC14930, InterfaceC2271, InterfaceC21013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38192;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38193;

    public /* synthetic */ C12677(int i, Object obj) {
        this.f38192 = i;
        this.f38193 = obj;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f38192) {
            case 0:
                ViewOnLayoutChangeListenerC7738.m20724((ViewOnLayoutChangeListenerC7738) this.f38193, menuItem);
                break;
            default:
                C3822.m11570((C3822) this.f38193, menuItem);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC0612) obj).mo2495((List) this.f38193);
    }

    @Override // l.InterfaceC2271
    /* JADX INFO: renamed from: ֫ */
    public byte mo7499(int i) {
        ArrayList arrayList = (ArrayList) this.f38193;
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C17793 c17793 = (C17793) arrayList.get(i2);
            int iM41721 = c17793.m41721() - 1;
            if (i < iM41721) {
                return c17793.m41715(i + 1);
            }
            i -= iM41721;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        throw new C13934((String) this.f38193);
    }
}
