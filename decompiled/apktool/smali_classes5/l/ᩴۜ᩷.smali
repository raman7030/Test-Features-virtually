.class public final Ll/ᩴۜ᩷;
.super Ljava/lang/Object;
.source "57RA"

# interfaces
.implements Lbin/mt/plugin/api/ui/dialog/PluginDialog;


# instance fields
.field public ֫:Ll/ۨۜ᩷;

.field public ۧ:Ll/֡ۚۢ;

.field public volatile ܳ:Ll/ܿۜ᩷;

.field public volatile ܽ:Ll/ܿۜ᩷;

.field public final ܿ:Ll/ᩳۢ᩷;

.field public volatile ᩳ:Ll/ܿۜ᩷;


# direct methods
.method public constructor <init>(Ll/ᩳۢ᩷;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/ᩴۜ᩷;->ܿ:Ll/ᩳۢ᩷;

    return-void
.end method

.method public static ֫(Lbin/mt/plugin/api/ui/PluginView;)Landroid/widget/ScrollView;
    .locals 4

    .line 157
    check-cast p0, Ll/۟ۜ᩷;

    .line 42
    iget-object p0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 158
    new-instance v0, Landroid/widget/ScrollView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 159
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 160
    invoke-virtual {v0, p0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method private ֫(Landroid/widget/Button;)Lbin/mt/plugin/api/ui/PluginViewGroup;
    .locals 3

    .line 57
    iget-object v0, p0, Ll/ᩴۜ᩷;->֫:Ll/ۨۜ᩷;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Ll/ۨۜ᩷;

    iget-object v1, p0, Ll/ᩴۜ᩷;->ܿ:Ll/ᩳۢ᩷;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۨۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 46
    iput-object p1, v0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 60
    iput-object v0, p0, Ll/ᩴۜ᩷;->֫:Ll/ۨۜ᩷;

    .line 62
    :cond_0
    iget-object p1, p0, Ll/ᩴۜ᩷;->֫:Ll/ۨۜ᩷;

    return-object p1
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->cancel()V

    return-void
.end method

.method public final dismiss()V
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public final getNegativeButton()Lbin/mt/plugin/api/ui/PluginButton;
    .locals 6

    .line 88
    iget-object v0, p0, Ll/ᩴۜ᩷;->ܽ:Ll/ܿۜ᩷;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Ll/ᩴۜ᩷;->ܽ:Ll/ܿۜ᩷;

    return-object v0

    .line 91
    :cond_0
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 96
    :cond_1
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    monitor-enter v0

    .line 97
    :try_start_0
    iget-object v2, p0, Ll/ᩴۜ᩷;->ܽ:Ll/ܿۜ᩷;

    if-eqz v2, :cond_2

    .line 98
    iget-object v1, p0, Ll/ᩴۜ᩷;->ܽ:Ll/ܿۜ᩷;

    monitor-exit v0

    return-object v1

    .line 100
    :cond_2
    new-instance v2, Ll/ܿۜ᩷;

    iget-object v3, p0, Ll/ᩴۜ᩷;->ܿ:Ll/ᩳۢ᩷;

    invoke-direct {p0, v1}, Ll/ᩴۜ᩷;->֫(Landroid/widget/Button;)Lbin/mt/plugin/api/ui/PluginViewGroup;

    move-result-object v4

    sget-object v5, Lbin/mt/plugin/api/ui/PluginButton$Style;->DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-direct {v2, v3, v4, v5}, Ll/ܿۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Lbin/mt/plugin/api/ui/PluginButton$Style;)V

    .line 46
    iput-object v1, v2, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 102
    iput-object v2, p0, Ll/ᩴۜ᩷;->ܽ:Ll/ܿۜ᩷;

    .line 103
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 104
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getNeutralButton()Lbin/mt/plugin/api/ui/PluginButton;
    .locals 6

    .line 109
    iget-object v0, p0, Ll/ᩴۜ᩷;->ᩳ:Ll/ܿۜ᩷;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Ll/ᩴۜ᩷;->ᩳ:Ll/ܿۜ᩷;

    return-object v0

    .line 112
    :cond_0
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 117
    :cond_1
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    monitor-enter v0

    .line 118
    :try_start_0
    iget-object v2, p0, Ll/ᩴۜ᩷;->ᩳ:Ll/ܿۜ᩷;

    if-eqz v2, :cond_2

    .line 119
    iget-object v1, p0, Ll/ᩴۜ᩷;->ᩳ:Ll/ܿۜ᩷;

    monitor-exit v0

    return-object v1

    .line 121
    :cond_2
    new-instance v2, Ll/ܿۜ᩷;

    iget-object v3, p0, Ll/ᩴۜ᩷;->ܿ:Ll/ᩳۢ᩷;

    invoke-direct {p0, v1}, Ll/ᩴۜ᩷;->֫(Landroid/widget/Button;)Lbin/mt/plugin/api/ui/PluginViewGroup;

    move-result-object v4

    sget-object v5, Lbin/mt/plugin/api/ui/PluginButton$Style;->DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-direct {v2, v3, v4, v5}, Ll/ܿۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Lbin/mt/plugin/api/ui/PluginButton$Style;)V

    .line 46
    iput-object v1, v2, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 123
    iput-object v2, p0, Ll/ᩴۜ᩷;->ᩳ:Ll/ܿۜ᩷;

    .line 124
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 125
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ᩴۜ᩷;->ܿ:Ll/ᩳۢ᩷;

    return-object v0
.end method

.method public final getPositiveButton()Lbin/mt/plugin/api/ui/PluginButton;
    .locals 6

    .line 67
    iget-object v0, p0, Ll/ᩴۜ᩷;->ܳ:Ll/ܿۜ᩷;

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Ll/ᩴۜ᩷;->ܳ:Ll/ܿۜ᩷;

    return-object v0

    .line 70
    :cond_0
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_1
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    monitor-enter v0

    .line 76
    :try_start_0
    iget-object v2, p0, Ll/ᩴۜ᩷;->ܳ:Ll/ܿۜ᩷;

    if-eqz v2, :cond_2

    .line 77
    iget-object v1, p0, Ll/ᩴۜ᩷;->ܳ:Ll/ܿۜ᩷;

    monitor-exit v0

    return-object v1

    .line 79
    :cond_2
    new-instance v2, Ll/ܿۜ᩷;

    iget-object v3, p0, Ll/ᩴۜ᩷;->ܿ:Ll/ᩳۢ᩷;

    invoke-direct {p0, v1}, Ll/ᩴۜ᩷;->֫(Landroid/widget/Button;)Lbin/mt/plugin/api/ui/PluginViewGroup;

    move-result-object v4

    sget-object v5, Lbin/mt/plugin/api/ui/PluginButton$Style;->DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-direct {v2, v3, v4, v5}, Ll/ܿۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Lbin/mt/plugin/api/ui/PluginButton$Style;)V

    .line 46
    iput-object v1, v2, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 81
    iput-object v2, p0, Ll/ᩴۜ᩷;->ܳ:Ll/ܿۜ᩷;

    .line 82
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 83
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final isShowing()Z
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    return v0
.end method

.method public final setCancelable(Z)V
    .locals 1

    .line 176
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Z)V

    return-void
.end method

.method public final setMessage(Ljava/lang/CharSequence;)V
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p0, p1}, Ll/ᩴۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setNegativeButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V
    .locals 2

    .line 136
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p0, p1}, Ll/ᩴۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 137
    :cond_0
    new-instance v1, Ll/᩷ۜ᩷;

    invoke-direct {v1, p0, p2}, Ll/᩷ۜ᩷;-><init>(Ll/ᩴۜ᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V

    move-object p2, v1

    :goto_0
    const/4 v1, -0x2

    .line 136
    invoke-virtual {v0, v1, p1, p2}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public final setNeutralButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V
    .locals 3

    .line 142
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p0, p1}, Ll/ᩴۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 143
    :cond_0
    new-instance v1, Ll/ۘۜ᩷;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, p2}, Ll/ۘۜ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v1

    :goto_0
    const/4 v1, -0x3

    .line 142
    invoke-virtual {v0, v1, p1, p2}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public final setOnCancelListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnCancelListener;)V
    .locals 2

    .line 181
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ۢۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/ۢۜ᩷;-><init>(Ll/ᩴۜ᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnCancelListener;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method

.method public final setOnDismissListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnDismissListener;)V
    .locals 2

    .line 186
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ܺۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/ܺۜ᩷;-><init>(Ll/ᩴۜ᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnDismissListener;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final setOnKeyListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;)V
    .locals 2

    .line 196
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ۡۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/ۡۜ᩷;-><init>(Ll/ᩴۜ᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public final setOnShowListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;)V
    .locals 2

    .line 191
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ۖۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/ۖۜ᩷;-><init>(Ll/ᩴۜ᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnShowListener;)V

    return-void
.end method

.method public final setPositiveButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V
    .locals 3

    .line 130
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p0, p1}, Ll/ᩴۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 131
    :cond_0
    new-instance v1, Ll/ۚ۟ܳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, p2}, Ll/ۚ۟ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v1

    :goto_0
    const/4 v1, -0x1

    .line 130
    invoke-virtual {v0, v1, p1, p2}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p0, p1}, Ll/ᩴۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setView(Lbin/mt/plugin/api/ui/PluginView;)V
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-static {p1}, Ll/ᩴۜ᩷;->֫(Lbin/mt/plugin/api/ui/PluginView;)Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public final show()V
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    return-void
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
    iget-object v1, p0, Ll/ᩴۜ᩷;->ܿ:Ll/ᩳۢ᩷;

    invoke-virtual {v1}, Ll/ᩳۢ᩷;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v1

    invoke-interface {v1, v0}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/֡ۚۢ;)V
    .locals 0

    .line 32
    iput-object p1, p0, Ll/ᩴۜ᩷;->ۧ:Ll/֡ۚۢ;

    .line 33
    invoke-static {p1}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    return-void
.end method
