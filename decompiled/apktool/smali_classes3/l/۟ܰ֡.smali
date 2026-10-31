.class public final Ll/۟ܰ֡;
.super Ljava/lang/Object;
.source "Z5Z9"

# interfaces
.implements Ll/ܰܰ֡;


# instance fields
.field public ۧ:I

.field public final synthetic ܳ:Ll/֫۟֡;

.field public ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/֫۟֡;II)V
    .locals 0

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܰ֡;->ܳ:Ll/֫۟֡;

    .line 265
    iput p2, p0, Ll/۟ܰ֡;->ܿ:I

    .line 266
    iput p3, p0, Ll/۟ܰ֡;->ᩳ:I

    .line 267
    iget-object p1, p1, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    iput p1, p0, Ll/۟ܰ֡;->ܽ:I

    const/4 p1, 0x0

    .line 268
    iput p1, p0, Ll/۟ܰ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final seekTo(I)I
    .locals 6

    .line 272
    :goto_0
    iget v0, p0, Ll/۟ܰ֡;->ܽ:I

    iget v1, p0, Ll/۟ܰ֡;->ܿ:I

    iget-object v2, p0, Ll/۟ܰ֡;->ܳ:Ll/֫۟֡;

    if-ge v0, p1, :cond_0

    iget v3, p0, Ll/۟ܰ֡;->ۧ:I

    add-int/lit8 v4, v3, 0x1

    iget v5, p0, Ll/۟ܰ֡;->ᩳ:I

    if-ge v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    .line 273
    iput v3, p0, Ll/۟ܰ֡;->ۧ:I

    .line 274
    iget-object v0, v2, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v2, p0, Ll/۟ܰ֡;->ۧ:I

    mul-int/lit8 v2, v2, 0x8

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    iput v0, p0, Ll/۟ܰ֡;->ܽ:I

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    .line 278
    iget-object p1, v2, Ll/֫۟֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    iget v0, p0, Ll/۟ܰ֡;->ۧ:I

    mul-int/lit8 v0, v0, 0x8

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p1, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
