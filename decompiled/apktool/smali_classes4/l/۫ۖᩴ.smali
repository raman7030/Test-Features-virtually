.class public final Ll/۫ۖᩴ;
.super Ll/ۨܺᩴ;
.source "7CAF"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ᩸:[J

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 55
    sget-object v0, Ll/ۤۖᩴ;->ۧ:[J

    iput-object v0, p0, Ll/۫ۖᩴ;->᩸:[J

    return-void
.end method

.method public constructor <init>([J)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 47
    iput-object p1, p0, Ll/۫ۖᩴ;->᩸:[J

    .line 48
    array-length p1, p1

    iput p1, p0, Ll/۫ۖᩴ;->᩹:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4

    .line 436
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 437
    iget v0, p0, Ll/۫ۖᩴ;->᩹:I

    new-array v0, v0, [J

    iput-object v0, p0, Ll/۫ۖᩴ;->᩸:[J

    const/4 v1, 0x0

    .line 438
    :goto_0
    iget v2, p0, Ll/۫ۖᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readLong()J

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 4

    .line 430
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 431
    iget-object v0, p0, Ll/۫ۖᩴ;->᩸:[J

    const/4 v1, 0x0

    .line 432
    :goto_0
    iget v2, p0, Ll/۫ۖᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    aget-wide v2, v0, v1

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ܽ(J)I
    .locals 5

    .line 204
    iget-object v0, p0, Ll/۫ۖᩴ;->᩸:[J

    .line 205
    iget v1, p0, Ll/۫ۖᩴ;->᩹:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-wide v3, v0, v2

    cmp-long v1, v3, p1

    if-nez v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method


# virtual methods
.method public final add(J)Z
    .locals 5

    .line 373
    invoke-direct {p0, p1, p2}, Ll/۫ۖᩴ;->ܽ(J)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 375
    :cond_0
    iget v0, p0, Ll/۫ۖᩴ;->᩹:I

    iget-object v1, p0, Ll/۫ۖᩴ;->᩸:[J

    array-length v1, v1

    if-ne v0, v1, :cond_3

    if-nez v0, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    mul-int/lit8 v1, v0, 0x2

    .line 376
    :goto_0
    new-array v1, v1, [J

    :goto_1
    add-int/lit8 v2, v0, -0x1

    if-eqz v0, :cond_2

    .line 377
    iget-object v0, p0, Ll/۫ۖᩴ;->᩸:[J

    aget-wide v3, v0, v2

    aput-wide v3, v1, v2

    move v0, v2

    goto :goto_1

    .line 378
    :cond_2
    iput-object v1, p0, Ll/۫ۖᩴ;->᩸:[J

    .line 380
    :cond_3
    iget-object v0, p0, Ll/۫ۖᩴ;->᩸:[J

    iget v1, p0, Ll/۫ۖᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۫ۖᩴ;->᩹:I

    aput-wide p1, v0, v1

    const/4 p1, 0x1

    return p1
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 386
    iput v0, p0, Ll/۫ۖᩴ;->᩹:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 421
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۖᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 425
    iget-object v1, p0, Ll/۫ۖᩴ;->᩸:[J

    invoke-virtual {v1}, [J->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    iput-object v1, v0, Ll/۫ۖᩴ;->᩸:[J

    return-object v0

    .line 423
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 391
    iget v0, p0, Ll/۫ۖᩴ;->᩹:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 213
    new-instance v0, Ll/ۗۖᩴ;

    invoke-direct {v0, p0}, Ll/ۗۖᩴ;-><init>(Ll/۫ۖᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/᩻ۘᩴ;
    .locals 1

    .line 213
    new-instance v0, Ll/ۗۖᩴ;

    invoke-direct {v0, p0}, Ll/ۗۖᩴ;-><init>(Ll/۫ۖᩴ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 358
    iget v0, p0, Ll/۫ۖᩴ;->᩹:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/۫ۖᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 348
    new-instance v0, Ll/۬ۖᩴ;

    invoke-direct {v0, p0}, Ll/۬ۖᩴ;-><init>(Ll/۫ۖᩴ;)V

    return-object v0
.end method

.method public final ֫(J)Z
    .locals 6

    .line 363
    invoke-direct {p0, p1, p2}, Ll/۫ۖᩴ;->ܽ(J)I

    move-result p1

    const/4 p2, -0x1

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    return v0

    .line 365
    :cond_0
    iget p2, p0, Ll/۫ۖᩴ;->᩹:I

    sub-int/2addr p2, p1

    const/4 v1, 0x1

    sub-int/2addr p2, v1

    :goto_0
    if-ge v0, p2, :cond_1

    .line 366
    iget-object v2, p0, Ll/۫ۖᩴ;->᩸:[J

    add-int v3, p1, v0

    add-int/lit8 v4, v3, 0x1

    aget-wide v4, v2, v4

    aput-wide v4, v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 367
    :cond_1
    iget p1, p0, Ll/۫ۖᩴ;->᩹:I

    sub-int/2addr p1, v1

    iput p1, p0, Ll/۫ۖᩴ;->᩹:I

    return v1
.end method

.method public final ۢ(J)Z
    .locals 0

    .line 353
    invoke-direct {p0, p1, p2}, Ll/۫ۖᩴ;->ܽ(J)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
