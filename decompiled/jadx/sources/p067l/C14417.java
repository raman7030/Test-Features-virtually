package p067l;

import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14417 implements InterfaceC9934, InterfaceC1583, InterfaceC4527, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f41219;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f41220;

    public /* synthetic */ C14417(int i, Object obj) {
        this.f41219 = i;
        this.f41220 = obj;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f41219) {
            case 0:
                ViewOnLayoutChangeListenerC9723.m22704((ViewOnLayoutChangeListenerC9723) this.f41220, menuItem);
                break;
            default:
                C6001.m13506((C6001) this.f41220, menuItem);
                break;
        }
        return true;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC2950) obj).mo4851((List) this.f41220);
    }

    @Override // p067l.InterfaceC4527
    /* JADX INFO: renamed from: ֫ */
    public byte mo9582(int i) {
        ArrayList arrayList = (ArrayList) this.f41220;
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C19279 c19279 = (C19279) arrayList.get(i2);
            int iM43967 = c19279.m43967() - 1;
            if (i < iM43967) {
                return c19279.m43961(i + 1);
            }
            i -= iM43967;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        throw new C15611((String) this.f41220);
    }
}
