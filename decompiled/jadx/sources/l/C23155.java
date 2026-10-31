package l;

import android.view.Menu;
import android.view.MenuItem;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71FU */
/* JADX INFO: loaded from: classes.dex */
public final class C23155 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f74418;

    public C23155(C21282 c21282, String str, boolean z) {
        Menu menuM48304;
        this.f74418 = str;
        String strM18061 = C6554.m18061(30, C9523.m24404(str));
        String strM18062 = C6554.m18061(30, str.replace('/', '.'));
        CharSequence charSequenceM18061 = C6554.m18061(30, str);
        CharSequence charSequenceM18062 = C6554.m18061(30, "L" + str + l.b);
        if (z) {
            menuM48304 = c21282.m48304().addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            menuM48304 = c21282.m48304();
        }
        menuM48304.add(R.string.MT_Protector, 0, 0, strM18061);
        if (!strM18061.equals(strM18062)) {
            menuM48304.add(R.string.MT_Protector, 1, 0, strM18062);
        }
        if (!strM18062.equals(charSequenceM18061)) {
            menuM48304.add(R.string.MT_Protector, 2, 0, charSequenceM18061);
        }
        menuM48304.add(R.string.MT_Protector, 3, 0, charSequenceM18062);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51333(MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            return true;
        }
        if (menuItem.getGroupId() != R.string.MT_Protector) {
            return false;
        }
        int itemId = menuItem.getItemId();
        String str = this.f74418;
        if (itemId == 0) {
            C4925.m14314((CharSequence) C9523.m24404(str));
        } else if (itemId == 1) {
            C4925.m14314((CharSequence) str.replace('/', '.'));
        } else if (itemId == 2) {
            C4925.m14314((CharSequence) str);
        } else if (itemId == 3) {
            C4925.m14314((CharSequence) ("L" + str + l.b));
        }
        return true;
    }
}
