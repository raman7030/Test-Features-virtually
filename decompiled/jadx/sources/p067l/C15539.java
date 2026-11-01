package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import bin.p000mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15539 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC17043 f44401;

    public C15539() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return (c4697.m9964("local") || c4697.m9964("zip")) && m35333(c4697);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        if (c4697.m9964("zip")) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        Set set = (Set) C7480.stream(c4697.m9957()).map(new C23787(1)).collect(C24205.toSet());
        this.f44401 = C18524.m42109(c4697.m9974(), new String[0]);
        C13529 c13529 = new C13529(this, c4697.m9965(), set, c4697);
        c13529.m33344(R.string.MT_Protector);
        c13529.m33333(R.string.MT_Protector, (View.OnClickListener) null, (ViewOnLongClickListenerC24753) null);
        c13529.m33336((CharSequence) this.f44401.m38684("classes_merge.dex").m38650(true).getName());
        c13529.m33365(6);
        c13529.m33330();
        c13529.m33352(false);
        Button buttonM33368 = c13529.m33368();
        ViewGroup viewGroup = (ViewGroup) buttonM33368.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM33368);
        CheckBox checkBox = (CheckBox) c4697.m9965().m12252(R.layout.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("delete_dex_files_after_merged", false));
        checkBox.setOnCheckedChangeListener(new C8164());
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35332(C15539 c15539, String str) {
        return c15539.f44401.m38684(str).mo25094();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m35333(C4697 c4697) {
        if (c4697.m9966() < 2) {
            return false;
        }
        for (InterfaceC19370 interfaceC19370 : c4697.m9957()) {
            if (!interfaceC19370.mo39135() || !interfaceC19370.getName().toLowerCase().endsWith(".dex")) {
                return false;
            }
        }
        return true;
    }
}
