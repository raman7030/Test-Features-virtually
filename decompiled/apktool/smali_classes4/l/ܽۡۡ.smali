.class public final synthetic Ll/ܽۡۡ;
.super Ljava/lang/Object;
.source "P9S5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽۡۡ;->᩸:I

    iput-object p2, p0, Ll/ܽۡۡ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ܽۡۡ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/ܽۡۡ;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/۬ۗܿ;

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ll/ۗܺ᩷;

    .line 266
    new-instance p1, Landroid/content/Intent;

    const-class v1, Ll/ܶ֨ܿ;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 267
    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v0, Ll/᩶ۖᩳ;

    sget p1, Ll/᩶ۖᩳ;->᩻ۧ:I

    .line 46
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_2
    check-cast v0, Ll/᩻ۡۡ;

    sget p1, Ll/᩻ۡۡ;->֫֫:I

    .line 182
    invoke-virtual {v0}, Ll/᩻ۡۡ;->ܽ()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    .line 183
    invoke-virtual {v0, p1}, Ll/᩻ۡۡ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 274
    invoke-virtual {v0, p1}, Ll/᩻ۡۡ;->ۧ(Z)V

    goto :goto_0

    .line 186
    :cond_0
    invoke-virtual {v0}, Ll/᩻ۡۡ;->ۧ()V

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
