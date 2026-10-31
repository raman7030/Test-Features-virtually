.class public final Ll/ܰۗ֫;
.super Ll/ᩴ᩹֫;
.source "18TA"


# instance fields
.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:[Ljava/lang/Object;

.field public final ܳ:[I

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩷:[Ll/ۙ᩵֫;

.field public final ᩻:[I


# direct methods
.method public constructor <init>(Ljava/util/List;Ll/֨ܽۧ;)V
    .locals 6

    .line 178
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Ll/ۙ᩵֫;

    .line 180
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۗ֫;

    add-int/lit8 v5, v3, 0x1

    .line 181
    invoke-interface {v4}, Ll/᩷ۗ֫;->֫()Ll/ۙ᩵֫;

    move-result-object v4

    aput-object v4, v0, v3

    move v3, v5

    goto :goto_0

    .line 168
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/Object;

    .line 170
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۗ֫;

    add-int/lit8 v4, v2, 0x1

    .line 171
    invoke-interface {v3}, Ll/᩷ۗ֫;->getUid()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    move v2, v4

    goto :goto_1

    .line 45
    :cond_1
    invoke-direct {p0, v0, v1, p2}, Ll/ܰۗ֫;-><init>([Ll/ۙ᩵֫;[Ljava/lang/Object;Ll/֨ܽۧ;)V

    return-void
.end method

.method public constructor <init>([Ll/ۙ᩵֫;[Ljava/lang/Object;Ll/֨ܽۧ;)V
    .locals 7

    .line 49
    invoke-direct {p0, p3}, Ll/ᩴ᩹֫;-><init>(Ll/֨ܽۧ;)V

    .line 50
    array-length p3, p1

    .line 51
    iput-object p1, p0, Ll/ܰۗ֫;->᩷:[Ll/ۙ᩵֫;

    .line 52
    new-array v0, p3, [I

    iput-object v0, p0, Ll/ܰۗ֫;->ܳ:[I

    .line 53
    new-array p3, p3, [I

    iput-object p3, p0, Ll/ܰۗ֫;->᩻:[I

    .line 54
    iput-object p2, p0, Ll/ܰۗ֫;->ۢ:[Ljava/lang/Object;

    .line 55
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Ll/ܰۗ֫;->ܿ:Ljava/util/HashMap;

    .line 59
    array-length p3, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    aget-object v4, p1, v0

    .line 60
    iget-object v5, p0, Ll/ܰۗ֫;->᩷:[Ll/ۙ᩵֫;

    aput-object v4, v5, v3

    .line 61
    iget-object v5, p0, Ll/ܰۗ֫;->᩻:[I

    aput v1, v5, v3

    .line 62
    iget-object v5, p0, Ll/ܰۗ֫;->ܳ:[I

    aput v2, v5, v3

    .line 63
    invoke-virtual {v4}, Ll/ۙ᩵֫;->ۧ()I

    move-result v4

    add-int/2addr v1, v4

    .line 64
    iget-object v4, p0, Ll/ܰۗ֫;->᩷:[Ll/ۙ᩵֫;

    aget-object v4, v4, v3

    invoke-virtual {v4}, Ll/ۙ᩵֫;->֫()I

    move-result v4

    add-int/2addr v2, v4

    .line 65
    iget-object v4, p0, Ll/ܰۗ֫;->ܿ:Ljava/util/HashMap;

    aget-object v5, p2, v3

    add-int/lit8 v6, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    move v3, v6

    goto :goto_0

    .line 67
    :cond_0
    iput v1, p0, Ll/ܰۗ֫;->ۡ:I

    .line 68
    iput v2, p0, Ll/ܰۗ֫;->ۜ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 119
    iget v0, p0, Ll/ܰۗ֫;->ۜ:I

    return v0
.end method

.method public final ֫(Ll/֨ܽۧ;)Ll/ܰۗ֫;
    .locals 5

    .line 137
    iget-object v0, p0, Ll/ܰۗ֫;->᩷:[Ll/ۙ᩵֫;

    array-length v1, v0

    new-array v1, v1, [Ll/ۙ᩵֫;

    const/4 v2, 0x0

    .line 138
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    .line 139
    new-instance v3, Ll/᩺ۗ֫;

    aget-object v4, v0, v2

    invoke-direct {v3, v4}, Ll/᩺ۗ֫;-><init>(Ll/ۙ᩵֫;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 163
    :cond_0
    new-instance v0, Ll/ܰۗ֫;

    iget-object v2, p0, Ll/ܰۗ֫;->ۢ:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p1}, Ll/ܰۗ֫;-><init>([Ll/ۙ᩵֫;[Ljava/lang/Object;Ll/֨ܽۧ;)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 114
    iget v0, p0, Ll/ܰۗ֫;->ۡ:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 2

    add-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    .line 78
    iget-object v1, p0, Ll/ܰۗ֫;->ܳ:[I

    invoke-static {v1, p1, v0, v0}, Ll/ۘ֨֫;->֫([IIZZ)I

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ܰۗ֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 89
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ܳ(I)I
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܰۗ֫;->᩻:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ(I)I
    .locals 2

    add-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    .line 83
    iget-object v1, p0, Ll/ܰۗ֫;->᩻:[I

    invoke-static {v1, p1, v0, v0}, Ll/ۘ֨֫;->֫([IIZZ)I

    move-result p1

    return p1
.end method

.method public final ܿ(I)I
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܰۗ֫;->ܳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ᩳ(I)Ljava/lang/Object;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ܰۗ֫;->ۢ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ᩳ()Ljava/util/List;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܰۗ֫;->᩷:[Ll/ۙ᩵֫;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻(I)Ll/ۙ᩵֫;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ܰۗ֫;->᩷:[Ll/ۙ᩵֫;

    aget-object p1, v0, p1

    return-object p1
.end method
