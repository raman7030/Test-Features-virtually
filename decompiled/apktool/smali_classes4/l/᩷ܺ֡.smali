.class public final Ll/᩷ܺ֡;
.super Ljava/lang/Object;
.source "X4TD"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/Integer;

.field public final ᩶:Ljava/lang/Integer;

.field public final ᩸:Ljava/util/Comparator;

.field public transient ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    sget-object v0, Ll/ۜܺ֡;->᩹:Ll/ۜܺ֡;

    iput-object v0, p0, Ll/᩷ܺ֡;->᩸:Ljava/util/Comparator;

    .line 155
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 156
    iput-object p1, p0, Ll/᩷ܺ֡;->ۙ:Ljava/lang/Integer;

    .line 157
    iput-object p2, p0, Ll/᩷ܺ֡;->᩶:Ljava/lang/Integer;

    return-void

    .line 159
    :cond_0
    iput-object p2, p0, Ll/᩷ܺ֡;->ۙ:Ljava/lang/Integer;

    .line 160
    iput-object p1, p0, Ll/᩷ܺ֡;->᩶:Ljava/lang/Integer;

    return-void
.end method

.method public static ֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/᩷ܺ֡;
    .locals 1

    .line 134
    new-instance v0, Ll/᩷ܺ֡;

    invoke-direct {v0, p0, p1}, Ll/᩷ܺ֡;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 408
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/᩷ܺ֡;

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 413
    :cond_1
    check-cast p1, Ll/᩷ܺ֡;

    .line 414
    iget-object v0, p0, Ll/᩷ܺ֡;->ۙ:Ljava/lang/Integer;

    iget-object v1, p1, Ll/᩷ܺ֡;->ۙ:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩷ܺ֡;->᩶:Ljava/lang/Integer;

    iget-object p1, p1, Ll/᩷ܺ֡;->᩶:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 426
    iget v0, p0, Ll/᩷ܺ֡;->᩹:I

    if-nez v0, :cond_0

    .line 429
    const-class v0, Ll/᩷ܺ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x275

    mul-int/lit8 v0, v0, 0x25

    .line 430
    iget-object v1, p0, Ll/᩷ܺ֡;->ۙ:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x25

    .line 431
    iget-object v0, p0, Ll/᩷ܺ֡;->᩶:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    .line 432
    iput v0, p0, Ll/᩷ܺ֡;->᩹:I

    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 446
    iget-object v0, p0, Ll/᩷ܺ֡;->ۗ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 447
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩷ܺ֡;->ۙ:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷ܺ֡;->᩶:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ܺ֡;->ۗ:Ljava/lang/String;

    .line 449
    :cond_0
    iget-object v0, p0, Ll/᩷ܺ֡;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Integer;)Z
    .locals 3

    .line 222
    iget-object v0, p0, Ll/᩷ܺ֡;->ۙ:Ljava/lang/Integer;

    iget-object v1, p0, Ll/᩷ܺ֡;->᩸:Ljava/util/Comparator;

    invoke-interface {v1, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-le v0, v2, :cond_0

    iget-object v0, p0, Ll/᩷ܺ֡;->᩶:Ljava/lang/Integer;

    invoke-interface {v1, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
