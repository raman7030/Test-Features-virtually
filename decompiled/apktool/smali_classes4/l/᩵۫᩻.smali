.class public final synthetic Ll/᩵۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

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
    iput p1, p0, Ll/᩵۫᩻;->᩸:I

    iput-object p2, p0, Ll/᩵۫᩻;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩵۫᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/᩵۫᩻;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩵۫᩻;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩹ܶ۠;

    .line 11
    iget-object v1, p0, Ll/᩵۫᩻;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/ۨܶ۠;

    .line 16
    invoke-static {v0, v1}, Ll/᩹ܶ۠;->֫(Ll/᩹ܶ۠;Ll/ۨܶ۠;)V

    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll/᩵۫᩻;->᩹:Ljava/lang/Object;

    .line 21
    check-cast v0, Ll/ᩳۨۡ;

    .line 23
    iget-object v1, p0, Ll/᩵۫᩻;->᩶:Ljava/lang/Object;

    .line 25
    check-cast v1, Ljava/io/InputStream;

    .line 28
    invoke-static {v0, v1}, Ll/ᩳۨۡ;->֫(Ll/ᩳۨۡ;Ljava/io/InputStream;)V

    return-void

    .line 31
    :pswitch_1
    iget-object v0, p0, Ll/᩵۫᩻;->᩹:Ljava/lang/Object;

    .line 33
    check-cast v0, Ll/ۗܺ᩷;

    .line 35
    iget-object v1, p0, Ll/᩵۫᩻;->᩶:Ljava/lang/Object;

    .line 37
    check-cast v1, Ll/ܶ᩵ܿ;

    const/4 v2, 0x0

    .line 185
    invoke-static {v0, v1, v2}, Ll/᩷֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/util/List;)V

    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/᩵۫᩻;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/᩵۫᩻;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/᩹ۧᩳ;

    .line 400
    invoke-virtual {v1}, Ll/᩹ۧᩳ;->֫()Ll/᩶ۧᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶ۧᩳ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    invoke-virtual {v1}, Ll/᩹ۧᩳ;->֫()Ll/᩶ۧᩳ;

    move-result-object v2

    sget-object v3, Ll/᩶ۧᩳ;->ܳ֫:Ll/᩶ۧᩳ;

    if-eq v2, v3, :cond_1

    .line 402
    invoke-virtual {v1}, Ll/᩹ۧᩳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Ll/᩹֡᩷;->ۘ֫:I

    goto :goto_0

    :cond_0
    sget v1, Ll/᩹֡᩷;->ᩳ֫:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    return-void

    .line 0
    :pswitch_3
    iget-object v0, p0, Ll/᩵۫᩻;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۨ۬֫;

    iget-object v1, p0, Ll/᩵۫᩻;->᩶:Ljava/lang/Object;

    check-cast v1, Landroid/media/metrics/PlaybackStateEvent;

    invoke-static {v0, v1}, Ll/ۨ۬֫;->֫(Ll/ۨ۬֫;Landroid/media/metrics/PlaybackStateEvent;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Ll/᩵۫᩻;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֡ۚۢ;

    iget-object v1, p0, Ll/᩵۫᩻;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/֡ۚۢ;

    .line 440
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 441
    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
