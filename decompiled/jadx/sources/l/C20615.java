package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes5.dex */
public class C20615 extends AbstractC3723 {
    public C20615(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6898((InterfaceC7550) new C2144(this));
    }

    public C20615(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6898((InterfaceC7550) new C2144(this));
    }

    public C20615(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C2144(this));
    }

    public C20615(Context context) {
        super(context);
        m6898((InterfaceC7550) new C2144(this));
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        C15821 c15821 = new C15821(abstractActivityC3346, null);
        c15821.setMax(22);
        c15821.setPadding(c15821.getPaddingLeft(), C11266.m27878(20.0f) + c15821.getPaddingTop(), c15821.getPaddingRight(), c15821.getPaddingBottom());
        c15821.setProgress(m11313().getInt(m6911(), 12) - 6);
        String str = abstractActivityC3346.getString(R.string.MT_Protector) + " (";
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(c15821.getProgress() + 6);
        sbM15339.append("dp)");
        c19258BuildDialog.m44436(sbM15339.toString());
        c19258BuildDialog.m44421(c15821);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c15821.setOnSeekBarChangeListener(new C6503(this, c19258BuildDialog.m44438(), str));
    }
}
