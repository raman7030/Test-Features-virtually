.class public final synthetic Ll/ۖܰ֨;
.super Ljava/lang/Object;
.source "T7LF"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖܰ֨;->᩸:I

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
    iget v0, p0, Ll/ۖܰ֨;->᩸:I

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
    .locals 2

    .line 2
    iget v0, p0, Ll/ۖܰ֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ܽܶ۠;

    .line 1291
    invoke-virtual {p1}, Ll/ܽܶ۠;->֫()Ll/ۛ᩹۠;

    move-result-object v0

    sget-object v1, Ll/ۛ᩹۠;->᩹:Ll/ۛ᩹۠;

    if-ne v0, v1, :cond_2

    sget-object v0, Ll/᩶۠۠;->۬:Ll/᩶۠۠;

    .line 1292
    invoke-virtual {p1, v0}, Ll/ܽܶ۠;->֫(Ll/᩶۠۠;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ll/᩶۠۠;->᩹:Ll/᩶۠۠;

    .line 1293
    invoke-virtual {p1, v0}, Ll/ܽܶ۠;->֫(Ll/᩶۠۠;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 0
    :pswitch_0
    check-cast p1, Ll/ܿᩴ֨;

    .line 1262
    iget-object p1, p1, Ll/ܿᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
