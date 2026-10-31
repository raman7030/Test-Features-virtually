.class public final Ll/ۜܽܳ;
.super Ljava/lang/Object;
.source "P70I"


# instance fields
.field public ֫:I

.field public final ۧ:[Ll/ᩴܽܳ;


# direct methods
.method public constructor <init>([Ll/ᩴܽܳ;)V
    .locals 1

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 242
    iput v0, p0, Ll/ۜܽܳ;->֫:I

    .line 246
    iput-object p1, p0, Ll/ۜܽܳ;->ۧ:[Ll/ᩴܽܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜܽܳ;)[Ll/ᩴܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܽܳ;->ۧ:[Ll/ᩴܽܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    move-object v0, p0

    .line 260
    monitor-enter v0

    .line 261
    :try_start_0
    iget v1, p0, Ll/ۜܽܳ;->֫:I

    if-lez v1, :cond_2

    add-int/lit8 v1, v1, -0x1

    .line 264
    iput v1, p0, Ll/ۜܽܳ;->֫:I

    if-nez v1, :cond_0

    .line 265
    iget-object v1, p0, Ll/ۜܽܳ;->ۧ:[Ll/ᩴܽܳ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 267
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 269
    invoke-static {v1}, Ll/ܺܽܳ;->֫([Ll/ᩴܽܳ;)V

    :cond_1
    return-void

    .line 262
    :cond_2
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "HexRange root lease closed twice"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 267
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۧ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 251
    :try_start_0
    iget v1, p0, Ll/ۜܽܳ;->֫:I

    if-lez v1, :cond_1

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 254
    iput v1, p0, Ll/ۜܽܳ;->֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    monitor-exit v0

    return-void

    .line 0
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    .line 252
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "HexRange root lease is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 255
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
