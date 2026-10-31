.class public final synthetic Ll/ۨ᩶֨;
.super Ljava/lang/Object;
.source "F416"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨ᩶֨;->᩸:I

    iput-object p2, p0, Ll/ۨ᩶֨;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۨ᩶֨;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    iget v0, p0, Ll/ۨ᩶֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 3

    .line 2
    iget v0, p0, Ll/ۨ᩶֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۨ᩶֨;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۨۧ۠;

    .line 11
    iget-object v1, p0, Ll/ۨ᩶֨;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/ۖܶ۠;

    .line 4837
    iget-object v0, v0, Ll/ۨۧ۠;->ܽ:Ll/ۛۧ۠;

    invoke-virtual {v0, p1, v1}, Ll/ۛۧ۠;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۨ᩶֨;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۢۗ֨;

    iget-object v1, p0, Ll/ۨ᩶֨;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    check-cast p1, Ll/ۙ֨֨;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    sget-object v2, Ll/ۢ۠֨;->ܽ֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Ll/ۢۗ֨;->᩷֫:Ll/ۛ᩸֨;

    .line 2339
    iget-object v2, v0, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    invoke-virtual {v0, p1, v1, v2}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
