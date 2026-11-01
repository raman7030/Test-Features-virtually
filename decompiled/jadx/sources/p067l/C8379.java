package p067l;

import android.view.MenuItem;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8379 implements InterfaceC24631, InterfaceC1583 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f22483;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f22484;

    public /* synthetic */ C8379(Object obj, Object obj2) {
        this.f22483 = obj;
        this.f22484 = obj2;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        C19799.m45016((C19799) this.f22483, (TextView) this.f22484, menuItem);
        return true;
    }

    @Override // p067l.InterfaceC24631
    /* JADX INFO: renamed from: ֫ */
    public String mo12962(C5318 c5318) {
        return ((C17984) this.f22483).m40956(c5318, (C24905) this.f22484);
    }
}
