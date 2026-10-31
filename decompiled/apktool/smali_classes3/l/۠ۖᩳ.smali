.class public final Ll/۠ۖᩳ;
.super Ll/۟ܶۡ;
.source "Q649"


# instance fields
.field public final ۜ:Ll/ۡ᩹ۡ;

.field public final synthetic ۢ:Ljava/lang/String;

.field public ܳ:Ll/۟᩸ᩳ;

.field public final synthetic ᩷:Ll/ܶۖᩳ;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶۖᩳ;Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Ll/۠ۖᩳ;->᩷:Ll/ܶۖᩳ;

    iput-object p2, p0, Ll/۠ۖᩳ;->ۢ:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 121
    invoke-static {p1}, Ll/ۡ᩹ۡ;->֫(Ll/᩻ۡ֫;)Ll/ۡ᩹ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۖᩳ;->ۜ:Ll/ۡ᩹ۡ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 139
    iget-object v0, p0, Ll/۠ۖᩳ;->᩷:Ll/ܶۖᩳ;

    invoke-static {v0}, Ll/ܶۖᩳ;->ܽ(Ll/ܶۖᩳ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    iget-object v2, p0, Ll/۠ۖᩳ;->ۢ:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 140
    invoke-static {v0, v2}, Ll/ܶۖᩳ;->֫(Ll/ܶۖᩳ;Ljava/lang/String;)V

    goto :goto_0

    .line 142
    :cond_0
    invoke-static {v2}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܶۖᩳ;->ۧ(Ll/ܶۖᩳ;Ljava/lang/String;)V

    .line 143
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v3, "text_viewer_save_as_path"

    invoke-static {v0}, Ll/ܶۖᩳ;->ᩳ(Ll/ܶۖᩳ;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    .line 145
    :goto_0
    iget-object v1, p0, Ll/۠ۖᩳ;->ۜ:Ll/ۡ᩹ۡ;

    invoke-virtual {v1}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v3, 0x7f1203a4

    .line 146
    invoke-virtual {v0, v3, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 147
    sget v3, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v3, Ll/᩵ۚۢ;

    invoke-direct {v3, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v4, 0x7f120491

    .line 148
    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 149
    invoke-virtual {v3, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const v1, 0x7f120189

    const/4 v4, 0x0

    .line 150
    invoke-virtual {v3, v1, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 151
    invoke-static {v0}, Ll/ܶۖᩳ;->ܿ(Ll/ܶۖᩳ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    new-instance v0, Ll/֨ۖᩳ;

    invoke-direct {v0, p0, v2}, Ll/֨ۖᩳ;-><init>(Ll/۠ۖᩳ;Ljava/lang/String;)V

    const v1, 0x7f120530

    invoke-virtual {v3, v1, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 154
    :cond_2
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 159
    iget-object v0, p0, Ll/۠ۖᩳ;->ۜ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 160
    :cond_0
    iget-object v0, p0, Ll/۠ۖᩳ;->᩷:Ll/ܶۖᩳ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 125
    iget-object v0, p0, Ll/۠ۖᩳ;->᩷:Ll/ܶۖᩳ;

    invoke-static {v0}, Ll/ܶۖᩳ;->ܳ(Ll/ܶۖᩳ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v1

    iput-object v1, p0, Ll/۠ۖᩳ;->ܳ:Ll/۟᩸ᩳ;

    .line 126
    invoke-static {v0}, Ll/ܶۖᩳ;->ܳ(Ll/ܶۖᩳ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹֫()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/۠ۖᩳ;->᩻:Ljava/lang/String;

    const v1, 0x7f1208d2

    .line 127
    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 132
    iget-object v0, p0, Ll/۠ۖᩳ;->ܳ:Ll/۟᩸ᩳ;

    .line 133
    :try_start_0
    iget-object v1, p0, Ll/۠ۖᩳ;->ۢ:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    iget-object v2, p0, Ll/۠ۖᩳ;->᩻:Ljava/lang/String;

    sget v3, Ll/ܳ᩷ܽ;->᩵:I

    invoke-static {v1, v0, v2, v3}, Ll/֨᩸ᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 134
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    .line 132
    :try_start_1
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
.end method

.method public final ᩳ()V
    .locals 1

    .line 165
    iget-object v0, p0, Ll/۠ۖᩳ;->ܳ:Ll/۟᩸ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    .line 166
    :cond_0
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
