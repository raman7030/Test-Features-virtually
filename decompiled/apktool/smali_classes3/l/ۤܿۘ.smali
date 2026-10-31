.class public final Ll/ۤܿۘ;
.super Ljava/lang/Object;
.source "K1MJ"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ᩶:Ll/۬ܿۘ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ܿۘ;II)V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 99
    iput v0, p0, Ll/ۤܿۘ;->᩸:I

    .line 100
    iput v0, p0, Ll/ۤܿۘ;->᩹:I

    .line 103
    iput-object p1, p0, Ll/ۤܿۘ;->᩶:Ll/۬ܿۘ;

    .line 104
    iput p2, p0, Ll/ۤܿۘ;->ۙ:I

    .line 105
    iput p3, p0, Ll/ۤܿۘ;->ۗ:I

    .line 107
    invoke-interface {p1}, Ll/۬ܿۘ;->֫()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 108
    invoke-interface {p1}, Ll/۬ܿۘ;->ᩳ()I

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p1}, Ll/۬ܿۘ;->ܿ()I

    move-result p2

    if-nez p2, :cond_0

    .line 109
    invoke-interface {p1}, Ll/۬ܿۘ;->ܽ()I

    move-result p2

    iput p2, p0, Ll/ۤܿۘ;->᩸:I

    .line 110
    invoke-interface {p1}, Ll/۬ܿۘ;->ۧ()I

    move-result p2

    iput p2, p0, Ll/ۤܿۘ;->᩹:I

    .line 111
    invoke-interface {p1}, Ll/۬ܿۘ;->next()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 118
    iget-object v0, p0, Ll/ۤܿۘ;->᩶:Ll/۬ܿۘ;

    invoke-interface {v0}, Ll/۬ܿۘ;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Ll/ۤܿۘ;->᩸:I

    iget v1, p0, Ll/ۤܿۘ;->ۙ:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll/ۤܿۘ;->᩹:I

    iget v1, p0, Ll/ۤܿۘ;->ۗ:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 6

    .line 123
    iget-object v0, p0, Ll/ۤܿۘ;->᩶:Ll/۬ܿۘ;

    invoke-interface {v0}, Ll/۬ܿۘ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 125
    new-instance v1, Ll/᩹ܳۘ;

    iget v2, p0, Ll/ۤܿۘ;->᩸:I

    invoke-interface {v0}, Ll/۬ܿۘ;->ᩳ()I

    move-result v3

    iget v4, p0, Ll/ۤܿۘ;->᩹:I

    invoke-interface {v0}, Ll/۬ܿۘ;->ܿ()I

    move-result v5

    invoke-direct {v1, v2, v3, v4, v5}, Ll/᩹ܳۘ;-><init>(IIII)V

    .line 127
    invoke-interface {v0}, Ll/۬ܿۘ;->ܽ()I

    move-result v2

    iput v2, p0, Ll/ۤܿۘ;->᩸:I

    .line 128
    invoke-interface {v0}, Ll/۬ܿۘ;->ۧ()I

    move-result v2

    iput v2, p0, Ll/ۤܿۘ;->᩹:I

    .line 130
    invoke-interface {v0}, Ll/۬ܿۘ;->next()V

    return-object v1

    .line 135
    :cond_0
    new-instance v0, Ll/᩹ܳۘ;

    iget v1, p0, Ll/ۤܿۘ;->᩸:I

    iget v2, p0, Ll/ۤܿۘ;->᩹:I

    iget v3, p0, Ll/ۤܿۘ;->ۙ:I

    iget v4, p0, Ll/ۤܿۘ;->ۗ:I

    invoke-direct {v0, v1, v3, v2, v4}, Ll/᩹ܳۘ;-><init>(IIII)V

    .line 137
    iput v3, p0, Ll/ۤܿۘ;->᩸:I

    .line 138
    iput v4, p0, Ll/ۤܿۘ;->᩹:I

    return-object v0
.end method
