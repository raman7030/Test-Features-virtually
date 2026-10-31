.class public final synthetic Ll/ۜᩳ֨;
.super Ljava/lang/Object;
.source "97F2"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:Ll/ۗᩳ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۗᩳ֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜᩳ֨;->᩸:Ll/ۗᩳ֨;

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
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "opens"

    const/16 v1, 0x9

    .line 104
    iget-object v2, p0, Ll/ۜᩳ֨;->᩸:Ll/ۗᩳ֨;

    invoke-virtual {v2, v1, v0}, Ll/ۢܽ֨;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶᩳ֨;

    invoke-virtual {p1}, Ll/֨ᩳ֨;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "%s;%n"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

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
