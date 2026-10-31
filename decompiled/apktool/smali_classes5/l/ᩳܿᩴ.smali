.class public abstract Ll/ᩳܿᩴ;
.super Ll/᩹ܽᩴ;
.source "OAQ5"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 740
    iput p1, p0, Ll/ᩳܿᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4150

    return v0
.end method

.method public final estimateSize()J
    .locals 4

    .line 843
    invoke-virtual {p0}, Ll/ᩳܿᩴ;->֫()I

    move-result v0

    int-to-long v0, v0

    iget v2, p0, Ll/ᩳܿᩴ;->᩸:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 725
    check-cast p1, Ll/ۘᩳᩴ;

    invoke-virtual {p0, p1}, Ll/ᩳܿᩴ;->֫(Ll/ۘᩳᩴ;)V

    return-void
.end method

.method public bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 725
    check-cast p1, Ll/ۘᩳᩴ;

    invoke-virtual {p0, p1}, Ll/ᩳܿᩴ;->ۧ(Ll/ۘᩳᩴ;)Z

    move-result p1

    return p1
.end method

.method public abstract ֫(I)F
.end method

.method public abstract ֫()I
.end method

.method public abstract ֫(II)Ll/ܽܿᩴ;
.end method

.method public ֫(Ll/ۘᩳᩴ;)V
    .locals 2

    .line 855
    invoke-virtual {p0}, Ll/ᩳܿᩴ;->֫()I

    move-result v0

    :goto_0
    iget v1, p0, Ll/ᩳܿᩴ;->᩸:I

    if-ge v1, v0, :cond_0

    .line 856
    invoke-virtual {p0, v1}, Ll/ᩳܿᩴ;->֫(I)F

    move-result v1

    invoke-interface {p1, v1}, Ll/ۘᩳᩴ;->֫(F)V

    .line 855
    iget v1, p0, Ll/ᩳܿᩴ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ᩳܿᩴ;->᩸:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۧ(Ll/ۘᩳᩴ;)Z
    .locals 2

    .line 848
    iget v0, p0, Ll/ᩳܿᩴ;->᩸:I

    invoke-virtual {p0}, Ll/ᩳܿᩴ;->֫()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 849
    :cond_0
    iget v0, p0, Ll/ᩳܿᩴ;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ᩳܿᩴ;->᩸:I

    invoke-virtual {p0, v0}, Ll/ᩳܿᩴ;->֫(I)F

    move-result v0

    invoke-interface {p1, v0}, Ll/ۘᩳᩴ;->֫(F)V

    const/4 p1, 0x1

    return p1
.end method
