.class public final Ll/᩶ܰ֡;
.super Ll/ۘ۬֡;
.source "R4MX"


# instance fields
.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Ll/᩶ܰ֡;->᩸:Ll/۬ۛ֡;

    .line 55
    iput p2, p0, Ll/᩶ܰ֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/Writer;)V
    .locals 6

    .line 82
    iget-object v0, p0, Ll/᩶ܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/᩶ܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۜ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x8

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    if-lez v1, :cond_0

    .line 84
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v2

    add-int/lit8 v1, v1, 0x4

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 87
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v4

    mul-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v1

    invoke-virtual {v4, v5}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v4

    invoke-virtual {v0, p1, v4}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۘ()Ljava/util/List;
    .locals 3

    .line 61
    iget-object v0, p0, Ll/᩶ܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/᩶ܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۜ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x8

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    if-lez v1, :cond_0

    .line 63
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    add-int/lit8 v1, v1, 0x4

    .line 65
    new-instance v2, Ll/᩹ܰ֡;

    invoke-direct {v2, p0, v1, v0}, Ll/᩹ܰ֡;-><init>(Ll/᩶ܰ֡;II)V

    return-object v2

    .line 78
    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/io/Writer;)V
    .locals 3

    .line 99
    iget-object v0, p0, Ll/᩶ܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/᩶ܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۜ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 120
    iget v0, p0, Ll/᩶ܰ֡;->᩹:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Ll/᩶ܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ۡ()I

    move-result v1

    if-ge v0, v1, :cond_0

    return-void

    .line 121
    :cond_0
    new-instance v1, Ll/֨ܽۚ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "proto@"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/֨ܽۚ;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 3

    .line 95
    iget-object v0, p0, Ll/᩶ܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/᩶ܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۜ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
