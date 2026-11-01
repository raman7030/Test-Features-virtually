package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11896 {
    /* JADX INFO: renamed from: ֫ */
    public static void m27214(InterfaceC14577 interfaceC14577, AbstractActivityC5549 abstractActivityC5549, String str) {
        if (!ApplicationC21448.f67649.getBoolean("enable_auto_signature", false)) {
            interfaceC14577.mo6049(null, ApplicationC21448.f67649.getBoolean("kasb", true));
            return;
        }
        C16588 c16588 = new C16588(interfaceC14577, abstractActivityC5549, str);
        C18483 c18483M45070 = C19825.m45070(str);
        if (c18483M45070 != null && C10792.m24860(c18483M45070.m42021()) == null) {
            c18483M45070 = null;
        }
        if (c18483M45070 == null) {
            ArrayList arrayList = C10792.f29905;
            c18483M45070 = new C18483(ApplicationC21448.f67649.getString("auto_signature_key", ""), C10792.m24858(), ApplicationC21448.f67649.getString("v1_signature_filename", null), ApplicationC21448.f67649.getBoolean("kv1sd", false));
        }
        m27213(abstractActivityC5549, c18483M45070, false, (InterfaceC14577) c16588);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27213(AbstractActivityC5549 abstractActivityC5549, C18483 c18483, boolean z, InterfaceC14577 interfaceC14577) {
        try {
            C13457 c13457M27208 = m27208(c18483, z);
            if (!c13457M27208.m30605().mo34294()) {
                interfaceC14577.mo6049(c13457M27208, false);
            } else if (abstractActivityC5549 == null) {
                interfaceC14577.mo6050(new C3924("Signing key requires interactive verification."));
            } else {
                C10792.m24865(new C22625(interfaceC14577, c13457M27208), c13457M27208.m30605(), abstractActivityC5549);
            }
        } catch (Exception e) {
            if (interfaceC14577.mo6050(e) || abstractActivityC5549 == null) {
                return;
            }
            abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13457 m27208(C18483 c18483, boolean z) throws C13907 {
        AbstractC14973 abstractC14973M38573;
        String strM42021 = c18483.m42021();
        if (strM42021 == null || strM42021.isEmpty()) {
            abstractC14973M38573 = C16984.m38573();
        } else {
            abstractC14973M38573 = C10792.m24860(strM42021);
            if (abstractC14973M38573 == null) {
                if (z) {
                    throw new C13907(strM42021);
                }
                abstractC14973M38573 = C16984.m38573();
            }
        }
        return new C13457(abstractC14973M38573, c18483.m42022(), c18483.m42020(), c18483.m42019());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27212(AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, C13457 c13457, C24164 c24164) {
        C8092.m18775(abstractC17043, abstractC17044, c13457, c24164.m53428());
        if (c13457.m30605() == C16984.m38573()) {
            C7050.m16213(new RunnableC22707(4, abstractActivityC5549), 500L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27215(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, C13457 c13457, AbstractC5996 abstractC5996) {
        C8092.m18775(abstractC17043, abstractC17044, c13457, abstractC5996.mo13476());
        if (c13457.m30605() == C16984.m38573()) {
            abstractC5996.m13457(new C21284());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27210(Main main, C23105 c23105, C13457 c13457, C23298 c23298) {
        AbstractC17043 abstractC17043M51525 = c23105.m51525();
        try {
            C23775.m52846(c23105);
            AbstractC17043 abstractC17043M51526 = c23105.m51525();
            c23298.m51894(R.string.MT_Protector);
            c23298.m51889(0);
            c23298.m51886(0);
            C8092.m18775(abstractC17043M51525, abstractC17043M51526, c13457, new C6531(c23298));
            if (c13457.m30605() == C16984.m38573()) {
                C7050.m16213(new RunnableC8368(3, main), 500L);
            }
        } finally {
            abstractC17043M51525.mo25503();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27217(C23105 c23105, C13457 c13457, AbstractC5996 abstractC5996) {
        AbstractC17043 abstractC17043M51525 = c23105.m51525();
        try {
            C23775.m52846(c23105);
            C8092.m18775(abstractC17043M51525, c23105.m51525(), c13457, abstractC5996.mo13476());
            if (c13457.m30605() == C16984.m38573()) {
                abstractC5996.m13457(new C5190());
            }
        } finally {
            abstractC17043M51525.mo25503();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27216(C18107 c18107, DialogInterfaceC2564 dialogInterfaceC2564, String str) {
        Main mainM41282 = c18107.m41282();
        Button buttonM3861 = dialogInterfaceC2564.m3861();
        ViewGroup viewGroup = (ViewGroup) buttonM3861.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM3861);
        CheckBox checkBox = (CheckBox) mainM41282.m12252(R.layout.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        m27211(mainM41282, checkBox, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27211(final AbstractActivityC5549 abstractActivityC5549, CompoundButton compoundButton, final String str) {
        compoundButton.setChecked(ApplicationC21448.f67649.getBoolean("enable_auto_signature", false));
        compoundButton.setOnCheckedChangeListener(new C11225());
        compoundButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۖۗܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                if (ApplicationC21448.f67649.getBoolean("show_auto_settings_tip", true)) {
                    ApplicationC21448.f67649.edit().putBoolean("show_auto_settings_tip", false).apply();
                    C22682.m50801();
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                View viewM12252 = abstractActivityC55410.m12252(R.layout.MT_Protector);
                ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                final InterfaceC8780 interfaceC8780M24857 = C10792.m24857(abstractActivityC55410, viewM12252, str);
                C20671 c20671BuildDialog = abstractActivityC55410.buildDialog();
                c20671BuildDialog.m46715(viewM12252);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                final DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC2564M18268.m3860().setOnClickListener(new ViewOnClickListenerC5860(0, interfaceC8780M24857, dialogInterfaceC2564M18268));
                final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                interfaceC8780M24857.mo30400(new Runnable() { // from class: l.ᩴۗܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8780 interfaceC8780 = interfaceC8780M24857;
                        C10792.m24863(textView, interfaceC8780.mo30402());
                        dialogInterfaceC2564M18268.m3860().setEnabled(!interfaceC8780.mo30403());
                    }
                });
                dialogInterfaceC2564M18268.m3861().setOnClickListener(new ViewOnClickListenerC20613(0, abstractActivityC55410));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1898 m27209(AbstractActivityC5549 abstractActivityC5549, View view) {
        C1898 c1898 = new C1898(abstractActivityC5549, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        MenuItem menuItemAdd = c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setCheckable(true);
        menuItemAdd.setChecked(ApplicationC21448.f67649.getBoolean("kasb", true));
        c1898.m50636((InterfaceC1583) new C17714(4, abstractActivityC5549));
        C1828.m48015(c1898);
        return c1898;
    }
}
