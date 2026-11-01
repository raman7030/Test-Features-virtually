package p067l;

import android.view.Menu;
import android.view.MenuItem;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩺ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71FU */
/* JADX INFO: loaded from: classes.dex */
public final class C24375 {

    /* JADX INFO: renamed from: ֫ */
    public String f77164;

    public C24375(C1898 c1898, String str, boolean z) {
        Menu menuM50638;
        this.f77164 = str;
        String strM20011 = C8597.m20011(30, C11419.m26414(str));
        String strM20012 = C8597.m20011(30, str.replace('/', '.'));
        CharSequence charSequenceM20011 = C8597.m20011(30, str);
        CharSequence charSequenceM20012 = C8597.m20011(30, "L" + str + C0249l.f1196b);
        if (z) {
            menuM50638 = c1898.m50638().addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            menuM50638 = c1898.m50638();
        }
        menuM50638.add(R.string.MT_Protector, 0, 0, strM20011);
        if (!strM20011.equals(strM20012)) {
            menuM50638.add(R.string.MT_Protector, 1, 0, strM20012);
        }
        if (!strM20012.equals(charSequenceM20011)) {
            menuM50638.add(R.string.MT_Protector, 2, 0, charSequenceM20011);
        }
        menuM50638.add(R.string.MT_Protector, 3, 0, charSequenceM20012);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53728(MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            return true;
        }
        if (menuItem.getGroupId() != R.string.MT_Protector) {
            return false;
        }
        int itemId = menuItem.getItemId();
        String str = this.f77164;
        if (itemId == 0) {
            C7050.m16211((CharSequence) C11419.m26414(str));
        } else if (itemId == 1) {
            C7050.m16211((CharSequence) str.replace('/', '.'));
        } else if (itemId == 2) {
            C7050.m16211((CharSequence) str);
        } else if (itemId == 3) {
            C7050.m16211((CharSequence) ("L" + str + C0249l.f1196b));
        }
        return true;
    }
}
