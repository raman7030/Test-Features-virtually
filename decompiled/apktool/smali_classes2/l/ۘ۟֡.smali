.class public final Ll/ۘ۟֡;
.super Ljava/lang/Object;
.source "R4U5"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/ᩴ۟֡;


# direct methods
.method public constructor <init>(Ll/ᩴ۟֡;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ۟֡;->᩹:Ll/ᩴ۟֡;

    const/4 p1, 0x0

    .line 48
    iput p1, p0, Ll/ۘ۟֡;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 52
    iget v0, p0, Ll/ۘ۟֡;->᩸:I

    iget-object v1, p0, Ll/ۘ۟֡;->᩹:Ll/ᩴ۟֡;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 62
    invoke-virtual {p0}, Ll/ۘ۟֡;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    iget v0, p0, Ll/ۘ۟֡;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۘ۟֡;->᩸:I

    iget-object v1, p0, Ll/ۘ۟֡;->᩹:Ll/ᩴ۟֡;

    invoke-virtual {v1, v0}, Ll/ᩴ۟֡;->֫(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 63
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 57
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
