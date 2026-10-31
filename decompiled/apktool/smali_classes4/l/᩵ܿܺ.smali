.class public final Ll/᩵ܿܺ;
.super Ljava/lang/Object;
.source "IBF1"


# instance fields
.field public final ֫:[Ll/ܶܿܺ;

.field public final ۧ:[Ll/ܶܿܺ;

.field public final ܽ:[Ll/ܶܿܺ;


# direct methods
.method public constructor <init>(Ll/۬ۡܺ;)V
    .locals 8

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p1}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ll/ܺᩴܺ;->֨()I

    move-result v0

    .line 59
    new-array v1, v0, [Ll/ܶܿܺ;

    iput-object v1, p0, Ll/᩵ܿܺ;->ܽ:[Ll/ܶܿܺ;

    .line 60
    new-array v1, v0, [Ll/ܶܿܺ;

    iput-object v1, p0, Ll/᩵ܿܺ;->ۧ:[Ll/ܶܿܺ;

    .line 61
    new-array v0, v0, [Ll/ܶܿܺ;

    iput-object v0, p0, Ll/᩵ܿܺ;->֫:[Ll/ܶܿܺ;

    .line 133
    invoke-virtual {p1}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object p1

    .line 134
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 137
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/ܽۡܺ;

    move-result-object v3

    .line 138
    invoke-virtual {v3}, Ll/ܽۡܺ;->֫()I

    move-result v4

    .line 139
    invoke-virtual {v3}, Ll/ܽۡܺ;->ᩳ()Ll/ۖۡܺ;

    move-result-object v5

    invoke-virtual {v5, v1}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v5

    .line 141
    iget-object v6, p0, Ll/᩵ܿܺ;->ܽ:[Ll/ܶܿܺ;

    new-instance v7, Ll/ܶܿܺ;

    invoke-virtual {v5}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v5

    .line 42
    invoke-direct {v7, v5, v1}, Ll/ܶܿܺ;-><init>(Ll/ۤۡܺ;Z)V

    .line 141
    aput-object v7, v6, v4

    .line 143
    invoke-virtual {v3}, Ll/ܽۡܺ;->ܿ()Ll/ܺۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v3

    .line 145
    iget-object v5, p0, Ll/᩵ܿܺ;->ۧ:[Ll/ܶܿܺ;

    new-instance v6, Ll/ܶܿܺ;

    .line 42
    invoke-direct {v6, v3, v1}, Ll/ܶܿܺ;-><init>(Ll/ۤۡܺ;Z)V

    .line 145
    aput-object v6, v5, v4

    .line 146
    iget-object v5, p0, Ll/᩵ܿܺ;->֫:[Ll/ܶܿܺ;

    new-instance v6, Ll/ܶܿܺ;

    .line 42
    invoke-direct {v6, v3, v1}, Ll/ܶܿܺ;-><init>(Ll/ۤۡܺ;Z)V

    .line 146
    aput-object v6, v5, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ܶܿܺ;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/᩵ܿܺ;->ܽ:[Ll/ܶܿܺ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(Ll/ܽۡܺ;)Ll/ܶܿܺ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/᩵ܿܺ;->֫:[Ll/ܶܿܺ;

    invoke-virtual {p1}, Ll/ܽۡܺ;->֫()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۧ(Ll/ܽۡܺ;)Ll/ܶܿܺ;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/᩵ܿܺ;->ۧ:[Ll/ܶܿܺ;

    invoke-virtual {p1}, Ll/ܽۡܺ;->֫()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܽ(Ll/ܽۡܺ;)Ll/ܶܿܺ;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩵ܿܺ;->ܽ:[Ll/ܶܿܺ;

    invoke-virtual {p1}, Ll/ܽۡܺ;->֫()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method
