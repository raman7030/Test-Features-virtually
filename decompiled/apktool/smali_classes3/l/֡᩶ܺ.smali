.class public abstract Ll/֡᩶ܺ;
.super Ll/ۙۨܺ;
.source "05HO"


# instance fields
.field public ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    .line 65
    invoke-static {p2, p1}, Ll/ۘܶܺ;->ۧ(II)V

    .line 66
    iput p1, p0, Ll/֡᩶ܺ;->᩹:I

    .line 67
    iput p2, p0, Ll/֡᩶ܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 72
    iget v0, p0, Ll/֡᩶ܺ;->᩸:I

    iget v1, p0, Ll/֡᩶ܺ;->᩹:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 91
    iget v0, p0, Ll/֡᩶ܺ;->᩸:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 78
    invoke-virtual {p0}, Ll/֡᩶ܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    iget v0, p0, Ll/֡᩶ܺ;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/֡᩶ܺ;->᩸:I

    invoke-virtual {p0, v0}, Ll/֡᩶ܺ;->ۧ(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 79
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 86
    iget v0, p0, Ll/֡᩶ܺ;->᩸:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 97
    invoke-virtual {p0}, Ll/֡᩶ܺ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget v0, p0, Ll/֡᩶ܺ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/֡᩶ܺ;->᩸:I

    invoke-virtual {p0, v0}, Ll/֡᩶ܺ;->ۧ(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 98
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 105
    iget v0, p0, Ll/֡᩶ܺ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public abstract ۧ(I)Ljava/lang/Object;
.end method
