.class public final synthetic Ll/ܶܰۚ;
.super Ljava/lang/Object;
.source "64JA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶܰۚ;->᩸:I

    iput-object p2, p0, Ll/ܶܰۚ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ܶܰۚ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ܶܰۚ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 11
    check-cast p1, Ll/֫ۨۚ;

    .line 14
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 17
    :pswitch_0
    check-cast v1, Ll/ۨܰۚ;

    .line 19
    check-cast p1, Ll/ܺۤۚ;

    .line 2428
    iget-object v0, v1, Ll/ۨܰۚ;->᩻:Ll/ܰ۫ۚ;

    iget-object v0, v0, Ll/ܰ۫ۚ;->ᩴ:Ll/᩺۫ۚ;

    sget-object v1, Ll/ۨ۫ۚ;->᩶:Ll/ۨ۫ۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    iget-object v0, v0, Ll/᩺۫ۚ;->֫:Ll/ۜۗۚ;

    iput-object p1, v0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

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
