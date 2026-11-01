package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21128 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f66395 = true;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f66396 = true;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f66397 = true;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f66398 = false;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f66399 = true;

    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m47751(InterfaceC10509 interfaceC10509) {
        InterfaceC12262 interfaceC12262Mo13085;
        InterfaceC20568 interfaceC20568Mo5857;
        int value;
        int value2;
        int iMo5039 = interfaceC10509.mo5039();
        if (EnumC17248.PUBLIC.m39032(iMo5039) && EnumC17248.FINAL.m39032(iMo5039) && "Ljava/lang/Object;".equals(interfaceC10509.mo5034()) && interfaceC10509.mo5038().isEmpty() && !interfaceC10509.mo5037().iterator().hasNext() && !interfaceC10509.mo5040().iterator().hasNext()) {
            if (interfaceC10509.getType().endsWith("/R$styleable;")) {
                for (InterfaceC19897 interfaceC19897 : interfaceC10509.mo5035()) {
                    InterfaceC20568 interfaceC20568Mo5858 = interfaceC19897.mo5857();
                    if (interfaceC20568Mo5858 != null) {
                        if (interfaceC19897.getName().equals("<init>")) {
                            if (C10810.m24930(interfaceC20568Mo5858.mo6074()) != 2) {
                            }
                        } else if (interfaceC19897.getName().equals("<clinit>")) {
                            for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5858.mo6074()) {
                                if (interfaceC23920 instanceof InterfaceC12777) {
                                    InterfaceC12777 interfaceC12777 = (InterfaceC12777) interfaceC23920;
                                    EnumC3167 enumC3167Mo6217 = interfaceC23920.mo6217();
                                    if (enumC3167Mo6217 == EnumC3167.f5912 || enumC3167Mo6217 == EnumC3167.f6075 || enumC3167Mo6217 == EnumC3167.f5970) {
                                        if (!((InterfaceC22991) interfaceC12777.getReference()).getType().equals("[I")) {
                                        }
                                    } else if (enumC3167Mo6217 != EnumC3167.f6009 || !((InterfaceC20309) interfaceC12777.getReference()).mo10231().equals(interfaceC10509.getType())) {
                                    }
                                }
                            }
                        }
                    }
                }
                boolean z = false;
                for (InterfaceC5815 interfaceC5815 : interfaceC10509.mo5036()) {
                    if (EnumC17248.PUBLIC.m39032(interfaceC5815.mo13086())) {
                        if (interfaceC5815.getType().equals("I")) {
                            InterfaceC12262 interfaceC12262Mo13086 = interfaceC5815.mo13085();
                            if (!(interfaceC12262Mo13086 instanceof InterfaceC15613) || (value2 = (value = ((InterfaceC15613) interfaceC12262Mo13086).getValue()) >>> 24) == 127 || value2 == 1 || (value >= 0 && value <= 256)) {
                                z = true;
                            }
                        } else if (interfaceC5815.getType().equals("[I")) {
                            z = true;
                        }
                    }
                }
                return z;
            }
            Iterator it = interfaceC10509.mo5035().iterator();
            if (it.hasNext()) {
                InterfaceC19897 interfaceC19898 = (InterfaceC19897) it.next();
                if (interfaceC19898.getName().equals("<init>") && (interfaceC20568Mo5857 = interfaceC19898.mo5857()) != null && C10810.m24930(interfaceC20568Mo5857.mo6074()) == 2) {
                    if (!it.hasNext()) {
                        boolean z2 = false;
                        for (InterfaceC5815 interfaceC5816 : interfaceC10509.mo5036()) {
                            if (interfaceC5816.getType().equals("I") && EnumC17248.PUBLIC.m39032(interfaceC5816.mo13086())) {
                                interfaceC12262Mo13085 = interfaceC5816.mo13085();
                                if (!(interfaceC12262Mo13085 instanceof InterfaceC15613) && (((InterfaceC15613) interfaceC12262Mo13085).getValue() >>> 24) == 127) {
                                    z2 = true;
                                }
                            }
                        }
                        return z2;
                    }
                }
            } else if (!it.hasNext()) {
                boolean z3 = false;
                while (r12.hasNext()) {
                    if (interfaceC5816.getType().equals("I")) {
                        interfaceC12262Mo13085 = interfaceC5816.mo13085();
                        if (!(interfaceC12262Mo13085 instanceof InterfaceC15613)) {
                        }
                    }
                }
                return z3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47750(final C18107 c18107, final C9315 c9315) {
        Main mainM41282 = c18107.m41282();
        View viewM12252 = mainM41282.m12252(R.layout.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox5 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox3.setVisibility(0);
        checkBox4.setVisibility(0);
        checkBox5.setVisibility(0);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4345.m8962(c9315.f25331, c9315.f25329, editText, editText2);
        checkBox.setChecked(f66395);
        checkBox2.setChecked(f66397);
        checkBox3.setChecked(f66399);
        checkBox4.setChecked(f66396);
        checkBox5.setChecked(f66398);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(mainM41282);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟ܶܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C21128.m47749(c9315, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, c18107);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732().m3861().setOnClickListener(new ViewOnClickListenerC4363(c9315, editText, editText2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47749(C9315 c9315, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, C18107 c18107) {
        c9315.m21560();
        f66395 = checkBox.isChecked();
        f66397 = checkBox2.isChecked();
        f66399 = checkBox3.isChecked();
        f66396 = checkBox4.isChecked();
        boolean zIsChecked = checkBox5.isChecked();
        f66398 = zIsChecked;
        AbstractC17043 abstractC17043 = c9315.f25327;
        AbstractC17043 abstractC17044 = c9315.f25328;
        boolean z = f66395;
        boolean z2 = f66397;
        boolean z3 = f66399;
        boolean z4 = f66396;
        AbstractC17043 abstractC17043M54158 = C24556.m54158(c18107, R.string.MT_Protector, "mtcr");
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C20457.class);
        c3313.m5777("saveAsPath", abstractC17043M54158.mo25505());
        c3313.m5777("inputPath1", abstractC17043.mo25505());
        c3313.m5777("inputPath2", abstractC17044.mo25505());
        c3313.m5778("ignoreDebugInfo", z);
        c3313.m5778("ignoreOptimize", z2);
        c3313.m5778("ignoreRegister", z3);
        c3313.m5778("ignoreNopInstruction", z4);
        c3313.m5778("ignoreResIdChanges", zIsChecked);
        c3313.m5772();
    }
}
