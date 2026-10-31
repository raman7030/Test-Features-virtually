.class public final Ll/ۤܺܺ;
.super Ll/ᩴᩴܺ;
.source "LBBB"


# instance fields
.field public final ᩹:[Ll/ܰۡܺ;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    invoke-direct {p0, v1}, Ll/ᩴᩴܺ;-><init>(Z)V

    if-lt p1, v0, :cond_1

    .line 49
    new-array p1, p1, [Ll/ܰۡܺ;

    iput-object p1, p0, Ll/ۤܺܺ;->᩹:[Ll/ܰۡܺ;

    return-void

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size < 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final get(I)Ll/ܰۡܺ;
    .locals 4

    const-string v0, "invalid constant pool index "

    const/4 v1, 0x0

    .line 91
    :try_start_0
    iget-object v2, p0, Ll/ۤܺܺ;->᩹:[Ll/ܰۡܺ;

    aget-object v2, v2, p1

    if-eqz v2, :cond_0

    return-object v2

    .line 160
    :cond_0
    new-instance v2, Ll/۠ۧܺ;

    .line 161
    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 60
    invoke-direct {v2, v3, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 161
    throw v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    :catch_0
    new-instance v2, Ll/۠ۧܺ;

    .line 161
    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 60
    invoke-direct {v2, p1, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 161
    throw v2
.end method

.method public final size()I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۤܺܺ;->᩹:[Ll/ܰۡܺ;

    array-length v0, v0

    return v0
.end method

.method public final ֫(I)Ll/ܰۡܺ;
    .locals 2

    .line 66
    :try_start_0
    iget-object v0, p0, Ll/ۤܺܺ;->᩹:[Ll/ܰۡܺ;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 160
    :catch_0
    new-instance v0, Ll/۠ۧܺ;

    .line 161
    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "invalid constant pool index "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, p1, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 161
    throw v0
.end method

.method public final ֫(ILl/ܰۡܺ;)V
    .locals 4

    .line 121
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 123
    invoke-virtual {p2}, Ll/ܰۡܺ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-lt p1, v0, :cond_4

    const/4 v2, 0x0

    .line 129
    iget-object v3, p0, Ll/ۤܺܺ;->᩹:[Ll/ܰۡܺ;

    if-eqz v1, :cond_2

    .line 131
    array-length v1, v3

    sub-int/2addr v1, v0

    if-eq p1, v1, :cond_1

    add-int/lit8 v0, p1, 0x1

    .line 135
    aput-object v2, v3, v0

    goto :goto_1

    .line 132
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "(n == size - 1) && cst.isCategory2()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    .line 138
    aget-object v0, v3, p1

    if-nez v0, :cond_3

    add-int/lit8 v0, p1, -0x1

    .line 143
    aget-object v1, v3, v0

    if-eqz v1, :cond_3

    .line 144
    invoke-virtual {v1}, Ll/ܰۡܺ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 145
    aput-object v2, v3, v0

    .line 149
    :cond_3
    aput-object p2, v3, p1

    return-void

    .line 126
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n < 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
