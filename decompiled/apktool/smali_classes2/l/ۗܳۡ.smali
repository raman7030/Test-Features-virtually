.class public final synthetic Ll/ۗܳۡ;
.super Ljava/lang/Object;
.source "H1KB"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗܳۡ;->᩸:I

    iput-object p2, p0, Ll/ۗܳۡ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۗܳۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۗܳۡ;->᩹:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/Consumer;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۗܳۡ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܰܳۡ;

    invoke-static {v0, p1}, Ll/ܰܳۡ;->֫(Ll/ܰܳۡ;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
