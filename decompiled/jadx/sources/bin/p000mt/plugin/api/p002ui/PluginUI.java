package bin.p000mt.plugin.api.p002ui;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseLinearLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewGroupBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginCheckBoxBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginLinearLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRadioButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginSwitchButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginTextViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginViewBuilder;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;
import bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu;
import p067l.C13556;

/* JADX INFO: loaded from: classes.dex */
public interface PluginUI {
    public static final Style DEFAULT_STYLE = new C13556();

    PluginDialog.Builder buildDialog();

    PluginRootLayoutBuilder buildFrameLayout();

    PluginRootLayoutBuilder buildHorizontalLayout();

    PluginRootLayoutBuilder buildVerticalLayout();

    void cancelToast();

    int colorAccent();

    int colorDivider();

    int colorError();

    int colorPrimary();

    int colorText();

    int colorTextSecondary();

    ColorStateList colorTextSecondaryStateList();

    ColorStateList colorTextStateList();

    int colorWarning();

    PluginPopupMenu createPopupMenu(PluginView pluginView);

    PluginUI defaultStyle(Style style);

    int dialogPaddingHorizontal();

    int dialogPaddingVertical();

    PluginUI disableStrictIdMode();

    int dp2px(float f);

    PluginContext getContext();

    Style getStyle();

    boolean isDarkTheme();

    boolean isStrictIdModeEnabled();

    Drawable selectableItemBackground();

    Drawable selectableItemBackgroundBorderless();

    PluginUI setStrictIdModeEnabled(boolean z);

    void showErrorMessage(Throwable th);

    void showMessage(CharSequence charSequence, CharSequence charSequence2);

    void showPreference(Class cls);

    void showToast(CharSequence charSequence);

    void showToast(CharSequence charSequence, Object... objArr);

    void showToastL(CharSequence charSequence);

    void showToastL(CharSequence charSequence, Object... objArr);

    int sp2px(float f);

    public class Style {
        public boolean handleBaseButton(PluginUI pluginUI, PluginBaseButtonBuilder pluginBaseButtonBuilder) {
            return false;
        }

        public boolean handleBaseCompoundButton(PluginUI pluginUI, PluginBaseCompoundButtonBuilder pluginBaseCompoundButtonBuilder) {
            return false;
        }

        public boolean handleBaseTextView(PluginUI pluginUI, PluginBaseTextViewBuilder pluginBaseTextViewBuilder) {
            return false;
        }

        public boolean handleBaseView(PluginUI pluginUI, PluginBaseViewBuilder pluginBaseViewBuilder) {
            return false;
        }

        public boolean handleBaseViewGroup(PluginUI pluginUI, PluginBaseViewGroupBuilder pluginBaseViewGroupBuilder) {
            return false;
        }

        public void handleButton(PluginUI pluginUI, PluginButtonBuilder pluginButtonBuilder) {
        }

        public void handleCheckBox(PluginUI pluginUI, PluginCheckBoxBuilder pluginCheckBoxBuilder) {
        }

        public void handleEditText(PluginUI pluginUI, PluginEditTextBuilder pluginEditTextBuilder) {
        }

        public void handleImageView(PluginUI pluginUI, PluginImageViewBuilder pluginImageViewBuilder) {
        }

        public void handleLinearLayout(PluginUI pluginUI, PluginLinearLayoutBuilder pluginLinearLayoutBuilder) {
        }

        public void handleProgressBar(PluginUI pluginUI, PluginProgressBarBuilder pluginProgressBarBuilder) {
        }

        public void handleRadioButton(PluginUI pluginUI, PluginRadioButtonBuilder pluginRadioButtonBuilder) {
        }

        public void handleRadioGroup(PluginUI pluginUI, PluginRadioGroupBuilder pluginRadioGroupBuilder) {
        }

        public void handleRootLayout(PluginUI pluginUI, PluginRootLayoutBuilder pluginRootLayoutBuilder) {
        }

        public void handleSpinner(PluginUI pluginUI, PluginSpinnerBuilder pluginSpinnerBuilder) {
        }

        public void handleSwitchButton(PluginUI pluginUI, PluginSwitchButtonBuilder pluginSwitchButtonBuilder) {
        }

        public void handleTextView(PluginUI pluginUI, PluginTextViewBuilder pluginTextViewBuilder) {
        }

        public void handleView(PluginUI pluginUI, PluginViewBuilder pluginViewBuilder) {
        }

        public final void dispatch(PluginUI pluginUI, PluginBaseViewBuilder pluginBaseViewBuilder) {
            if (handleBaseView(pluginUI, pluginBaseViewBuilder)) {
                return;
            }
            if (pluginBaseViewBuilder instanceof PluginBaseTextViewBuilder) {
                dispatchBaseTextView(pluginUI, (PluginBaseTextViewBuilder) pluginBaseViewBuilder);
                return;
            }
            if (pluginBaseViewBuilder instanceof PluginBaseViewGroupBuilder) {
                dispatchBaseViewGroup(pluginUI, (PluginBaseViewGroupBuilder) pluginBaseViewBuilder);
                return;
            }
            if (pluginBaseViewBuilder instanceof PluginViewBuilder) {
                handleView(pluginUI, (PluginViewBuilder) pluginBaseViewBuilder);
                return;
            }
            if (pluginBaseViewBuilder instanceof PluginEditTextBuilder) {
                handleEditText(pluginUI, (PluginEditTextBuilder) pluginBaseViewBuilder);
                return;
            }
            if (pluginBaseViewBuilder instanceof PluginImageViewBuilder) {
                handleImageView(pluginUI, (PluginImageViewBuilder) pluginBaseViewBuilder);
                return;
            }
            if (pluginBaseViewBuilder instanceof PluginSpinnerBuilder) {
                handleSpinner(pluginUI, (PluginSpinnerBuilder) pluginBaseViewBuilder);
            } else if (pluginBaseViewBuilder instanceof PluginProgressBarBuilder) {
                handleProgressBar(pluginUI, (PluginProgressBarBuilder) pluginBaseViewBuilder);
            } else {
                if (pluginBaseViewBuilder instanceof PluginRootLayoutBuilder) {
                    handleRootLayout(pluginUI, (PluginRootLayoutBuilder) pluginBaseViewBuilder);
                    return;
                }
                throw new RuntimeException(pluginBaseViewBuilder.getClass().getSimpleName());
            }
        }

        public final void dispatchBaseTextView(PluginUI pluginUI, PluginBaseTextViewBuilder pluginBaseTextViewBuilder) {
            if (handleBaseTextView(pluginUI, pluginBaseTextViewBuilder)) {
                return;
            }
            if (pluginBaseTextViewBuilder instanceof PluginBaseButtonBuilder) {
                dispatchBaseButton(pluginUI, (PluginBaseButtonBuilder) pluginBaseTextViewBuilder);
            } else {
                if (pluginBaseTextViewBuilder instanceof PluginTextViewBuilder) {
                    handleTextView(pluginUI, (PluginTextViewBuilder) pluginBaseTextViewBuilder);
                    return;
                }
                throw new RuntimeException(pluginBaseTextViewBuilder.getClass().getSimpleName());
            }
        }

        public final void dispatchBaseButton(PluginUI pluginUI, PluginBaseButtonBuilder pluginBaseButtonBuilder) {
            if (handleBaseButton(pluginUI, pluginBaseButtonBuilder)) {
                return;
            }
            if (pluginBaseButtonBuilder instanceof PluginBaseCompoundButtonBuilder) {
                dispatchBaseCompoundButton(pluginUI, (PluginBaseCompoundButtonBuilder) pluginBaseButtonBuilder);
            } else {
                if (pluginBaseButtonBuilder instanceof PluginButtonBuilder) {
                    handleButton(pluginUI, (PluginButtonBuilder) pluginBaseButtonBuilder);
                    return;
                }
                throw new RuntimeException(pluginBaseButtonBuilder.getClass().getSimpleName());
            }
        }

        public final void dispatchBaseCompoundButton(PluginUI pluginUI, PluginBaseCompoundButtonBuilder pluginBaseCompoundButtonBuilder) {
            if (handleBaseCompoundButton(pluginUI, pluginBaseCompoundButtonBuilder)) {
                return;
            }
            if (pluginBaseCompoundButtonBuilder instanceof PluginCheckBoxBuilder) {
                handleCheckBox(pluginUI, (PluginCheckBoxBuilder) pluginBaseCompoundButtonBuilder);
            } else if (pluginBaseCompoundButtonBuilder instanceof PluginSwitchButtonBuilder) {
                handleSwitchButton(pluginUI, (PluginSwitchButtonBuilder) pluginBaseCompoundButtonBuilder);
            } else {
                if (pluginBaseCompoundButtonBuilder instanceof PluginRadioButtonBuilder) {
                    handleRadioButton(pluginUI, (PluginRadioButtonBuilder) pluginBaseCompoundButtonBuilder);
                    return;
                }
                throw new RuntimeException(pluginBaseCompoundButtonBuilder.getClass().getSimpleName());
            }
        }

        public final void dispatchBaseViewGroup(PluginUI pluginUI, PluginBaseViewGroupBuilder pluginBaseViewGroupBuilder) {
            if (handleBaseViewGroup(pluginUI, pluginBaseViewGroupBuilder)) {
                return;
            }
            if (pluginBaseViewGroupBuilder instanceof PluginBaseLinearLayoutBuilder) {
                dispatchBaseLinearLayout(pluginUI, (PluginBaseLinearLayoutBuilder) pluginBaseViewGroupBuilder);
                return;
            }
            throw new RuntimeException(pluginBaseViewGroupBuilder.getClass().getSimpleName());
        }

        public final void dispatchBaseLinearLayout(PluginUI pluginUI, PluginBaseLinearLayoutBuilder pluginBaseLinearLayoutBuilder) {
            if (pluginBaseLinearLayoutBuilder instanceof PluginLinearLayoutBuilder) {
                handleLinearLayout(pluginUI, (PluginLinearLayoutBuilder) pluginBaseLinearLayoutBuilder);
            } else {
                if (pluginBaseLinearLayoutBuilder instanceof PluginRadioGroupBuilder) {
                    handleRadioGroup(pluginUI, (PluginRadioGroupBuilder) pluginBaseLinearLayoutBuilder);
                    return;
                }
                throw new RuntimeException(pluginBaseLinearLayoutBuilder.getClass().getSimpleName());
            }
        }
    }

    public class StyleWrapper extends Style {
        public Style mBase;

        public StyleWrapper() {
        }

        public StyleWrapper(Style style) {
            this.mBase = style;
        }

        public void attachStyle(Style style) {
            if (style == null) {
                throw new NullPointerException("Cannot attach null style");
            }
            if (this.mBase != null) {
                throw new IllegalStateException("Style already attached");
            }
            this.mBase = style;
        }

        public Style getBaseStyle() {
            return this.mBase;
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public boolean handleBaseView(PluginUI pluginUI, PluginBaseViewBuilder pluginBaseViewBuilder) {
            return this.mBase.handleBaseView(pluginUI, pluginBaseViewBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public boolean handleBaseTextView(PluginUI pluginUI, PluginBaseTextViewBuilder pluginBaseTextViewBuilder) {
            return this.mBase.handleBaseTextView(pluginUI, pluginBaseTextViewBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public boolean handleBaseButton(PluginUI pluginUI, PluginBaseButtonBuilder pluginBaseButtonBuilder) {
            return this.mBase.handleBaseButton(pluginUI, pluginBaseButtonBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public boolean handleBaseCompoundButton(PluginUI pluginUI, PluginBaseCompoundButtonBuilder pluginBaseCompoundButtonBuilder) {
            return this.mBase.handleBaseCompoundButton(pluginUI, pluginBaseCompoundButtonBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public boolean handleBaseViewGroup(PluginUI pluginUI, PluginBaseViewGroupBuilder pluginBaseViewGroupBuilder) {
            return this.mBase.handleBaseViewGroup(pluginUI, pluginBaseViewGroupBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleView(PluginUI pluginUI, PluginViewBuilder pluginViewBuilder) {
            this.mBase.handleView(pluginUI, pluginViewBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleTextView(PluginUI pluginUI, PluginTextViewBuilder pluginTextViewBuilder) {
            this.mBase.handleTextView(pluginUI, pluginTextViewBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleButton(PluginUI pluginUI, PluginButtonBuilder pluginButtonBuilder) {
            this.mBase.handleButton(pluginUI, pluginButtonBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleCheckBox(PluginUI pluginUI, PluginCheckBoxBuilder pluginCheckBoxBuilder) {
            this.mBase.handleCheckBox(pluginUI, pluginCheckBoxBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleSwitchButton(PluginUI pluginUI, PluginSwitchButtonBuilder pluginSwitchButtonBuilder) {
            this.mBase.handleSwitchButton(pluginUI, pluginSwitchButtonBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleRadioButton(PluginUI pluginUI, PluginRadioButtonBuilder pluginRadioButtonBuilder) {
            this.mBase.handleRadioButton(pluginUI, pluginRadioButtonBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleRadioGroup(PluginUI pluginUI, PluginRadioGroupBuilder pluginRadioGroupBuilder) {
            this.mBase.handleRadioGroup(pluginUI, pluginRadioGroupBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleSpinner(PluginUI pluginUI, PluginSpinnerBuilder pluginSpinnerBuilder) {
            this.mBase.handleSpinner(pluginUI, pluginSpinnerBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleProgressBar(PluginUI pluginUI, PluginProgressBarBuilder pluginProgressBarBuilder) {
            this.mBase.handleProgressBar(pluginUI, pluginProgressBarBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleEditText(PluginUI pluginUI, PluginEditTextBuilder pluginEditTextBuilder) {
            this.mBase.handleEditText(pluginUI, pluginEditTextBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleImageView(PluginUI pluginUI, PluginImageViewBuilder pluginImageViewBuilder) {
            this.mBase.handleImageView(pluginUI, pluginImageViewBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleLinearLayout(PluginUI pluginUI, PluginLinearLayoutBuilder pluginLinearLayoutBuilder) {
            this.mBase.handleLinearLayout(pluginUI, pluginLinearLayoutBuilder);
        }

        @Override // bin.mt.plugin.api.ui.PluginUI.Style
        public void handleRootLayout(PluginUI pluginUI, PluginRootLayoutBuilder pluginRootLayoutBuilder) {
            this.mBase.handleRootLayout(pluginUI, pluginRootLayoutBuilder);
        }
    }
}
