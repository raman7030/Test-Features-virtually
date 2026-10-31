.class public final Ll/᩸᩷᩷;
.super Ljava/lang/Object;
.source "U7QN"

# interfaces
.implements Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;


# instance fields
.field public final ֫:Ll/᩵ۚۢ;

.field public final ۧ:Ll/ᩴۜ᩷;

.field public final ܽ:Ll/ᩳۢ᩷;


# direct methods
.method public constructor <init>(Ll/ᩳۢ᩷;Landroid/content/Context;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/᩸᩷᩷;->ܽ:Ll/ᩳۢ᩷;

    .line 21
    new-instance v0, Ll/ᩴۜ᩷;

    invoke-direct {v0, p1}, Ll/ᩴۜ᩷;-><init>(Ll/ᩳۢ᩷;)V

    iput-object v0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    .line 22
    sget p1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p1, Ll/᩵ۚۢ;

    invoke-direct {p1, p2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 22
    iput-object p1, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnCancelListener;)V
    .locals 0

    .line 66
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnCancelListener;->onCancel(Lbin/mt/plugin/api/ui/dialog/PluginDialog;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V
    .locals 0

    .line 40
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0, p2}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;I)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnDismissListener;)V
    .locals 0

    .line 72
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnDismissListener;->onDismiss(Lbin/mt/plugin/api/ui/dialog/PluginDialog;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnMultiChoiceClickListener;IZ)V
    .locals 0

    .line 96
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0, p2, p3}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnMultiChoiceClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;IZ)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;)V
    .locals 0

    .line 78
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;->onShow(Lbin/mt/plugin/api/ui/dialog/PluginDialog;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 84
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0, p2, p3}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;->onKey(Lbin/mt/plugin/api/ui/dialog/PluginDialog;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۧ(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V
    .locals 0

    .line 54
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0, p2}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;I)V

    return-void
.end method

.method public static synthetic ܽ(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V
    .locals 0

    .line 47
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0, p2}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;I)V

    return-void
.end method

.method public static synthetic ܿ(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V
    .locals 0

    .line 102
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0, p2}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;I)V

    return-void
.end method

.method public static synthetic ᩳ(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V
    .locals 0

    .line 90
    iget-object p0, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-interface {p1, p0, p2}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;I)V

    return-void
.end method


# virtual methods
.method public final create()Lbin/mt/plugin/api/ui/dialog/PluginDialog;
    .locals 2

    .line 114
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object v0

    iget-object v1, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-virtual {v1, v0}, Ll/ᩴۜ᩷;->֫(Ll/֡ۚۢ;)V

    return-object v1
.end method

.method public final setCancelable(Z)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Z)V

    return-object p0
.end method

.method public final setItems([Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 90
    :cond_0
    new-instance v0, Ll/ۨۜᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p2}, Ll/ۨۜᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v0

    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-object p0
.end method

.method public final setMessage(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {p0, p1}, Ll/᩸᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final setMultiChoiceItems([Ljava/lang/CharSequence;[ZLbin/mt/plugin/api/ui/dialog/PluginDialog$OnMultiChoiceClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 96
    :cond_0
    new-instance v0, Ll/۠᩷᩷;

    invoke-direct {v0, p0, p3}, Ll/۠᩷᩷;-><init>(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnMultiChoiceClickListener;)V

    move-object p3, v0

    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    return-object p0
.end method

.method public final setNegativeButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 2

    .line 46
    invoke-virtual {p0, p1}, Ll/᩸᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ll/ᩳۜۡ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p2}, Ll/ᩳۜۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v0

    .line 46
    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-object p0
.end method

.method public final setNeutralButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 2

    .line 53
    invoke-virtual {p0, p1}, Ll/᩸᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Ll/ܽۜۡ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p2}, Ll/ܽۜۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v0

    .line 53
    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-object p0
.end method

.method public final setOnCancelListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnCancelListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 66
    :cond_0
    new-instance v0, Ll/ܶ᩷᩷;

    invoke-direct {v0, p0, p1}, Ll/ܶ᩷᩷;-><init>(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnCancelListener;)V

    move-object p1, v0

    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object p0
.end method

.method public final setOnDismissListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnDismissListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 72
    :cond_0
    new-instance v0, Ll/᩵᩷᩷;

    invoke-direct {v0, p0, p1}, Ll/᩵᩷᩷;-><init>(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnDismissListener;)V

    move-object p1, v0

    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-object p0
.end method

.method public final setOnKeyListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 84
    :cond_0
    new-instance v0, Ll/֨᩷᩷;

    invoke-direct {v0, p0, p1}, Ll/֨᩷᩷;-><init>(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;)V

    move-object p1, v0

    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ll/֨᩷᩷;)V

    return-object p0
.end method

.method public final setOnShowListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, Ll/֡᩷᩷;

    invoke-direct {v0, p0, p1}, Ll/֡᩷᩷;-><init>(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;)V

    move-object p1, v0

    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ll/֡᩷᩷;)V

    return-object p0
.end method

.method public final setPositiveButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    .line 39
    invoke-virtual {p0, p1}, Ll/᩸᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Ll/ۚ᩷᩷;

    invoke-direct {v0, p0, p2}, Ll/ۚ᩷᩷;-><init>(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V

    move-object p2, v0

    .line 39
    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ܽ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-object p0
.end method

.method public final setSingleChoiceItems([Ljava/lang/CharSequence;ILbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 2

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 102
    :cond_0
    new-instance v0, Ll/ᩳۚܿ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p3}, Ll/ᩳۚܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p3, v0

    :goto_0
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    return-object p0
.end method

.method public final setTitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {p0, p1}, Ll/᩸᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final setView(Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-static {p1}, Ll/ᩴۜ᩷;->֫(Lbin/mt/plugin/api/ui/PluginView;)Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    return-object p0
.end method

.method public final show()Lbin/mt/plugin/api/ui/dialog/PluginDialog;
    .locals 2

    .line 120
    iget-object v0, p0, Ll/᩸᩷᩷;->֫:Ll/᩵ۚۢ;

    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    iget-object v1, p0, Ll/᩸᩷᩷;->ۧ:Ll/ᩴۜ᩷;

    invoke-virtual {v1, v0}, Ll/ᩴۜ᩷;->֫(Ll/֡ۚۢ;)V

    return-object v1
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 160
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x7b

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v2, 0x7d

    if-ne v1, v2, :cond_0

    .line 161
    iget-object v1, p0, Ll/᩸᩷᩷;->ܽ:Ll/ᩳۢ᩷;

    invoke-virtual {v1}, Ll/ᩳۢ᩷;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v1

    invoke-interface {v1, v0}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method
