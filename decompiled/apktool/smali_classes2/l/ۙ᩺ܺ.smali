.class public final Ll/ۙ᩺ܺ;
.super Ljava/lang/Object;
.source "D2QB"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ۙ:Ll/ۙ᩺ܺ;

.field public static final synthetic ᩶:I


# instance fields
.field public final ᩸:[I

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 89
    new-instance v0, Ll/ۙ᩺ܺ;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-direct {v0, v1}, Ll/ۙ᩺ܺ;-><init>([I)V

    sput-object v0, Ll/ۙ᩺ܺ;->ۙ:Ll/ۙ᩺ܺ;

    return-void
.end method

.method public constructor <init>([I)V
    .locals 1

    .line 354
    array-length v0, p1

    .line 357
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    iput-object p1, p0, Ll/ۙ᩺ܺ;->᩸:[I

    .line 360
    iput v0, p0, Ll/ۙ᩺ܺ;->᩹:I

    return-void
.end method

.method public static ֫([I)V
    .locals 2

    .line 146
    array-length v0, p0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/ۙ᩺ܺ;

    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۙ᩺ܺ;-><init>([I)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p1, p0, :cond_0

    goto :goto_2

    .line 582
    :cond_0
    instance-of v0, p1, Ll/ۙ᩺ܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    .line 585
    :cond_1
    check-cast p1, Ll/ۙ᩺ܺ;

    iget v0, p1, Ll/ۙ᩺ܺ;->᩹:I

    .line 586
    iget v2, p0, Ll/ۙ᩺ܺ;->᩹:I

    if-eq v2, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    .line 380
    invoke-static {v3, v2}, Ll/ۘܶܺ;->֫(II)V

    .line 381
    iget-object v4, p0, Ll/ۙ᩺ܺ;->᩸:[I

    aget v4, v4, v3

    .line 380
    invoke-static {v3, v0}, Ll/ۘܶܺ;->֫(II)V

    .line 381
    iget-object v5, p1, Ll/ۙ᩺ܺ;->᩸:[I

    aget v5, v5, v3

    if-eq v4, v5, :cond_3

    :goto_1
    return v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 601
    :goto_0
    iget v2, p0, Ll/ۙ᩺ܺ;->᩹:I

    if-ge v1, v2, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    .line 603
    iget-object v2, p0, Ll/ۙ᩺ܺ;->᩸:[I

    aget v2, v2, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public readResolve()Ljava/lang/Object;
    .locals 1

    .line 370
    iget v0, p0, Ll/ۙ᩺ܺ;->᩹:I

    if-nez v0, :cond_0

    .line 646
    sget-object v0, Ll/ۙ᩺ܺ;->ۙ:Ll/ۙ᩺ܺ;

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 370
    iget v0, p0, Ll/ۙ᩺ܺ;->᩹:I

    if-nez v0, :cond_0

    const-string v0, "[]"

    return-object v0

    .line 617
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x5

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x5b

    .line 618
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۙ᩺ܺ;->᩸:[I

    const/4 v3, 0x0

    aget v3, v2, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v0, :cond_1

    const-string v4, ", "

    .line 621
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v4, v2, v3

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0x5d

    .line 623
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 624
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 4

    .line 638
    iget-object v0, p0, Ll/ۙ᩺ܺ;->᩸:[I

    array-length v1, v0

    iget v2, p0, Ll/ۙ᩺ܺ;->᩹:I

    if-ge v2, v1, :cond_0

    .line 634
    new-instance v1, Ll/ۙ᩺ܺ;

    const/4 v3, 0x0

    .line 444
    invoke-static {v0, v3, v2}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v0

    .line 634
    invoke-direct {v1, v0}, Ll/ۙ᩺ܺ;-><init>([I)V

    return-object v1

    :cond_0
    return-object p0
.end method
