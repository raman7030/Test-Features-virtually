package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9443 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28629;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f28630;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f28631;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9443(Main main, C2450 c2450, String str, InterfaceC17889 interfaceC17889) {
        super(main, -1);
        this.f28631 = c2450;
        this.f28629 = str;
        this.f28630 = interfaceC17889;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        final C2450 c2450 = this.f28631;
        try {
            C17721.m41503(c2450.m7914(), EnumC16309.MODIFY_DIRECTORY_LINKED);
            String strM31260 = m31260();
            if (strM31260.equals(this.f28629) || strM31260.isEmpty()) {
                m31262();
                return;
            }
            InterfaceC17889 interfaceC17889 = this.f28630;
            final AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
            final AbstractC15440 abstractC15440M39866 = C16999.m39866(interfaceC17889.getParent(), strM31260);
            String strMo23554 = abstractC15440Mo24433.mo23554();
            EnumC16580 enumC16580M39083 = EnumC16580.m39083(abstractC15440Mo24433.mo23113());
            String strM39861 = C16999.m39861(abstractC15440Mo24433, abstractC15440M39866);
            if (strM39861 != null) {
                m31251(strM39861);
                if (strM39861.equals(C4925.m14327(R.string.MT_Protector)) && abstractC15440Mo24433.mo23119() && abstractC15440M39866.mo23119()) {
                    Main mainM7917 = c2450.m7917();
                    View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3)};
                    boolean z = C21939.m49417() && abstractC15440M39866.mo29016();
                    textView.setText(mainM7917.getString(R.string.MT_Protector, abstractC15440Mo24433.getName(), abstractC15440M39866.getName()));
                    if (!z) {
                        radioButtonArr[2].setVisibility(8);
                    }
                    byte bMo18251 = ApplicationC20075.f65008.mo18251((byte) 0, "rco");
                    final byte b = (bMo18251 < 0 || bMo18251 > 3) ? (byte) 0 : (z || bMo18251 != 2) ? bMo18251 : (byte) 1;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC16637 viewOnClickListenerC16637 = new ViewOnClickListenerC16637(1, radioButtonArr);
                    for (int i = 0; i < 4; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC16637);
                    }
                    C19258 c19258BuildDialog = mainM7917.buildDialog();
                    c19258BuildDialog.m44421(viewM10216);
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷۟ܳ
                        /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
                        /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0108  */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AbstractC15440 abstractC15440M36492;
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
                                ApplicationC20075.f65008.edit().mo25852((byte) i3, "rco").apply();
                            }
                            AbstractC15440 abstractC15440 = abstractC15440M39866;
                            AbstractC15440 abstractC15441 = abstractC15440Mo24433;
                            if (i3 == 0) {
                                AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(".tmp");
                                if (!abstractC15440.mo23551(abstractC15440M36520)) {
                                    C21374.m48457(R.string.MT_Protector);
                                    return;
                                } else {
                                    if (!abstractC15441.mo23551(abstractC15440)) {
                                        abstractC15440M36520.mo23551(abstractC15440);
                                        C21374.m48457(R.string.MT_Protector);
                                        return;
                                    }
                                    abstractC15440M36520.mo23551(abstractC15441);
                                }
                            } else if (i3 == 1) {
                                AbstractC15440 abstractC15440M36521 = abstractC15440.m36520(".tmp");
                                if (abstractC15440.mo23551(abstractC15440M36521)) {
                                    if (abstractC15441.mo23551(abstractC15440)) {
                                        abstractC15440M36521.mo23552();
                                    } else {
                                        abstractC15440M36521.mo23551(abstractC15440);
                                        C21374.m48457(R.string.MT_Protector);
                                        return;
                                    }
                                } else if (abstractC15441.mo23551(abstractC15440M36521)) {
                                    if (!abstractC15440.mo23552() || !abstractC15440M36521.mo23551(abstractC15440)) {
                                        abstractC15440M36521.mo23551(abstractC15441);
                                        C21374.m48457(R.string.MT_Protector);
                                        return;
                                    }
                                } else {
                                    C21374.m48457(R.string.MT_Protector);
                                    return;
                                }
                            } else {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        abstractC15440M36492 = C16999.m39866(abstractC15440.mo23554() + ".bak", new String[0]).m36492(true);
                                        if (!abstractC15440.mo23551(abstractC15440M36492)) {
                                            C21374.m48457(R.string.MT_Protector);
                                            return;
                                        } else if (!abstractC15441.mo23551(abstractC15440)) {
                                            abstractC15440M36492.mo23551(abstractC15440);
                                            C21374.m48457(R.string.MT_Protector);
                                            return;
                                        }
                                    }
                                    if (i3 != 0) {
                                        int i4 = C14463.f44330;
                                        C14463.m34560(abstractC15441.mo23554());
                                    } else {
                                        int i5 = C14463.f44330;
                                        C14463.m34554(abstractC15441.mo23554(), true);
                                    }
                                    C14463.m34554(abstractC15440.mo23554(), true);
                                    if (abstractC15440M36492 != null) {
                                        C14463.m34554(abstractC15440M36492.mo23554(), true);
                                    }
                                    c2450.m7920(abstractC15440.getName());
                                    C15528.m36596();
                                    C9068.m23429();
                                    this.m31262();
                                }
                                if (!abstractC15440.mo29017(new C11461())) {
                                    C21374.m48457(R.string.MT_Protector);
                                    return;
                                } else if (!abstractC15441.mo23551(abstractC15440)) {
                                    C21374.m48457(R.string.MT_Protector);
                                    return;
                                }
                            }
                            abstractC15440M36492 = null;
                            if (i3 != 0) {
                                int i6 = C14463.f44330;
                                C14463.m34560(abstractC15441.mo23554());
                            } else {
                                int i7 = C14463.f44330;
                                C14463.m34554(abstractC15441.mo23554(), true);
                            }
                            C14463.m34554(abstractC15440.mo23554(), true);
                            if (abstractC15440M36492 != null) {
                                C14463.m34554(abstractC15440M36492.mo23554(), true);
                            }
                            c2450.m7920(abstractC15440.getName());
                            C15528.m36596();
                            C9068.m23429();
                            this.m31262();
                        }
                    });
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44428(false);
                    c19258BuildDialog.m44438();
                    return;
                }
                return;
            }
            enumC16580M39083.m39085(strMo23554);
            int i2 = C14463.f44330;
            C14463.m34554(abstractC15440M39866.mo23554(), true);
            c2450.m7920(strM31260);
            C15528.m36596();
            C9068.m23429();
            m31262();
        } catch (C1637 e) {
            c2450.m7917().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
