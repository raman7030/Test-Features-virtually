.class public Ll/ܽۖܺ;
.super Ll/ۗۘۢ;
.source "FBDV"


# instance fields
.field public final ۧ:Ll/᩷ᩴܺ;

.field public ܽ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    .line 29
    invoke-direct {p0, v0}, Ll/ۗۘۢ;-><init>(I)V

    .line 43
    new-instance v0, Ll/᩷ᩴܺ;

    invoke-direct {v0, p1}, Ll/᩷ᩴܺ;-><init>(I)V

    iput-object v0, p0, Ll/ܽۖܺ;->ۧ:Ll/᩷ᩴܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 51
    iget v0, p0, Ll/ܽۖܺ;->ܽ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 2

    .line 85
    iget-object v0, p0, Ll/ܽۖܺ;->ۧ:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 89
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩷ᩴܺ;->get(I)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 65
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ܽۖܺ;->ۧ:Ll/᩷ᩴܺ;

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 74
    invoke-virtual {p1, v0}, Ll/᩸ۡܺ;->ۧ(I)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1

    .line 71
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "no mapping specified for register"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(III)V
    .locals 3

    .line 125
    iget-object v0, p0, Ll/ܽۖܺ;->ۧ:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    .line 127
    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    sub-int v1, p1, v1

    :goto_0
    if-ltz v1, :cond_0

    const/4 v2, -0x1

    .line 128
    invoke-virtual {v0, v2}, Ll/᩷ᩴܺ;->add(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/᩷ᩴܺ;->set(II)V

    .line 134
    iget p1, p0, Ll/ܽۖܺ;->ܽ:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_1

    .line 135
    iput p2, p0, Ll/ܽۖܺ;->ܽ:I

    :cond_1
    return-void
.end method
