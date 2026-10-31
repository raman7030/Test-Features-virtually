package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12577 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f37921;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37922 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f37923;

    public C12577(Button button, ActivityC0477 activityC0477) {
        this.f37921 = button;
        this.f37923 = activityC0477;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f37921.setEnabled(false);
        m20272(this.f37923, 100);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        String stringNullable;
        ArrayList<Class> arrayList = new ArrayList();
        for (C16709 c16709 : C13265.m32202()) {
            c16709.m39306(arrayList);
            String strM39295 = c16709.m39295();
            String strM39302 = c16709.m39302();
            for (Class cls : arrayList) {
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) cls.newInstance();
                    textEditorFunction.init(c16709.m39304());
                    if (textEditorFunction.isEnabled()) {
                        String name = cls.getName();
                        PluginContext pluginContextM39304 = c16709.m39304();
                        String strName = textEditorFunction.name();
                        this.f37922.add(new C6227(strM39295, strM39302, name, (strName.length() < 3 || strName.charAt(0) != '{' || strName.charAt(strName.length() + (-1)) != '}' || (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) == null) ? strName : stringNullable, new C10220(c16709, textEditorFunction)));
                    }
                } catch (Throwable th) {
                    c16709.m39290(th);
                }
            }
            arrayList.clear();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList = this.f37922;
        boolean zIsEmpty = arrayList.isEmpty();
        final ActivityC0477 activityC0477 = this.f37923;
        if (zIsEmpty) {
            C21374.m48457(R.string.MT_Protector);
            activityC0477.startActivity(new Intent(activityC0477, (Class<?>) ActivityC23143.class));
            return;
        }
        C11872 c11872 = (C11872) this.f37921.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c11872 == null ? new JSONObject() : c11872.mo27664();
        String string = jSONObject.getString(am.av);
        String string2 = jSONObject.getString("b");
        JSONObject jSONObject2 = jSONObject.getJSONObject(am.aF);
        View viewM10216 = activityC0477.m10216(R.layout.MT_Protector);
        final Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        final FrameLayout frameLayout = (FrameLayout) viewM10216.findViewById(R.id.MT_Protector);
        spinner.setOnItemSelectedListener(new C13282(this, frameLayout, string, string2, jSONObject2));
        spinner.setAdapter((SpinnerAdapter) new C20065(activityC0477, arrayList));
        if (string != null && string2 != null) {
            String strM50967 = C22870.m50967(string, "/", string2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (strM50967.equals(((C6227) arrayList.get(i)).m17149())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        C19258 c19258BuildDialog = activityC0477.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        Button buttonM1447 = dialogInterfaceC0206M44438.m1447();
        final Button button = this.f37921;
        buttonM1447.setOnClickListener(new View.OnClickListener() { // from class: l.ۗᩳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6227 c6227 = (C6227) this.f10774.f37922.get(spinner.getSelectedItemPosition());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(am.av, c6227.f19080);
                jSONObject3.put("b", c6227.f19076);
                Object tag = frameLayout.getTag(R.id.MT_Protector);
                if (tag instanceof PluginView) {
                    PluginView pluginView = (PluginView) tag;
                    try {
                        JSONObject optionsData = ((TextEditorFunction) c6227.m17151().f30698).getOptionsData(pluginView.getPluginUI(), pluginView);
                        if (optionsData == TextEditorFunction.VALIDATION_FAILED) {
                            return;
                        }
                        if (optionsData != null) {
                            jSONObject3.put(am.aF, optionsData);
                        }
                    } catch (Throwable th) {
                        ((C16709) c6227.m17151().f30697).m39290(th);
                        activityC0477.m10223(th, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                }
                C11872 c11873 = new C11872(jSONObject3, c6227.f19078);
                Button button2 = button;
                button2.setTag(R.id.MT_Protector, c11873);
                TextView textView = (TextView) button2.getTag(R.id.MT_Protector);
                textView.setVisibility(0);
                textView.setText(c11873.m28998());
                dialogInterfaceC0206M44438.dismiss();
            }
        });
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f37923.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        this.f37921.setEnabled(true);
    }
}
