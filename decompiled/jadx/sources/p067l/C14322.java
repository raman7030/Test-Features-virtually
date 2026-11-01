package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.editor.TextEditorFunction;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14322 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Button f40947;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f40948 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC2822 f40949;

    public C14322(Button button, ActivityC2822 activityC2822) {
        this.f40947 = button;
        this.f40949 = activityC2822;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f40947.setEnabled(false);
        m22248(this.f40949, 100);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String stringNullable;
        ArrayList<Class> arrayList = new ArrayList();
        for (C18249 c18249 : C14976.m34301()) {
            c18249.m41542(arrayList);
            String strM41531 = c18249.m41531();
            String strM41538 = c18249.m41538();
            for (Class cls : arrayList) {
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) cls.newInstance();
                    textEditorFunction.init(c18249.m41540());
                    if (textEditorFunction.isEnabled()) {
                        String name = cls.getName();
                        PluginContext pluginContextM41540 = c18249.m41540();
                        String strName = textEditorFunction.name();
                        this.f40948.add(new C8287(strM41531, strM41538, name, (strName.length() < 3 || strName.charAt(0) != '{' || strName.charAt(strName.length() + (-1)) != '}' || (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) == null) ? strName : stringNullable, new C1349(c18249, textEditorFunction)));
                    }
                } catch (Throwable th) {
                    c18249.m41526(th);
                }
            }
            arrayList.clear();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ArrayList arrayList = this.f40948;
        boolean zIsEmpty = arrayList.isEmpty();
        final ActivityC2822 activityC2822 = this.f40949;
        if (zIsEmpty) {
            C22682.m50793(R.string.MT_Protector);
            activityC2822.startActivity(new Intent(activityC2822, (Class<?>) ActivityC24364.class));
            return;
        }
        C13652 c13652 = (C13652) this.f40947.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c13652 == null ? new JSONObject() : c13652.mo29726();
        String string = jSONObject.getString(C0655am.f2320av);
        String string2 = jSONObject.getString("b");
        JSONObject jSONObject2 = jSONObject.getJSONObject(C0655am.f2278aF);
        View viewM12252 = activityC2822.m12252(R.layout.MT_Protector);
        final Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        final FrameLayout frameLayout = (FrameLayout) viewM12252.findViewById(R.id.MT_Protector);
        spinner.setOnItemSelectedListener(new C14992(this, frameLayout, string, string2, jSONObject2));
        spinner.setAdapter((SpinnerAdapter) new C21438(activityC2822, arrayList));
        if (string != null && string2 != null) {
            String strM53357 = C24104.m53357(string, "/", string2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (strM53357.equals(((C8287) arrayList.get(i)).m19081())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        C20671 c20671BuildDialog = activityC2822.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        Button buttonM3860 = dialogInterfaceC2564M46732.m3860();
        final Button button = this.f40947;
        buttonM3860.setOnClickListener(new View.OnClickListener() { // from class: l.ۗᩳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8287 c8287 = (C8287) this.f13581.f40948.get(spinner.getSelectedItemPosition());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C0655am.f2320av, c8287.f21943);
                jSONObject3.put("b", c8287.f21939);
                Object tag = frameLayout.getTag(R.id.MT_Protector);
                if (tag instanceof PluginView) {
                    PluginView pluginView = (PluginView) tag;
                    try {
                        JSONObject optionsData = ((TextEditorFunction) c8287.m19083().f33659).getOptionsData(pluginView.getPluginUI(), pluginView);
                        if (optionsData == TextEditorFunction.VALIDATION_FAILED) {
                            return;
                        }
                        if (optionsData != null) {
                            jSONObject3.put(C0655am.f2278aF, optionsData);
                        }
                    } catch (Throwable th) {
                        ((C18249) c8287.m19083().f33658).m41526(th);
                        activityC2822.m12259(th, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                }
                C13652 c13653 = new C13652(jSONObject3, c8287.f21941);
                Button button2 = button;
                button2.setTag(R.id.MT_Protector, c13653);
                TextView textView = (TextView) button2.getTag(R.id.MT_Protector);
                textView.setVisibility(0);
                textView.setText(c13653.m31049());
                dialogInterfaceC2564M46732.dismiss();
            }
        });
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f40949.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        this.f40947.setEnabled(true);
    }
}
