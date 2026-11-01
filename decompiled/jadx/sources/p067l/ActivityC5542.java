package p067l;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC5542 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۜۧ */
    public static volatile C22977 f13363;

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f13364 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public final List f13365 = C12248.m28249();

    /* JADX INFO: renamed from: ܿۧ */
    public C3847 f13366;

    /* JADX INFO: renamed from: ᩳۧ */
    public C16940 f13367;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "PasswordManager";
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12233(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            f13363 = null;
        } else {
            f13363 = new C22977(str, str2);
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC15087(2, this));
        C14849 c14849 = (C14849) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C16940 c16940 = new C16940(this);
        this.f13367 = c16940;
        c16940.registerAdapterDataObserver(new C2859(this, textView));
        textView.setVisibility(this.f13365.isEmpty() ? 0 : 8);
        c14849.setAdapter(this.f13367);
        C3847 c3847 = new C3847(new C7554(this));
        this.f13366 = c3847;
        c3847.m7551(c14849);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        MenuItem menuItemAdd2 = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd2.setShowAsAction(2);
        menuItemAdd2.setIcon(R.drawable.MT_Protector);
        MenuItem menuItemAdd3 = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd3.setShowAsAction(2);
        menuItemAdd3.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.MT_Protector) {
            m12237(-1);
            return true;
        }
        if (menuItem.getItemId() == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC22526.class));
            return true;
        }
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        C22977 c22977 = f13363;
        if (c22977 != null) {
            TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
            textView.setTextIsSelectable(true);
            textView.setLineSpacing(0.0f, 1.05f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c22977.f72263);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72995), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c22977.f72262);
            textView.setText(spannableStringBuilder);
        }
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
        return true;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f13367.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m12237(int i) {
        C14259 c14259 = i == -1 ? new C14259("", "") : (C14259) this.f13365.get(i);
        C3530 c3530 = new C3530(this, this, i, c14259);
        c3530.m38421(i == -1 ? R.string.MT_Protector : R.string.MT_Protector);
        c3530.m38417(R.string.MT_Protector, c14259.f40605);
        c3530.m38417(R.string.MT_Protector, c14259.f40604);
        c3530.m38423();
        C7050.m16213(new RunnableC9413(4, c3530), 200L);
        TextInputLayout textInputLayoutM38420 = c3530.m38420(0);
        TextInputLayout textInputLayoutM38421 = c3530.m38420(1);
        EditText editText = textInputLayoutM38420.getEditText();
        C12826.requireNonNull(editText);
        editText.addTextChangedListener(new C10236(textInputLayoutM38420, textInputLayoutM38421));
        textInputLayoutM38421.setExpandedHintEnabled(false);
        textInputLayoutM38421.getEditText().setHint(R.string.MT_Protector);
    }
}
