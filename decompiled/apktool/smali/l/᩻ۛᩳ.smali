.class public final synthetic Ll/᩻ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ۛᩳ;->᩸:I

    iput-object p2, p0, Ll/᩻ۛᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩻ۛᩳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/᩻ۛᩳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۧܽܿ;

    const/4 v0, 0x0

    .line 13
    invoke-static {v1, v0}, Ll/ۧܽܿ;->֫(Ll/ۧܽܿ;Ljava/lang/Throwable;)V

    return-void

    .line 16
    :pswitch_0
    check-cast v1, Ll/۟۫ᩳ;

    .line 18
    sget v0, Ll/۟۫ᩳ;->ۗ֫:I

    const/4 v0, 0x0

    .line 1693
    invoke-virtual {v1, v0}, Ll/۟۫ᩳ;->ۧ(Z)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/۫ۨᩳ;

    sget-object v0, Ll/۫ۨᩳ;->᩻ܿ:Landroid/text/method/TextKeyListener;

    .line 4302
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4303
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۙܽ()V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
