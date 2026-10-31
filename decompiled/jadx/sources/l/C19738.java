package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19738 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f63764 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f63765 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f63766 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f63767 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f63768 = true;

    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m45447(InterfaceC8566 interfaceC8566) {
        InterfaceC10410 interfaceC10410Mo11109;
        InterfaceC19150 interfaceC19150Mo3570;
        int value;
        int value2;
        int iMo2700 = interfaceC8566.mo2700();
        if (EnumC15657.PUBLIC.m36866(iMo2700) && EnumC15657.FINAL.m36866(iMo2700) && "Ljava/lang/Object;".equals(interfaceC8566.mo2695()) && interfaceC8566.mo2699().isEmpty() && !interfaceC8566.mo2698().iterator().hasNext() && !interfaceC8566.mo2701().iterator().hasNext()) {
            if (interfaceC8566.getType().endsWith("/R$styleable;")) {
                for (InterfaceC18444 interfaceC18444 : interfaceC8566.mo2696()) {
                    InterfaceC19150 interfaceC19150Mo3571 = interfaceC18444.mo3570();
                    if (interfaceC19150Mo3571 != null) {
                        if (interfaceC18444.getName().equals("<init>")) {
                            if (C8882.m22959(interfaceC19150Mo3571.mo3817()) != 2) {
                            }
                        } else if (interfaceC18444.getName().equals("<clinit>")) {
                            for (InterfaceC22677 interfaceC22677 : interfaceC19150Mo3571.mo3817()) {
                                if (interfaceC22677 instanceof InterfaceC10952) {
                                    InterfaceC10952 interfaceC10952 = (InterfaceC10952) interfaceC22677;
                                    EnumC0841 enumC0841Mo3975 = interfaceC22677.mo3975();
                                    if (enumC0841Mo3975 == EnumC0841.f3138 || enumC0841Mo3975 == EnumC0841.f3301 || enumC0841Mo3975 == EnumC0841.f3196) {
                                        if (!((InterfaceC21699) interfaceC10952.getReference()).getType().equals("[I")) {
                                        }
                                    } else if (enumC0841Mo3975 != EnumC0841.f3235 || !((InterfaceC18877) interfaceC10952.getReference()).mo8192().equals(interfaceC8566.getType())) {
                                    }
                                }
                            }
                        }
                    }
                }
                boolean z = false;
                for (InterfaceC3627 interfaceC3627 : interfaceC8566.mo2697()) {
                    if (EnumC15657.PUBLIC.m36866(interfaceC3627.mo11110())) {
                        if (interfaceC3627.getType().equals("I")) {
                            InterfaceC10410 interfaceC10410Mo111010 = interfaceC3627.mo11109();
                            if (!(interfaceC10410Mo111010 instanceof InterfaceC13936) || (value2 = (value = ((InterfaceC13936) interfaceC10410Mo111010).getValue()) >>> 24) == 127 || value2 == 1 || (value >= 0 && value <= 256)) {
                                z = true;
                            }
                        } else if (interfaceC3627.getType().equals("[I")) {
                            z = true;
                        }
                    }
                }
                return z;
            }
            Iterator it = interfaceC8566.mo2696().iterator();
            if (it.hasNext()) {
                InterfaceC18444 interfaceC18445 = (InterfaceC18444) it.next();
                if (interfaceC18445.getName().equals("<init>") && (interfaceC19150Mo3570 = interfaceC18445.mo3570()) != null && C8882.m22959(interfaceC19150Mo3570.mo3817()) == 2) {
                    if (!it.hasNext()) {
                        boolean z2 = false;
                        for (InterfaceC3627 interfaceC3628 : interfaceC8566.mo2697()) {
                            if (interfaceC3628.getType().equals("I") && EnumC15657.PUBLIC.m36866(interfaceC3628.mo11110())) {
                                interfaceC10410Mo11109 = interfaceC3628.mo11109();
                                if (!(interfaceC10410Mo11109 instanceof InterfaceC13936) && (((InterfaceC13936) interfaceC10410Mo11109).getValue() >>> 24) == 127) {
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
                    if (interfaceC3628.getType().equals("I")) {
                        interfaceC10410Mo11109 = interfaceC3628.mo11109();
                        if (!(interfaceC10410Mo11109 instanceof InterfaceC13936)) {
                        }
                    }
                }
                return z3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45446(final C16560 c16560, final C7309 c7309) {
        Main mainM39056 = c16560.m39056();
        View viewM10216 = mainM39056.m10216(R.layout.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox5 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox3.setVisibility(0);
        checkBox4.setVisibility(0);
        checkBox5.setVisibility(0);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
        checkBox.setChecked(f63764);
        checkBox2.setChecked(f63766);
        checkBox3.setChecked(f63768);
        checkBox4.setChecked(f63765);
        checkBox5.setChecked(f63767);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(mainM39056);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟ܶܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C19738.m45445(c7309, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, c16560);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC2098(c7309, editText, editText2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45445(C7309 c7309, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, C16560 c16560) {
        c7309.m19592();
        f63764 = checkBox.isChecked();
        f63766 = checkBox2.isChecked();
        f63768 = checkBox3.isChecked();
        f63765 = checkBox4.isChecked();
        boolean zIsChecked = checkBox5.isChecked();
        f63767 = zIsChecked;
        AbstractC15440 abstractC15440 = c7309.f22436;
        AbstractC15440 abstractC15441 = c7309.f22437;
        boolean z = f63764;
        boolean z2 = f63766;
        boolean z3 = f63768;
        boolean z4 = f63765;
        AbstractC15440 abstractC15440M51761 = C23346.m51761(c16560, R.string.MT_Protector, "mtcr");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C19032.class);
        c0994.m3474("saveAsPath", abstractC15440M51761.mo23554());
        c0994.m3474("inputPath1", abstractC15440.mo23554());
        c0994.m3474("inputPath2", abstractC15441.mo23554());
        c0994.m3475("ignoreDebugInfo", z);
        c0994.m3475("ignoreOptimize", z2);
        c0994.m3475("ignoreRegister", z3);
        c0994.m3475("ignoreNopInstruction", z4);
        c0994.m3475("ignoreResIdChanges", zIsChecked);
        c0994.m3469();
    }
}
