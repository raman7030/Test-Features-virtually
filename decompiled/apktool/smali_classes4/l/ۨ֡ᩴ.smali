.class public final Ll/ۨ֡ᩴ;
.super Ljava/lang/Object;
.source "Y1FB"

# interfaces
.implements Ll/ۧۚᩴ;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;
.implements Ll/۫۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# direct methods
.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 100
    sget-object v0, Ll/᩺֡ᩴ;->֫:Ll/ۨ֡ᩴ;

    return-object v0
.end method


# virtual methods
.method public final synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۘ᩺ۘ;->֫()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 96
    sget-object v0, Ll/᩺֡ᩴ;->֫:Ll/ۨ֡ᩴ;

    return-object v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
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

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 62
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 67
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 72
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۘ᩺ۘ;->ܽ()V

    const/4 p1, 0x0

    throw p1
.end method
