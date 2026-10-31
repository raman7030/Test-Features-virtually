.class public final synthetic Ll/᩻ܶ᩷;
.super Ljava/lang/Object;
.source "09LR"

# interfaces
.implements Ll/᩵᩹᩷;
.implements Ll/ᩴܺܳ;
.implements Ll/ۖۛۡ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/۬֡ܿ;
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ܶ᩷;->᩸:I

    iput-object p2, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۟ᩳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public ֫(Landroid/content/Intent;I)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/᩹ܶᩳ;

    invoke-static {p1, p2}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;I)V

    return-void
.end method

.method public ֫(Ll/ۛ֡֨;)V
    .locals 1

    .line 0
    iget v0, p0, Ll/᩻ܶ᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۗܰ֨;

    invoke-static {v0, p1}, Ll/ۗܰ֨;->ۧ(Ll/ۗܰ֨;Ll/ۛ֡֨;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۚ֨;

    invoke-static {v0, p1}, Ll/᩷ۚ֨;->֫(Ll/᩷ۚ֨;Ll/ۛ֡֨;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۢ֫᩷;

    .line 507
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object p1

    .line 508
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۢ֫᩷;->֫(Ljava/io/BufferedOutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 509
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 507
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢܳ;

    invoke-static {v0, p1}, Ll/᩵ܺܳ;->֫(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public synthetic ܽ()Z
    .locals 1

    .line 0
    iget v0, p0, Ll/᩻ܶ᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method
