.class public final Ll/᩺᩹ᩳ;
.super Ljava/lang/Object;
.source "X6UN"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ᩶:Ll/ۖ۬ᩳ;


# instance fields
.field public final ᩸:Ll/֨۬ᩳ;

.field public ᩹:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Ll/ۖ۬ᩳ;

    const-wide/32 v1, 0x10000

    invoke-direct {v0, v1, v2}, Ll/ۖ۬ᩳ;-><init>(J)V

    sput-object v0, Ll/᩺᩹ᩳ;->᩶:Ll/ۖ۬ᩳ;

    return-void
.end method

.method public constructor <init>(Ll/᩸۬ᩳ;I)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    :goto_0
    iput-object p1, p0, Ll/᩺᩹ᩳ;->᩸:Ll/֨۬ᩳ;

    if-eqz p1, :cond_1

    .line 17
    invoke-virtual {p1, p2}, Ll/֨۬ᩳ;->֫(I)[C

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩹ᩳ;->᩹:[C

    return-void

    :cond_1
    if-ltz p2, :cond_7

    if-eqz p2, :cond_4

    const/16 p1, 0x2000

    if-le p2, p1, :cond_2

    goto :goto_2

    :cond_2
    const/16 p1, 0x10

    :goto_1
    if-ge p1, p2, :cond_3

    shl-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    move p2, p1

    :cond_4
    :goto_2
    if-nez p2, :cond_5

    .line 21
    sget-object p1, Ll/ۖ۬ᩳ;->ܿ:[C

    iput-object p1, p0, Ll/᩺᩹ᩳ;->᩹:[C

    return-void

    .line 23
    :cond_5
    sget-object p1, Ll/᩺᩹ᩳ;->᩶:Ll/ۖ۬ᩳ;

    move-object v0, p1

    monitor-enter v0

    .line 24
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ۖ۬ᩳ;->֫(I)[C

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩹ᩳ;->᩹:[C

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_6

    .line 26
    new-array p1, p2, [C

    iput-object p1, p0, Ll/᩺᩹ᩳ;->᩹:[C

    :cond_6
    return-void

    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 18
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative workspace length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 39
    iget-object v1, p0, Ll/᩺᩹ᩳ;->᩹:[C

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Ll/᩺᩹ᩳ;->᩹:[C

    .line 42
    iget-object v0, p0, Ll/᩺᩹ᩳ;->᩸:Ll/֨۬ᩳ;

    if-eqz v0, :cond_1

    .line 43
    invoke-virtual {v0, v1}, Ll/֨۬ᩳ;->֫([C)V

    return-void

    .line 44
    :cond_1
    array-length v0, v1

    if-eqz v0, :cond_2

    .line 45
    sget-object v2, Ll/᩺᩹ᩳ;->᩶:Ll/ۖ۬ᩳ;

    move-object v0, v2

    monitor-enter v0

    .line 46
    :try_start_0
    invoke-virtual {v2, v1}, Ll/ۖ۬ᩳ;->֫([C)Z

    .line 47
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫()[C
    .locals 2

    .line 33
    iget-object v0, p0, Ll/᩺᩹ᩳ;->᩹:[C

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text workspace is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
