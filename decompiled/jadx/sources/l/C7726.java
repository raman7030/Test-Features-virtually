package l;

import android.content.Context;
import android.view.View;
import android.widget.Spinner;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginSpinner;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 77QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C7726 extends AbstractC9844 implements PluginSpinnerBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Integer f23910;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f23911;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f23912;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public PluginSpinner.OnItemSelectedListener f23913;

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final void mo10675(C7312 c7312) {
        final C12956 c12956 = (C12956) c7312;
        super.mo10675(c12956);
        List list = this.f23912;
        if (list != null) {
            c12956.setItems(list);
        }
        PluginSpinner.OnItemSelectedListener onItemSelectedListener = this.f23913;
        if (onItemSelectedListener != null) {
            if (this.f23911) {
                c12956.setOnItemSelectedListener(onItemSelectedListener);
            } else {
                ((Spinner) c12956.m19595()).post(new Runnable() { // from class: l.ܰ᩷᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        c12956.setOnItemSelectedListener(this.f42499.f23913);
                    }
                });
            }
        }
        Integer num = this.f23910;
        if (num != null) {
            c12956.setSelection(num.intValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder items(List list) {
        this.f23912 = list;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder postOnItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f23911 = false;
        this.f23913 = onItemSelectedListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder onItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f23911 = true;
        this.f23913 = onItemSelectedListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(int i) {
        this.f23910 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(JSONObject jSONObject) {
        selection(jSONObject, 0);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            this.f23910 = Integer.valueOf(i);
            return this;
        }
        this.f23910 = Integer.valueOf(jSONObject.getInt(requireId(), i));
        return this;
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C12956(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        return new C3122(context, null);
    }
}
