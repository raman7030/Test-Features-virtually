.class public final Ll/ܿۡܺ;
.super Ll/ܺᩴܺ;
.source "1BCD"


# instance fields
.field public ۙ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Ll/ܺᩴܺ;-><init>(I)V

    const/4 p1, -0x1

    .line 44
    iput p1, p0, Ll/ܿۡܺ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ܽۡܺ;)V
    .locals 0

    .line 77
    invoke-virtual {p0, p1, p2}, Ll/ܺᩴܺ;->֫(ILl/ۡᩴܺ;)V

    const/4 p1, -0x1

    .line 80
    iput p1, p0, Ll/ܿۡܺ;->ۙ:I

    return-void
.end method

.method public final ֫(Ll/ۡۡܺ;)V
    .locals 3

    .line 174
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 67
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۡܺ;

    .line 178
    invoke-virtual {v2}, Ll/ܽۡܺ;->ᩳ()Ll/ۖۡܺ;

    move-result-object v2

    .line 179
    invoke-virtual {v2, p1}, Ll/ۖۡܺ;->֫(Ll/ۡۡܺ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۠()I
    .locals 4

    .line 108
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 112
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->ۧ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۡܺ;

    if-eqz v3, :cond_0

    .line 114
    invoke-virtual {v3}, Ll/ܽۡܺ;->ᩳ()Ll/ۖۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v3

    add-int/2addr v3, v2

    move v2, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final ܶ()Ll/ܿۡܺ;
    .locals 2

    .line 216
    new-instance v0, Ll/ܿۡܺ;

    .line 53
    invoke-direct {v0, p0}, Ll/ܺᩴܺ;-><init>(Ll/ܿۡܺ;)V

    .line 54
    iget v1, p0, Ll/ܿۡܺ;->ۙ:I

    iput v1, v0, Ll/ܿۡܺ;->ۙ:I

    return-object v0
.end method

.method public final ܿ(I)Ll/ܽۡܺ;
    .locals 2

    .line 158
    invoke-virtual {p0, p1}, Ll/ܺᩴܺ;->ᩳ(I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 67
    invoke-virtual {p0, v0}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۡܺ;

    return-object p1

    .line 161
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 162
    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "no such label: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩸()I
    .locals 2

    .line 92
    iget v0, p0, Ll/ܿۡܺ;->ۙ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 93
    new-instance v0, Ll/ᩳۡܺ;

    invoke-direct {v0}, Ll/ᩳۡܺ;-><init>()V

    .line 94
    invoke-virtual {p0, v0}, Ll/ܿۡܺ;->֫(Ll/ۡۡܺ;)V

    .line 95
    invoke-virtual {v0}, Ll/ᩳۡܺ;->֫()I

    move-result v0

    iput v0, p0, Ll/ܿۡܺ;->ۙ:I

    .line 98
    :cond_0
    iget v0, p0, Ll/ܿۡܺ;->ۙ:I

    return v0
.end method
