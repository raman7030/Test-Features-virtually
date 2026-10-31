.class public final Ll/ܶܰ֡;
.super Ll/ܺ۬֡;
.source "Q4IO"


# instance fields
.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    .line 50
    iput p2, p0, Ll/ܶܰ֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 3

    .line 66
    iget-object v0, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ܶܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 3

    .line 77
    iget-object v0, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ܶܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/io/Writer;)V
    .locals 3

    .line 60
    iget-object v0, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ܶܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    return-void
.end method

.method public final ۧ(Ljava/io/Writer;)V
    .locals 3

    .line 70
    iget-object v0, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ܶܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    const/4 v2, 0x0

    .line 71
    invoke-virtual {v0, v1, p1, v2}, Ll/۬ۛ֡;->ۧ(ILjava/io/Writer;Z)V

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ܶܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/io/Writer;)V
    .locals 3

    .line 81
    iget-object v0, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ܶܰ֡;->᩹:I

    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 97
    iget v0, p0, Ll/ܶܰ֡;->᩹:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Ll/ܶܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->᩻()I

    move-result v1

    if-ge v0, v1, :cond_0

    return-void

    .line 98
    :cond_0
    new-instance v1, Ll/֨ܽۚ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "field@"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/֨ܽۚ;-><init>(Ljava/lang/String;)V

    throw v1
.end method
