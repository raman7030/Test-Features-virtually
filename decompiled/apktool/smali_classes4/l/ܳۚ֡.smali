.class public final Ll/ܳۚ֡;
.super Ll/ۨ֡֡;
.source "S8YL"


# instance fields
.field public ۜ:I

.field public ۡ:Ljava/lang/Integer;

.field public ۢ:Ljava/lang/String;

.field public ᩷:Ljava/lang/String;

.field public ᩻:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ll/ۨ֡֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    .line 81
    iput p1, p0, Ll/ܳۚ֡;->ۜ:I

    return-void
.end method

.method public final ֫(Ljava/lang/Integer;)V
    .locals 2

    .line 69
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 72
    iget-object v0, p0, Ll/ܳۚ֡;->ۡ:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 139
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt v1, v0, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "fence lengths required to be: closingFenceLength >= openingFenceLength"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ܳۚ֡;->᩻:Ljava/lang/Integer;

    return-void

    .line 70
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "closingFenceLength needs to be >= 3"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Ll/ܳۚ֡;->᩷:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/ۤۚ֡;)V
    .locals 0

    .line 29
    invoke-interface {p1, p0}, Ll/ۤۚ֡;->֫(Ll/ܳۚ֡;)V

    return-void
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ܳۚ֡;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ܳۚ֡;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Integer;)V
    .locals 2

    .line 53
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 56
    iget-object v0, p0, Ll/ܳۚ֡;->᩻:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 139
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "fence lengths required to be: closingFenceLength >= openingFenceLength"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ܳۚ֡;->ۡ:Ljava/lang/Integer;

    return-void

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "openingFenceLength needs to be >= 3"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Ll/ܳۚ֡;->ۢ:Ljava/lang/String;

    return-void
.end method

.method public final ܺ()Ljava/lang/Integer;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܳۚ֡;->ۡ:Ljava/lang/Integer;

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    .line 77
    iget v0, p0, Ll/ܳۚ֡;->ۜ:I

    return v0
.end method
