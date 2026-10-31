.class public final synthetic Ll/ۘۢܳ;
.super Ljava/lang/Object;
.source "I29D"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘۢܳ;->᩸:I

    iput-object p2, p0, Ll/ۘۢܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۘۢܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۘۢܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܽۧ᩻;

    .line 12
    invoke-static {v0}, Ll/ܽۧ᩻;->֫(Ll/ܽۧ᩻;)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/ۘۢܳ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/ᩳ᩷ܳ;

    .line 20
    invoke-interface {v0}, Ll/ᩳ᩷ܳ;->cancel()V

    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, Ll/ۘۢܳ;->᩹:Ljava/lang/Object;

    .line 25
    check-cast v0, Ll/ܽ֨ۧ;

    .line 28
    invoke-virtual {v0}, Ll/ܽ֨ۧ;->֫()V

    return-void

    .line 31
    :pswitch_2
    iget-object v0, p0, Ll/ۘۢܳ;->᩹:Ljava/lang/Object;

    .line 33
    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    const/16 v1, 0x384

    .line 98
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
