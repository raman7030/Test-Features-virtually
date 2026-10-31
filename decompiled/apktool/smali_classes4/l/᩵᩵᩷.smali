.class public final synthetic Ll/᩵᩵᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/᩵᩵᩷;->᩸:I

    iput-object p1, p0, Ll/᩵᩵᩷;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩵᩵᩷;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩵᩵᩷;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 2
    iget p1, p0, Ll/᩵᩵᩷;->᩸:I

    .line 4
    iget-object v0, p0, Ll/᩵᩵᩷;->ۙ:Ljava/lang/Object;

    .line 6
    iget-object v1, p0, Ll/᩵᩵᩷;->᩶:Ljava/lang/Object;

    .line 8
    iget-object v2, p0, Ll/᩵᩵᩷;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 13
    check-cast v2, Ll/ᩳۜܳ;

    .line 15
    check-cast v1, Ll/ۖۢܳ;

    .line 17
    check-cast v0, Ll/۬ۗܿ;

    .line 147
    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    .line 148
    invoke-static {p1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    const/4 v4, 0x4

    .line 0
    invoke-static {v4, v2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v4, v2, [Ljava/lang/String;

    .line 149
    invoke-static {p1, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 151
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    .line 153
    :try_start_0
    invoke-virtual {v1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v2, Ll/۟ۜᩳ;

    check-cast v1, Landroid/widget/EditText;

    check-cast v0, Landroid/widget/EditText;

    .line 109
    invoke-virtual {v2}, Ll/۟ۜᩳ;->ܽ()V

    .line 110
    iget-object p1, v2, Ll/۟ۜᩳ;->ܿ:Ljava/lang/String;

    iget-object v2, v2, Ll/۟ۜᩳ;->ܳ:Ljava/lang/String;

    invoke-static {p1, v2, v1, v0}, Ll/֫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/widget/EditText;Landroid/widget/EditText;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v2, Ll/ۡۤۡ;

    check-cast v1, Ll/᩵֡᩷;

    check-cast v0, Ll/᩵᩷ۡ;

    invoke-static {v2, v1, v0}, Ll/᩵֡᩷;->֫(Ll/ۡۤۡ;Ll/᩵֡᩷;Ll/᩵᩷ۡ;)V

    return-void

    .line 153
    :goto_0
    :try_start_1
    sget-object v6, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    invoke-static {v4, v6}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_1
    .catch Ll/֫ۛۡ; {:try_start_1 .. :try_end_1} :catch_0

    const-string v4, ".tmp"

    .line 899
    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 159
    invoke-virtual {p1, v4}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 160
    invoke-virtual {v3, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 161
    invoke-virtual {v4, v3}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    .line 163
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v6

    .line 164
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7

    new-array v8, v5, [Ljava/lang/Object;

    aput-object v7, v8, v2

    const v2, 0x7f1208ba

    invoke-static {v2, v8}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "restore_backup"

    .line 163
    invoke-static {v6, v7, v2, v5}, Ll/ۧۛܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_1
    move v2, v4

    goto :goto_2

    :catch_0
    move-exception p1

    .line 155
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_4

    .line 165
    :cond_2
    invoke-virtual {v3, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v2, 0x1

    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    .line 169
    sget v2, Ll/ܳۤܳ;->֫:I

    .line 213
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 217
    invoke-static {v2, v5}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 213
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 217
    invoke-static {v2, v5}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 171
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۖۢܳ;->ܽ(Ljava/lang/String;)V

    .line 172
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 173
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    goto :goto_3

    :cond_4
    const p1, 0x7f120881

    .line 175
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 177
    :goto_3
    invoke-virtual {v0}, Ll/۬ۗܿ;->ۧ()V

    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
