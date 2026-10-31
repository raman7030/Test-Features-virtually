.class public final synthetic Ll/ᩳ᩶ܳ;
.super Ljava/lang/Object;
.source "IB3L"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳ᩶ܳ;->᩸:I

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
    iget v0, p0, Ll/ᩳ᩶ܳ;->᩸:I

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

    :pswitch_2
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
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
    .locals 9

    .line 2
    iget v0, p0, Ll/ᩳ᩶ܳ;->᩸:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast p1, Ll/֨֨֨;

    .line 143
    sget-object v0, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    new-array v3, v2, [Ll/᩵֨֨;

    aput-object v0, v3, v1

    invoke-virtual {p1, v3}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v3

    .line 2092
    new-instance v4, Ll/ᩴܶ۠;

    invoke-direct {v4}, Ll/ᩴܶ۠;-><init>()V

    new-array v5, v2, [Ll/᩵֨֨;

    aput-object v0, v5, v1

    .line 2094
    invoke-virtual {p1, v5}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v5, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۙ֨֨;

    .line 5303
    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p1, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->᩺:Ll/֨ᩴ֨;

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    .line 0
    :pswitch_1
    check-cast p1, Ll/۬ܺ֨;

    .line 1101
    check-cast p1, Ll/ۚۚ۠;

    invoke-static {p1}, Ll/۟ۚ۠;->᩻(Ll/ۚۚ۠;)J

    move-result-wide v2

    const-wide/32 v4, 0x1000000

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    .line 0
    :pswitch_2
    check-cast p1, Ll/ᩳۜܳ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result p1

    return p1

    .line 2094
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ֨֨;

    add-int/lit8 v7, v5, 0x1

    .line 2095
    iget v8, p1, Ll/֨֨֨;->᩺:I

    if-ne v5, v8, :cond_2

    goto :goto_1

    .line 2096
    :cond_2
    invoke-virtual {v4, v6}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    move v5, v7

    goto :goto_0

    .line 2098
    :cond_3
    :goto_1
    invoke-virtual {v4}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    .line 144
    invoke-virtual {v3, v0}, Ll/ۖܶ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [Ll/᩵֨֨;

    sget-object v4, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    aput-object v4, v3, v1

    sget-object v1, Ll/᩵֨֨;->᩶:Ll/᩵֨֨;

    aput-object v1, v3, v2

    .line 145
    invoke-virtual {p1, v3}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
