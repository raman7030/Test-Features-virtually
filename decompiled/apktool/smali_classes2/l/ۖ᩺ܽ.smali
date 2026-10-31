.class public final Ll/ۖ᩺ܽ;
.super Ljava/lang/Object;
.source "F15V"


# instance fields
.field public final ֫:I

.field public final synthetic ۧ:Ll/ۘ᩺ܽ;

.field public final ܽ:I

.field public final ܿ:Z

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۘ᩺ܽ;IIIZ)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩺ܽ;->ۧ:Ll/ۘ᩺ܽ;

    .line 212
    iput p2, p0, Ll/ۖ᩺ܽ;->֫:I

    .line 213
    iput p3, p0, Ll/ۖ᩺ܽ;->ᩳ:I

    .line 214
    iput p4, p0, Ll/ۖ᩺ܽ;->ܽ:I

    .line 215
    iput-boolean p5, p0, Ll/ۖ᩺ܽ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ۡۚ;Ll/֨۫֡;I)V
    .locals 7

    const/4 v0, -0x1

    .line 219
    iget v1, p0, Ll/ۖ᩺ܽ;->ܽ:I

    if-eq v1, v0, :cond_0

    .line 220
    iget-object v0, p0, Ll/ۖ᩺ܽ;->ۧ:Ll/ۘ᩺ܽ;

    iget-object v0, v0, Ll/ۘ᩺ܽ;->ۜ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget v1, p0, Ll/ۖ᩺ܽ;->֫:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/ۚܽۚ;

    .line 221
    iget v3, p0, Ll/ۖ᩺ܽ;->ᩳ:I

    iget-boolean v4, p0, Ll/ۖ᩺ܽ;->ܿ:Z

    move-object v1, p1

    move-object v5, p2

    move v6, p3

    invoke-static/range {v1 .. v6}, Ll/ۘ᩺ܽ;->֫(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V

    return-void

    .line 219
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/᩵ۡۚ;Ll/֨۫֡;I)V
    .locals 7

    const/4 v0, -0x1

    .line 225
    iget v1, p0, Ll/ۖ᩺ܽ;->ܽ:I

    if-eq v1, v0, :cond_0

    .line 226
    iget-object v0, p0, Ll/ۖ᩺ܽ;->ۧ:Ll/ۘ᩺ܽ;

    iget-object v0, v0, Ll/ۘ᩺ܽ;->᩷:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/ۚܽۚ;

    .line 227
    iget v3, p0, Ll/ۖ᩺ܽ;->ᩳ:I

    iget-boolean v4, p0, Ll/ۖ᩺ܽ;->ܿ:Z

    move-object v1, p1

    move-object v5, p2

    move v6, p3

    invoke-static/range {v1 .. v6}, Ll/ۘ᩺ܽ;->֫(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V

    return-void

    .line 225
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
