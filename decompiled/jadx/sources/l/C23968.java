package l;

import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAG5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23968 extends AbstractC17429 {
    @Override // l.AbstractViewOnClickListenerC12490, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f37526.m10155()) {
            return false;
        }
        C21282 c21282 = new C21282(this.f34527, view, 8388693);
        C7716.m20669(view);
        c21282.m48306();
        C3060 c3060M48304 = c21282.m48304();
        SubMenu subMenuAddSubMenu = c3060M48304.addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
        m52794(subMenuAddSubMenu);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ܳ᩸ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                Main main = this.f45181.f34527;
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return C23968.m52795(main, menuItem.getItemId());
                }
                AbstractC17429.m40769(main);
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52794(SubMenu subMenu) {
        subMenu.add(0, R.id.MT_Protector, 0, "FTP");
        if (C23196.m51454()) {
            subMenu.add(0, R.id.MT_Protector, 0, "FTPS");
            subMenu.add(0, R.id.MT_Protector, 0, "SFTP");
            subMenu.add(0, R.id.MT_Protector, 0, "SMB");
            subMenu.add(0, R.id.MT_Protector, 0, "WebDav");
            subMenu.add(0, R.id.MT_Protector, 0, C4925.m14327(R.string.MT_Protector));
            return;
        }
        subMenu.add(0, R.id.MT_Protector, 0, "FTPS (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SFTP (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SMB (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "WebDav (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, C4925.m14327(R.string.MT_Protector).concat(" (VIP)")).setEnabled(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52795(AbstractActivityC3346 abstractActivityC3346, int i) {
        if (i == R.id.MT_Protector) {
            C1936.m6364(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C6875.m18613(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C14719.m35017(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C5156.m14738(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C23354.m51766(abstractActivityC3346);
            return true;
        }
        if (i != R.id.MT_Protector) {
            return false;
        }
        C12834.m31212(abstractActivityC3346);
        return true;
    }
}
