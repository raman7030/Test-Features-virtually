.class public final synthetic Ll/۠᩷ܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠᩷ܳ;->᩸:I

    iput-object p2, p0, Ll/۠᩷ܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/۠᩷ܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 2
    iget v0, p0, Ll/۠᩷ܳ;->᩸:I

    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Ll/۠᩷ܳ;->᩶:Ljava/lang/Object;

    .line 7
    iget-object v3, p0, Ll/۠᩷ܳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 12
    check-cast v3, Ll/ۤۛ᩷;

    .line 14
    check-cast v2, Landroid/app/Activity;

    .line 15
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, v2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v4, 0x7f120b7b

    .line 16
    invoke-virtual {v0, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const-string v6, "1000+"

    aput-object v6, v5, v1

    const v6, 0x7f120618

    .line 17
    invoke-virtual {v2, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    .line 18
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Z)V

    new-instance v1, Ll/᩸֨᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v3}, Ll/᩸֨᩷;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f1209df

    .line 19
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۜ۬᩻;

    invoke-direct {v1, v4, v3}, Ll/ۜ۬᩻;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f120151

    .line 23
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 27
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 0
    :pswitch_0
    check-cast v3, Ll/ܿۛ᩷;

    check-cast v2, Ll/᩵ۨ᩷;

    invoke-static {v3, v2}, Ll/ܿۛ᩷;->֫(Ll/ܿۛ᩷;Ll/᩵ۨ᩷;)V

    return-void

    :pswitch_1
    check-cast v3, Ll/֡۫֫;

    check-cast v2, Ljava/lang/Exception;

    invoke-static {v3, v2}, Ll/֡۫֫;->֫(Ll/֡۫֫;Ljava/lang/Exception;)V

    return-void

    :pswitch_2
    check-cast v3, Ll/ܽۢܳ;

    check-cast v2, Ll/֡᩷ܳ;

    .line 748
    invoke-virtual {v3}, Ll/ܽۢܳ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 749
    new-instance v0, Ll/۠᩷ܳ;

    invoke-direct {v0, v1, v3, v2}, Ll/۠᩷ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0x64

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    goto :goto_0

    .line 752
    :cond_0
    invoke-virtual {v2}, Ll/֡᩷ܳ;->run()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
