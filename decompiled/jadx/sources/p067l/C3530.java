package p067l;

import android.widget.EditText;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.֨ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3530 extends AbstractC16864 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C14259 f7157;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int f7158;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC5542 f7159;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3530(ActivityC5542 activityC5542, ActivityC5542 activityC5543, int i, C14259 c14259) {
        super(activityC5543);
        this.f7159 = activityC5542;
        this.f7158 = i;
        this.f7157 = c14259;
    }

    @Override // p067l.AbstractC16864
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6304() {
        int iM29939;
        TextInputLayout textInputLayoutM38420 = m38420(0);
        TextInputLayout textInputLayoutM38421 = m38420(1);
        EditText editText = textInputLayoutM38420.getEditText();
        C12826.requireNonNull(editText);
        EditText editText2 = textInputLayoutM38421.getEditText();
        C12826.requireNonNull(editText2);
        String string = editText.getText().toString();
        String string2 = editText2.getText().toString();
        if (string.isEmpty() && string2.isEmpty()) {
            return true;
        }
        boolean zIsEmpty = string.isEmpty();
        ActivityC5542 activityC5542 = this.f7159;
        if (zIsEmpty) {
            textInputLayoutM38420.setError(activityC5542.getString(R.string.MT_Protector));
            iM29939 = C13076.m29939(8.0f);
        } else {
            int size = activityC5542.f13365.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (string.equals(((C14259) activityC5542.f13365.get(i)).f40605)) {
                    break;
                }
                i++;
            }
            int i2 = this.f7158;
            if (i != -1 && i != i2) {
                textInputLayoutM38420.setError(activityC5542.getString(R.string.MT_Protector));
                iM29939 = C13076.m29939(8.0f);
            } else {
                if (i2 == -1) {
                    activityC5542.f13365.add(new C14259(string, string2));
                    activityC5542.f13367.notifyItemInserted(activityC5542.f13365.size() - 1);
                } else {
                    C14259 c14259 = this.f7157;
                    c14259.f40605 = string;
                    c14259.f40604 = string2;
                    activityC5542.f13367.notifyItemChanged(i2);
                }
                C12248.m28248();
                return true;
            }
        }
        C11755.m26982(textInputLayoutM38421, -1, iM29939, -1, -1);
        return false;
    }
}
