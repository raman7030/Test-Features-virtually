package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11343 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f31576;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ InterfaceC19370 f31577;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C4697 f31578;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11343(Main main, C4697 c4697, String str, InterfaceC19370 interfaceC19370) {
        super(main, -1);
        this.f31578 = c4697;
        this.f31576 = str;
        this.f31577 = interfaceC19370;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        final C4697 c4697 = this.f31578;
        try {
            C19210.m43749(c4697.m9962(), EnumC17868.MODIFY_DIRECTORY_LINKED);
            String strM33346 = m33346();
            if (strM33346.equals(this.f31576) || strM33346.isEmpty()) {
                m33348();
                return;
            }
            InterfaceC19370 interfaceC19370 = this.f31577;
            final AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
            final AbstractC17043 abstractC17043M42109 = C18524.m42109(interfaceC19370.getParent(), strM33346);
            String strMo25505 = abstractC17043Mo26445.mo25505();
            EnumC18126 enumC18126M41309 = EnumC18126.m41309(abstractC17043Mo26445.mo25087());
            String strM42104 = C18524.m42104(abstractC17043Mo26445, abstractC17043M42109);
            if (strM42104 != null) {
                m33337(strM42104);
                if (strM42104.equals(C7050.m16224(R.string.MT_Protector)) && abstractC17043Mo26445.mo25093() && abstractC17043M42109.mo25093()) {
                    Main mainM9965 = c4697.m9965();
                    View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3)};
                    boolean z = C23219.m51754() && abstractC17043M42109.mo31068();
                    textView.setText(mainM9965.getString(R.string.MT_Protector, abstractC17043Mo26445.getName(), abstractC17043M42109.getName()));
                    if (!z) {
                        radioButtonArr[2].setVisibility(8);
                    }
                    byte bMo20199 = ApplicationC21448.f67649.mo20199((byte) 0, "rco");
                    final byte b = (bMo20199 < 0 || bMo20199 > 3) ? (byte) 0 : (z || bMo20199 != 2) ? bMo20199 : (byte) 1;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC18180 viewOnClickListenerC18180 = new ViewOnClickListenerC18180(1, radioButtonArr);
                    for (int i = 0; i < 4; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC18180);
                    }
                    C20671 c20671BuildDialog = mainM9965.buildDialog();
                    c20671BuildDialog.m46715(viewM12252);
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷۟ܳ
                        /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
                        /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0108  */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AbstractC17043 abstractC17043M38650;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    i3 = 0;
                                    break;
                                } else if (radioButtonArr[i3].isChecked()) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (b != i3) {
                                ApplicationC21448.f67649.edit().mo27874((byte) i3, "rco").apply();
                            }
                            AbstractC17043 abstractC17043 = abstractC17043M42109;
                            AbstractC17043 abstractC17044 = abstractC17043Mo26445;
                            if (i3 == 0) {
                                AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".tmp");
                                if (!abstractC17043.mo25502(abstractC17043M38678)) {
                                    C22682.m50793(R.string.MT_Protector);
                                    return;
                                } else {
                                    if (!abstractC17044.mo25502(abstractC17043)) {
                                        abstractC17043M38678.mo25502(abstractC17043);
                                        C22682.m50793(R.string.MT_Protector);
                                        return;
                                    }
                                    abstractC17043M38678.mo25502(abstractC17044);
                                }
                            } else if (i3 == 1) {
                                AbstractC17043 abstractC17043M38679 = abstractC17043.m38678(".tmp");
                                if (abstractC17043.mo25502(abstractC17043M38679)) {
                                    if (abstractC17044.mo25502(abstractC17043)) {
                                        abstractC17043M38679.mo25503();
                                    } else {
                                        abstractC17043M38679.mo25502(abstractC17043);
                                        C22682.m50793(R.string.MT_Protector);
                                        return;
                                    }
                                } else if (abstractC17044.mo25502(abstractC17043M38679)) {
                                    if (!abstractC17043.mo25503() || !abstractC17043M38679.mo25502(abstractC17043)) {
                                        abstractC17043M38679.mo25502(abstractC17044);
                                        C22682.m50793(R.string.MT_Protector);
                                        return;
                                    }
                                } else {
                                    C22682.m50793(R.string.MT_Protector);
                                    return;
                                }
                            } else {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        abstractC17043M38650 = C18524.m42109(abstractC17043.mo25505() + ".bak", new String[0]).m38650(true);
                                        if (!abstractC17043.mo25502(abstractC17043M38650)) {
                                            C22682.m50793(R.string.MT_Protector);
                                            return;
                                        } else if (!abstractC17044.mo25502(abstractC17043)) {
                                            abstractC17043M38650.mo25502(abstractC17043);
                                            C22682.m50793(R.string.MT_Protector);
                                            return;
                                        }
                                    }
                                    if (i3 != 0) {
                                        int i4 = C16114.f47424;
                                        C16114.m36694(abstractC17044.mo25505());
                                    } else {
                                        int i5 = C16114.f47424;
                                        C16114.m36688(abstractC17044.mo25505(), true);
                                    }
                                    C16114.m36688(abstractC17043.mo25505(), true);
                                    if (abstractC17043M38650 != null) {
                                        C16114.m36688(abstractC17043M38650.mo25505(), true);
                                    }
                                    c4697.m9968(abstractC17043.getName());
                                    C17127.m38756();
                                    C10987.m25375();
                                    this.m33348();
                                }
                                if (!abstractC17043.mo31069(new C13261())) {
                                    C22682.m50793(R.string.MT_Protector);
                                    return;
                                } else if (!abstractC17044.mo25502(abstractC17043)) {
                                    C22682.m50793(R.string.MT_Protector);
                                    return;
                                }
                            }
                            abstractC17043M38650 = null;
                            if (i3 != 0) {
                                int i6 = C16114.f47424;
                                C16114.m36694(abstractC17044.mo25505());
                            } else {
                                int i7 = C16114.f47424;
                                C16114.m36688(abstractC17044.mo25505(), true);
                            }
                            C16114.m36688(abstractC17043.mo25505(), true);
                            if (abstractC17043M38650 != null) {
                                C16114.m36688(abstractC17043M38650.mo25505(), true);
                            }
                            c4697.m9968(abstractC17043.getName());
                            C17127.m38756();
                            C10987.m25375();
                            this.m33348();
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46722(false);
                    c20671BuildDialog.m46732();
                    return;
                }
                return;
            }
            enumC18126M41309.m41311(strMo25505);
            int i2 = C16114.f47424;
            C16114.m36688(abstractC17043M42109.mo25505(), true);
            c4697.m9968(strM33346);
            C17127.m38756();
            C10987.m25375();
            m33348();
        } catch (C3924 e) {
            c4697.m9965().m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
