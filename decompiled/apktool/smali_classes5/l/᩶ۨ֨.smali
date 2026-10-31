.class public final synthetic Ll/᩶ۨ֨;
.super Ljava/lang/Object;
.source "Y7SB"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶ۨ֨;->᩸:I

    iput-object p2, p0, Ll/᩶ۨ֨;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/᩶ۨ֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩶ۨ֨;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۙܰ֨;

    .line 11
    check-cast p1, Ll/᩹᩵۠;

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1005
    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/᩶ۨ֨;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۛ֡֨;

    check-cast p1, Ll/ۖܶ۠;

    invoke-virtual {v0, p1}, Ll/ۛ֡֨;->ܿ(Ll/ۖܶ۠;)V

    return-void

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
