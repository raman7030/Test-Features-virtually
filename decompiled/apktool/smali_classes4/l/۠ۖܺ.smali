.class public final Ll/۠ۖܺ;
.super Ll/ܽۖܺ;
.source "EBCZ"


# instance fields
.field public final ܿ:Ll/᩹ۘܺ;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩹ۘܺ;I)V
    .locals 0

    .line 58
    invoke-direct {p0, p2}, Ll/ܽۖܺ;-><init>(I)V

    .line 60
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/۠ۖܺ;->ᩳ:Ljava/util/ArrayList;

    .line 61
    iput-object p1, p0, Ll/۠ۖܺ;->ܿ:Ll/᩹ۘܺ;

    return-void
.end method

.method private ֫(II)V
    .locals 3

    add-int/lit8 v0, p1, 0x1

    .line 124
    iget-object v1, p0, Ll/۠ۖܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 126
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt p1, v2, :cond_0

    .line 127
    new-instance v2, Ll/᩺ۘܺ;

    invoke-direct {v2, v0}, Ll/᩺ۘܺ;-><init>(I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 131
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢᩴܺ;

    .line 130
    iget-object v0, p0, Ll/۠ۖܺ;->ܿ:Ll/᩹ۘܺ;

    invoke-virtual {v0, p2, p1}, Ll/᩹ۘܺ;->֫(ILl/ۢᩴܺ;)V

    return-void
.end method


# virtual methods
.method public final ֫(III)V
    .locals 1

    .line 69
    invoke-super {p0, p1, p2, p3}, Ll/ܽۖܺ;->֫(III)V

    .line 71
    invoke-direct {p0, p2, p1}, Ll/۠ۖܺ;->֫(II)V

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    add-int/lit8 p2, p2, 0x1

    .line 74
    invoke-direct {p0, p2, p1}, Ll/۠ۖܺ;->֫(II)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩶ۡܺ;II)Z
    .locals 6

    .line 148
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 151
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    .line 152
    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    invoke-virtual {p0, v4}, Ll/ܽۖܺ;->֫(I)I

    move-result v4

    if-eq v4, p2, :cond_2

    .line 159
    invoke-virtual {v3}, Ll/᩸ۡܺ;->ۧ()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_0

    add-int/lit8 v3, v4, 0x1

    if-eq v3, p2, :cond_2

    :cond_0
    if-ne p3, v5, :cond_1

    add-int/lit8 v3, p2, 0x1

    if-ne v4, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final ۧ(III)Z
    .locals 3

    .line 88
    iget-object v0, p0, Ll/۠ۖܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lt p2, v1, :cond_0

    return v2

    .line 91
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢᩴܺ;

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x1

    if-ne p3, v1, :cond_2

    .line 96
    invoke-interface {v0, p1}, Ll/ۢᩴܺ;->֫(I)Z

    move-result p1

    return p1

    .line 98
    :cond_2
    invoke-interface {v0, p1}, Ll/ۢᩴܺ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_4

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    .line 99
    invoke-virtual {p0, p1, p2, p3}, Ll/۠ۖܺ;->ۧ(III)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_0
    return v1
.end method
