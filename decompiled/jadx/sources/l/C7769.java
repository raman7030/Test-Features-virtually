package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7769 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f24013;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f24014;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23934 f24015;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f24016;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24017;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f24018;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24019;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f24020;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f24021;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7769(C23934 c23934, Main main, String str, InterfaceC17889 interfaceC17889, List list, C2450 c2450, boolean z, String str2, AbstractC15440 abstractC15440, boolean z2) {
        super(main, -1);
        this.f24015 = c23934;
        this.f24019 = str;
        this.f24018 = interfaceC17889;
        this.f24016 = list;
        this.f24021 = c2450;
        this.f24013 = z;
        this.f24017 = str2;
        this.f24014 = abstractC15440;
        this.f24020 = z2;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        final String strM31260 = m31260();
        while (strM31260.endsWith("/")) {
            strM31260 = C15472.m36561(1, 0, strM31260);
        }
        final String str = this.f24019;
        if (strM31260.equals(str)) {
            m31262();
            return;
        }
        boolean zMo36969 = this.f24018.mo36969();
        final AbstractC15440 abstractC15440 = this.f24014;
        List list = this.f24016;
        final C2450 c2450 = this.f24021;
        if (zMo36969) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (strM31260.equals(((C3545) it.next()).getName())) {
                    m31263(R.string.MT_Protector);
                    final Main mainM7917 = c2450.m7917();
                    View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3)};
                    viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
                    textView.setText(mainM7917.getString(R.string.MT_Protector, C9523.m24404(str), C9523.m24404(strM31260)));
                    byte bMo18251 = ApplicationC20075.f65008.mo18251((byte) 0, "rcoz");
                    byte b = (bMo18251 < 0 || bMo18251 > 2) ? (byte) 0 : bMo18251;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC0911 viewOnClickListenerC0911 = new ViewOnClickListenerC0911(2, radioButtonArr);
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC0911);
                    }
                    C19258 c19258BuildDialog = mainM7917.buildDialog();
                    c19258BuildDialog.m44421(viewM10216);
                    final C23934 c23934 = this.f24015;
                    final List list2 = this.f24016;
                    final boolean z = this.f24013;
                    final String str2 = this.f24017;
                    final byte b2 = b;
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨ᩹᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C23934.m52715(c23934, radioButtonArr, b2, strM31260, str, list2, z, mainM7917, str2, this, c2450, abstractC15440);
                        }
                    });
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44428(false);
                    c19258BuildDialog.m44438();
                    return;
                }
            }
        } else {
            String strConcat = strM31260.concat("/");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C3545) it2.next()).getName().startsWith(strConcat)) {
                    m31263(R.string.MT_Protector);
                    return;
                }
            }
        }
        final C18290 c18290 = new C18290(str, strM31260, this.f24020, true);
        if (this.f24013) {
            C10025.m25197(new InterfaceC12846() { // from class: l.ܰ᩹᩻
                @Override // l.InterfaceC12846
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo3777(Exception exc) {
                    return false;
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final void mo3776(C11667 c11667, boolean z2) {
                    this.f42602.m31262();
                    List listSingletonList = Collections.singletonList(c18290);
                    List list3 = Collections.EMPTY_LIST;
                    C23934.m52712(c2450, abstractC15440, "", listSingletonList, Collections.EMPTY_LIST, c11667, z2);
                }
            }, c2450.m7917(), this.f24017);
            return;
        }
        m31262();
        List listSingletonList = Collections.singletonList(c18290);
        List list3 = Collections.EMPTY_LIST;
        C23934.m52712(c2450, abstractC15440, "", listSingletonList, Collections.EMPTY_LIST, null, false);
    }
}
