.class public final Ll/᩷ܳܺ;
.super Ll/ܿᩴܺ;
.source "2BBU"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Ll/᩷ܳܺ;

    const/4 v1, 0x0

    .line 123
    invoke-direct {v0, v1}, Ll/ܿᩴܺ;-><init>(I)V

    return-void
.end method

.method public static ֫(Ll/ۗܿܺ;)Ll/᩷ܳܺ;
    .locals 10

    .line 75
    sget-object v0, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    .line 77
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 78
    new-array v2, v1, [Ll/ۜܳܺ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v0

    :goto_0
    if-ge v4, v1, :cond_3

    .line 83
    invoke-virtual {p0, v4}, Ll/ܿᩴܺ;->get(I)Ll/ۙܿܺ;

    move-result-object v7

    .line 85
    instance-of v8, v7, Ll/ܶܿܺ;

    if-eqz v8, :cond_0

    goto :goto_1

    .line 91
    :cond_0
    invoke-virtual {v7}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v8

    .line 93
    invoke-virtual {v8, v0}, Ll/ۤۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v8, v6}, Ll/ۤۡܺ;->֫(Ll/ۤۡܺ;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    .line 102
    :cond_1
    new-instance v6, Ll/ۜܳܺ;

    invoke-virtual {v7}, Ll/ۙܿܺ;->ܿ()I

    move-result v7

    invoke-direct {v6, v7, v8}, Ll/ۜܳܺ;-><init>(ILl/ۤۡܺ;)V

    aput-object v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    move-object v6, v8

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 108
    :cond_3
    new-instance p0, Ll/᩷ܳܺ;

    .line 123
    invoke-direct {p0, v5}, Ll/ܿᩴܺ;-><init>(I)V

    :goto_2
    if-ge v3, v5, :cond_4

    .line 110
    aget-object v0, v2, v3

    .line 145
    invoke-virtual {p0, v3, v0}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 113
    :cond_4
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ܺ()V

    return-object p0
.end method
