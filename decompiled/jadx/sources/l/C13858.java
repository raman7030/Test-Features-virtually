package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13858 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f41322;

    public C13858() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return (c2450.m7916("local") || c2450.m7916("zip")) && m33214(c2450);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        if (c2450.m7916("zip")) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        Set set = (Set) C5378.stream(c2450.m7909()).map(new C22536(1)).collect(C22976.toSet());
        this.f41322 = C16999.m39866(c2450.m7926(), new String[0]);
        C11743 c11743 = new C11743(this, c2450.m7917(), set, c2450);
        c11743.m31258(R.string.MT_Protector);
        c11743.m31247(R.string.MT_Protector, (View.OnClickListener) null, (ViewOnLongClickListenerC23553) null);
        c11743.m31250((CharSequence) this.f41322.m36526("classes_merge.dex").m36492(true).getName());
        c11743.m31279(6);
        c11743.m31244();
        c11743.m31266(false);
        Button buttonM31282 = c11743.m31282();
        ViewGroup viewGroup = (ViewGroup) buttonM31282.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM31282);
        CheckBox checkBox = (CheckBox) c2450.m7917().m10216(R.layout.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("delete_dex_files_after_merged", false));
        checkBox.setOnCheckedChangeListener(new C6098());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33213(C13858 c13858, String str) {
        return c13858.f41322.m36526(str).mo23120();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m33214(C2450 c2450) {
        if (c2450.m7918() < 2) {
            return false;
        }
        for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
            if (!interfaceC17889.mo36969() || !interfaceC17889.getName().toLowerCase().endsWith(".dex")) {
                return false;
            }
        }
        return true;
    }
}
