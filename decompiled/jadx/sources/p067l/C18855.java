package p067l;

import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܿ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18855 implements InterfaceC1583 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ View f56324;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ boolean f56325;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC21283 f56326;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ArrayList f56327;

    public C18855(ArrayList arrayList, boolean z, View view, AbstractC21283 abstractC21283) {
        this.f56327 = arrayList;
        this.f56325 = z;
        this.f56324 = view;
        this.f56326 = abstractC21283;
    }

    @Override // p067l.InterfaceC1583
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = this.f56327;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int itemId = menuItem.getItemId();
        boolean z = this.f56325;
        if (itemId == R.string.MT_Protector) {
            C9486.m22095(arrayList, 0, z);
        } else if (itemId == R.string.MT_Protector) {
            C9486.m22095(arrayList, 1, z);
        } else if (itemId == R.string.MT_Protector) {
            C9486.m22095(arrayList, 2, z);
        } else if (itemId == R.string.MT_Protector) {
            C9486.m22095(arrayList, 3, z);
        } else if (itemId == R.string.MT_Protector) {
            Collections.reverse(arrayList);
            menuItem.setChecked(!z);
            this.f56324.setTag(R.id.MT_Protector, !z ? Object.class : null);
        }
        C21993.m49555(new C19526(this, arrayList2)).m42393(this.f56326);
        return true;
    }
}
