.class public final Ll/۟ۘ֫;
.super Ljava/lang/Object;
.source "Z8JL"


# static fields
.field public static final ܽ:Ll/۟ۘ֫;

.field public static final ᩳ:Ll/ܰۘ֫;


# instance fields
.field public final ֫:I

.field public final ۧ:[Ll/ܰۘ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 762
    new-instance v0, Ll/۟ۘ֫;

    const/4 v1, 0x0

    new-array v1, v1, [Ll/ܰۘ֫;

    invoke-direct {v0, v1}, Ll/۟ۘ֫;-><init>([Ll/ܰۘ֫;)V

    sput-object v0, Ll/۟ۘ֫;->ܽ:Ll/۟ۘ֫;

    .line 770
    new-instance v0, Ll/ܰۘ֫;

    invoke-direct {v0}, Ll/ܰۘ֫;-><init>()V

    invoke-virtual {v0}, Ll/ܰۘ֫;->֫()Ll/ܰۘ֫;

    move-result-object v0

    sput-object v0, Ll/۟ۘ֫;->ᩳ:Ll/ܰۘ֫;

    const/4 v0, 0x1

    .line 1519
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 1520
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x3

    .line 1521
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x4

    .line 1522
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>([Ll/ܰۘ֫;)V
    .locals 1

    .line 819
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 823
    array-length v0, p1

    iput v0, p0, Ll/۟ۘ֫;->֫:I

    .line 824
    iput-object p1, p0, Ll/۟ۘ֫;->ۧ:[Ll/ܰۘ֫;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 1426
    const-class v0, Ll/۟ۘ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 1429
    :cond_1
    check-cast p1, Ll/۟ۘ֫;

    .line 1430
    iget v0, p0, Ll/۟ۘ֫;->֫:I

    iget v1, p1, Ll/۟ۘ֫;->֫:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/۟ۘ֫;->ۧ:[Ll/ܰۘ֫;

    iget-object p1, p1, Ll/۟ۘ֫;->ۧ:[Ll/ܰۘ֫;

    .line 1435
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

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
    .locals 3

    .line 1442
    iget v0, p0, Ll/۟ۘ֫;->֫:I

    mul-int/lit16 v0, v0, 0x3c1

    const-wide/16 v1, 0x0

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3c1

    .line 1445
    iget-object v1, p0, Ll/۟ۘ֫;->ۧ:[Ll/ܰۘ֫;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1451
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 1457
    :goto_0
    iget-object v2, p0, Ll/۟ۘ֫;->ۧ:[Ll/ܰۘ֫;

    array-length v3, v2

    const-string v4, "])"

    if-ge v1, v3, :cond_8

    const-string v3, "adGroup(timeUs=0, ads=["

    .line 1458
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1459
    aget-object v3, v2, v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    .line 1461
    :goto_1
    aget-object v5, v2, v1

    iget-object v5, v5, Ll/ܰۘ֫;->ܳ:[I

    array-length v5, v5

    const-string v6, ", "

    const/4 v7, 0x1

    if-ge v3, v5, :cond_6

    const-string v5, "ad(state="

    .line 1462
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1463
    aget-object v5, v2, v1

    iget-object v5, v5, Ll/ܰۘ֫;->ܳ:[I

    aget v5, v5, v3

    if-eqz v5, :cond_4

    if-eq v5, v7, :cond_3

    const/4 v8, 0x2

    if-eq v5, v8, :cond_2

    const/4 v8, 0x3

    if-eq v5, v8, :cond_1

    const/4 v8, 0x4

    if-eq v5, v8, :cond_0

    const/16 v5, 0x3f

    .line 1480
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    const/16 v5, 0x21

    .line 1468
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const/16 v5, 0x50

    .line 1474
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const/16 v5, 0x53

    .line 1477
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    const/16 v5, 0x52

    .line 1471
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    const/16 v5, 0x5f

    .line 1465
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    const-string v5, ", durationUs="

    .line 1483
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1484
    aget-object v5, v2, v1

    iget-object v5, v5, Ll/ܰۘ֫;->ۧ:[J

    aget-wide v8, v5, v3

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v5, 0x29

    .line 1485
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1486
    aget-object v5, v2, v1

    iget-object v5, v5, Ll/ܰۘ֫;->ܳ:[I

    array-length v5, v5

    sub-int/2addr v5, v7

    if-ge v3, v5, :cond_5

    .line 1487
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1490
    :cond_6
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1491
    array-length v2, v2

    sub-int/2addr v2, v7

    if-ge v1, v2, :cond_7

    .line 1492
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 1495
    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1496
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ܰۘ֫;
    .locals 1

    if-gez p1, :cond_0

    .line 831
    sget-object p1, Ll/۟ۘ֫;->ᩳ:Ll/ܰۘ֫;

    return-object p1

    .line 832
    :cond_0
    iget-object v0, p0, Ll/۟ۘ֫;->ۧ:[Ll/ܰۘ֫;

    aget-object p1, v0, p1

    return-object p1
.end method
