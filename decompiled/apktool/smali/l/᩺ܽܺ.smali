.class public final Ll/᩺ܽܺ;
.super Ll/ܿᩴܺ;
.source "FBEZ"


# static fields
.field public static final ᩶:Ll/᩺ܽܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Ll/᩺ܽܺ;

    const/4 v1, 0x0

    .line 105
    invoke-direct {v0, v1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 33
    sput-object v0, Ll/᩺ܽܺ;->᩶:Ll/᩺ܽܺ;

    return-void
.end method

.method public static ֫(Ll/᩺ܽܺ;Ll/᩺ܽܺ;)Ll/᩺ܽܺ;
    .locals 6

    .line 45
    sget-object v0, Ll/᩺ܽܺ;->᩶:Ll/᩺ܽܺ;

    if-ne p0, v0, :cond_0

    return-object p1

    .line 50
    :cond_0
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 51
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 52
    new-instance v2, Ll/᩺ܽܺ;

    add-int v3, v0, v1

    .line 105
    invoke-direct {v2, v3}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    .line 115
    invoke-virtual {p0, v4}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۨܽܺ;

    .line 129
    invoke-virtual {v2, v4, v5}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v3, v1, :cond_2

    add-int p0, v0, v3

    .line 115
    invoke-virtual {p1, v3}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨܽܺ;

    .line 129
    invoke-virtual {v2, p0, v4}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {v2}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v2
.end method

.method public static ۧ(Ll/᩺ܽܺ;Ll/᩺ܽܺ;)Ll/᩺ܽܺ;
    .locals 8

    .line 82
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 83
    new-instance v1, Ll/᩺ܽܺ;

    .line 105
    invoke-direct {v1, v0}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 115
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨܽܺ;

    .line 163
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    .line 166
    invoke-virtual {p1, v5}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۨܽܺ;

    .line 168
    invoke-virtual {v6, v3}, Ll/ۨܽܺ;->֫(Ll/ۨܽܺ;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_2

    .line 89
    invoke-static {v6}, Ll/ۨܽܺ;->ۧ(Ll/ۨܽܺ;)Ll/۬ܺܺ;

    move-result-object v4

    .line 90
    invoke-virtual {v3, v4}, Ll/ۨܽܺ;->֫(Ll/۬ܺܺ;)Ll/ۨܽܺ;

    move-result-object v3

    .line 129
    :cond_2
    invoke-virtual {v1, v2, v3}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v1
.end method


# virtual methods
.method public final ֫(IIILl/۬ܺܺ;Ll/۬ܺܺ;Ll/۬ܺܺ;I)V
    .locals 8

    .line 149
    new-instance v7, Ll/ۨܽܺ;

    move-object v0, v7

    move v1, p2

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move v6, p7

    invoke-direct/range {v0 .. v6}, Ll/ۨܽܺ;-><init>(IILl/۬ܺܺ;Ll/۬ܺܺ;Ll/۬ܺܺ;I)V

    invoke-virtual {p0, p1, v7}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(II)Ll/ۨܽܺ;
    .locals 4

    .line 188
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 191
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨܽܺ;

    .line 193
    invoke-virtual {v2, p1, p2}, Ll/ۨܽܺ;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
