.class public final synthetic Ll/ۘ᩷ᩳ;
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
    iput p1, p0, Ll/ۘ᩷ᩳ;->᩸:I

    iput-object p2, p0, Ll/ۘ᩷ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/ۘ᩷ᩳ;->᩸:I

    const/4 v1, 0x1

    .line 5
    iget-object v2, p0, Ll/ۘ᩷ᩳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 10
    check-cast v2, Ll/ۙ֨ۘ;

    .line 12
    sget v0, Ll/ۙ֨ۘ;->ۤ:I

    .line 223
    invoke-virtual {v2}, Ll/ۙ֨ۘ;->᩷()V

    return-void

    .line 0
    :pswitch_0
    check-cast v2, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-static {v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->$r8$lambda$EVyYoVT11DpL60suE9bxns8qbCM(Lcom/google/android/material/carousel/CarouselLayoutManager;)V

    return-void

    :pswitch_1
    check-cast v2, Ll/ܰܳۡ;

    invoke-static {v2}, Ll/ܰܳۡ;->֫(Ll/ܰܳۡ;)V

    return-void

    :pswitch_2
    check-cast v2, Ll/ۛ᩷ۢ;

    sget v0, Ll/ۛ᩷ۢ;->ۚ֫:I

    .line 225
    new-instance v0, Ll/ܿۨ᩻;

    invoke-direct {v0, v1}, Ll/ܿۨ᩻;-><init>(I)V

    invoke-virtual {v2, v0}, Ll/ܳۛ᩷;->֫(Ljava/util/function/Consumer;)V

    return-void

    .line 0
    :pswitch_3
    check-cast v2, Ll/ۙۛ᩷;

    invoke-interface {v2}, Ll/ۙۛ᩷;->ᩳ()V

    return-void

    :pswitch_4
    check-cast v2, Landroid/widget/TextView;

    const/4 v0, 0x4

    .line 1735
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 0
    :pswitch_5
    check-cast v2, Ll/֡ܳܿ;

    sget v0, Ll/֡ܳܿ;->֨ۧ:I

    .line 241
    invoke-virtual {v2, v1}, Ll/֡ܳܿ;->֫(Z)V

    return-void

    .line 0
    :pswitch_6
    check-cast v2, Ll/ᩳ֫֫;

    sget v0, Ll/ᩳ֫֫;->᩶:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/4 v0, 0x0

    .line 54
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 0
    :pswitch_7
    check-cast v2, Ll/֫ۢᩳ;

    invoke-static {v2}, Ll/֫ۢᩳ;->ܽ(Ll/֫ۢᩳ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
