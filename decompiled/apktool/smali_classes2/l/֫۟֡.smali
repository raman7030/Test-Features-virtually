.class public final Ll/֫۟֡;
.super Ll/ۧ۟֡;
.source "Z5Z9"


# instance fields
.field public final ۧ:Ll/۬ۛ֡;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 202
    iput-object p1, p0, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    .line 203
    iput p2, p0, Ll/֫۟֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Set;
    .locals 3

    .line 220
    iget-object v0, p0, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/֫۟֡;->ܽ:I

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-static {v0, v1}, Ll/ۧ۟֡;->֫(Ll/۬ۛ֡;I)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ܰܰ֡;
    .locals 3

    .line 207
    iget-object v0, p0, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/֫۟֡;->ܽ:I

    add-int/lit8 v2, v1, 0x4

    invoke-virtual {v0, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    if-nez v0, :cond_0

    .line 227
    sget-object v0, Ll/ܰܰ֡;->֫:Ll/ܰܰ֡;

    return-object v0

    .line 229
    :cond_0
    new-instance v2, Ll/۟ܰ֡;

    add-int/lit8 v1, v1, 0x10

    invoke-direct {v2, p0, v1, v0}, Ll/۟ܰ֡;-><init>(Ll/֫۟֡;II)V

    return-object v2
.end method

.method public final ܽ()Ll/ܰܰ֡;
    .locals 4

    .line 211
    iget-object v0, p0, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/֫۟֡;->ܽ:I

    add-int/lit8 v3, v2, 0x8

    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    if-nez v1, :cond_0

    .line 236
    sget-object v0, Ll/ܰܰ֡;->֫:Ll/ܰܰ֡;

    return-object v0

    .line 207
    :cond_0
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    add-int/lit8 v3, v2, 0x4

    invoke-virtual {v0, v3}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    add-int/lit8 v2, v2, 0x10

    mul-int/lit8 v0, v0, 0x8

    add-int/2addr v0, v2

    .line 241
    new-instance v2, Ll/۟ܰ֡;

    invoke-direct {v2, p0, v0, v1}, Ll/۟ܰ֡;-><init>(Ll/֫۟֡;II)V

    return-object v2
.end method

.method public final ᩳ()Ll/ܰܰ֡;
    .locals 5

    .line 215
    iget-object v0, p0, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/֫۟֡;->ܽ:I

    add-int/lit8 v3, v2, 0xc

    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    if-nez v1, :cond_0

    .line 248
    sget-object v0, Ll/ܰܰ֡;->֫:Ll/ܰܰ֡;

    return-object v0

    .line 207
    :cond_0
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v3

    add-int/lit8 v4, v2, 0x4

    invoke-virtual {v3, v4}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v3

    .line 211
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    add-int/lit8 v4, v2, 0x8

    invoke-virtual {v0, v4}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    add-int/lit8 v2, v2, 0x10

    mul-int/lit8 v3, v3, 0x8

    add-int/2addr v3, v2

    mul-int/lit8 v0, v0, 0x8

    add-int/2addr v0, v3

    .line 255
    new-instance v2, Ll/۟ܰ֡;

    invoke-direct {v2, p0, v0, v1}, Ll/۟ܰ֡;-><init>(Ll/֫۟֡;II)V

    return-object v2
.end method
