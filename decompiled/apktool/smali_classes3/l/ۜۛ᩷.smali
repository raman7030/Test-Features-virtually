.class public final synthetic Ll/ۜۛ᩷;
.super Ljava/lang/Object;
.source "61KH"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۜۛ᩷;->᩸:I

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
    iget v0, p0, Ll/ۜۛ᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
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
    .locals 4

    .line 2
    iget v0, p0, Ll/ۜۛ᩷;->᩸:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    .line 8
    check-cast p1, Ll/ۡ֫ۚ;

    .line 11
    invoke-static {p1}, Ll/ۧ۫ᩴ;->nonNull(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 15
    :pswitch_0
    check-cast p1, Ll/۬۠ܿ;

    .line 47
    invoke-virtual {p1}, Ll/۬۠ܿ;->ۗۧ()Ljava/lang/String;

    move-result-object p1

    .line 0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    invoke-static {p1}, Ll/᩶۠ܿ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :pswitch_1
    check-cast p1, Ll/ܶ᩵ܿ;

    .line 44
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "dex"

    .line 46
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    const-string v3, "data"

    if-eqz v2, :cond_1

    .line 48
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "arsc"

    .line 53
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    invoke-virtual {p1, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
