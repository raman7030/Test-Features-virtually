.class public final Ll/۟᩻ܿ;
.super Ljava/lang/Object;
.source "46Z2"


# instance fields
.field public final ֫:[Ljava/lang/String;

.field public final ۧ:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const v1, 0xffff

    if-gt v0, v1, :cond_3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 28
    invoke-interface {p1, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, p0, Ll/۟᩻ܿ;->֫:[Ljava/lang/String;

    new-array v1, v0, [Ljava/lang/String;

    .line 29
    invoke-interface {p2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iput-object p2, p0, Ll/۟᩻ܿ;->ۧ:[Ljava/lang/String;

    .line 30
    new-instance p2, Ljava/util/HashSet;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(I)V

    .line 31
    :goto_0
    iget-object p1, p0, Ll/۟᩻ܿ;->֫:[Ljava/lang/String;

    array-length v1, p1

    if-ge v0, v1, :cond_2

    .line 32
    aget-object p1, p1, v0

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iget-object v1, p0, Ll/۟᩻ܿ;->ۧ:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 38
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 39
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Duplicate childrenSyntax mapping selector: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "childrenSyntax mapping target is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void

    .line 26
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid childrenSyntax mapping"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ll/۟᩻ܿ;
    .locals 1

    .line 47
    new-instance v0, Ll/۟᩻ܿ;

    invoke-direct {v0, p0, p1}, Ll/۟᩻ܿ;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/۟᩻ܿ;
    .locals 5

    .line 52
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v0

    .line 53
    new-array v1, v0, [Ljava/lang/String;

    .line 54
    new-array v2, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 56
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    .line 57
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 60
    :cond_0
    :try_start_0
    new-instance p0, Ll/۟᩻ܿ;

    invoke-static {v1}, Ll/᩺۠ܽ;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v2}, Ll/᩺۠ܽ;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll/۟᩻ܿ;-><init>(Ljava/util/List;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 62
    :goto_1
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 4

    const-string v0, "{\n"

    .line 95
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 97
    :goto_0
    iget-object v1, p0, Ll/۟᩻ܿ;->֫:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    const-string v2, "\t"

    .line 98
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    aget-object v1, v1, v0

    const/16 v2, 0x22

    .line 109
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 533
    sget-object v3, Ll/ۤۘ֡;->ۧ:Ll/ۛۘ֡;

    invoke-virtual {v3, v1}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, " => "

    .line 100
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    iget-object v1, p0, Ll/۟᩻ܿ;->ۧ:[Ljava/lang/String;

    aget-object v1, v1, v0

    .line 109
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 533
    invoke-virtual {v3, v1}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    .line 102
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/util/LinkedHashMap;ZLjava/lang/String;)V
    .locals 7

    .line 81
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Ll/۟᩻ܿ;->֫:[Ljava/lang/String;

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(I)V

    const/4 v2, 0x0

    .line 82
    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_1

    .line 83
    aget-object v3, v1, v2

    invoke-static {v3, p2}, Ll/֫ۜܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    .line 84
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 89
    new-instance v4, Ll/ܰ᩻ܿ;

    aget-object v5, v1, v2

    iget-object v6, p0, Ll/۟᩻ܿ;->ۧ:[Ljava/lang/String;

    aget-object v6, v6, v2

    invoke-direct {v4, v5, v6}, Ll/ܰ᩻ܿ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Duplicate childrenSyntax selector in mapping \""

    const-string v0, "\": "

    .line 0
    invoke-static {p2, p3, v0}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 85
    aget-object p3, v1, v2

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 3

    .line 68
    iget-object v0, p0, Ll/۟᩻ܿ;->֫:[Ljava/lang/String;

    array-length v1, v0

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۡ(I)V

    const/4 v1, 0x0

    .line 69
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 70
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 71
    iget-object v2, p0, Ll/۟᩻ܿ;->ۧ:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
