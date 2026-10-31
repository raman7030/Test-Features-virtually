.class public final Ll/ܳܳۘ;
.super Ll/ᩳܳۘ;
.source "01M8"


# instance fields
.field public final ۜ:Ljava/util/List;

.field public final ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    .line 370
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    .line 338
    invoke-direct {p0, v0, v1}, Ll/ܿܳۘ;-><init>(II)V

    .line 371
    iput-object p1, p0, Ll/ܳܳۘ;->᩻:Ljava/util/List;

    .line 372
    iput-object p2, p0, Ll/ܳܳۘ;->ۜ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(IIII)V
    .locals 6

    .line 377
    iget-object v0, p0, Ll/ܳܳۘ;->᩻:Ljava/util/List;

    iget-object v1, p0, Ll/ܳܳۘ;->ۜ:Ljava/util/List;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Ll/ۗܿۘ;->֫(Ljava/util/List;Ljava/util/List;IIII)Ll/᩹ܳۘ;

    move-result-object p1

    .line 378
    invoke-virtual {p1}, Ll/᩹ܳۘ;->֫()Z

    move-result p2

    if-nez p2, :cond_0

    .line 379
    iget p2, p1, Ll/᩹ܳۘ;->ܽ:I

    iget p3, p1, Ll/᩹ܳۘ;->ᩳ:I

    iget p4, p1, Ll/᩹ܳۘ;->֫:I

    iget p1, p1, Ll/᩹ܳۘ;->ۧ:I

    invoke-super {p0, p2, p3, p4, p1}, Ll/ᩳܳۘ;->֫(IIII)V

    :cond_0
    return-void
.end method
