.class public final synthetic Ll/᩵ܿܳ;
.super Ljava/lang/Object;
.source "D6KU"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ᩴܿܳ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴܿܳ;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܿܳ;->᩸:Ll/ᩴܿܳ;

    iput-object p2, p0, Ll/᩵ܿܳ;->᩹:Ljava/lang/String;

    iput-boolean p3, p0, Ll/᩵ܿܳ;->᩶:Z

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
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
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
    check-cast p1, Ll/ۚܿܳ;

    .line 50
    invoke-static {p1}, Ll/ۚܿܳ;->ۧ(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩵ܿܳ;->᩸:Ll/ᩴܿܳ;

    iget-object v2, v1, Ll/ᩴܿܳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ll/ۚܿܳ;->֫(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object v0

    .line 51
    iget-object v2, p0, Ll/᩵ܿܳ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩵ܿܳ;->᩶:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Ll/ۚܿܳ;->֫(Ll/ۚܿܳ;)Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-virtual {v1, p1}, Ll/ᩴܿܳ;->֫(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, v2}, Ll/ᩴܿܳ;->֫(Ljava/lang/String;)I

    move-result v0

    if-le p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
