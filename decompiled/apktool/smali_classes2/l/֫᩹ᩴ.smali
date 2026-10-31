.class public final synthetic Ll/֫᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Consumer;I)V
    .locals 0

    iput p2, p0, Ll/֫᩹ᩴ;->a:I

    iput-object p1, p0, Ll/֫᩹ᩴ;->b:Ljava/util/function/Consumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ll/֫᩹ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/Map$Entry;

    .line 673
    new-instance v0, Ll/ܶۨᩴ;

    invoke-direct {v0, p1}, Ll/ܶۨᩴ;-><init>(Ljava/util/Map$Entry;)V

    iget-object p1, p0, Ll/֫᩹ᩴ;->b:Ljava/util/function/Consumer;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/֫᩹ᩴ;->b:Ljava/util/function/Consumer;

    .line 81
    invoke-static {p1}, Ll/᩺ۚᩴ;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/֫᩹ᩴ;->b:Ljava/util/function/Consumer;

    .line 124
    invoke-static {p1}, Ll/᩺ۚᩴ;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 1

    iget v0, p0, Ll/֫᩹ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
