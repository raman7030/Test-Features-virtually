package p067l;

import android.content.Context;
import android.view.View;
import android.widget.Spinner;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginSpinner;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 77QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9712 extends AbstractC11725 implements PluginSpinnerBuilder {

    /* JADX INFO: renamed from: ֡ */
    public Integer f26823;

    /* JADX INFO: renamed from: ۘ */
    public boolean f26824;

    /* JADX INFO: renamed from: ᩴ */
    public List f26825;

    /* JADX INFO: renamed from: ᩵ */
    public PluginSpinner.OnItemSelectedListener f26826;

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(C9318 c9318) {
        final C14682 c14682 = (C14682) c9318;
        super.mo12670(c14682);
        List list = this.f26825;
        if (list != null) {
            c14682.setItems(list);
        }
        PluginSpinner.OnItemSelectedListener onItemSelectedListener = this.f26826;
        if (onItemSelectedListener != null) {
            if (this.f26824) {
                c14682.setOnItemSelectedListener(onItemSelectedListener);
            } else {
                ((Spinner) c14682.m21563()).post(new Runnable() { // from class: l.ܰ᩷᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        c14682.setOnItemSelectedListener(this.f45585.f26826);
                    }
                });
            }
        }
        Integer num = this.f26823;
        if (num != null) {
            c14682.setSelection(num.intValue());
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder items(List list) {
        this.f26825 = list;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder postOnItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f26824 = false;
        this.f26826 = onItemSelectedListener;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder onItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f26824 = true;
        this.f26826 = onItemSelectedListener;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(int i) {
        this.f26823 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(JSONObject jSONObject) {
        selection(jSONObject, 0);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            this.f26823 = Integer.valueOf(i);
            return this;
        }
        this.f26823 = Integer.valueOf(jSONObject.getInt(requireId(), i));
        return this;
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C14682(pluginUI, pluginViewGroup);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        return new C0997(context, null);
    }
}
