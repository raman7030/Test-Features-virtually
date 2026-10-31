.class public final Ll/ᩴܿܳ;
.super Ljava/lang/Object;
.source "D6KJ"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/ᩴܿܳ;->ܽ:Ljava/lang/String;

    .line 42
    invoke-static {p2}, Ll/ᩴܿܳ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܿܳ;->ۧ:Ljava/lang/String;

    .line 43
    invoke-static {p3}, Ll/ᩴܿܳ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    new-instance p3, Ll/ۘܿܳ;

    invoke-direct {p3, p2, p4}, Ll/ۘܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    .line 51
    :goto_0
    iget-object p3, p0, Ll/ᩴܿܳ;->ۧ:Ljava/lang/String;

    const/16 p4, 0x2f

    invoke-virtual {p3, p4, p2}, Ljava/lang/String;->indexOf(II)I

    move-result p3

    if-ltz p3, :cond_0

    .line 52
    new-instance p4, Ll/ۘܿܳ;

    iget-object v0, p0, Ll/ᩴܿܳ;->ۧ:Ljava/lang/String;

    add-int/lit8 v1, p3, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/ᩴܿܳ;->ۧ:Ljava/lang/String;

    .line 53
    invoke-virtual {v2, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p4, v0, p2}, Ll/ۘܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move p2, v1

    goto :goto_0

    .line 56
    :cond_0
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܿܳ;->֫:Ljava/util/List;

    return-void

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "HTML document is outside the root boundary"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/"

    .line 152
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    const-string v0, ":"

    .line 0
    invoke-static {p0, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "\u0000"

    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 153
    invoke-static {p2}, Ll/ᩴܿܳ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗ᩻᩻;)Ljava/lang/String;
    .locals 3

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "network:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۗ᩻᩻;->᩶:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u0000"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۗ᩻᩻;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 120
    invoke-static {p0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܰܺܳ;)Ljava/lang/String;
    .locals 1

    .line 158
    instance-of v0, p0, Ll/᩵ۙ᩻;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩵ۙ᩻;

    invoke-virtual {p0}, Ll/᩵ۙ᩻;->᩵()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 159
    :cond_0
    instance-of v0, p0, Ll/ܿ᩸᩻;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ܿ᩸᩻;

    invoke-virtual {p0}, Ll/ܿ᩸᩻;->ۘ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 160
    :cond_1
    instance-of v0, p0, Ll/ۖۛܳ;

    if-eqz v0, :cond_2

    check-cast p0, Ll/ۖۛܳ;

    invoke-virtual {p0}, Ll/ۖۛܳ;->ۜ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ܽ᩷ܳ;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7

    .line 126
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->᩷()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 127
    :cond_0
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->᩷()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v0

    .line 129
    instance-of v1, v0, Ll/ۖۧ᩻;

    const-string v2, "local"

    if-eqz v1, :cond_1

    return-object v2

    .line 130
    :cond_1
    instance-of v1, v0, Ll/ۗۢ᩻;

    if-eqz v1, :cond_2

    check-cast v0, Ll/ۗۢ᩻;

    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۜ()Ll/ۗ᩻᩻;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴܿܳ;->֫(Ll/ۗ᩻᩻;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 131
    :cond_2
    invoke-static {v0}, Ll/ᩴܿܳ;->֫(Ll/ܰܺܳ;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto/16 :goto_1

    .line 133
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ᩷ܳ;

    .line 134
    invoke-virtual {v4}, Ll/ܽ᩷ܳ;->᩷()I

    move-result v5

    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->֨()I

    move-result v6

    if-eq v5, v6, :cond_4

    goto :goto_0

    .line 135
    :cond_4
    invoke-virtual {v4}, Ll/ܽ᩷ܳ;->ۚ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۢܳ;

    .line 136
    invoke-virtual {v3}, Ll/ۛۢܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 137
    invoke-static {v4, p1, p2}, Ll/ᩴܿܳ;->֫(Ll/ܽ᩷ܳ;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_1

    .line 138
    :cond_6
    invoke-virtual {v0}, Ll/ܰܺܳ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3}, Ll/ۛۢܳ;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p0, p2}, Ll/ᩴܿܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 144
    :cond_7
    sget-object p0, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_9

    sget-object p0, Ll/ܽ֡ܿ;->ܽ:Ll/ܶ᩵ܿ;

    .line 145
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_9

    sget-object p0, Ll/ܽ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    .line 146
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_1

    .line 147
    :cond_8
    invoke-virtual {v0}, Ll/ܰܺܳ;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1}, Ll/ܿ֡ܿ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v2, p1}, Ll/ᩴܿܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۢۘܳ;)Ljava/util/ArrayList;
    .locals 2

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 166
    invoke-virtual {p0}, Ll/ۢۘܳ;->᩷()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    invoke-virtual {p0}, Ll/ۢۘܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    invoke-virtual {p0}, Ll/ۢۘܳ;->ۧ()V

    .line 170
    :try_start_0
    invoke-virtual {p0}, Ll/ۢۘܳ;->᩻()Ll/ۨ᩸ۡ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    invoke-virtual {p0}, Ll/ۢۘܳ;->ܽ()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Ll/ۢۘܳ;->ܽ()V

    .line 173
    throw v0
.end method

.method public static ֫(Ll/ܽۢܳ;)Ljava/util/List;
    .locals 9

    .line 179
    invoke-virtual {p0}, Ll/ܽۢܳ;->᩹()Ll/ܰܺܳ;

    move-result-object v0

    .line 180
    invoke-static {v0}, Ll/ᩴܿܳ;->֫(Ll/ܰܺܳ;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 181
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 182
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 183
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    instance-of v1, v0, Ll/ܿ᩸᩻;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ll/ܿ᩸᩻;

    invoke-virtual {v1}, Ll/ܿ᩸᩻;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    :cond_1
    instance-of v1, v0, Ll/ۖۛܳ;

    if-eqz v1, :cond_2

    check-cast v0, Ll/ۖۛܳ;

    .line 186
    invoke-virtual {v0}, Ll/ۖۛܳ;->ۘ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡۛܳ;

    invoke-virtual {v1}, Ll/ۡۛܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 188
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 189
    invoke-virtual {p0}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴܿܳ;->֫(Ll/ۢۘܳ;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽ᩷ܳ;

    .line 190
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 191
    invoke-virtual {v1, v4}, Ll/ܽ᩷ܳ;->֫(Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_4

    .line 193
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-object v0
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)Ll/ᩴܿܳ;
    .locals 6

    .line 68
    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v1

    .line 70
    instance-of v2, v1, Ll/ۖۧ᩻;

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴܿܳ;->ܽ(Ljava/lang/String;)Ll/ᩴܿܳ;

    move-result-object p0

    return-object p0

    .line 71
    :cond_0
    instance-of v2, v1, Ll/ۗۢ᩻;

    const/4 v3, 0x0

    const-string v4, "/"

    if-eqz v2, :cond_2

    check-cast v1, Ll/ۗۢ᩻;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    .line 106
    invoke-virtual {v1}, Ll/ۗۢ᩻;->ۜ()Ll/ۗ᩻᩻;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗ᩻᩻;->getName()Ljava/lang/String;

    move-result-object p1

    .line 108
    instance-of v0, v1, Ll/۬֡᩻;

    if-eqz v0, :cond_1

    const/16 v0, 0x2f

    const/4 v2, 0x1

    .line 109
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-le v0, v2, :cond_1

    add-int/lit8 v4, v0, 0x1

    .line 111
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v3, " / "

    .line 0
    invoke-static {p1, v3}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 112
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 115
    :cond_1
    new-instance v0, Ll/ᩴܿܳ;

    invoke-virtual {v1}, Ll/ۗۢ᩻;->ۜ()Ll/ۗ᩻᩻;

    move-result-object v1

    invoke-static {v1}, Ll/ᩴܿܳ;->֫(Ll/ۗ᩻᩻;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0, v4, p1}, Ll/ᩴܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 72
    :cond_2
    invoke-static {v1}, Ll/ᩴܿܳ;->֫(Ll/ܰܺܳ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 74
    invoke-virtual {p0}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴܿܳ;->֫(Ll/ۢۘܳ;)Ljava/util/ArrayList;

    move-result-object p0

    .line 75
    new-instance v2, Ll/ᩴܿܳ;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, p0, v5}, Ll/ᩴܿܳ;->֫(Ll/ܽ᩷ܳ;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/String;

    .line 76
    invoke-static {v1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p0, p1, v4, v0}, Ll/ᩴܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 73
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported HTML preview source"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ᩴܿܳ;
    .locals 5

    .line 81
    invoke-static {p0}, Ll/ᩴܿܳ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܿ֡ܿ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x7f1208bf

    .line 83
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-static {p0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 85
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1209e3

    .line 86
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 88
    invoke-static {p0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩹֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 90
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܿ()Ll/ۡܶܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 92
    iget-object v0, v0, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_1

    .line 94
    :cond_2
    invoke-static {p0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 95
    iget-object v0, v1, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    .line 96
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 97
    iget-object v1, v1, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :cond_3
    move-object v0, v2

    goto :goto_1

    :cond_4
    const-string v1, "/"

    goto :goto_0

    .line 101
    :goto_1
    new-instance v2, Ll/ᩴܿܳ;

    const-string v3, "local"

    invoke-direct {v2, v3, p0, v0, v1}, Ll/ᩴܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public static ܿ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "/"

    .line 207
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Invalid HTML preview path"

    if-eqz v1, :cond_1

    .line 208
    invoke-static {p0}, Ll/ۜܿܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 210
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 209
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 207
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 202
    invoke-static {p0}, Ll/ᩴܿܳ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "/"

    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    .line 214
    :goto_0
    iget-object v1, p0, Ll/ᩴܿܳ;->֫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 215
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘܿܳ;

    invoke-static {v1}, Ll/ۘܿܳ;->֫(Ll/ۘܿܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 227
    iget-object v0, p0, Ll/ᩴܿܳ;->֫:Ljava/util/List;

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 227
    check-cast v0, Ll/ۘܿܳ;

    invoke-static {v0}, Ll/ۘܿܳ;->֫(Ll/ۘܿܳ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 222
    invoke-virtual {p0, p1}, Ll/ᩴܿܳ;->֫(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 223
    iget-object v0, p0, Ll/ᩴܿܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 222
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid HTML preview root"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
