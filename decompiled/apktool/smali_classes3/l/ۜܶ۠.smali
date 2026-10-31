.class public final synthetic Ll/ۜܶ۠;
.super Ljava/lang/Object;
.source "L42O"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۜܶ۠;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۜܶ۠;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/᩵֡ᩴ;

    .line 10
    invoke-virtual {p1, p2}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    return-void

    .line 13
    :pswitch_0
    check-cast p1, Ll/ᩴܶ۠;

    .line 227
    invoke-virtual {p1, p2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
