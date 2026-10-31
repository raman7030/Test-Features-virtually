package l;

import android.view.MenuItem;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6324 implements InterfaceC23425, InterfaceC14930 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19612;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19613;

    public /* synthetic */ C6324(Object obj, Object obj2) {
        this.f19612 = obj;
        this.f19613 = obj2;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        C18340.m42754((C18340) this.f19612, (TextView) this.f19613, menuItem);
        return true;
    }

    @Override // l.InterfaceC23425
    /* JADX INFO: renamed from: ֫ */
    public String mo10986(C3104 c3104) {
        return ((C16431) this.f19612).m38731(c3104, (C23713) this.f19613);
    }
}
