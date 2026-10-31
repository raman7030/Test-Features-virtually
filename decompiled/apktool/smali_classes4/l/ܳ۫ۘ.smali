.class public final Ll/ܳ۫ۘ;
.super Ljava/lang/Object;
.source "R2TM"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ۙ:[Ljava/lang/String;


# instance fields
.field public ᩶:[Ljava/lang/String;

.field public ᩸:[Ljava/lang/String;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 29
    sput-object v0, Ll/ܳ۫ۘ;->ۙ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput v0, p0, Ll/ܳ۫ۘ;->᩹:I

    .line 34
    sget-object v0, Ll/ܳ۫ۘ;->ۙ:[Ljava/lang/String;

    iput-object v0, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    .line 35
    iput-object v0, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܳ۫ۘ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳ۫ۘ;->᩹:I

    return p0
.end method

.method public static ֫(Ll/ܳ۫ۘ;I)V
    .locals 3

    .line 170
    iget v0, p0, Ll/ܳ۫ۘ;->᩹:I

    if-ge p1, v0, :cond_1

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    if-lez v0, :cond_0

    .line 173
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    add-int/lit8 v2, p1, 0x1

    invoke-static {v1, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 174
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    invoke-static {v1, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 176
    :cond_0
    iget p1, p0, Ll/ܳ۫ۘ;->᩹:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܳ۫ۘ;->᩹:I

    .line 177
    iget-object v0, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    .line 178
    iget-object p0, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    aput-object v1, p0, p1

    return-void

    .line 60
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Must be false"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 6

    .line 370
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ۫ۘ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 374
    iget v1, p0, Ll/ܳ۫ۘ;->᩹:I

    iput v1, v0, Ll/ܳ۫ۘ;->᩹:I

    .line 375
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    iget v2, p0, Ll/ܳ۫ۘ;->᩹:I

    .line 54
    new-array v3, v2, [Ljava/lang/String;

    .line 55
    array-length v4, v1

    .line 56
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v4, 0x0

    .line 55
    invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 375
    iput-object v3, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    .line 376
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    iget v2, p0, Ll/ܳ۫ۘ;->᩹:I

    .line 54
    new-array v3, v2, [Ljava/lang/String;

    .line 55
    array-length v5, v1

    .line 56
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 55
    invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 376
    iput-object v3, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    return-object v0

    :catch_0
    move-exception v0

    .line 372
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 344
    const-class v1, Ll/ܳ۫ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 346
    :cond_1
    check-cast p1, Ll/ܳ۫ۘ;

    .line 348
    iget v1, p0, Ll/ܳ۫ۘ;->᩹:I

    iget v2, p1, Ll/ܳ۫ۘ;->᩹:I

    if-eq v1, v2, :cond_2

    return v0

    .line 349
    :cond_2
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    iget-object v2, p1, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    .line 350
    :cond_3
    iget-object v0, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    iget-object p1, p1, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 360
    iget v0, p0, Ll/ܳ۫ۘ;->᩹:I

    mul-int/lit8 v0, v0, 0x1f

    .line 361
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 362
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 250
    new-instance v0, Ll/ܿ۫ۘ;

    invoke-direct {v0, p0}, Ll/ܿ۫ۘ;-><init>(Ll/ܳ۫ۘ;)V

    return-object v0
.end method

.method public final put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 122
    invoke-virtual {p0, p1}, Ll/ܳ۫ۘ;->֫(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 124
    iget-object p1, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    aput-object p2, p1, v0

    return-void

    .line 108
    :cond_0
    iget v0, p0, Ll/ܳ۫ۘ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    if-lt v1, v0, :cond_4

    .line 40
    iget-object v2, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    array-length v3, v2

    if-lt v3, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x4

    if-lt v3, v4, :cond_2

    mul-int/lit8 v4, v0, 0x2

    :cond_2
    if-le v1, v4, :cond_3

    goto :goto_0

    :cond_3
    move v1, v4

    .line 54
    :goto_0
    new-array v0, v1, [Ljava/lang/String;

    .line 55
    array-length v3, v2

    .line 56
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    .line 55
    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    iput-object v0, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    .line 49
    iget-object v0, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    .line 54
    new-array v2, v1, [Ljava/lang/String;

    .line 55
    array-length v3, v0

    .line 56
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 55
    invoke-static {v0, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    iput-object v2, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    .line 109
    :goto_1
    iget-object v0, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    iget v1, p0, Ll/ܳ۫ۘ;->᩹:I

    aput-object p1, v0, v1

    .line 110
    iget-object p1, p0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 111
    iput v1, p0, Ll/ܳ۫ۘ;->᩹:I

    return-void

    .line 39
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must be true"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 229
    iget v0, p0, Ll/ܳ۫ۘ;->᩹:I

    return v0
.end method

.method public final ֫(Ljava/lang/String;)I
    .locals 2

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 62
    :goto_0
    iget v1, p0, Ll/ܳ۫ۘ;->᩹:I

    if-ge v0, v1, :cond_1

    .line 63
    iget-object v1, p0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1

    .line 18
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Object must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
