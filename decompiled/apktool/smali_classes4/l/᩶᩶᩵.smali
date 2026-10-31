.class public final Ll/᩶᩶᩵;
.super Ljava/lang/Object;
.source "CAXH"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ۙ:I

.field public ᩶:I

.field public final ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput p3, p0, Ll/᩶᩶᩵;->ۙ:I

    .line 41
    iput p2, p0, Ll/᩶᩶᩵;->᩸:I

    const/4 v0, 0x0

    if-lez p3, :cond_0

    if-gt p1, p2, :cond_1

    goto :goto_0

    :cond_0
    if-lt p1, p2, :cond_1

    :goto_0
    const/4 v0, 0x1

    .line 42
    :cond_1
    iput-boolean v0, p0, Ll/᩶᩶᩵;->᩹:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move p1, p2

    .line 43
    :goto_1
    iput p1, p0, Ll/᩶᩶᩵;->᩶:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Ll/᩶᩶᩵;->᩹:Z

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 169
    invoke-virtual {p0}, Ll/᩶᩶᩵;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextInt()I
    .locals 2

    .line 48
    iget v0, p0, Ll/᩶᩶᩵;->᩶:I

    .line 49
    iget v1, p0, Ll/᩶᩶᩵;->᩸:I

    if-ne v0, v1, :cond_1

    .line 50
    iget-boolean v1, p0, Ll/᩶᩶᩵;->᩹:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 51
    iput-boolean v1, p0, Ll/᩶᩶᩵;->᩹:Z

    return v0

    .line 50
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 54
    :cond_1
    iget v1, p0, Ll/᩶᩶᩵;->ۙ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩶᩶᩵;->᩶:I

    return v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
