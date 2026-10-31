.class public final synthetic Ll/ۘۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘۗܳ;->᩸:I

    iput-object p2, p0, Ll/ۘۗܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۘۗܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۧᩴۡ;Ll/ۗܺ᩷;Ljava/util/List;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/ۘۗܳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۘۗܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۘۗܳ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ۘۗܳ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/ۘۗܳ;->᩶:Ljava/lang/Object;

    .line 6
    iget-object v1, p0, Ll/ۘۗܳ;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 11
    check-cast v1, Ll/ۗܺ᩷;

    .line 13
    check-cast v0, Ljava/util/List;

    .line 16
    invoke-static {v1, v0}, Ll/ۧᩴۡ;->ۧ(Ll/ۗܺ᩷;Ljava/util/List;)V

    return-void

    .line 19
    :pswitch_0
    check-cast v1, Ll/ܿۛ᩷;

    .line 21
    check-cast v0, Ljava/io/IOException;

    .line 23
    sget p1, Ll/ܿۛ᩷;->ۛۧ:I

    .line 903
    invoke-static {v0}, Ll/ᩴۗܿ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f120309

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 323
    invoke-static {v1, p1, v0, v2, v2}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ۜۨܽ;

    check-cast v0, Ll/֡ۚۢ;

    .line 455
    invoke-interface {v1}, Ll/᩻ۨܽ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 458
    :cond_0
    invoke-interface {v1}, Ll/ۜۨܽ;->ۧ()Ll/ۨۧᩳ;

    .line 459
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
