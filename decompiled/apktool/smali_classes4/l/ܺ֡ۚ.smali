.class public final Ll/ܺ֡ۚ;
.super Ljava/lang/Object;
.source "R2TM"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᩶:[Ljava/lang/Object;

.field public ᩸:[Ljava/lang/String;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput v0, p0, Ll/ܺ֡ۚ;->᩹:I

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/String;

    .line 51
    iput-object v1, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    .line 52
    iput-object v0, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    return-void
.end method

.method private remove(I)V
    .locals 3

    .line 217
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    if-ge p1, v0, :cond_1

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    if-lez v0, :cond_0

    .line 220
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    add-int/lit8 v2, p1, 0x1

    invoke-static {v1, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 221
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    invoke-static {v1, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 223
    :cond_0
    iget p1, p0, Ll/ܺ֡ۚ;->᩹:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܺ֡ۚ;->᩹:I

    .line 224
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    .line 225
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aput-object v1, v0, p1

    return-void

    .line 101
    :cond_1
    new-instance p1, Ll/ܳ֡ۚ;

    const-string v0, "Must be false"

    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    throw p1
.end method

.method private ֫(I)V
    .locals 3

    .line 56
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Z)V

    .line 57
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    array-length v1, v0

    if-lt v1, p1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x3

    if-lt v1, v2, :cond_2

    .line 60
    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    mul-int/lit8 v2, v1, 0x2

    :cond_2
    if-le p1, v2, :cond_3

    goto :goto_1

    :cond_3
    move p1, v2

    .line 64
    :goto_1
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    .line 65
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    return-void
.end method

.method private ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 136
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Ll/ܺ֡ۚ;->֫(I)V

    .line 137
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    aput-object p2, v0, v1

    .line 138
    iget-object p2, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aput-object p1, p2, v1

    add-int/lit8 v1, v1, 0x1

    .line 139
    iput v1, p0, Ll/ܺ֡ۚ;->᩹:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺ֡ۚ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺ֡ۚ;->remove(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺ֡ۚ;Ljava/lang/String;)Z
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ܺ֡ۚ;->᩷(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۜ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "/"

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺ֡ۚ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܺ֡ۚ;->᩹:I

    return p0
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 560
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v1, 0x2f

    if-ne p0, v1, :cond_0

    return v2

    :cond_0
    return v0
.end method

.method private ᩻(Ljava/lang/String;)I
    .locals 2

    .line 78
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 79
    :goto_0
    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    if-ge v0, v1, :cond_1

    .line 80
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

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


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 35
    invoke-virtual {p0}, Ll/ܺ֡ۚ;->clone()Ll/ܺ֡ۚ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ܺ֡ۚ;
    .locals 3

    .line 450
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֡ۚ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 454
    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    iput v1, v0, Ll/ܺ֡ۚ;->᩹:I

    .line 455
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    iget v2, p0, Ll/ܺ֡ۚ;->᩹:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    .line 456
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    iget v2, p0, Ll/ܺ֡ۚ;->᩹:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    return-object v0

    :catch_0
    move-exception v0

    .line 452
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    .line 414
    const-class v2, Ll/ܺ֡ۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 416
    :cond_1
    check-cast p1, Ll/ܺ֡ۚ;

    .line 417
    iget v2, p0, Ll/ܺ֡ۚ;->᩹:I

    iget v3, p1, Ll/ܺ֡ۚ;->᩹:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    const/4 v2, 0x0

    .line 418
    :goto_0
    iget v3, p0, Ll/ܺ֡ۚ;->᩹:I

    if-ge v2, v3, :cond_6

    .line 419
    iget-object v3, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v3, v3, v2

    .line 420
    invoke-virtual {p1, v3}, Ll/ܺ֡ۚ;->ܿ(Ljava/lang/String;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    return v1

    .line 423
    :cond_3
    iget-object v4, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object v4, v4, v2

    .line 424
    iget-object v5, p1, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object v3, v5, v3

    if-nez v4, :cond_4

    if-eqz v3, :cond_5

    return v1

    .line 428
    :cond_4
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return v0

    :cond_7
    :goto_1
    return v1
.end method

.method public final get(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 99
    invoke-virtual {p0, p1}, Ll/ܺ֡ۚ;->ܿ(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    const-string v1, ""

    if-ne p1, v0, :cond_0

    return-object v1

    .line 100
    :cond_0
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object p1, v0, p1

    if-nez p1, :cond_1

    return-object v1

    .line 89
    :cond_1
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final hashCode()I
    .locals 2

    .line 440
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    mul-int/lit8 v0, v0, 0x1f

    .line 441
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 442
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 299
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 322
    new-instance v0, Ll/ۡ֡ۚ;

    invoke-direct {v0, p0}, Ll/ۡ֡ۚ;-><init>(Ll/ܺ֡ۚ;)V

    return-object v0
.end method

.method public final normalize()V
    .locals 3

    const/4 v0, 0x0

    .line 464
    :goto_0
    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    if-ge v0, v1, :cond_0

    .line 465
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v2, v1, v0

    invoke-static {v2}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 149
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 150
    invoke-virtual {p0, p1}, Ll/ܺ֡ۚ;->ܿ(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 152
    iget-object p1, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-void

    .line 131
    :cond_0
    invoke-direct {p0, p2, p1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final remove()V
    .locals 2

    const-string v0, "class"

    .line 233
    invoke-virtual {p0, v0}, Ll/ܺ֡ۚ;->ܿ(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 235
    invoke-direct {p0, v0}, Ll/ܺ֡ۚ;->remove(I)V

    :cond_0
    return-void
.end method

.method public final size()I
    .locals 1

    .line 292
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 402
    invoke-virtual {p0}, Ll/ܺ֡ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֫֨ۚ;)I
    .locals 6

    .line 475
    invoke-virtual {p0}, Ll/ܺ֡ۚ;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 477
    :cond_0
    invoke-virtual {p1}, Ll/֫֨ۚ;->֫()Z

    move-result p1

    const/4 v0, 0x0

    .line 479
    :goto_0
    iget-object v2, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    array-length v2, v2

    if-ge v1, v2, :cond_6

    add-int/lit8 v2, v1, 0x1

    move v3, v2

    .line 480
    :goto_1
    iget-object v4, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    array-length v5, v4

    if-ge v3, v5, :cond_5

    .line 481
    aget-object v5, v4, v3

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    .line 483
    aget-object v4, v4, v1

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    if-nez p1, :cond_4

    iget-object v4, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v5, v4, v1

    aget-object v4, v4, v3

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 485
    invoke-direct {p0, v3}, Ll/ܺ֡ۚ;->remove(I)V

    add-int/lit8 v3, v3, -0x1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    move v1, v2

    goto :goto_0

    :cond_6
    return v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 109
    invoke-direct {p0, p1}, Ll/ܺ֡ۚ;->᩻(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    const-string v1, ""

    if-ne p1, v0, :cond_0

    return-object v1

    .line 110
    :cond_0
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object p1, v0, p1

    if-nez p1, :cond_1

    return-object v1

    .line 89
    :cond_1
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫(Ljava/lang/Appendable;Ll/֡֡ۚ;)V
    .locals 5

    .line 390
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 392
    iget-object v2, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-static {v2}, Ll/ܺ֡ۚ;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 394
    :cond_0
    iget-object v2, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {p2}, Ll/֡֡ۚ;->᩷()Ll/᩵֡ۚ;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۢ֡ۚ;->֫(Ljava/lang/String;Ll/᩵֡ۚ;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 396
    iget-object v3, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object v3, v3, v1

    check-cast v3, Ljava/lang/String;

    const/16 v4, 0x20

    invoke-interface {p1, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object v4

    invoke-static {v2, v3, v4, p2}, Ll/ۢ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Appendable;Ll/֡֡ۚ;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 131
    invoke-direct {p0, p2, p1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/֫ۚۚ;)V
    .locals 2

    .line 166
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 167
    invoke-static {p1}, Ll/ܺ֡ۚ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ll/ܺ֡ۚ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 169
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܺ֡ۚ;->ܿ(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 171
    iget-object p1, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-void

    .line 173
    :cond_1
    invoke-direct {p0, p2, p1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۢ֡ۚ;)V
    .locals 2

    .line 209
    invoke-virtual {p1}, Ll/ۢ֡ۚ;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۢ֡ۚ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/ܺ֡ۚ;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    iput-object p0, p1, Ll/ۢ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    return-void
.end method

.method public final ֫(Ll/ܺ֡ۚ;)V
    .locals 5

    .line 292
    iget v0, p1, Ll/ܺ֡ۚ;->᩹:I

    if-nez v0, :cond_0

    goto :goto_1

    .line 309
    :cond_0
    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ܺ֡ۚ;->֫(I)V

    .line 311
    iget v0, p0, Ll/ܺ֡ۚ;->᩹:I

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 327
    :goto_0
    iget v2, p1, Ll/ܺ֡ۚ;->᩹:I

    if-ge v1, v2, :cond_2

    .line 328
    iget-object v2, p1, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-static {v2}, Ll/ܺ֡ۚ;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 334
    :cond_2
    iget v2, p1, Ll/ܺ֡ۚ;->᩹:I

    if-ge v1, v2, :cond_4

    .line 339
    new-instance v2, Ll/ۢ֡ۚ;

    iget-object v3, p1, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v3, v3, v1

    iget-object v4, p1, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object v4, v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-direct {v2, v3, v4, p1}, Ll/ۢ֡ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    add-int/lit8 v1, v1, 0x1

    if-eqz v0, :cond_3

    .line 315
    invoke-virtual {p0, v2}, Ll/ܺ֡ۚ;->֫(Ll/ۢ֡ۚ;)V

    goto :goto_0

    .line 317
    :cond_3
    invoke-virtual {v2}, Ll/ۢ֡ۚ;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ll/ۢ֡ۚ;->getValue()Ljava/lang/String;

    move-result-object v2

    .line 131
    invoke-direct {p0, v2, v3}, Ll/ܺ֡ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 120
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 121
    invoke-static {p1}, Ll/ܺ֡ۚ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ll/ܺ֡ۚ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 122
    :cond_0
    invoke-direct {p0, p1}, Ll/ܺ֡ۚ;->᩻(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 123
    :cond_1
    iget-object v0, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 178
    invoke-direct {p0, p1}, Ll/ܺ֡ۚ;->᩻(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 180
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aput-object p2, v1, v0

    .line 181
    iget-object p2, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object p2, p2, v0

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 182
    iget-object p2, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aput-object p1, p2, v0

    :cond_0
    return-void

    .line 131
    :cond_1
    invoke-direct {p0, p2, p1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 1

    .line 243
    invoke-direct {p0, p1}, Ll/ܺ֡ۚ;->᩻(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 245
    invoke-direct {p0, p1}, Ll/ܺ֡ۚ;->remove(I)V

    :cond_0
    return-void
.end method

.method public final ܽ()Ljava/util/List;
    .locals 5

    .line 356
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 357
    :goto_0
    iget v2, p0, Ll/ܺ֡ۚ;->᩹:I

    if-ge v1, v2, :cond_1

    .line 358
    iget-object v2, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-static {v2}, Ll/ܺ֡ۚ;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 360
    :cond_0
    new-instance v2, Ll/ۢ֡ۚ;

    iget-object v3, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v3, v3, v1

    iget-object v4, p0, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object v4, v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-direct {v2, v3, v4, p0}, Ll/ۢ֡ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    .line 361
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 363
    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 1

    .line 254
    invoke-virtual {p0, p1}, Ll/ܺ֡ۚ;->ܿ(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(Ljava/lang/String;)I
    .locals 2

    .line 69
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 70
    :goto_0
    iget v1, p0, Ll/ܺ֡ۚ;->᩹:I

    if-ge v0, v1, :cond_1

    .line 71
    iget-object v1, p0, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

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
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 3

    .line 380
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 382
    :try_start_0
    new-instance v1, Ll/֨֡ۚ;

    const-string v2, ""

    invoke-direct {v1, v2}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/֨֡ۚ;->֡֫()Ll/֡֡ۚ;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/Appendable;Ll/֡֡ۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 386
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 384
    new-instance v1, Ll/֫֡ۚ;

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 384
    throw v1
.end method

.method public final ᩳ(Ljava/lang/String;)Z
    .locals 1

    .line 263
    invoke-direct {p0, p1}, Ll/ܺ֡ۚ;->᩻(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
