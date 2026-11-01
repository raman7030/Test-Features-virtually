package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9753 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ boolean f26929;

    /* JADX INFO: renamed from: ۜ֫ */
    public final /* synthetic */ AbstractC17043 f26930;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C25116 f26931;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ List f26932;

    /* JADX INFO: renamed from: ܳ֫ */
    public final /* synthetic */ String f26933;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ InterfaceC19370 f26934;

    /* JADX INFO: renamed from: ܿ֫ */
    public final /* synthetic */ String f26935;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ boolean f26936;

    /* JADX INFO: renamed from: ᩻֫ */
    public final /* synthetic */ C4697 f26937;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9753(C25116 c25116, Main main, String str, InterfaceC19370 interfaceC19370, List list, C4697 c4697, boolean z, String str2, AbstractC17043 abstractC17043, boolean z2) {
        super(main, -1);
        this.f26931 = c25116;
        this.f26935 = str;
        this.f26934 = interfaceC19370;
        this.f26932 = list;
        this.f26937 = c4697;
        this.f26929 = z;
        this.f26933 = str2;
        this.f26930 = abstractC17043;
        this.f26936 = z2;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        final String strM33346 = m33346();
        while (strM33346.endsWith("/")) {
            strM33346 = C17073.m38720(1, 0, strM33346);
        }
        final String str = this.f26935;
        if (strM33346.equals(str)) {
            m33348();
            return;
        }
        boolean zMo39135 = this.f26934.mo39135();
        final AbstractC17043 abstractC17043 = this.f26930;
        List list = this.f26932;
        final C4697 c4697 = this.f26937;
        if (zMo39135) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (strM33346.equals(((C5738) it.next()).getName())) {
                    m33349(R.string.MT_Protector);
                    final Main mainM9965 = c4697.m9965();
                    View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3)};
                    viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
                    textView.setText(mainM9965.getString(R.string.MT_Protector, C11419.m26414(str), C11419.m26414(strM33346)));
                    byte bMo20199 = ApplicationC21448.f67649.mo20199((byte) 0, "rcoz");
                    byte b = (bMo20199 < 0 || bMo20199 > 2) ? (byte) 0 : bMo20199;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC3234 viewOnClickListenerC3234 = new ViewOnClickListenerC3234(2, radioButtonArr);
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC3234);
                    }
                    C20671 c20671BuildDialog = mainM9965.buildDialog();
                    c20671BuildDialog.m46715(viewM12252);
                    final C25116 c25116 = this.f26931;
                    final List list2 = this.f26932;
                    final boolean z = this.f26929;
                    final String str2 = this.f26933;
                    final byte b2 = b;
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨ᩹᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C25116.m55121(c25116, radioButtonArr, b2, strM33346, str, list2, z, mainM9965, str2, this, c4697, abstractC17043);
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46722(false);
                    c20671BuildDialog.m46732();
                    return;
                }
            }
        } else {
            String strConcat = strM33346.concat("/");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C5738) it2.next()).getName().startsWith(strConcat)) {
                    m33349(R.string.MT_Protector);
                    return;
                }
            }
        }
        final C19752 c19752 = new C19752(str, strM33346, this.f26936, true);
        if (this.f26929) {
            C11896.m27214(new InterfaceC14577() { // from class: l.ܰ᩹᩻
                @Override // p067l.InterfaceC14577
                public final /* synthetic */ void onCanceled() {
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo6050(Exception exc) {
                    return false;
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final void mo6049(C13457 c13457, boolean z2) {
                    this.f45688.m33348();
                    List listSingletonList = Collections.singletonList(c19752);
                    List list3 = Collections.EMPTY_LIST;
                    C25116.m55118(c4697, abstractC17043, "", listSingletonList, Collections.EMPTY_LIST, c13457, z2);
                }
            }, c4697.m9965(), this.f26933);
            return;
        }
        m33348();
        List listSingletonList = Collections.singletonList(c19752);
        List list3 = Collections.EMPTY_LIST;
        C25116.m55118(c4697, abstractC17043, "", listSingletonList, Collections.EMPTY_LIST, null, false);
    }
}
