package bin.p000mt.plugin.api.p002ui.builder;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginEditTextWatcher;
import bin.p000mt.plugin.api.p002ui.PluginView;

/* JADX INFO: loaded from: classes.dex */
public interface PluginEditTextBuilder extends PluginBaseViewBuilder {
    PluginEditTextBuilder addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    PluginEditTextBuilder background(Drawable drawable);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    /* bridge */ /* synthetic */ PluginUIBuilder background(Drawable drawable);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    PluginEditTextBuilder backgroundColor(int i);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    /* bridge */ /* synthetic */ PluginUIBuilder backgroundColor(int i);

    PluginEditTextBuilder bold();

    PluginEditTextBuilder disableBracketHighlight();

    PluginEditTextBuilder hint(CharSequence charSequence);

    PluginEditTextBuilder inputType(int i);

    PluginEditTextBuilder inputTypeMultiline();

    PluginEditTextBuilder inputTypeNumber();

    boolean isBoxStyle();

    boolean isLineStyle();

    PluginEditTextBuilder italic();

    PluginEditTextBuilder lines(int i);

    PluginEditTextBuilder maxLength(int i);

    PluginEditTextBuilder maxLines(int i);

    PluginEditTextBuilder minLines(int i);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    @Deprecated
    PluginEditTextBuilder onClick(PluginView.OnClickListener onClickListener);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    @Deprecated
    /* bridge */ /* synthetic */ PluginUIBuilder onClick(PluginView.OnClickListener onClickListener);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    @Deprecated
    PluginEditTextBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    @Deprecated
    /* bridge */ /* synthetic */ PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener);

    PluginEditTextBuilder readOnly();

    PluginEditTextBuilder readOnly(boolean z);

    PluginEditTextBuilder requestFocusAndShowIME();

    PluginEditTextBuilder select(int i);

    PluginEditTextBuilder select(int i, int i2);

    PluginEditTextBuilder selectAll();

    PluginEditTextBuilder selectEnd();

    PluginEditTextBuilder setHintTextColor(int i);

    PluginEditTextBuilder singleLine(boolean z);

    PluginEditTextBuilder softWrap(int i);

    PluginEditTextBuilder syntaxHighlight(String str);

    PluginEditTextBuilder text(JSONObject jSONObject);

    PluginEditTextBuilder text(JSONObject jSONObject, String str);

    PluginEditTextBuilder text(CharSequence charSequence);

    PluginEditTextBuilder textColor(int i);

    PluginEditTextBuilder textSize(float f);

    PluginEditTextBuilder textStyle(boolean z, boolean z2);

    PluginEditTextBuilder typeface(Typeface typeface);

    PluginEditTextBuilder typeface(Typeface typeface, int i);

    /* JADX INFO: renamed from: bin.mt.plugin.api.ui.builder.PluginEditTextBuilder$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
