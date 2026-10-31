.class public final Ll/ۢۘᩴ;
.super Ljava/lang/Object;
.source "2GI"

# interfaces
.implements Ll/ۘۘᩴ;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;
.implements Ll/۫۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# direct methods
.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 105
    sget-object v0, Ll/ۡۘᩴ;->֫:Ll/ۢۘᩴ;

    return-object v0
.end method


# virtual methods
.method public final add(J)V
    .locals 0

    .line 56
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 31
    check-cast p1, Ljava/lang/Long;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۢۘᩴ;->add(J)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 101
    sget-object v0, Ll/ۡۘᩴ;->֫:Ll/ۢۘᩴ;

    return-object v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 44
    check-cast p1, Ljava/util/function/LongConsumer;

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 0

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Long;
    .locals 1

    .line 46
    invoke-interface {p0}, Ll/ۜ۫ᩴ;->nextLong()J

    const/4 v0, 0x0

    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/ۢۘᩴ;->nextLong()J

    const/4 v0, 0x0

    throw v0
.end method

.method public final nextIndex()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final nextLong()J
    .locals 1

    .line 62
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ۢۘᩴ;->ܿ֫()J

    const/4 v0, 0x0

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 70
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 31
    check-cast p1, Ljava/lang/Long;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۢۘᩴ;->ᩳ(J)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ܿ֫()J
    .locals 1

    .line 67
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 43
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
