package p067l;

import android.R;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩹۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23557 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f75027;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f75028;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75029;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f75030;

    public /* synthetic */ ViewOnClickListenerC23557(Object obj, Object obj2, Object obj3, int i) {
        this.f75029 = i;
        this.f75030 = obj;
        this.f75028 = obj2;
        this.f75027 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f75029;
        Object obj = this.f75027;
        Object obj2 = this.f75028;
        Object obj3 = this.f75030;
        switch (i) {
            case 0:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) obj2;
                DialogInterfaceC2564[] dialogInterfaceC2564Arr = (DialogInterfaceC2564[]) obj;
                if (((C10748) obj3).m24761()) {
                    C12848.m29421(abstractActivityC5549, new RunnableC4782(0, dialogInterfaceC2564Arr));
                }
                break;
            case 1:
                final C8838 c8838 = (C8838) obj3;
                final EditText editText = (EditText) obj2;
                final EditText editText2 = (EditText) obj;
                C1898 c1898 = new C1898(view.getContext(), view, 0);
                c1898.m50638().add(0, R.string.selectAll, 0, R.string.selectAll);
                c1898.m50638().add(0, bin.p000mt.plus.R.string.MT_Protector, 0, bin.p000mt.plus.R.string.MT_Protector);
                c1898.m50638().add(0, bin.p000mt.plus.R.string.MT_Protector, 0, bin.p000mt.plus.R.string.MT_Protector);
                c1898.m50636(new InterfaceC1583() { // from class: l.۠֫ܳ
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C22586.m50625(c8838, editText, editText2, menuItem);
                        return true;
                    }
                });
                c1898.m50639();
                break;
            default:
                final DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) obj3;
                final SpannableString spannableString = (SpannableString) obj2;
                final String str = (String) obj;
                int i2 = ActivityC12426.f34729;
                C1898 c1899 = new C1898(view.getContext(), view, 0);
                C0994 c0994M50638 = c1899.m50638();
                MenuItem menuItemAdd = c0994M50638.add(1, bin.p000mt.plus.R.string.MT_Protector, 0, bin.p000mt.plus.R.string.MT_Protector);
                MenuItem menuItemAdd2 = c0994M50638.add(1, bin.p000mt.plus.R.string.MT_Protector, 0, bin.p000mt.plus.R.string.MT_Protector);
                MenuItem menuItemAdd3 = c0994M50638.add(0, bin.p000mt.plus.R.string.MT_Protector, 0, bin.p000mt.plus.R.string.MT_Protector);
                c0994M50638.setGroupCheckable(1, true, true);
                C1938.m52015(c0994M50638);
                if (ApplicationC21448.f67649.getBoolean("ewse", true)) {
                    menuItemAdd.setChecked(true);
                } else {
                    menuItemAdd2.setChecked(true);
                }
                menuItemAdd3.setCheckable(true);
                menuItemAdd3.setChecked(ApplicationC21448.f67649.getBoolean("ewrp", false));
                c1899.m50636(new InterfaceC1583() { // from class: l.ۚ᩹ۢ
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i3 = ActivityC12426.f34729;
                        int itemId = menuItem.getItemId();
                        if (itemId == bin.p000mt.plus.R.string.MT_Protector) {
                            menuItem.setChecked(true);
                            C24104.m53360(ApplicationC21448.f67649, "ewse", true);
                            return true;
                        }
                        if (itemId == bin.p000mt.plus.R.string.MT_Protector) {
                            menuItem.setChecked(true);
                            C24104.m53360(ApplicationC21448.f67649, "ewse", false);
                            return true;
                        }
                        menuItem.setChecked(!menuItem.isChecked());
                        ApplicationC21448.f67649.edit().putBoolean("ewrp", menuItem.isChecked()).apply();
                        dialogInterfaceC2564.m3853(menuItem.isChecked() ? spannableString : str);
                        return true;
                    }
                });
                c1899.m50639();
                C1828.m48013(c1899);
                break;
        }
    }
}
