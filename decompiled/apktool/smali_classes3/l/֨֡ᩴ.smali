.class public Ll/֨֡ᩴ;
.super Ll/ܿᩴᩴ;
.source "21EP"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ᩸:[Ljava/lang/Object;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 56
    sget-object v0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    iput-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 48
    iput-object p1, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    .line 49
    array-length p1, p1

    iput p1, p0, Ll/֨֡ᩴ;->᩹:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 3

    .line 452
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 453
    iget v0, p0, Ll/֨֡ᩴ;->᩹:I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 454
    :goto_0
    iget v2, p0, Ll/֨֡ᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 446
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 447
    iget-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 448
    :goto_0
    iget v2, p0, Ll/֨֡ᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Ljava/lang/Object;)I
    .locals 3

    .line 205
    iget-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    .line 206
    iget v1, p0, Ll/֨֡ᩴ;->᩹:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-object v1, v0, v2

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 3

    .line 378
    invoke-direct {p0, p1}, Ll/֨֡ᩴ;->֫(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 380
    :cond_0
    iget v0, p0, Ll/֨֡ᩴ;->᩹:I

    iget-object v1, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_3

    if-nez v0, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    mul-int/lit8 v1, v0, 0x2

    .line 381
    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v0, -0x1

    if-eqz v0, :cond_2

    .line 382
    iget-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    aget-object v0, v0, v2

    aput-object v0, v1, v2

    move v0, v2

    goto :goto_1

    .line 383
    :cond_2
    iput-object v1, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    .line 385
    :cond_3
    iget-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/֨֡ᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֨֡ᩴ;->᩹:I

    aput-object p1, v0, v1

    const/4 p1, 0x1

    return p1
.end method

.method public final clear()V
    .locals 4

    .line 391
    iget-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/֨֡ᩴ;->᩹:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 392
    iput v3, p0, Ll/֨֡ᩴ;->᩹:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 437
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨֡ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 441
    iget-object v1, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    return-object v0

    .line 439
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 357
    invoke-direct {p0, p1}, Ll/֨֡ᩴ;->֫(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 397
    iget v0, p0, Ll/֨֡ᩴ;->᩹:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 214
    new-instance v0, Ll/֡֡ᩴ;

    invoke-direct {v0, p0}, Ll/֡֡ᩴ;-><init>(Ll/֨֡ᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 214
    new-instance v0, Ll/֡֡ᩴ;

    invoke-direct {v0, p0}, Ll/֡֡ᩴ;-><init>(Ll/֨֡ᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    .line 367
    invoke-direct {p0, p1}, Ll/֨֡ᩴ;->֫(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return v1

    .line 369
    :cond_0
    iget v0, p0, Ll/֨֡ᩴ;->᩹:I

    sub-int/2addr v0, p1

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    :goto_0
    if-ge v1, v0, :cond_1

    .line 370
    iget-object v3, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    add-int v4, p1, v1

    add-int/lit8 v5, v4, 0x1

    aget-object v5, v3, v5

    aput-object v5, v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 371
    :cond_1
    iget p1, p0, Ll/֨֡ᩴ;->᩹:I

    sub-int/2addr p1, v2

    iput p1, p0, Ll/֨֡ᩴ;->᩹:I

    .line 372
    iget-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    return v2
.end method

.method public final size()I
    .locals 1

    .line 362
    iget v0, p0, Ll/֨֡ᩴ;->᩹:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֨֡ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 1

    .line 352
    new-instance v0, Ll/ۚ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ۚ֡ᩴ;-><init>(Ll/֨֡ᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 352
    new-instance v0, Ll/ۚ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ۚ֡ᩴ;-><init>(Ll/֨֡ᩴ;)V

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 3

    .line 362
    iget v0, p0, Ll/֨֡ᩴ;->᩹:I

    if-nez v0, :cond_0

    .line 404
    sget-object v0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    return-object v0

    .line 405
    :cond_0
    iget-object v1, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    const-class v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    if-nez p1, :cond_0

    .line 412
    iget p1, p0, Ll/֨֡ᩴ;->᩹:I

    new-array p1, p1, [Ljava/lang/Object;

    goto :goto_0

    .line 413
    :cond_0
    array-length v0, p1

    iget v1, p0, Ll/֨֡ᩴ;->᩹:I

    if-ge v0, v1, :cond_1

    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    iget v0, p0, Ll/֨֡ᩴ;->᩹:I

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 416
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/֨֡ᩴ;->᩹:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 417
    array-length v0, p1

    iget v1, p0, Ll/֨֡ᩴ;->᩹:I

    if-le v0, v1, :cond_2

    const/4 v0, 0x0

    .line 418
    aput-object v0, p1, v1

    :cond_2
    return-object p1
.end method
