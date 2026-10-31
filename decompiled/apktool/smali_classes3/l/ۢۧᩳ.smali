.class public final Ll/ۢۧᩳ;
.super Ljava/lang/Object;
.source "T5CS"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/util/LinkedHashSet;
    .locals 6

    .line 15
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    const/16 v3, 0x25

    .line 17
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 18
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v3, :cond_1

    const/4 v2, -0x1

    if-ne v4, v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v4

    goto :goto_0

    .line 24
    :cond_1
    new-instance v3, Ll/᩷ۧᩳ;

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v3, p0, v2}, Ll/᩷ۧᩳ;-><init>(Ljava/lang/String;I)V

    .line 25
    invoke-virtual {v3}, Ll/᩷ۧᩳ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-virtual {v3}, Ll/᩷ۧᩳ;->֫()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object v0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method
