.class public final synthetic Ll/ܽܽ֨;
.super Ljava/lang/Object;
.source "J7E7"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:Ll/ᩳܽ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳܽ֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܽ֨;->᩸:Ll/ᩳܽ֨;

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
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/Integer;

    .line 49
    iget-object v0, p0, Ll/ܽܽ֨;->᩸:Ll/ᩳܽ֨;

    iget-object v0, v0, Ll/ۨ֫֨;->ۛ֫:Ll/ܰۗۚ;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "??? Invalid constant_pool reference"

    invoke-static {v0, v2}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const/4 v0, 0x1

    aput-object p1, v2, v0

    const-string p1, "%s #%d"

    .line 19
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
