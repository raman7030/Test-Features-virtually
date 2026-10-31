package l;

import android.R;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩹۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22294 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72300;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72301;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72302;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72303;

    public /* synthetic */ ViewOnClickListenerC22294(Object obj, Object obj2, Object obj3, int i) {
        this.f72302 = i;
        this.f72303 = obj;
        this.f72301 = obj2;
        this.f72300 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f72302;
        Object obj = this.f72300;
        Object obj2 = this.f72301;
        Object obj3 = this.f72303;
        switch (i) {
            case 0:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) obj2;
                DialogInterfaceC0206[] dialogInterfaceC0206Arr = (DialogInterfaceC0206[]) obj;
                if (((C8817) obj3).m22791()) {
                    C11026.m27359(abstractActivityC3346, new RunnableC2539(0, dialogInterfaceC0206Arr));
                }
                break;
            case 1:
                final C6807 c6807 = (C6807) obj3;
                final EditText editText = (EditText) obj2;
                final EditText editText2 = (EditText) obj;
                C21282 c21282 = new C21282(view.getContext(), view, 0);
                c21282.m48304().add(0, R.string.selectAll, 0, R.string.selectAll);
                c21282.m48304().add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                c21282.m48304().add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                c21282.m48302(new InterfaceC14930() { // from class: l.۠֫ܳ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C21273.m48294(c6807, editText, editText2, menuItem);
                        return true;
                    }
                });
                c21282.m48305();
                break;
            default:
                final DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) obj3;
                final SpannableString spannableString = (SpannableString) obj2;
                final String str = (String) obj;
                int i2 = ActivityC10582.f31759;
                C21282 c21283 = new C21282(view.getContext(), view, 0);
                C3060 c3060M48304 = c21283.m48304();
                MenuItem menuItemAdd = c3060M48304.add(1, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                MenuItem menuItemAdd2 = c3060M48304.add(1, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                MenuItem menuItemAdd3 = c3060M48304.add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                c3060M48304.setGroupCheckable(1, true, true);
                C22090.m49677(c3060M48304);
                if (ApplicationC20075.f65008.getBoolean("ewse", true)) {
                    menuItemAdd.setChecked(true);
                } else {
                    menuItemAdd2.setChecked(true);
                }
                menuItemAdd3.setCheckable(true);
                menuItemAdd3.setChecked(ApplicationC20075.f65008.getBoolean("ewrp", false));
                c21283.m48302(new InterfaceC14930() { // from class: l.ۚ᩹ۢ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i3 = ActivityC10582.f31759;
                        int itemId = menuItem.getItemId();
                        if (itemId == bin.mt.plus.R.string.MT_Protector) {
                            menuItem.setChecked(true);
                            C22870.m50970(ApplicationC20075.f65008, "ewse", true);
                            return true;
                        }
                        if (itemId == bin.mt.plus.R.string.MT_Protector) {
                            menuItem.setChecked(true);
                            C22870.m50970(ApplicationC20075.f65008, "ewse", false);
                            return true;
                        }
                        menuItem.setChecked(!menuItem.isChecked());
                        ApplicationC20075.f65008.edit().putBoolean("ewrp", menuItem.isChecked()).apply();
                        dialogInterfaceC0206.m1440(menuItem.isChecked() ? spannableString : str);
                        return true;
                    }
                });
                c21283.m48305();
                C19871.m45702(c21283);
                break;
        }
    }
}
