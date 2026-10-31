.class public final Ll/ܽ֫᩻;
.super Ljava/lang/Object;
.source "770P"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public ۧ:J

.field public final ܳ:Ll/᩻ۙ֨;

.field public ܽ:Ll/ۖۛܳ;

.field public final ܿ:Ljava/util/HashSet;

.field public final ᩳ:Ljava/util/HashMap;

.field public final ᩻:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 37
    new-instance v0, Ll/᩻ۙ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/᩻ۙ֨;-><init>(I)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Ll/ܽ֫᩻;->᩻:Ljava/util/LinkedHashSet;

    .line 28
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Ll/ܽ֫᩻;->ܿ:Ljava/util/HashSet;

    .line 29
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ܽ֫᩻;->֫:Ljava/util/HashMap;

    .line 30
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ܽ֫᩻;->ᩳ:Ljava/util/HashMap;

    const-wide/high16 v1, -0x8000000000000000L

    .line 33
    iput-wide v1, p0, Ll/ܽ֫᩻;->ۧ:J

    .line 42
    iput-object v0, p0, Ll/ܽ֫᩻;->ܳ:Ll/᩻ۙ֨;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 172
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 173
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 174
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    if-nez v0, :cond_0

    if-eq v4, v3, :cond_0

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 177
    invoke-virtual {v0, p0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz v0, :cond_1

    .line 180
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    return-object p0

    .line 183
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܰܺܳ;)Ll/ܽ֫᩻;
    .locals 2

    .line 56
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    new-instance v0, Ll/ܽ֫᩻;

    invoke-direct {v0}, Ll/ܽ֫᩻;-><init>()V

    .line 58
    instance-of v1, p0, Ll/᩵ۙ᩻;

    if-eqz v1, :cond_0

    check-cast p0, Ll/᩵ۙ᩻;

    .line 59
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->֡()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ܶ()[B

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;[B)V

    return-object v0

    .line 60
    :cond_0
    instance-of v1, p0, Ll/ܿ᩸᩻;

    if-eqz v1, :cond_1

    check-cast p0, Ll/ܿ᩸᩻;

    .line 61
    invoke-virtual {p0}, Ll/ܿ᩸᩻;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    .line 62
    invoke-virtual {p0}, Ll/ܿ᩸᩻;->᩵()Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    return-object v0

    .line 63
    :cond_1
    instance-of v1, p0, Ll/ۖۛܳ;

    if-eqz v1, :cond_2

    check-cast p0, Ll/ۖۛܳ;

    .line 64
    iput-object p0, v0, Ll/ܽ֫᩻;->ܽ:Ll/ۖۛܳ;

    .line 65
    invoke-direct {v0}, Ll/ܽ֫᩻;->֫()V

    return-object v0

    .line 66
    :cond_2
    instance-of v1, p0, Ll/ۨۛܳ;

    if-eqz v1, :cond_3

    check-cast p0, Ll/ۨۛܳ;

    .line 67
    invoke-virtual {p0}, Ll/ۨۛܳ;->ۜ()Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    return-object v0

    .line 68
    :cond_3
    instance-of v1, p0, Ll/ۚ֨᩻;

    if-eqz v1, :cond_4

    check-cast p0, Ll/ۚ֨᩻;

    .line 69
    invoke-virtual {p0}, Ll/ۚ֨᩻;->֡()Z

    move-result v1

    if-nez v1, :cond_4

    .line 70
    invoke-virtual {p0}, Ll/ۚ֨᩻;->ۜ()Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    :cond_4
    return-object v0
.end method

.method private ֫()V
    .locals 5

    .line 140
    iget-object v0, p0, Ll/ܽ֫᩻;->ܽ:Ll/ۖۛܳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {v0}, Ll/ۖۛܳ;->᩵()J

    move-result-wide v0

    .line 144
    iget-wide v2, p0, Ll/ܽ֫᩻;->ۧ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_1

    :goto_0
    return-void

    .line 147
    :cond_1
    iget-object v2, p0, Ll/ܽ֫᩻;->ܽ:Ll/ۖۛܳ;

    invoke-virtual {v2}, Ll/ۖۛܳ;->ᩴ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 148
    invoke-virtual {p0, v3}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_1

    .line 151
    :cond_2
    iput-wide v0, p0, Ll/ܽ֫᩻;->ۧ:J

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ll/ܶ᩵ܿ;)V
    .locals 5

    const/4 v0, 0x1

    .line 188
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 78
    :try_start_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 80
    iget-object v2, p0, Ll/ܽ֫᩻;->᩻:Ljava/util/LinkedHashSet;

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 81
    invoke-static {p1}, Ll/ܽ֫᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 82
    iget-object v3, p0, Ll/ܽ֫᩻;->֫:Ljava/util/HashMap;

    .line 188
    new-instance v4, Ll/ۧ֫᩻;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v2, v1, v4}, Ll/ܰ۬ᩴ;->merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 83
    iget-object v3, p0, Ll/ܽ֫᩻;->ܳ:Ll/᩻ۙ֨;

    invoke-virtual {v3, p1}, Ll/᩻ۙ֨;->test(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 84
    iget-object v3, p0, Ll/ܽ֫᩻;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object p1, p0, Ll/ܽ֫᩻;->ᩳ:Ljava/util/HashMap;

    .line 188
    new-instance v3, Ll/ۧ֫᩻;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v2, v1, v3}, Ll/ܰ۬ᩴ;->merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ܶ᩵ܿ;[B)V
    .locals 4

    const-string v1, "Invalid ZIP split volume count: "

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 106
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    if-eqz p2, :cond_3

    .line 107
    array-length v2, p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    goto :goto_2

    .line 111
    :cond_0
    :try_start_1
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, p2}, Ll/۬ۜܽ;-><init>([B)V

    .line 112
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    .line 114
    array-length p2, p2

    add-int/lit8 p2, p2, -0x4

    div-int/lit8 p2, p2, 0x9

    if-lez v3, :cond_2

    if-gt v3, p2, :cond_2

    .line 118
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, v3, :cond_1

    .line 120
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    const/16 v1, 0x8

    .line 121
    invoke-virtual {v2, v1}, Ll/۬ۜܽ;->skipBytes(I)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 126
    :cond_1
    monitor-exit v0

    return-void

    .line 116
    :cond_2
    :try_start_2
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 124
    :goto_1
    :try_start_3
    new-instance p2, Ljava/io/IOException;

    const-string v1, "Invalid ZIP split metadata"

    invoke-direct {p2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    :cond_3
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 130
    :try_start_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    invoke-direct {p0}, Ll/ܽ֫᩻;->֫()V

    .line 132
    iget-object v1, p0, Ll/ܽ֫᩻;->᩻:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 133
    monitor-exit v0

    return v2

    .line 135
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 156
    iget-object v1, p0, Ll/ܽ֫᩻;->᩻:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 159
    :cond_1
    iget-object v1, p0, Ll/ܽ֫᩻;->ܳ:Ll/᩻ۙ֨;

    invoke-virtual {v1, p1}, Ll/᩻ۙ֨;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 160
    iget-object v1, p0, Ll/ܽ֫᩻;->֫:Ljava/util/HashMap;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ll/ܽ֫᩻;->ᩳ:Ljava/util/HashMap;

    .line 161
    :goto_0
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {p1}, Ll/ܽ֫᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_3

    :goto_1
    const/4 v2, 0x1

    .line 135
    :cond_3
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܽ(Ll/ܶ᩵ܿ;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 92
    :try_start_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 94
    iget-object v1, p0, Ll/ܽ֫᩻;->᩻:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 95
    monitor-exit v0

    return-void

    .line 97
    :cond_0
    :try_start_1
    invoke-static {p1}, Ll/ܽ֫᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 98
    iget-object v2, p0, Ll/ܽ֫᩻;->֫:Ljava/util/HashMap;

    .line 193
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 195
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sub-int/2addr v3, v4

    .line 197
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    :goto_0
    iget-object v2, p0, Ll/ܽ֫᩻;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 100
    iget-object p1, p0, Ll/ܽ֫᩻;->ᩳ:Ljava/util/HashMap;

    .line 193
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v4, :cond_2

    .line 195
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sub-int/2addr v2, v4

    .line 197
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
