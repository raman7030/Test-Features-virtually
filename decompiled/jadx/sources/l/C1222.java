package l;

import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.֨ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1222 extends AbstractC15252 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12511 f4387;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4388;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3339 f4389;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222(ActivityC3339 activityC3339, ActivityC3339 activityC33310, int i, C12511 c12511) {
        super(activityC33310);
        this.f4389 = activityC3339;
        this.f4388 = i;
        this.f4387 = c12511;
    }

    @Override // l.AbstractC15252
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo4060() {
        int iM27878;
        TextInputLayout textInputLayoutM36259 = m36259(0);
        TextInputLayout textInputLayoutM362510 = m36259(1);
        EditText editText = textInputLayoutM36259.getEditText();
        C11003.requireNonNull(editText);
        EditText editText2 = textInputLayoutM362510.getEditText();
        C11003.requireNonNull(editText2);
        String string = editText.getText().toString();
        String string2 = editText2.getText().toString();
        if (string.isEmpty() && string2.isEmpty()) {
            return true;
        }
        boolean zIsEmpty = string.isEmpty();
        ActivityC3339 activityC3339 = this.f4389;
        if (zIsEmpty) {
            textInputLayoutM36259.setError(activityC3339.getString(R.string.MT_Protector));
            iM27878 = C11266.m27878(8.0f);
        } else {
            int size = activityC3339.f10555.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (string.equals(((C12511) activityC3339.f10555.get(i)).f37581)) {
                    break;
                }
                i++;
            }
            int i2 = this.f4388;
            if (i != -1 && i != i2) {
                textInputLayoutM36259.setError(activityC3339.getString(R.string.MT_Protector));
                iM27878 = C11266.m27878(8.0f);
            } else {
                if (i2 == -1) {
                    activityC3339.f10555.add(new C12511(string, string2));
                    activityC3339.f10557.notifyItemInserted(activityC3339.f10555.size() - 1);
                } else {
                    C12511 c12511 = this.f4387;
                    c12511.f37581 = string;
                    c12511.f37580 = string2;
                    activityC3339.f10557.notifyItemChanged(i2);
                }
                C10395.m26219();
                return true;
            }
        }
        C9876.m24967(textInputLayoutM362510, -1, iM27878, -1, -1);
        return false;
    }
}
