.class public abstract Lbin/mt/plugin/api/editor/BaseTextEditorBaseMenu;
.super Ljava/lang/Object;
.source "BaseTextEditorBaseMenu.java"

# interfaces
.implements Lbin/mt/plugin/api/editor/TextEditorBaseMenu;


# instance fields
.field public context:Lbin/mt/plugin/api/PluginContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Lbin/mt/plugin/api/PluginContext;
    .locals 1

    .line 70
    iget-object v0, p0, Lbin/mt/plugin/api/editor/BaseTextEditorBaseMenu;->context:Lbin/mt/plugin/api/PluginContext;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/PluginContext;

    return-object v0
.end method

.method public init()V
    .locals 0

    return-void
.end method

.method public final init(Lbin/mt/plugin/api/PluginContext;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lbin/mt/plugin/api/editor/BaseTextEditorBaseMenu;->context:Lbin/mt/plugin/api/PluginContext;

    .line 42
    invoke-virtual {p0}, Lbin/mt/plugin/api/editor/BaseTextEditorBaseMenu;->init()V

    return-void
.end method

.method public isEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onPluginButtonClick(Lbin/mt/plugin/api/ui/PluginUI;)V
    .locals 6

    .line 104
    invoke-virtual {p0}, Lbin/mt/plugin/api/editor/BaseTextEditorBaseMenu;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    .line 105
    invoke-interface {v0}, Lbin/mt/plugin/api/PluginContext;->getPluginId()Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 107
    new-instance v3, Landroid/text/SpannableString;

    const-string v4, "\n\n"

    .line 0
    invoke-static {v1, v4}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 108
    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    const v4, 0x3dcccccd    # 0.1f

    invoke-direct {v1, v4}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v4, v2, 0x1

    add-int/lit8 v2, v2, 0x2

    const/16 v5, 0x11

    invoke-virtual {v3, v1, v4, v2, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 109
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->colorTextSecondary()I

    move-result v4

    invoke-direct {v1, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v4

    invoke-virtual {v3, v1, v2, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 110
    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    const v4, 0x3f4ccccd    # 0.8f

    invoke-direct {v1, v4}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v4

    invoke-virtual {v3, v1, v2, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 111
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->buildDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    .line 112
    invoke-interface {v0}, Lbin/mt/plugin/api/PluginContext;->getPluginName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    .line 113
    invoke-interface {p1, v3}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    const-string v0, "{close}"

    const/4 v1, 0x0

    .line 114
    invoke-interface {p1, v0, v1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    .line 115
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->show()Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    return-void
.end method
