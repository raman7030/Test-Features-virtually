.class public final synthetic Ll/ۚۧۢ;
.super Ljava/lang/Object;
.source "P67V"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ljava/util/function/Predicate;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Predicate;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۧۢ;->᩸:Ljava/util/function/Predicate;

    iput-object p2, p0, Ll/ۚۧۢ;->᩹:Ljava/lang/String;

    iput-boolean p3, p0, Ll/ۚۧۢ;->᩶:Z

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
    .locals 2

    .line 2
    check-cast p1, Ll/ᩳۧۢ;

    .line 537
    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    .line 538
    iget-object v0, p0, Ll/ۚۧۢ;->᩸:Ljava/util/function/Predicate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 541
    :cond_0
    iget-object v0, p0, Ll/ۚۧۢ;->᩹:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 544
    :cond_1
    iget-boolean v1, p0, Ll/ۚۧۢ;->᩶:Z

    if-nez v1, :cond_2

    const/16 v1, 0x2f

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
