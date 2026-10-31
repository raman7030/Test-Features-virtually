.class public final Ll/ᩳۛ֨;
.super Ljava/lang/Object;
.source "M43N"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public ᩸:Ll/֡ۨ֨;


# direct methods
.method public constructor <init>(Ll/֡ۨ֨;)V
    .locals 0

    .line 1233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1234
    iput-object p1, p0, Ll/ᩳۛ֨;->᩸:Ll/֡ۨ֨;

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
    .locals 1

    .line 1229
    check-cast p1, Ll/ۙ֨֨;

    .line 1239
    invoke-virtual {p1}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳۛ֨;->᩸:Ll/֡ۨ֨;

    .line 165
    iget-object v0, v0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1239
    sget-object v0, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    .line 1240
    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
