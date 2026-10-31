.class public final synthetic Ll/ܳ᩻ۢ;
.super Ljava/lang/Object;
.source "K14B"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳ᩻ۢ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۧᩴۡ;)V
    .locals 0

    const/4 p1, 0x1

    .line 0
    iput p1, p0, Ll/ܳ᩻ۢ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/ܳ᩻ۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/֫ܿ֨;

    .line 10
    invoke-static {p1}, Ll/֫ܿ֨;->ܽ(Ll/֫ܿ֨;)V

    return-void

    .line 13
    :pswitch_0
    check-cast p1, Ll/ۗܺ᩷;

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    sget v0, Ll/ۧᩴۡ;->ܿ:I

    .line 352
    new-instance v0, Ll/۬۬ܿ;

    const v1, 0x7f120528

    invoke-direct {v0, p1, v1}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v0}, Ll/۬۬ܿ;->ܳ()V

    .line 353
    new-instance v1, Ll/ᩴۘۡ;

    invoke-direct {v1, v0}, Ll/ᩴۘۡ;-><init>(Ll/۬۬ܿ;)V

    .line 627
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Ll/۬֨ۡ;

    invoke-direct {v2, p1, v1}, Ll/۬֨ۡ;-><init>(Landroid/app/Activity;Ll/ۢ۠ۡ;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    .line 0
    :pswitch_1
    check-cast p1, Ll/ܿۛ᩷;

    const v0, 0x7f0d0049

    .line 175
    invoke-virtual {p1, v0}, Ll/ܿۛ᩷;->ܿ(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
