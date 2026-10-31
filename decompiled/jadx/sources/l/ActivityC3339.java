package l;

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
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3339 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static volatile C21684 f10553;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10554 = 0;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final List f10555 = C10395.m26220();

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C1556 f10556;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C15332 f10557;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "PasswordManager";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10197(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            f10553 = null;
        } else {
            f10553 = new C21684(str, str2);
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC13382(2, this));
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C15332 c15332 = new C15332(this);
        this.f10557 = c15332;
        c15332.registerAdapterDataObserver(new C0516(this, textView));
        textView.setVisibility(this.f10555.isEmpty() ? 0 : 8);
        c13132.setAdapter(this.f10557);
        C1556 c1556 = new C1556(new C5456(this));
        this.f10556 = c1556;
        c1556.m5322(c13132);
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
            m10201(-1);
            return true;
        }
        if (menuItem.getItemId() == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC21209.class));
            return true;
        }
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        C21684 c21684 = f10553;
        if (c21684 != null) {
            TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
            textView.setTextIsSelectable(true);
            textView.setLineSpacing(0.0f, 1.05f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c21684.f69558);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70284), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c21684.f69557);
            textView.setText(spannableStringBuilder);
        }
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
        return true;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f10557.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m10201(int i) {
        C12511 c12511 = i == -1 ? new C12511("", "") : (C12511) this.f10555.get(i);
        C1222 c1222 = new C1222(this, this, i, c12511);
        c1222.m36260(i == -1 ? R.string.MT_Protector : R.string.MT_Protector);
        c1222.m36256(R.string.MT_Protector, c12511.f37581);
        c1222.m36256(R.string.MT_Protector, c12511.f37580);
        c1222.m36262();
        C4925.m14316(new RunnableC7412(4, c1222), 200L);
        TextInputLayout textInputLayoutM36259 = c1222.m36259(0);
        TextInputLayout textInputLayoutM362510 = c1222.m36259(1);
        EditText editText = textInputLayoutM36259.getEditText();
        C11003.requireNonNull(editText);
        editText.addTextChangedListener(new C8278(textInputLayoutM36259, textInputLayoutM362510));
        textInputLayoutM362510.setExpandedHintEnabled(false);
        textInputLayoutM362510.getEditText().setHint(R.string.MT_Protector);
    }
}
