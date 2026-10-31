.class public final synthetic Ll/ܽۗᩳ;
.super Ljava/lang/Object;
.source "N6TT"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܽۗᩳ;->᩸:I

    iput p2, p0, Ll/ܽۗᩳ;->᩹:I

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
    check-cast p1, Ljava/lang/Long;

    .line 300
    new-instance p1, Ll/ۚۗᩳ;

    iget v0, p0, Ll/ܽۗᩳ;->᩸:I

    iget v1, p0, Ll/ܽۗᩳ;->᩹:I

    invoke-direct {p1, v0, v1}, Ll/ۚۗᩳ;-><init>(II)V

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
