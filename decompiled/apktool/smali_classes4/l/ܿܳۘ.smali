.class public abstract Ll/ܿܳۘ;
.super Ljava/lang/Object;
.source "01M8"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 270
    iput v0, p0, Ll/ܿܳۘ;->֫:I

    .line 271
    iput v0, p0, Ll/ܿܳۘ;->ۧ:I

    .line 274
    iput p1, p0, Ll/ܿܳۘ;->ܽ:I

    .line 275
    iput p2, p0, Ll/ܿܳۘ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 321
    iget v0, p0, Ll/ܿܳۘ;->֫:I

    iget v1, p0, Ll/ܿܳۘ;->ᩳ:I

    iget v2, p0, Ll/ܿܳۘ;->ܽ:I

    if-ne v2, v0, :cond_1

    iget v3, p0, Ll/ܿܳۘ;->ۧ:I

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 322
    :cond_1
    :goto_0
    iget v3, p0, Ll/ܿܳۘ;->ۧ:I

    invoke-virtual {p0, v0, v3, v2, v1}, Ll/ܿܳۘ;->֫(IIII)V

    .line 323
    iput v2, p0, Ll/ܿܳۘ;->֫:I

    .line 324
    iput v1, p0, Ll/ܿܳۘ;->ۧ:I

    return-void
.end method

.method public final ֫(III)V
    .locals 1

    add-int v0, p1, p3

    add-int/2addr p3, p2

    .line 299
    invoke-virtual {p0, p1, p2, v0, p3}, Ll/ܿܳۘ;->ۧ(IIII)V

    return-void
.end method

.method public abstract ֫(IIII)V
.end method

.method public final ۧ()I
    .locals 1

    .line 279
    iget v0, p0, Ll/ܿܳۘ;->֫:I

    return v0
.end method

.method public final ۧ(IIII)V
    .locals 2

    if-ne p1, p3, :cond_0

    if-ne p2, p4, :cond_0

    return-void

    .line 310
    :cond_0
    iget v0, p0, Ll/ܿܳۘ;->֫:I

    if-ne v0, p1, :cond_1

    iget v1, p0, Ll/ܿܳۘ;->ۧ:I

    if-eq v1, p2, :cond_2

    .line 311
    :cond_1
    iget v1, p0, Ll/ܿܳۘ;->ۧ:I

    invoke-virtual {p0, v0, v1, p1, p2}, Ll/ܿܳۘ;->֫(IIII)V

    .line 313
    :cond_2
    iput p3, p0, Ll/ܿܳۘ;->֫:I

    .line 314
    iput p4, p0, Ll/ܿܳۘ;->ۧ:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 283
    iget v0, p0, Ll/ܿܳۘ;->ۧ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 291
    iget v0, p0, Ll/ܿܳۘ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 287
    iget v0, p0, Ll/ܿܳۘ;->ܽ:I

    return v0
.end method
