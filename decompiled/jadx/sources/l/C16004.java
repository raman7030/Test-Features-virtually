package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16004 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f49373;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49374;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49375;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f49376;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f49377;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f49378;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16004(Main main, String str, boolean z, Map map, InterfaceC17889 interfaceC17889, C2450 c2450, AbstractC3163 abstractC3163) {
        super(main, -1);
        this.f49376 = str;
        this.f49375 = z;
        this.f49374 = map;
        this.f49373 = interfaceC17889;
        this.f49378 = c2450;
        this.f49377 = abstractC3163;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        final String strM31260 = m31260();
        String str = this.f49376;
        if (strM31260.equals(str) || strM31260.length() == 0) {
            m31262();
            return;
        }
        if (strM31260.contains("\\") || strM31260.contains("/")) {
            m31263(R.string.MT_Protector);
            return;
        }
        if (!this.f49375 || !strM31260.equalsIgnoreCase(str)) {
            ?? r0 = this.f49374;
            if (r0.containsKey(strM31260)) {
                if (((Boolean) r0.get(strM31260)).booleanValue()) {
                    m31263(R.string.MT_Protector);
                    return;
                }
                m31263(R.string.MT_Protector);
                final InterfaceC17889 interfaceC17889 = this.f49373;
                if (interfaceC17889.mo36969()) {
                    final C2450 c2450 = this.f49378;
                    final Main mainM7917 = c2450.m7917();
                    View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
                    viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3)};
                    textView.setText(mainM7917.getString(R.string.MT_Protector, interfaceC17889.getName(), strM31260));
                    byte bMo18251 = ApplicationC20075.f65008.mo18251((byte) 0, "rcon");
                    byte b = (bMo18251 < 0 || bMo18251 > 2) ? (byte) 0 : bMo18251;
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
                    C19258 c19258BuildDialog = mainM7917.buildDialog();
                    c19258BuildDialog.m44421(viewM10216);
                    final AbstractC3163 abstractC3163 = this.f49377;
                    final byte b2 = b;
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܳ᩻
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
                                ApplicationC20075.f65008.edit().mo25852((byte) i3, "rcon").apply();
                            }
                            InterfaceC17889 interfaceC178810 = interfaceC17889;
                            String path = interfaceC178810.getPath();
                            String parent = interfaceC178810.getParent();
                            String str2 = strM31260;
                            new C4011(mainM7917, i3, parent, abstractC3163, C9523.m24393(parent, str2), path, c2450, str2, this).m20274();
                        }
                    });
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44428(false);
                    c19258BuildDialog.m44438();
                    return;
                }
                return;
            }
        }
        new C8950(this, strM31260).m20274();
    }
}
