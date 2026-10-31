.class public final Ll/۟ۜ֡;
.super Ljava/lang/Object;
.source "ZARU"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/֫᩷֡;

.field public ᩶:Z

.field public final ᩸:[Ljava/lang/Object;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/֫᩷֡;[Ljava/lang/Object;)V
    .locals 0

    .line 478
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۜ֡;->ۙ:Ll/֫᩷֡;

    const/4 p1, 0x0

    .line 475
    iput p1, p0, Ll/۟ۜ֡;->᩹:I

    const/4 p1, 0x1

    .line 476
    iput-boolean p1, p0, Ll/۟ۜ֡;->᩶:Z

    .line 479
    iput-object p2, p0, Ll/۟ۜ֡;->᩸:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 484
    iget v0, p0, Ll/۟ۜ֡;->᩹:I

    iget-object v1, p0, Ll/۟ۜ֡;->᩸:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 489
    invoke-virtual {p0}, Ll/۟ۜ֡;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 493
    iput-boolean v0, p0, Ll/۟ۜ֡;->᩶:Z

    .line 494
    iget v0, p0, Ll/۟ۜ֡;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/۟ۜ֡;->᩹:I

    iget-object v1, p0, Ll/۟ۜ֡;->᩸:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    .line 490
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 3

    .line 499
    iget-boolean v0, p0, Ll/۟ۜ֡;->᩶:Z

    if-nez v0, :cond_0

    .line 503
    iget v0, p0, Ll/۟ۜ֡;->᩹:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget-object v2, p0, Ll/۟ۜ֡;->᩸:[Ljava/lang/Object;

    aget-object v0, v2, v0

    iget-object v2, p0, Ll/۟ۜ֡;->ۙ:Ll/֫᩷֡;

    invoke-virtual {v2, v0}, Ll/֫᩷֡;->remove(Ljava/lang/Object;)Z

    .line 504
    iput-boolean v1, p0, Ll/۟ۜ֡;->᩶:Z

    return-void

    .line 500
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
