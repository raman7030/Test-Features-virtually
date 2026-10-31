.class public interface abstract Lbin/mt/plugin/api/ui/PluginUI;
.super Ljava/lang/Object;
.source "PluginUI.java"


# static fields
.field public static final DEFAULT_STYLE:Lbin/mt/plugin/api/ui/PluginUI$Style;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 313
    new-instance v0, Ll/ۨܳ᩷;

    invoke-direct {v0}, Ll/ۨܳ᩷;-><init>()V

    sput-object v0, Lbin/mt/plugin/api/ui/PluginUI;->DEFAULT_STYLE:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-void
.end method


# virtual methods
.method public abstract buildDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
.end method

.method public abstract buildFrameLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;
.end method

.method public abstract buildHorizontalLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;
.end method

.method public abstract buildVerticalLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;
.end method

.method public abstract cancelToast()V
.end method

.method public abstract colorAccent()I
.end method

.method public abstract colorDivider()I
.end method

.method public abstract colorError()I
.end method

.method public abstract colorPrimary()I
.end method

.method public abstract colorText()I
.end method

.method public abstract colorTextSecondary()I
.end method

.method public abstract colorTextSecondaryStateList()Landroid/content/res/ColorStateList;
.end method

.method public abstract colorTextStateList()Landroid/content/res/ColorStateList;
.end method

.method public abstract colorWarning()I
.end method

.method public abstract createPopupMenu(Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/plugin/api/ui/menu/PluginPopupMenu;
.end method

.method public abstract defaultStyle(Lbin/mt/plugin/api/ui/PluginUI$Style;)Lbin/mt/plugin/api/ui/PluginUI;
.end method

.method public abstract dialogPaddingHorizontal()I
.end method

.method public abstract dialogPaddingVertical()I
.end method

.method public abstract disableStrictIdMode()Lbin/mt/plugin/api/ui/PluginUI;
.end method

.method public abstract dp2px(F)I
.end method

.method public abstract getContext()Lbin/mt/plugin/api/PluginContext;
.end method

.method public abstract getStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;
.end method

.method public abstract isDarkTheme()Z
.end method

.method public abstract isStrictIdModeEnabled()Z
.end method

.method public abstract selectableItemBackground()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract selectableItemBackgroundBorderless()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract setStrictIdModeEnabled(Z)Lbin/mt/plugin/api/ui/PluginUI;
.end method

.method public abstract showErrorMessage(Ljava/lang/Throwable;)V
.end method

.method public abstract showMessage(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
.end method

.method public abstract showPreference(Ljava/lang/Class;)V
.end method

.method public abstract showToast(Ljava/lang/CharSequence;)V
.end method

.method public varargs abstract showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
.end method

.method public abstract showToastL(Ljava/lang/CharSequence;)V
.end method

.method public varargs abstract showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
.end method

.method public abstract sp2px(F)I
.end method
