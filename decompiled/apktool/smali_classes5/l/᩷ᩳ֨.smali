.class public final synthetic Ll/᩷ᩳ֨;
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

    iput-object p1, p0, Ll/᩷ᩳ֨;->᩸:Ll/ۗᩳ֨;

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
    .locals 2

    .line 2
    check-cast p1, Ll/᩹ᩳ֨;

    .line 4
    iget-object v0, p0, Ll/᩷ᩳ֨;->᩸:Ll/ۗᩳ֨;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    invoke-virtual {p1}, Ll/᩹ᩳ֨;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p1}, Ll/ۢܽ֨;->ᩳ(ILjava/lang/String;)Ljava/lang/String;

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
