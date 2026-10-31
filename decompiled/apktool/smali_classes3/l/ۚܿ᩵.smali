.class public final synthetic Ll/ۚܿ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܳᩳ᩵;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/function/LongConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/LongConsumer;I)V
    .locals 0

    iput p2, p0, Ll/ۚܿ᩵;->a:I

    iput-object p1, p0, Ll/ۚܿ᩵;->b:Ljava/util/function/LongConsumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final synthetic a(J)V
    .locals 0

    return-void
.end method

.method private final synthetic b(J)V
    .locals 0

    return-void
.end method

.method private final synthetic e()V
    .locals 0

    return-void
.end method

.method private final synthetic g()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final synthetic accept(D)V
    .locals 0

    iget p1, p0, Ll/ۚܿ᩵;->a:I

    packed-switch p1, :pswitch_data_0

    .line 0
    invoke-static {}, Ll/ۡ᩺ᩴ;->m()V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-static {}, Ll/ۡ᩺ᩴ;->m()V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic accept(I)V
    .locals 0

    iget p1, p0, Ll/ۚܿ᩵;->a:I

    packed-switch p1, :pswitch_data_0

    .line 0
    invoke-static {}, Ll/ۡ᩺ᩴ;->t()V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    invoke-static {}, Ll/ۡ᩺ᩴ;->t()V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final accept(J)V
    .locals 1

    iget v0, p0, Ll/ۚܿ᩵;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    iget-object v0, p0, Ll/ۚܿ᩵;->b:Ljava/util/function/LongConsumer;

    check-cast v0, Ll/ۙ᩺ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ۙ᩺ᩴ;->accept(J)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۚܿ᩵;->b:Ljava/util/function/LongConsumer;

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongConsumer;->accept(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ll/ۚܿ᩵;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->s(Ll/ܳᩳ᩵;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->s(Ll/ܳᩳ᩵;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 1

    iget v0, p0, Ll/ۚܿ᩵;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic andThen(Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;
    .locals 1

    iget v0, p0, Ll/ۚܿ᩵;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/ۖۛᩴ;->$default$andThen(Ljava/util/function/LongConsumer;Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/ۖۛᩴ;->$default$andThen(Ljava/util/function/LongConsumer;Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic c(J)V
    .locals 0

    return-void
.end method

.method public final synthetic end()V
    .locals 0

    return-void
.end method

.method public final synthetic f()Z
    .locals 1

    iget v0, p0, Ll/ۚܿ᩵;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic l(Ljava/lang/Long;)V
    .locals 1

    iget v0, p0, Ll/ۚܿ᩵;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->r(Ll/ܳᩳ᩵;Ljava/lang/Long;)V

    return-void

    :pswitch_0
    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->r(Ll/ܳᩳ᩵;Ljava/lang/Long;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
