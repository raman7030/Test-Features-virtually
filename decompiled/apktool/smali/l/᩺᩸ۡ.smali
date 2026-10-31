.class public final synthetic Ll/᩺᩸ۡ;
.super Ljava/lang/Object;
.source "X5CP"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/᩺᩸ۡ;->᩸:I

    iput-object p1, p0, Ll/᩺᩸ۡ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩺᩸ۡ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩺᩸ۡ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩺᩸ۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩺᩸ۡ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܽۢܳ;

    .line 11
    iget-object v1, p0, Ll/᩺᩸ۡ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    iget-object v2, p0, Ll/᩺᩸ۡ;->ۙ:Ljava/lang/Object;

    .line 17
    check-cast v2, Ll/ᩳۜܳ;

    .line 20
    invoke-static {v0, v1, v2, p1, p2}, Ll/᩵ܺܳ;->֫(Ll/ܽۢܳ;Ljava/util/ArrayList;Ll/ᩳۜܳ;Landroid/content/DialogInterface;I)V

    return-void

    .line 23
    :pswitch_0
    iget-object p1, p0, Ll/᩺᩸ۡ;->᩹:Ljava/lang/Object;

    .line 25
    check-cast p1, Lbin/mt/plus/Main;

    .line 27
    iget-object v0, p0, Ll/᩺᩸ۡ;->᩶:Ljava/lang/Object;

    .line 29
    check-cast v0, [Ljava/lang/String;

    .line 31
    iget-object v1, p0, Ll/᩺᩸ۡ;->ۙ:Ljava/lang/Object;

    .line 33
    check-cast v1, Ll/֫᩹ۡ;

    const/4 v2, -0x1

    if-ne p2, v2, :cond_0

    const/16 p2, 0x5c7e

    .line 61
    invoke-static {p1, v0, p2}, Ll/ᩴ᩹;->֫(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    .line 63
    :cond_0
    invoke-interface {v1}, Ll/֫᩹ۡ;->֫()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
