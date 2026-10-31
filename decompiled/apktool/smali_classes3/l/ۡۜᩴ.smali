.class public Ll/ۡۜᩴ;
.super Ljava/lang/Object;
.source "0JF"


# instance fields
.field public final synthetic ۗ:Ll/ۖۜᩴ;

.field public ۙ:Ll/ܰ᩻ᩴ;

.field public ᩶:Ll/ܰ᩻ᩴ;

.field public ᩸:Ll/ܰ᩻ᩴ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۖۜᩴ;)V
    .locals 1

    .line 972
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۜᩴ;->ۗ:Ll/ۖۜᩴ;

    const/4 v0, 0x0

    .line 970
    iput v0, p0, Ll/ۡۜᩴ;->᩹:I

    .line 973
    iget-object p1, p1, Ll/ۖۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    iput-object p1, p0, Ll/ۡۜᩴ;->᩶:Ll/ܰ᩻ᩴ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 986
    iget-object v0, p0, Ll/ۡۜᩴ;->᩶:Ll/ܰ᩻ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 990
    iget-object v0, p0, Ll/ۡۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 1018
    iget v0, p0, Ll/ۡۜᩴ;->᩹:I

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1

    .line 1071
    invoke-virtual {p0}, Ll/ۡۜᩴ;->ۧ()Ll/ܰ᩻ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1022
    iget v0, p0, Ll/ۡۜᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 2

    .line 1026
    iget-object v0, p0, Ll/ۡۜᩴ;->᩸:Ll/ܰ᩻ᩴ;

    if-eqz v0, :cond_1

    .line 1029
    iget-object v1, p0, Ll/ۡۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    if-ne v0, v1, :cond_0

    iget v1, p0, Ll/ۡۜᩴ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۡۜᩴ;->᩹:I

    .line 1030
    :cond_0
    iput-object v0, p0, Ll/ۡۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    iput-object v0, p0, Ll/ۡۜᩴ;->᩶:Ll/ܰ᩻ᩴ;

    .line 1031
    invoke-virtual {p0}, Ll/ۡۜᩴ;->ᩳ()V

    .line 1032
    invoke-virtual {p0}, Ll/ۡۜᩴ;->ܽ()V

    .line 1033
    iget-object v0, p0, Ll/ۡۜᩴ;->᩸:Ll/ܰ᩻ᩴ;

    iget v0, v0, Ll/ۚܿᩴ;->᩸:I

    iget-object v1, p0, Ll/ۡۜᩴ;->ۗ:Ll/ۖۜᩴ;

    invoke-virtual {v1, v0}, Ll/ۖۜᩴ;->remove(I)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 1034
    iput-object v0, p0, Ll/ۡۜᩴ;->᩸:Ll/ܰ᩻ᩴ;

    return-void

    .line 1026
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ֫()Ll/ܰ᩻ᩴ;
    .locals 1

    .line 998
    invoke-virtual {p0}, Ll/ۡۜᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 999
    iget-object v0, p0, Ll/ۡۜᩴ;->᩶:Ll/ܰ᩻ᩴ;

    iput-object v0, p0, Ll/ۡۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    iput-object v0, p0, Ll/ۡۜᩴ;->᩸:Ll/ܰ᩻ᩴ;

    .line 1000
    iget v0, p0, Ll/ۡۜᩴ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۡۜᩴ;->᩹:I

    .line 1001
    invoke-virtual {p0}, Ll/ۡۜᩴ;->ܽ()V

    .line 1002
    iget-object v0, p0, Ll/ۡۜᩴ;->᩸:Ll/ܰ᩻ᩴ;

    return-object v0

    .line 998
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۧ()Ll/ܰ᩻ᩴ;
    .locals 1

    .line 1010
    invoke-virtual {p0}, Ll/ۡۜᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1011
    iget-object v0, p0, Ll/ۡۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    iput-object v0, p0, Ll/ۡۜᩴ;->᩶:Ll/ܰ᩻ᩴ;

    iput-object v0, p0, Ll/ۡۜᩴ;->᩸:Ll/ܰ᩻ᩴ;

    .line 1012
    iget v0, p0, Ll/ۡۜᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۡۜᩴ;->᩹:I

    .line 1013
    invoke-virtual {p0}, Ll/ۡۜᩴ;->ᩳ()V

    .line 1014
    iget-object v0, p0, Ll/ۡۜᩴ;->᩸:Ll/ܰ᩻ᩴ;

    return-object v0

    .line 1010
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public ܽ()V
    .locals 1

    .line 994
    iget-object v0, p0, Ll/ۡۜᩴ;->᩶:Ll/ܰ᩻ᩴ;

    invoke-virtual {v0}, Ll/ܰ᩻ᩴ;->ᩳ()Ll/ܰ᩻ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۜᩴ;->᩶:Ll/ܰ᩻ᩴ;

    return-void
.end method

.method public ᩳ()V
    .locals 1

    .line 1006
    iget-object v0, p0, Ll/ۡۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    invoke-virtual {v0}, Ll/ܰ᩻ᩴ;->ۜ()Ll/ܰ᩻ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۜᩴ;->ۙ:Ll/ܰ᩻ᩴ;

    return-void
.end method
