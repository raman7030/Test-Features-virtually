.class public final Ll/ۖܳۘ;
.super Ljava/lang/Object;
.source "A1NH"

# interfaces
.implements Ll/۬ܿۘ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:Ljava/util/Iterator;

.field public final ܿ:I

.field public ᩳ:Ll/᩹ܳۘ;


# direct methods
.method public constructor <init>(Ll/ۜܳۘ;IIII)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-interface {p1}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ۖܳۘ;->ܽ:Ljava/util/Iterator;

    .line 58
    iput p2, p0, Ll/ۖܳۘ;->ܿ:I

    .line 59
    iput p3, p0, Ll/ۖܳۘ;->֫:I

    .line 60
    iput p4, p0, Ll/ۖܳۘ;->ܳ:I

    .line 61
    iput p5, p0, Ll/ۖܳۘ;->ۧ:I

    .line 63
    invoke-virtual {p0}, Ll/ۖܳۘ;->next()V

    return-void
.end method


# virtual methods
.method public final next()V
    .locals 9

    const/4 v0, 0x0

    .line 73
    iput-object v0, p0, Ll/ۖܳۘ;->ᩳ:Ll/᩹ܳۘ;

    .line 75
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۖܳۘ;->ܽ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳۘ;

    .line 77
    iget v1, v0, Ll/᩹ܳۘ;->֫:I

    iget v2, v0, Ll/᩹ܳۘ;->ᩳ:I

    iget v3, v0, Ll/᩹ܳۘ;->ۧ:I

    iget v4, p0, Ll/ۖܳۘ;->ܿ:I

    if-lt v1, v4, :cond_0

    iget v1, p0, Ll/ۖܳۘ;->ܳ:I

    if-ge v3, v1, :cond_1

    goto :goto_0

    .line 78
    :cond_1
    iget v5, v0, Ll/᩹ܳۘ;->ܽ:I

    iget v6, p0, Ll/ۖܳۘ;->֫:I

    if-gt v5, v6, :cond_4

    iget v7, p0, Ll/ۖܳۘ;->ۧ:I

    if-le v2, v7, :cond_2

    goto :goto_1

    .line 80
    :cond_2
    new-instance v8, Ll/᩹ܳۘ;

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int/2addr v5, v4

    iget v0, v0, Ll/᩹ܳۘ;->֫:I

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, v4

    .line 81
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr v2, v1

    invoke-static {v7, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, v1

    invoke-direct {v8, v5, v0, v2, v3}, Ll/᩹ܳۘ;-><init>(IIII)V

    .line 82
    invoke-virtual {v8}, Ll/᩹ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 84
    :cond_3
    iput-object v8, p0, Ll/ۖܳۘ;->ᩳ:Ll/᩹ܳۘ;

    :cond_4
    :goto_1
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۖܳۘ;->ᩳ:Ll/᩹ܳۘ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۖܳۘ;->ᩳ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۖܳۘ;->ᩳ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->֫:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۖܳۘ;->ᩳ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۖܳۘ;->ᩳ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->ܽ:I

    return v0
.end method
