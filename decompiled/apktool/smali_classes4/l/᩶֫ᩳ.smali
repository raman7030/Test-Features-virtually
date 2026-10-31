.class public final Ll/᩶֫ᩳ;
.super Ljava/lang/Object;
.source "U58Z"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩶֫ᩳ;->ۧ:Ljava/util/ArrayList;

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩶֫ᩳ;->֫:Ljava/util/HashMap;

    .line 21
    iput-object p1, p0, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;)V
    .locals 3

    const-string v0, "\""

    .line 101
    instance-of v1, p0, Ll/᩶᩸ᩳ;

    if-eqz v1, :cond_0

    check-cast p0, Ll/᩶᩸ᩳ;

    .line 102
    invoke-interface {p0}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p0

    .line 103
    :try_start_0
    invoke-static {p0}, Ll/᩶֫ᩳ;->֫(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    invoke-virtual {p0}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 102
    :try_start_1
    invoke-virtual {p0}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    .line 107
    :cond_0
    new-instance v1, Ll/ۡۧᩳ;

    invoke-direct {v1, p0}, Ll/ۡۧᩳ;-><init>(Ljava/lang/CharSequence;)V

    .line 110
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ll/ۡۧᩳ;->ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    .line 111
    invoke-static {p0}, Ll/ۡۧᩳ;->ۧ(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v1, v0}, Ll/ۡۧᩳ;->֫(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v1}, Ll/ۡۧᩳ;->ܽ()Ljava/lang/String;

    .line 114
    invoke-virtual {v1, v0}, Ll/ۡۧᩳ;->֫(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v1}, Ll/ۡۧᩳ;->ܽ()Ljava/lang/String;

    const-string p0, "}"

    .line 116
    invoke-virtual {v1, p0}, Ll/ۡۧᩳ;->֫(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :cond_1
    return-void

    :catchall_2
    move-exception p0

    .line 120
    new-instance v0, Ll/ۙ֫ᩳ;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Ll/ۡۧᩳ;->֫()I

    move-result v1

    invoke-direct {v0, p0, v1}, Ll/ۙ֫ᩳ;-><init>(Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 153
    const-class v0, Ll/᩶֫ᩳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 154
    :cond_1
    check-cast p1, Ll/᩶֫ᩳ;

    .line 155
    iget-object v0, p0, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 160
    iget-object v2, p0, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۗ֫ᩳ;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩶֫ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ֫ᩳ;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩶֫ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 34
    iget-object v0, p0, Ll/᩶֫ᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 47
    iget-object v0, p0, Ll/᩶֫ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ֫ᩳ;

    if-eqz v1, :cond_0

    .line 13
    iput-object p2, v1, Ll/ۗ֫ᩳ;->֫:Ljava/lang/String;

    return-void

    .line 51
    :cond_0
    new-instance v1, Ll/ۗ֫ᩳ;

    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, v1, Ll/ۗ֫ᩳ;->ۧ:Ljava/lang/String;

    .line 30
    iput-object p2, v1, Ll/ۗ֫ᩳ;->֫:Ljava/lang/String;

    .line 52
    iget-object p2, p0, Ll/᩶֫ᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final ۧ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Ll/֫ۧᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩶֫ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()V
    .locals 6

    .line 63
    iget-object v0, p0, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Ll/֫ۧᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x400

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 126
    iget-object v2, p0, Ll/᩶֫ᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ֫ᩳ;

    .line 127
    iget-object v4, v3, Ll/ۗ֫ᩳ;->ۧ:Ljava/lang/String;

    .line 128
    iget-object v3, v3, Ll/ۗ֫ᩳ;->֫:Ljava/lang/String;

    if-eqz v4, :cond_0

    if-eqz v3, :cond_0

    .line 129
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    const-string v5, "{\r\n  \""

    .line 131
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    invoke-static {v4}, Ll/ۡۧᩳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\"\r\n  \""

    .line 136
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-static {v3}, Ll/ۡۧᩳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\"\r\n}\r\n"

    .line 141
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 147
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 979
    new-instance v2, Ll/ۡ᩵ܿ;

    invoke-direct {v2, v1}, Ll/ۡ᩵ܿ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->֫(Ll/۬֡ܿ;)V

    return-void
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/᩶֫ᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()V
    .locals 5

    const-string v0, "\""

    .line 71
    invoke-virtual {p0}, Ll/᩶֫ᩳ;->֫()V

    const/4 v1, 0x0

    .line 63
    :try_start_0
    iget-object v2, p0, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    invoke-static {v2}, Ll/֫ۧᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v2

    .line 76
    new-instance v3, Ll/ۡۧᩳ;

    invoke-direct {v3, v2}, Ll/ۡۧᩳ;-><init>(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    :goto_0
    :try_start_1
    invoke-virtual {v3}, Ll/ۡۧᩳ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    .line 79
    invoke-static {v1}, Ll/ۡۧᩳ;->ۧ(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v3, v0}, Ll/ۡۧᩳ;->֫(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v3}, Ll/ۡۧᩳ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-virtual {v3, v0}, Ll/ۡۧᩳ;->֫(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v3}, Ll/ۡۧᩳ;->ܽ()Ljava/lang/String;

    move-result-object v2

    const-string v4, "}"

    .line 84
    invoke-virtual {v3, v4}, Ll/ۡۧᩳ;->֫(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p0, v1, v2}, Ll/᩶֫ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    move-object v1, v3

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v1, :cond_1

    .line 90
    new-instance v2, Ll/ۙ֫ᩳ;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ll/ۡۧᩳ;->֫()I

    move-result v1

    invoke-direct {v2, v0, v1}, Ll/ۙ֫ᩳ;-><init>(Ljava/lang/String;I)V

    throw v2

    .line 92
    :cond_1
    throw v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/᩶֫ᩳ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
