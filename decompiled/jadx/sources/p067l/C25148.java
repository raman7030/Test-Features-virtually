package p067l;

import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAG5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25148 extends AbstractC18933 {
    @Override // p067l.AbstractViewOnClickListenerC14239, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f40549.m12191()) {
            return false;
        }
        C1898 c1898 = new C1898(this.f37526, view, 8388693);
        C9702.m22649(view);
        c1898.m50640();
        C0994 c0994M50638 = c1898.m50638();
        SubMenu subMenuAddSubMenu = c0994M50638.addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
        m55200(subMenuAddSubMenu);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ܳ᩸ܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                Main main = this.f48295.f37526;
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return C25148.m55201(main, menuItem.getItemId());
                }
                AbstractC18933.m43026(main);
                return true;
            }
        });
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55200(SubMenu subMenu) {
        subMenu.add(0, R.id.MT_Protector, 0, "FTP");
        if (C24414.m53850()) {
            subMenu.add(0, R.id.MT_Protector, 0, "FTPS");
            subMenu.add(0, R.id.MT_Protector, 0, "SFTP");
            subMenu.add(0, R.id.MT_Protector, 0, "SMB");
            subMenu.add(0, R.id.MT_Protector, 0, "WebDav");
            subMenu.add(0, R.id.MT_Protector, 0, C7050.m16224(R.string.MT_Protector));
            return;
        }
        subMenu.add(0, R.id.MT_Protector, 0, "FTPS (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SFTP (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SMB (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "WebDav (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, C7050.m16224(R.string.MT_Protector).concat(" (VIP)")).setEnabled(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m55201(AbstractActivityC5549 abstractActivityC5549, int i) {
        if (i == R.id.MT_Protector) {
            C4209.m8537(abstractActivityC5549);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C8903.m20562(abstractActivityC5549);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C16358.m37164(abstractActivityC5549);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C7269.m16646(abstractActivityC5549);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C24564.m54164(abstractActivityC5549);
            return true;
        }
        if (i != R.id.MT_Protector) {
            return false;
        }
        C14566.m33298(abstractActivityC5549);
        return true;
    }
}
