.class public final synthetic Ll/ۛ᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩷ᩳ;->᩸:I

    iput-object p2, p0, Ll/ۛ᩷ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 2
    iget v0, p0, Ll/ۛ᩷ᩳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۛ᩷ᩳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Landroid/widget/ImageView;

    const/16 v0, 0x8

    .line 123
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ljava/lang/String;

    const/16 v0, 0xb

    new-array v2, v0, [I

    .line 161
    fill-array-data v2, :array_0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 162
    aget v4, v2, v3

    int-to-long v4, v4

    .line 163
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    const/16 v4, 0x1070

    .line 153
    invoke-static {v4}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v4

    .line 154
    invoke-virtual {v4, v1}, Ll/ᩳᩴۡ;->ۧ(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v4}, Ll/ᩳᩴۡ;->ᩳ()Ll/᩻ᩴۡ;

    move-result-object v4

    const-string v5, "requestNeedLogin(...)"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    invoke-virtual {v4}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 166
    invoke-static {}, Ll/ܰۜۡ;->֫()V

    .line 167
    sget-object v0, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 169
    :cond_0
    invoke-virtual {v4}, Ll/᩻ᩴۡ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    sget v0, Ll/ܺܶۜ;->۬ۧ:I

    const/4 v0, 0x1

    .line 524
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    .line 0
    :pswitch_2
    check-cast v1, Ll/ۗܺ᩷;

    const-string v0, "def_sign_key_warn"

    const v2, 0x7f120235

    .line 343
    invoke-static {v2, v1, v0}, Ll/ۧۛܿ;->ۧ(ILl/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_3
    check-cast v1, Ll/ۙ֫ܿ;

    invoke-virtual {v1}, Ll/ۙ֫ܿ;->close()V

    return-void

    :pswitch_4
    check-cast v1, Ll/۠֨ۧ;

    invoke-static {v1}, Ll/۠֨ۧ;->ۧ(Ll/۠֨ۧ;)V

    return-void

    :pswitch_5
    check-cast v1, Ll/۟۫ᩳ;

    invoke-virtual {v1}, Ll/۟۫ᩳ;->ܽ()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 4
        0x1f4
        0x1f4
        0x1f4
        0x1f4
        0x3e8
        0x3e8
        0x3e8
        0x3e8
        0x3e8
        0x7d0
        0x7d0
    .end array-data
.end method
