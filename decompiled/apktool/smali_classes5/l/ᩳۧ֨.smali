.class public final synthetic Ll/ᩳۧ֨;
.super Ljava/lang/Object;
.source "FBFP"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۢܽ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۢܽ֨;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ᩳۧ֨;->᩸:I

    iput-object p1, p0, Ll/ᩳۧ֨;->᩹:Ll/ۢܽ֨;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ᩳۧ֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ᩳۧ֨;->᩹:Ll/ۢܽ֨;

    .line 9
    check-cast v0, Ll/ۗᩳ֨;

    .line 11
    check-cast p1, Ll/᩹ᩳ֨;

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    invoke-virtual {p1}, Ll/᩹ᩳ֨;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p1}, Ll/ۢܽ֨;->ᩳ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ᩳۧ֨;->᩹:Ll/ۢܽ֨;

    check-cast v0, Ll/᩷ۧ֨;

    check-cast p1, Ljava/lang/Integer;

    .line 649
    iget-object v0, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
