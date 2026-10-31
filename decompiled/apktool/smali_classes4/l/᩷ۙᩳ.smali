.class public final Ll/᩷ۙᩳ;
.super Ljava/lang/Object;
.source "R6U3"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩸:Ljava/util/ArrayDeque;

.field public final synthetic ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܺۙᩳ;Z)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Ll/᩷ۙᩳ;->᩹:Z

    .line 78
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p2, p0, Ll/᩷ۙᩳ;->᩸:Ljava/util/ArrayDeque;

    .line 79
    iget-object p1, p1, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 81
    iget-object v0, p0, Ll/᩷ۙᩳ;->᩸:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 84
    iget-object v0, p0, Ll/᩷ۙᩳ;->᩸:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢۙᩳ;

    .line 86
    :cond_0
    :goto_0
    iget-object v2, v1, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    iget-object v3, v1, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    iget-object v1, v1, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    if-nez v2, :cond_2

    .line 87
    iget-boolean v2, p0, Ll/᩷ۙᩳ;->᩹:Z

    if-eqz v2, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    if-eqz v2, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_2
    return-object v2

    .line 84
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
