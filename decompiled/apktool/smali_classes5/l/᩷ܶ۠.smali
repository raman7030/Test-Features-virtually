.class public final synthetic Ll/᩷ܶ۠;
.super Ljava/lang/Object;
.source "L42O"

# interfaces
.implements Ljava/util/function/BinaryOperator;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩷ܶ۠;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Ll/᩷ܶ۠;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/᩵֡ᩴ;

    .line 9
    check-cast p2, Ll/᩵֡ᩴ;

    .line 267
    invoke-virtual {p1}, Ll/᩵֡ᩴ;->size()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Ll/᩵֡ᩴ;->֫(ILl/֫ۚᩴ;)Z

    return-object p1

    .line 0
    :pswitch_0
    check-cast p1, Ll/ᩴܶ۠;

    check-cast p2, Ll/ᩴܶ۠;

    .line 561
    invoke-virtual {p1, p2}, Ll/ᩴܶ۠;->addAll(Ljava/util/Collection;)Z

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
