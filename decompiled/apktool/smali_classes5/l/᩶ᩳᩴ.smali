.class public final synthetic Ll/᩶ᩳᩴ;
.super Ljava/lang/Object;
.source "AF4"

# interfaces
.implements Ll/ۢܿᩴ;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/UnaryOperator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/UnaryOperator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ᩳᩴ;->᩸:Ljava/util/function/UnaryOperator;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/DoubleUnaryOperator;)Ljava/util/function/DoubleUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜۛᩴ;->$default$andThen(Ljava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;)Ljava/util/function/DoubleUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Ljava/lang/Float;

    .line 88
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ᩳᩴ;->ۧ(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsDouble(D)D
    .locals 0

    .line 76
    invoke-static {p1, p2}, Ll/ۖ᩺ۘ;->֫(D)F

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ᩳᩴ;->ۧ(F)F

    move-result p1

    float-to-double p1, p1

    return-wide p1
.end method

.method public synthetic compose(Ljava/util/function/DoubleUnaryOperator;)Ljava/util/function/DoubleUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜۛᩴ;->$default$compose(Ljava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;)Ljava/util/function/DoubleUnaryOperator;

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

.method public final ۧ(F)F
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩶ᩳᩴ;->᩸:Ljava/util/function/UnaryOperator;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1
.end method
