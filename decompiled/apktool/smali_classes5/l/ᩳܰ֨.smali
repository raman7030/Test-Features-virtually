.class public final synthetic Ll/ᩳܰ֨;
.super Ljava/lang/Object;
.source "T7LF"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳܰ֨;->᩸:I

    iput-object p2, p0, Ll/ᩳܰ֨;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ᩳܰ֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ᩳܰ֨;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩵ۘ֡;

    invoke-virtual {v0, p1}, Ll/᩵ۘ֡;->ܽ(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ᩳܰ֨;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۗܰ֨;

    check-cast p1, Ljava/util/Set;

    invoke-static {v0, p1}, Ll/ۗܰ֨;->֫(Ll/ۗܰ֨;Ljava/util/Set;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
