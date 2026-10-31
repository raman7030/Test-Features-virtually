.class public final Ll/ܺۨ֡;
.super Ll/ۢ۬֡;
.source "M6BE"


# instance fields
.field public final ֫:Ll/۬ۛ֡;

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;II)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ܺۨ֡;->֫:Ll/۬ۛ֡;

    .line 52
    iput p2, p0, Ll/ܺۨ֡;->ܽ:I

    .line 53
    iput p3, p0, Ll/ܺۨ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 58
    iget-object v0, p0, Ll/ܺۨ֡;->֫:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ܺۨ֡;->ܽ:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    return v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 9

    .line 69
    iget-object v0, p0, Ll/ܺۨ֡;->֫:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    .line 70
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    iget v3, p0, Ll/ܺۨ֡;->ܽ:I

    add-int/lit8 v3, v3, 0x6

    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v2

    iget v3, p0, Ll/ܺۨ֡;->ۧ:I

    add-int/2addr v2, v3

    .line 69
    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۡ()I

    move-result v2

    .line 72
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v6

    .line 73
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۘ()V

    if-lez v2, :cond_0

    .line 77
    new-instance v1, Ll/ۢۨ֡;

    invoke-direct {v1, p0, v0, v6, v2}, Ll/ۢۨ֡;-><init>(Ll/ܺۨ֡;Ll/۬ۛ֡;II)V

    return-object v1

    :cond_0
    mul-int/lit8 v2, v2, -0x1

    add-int/lit8 v8, v2, 0x1

    .line 87
    new-instance v0, Ll/ۡۨ֡;

    iget-object v5, p0, Ll/ܺۨ֡;->֫:Ll/۬ۛ֡;

    move-object v3, v0

    move-object v4, p0

    move v7, v8

    invoke-direct/range {v3 .. v8}, Ll/ۡۨ֡;-><init>(Ll/ܺۨ֡;Ll/۬ۛ֡;III)V

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 63
    iget-object v0, p0, Ll/ܺۨ֡;->֫:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ܺۨ֡;->ܽ:I

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0
.end method
