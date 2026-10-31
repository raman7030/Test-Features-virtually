.class public final Ll/ᩴ᩶᩻;
.super Ljava/lang/Object;
.source "V8BV"


# instance fields
.field public ֫:Ll/ۘ᩶᩻;

.field public ۧ:Ll/ܶ۬ܳ;

.field public ܽ:Z

.field public ᩳ:Ll/ܰܺܳ;


# direct methods
.method public static bridge synthetic ֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    return-object p0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;Ll/֨۬ܳ;)V
    .locals 2

    .line 73
    new-instance v0, Ll/ܶ᩺ۡ;

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-virtual {p1}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 75
    invoke-virtual {p1}, Ll/֨۬ܳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩺ۡ;->֫(Ljava/lang/String;)V

    .line 77
    :cond_0
    invoke-virtual {p1}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 79
    iget p1, p1, Ll/ᩳ᩵ܿ;->ۧ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܶ᩺ۡ;->֫(Ljava/lang/Integer;)V

    .line 81
    :cond_1
    invoke-virtual {p0, v0}, Ll/ۗ᩺ۡ;->֫(Ll/ܶ᩺ۡ;)V

    return-void
.end method

.method private ֫(Ll/ۡܰۡ;)V
    .locals 7

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 154
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 155
    new-instance v2, Ljava/util/LinkedList;

    iget-object v3, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v3}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 156
    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    .line 157
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨۬ܳ;

    .line 158
    invoke-virtual {v3}, Ll/֨۬ܳ;->ۘ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 159
    invoke-virtual {v3}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    invoke-virtual {v3}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Ljava/util/LinkedList;->addAll(ILjava/util/Collection;)Z

    goto :goto_0

    .line 162
    :cond_0
    iget-object v4, p0, Ll/ᩴ᩶᩻;->ᩳ:Ll/ܰܺܳ;

    invoke-virtual {v3}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v4

    .line 163
    invoke-virtual {v3}, Ll/֨۬ܳ;->ۧ()Ll/ۚ۬ܳ;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 167
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡۬ܳ;

    .line 168
    iget-object v3, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v3}, Ll/᩷۫ܳ;->᩷()V

    .line 169
    iget-object v3, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    iget-object v5, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v5}, Ll/᩷۫ܳ;->ᩳ()I

    iget-object v5, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3, v2}, Ll/ۘ᩶᩻;->֫(Ll/֨۬ܳ;)V

    .line 170
    new-instance v3, Ll/ۗ᩺ۡ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 172
    invoke-static {v3, v2}, Ll/ᩴ᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/֨۬ܳ;)V

    .line 173
    invoke-virtual {p1, v3}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 174
    iget-object v2, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-interface {v2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/io/IOException;

    const/4 v2, 0x0

    aput-object v2, v1, v4

    .line 180
    iget-object v2, p0, Ll/ᩴ᩶᩻;->ᩳ:Ll/ܰܺܳ;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    new-instance v5, Ll/ۖ᩶᩻;

    invoke-direct {v5, p0, v0, p1, v1}, Ll/ۖ᩶᩻;-><init>(Ll/ᩴ᩶᩻;Ljava/util/HashMap;Ll/ۡܰۡ;[Ljava/io/IOException;)V

    .line 189
    invoke-virtual {v2, v3, v5}, Ll/ܰܺܳ;->֫(Ljava/util/Set;Ll/᩺ܺܳ;)V

    .line 230
    aget-object p1, v1, v4

    if-nez p1, :cond_4

    :goto_1
    return-void

    .line 231
    :cond_4
    throw p1
.end method

.method private ֫(Ll/ۡܰۡ;Ll/֨۬ܳ;)V
    .locals 6

    .line 85
    iget-object v0, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 88
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v0}, Ll/᩷۫ܳ;->᩷()V

    .line 89
    iget-object v0, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    iget-object v1, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v1}, Ll/᩷۫ܳ;->ᩳ()I

    iget-object v1, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p2}, Ll/ۘ᩶᩻;->֫(Ll/֨۬ܳ;)V

    .line 90
    iget-boolean v0, p0, Ll/ᩴ᩶᩻;->ܽ:Z

    if-nez v0, :cond_1

    .line 91
    iget-object v0, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    iget-object v0, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    iget-object v1, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {v1}, Ll/᩷۫ܳ;->ܽ()I

    move-result v1

    invoke-interface {v0, v1}, Ll/ۘ᩶᩻;->setProgress(I)V

    .line 94
    :cond_1
    invoke-virtual {p2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    new-instance v0, Ll/ۗ᩺ۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p2}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 97
    invoke-static {v0, p2}, Ll/ᩴ᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/֨۬ܳ;)V

    .line 98
    invoke-virtual {p1, v0}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto/16 :goto_2

    .line 100
    :cond_2
    new-instance v0, Ll/ۗ᩺ۡ;

    invoke-virtual {p2}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p2}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 102
    invoke-static {v0, p2}, Ll/ᩴ᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/֨۬ܳ;)V

    .line 103
    invoke-virtual {p1, v0}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 104
    iget-object v0, p0, Ll/ᩴ᩶᩻;->ᩳ:Ll/ܰܺܳ;

    invoke-virtual {p2}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v0

    .line 105
    invoke-virtual {p2}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 106
    iget-object v0, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    .line 107
    :cond_3
    iget-boolean v1, p0, Ll/ᩴ᩶᩻;->ܽ:Z

    if-eqz v1, :cond_6

    .line 110
    iget-object v1, p0, Ll/ᩴ᩶᩻;->ᩳ:Ll/ܰܺܳ;

    .line 185
    invoke-virtual {v1, v0}, Ll/ܰܺܳ;->֫(Ll/ᩳۜܳ;)Ll/᩵ۤܳ;

    move-result-object v0

    if-nez v0, :cond_4

    .line 112
    :try_start_0
    iget-object p1, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-interface {p1}, Ll/ۘ᩶᩻;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_9

    .line 117
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    .line 115
    :cond_4
    :try_start_1
    invoke-virtual {v0}, Ll/᩵ۤܳ;->֫()Ll/᩵ۛۡ;

    move-result-object v1

    iget-object v2, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll/ۛ᩶ܿ;

    invoke-direct {v3, v2}, Ll/ۛ᩶ܿ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 116
    invoke-virtual {p1}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v1

    iget-object v2, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll/᩷᩶᩻;

    invoke-direct {v3, v2}, Ll/᩷᩶᩻;-><init>(Ll/ۘ᩶᩻;)V

    const-wide/16 v4, -0x1

    invoke-static {v0, v1, v4, v5, v3}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    goto :goto_1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_5

    .line 110
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    throw p1

    .line 120
    :cond_6
    iget-object v1, p0, Ll/ᩴ᩶᩻;->ᩳ:Ll/ܰܺܳ;

    const/4 v2, 0x0

    .line 180
    invoke-virtual {v1, v2, v0}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v1

    if-nez v1, :cond_7

    .line 122
    :try_start_3
    iget-object p1, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-interface {p1}, Ll/ۘ᩶᩻;->֫()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v1, :cond_9

    .line 137
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-void

    .line 125
    :cond_7
    :try_start_4
    invoke-virtual {p1}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v2

    check-cast v0, Ll/ܺۘܳ;

    invoke-virtual {v0}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v3

    new-instance v0, Ll/ۡ᩶᩻;

    invoke-direct {v0, p0}, Ll/ۡ᩶᩻;-><init>(Ll/ᩴ᩶᩻;)V

    invoke-static {v1, v2, v3, v4, v0}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 137
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 139
    :goto_1
    iget-object v0, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {p2}, Ll/֨۬ܳ;->ۧ()Ll/ۚ۬ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/᩷۫ܳ;->֫(J)V

    .line 141
    :goto_2
    iget-object v0, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_4

    .line 144
    :cond_8
    invoke-virtual {p2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 145
    invoke-virtual {p2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 146
    invoke-direct {p0, p1, v0}, Ll/ᩴ᩶᩻;->֫(Ll/ۡܰۡ;Ll/֨۬ܳ;)V

    goto :goto_3

    :cond_9
    :goto_4
    return-void

    :catchall_2
    move-exception p1

    if-eqz v1, :cond_a

    .line 120
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_5
    throw p1
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;Ll/ܰܺܳ;[Ljava/lang/String;Ll/ۘ᩶᩻;)V
    .locals 3

    .line 35
    iput-object p2, p0, Ll/ᩴ᩶᩻;->ᩳ:Ll/ܰܺܳ;

    .line 36
    iput-object p4, p0, Ll/ᩴ᩶᩻;->֫:Ll/ۘ᩶᩻;

    .line 37
    array-length v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    aget-object v0, p3, v1

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Ll/ᩴ᩶᩻;->ܽ:Z

    .line 41
    new-instance v0, Ll/ۢ᩶᩻;

    invoke-direct {v0, p4}, Ll/ۢ᩶᩻;-><init>(Ll/ۘ᩶᩻;)V

    .line 57
    invoke-static {v0}, Ll/ܶ۬ܳ;->֫(Ll/᩵۬ܳ;)Ll/ܶ۬ܳ;

    move-result-object p4

    iput-object p4, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    .line 58
    invoke-virtual {p4, p3, p2}, Ll/ܶ۬ܳ;->֫([Ljava/lang/String;Ll/ܰܺܳ;)V

    .line 60
    new-instance p3, Ll/ۡܰۡ;

    invoke-direct {p3, p1}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    const/16 p1, 0x24

    .line 61
    :try_start_0
    invoke-virtual {p3, p1}, Ll/ۡܰۡ;->ۧ(I)V

    .line 62
    invoke-virtual {p2}, Ll/ܰܺܳ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 63
    invoke-direct {p0, p3}, Ll/ᩴ᩶᩻;->֫(Ll/ۡܰۡ;)V

    goto :goto_1

    .line 65
    :cond_1
    iget-object p1, p0, Ll/ᩴ᩶᩻;->ۧ:Ll/ܶ۬ܳ;

    invoke-virtual {p1}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֨۬ܳ;

    .line 66
    invoke-direct {p0, p3, p2}, Ll/ᩴ᩶᩻;->֫(Ll/ۡܰۡ;Ll/֨۬ܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 69
    :cond_2
    :goto_1
    invoke-virtual {p3}, Ll/ۡܰۡ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 60
    :try_start_1
    invoke-virtual {p3}, Ll/ۡܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method
