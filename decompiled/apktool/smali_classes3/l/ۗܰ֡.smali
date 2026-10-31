.class public final Ll/ۗܰ֡;
.super Ll/ᩴ۬֡;
.source "C4OQ"


# instance fields
.field public ۙ:Ljava/lang/String;

.field public ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Ll/ۗܰ֡;->ۙ:Ljava/lang/String;

    .line 57
    iput-object p1, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    .line 58
    iput p2, p0, Ll/ۗܰ֡;->᩹:I

    return-void
.end method

.method private ֡()I
    .locals 3

    .line 132
    iget v0, p0, Ll/ۗܰ֡;->᩶:I

    if-nez v0, :cond_0

    .line 134
    iget-object v0, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۗܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ܿ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    .line 133
    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۜ(I)I

    move-result v0

    iput v0, p0, Ll/ۗܰ֡;->᩶:I

    .line 136
    :cond_0
    iget v0, p0, Ll/ۗܰ֡;->᩶:I

    return v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 3

    .line 75
    iget-object v0, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۗܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ܿ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ۗܰ֡;->ۙ:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 64
    invoke-static {p0, v0}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object v0

    .line 153
    iput-object v0, p0, Ll/ۗܰ֡;->ۙ:Ljava/lang/String;

    .line 154
    :cond_0
    iget-object v0, p0, Ll/ۗܰ֡;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/io/Writer;)V
    .locals 3

    .line 69
    iget-object v0, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۗܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ܿ(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    return-void
.end method

.method public final ۘ()Ljava/util/List;
    .locals 3

    .line 86
    invoke-direct {p0}, Ll/ۗܰ֡;->֡()I

    move-result v0

    .line 87
    iget-object v1, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    add-int/lit8 v0, v0, 0x8

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 89
    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x4

    .line 91
    new-instance v2, Ll/ۙܰ֡;

    invoke-direct {v2, p0, v0, v1}, Ll/ۙܰ֡;-><init>(Ll/ۗܰ֡;II)V

    return-object v2

    .line 104
    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/io/Writer;)V
    .locals 3

    .line 79
    iget-object v0, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۗܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ܿ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    const/4 v2, 0x0

    .line 80
    invoke-virtual {v0, v1, p1, v2}, Ll/۬ۛ֡;->ۧ(ILjava/io/Writer;Z)V

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 3

    .line 64
    iget-object v0, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۗܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ܿ(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/io/Writer;)V
    .locals 6

    .line 108
    invoke-direct {p0}, Ll/ۗܰ֡;->֡()I

    move-result v0

    .line 109
    iget-object v1, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    add-int/lit8 v0, v0, 0x8

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 111
    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v2

    add-int/lit8 v0, v0, 0x4

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 114
    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v4

    mul-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v0

    invoke-virtual {v4, v5}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v4

    invoke-virtual {v1, p1, v4}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 159
    iget v0, p0, Ll/ۗܰ֡;->᩹:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->᩷()I

    move-result v1

    if-ge v0, v1, :cond_0

    return-void

    .line 160
    :cond_0
    new-instance v1, Ll/֨ܽۚ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "method@"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/֨ܽۚ;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 3

    .line 122
    invoke-direct {p0}, Ll/ۗܰ֡;->֡()I

    move-result v0

    .line 123
    iget-object v1, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ljava/io/Writer;)V
    .locals 3

    .line 127
    invoke-direct {p0}, Ll/ۗܰ֡;->֡()I

    move-result v0

    .line 128
    iget-object v1, p0, Ll/ۗܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    invoke-virtual {v1, p1, v0}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    return-void
.end method
