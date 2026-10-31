.class public abstract Ll/ۖܿᩴ;
.super Ljava/lang/Object;
.source "4CC0"

# interfaces
.implements Ll/۠ܳᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x44907a65b4c385f2L


# virtual methods
.method public final andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 241
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 93
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsDouble(I)D
    .locals 2

    .line 60
    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->get(I)F

    move-result p1

    float-to-double v0, p1

    return-wide v0
.end method

.method public final compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 230
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 192
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->֫(I)Z

    move-result p1

    return p1
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨ܳᩴ;->֫(Ll/ۖܿᩴ;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 51
    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->get(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public remove(I)F
    .locals 0

    .line 111
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ֫(FI)F
    .locals 0

    .line 73
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ܽ()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
