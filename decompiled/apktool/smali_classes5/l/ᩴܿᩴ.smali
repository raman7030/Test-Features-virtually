.class public abstract Ll/ᩴܿᩴ;
.super Ljava/lang/Object;
.source "V1L7"

# interfaces
.implements Ll/ۡ᩻ᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x44907a65b4c385f2L


# instance fields
.field public ᩸:I


# virtual methods
.method public final andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 245
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

    .line 60
    invoke-interface {p0, p1}, Ll/ۡ᩻ᩴ;->get(I)I

    move-result p1

    return p1
.end method

.method public final compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 234
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

.method public abstract ֫(II)I
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, -0x1

    .line 44
    iput v0, p0, Ll/ᩴܿᩴ;->᩸:I

    return-void
.end method

.method public ܽ()I
    .locals 1

    .line 49
    iget v0, p0, Ll/ᩴܿᩴ;->᩸:I

    return v0
.end method
