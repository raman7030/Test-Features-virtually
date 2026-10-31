.class public final synthetic Ll/ۜۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

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
    iput p1, p0, Ll/ۜۛᩳ;->᩸:I

    iput-object p2, p0, Ll/ۜۛᩳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۜۛᩳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V
    .locals 1

    const/4 v0, 0x2

    .line 0
    iput v0, p0, Ll/ۜۛᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۛᩳ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۜۛᩳ;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/ۜۛᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۜۛᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/֡ۚۢ;

    .line 11
    iget-object v1, p0, Ll/ۜۛᩳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/lang/Runnable;

    .line 188
    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 189
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 190
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۜۛᩳ;->᩶:Ljava/lang/Object;

    check-cast v0, Landroid/view/MenuItem;

    iget-object v1, p0, Ll/ۜۛᩳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/۫ۨᩳ;

    .line 228
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۛ֫()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 227
    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ۜۛᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֡۫֫;

    iget-object v1, p0, Ll/ۜۛᩳ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/֨۫֫;

    invoke-static {v0, v1}, Ll/֡۫֫;->ۧ(Ll/֡۫֫;Ll/֨۫֫;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Ll/ۜۛᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۫ۨᩳ;

    iget-object v1, p0, Ll/ۜۛᩳ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/۟᩺ᩳ;

    invoke-static {v0, v1}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;)V

    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
