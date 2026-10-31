.class public final Ll/ᩴ۫ۡ;
.super Ljava/lang/Object;
.source "X6N1"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    const/16 v3, 0x10

    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Ll/ᩴ۫ۡ;->ۧ:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ljava/lang/String;)Ljava/lang/Float;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 14
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x80

    if-gt v1, v2, :cond_0

    iget-object v1, p0, Ll/ᩴ۫ۡ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 28
    :try_start_0
    iget-object v1, p0, Ll/ᩴ۫ۡ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v1, 0x0

    .line 29
    iput v1, p0, Ll/ᩴ۫ۡ;->֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;Ljava/lang/Float;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 18
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x80

    if-le v1, v2, :cond_0

    monitor-exit v0

    return-void

    .line 19
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ᩴ۫ۡ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    iget p2, p0, Ll/ᩴ۫ۡ;->֫:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p2, p1

    iput p2, p0, Ll/ᩴ۫ۡ;->֫:I

    .line 20
    :cond_1
    iget-object p1, p0, Ll/ᩴ۫ۡ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 21
    :goto_0
    iget-object p2, p0, Ll/ᩴ۫ۡ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    move-result p2

    const/16 v1, 0x400

    if-gt p2, v1, :cond_3

    iget p2, p0, Ll/ᩴ۫ۡ;->֫:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v1, 0x8000

    if-le p2, v1, :cond_2

    goto :goto_1

    .line 25
    :cond_2
    monitor-exit v0

    return-void

    .line 22
    :cond_3
    :goto_1
    :try_start_2
    iget p2, p0, Ll/ᩴ۫ۡ;->֫:I

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr p2, v1

    iput p2, p0, Ll/ᩴ۫ۡ;->֫:I

    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
