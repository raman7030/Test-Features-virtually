.class public final Ll/֨᩶᩵;
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
.method public constructor <init>(CI)V
    .locals 2

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p2, p0, Ll/֨᩶᩵;->ۙ:I

    .line 17
    iput p1, p0, Ll/֨᩶᩵;->᩸:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p2, :cond_1

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_1
    if-ge v0, p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 18
    :cond_3
    :goto_1
    iput-boolean v1, p0, Ll/֨᩶᩵;->᩹:Z

    if-eqz v1, :cond_4

    const/4 p1, 0x1

    .line 19
    :cond_4
    iput p1, p0, Ll/֨᩶᩵;->᩶:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Ll/֨᩶᩵;->᩹:Z

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 24
    iget v0, p0, Ll/֨᩶᩵;->᩶:I

    .line 25
    iget v1, p0, Ll/֨᩶᩵;->᩸:I

    if-ne v0, v1, :cond_1

    .line 26
    iget-boolean v1, p0, Ll/֨᩶᩵;->᩹:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 27
    iput-boolean v1, p0, Ll/֨᩶᩵;->᩹:Z

    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 30
    :cond_1
    iget v1, p0, Ll/֨᩶᩵;->ۙ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/֨᩶᩵;->᩶:I

    :goto_0
    int-to-char v0, v0

    .line 85
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
