package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P97N */
/* JADX INFO: loaded from: classes2.dex */
public final class C5710 {

    /* JADX INFO: renamed from: ֫ */
    public final C16055 f13971;

    /* JADX INFO: renamed from: ۧ */
    public TextView[] f13972;

    public C5710(C18107 c18107) {
        C16055 c16055 = new C16055(c18107.m41282());
        c16055.m36554();
        this.f13971 = c16055;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12703() {
        this.f13971.m36552();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12707(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.isDirectory() || !(interfaceC19370 instanceof C14427)) {
            throw new IllegalArgumentException();
        }
        C14427 c14427 = (C14427) interfaceC19370;
        String name = c14427.getName();
        C16055 c16055 = this.f13971;
        c16055.m36538(name, (ViewOnLongClickListenerC11837) null);
        c16055.m36537(m12702(c14427.getParent()), (View.OnLongClickListener) null);
        c16055.m36535(R.string.MT_Protector);
        c16055.m36549(c14427.getSize());
        C22549 c22549M33036 = c14427.m33036();
        if (c22549M33036 != null) {
            c16055.m36545(c22549M33036.m50528());
            c16055.m36528(R.string.MT_Protector, C18794.m42827(c22549M33036.m50531()));
            c16055.m36528(R.string.MT_Protector, C11419.m26403(C17853.f53287.mo25505(), c22549M33036.m50534()));
        } else {
            c16055.m36545(c14427.getTime());
        }
        c16055.m36542();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12708(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.mo39135() || !(interfaceC19370 instanceof C14427)) {
            throw new IllegalArgumentException();
        }
        C14427 c14427 = (C14427) interfaceC19370;
        String name = c14427.getName();
        C16055 c16055 = this.f13971;
        c16055.m36538(name, (ViewOnLongClickListenerC11837) null);
        c16055.m36537(m12702(c14427.getParent()), (View.OnLongClickListener) null);
        c16055.m36535(R.string.MT_Protector);
        c16055.m36549(0L);
        C22549 c22549M33036 = c14427.m33036();
        if (c22549M33036 != null) {
            c16055.m36545(c22549M33036.m50528());
            c16055.m36528(R.string.MT_Protector, C18794.m42827(c22549M33036.m50531()));
            c16055.m36528(R.string.MT_Protector, C11419.m26403(C17853.f53287.mo25505(), c22549M33036.m50534()));
        } else {
            c16055.m36545(c14427.getTime());
        }
        c16055.m36529(R.string.MT_Protector, new C7470()).m21096(8);
        c16055.m36529(R.string.MT_Protector, new C12832(5));
        c16055.m36553();
        c16055.m36542();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12706(String str, List list) {
        C16055 c16055 = this.f13971;
        c16055.m36539(list);
        c16055.m36537(m12702(str), (View.OnLongClickListener) null);
        c16055.m36549(0L);
        c16055.m36529(R.string.MT_Protector, new C14403(4)).m21096(8);
        c16055.m36529(R.string.MT_Protector, new C5410(9));
        c16055.m36553();
        c16055.m36542();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12702(String str) {
        String strM41972 = AbstractC18422.m41972(str);
        if (strM41972.length() > 1 && strM41972.indexOf(47, 1) == strM41972.length() - 1) {
            strM41972 = "/";
        }
        C8392 c8392M31344 = C13757.m31344(strM41972);
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        if (c8392M31344 == null) {
            return strM16224.concat("/");
        }
        StringBuilder sbM17248 = C7470.m17248(strM16224);
        sbM17248.append(c8392M31344.m19554());
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12705(DialogInterface.OnDismissListener onDismissListener) {
        this.f13971.m36536(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12704(int i, int i2, long j) {
        if (this.f13972 == null) {
            C16055 c16055 = this.f13971;
            this.f13972 = new TextView[]{c16055.m36544(R.string.MT_Protector).m21097(), c16055.m36544(R.string.MT_Protector).m21097(), c16055.m36544(R.string.MT_Protector).m21097()};
        }
        C17513.m39889(this.f13972[0], j);
        this.f13972[1].setText(String.valueOf(i));
        this.f13972[2].setText(String.valueOf(i2));
    }
}
