package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17579 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ InterfaceC19370 f52536;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ Object f52537;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ boolean f52538;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ String f52539;

    /* JADX INFO: renamed from: ܿ֫ */
    public final /* synthetic */ AbstractC5375 f52540;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ C4697 f52541;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17579(Main main, String str, boolean z, Map map, InterfaceC19370 interfaceC19370, C4697 c4697, AbstractC5375 abstractC5375) {
        super(main, -1);
        this.f52539 = str;
        this.f52538 = z;
        this.f52537 = map;
        this.f52536 = interfaceC19370;
        this.f52541 = c4697;
        this.f52540 = abstractC5375;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        final String strM33346 = m33346();
        String str = this.f52539;
        if (strM33346.equals(str) || strM33346.length() == 0) {
            m33348();
            return;
        }
        if (strM33346.contains("\\") || strM33346.contains("/")) {
            m33349(R.string.MT_Protector);
            return;
        }
        if (!this.f52538 || !strM33346.equalsIgnoreCase(str)) {
            ?? r0 = this.f52537;
            if (r0.containsKey(strM33346)) {
                if (((Boolean) r0.get(strM33346)).booleanValue()) {
                    m33349(R.string.MT_Protector);
                    return;
                }
                m33349(R.string.MT_Protector);
                final InterfaceC19370 interfaceC19370 = this.f52536;
                if (interfaceC19370.mo39135()) {
                    final C4697 c4697 = this.f52541;
                    final Main mainM9965 = c4697.m9965();
                    View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                    viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3)};
                    textView.setText(mainM9965.getString(R.string.MT_Protector, interfaceC19370.getName(), strM33346));
                    byte bMo20199 = ApplicationC21448.f67649.mo20199((byte) 0, "rcon");
                    byte b = (bMo20199 < 0 || bMo20199 > 2) ? (byte) 0 : bMo20199;
                    radioButtonArr[b].setChecked(true);
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩷ܳ᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            RadioButton[] radioButtonArr2 = radioButtonArr;
                            int length = radioButtonArr2.length;
                            for (int i = 0; i < length; i++) {
                                RadioButton radioButton = radioButtonArr2[i];
                                radioButton.setChecked(view == radioButton);
                            }
                        }
                    };
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(onClickListener);
                    }
                    C20671 c20671BuildDialog = mainM9965.buildDialog();
                    c20671BuildDialog.m46715(viewM12252);
                    final AbstractC5375 abstractC5375 = this.f52540;
                    final byte b2 = b;
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܳ᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 3) {
                                    i3 = 0;
                                    break;
                                } else {
                                    if (radioButtonArr[i4].isChecked()) {
                                        i3 = i4;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            if (b2 != i3) {
                                ApplicationC21448.f67649.edit().mo27874((byte) i3, "rcon").apply();
                            }
                            InterfaceC19370 interfaceC19371 = interfaceC19370;
                            String path = interfaceC19371.getPath();
                            String parent = interfaceC19371.getParent();
                            String str2 = strM33346;
                            new C6181(mainM9965, i3, parent, abstractC5375, C11419.m26403(parent, str2), path, c4697, str2, this).m22250();
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46722(false);
                    c20671BuildDialog.m46732();
                    return;
                }
                return;
            }
        }
        new C10875(this, strM33346).m22250();
    }
}
