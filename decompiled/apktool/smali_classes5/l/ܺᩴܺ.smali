.class public Ll/ܺᩴܺ;
.super Ll/ܿᩴܺ;
.source "LBEV"


# instance fields
.field public final ᩶:Ll/᩷ᩴܺ;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 37
    new-instance v0, Ll/᩷ᩴܺ;

    invoke-direct {v0, p1}, Ll/᩷ᩴܺ;-><init>(I)V

    iput-object v0, p0, Ll/ܺᩴܺ;->᩶:Ll/᩷ᩴܺ;

    return-void
.end method

.method public constructor <init>(Ll/ܿۡܺ;)V
    .locals 3

    .line 46
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    invoke-direct {p0, v0}, Ll/ܿᩴܺ;-><init>(I)V

    .line 47
    iget-object v0, p1, Ll/ܺᩴܺ;->᩶:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->ۚ()Ll/᩷ᩴܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ܺᩴܺ;->᩶:Ll/᩷ᩴܺ;

    .line 49
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 52
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    .line 54
    invoke-virtual {p0, v1, v2}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֨()I
    .locals 3

    .line 65
    iget-object v0, p0, Ll/ܺᩴܺ;->᩶:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 69
    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 75
    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->ᩳ(I)V

    return v1
.end method

.method public ֫(ILl/֡ܽܺ;)V
    .locals 0

    .line 72
    invoke-virtual {p0, p1, p2}, Ll/ܺᩴܺ;->֫(ILl/ۡᩴܺ;)V

    return-void
.end method

.method public final ֫(ILl/ۡᩴܺ;)V
    .locals 5

    .line 180
    invoke-virtual {p0, p1}, Ll/ܿᩴܺ;->ۧ(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡᩴܺ;

    .line 182
    invoke-virtual {p0, p1, p2}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    const/4 v1, -0x1

    .line 184
    iget-object v2, p0, Ll/ܺᩴܺ;->᩶:Ll/᩷ᩴܺ;

    if-eqz v0, :cond_0

    .line 185
    invoke-interface {v0}, Ll/ۡᩴܺ;->֫()I

    move-result v0

    .line 86
    invoke-virtual {v2, v0, v1}, Ll/᩷ᩴܺ;->set(II)V

    :cond_0
    if-eqz p2, :cond_2

    .line 189
    invoke-interface {p2}, Ll/ۡᩴܺ;->֫()I

    move-result p2

    .line 96
    invoke-virtual {v2}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    sub-int v4, p2, v0

    if-gt v3, v4, :cond_1

    .line 99
    invoke-virtual {v2, v1}, Ll/᩷ᩴܺ;->add(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {v2, p2, p1}, Ll/᩷ᩴܺ;->set(II)V

    :cond_2
    return-void
.end method

.method public final ۚ()V
    .locals 4

    .line 151
    invoke-super {p0}, Ll/ܿᩴܺ;->ۚ()V

    .line 162
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 165
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡᩴܺ;

    .line 168
    iget-object v3, p0, Ll/ܺᩴܺ;->᩶:Ll/᩷ᩴܺ;

    invoke-interface {v2}, Ll/ۡᩴܺ;->֫()I

    move-result v2

    invoke-virtual {v3, v2, v1}, Ll/᩷ᩴܺ;->set(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ(I)I
    .locals 2

    .line 114
    iget-object v0, p0, Ll/ܺᩴܺ;->᩶:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 117
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩷ᩴܺ;->get(I)I

    move-result p1

    return p1
.end method
