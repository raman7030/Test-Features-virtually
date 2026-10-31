.class public final Ll/֫ۙۜ;
.super Ljava/lang/Object;
.source "V743"


# static fields
.field public static final ᩳ:Ll/֫ۙۜ;


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Ll/֫ۙۜ;

    invoke-direct {v0}, Ll/֫ۙۜ;-><init>()V

    sput-object v0, Ll/֫ۙۜ;->ᩳ:Ll/֫ۙۜ;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    const/16 v3, 0x40

    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Ll/֫ۙۜ;->֫:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۙۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ۙۜ;->ۧ:I

    return p0
.end method

.method public static ֫()Ll/֫ۙۜ;
    .locals 1

    .line 25
    sget-object v0, Ll/֫ۙۜ;->ᩳ:Ll/֫ۙۜ;

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/֫ۙۜ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫ۙۜ;->ۧ:I

    return-void
.end method

.method public static ֫(Ll/֫ۙۜ;Ll/۟᩶ۜ;)V
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 89
    :try_start_0
    invoke-static {p1}, Ll/۟᩶ۜ;->֫(Ll/۟᩶ۜ;)I

    move-result v1

    if-lez v1, :cond_0

    .line 90
    iget v1, p0, Ll/֫ۙۜ;->ۧ:I

    invoke-static {p1}, Ll/۟᩶ۜ;->֫(Ll/۟᩶ۜ;)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Ll/֫ۙۜ;->ۧ:I

    .line 91
    invoke-static {p1}, Ll/۟᩶ۜ;->ۧ(Ll/۟᩶ۜ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ۧ(I)V
    .locals 3

    .line 77
    iget-object v0, p0, Ll/֫ۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 78
    :goto_0
    iget v1, p0, Ll/֫ۙۜ;->ܽ:I

    iget v2, p0, Ll/֫ۙۜ;->ۧ:I

    add-int/2addr v1, v2

    add-int/2addr v1, p1

    const/high16 v2, 0xa00000

    if-le v1, v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩶ۜ;

    .line 80
    iget v2, v1, Ll/ۨ᩶ۜ;->ۧ:I

    if-eqz v2, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    iget v2, p0, Ll/֫ۙۜ;->ܽ:I

    iget-object v1, v1, Ll/ۨ᩶ۜ;->֫:[B

    array-length v1, v1

    sub-int/2addr v2, v1

    iput v2, p0, Ll/֫ۙۜ;->ܽ:I

    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(I)Ll/۟᩶ۜ;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    if-ltz p1, :cond_2

    const/high16 v2, 0xa00000

    if-le p1, v2, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Ll/֫ۙۜ;->ۧ(I)V

    .line 46
    iget v3, p0, Ll/֫ۙۜ;->ܽ:I

    iget v4, p0, Ll/֫ۙۜ;->ۧ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v3, v4

    add-int/2addr v3, p1

    if-le v3, v2, :cond_1

    .line 47
    monitor-exit v0

    return-object v1

    :cond_1
    add-int/2addr v4, p1

    .line 49
    :try_start_1
    iput v4, p0, Ll/֫ۙۜ;->ۧ:I

    .line 50
    new-instance v1, Ll/۟᩶ۜ;

    invoke-direct {v1, p0, p1}, Ll/۟᩶ۜ;-><init>(Ll/֫ۙۜ;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 43
    :cond_2
    :goto_0
    monitor-exit v0

    return-object v1
.end method

.method public final declared-synchronized ֫(Ll/᩺᩶ۜ;)Ll/ܰ᩶ۜ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v1, p0, Ll/֫ۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ᩶ۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 33
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    .line 35
    :cond_0
    :try_start_1
    iget v1, p1, Ll/ۨ᩶ۜ;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Ll/ۨ᩶ۜ;->ۧ:I

    .line 36
    new-instance v1, Ll/ܰ᩶ۜ;

    invoke-direct {v1, p0, p1}, Ll/ܰ᩶ۜ;-><init>(Ll/֫ۙۜ;Ll/ۨ᩶ۜ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩺᩶ۜ;[BLl/۟᩶ۜ;)Ll/ܰ᩶ۜ;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 58
    :try_start_0
    array-length v1, p2

    invoke-static {p3, v1}, Ll/۟᩶ۜ;->֫(Ll/۟᩶ۜ;I)V

    .line 59
    iget-object p3, p0, Ll/֫ۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p3, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۨ᩶ۜ;

    const/4 v1, 0x1

    if-eqz p3, :cond_2

    .line 61
    array-length v2, p2

    iget-object v3, p3, Ll/ۨ᩶ۜ;->֫:[B

    array-length v3, v3

    if-le v2, v3, :cond_1

    iget v2, p3, Ll/ۨ᩶ۜ;->ۧ:I

    if-eqz v2, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    iget-object v2, p0, Ll/֫ۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    iget v2, p0, Ll/֫ۙۜ;->ܽ:I

    iget-object p3, p3, Ll/ۨ᩶ۜ;->֫:[B

    array-length p3, p3

    sub-int/2addr v2, p3

    iput v2, p0, Ll/֫ۙۜ;->ܽ:I

    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    iget p1, p3, Ll/ۨ᩶ۜ;->ۧ:I

    add-int/2addr p1, v1

    iput p1, p3, Ll/ۨ᩶ۜ;->ۧ:I

    .line 63
    new-instance p1, Ll/ܰ᩶ۜ;

    invoke-direct {p1, p0, p3}, Ll/ܰ᩶ۜ;-><init>(Ll/֫ۙۜ;Ll/ۨ᩶ۜ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 69
    :cond_2
    :goto_1
    :try_start_1
    new-instance p3, Ll/ۨ᩶ۜ;

    invoke-direct {p3, p2}, Ll/ۨ᩶ۜ;-><init>([B)V

    .line 70
    iput v1, p3, Ll/ۨ᩶ۜ;->ۧ:I

    .line 71
    iget-object v1, p0, Ll/֫ۙۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1, p3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    iget p1, p0, Ll/֫ۙۜ;->ܽ:I

    array-length p2, p2

    add-int/2addr p1, p2

    iput p1, p0, Ll/֫ۙۜ;->ܽ:I

    .line 73
    new-instance p1, Ll/ܰ᩶ۜ;

    invoke-direct {p1, p0, p3}, Ll/ܰ᩶ۜ;-><init>(Ll/֫ۙۜ;Ll/ۨ᩶ۜ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
