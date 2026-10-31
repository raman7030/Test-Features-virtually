.class public final Ll/ᩳ᩺᩻;
.super Ljava/lang/Object;
.source "R78M"


# direct methods
.method public static ֫(Ljava/lang/String;)I
    .locals 3

    const-string v0, "classes.dex"

    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    const/16 v1, 0x2f

    .line 56
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_3

    const-string v1, "classes"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ".dex"

    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    const/4 v2, 0x4

    .line 0
    invoke-static {v2, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_2

    goto :goto_0

    .line 65
    :cond_2
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x2

    if-lt p0, v1, :cond_3

    return p0

    :catch_0
    :cond_3
    :goto_0
    return v0
.end method

.method public static ֫()Ljava/util/Comparator;
    .locals 2

    .line 86
    new-instance v0, Ll/֫᩺᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    new-instance v1, Ll/ܶۗ᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 89
    invoke-static {v0, v1}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "L"

    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ";"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    const/16 v1, 0x2e

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "L"

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v2, ";"

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 29
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x2e

    const/16 v3, 0x2f

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
