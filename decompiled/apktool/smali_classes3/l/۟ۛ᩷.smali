.class public final synthetic Ll/۟ۛ᩷;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/CharSequence;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟ۛ᩷;->᩸:I

    iput-object p2, p0, Ll/۟ۛ᩷;->᩹:Ljava/lang/CharSequence;

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
    iget v0, p0, Ll/۟ۛ᩷;->᩸:I

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
    iget v0, p0, Ll/۟ۛ᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/۟ۛ᩷;->᩹:Ljava/lang/CharSequence;

    .line 9
    check-cast v0, Ll/ۤܶ۠;

    .line 11
    check-cast p1, Ll/ۛ֡֨;

    .line 2107
    iget-object v1, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Ll/ۛ֡֨;->۫()Ll/ۤܶ۠;

    move-result-object p1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/۟ۛ᩷;->᩹:Ljava/lang/CharSequence;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Ljava/util/Map$Entry;

    .line 1624
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
