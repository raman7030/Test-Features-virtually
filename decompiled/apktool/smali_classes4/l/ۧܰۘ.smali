.class public abstract Ll/ۧܰۘ;
.super Ljava/lang/Object;
.source "KCC7"

# interfaces
.implements Ll/ܰܰۘ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x44907a65b4c385f2L


# virtual methods
.method public final andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 256
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public synthetic andThen(Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܺۛᩴ;->$default$andThen(Ljava/util/function/IntUnaryOperator;Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 93
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsInt(I)I
    .locals 0

    .line 71
    invoke-static {p1}, Ll/ۖ᩺ۘ;->ۧ(I)C

    move-result p1

    invoke-interface {p0, p1}, Ll/ܰܰۘ;->ۧ(C)C

    move-result p1

    return p1
.end method

.method public final compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 245
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public synthetic compose(Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܺۛᩴ;->$default$compose(Ljava/util/function/IntUnaryOperator;Ljava/util/function/IntUnaryOperator;)Ljava/util/function/IntUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Character;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ܰۘ;->֫(Ll/ۧܰۘ;Ljava/lang/Object;)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 51
    invoke-interface {p0, p1}, Ll/ܰܰۘ;->get(Ljava/lang/Object;)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public ֫(CC)C
    .locals 0

    .line 84
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
