.class public abstract Ll/ܽۙۡ;
.super Ljava/lang/Object;
.source "A3Q2"


# direct methods
.method public static ֫(Ll/ۚܽۚ;Ll/᩹ۗۡ;)Ll/ܽۙۡ;
    .locals 8

    .line 20
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "("

    const/4 v4, 0x0

    .line 23
    aput-object v3, v2, v4

    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x1

    :goto_0
    if-ge v4, v3, :cond_0

    add-int/lit8 v6, v5, 0x1

    .line 25
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Ll/᩹ۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v2, v5

    add-int/lit8 v4, v4, 0x1

    move v5, v6

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v5, 0x1

    const-string v3, ")"

    .line 27
    aput-object v3, v2, v5

    .line 28
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩹ۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v2, v0

    .line 29
    new-instance p0, Ll/֫ۙۡ;

    invoke-direct {p0, v2, v1}, Ll/֫ۙۡ;-><init>([Ljava/lang/String;I)V

    return-object p0
.end method

.method public static ֫(Ll/ᩴܽۚ;Ll/᩹ۗۡ;)Ll/ܽۙۡ;
    .locals 0

    .line 33
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩹ۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 34
    new-instance p1, Ll/ۧۙۡ;

    invoke-direct {p1, p0}, Ll/ۧۙۡ;-><init>(Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract hashCode()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 61
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public abstract ֫()Ljava/lang/String;
.end method
