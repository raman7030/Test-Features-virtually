.class public abstract Ll/۬ۘᩴ;
.super Ljava/lang/Object;
.source "J1LO"

# interfaces
.implements Ll/᩸ᩴᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x44907a65b4c385f2L


# virtual methods
.method public final andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 201
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

.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    .line 60
    invoke-interface {p0, p1}, Ll/᩸ᩴᩴ;->ۧ(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܶᩴᩴ;->֫(Ll/᩸ᩴᩴ;Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 51
    invoke-interface {p0, p1}, Ll/᩸ᩴᩴ;->get(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public abstract synthetic size()I
.end method

.method public ֫(ILjava/lang/Object;)I
    .locals 0

    .line 73
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ֫(Ljava/lang/Object;)I
    .locals 0

    .line 111
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
