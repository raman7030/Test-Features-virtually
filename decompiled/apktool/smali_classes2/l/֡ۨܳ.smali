.class public final Ll/֡ۨܳ;
.super Ljava/lang/Object;
.source "G73R"


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֡ۨܳ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 17
    iget-object v0, p0, Ll/֡ۨܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x2f

    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 28
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Ll/֡ۨܳ;->֫:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 29
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 31
    :cond_1
    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    .line 40
    invoke-static {p1, p2}, Ll/ܿ֡ܿ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/16 v1, 0x2f

    .line 53
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    move-object v2, p2

    goto :goto_0

    .line 55
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    add-int/2addr v2, v3

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 56
    :goto_0
    invoke-static {v2, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    .line 42
    iget-object v5, p0, Ll/֡ۨܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    return-object p2

    .line 47
    :cond_1
    invoke-static {v2, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    if-ne v2, v4, :cond_2

    const-string p1, ""

    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 64
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const-string v3, "/"

    if-eqz v2, :cond_3

    new-array p1, v0, [Ljava/lang/String;

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 65
    :goto_2
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    new-array p2, v0, [Ljava/lang/String;

    goto :goto_3

    .line 66
    :cond_4
    invoke-virtual {p2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 69
    :goto_3
    array-length v2, p1

    if-ge v0, v2, :cond_5

    array-length v2, p2

    if-ge v0, v2, :cond_5

    aget-object v2, p1, v0

    aget-object v3, p2, v0

    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 74
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move v3, v0

    .line 75
    :goto_4
    array-length v4, p1

    if-ge v3, v4, :cond_7

    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_6

    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    const-string v4, ".."

    .line 79
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 81
    :cond_7
    :goto_5
    array-length p1, p2

    if-ge v0, p1, :cond_9

    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-lez p1, :cond_8

    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    :cond_8
    aget-object p1, p2, v0

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 87
    :cond_9
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-nez p1, :cond_a

    const-string p1, "."

    return-object p1

    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
