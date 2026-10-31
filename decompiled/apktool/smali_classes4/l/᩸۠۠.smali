.class public final Ll/᩸۠۠;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩶:Ljava/util/Iterator;

.field public final ᩸:Ljava/util/function/Function;

.field public ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Ljava/util/function/Function;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {}, Ll/᩹۠۠;->֫()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/᩸۠۠;->᩹:Ljava/util/Iterator;

    .line 54
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/᩸۠۠;->᩶:Ljava/util/Iterator;

    .line 55
    iput-object p2, p0, Ll/᩸۠۠;->᩸:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 59
    iget-object v0, p0, Ll/᩸۠۠;->᩹:Ljava/util/Iterator;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 77
    :cond_0
    iget-object v0, p0, Ll/᩸۠۠;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 78
    iget-object v1, p0, Ll/᩸۠۠;->᩸:Ljava/util/function/Function;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    iput-object v0, p0, Ll/᩸۠۠;->᩹:Ljava/util/Iterator;

    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Ll/᩸۠۠;->᩹:Ljava/util/Iterator;

    .line 62
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩸۠۠;->᩹:Ljava/util/Iterator;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 66
    iget-object v0, p0, Ll/᩸۠۠;->᩹:Ljava/util/Iterator;

    invoke-static {}, Ll/᩹۠۠;->֫()Ljava/util/Iterator;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Ll/᩸۠۠;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 69
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩸۠۠;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 73
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
