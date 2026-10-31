.class public abstract Ll/֨۟֡;
.super Ljava/lang/Object;
.source "2661"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩶:I

.field public ᩸:I

.field public final ᩹:Ll/ᩴۨ֡;


# direct methods
.method public constructor <init>(Ll/ᩴۨ֡;I)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/֨۟֡;->᩹:Ll/ᩴۨ֡;

    .line 49
    iput p2, p0, Ll/֨۟֡;->᩶:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 67
    iget v0, p0, Ll/֨۟֡;->᩸:I

    iget v1, p0, Ll/֨۟֡;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 72
    iget v0, p0, Ll/֨۟֡;->᩸:I

    iget v1, p0, Ll/֨۟֡;->᩶:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 75
    iput v0, p0, Ll/֨۟֡;->᩸:I

    move-object v0, p0

    check-cast v0, Ll/ܳ۟֡;

    .line 347
    iget-object v0, v0, Ll/ܳ۟֡;->ۙ:Ll/᩻۟֡;

    iget-object v0, v0, Ll/᩻۟֡;->᩹:Ll/۬ۛ֡;

    iget-object v1, p0, Ll/֨۟֡;->᩹:Ll/ᩴۨ֡;

    invoke-virtual {v1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->᩻(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 73
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 80
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
