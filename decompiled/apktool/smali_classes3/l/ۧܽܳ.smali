.class public final Ll/ۧܽܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֫֫:J

.field public ۗ:Ll/۫֫ܳ;

.field public ۙ:J

.field public ۛ:J

.field public final ۟:Ll/ᩳܽܳ;

.field public volatile ۤ:Z

.field public ۧ֫:Ljava/lang/Thread;

.field public final ۨ:Ljava/util/IdentityHashMap;

.field public final ۫:J

.field public ۬:J

.field public ܰ:Z

.field public ܳ֫:Z

.field public ܽ֫:J

.field public ܿ֫:Ll/ۡᩳܳ;

.field public ᩳ֫:Ll/ۙۧܳ;

.field public final ᩶:Ll/۟ۧܳ;

.field public ᩸:Ll/֫ܽܳ;

.field public final ᩹:Ll/ܶۧܳ;

.field public ᩺:Z


# direct methods
.method public constructor <init>(Ll/ᩳܽܳ;Ll/۟ۧܳ;JLl/ܶۧܳ;)V
    .locals 1

    .line 3918
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3908
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    .line 3919
    iput-object p1, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    .line 3920
    iput-object p2, p0, Ll/ۧܽܳ;->᩶:Ll/۟ۧܳ;

    .line 3921
    iput-wide p3, p0, Ll/ۧܽܳ;->۫:J

    .line 3922
    iput-object p5, p0, Ll/ۧܽܳ;->᩹:Ll/ܶۧܳ;

    .line 3923
    iget-object p1, p2, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    iput-object p1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 3924
    iget-object p1, p2, Ll/۟ۧܳ;->ܽ:Ll/۫֫ܳ;

    iput-object p1, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    .line 3925
    iget-wide p3, p2, Ll/۟ۧܳ;->ۧ:J

    iput-wide p3, p0, Ll/ۧܽܳ;->ۙ:J

    .line 3926
    iget-wide p3, p2, Ll/۟ۧܳ;->ܳ:J

    iput-wide p3, p0, Ll/ۧܽܳ;->ۛ:J

    .line 3927
    iget-wide p3, p2, Ll/۟ۧܳ;->ۜ:J

    iput-wide p3, p0, Ll/ۧܽܳ;->֫֫:J

    .line 3928
    iget-wide p3, p2, Ll/۟ۧܳ;->᩷:J

    iput-wide p3, p0, Ll/ۧܽܳ;->ܽ֫:J

    .line 3929
    iget-wide p1, p2, Ll/۟ۧܳ;->ᩳ:J

    iput-wide p1, p0, Ll/ۧܽܳ;->۬:J

    return-void
.end method

.method public static bridge synthetic ֡(Ll/ۧܽܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۧܽܳ;->ܳ֫:Z

    return p0
.end method

.method public static bridge synthetic ֨(Ll/ۧܽܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۧܽܳ;->ۤ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧܽܳ;)Ll/֫ܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧܽܳ;->᩸:Ll/֫ܽܳ;

    return-object p0
.end method

.method private ֫(Ll/ۡᩳܳ;ILl/᩸ۧܳ;)Ll/ۡᩳܳ;
    .locals 5

    .line 4568
    iget-wide v0, p0, Ll/ۧܽܳ;->ۙ:J

    const-wide/32 v2, 0x7f0000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 49
    :cond_0
    iget v1, p1, Ll/ۡᩳܳ;->ܿ:I

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_1

    goto :goto_2

    .line 4572
    :cond_1
    invoke-static {p2, p1}, Ll/᩵ᩳܳ;->ܽ(ILl/ۡᩳܳ;)Ll/ۢᩳܳ;

    move-result-object p2

    .line 4574
    invoke-virtual {p2}, Ll/ۢᩳܳ;->ܽ()Ll/ۡᩳܳ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 4575
    invoke-virtual {p2}, Ll/ۢᩳܳ;->ܽ()Ll/ۡᩳܳ;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 49
    :cond_2
    iget v0, v1, Ll/ۡᩳܳ;->ܿ:I

    :goto_1
    if-gt v0, v2, :cond_3

    goto :goto_2

    .line 4578
    :cond_3
    invoke-virtual {p2}, Ll/ۢᩳܳ;->length()I

    move-result v0

    new-array v1, v0, [B

    .line 4579
    invoke-virtual {p2}, Ll/ۢᩳܳ;->ܽ()Ll/ۡᩳܳ;

    move-result-object v2

    invoke-static {v2, v1}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;[B)V

    .line 4580
    invoke-virtual {p3, v0, v1}, Ll/᩸ۧܳ;->֫(I[B)Ll/ۡᩳܳ;

    move-result-object p3

    .line 4581
    invoke-virtual {p2}, Ll/ۢᩳܳ;->֫()I

    move-result v0

    .line 4582
    invoke-virtual {p2}, Ll/ۢᩳܳ;->֫()I

    move-result v1

    invoke-virtual {p2}, Ll/ۢᩳܳ;->length()I

    move-result p2

    add-int/2addr v1, p2

    .line 4581
    invoke-static {p1, v0, v1, p3}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;IILl/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object p1

    :cond_4
    :goto_2
    return-object p1
.end method

.method private ֫()V
    .locals 3

    .line 4647
    invoke-direct {p0}, Ll/ۧܽܳ;->ܽ()V

    .line 4648
    iget-boolean v0, p0, Ll/ۧܽܳ;->ۤ:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v0}, Ll/ᩳܽܳ;->֫(Ll/ᩳܽܳ;)Ll/ۧܽܳ;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    .line 4651
    :cond_0
    iget-object v0, p0, Ll/ۧܽܳ;->᩸:Ll/֫ܽܳ;

    if-eqz v0, :cond_1

    .line 4652
    invoke-static {v0}, Ll/֫ܽܳ;->֫(Ll/֫ܽܳ;)V

    const/4 v0, 0x0

    .line 4653
    iput-object v0, p0, Ll/ۧܽܳ;->᩸:Ll/֫ܽܳ;

    .line 4655
    :cond_1
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v0}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧܽܳ;->᩹:Ll/ܶۧܳ;

    invoke-virtual {v0, v1}, Ll/᩸ۧܳ;->֫(Ll/ܶۧܳ;)V

    .line 4524
    iget-object v0, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ll/ᩴܽܳ;

    invoke-interface {v1, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ᩴܽܳ;

    .line 4525
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    .line 4526
    invoke-static {v1}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;)V

    .line 4657
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v0}, Ll/ᩳܽܳ;->ۢ(Ll/ᩳܽܳ;)V

    const/4 v0, 0x1

    .line 4658
    iput-boolean v0, p0, Ll/ۧܽܳ;->ۤ:Z

    .line 4659
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    :cond_2
    :goto_0
    return-void
.end method

.method private ֫(III)V
    .locals 4

    .line 4586
    invoke-virtual {p0}, Ll/ۧܽܳ;->length()I

    move-result v0

    if-ltz p1, :cond_1

    if-lt p2, p1, :cond_1

    if-gt p2, v0, :cond_1

    int-to-long v0, v0

    sub-int/2addr p2, p1

    int-to-long p1, p2

    sub-long/2addr v0, p1

    int-to-long p1, p3

    add-long/2addr v0, p1

    const-wide/32 p1, 0x7fffffff

    cmp-long p3, v0, p1

    if-gtz p3, :cond_0

    return-void

    .line 4593
    :cond_0
    new-instance p1, Ll/۟֫ܳ;

    invoke-direct {p1}, Ll/۟֫ܳ;-><init>()V

    throw p1

    .line 4588
    :cond_1
    new-instance p3, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", end="

    const-string v2, ", length="

    const-string v3, "start="

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 4588
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method private ֫(Ll/ۡᩳܳ;Ll/۫֫ܳ;)V
    .locals 4

    .line 5044
    invoke-static {p1}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۧܽܳ;->֫֫:J

    .line 5043
    invoke-static {v0, v1, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 5045
    invoke-static {p1}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 5046
    iget-wide v2, p0, Ll/ۧܽܳ;->ܽ֫:J

    invoke-static {v0, v1, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 5047
    invoke-static {p2}, Ll/ܰ֫ܳ;->ܳ(Ll/۫֫ܳ;)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide p1

    .line 5048
    invoke-static {p1, p2}, Ll/ᩳܽܳ;->ۧ(J)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 5049
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Edit metadata exceeds memory limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۧܽܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۧܽܳ;->ۙ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧܽܳ;Ll/ۡᩳܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧܽܳ;Ll/۫֫ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    return-void
.end method

.method public static ֫(Ll/ۧܽܳ;Ll/ܿۖ᩷;)V
    .locals 0

    .line 4541
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 4542
    :cond_0
    invoke-direct {p0}, Ll/ۧܽܳ;->֫()V

    .line 4543
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۧܽܳ;[Ll/ᩴܽܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۧܽܳ;->֫([Ll/ᩴܽܳ;)V

    return-void
.end method

.method private ֫([Ll/ᩴܽܳ;)V
    .locals 5

    .line 4511
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    if-ge v2, v0, :cond_1

    aget-object v4, p1, v2

    .line 4512
    invoke-virtual {v3, v4}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v3}, Ll/ᩳܽܳ;->ܳ(Ll/ᩳܽܳ;)Ljava/util/IdentityHashMap;

    move-result-object v3

    .line 4513
    invoke-virtual {v3, v4}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4514
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Created source is already owned"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4517
    :cond_1
    array-length v0, p1

    :goto_1
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 4518
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v2, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private ֫(I)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ltz p1, :cond_2

    int-to-long v1, p1

    const-wide/32 v3, 0xffff

    add-long/2addr v1, v3

    const-wide/32 v3, 0x10000

    .line 5214
    div-long/2addr v1, v3

    mul-long v1, v1, v3

    .line 4136
    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4138
    iget-wide v3, p0, Ll/ۧܽܳ;->ۙ:J

    invoke-static {v3, v4, v1, v2}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    const-wide/32 v3, 0x800000

    cmp-long p1, v1, v3

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    .line 5212
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative literal length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ۖ(Ll/ۧܽܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧܽܳ;->֫֫:J

    return-wide v0
.end method

.method public static ۗ(Ll/ۧܽܳ;)V
    .locals 2

    .line 4524
    iget-object p0, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    invoke-virtual {p0}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ll/ᩴܽܳ;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴܽܳ;

    .line 4525
    invoke-virtual {p0}, Ljava/util/IdentityHashMap;->clear()V

    .line 4526
    invoke-static {v0}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;)V

    return-void
.end method

.method public static bridge synthetic ۘ(Ll/ۧܽܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧܽܳ;->ܽ֫:J

    return-wide v0
.end method

.method public static ۙ(Ll/ۧܽܳ;)V
    .locals 6

    .line 4484
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4485
    iget-object v1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v1, v0}, Ll/᩵ᩳܳ;->ܽ(Ll/ۡᩳܳ;Ljava/util/IdentityHashMap;)V

    .line 4486
    iget-object v1, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴܽܳ;

    .line 4487
    invoke-virtual {v0, v3}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v4}, Ll/ᩳܽܳ;->ܳ(Ll/ᩳܽܳ;)Ljava/util/IdentityHashMap;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4488
    invoke-virtual {v4, v3, v5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    :cond_1
    const/4 v4, 0x1

    new-array v4, v4, [Ll/ᩴܽܳ;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    .line 4489
    invoke-static {v4}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;)V

    goto :goto_0

    .line 4492
    :cond_2
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->clear()V

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/ۧܽܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۧܽܳ;->᩸:Ll/֫ܽܳ;

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۧܽܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۧܽܳ;->ۤ:Z

    return p0
.end method

.method public static bridge synthetic ۠(Ll/ۧܽܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۧܽܳ;->᩺:Z

    return-void
.end method

.method public static bridge synthetic ۡ(Ll/ۧܽܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۧܽܳ;->ܰ:Z

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/ۧܽܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۧܽܳ;->᩺:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۧܽܳ;)Ll/ܶۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧܽܳ;->᩹:Ll/ܶۧܳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۧܽܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۧܽܳ;->۬:J

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۧܽܳ;[Ll/ᩴܽܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۧܽܳ;->ۧ([Ll/ᩴܽܳ;)V

    return-void
.end method

.method private ۧ([Ll/ᩴܽܳ;)V
    .locals 9

    .line 4497
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v0}, Ll/ᩳܽܳ;->ܳ(Ll/ᩳܽܳ;)Ljava/util/IdentityHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 4498
    iget-object v1, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 1424
    new-instance v3, Ljava/util/IdentityHashMap;

    invoke-direct {v3}, Ljava/util/IdentityHashMap;-><init>()V

    .line 1425
    new-instance v4, Ljava/util/IdentityHashMap;

    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 1426
    new-instance v5, Ljava/util/ArrayDeque;

    invoke-direct {v5}, Ljava/util/ArrayDeque;-><init>()V

    .line 1427
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴܽܳ;

    .line 1428
    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    .line 1430
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴܽܳ;

    .line 1431
    invoke-virtual {v5, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_1

    .line 1433
    :cond_1
    array-length v0, p1

    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v0, :cond_2

    aget-object v7, p1, v6

    .line 1434
    invoke-virtual {v5, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 1436
    :cond_2
    :goto_3
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1437
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴܽܳ;

    .line 1438
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v0, v6}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_3

    goto :goto_3

    .line 1441
    :cond_3
    instance-of v7, v0, Ll/ۚܽܳ;

    if-eqz v7, :cond_4

    check-cast v0, Ll/ۚܽܳ;

    .line 1442
    invoke-virtual {v4, v0, v6}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 1443
    :cond_4
    instance-of v6, v0, Ll/ۛۧܳ;

    if-eqz v6, :cond_2

    check-cast v0, Ll/ۛۧܳ;

    .line 1444
    invoke-static {v0}, Ll/ۛۧܳ;->ۧ(Ll/ۛۧܳ;)[Ll/ᩴܽܳ;

    move-result-object v0

    array-length v6, v0

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v6, :cond_2

    aget-object v8, v0, v7

    .line 1445
    invoke-virtual {v5, v8}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 1449
    :cond_5
    invoke-virtual {v4}, Ljava/util/IdentityHashMap;->size()I

    move-result v0

    const/16 v3, 0x40

    if-gt v0, v3, :cond_8

    .line 4501
    array-length v0, p1

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v0, :cond_7

    aget-object v4, p1, v3

    .line 4503
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v4, v5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_6

    const/4 v5, 0x1

    new-array v5, v5, [Ll/ᩴܽܳ;

    aput-object v4, v5, v2

    .line 4504
    invoke-static {v5}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;)V

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_7
    return-void

    .line 4499
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Too many external file sources"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۬(Ll/ۧܽܳ;)V
    .locals 1

    .line 4474
    iget-object v0, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳܽܳ;->֫(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4475
    :cond_0
    invoke-direct {p0}, Ll/ۧܽܳ;->֫()V

    .line 4476
    new-instance p0, Ll/ۚᩳܳ;

    invoke-direct {p0}, Ll/ۚᩳܳ;-><init>()V

    throw p0
.end method

.method public static bridge synthetic ܳ(Ll/ۧܽܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧܽܳ;->۬:J

    return-wide v0
.end method

.method private ܳ()V
    .locals 5

    .line 4598
    invoke-direct {p0}, Ll/ۧܽܳ;->ܽ()V

    .line 4599
    iget-boolean v0, p0, Ll/ۧܽܳ;->ۤ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v0}, Ll/ᩳܽܳ;->֫(Ll/ᩳܽܳ;)Ll/ۧܽܳ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-wide v0, p0, Ll/ۧܽܳ;->۫:J

    iget-object v2, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v2}, Ll/ᩳܽܳ;->ۜ(Ll/ᩳܽܳ;)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v0}, Ll/ᩳܽܳ;->ܽ(Ll/ᩳܽܳ;)Ll/۟ۧܳ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧܽܳ;->᩶:Ll/۟ۧܳ;

    if-ne v0, v1, :cond_0

    return-void

    .line 4601
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Transaction is not active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܶ(Ll/ۧܽܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۧܽܳ;->ܰ:Z

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ۧܽܳ;)Ll/ᩳܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۧܽܳ;)Ll/۟ۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧܽܳ;->᩶:Ll/۟ۧܳ;

    return-object p0
.end method

.method private ܽ()V
    .locals 3

    .line 4626
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const/4 v1, 0x0

    .line 4627
    :goto_0
    iget-boolean v2, p0, Ll/ۧܽܳ;->ۤ:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Ll/ۧܽܳ;->ۧ֫:Ljava/lang/Thread;

    if-eqz v2, :cond_0

    if-eq v2, v0, :cond_0

    .line 4630
    :try_start_0
    iget-object v2, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 4636
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۧܽܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۧܽܳ;->ۛ:J

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ۧܽܳ;)Ll/۫֫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۧܽܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۧܽܳ;->ܽ֫:J

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۧܽܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧܽܳ;->ۙ:J

    return-wide v0
.end method

.method private ᩳ()V
    .locals 2

    .line 4607
    iget-object v0, p0, Ll/ۧܽܳ;->ۧ֫:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 4610
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ۧܽܳ;->ۧ֫:Ljava/lang/Thread;

    return-void

    .line 4608
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Range transfer is already active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ᩳ(Ll/ۧܽܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۧܽܳ;->֫֫:J

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۧܽܳ;)Ll/ۙۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧܽܳ;->ᩳ֫:Ll/ۙۧܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩵(Ll/ۧܽܳ;)Ll/ۡᩳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    return-object p0
.end method

.method public static ᩶(Ll/ۧܽܳ;)V
    .locals 2

    .line 5037
    iget-object v0, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    iget-object v1, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    invoke-direct {p0, v0, v1}, Ll/ۧܽܳ;->֫(Ll/ۡᩳܳ;Ll/۫֫ܳ;)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۧܽܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧܽܳ;->ۛ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩸(Ll/ۧܽܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۧܽܳ;->֫()V

    return-void
.end method

.method public static bridge synthetic ᩹(Ll/ۧܽܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ۧܽܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧܽܳ;->۫:J

    return-wide v0
.end method

.method private ᩻()V
    .locals 2

    .line 4641
    iget-object v0, p0, Ll/ۧܽܳ;->᩸:Ll/֫ܽܳ;

    if-nez v0, :cond_0

    return-void

    .line 4642
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "A batch replacement is active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 4459
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v0

    .line 4460
    :try_start_0
    iget-boolean v1, p0, Ll/ۧܽܳ;->ۤ:Z

    if-nez v1, :cond_0

    .line 4461
    iget-object v1, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v1, p0}, Ll/ᩳܽܳ;->֫(Ll/ᩳܽܳ;Ll/ۧܽܳ;)V

    .line 4463
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final length()I
    .locals 2

    .line 3934
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v0

    .line 3935
    :try_start_0
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    .line 3936
    iget-object v1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 45
    :cond_0
    iget v1, v1, Ll/ۡᩳܳ;->᩻:I

    .line 3936
    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3937
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(I[B)Ll/֫ܽܳ;
    .locals 11

    .line 4417
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v0

    .line 4418
    :try_start_0
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4419
    invoke-direct {p0}, Ll/ۧܽܳ;->᩻()V

    .line 4420
    iget-boolean v1, p0, Ll/ۧܽܳ;->ܰ:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    iget-object v2, p0, Ll/ۧܽܳ;->᩶:Ll/۟ۧܳ;

    iget-object v3, v2, Ll/۟ۧܳ;->ۡ:Ll/ۡᩳܳ;

    if-ne v1, v3, :cond_3

    iget-object v3, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    iget-object v2, v2, Ll/۟ۧܳ;->ܽ:Ll/۫֫ܳ;

    if-ne v3, v2, :cond_3

    if-lez p1, :cond_2

    .line 4428
    array-length v2, p2

    int-to-long v2, v2

    const-wide/32 v4, 0x4000000

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    .line 4432
    invoke-static {v1}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v1

    iget-object v3, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4433
    invoke-static {v3}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۧܽܳ;->֫֫:J

    iget-wide v7, p0, Ll/ۧܽܳ;->ܽ֫:J

    iget-object v9, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    .line 4435
    invoke-static {v9}, Ll/ܰ֫ܳ;->ܳ(Ll/۫֫ܳ;)J

    move-result-wide v9

    .line 4434
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v5

    .line 4433
    invoke-static {v3, v4, v5, v6}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v3

    .line 4432
    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4436
    array-length v3, p2

    int-to-long v3, v3

    const-wide/16 v5, 0x4000

    .line 4437
    invoke-static {v3, v4, v5, v6}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v3

    .line 4436
    invoke-static {v1, v2, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v1

    .line 4439
    invoke-static {v1, v2}, Ll/ᩳܽܳ;->ۧ(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4443
    iget-object v1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۧܽܳ;->ܽ֫:J

    .line 4444
    iget-object v1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v1}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۧܽܳ;->֫֫:J

    .line 4445
    new-instance v1, Ll/֫ܽܳ;

    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    invoke-direct {v1, p0, p1, p2}, Ll/֫ܽܳ;-><init>(Ll/ۧܽܳ;I[B)V

    .line 4446
    iput-object v1, p0, Ll/ۧܽܳ;->᩸:Ll/֫ܽܳ;

    .line 4447
    monitor-exit v0

    return-object v1

    .line 4440
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Replacement edit metadata exceeds memory limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4429
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Replacement metadata exceeds memory limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4425
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pattern must not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4421
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Batch replacement requires a pristine transaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 4448
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(II)V
    .locals 7

    .line 4151
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v0

    .line 4152
    :try_start_0
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4153
    invoke-direct {p0}, Ll/ۧܽܳ;->᩻()V

    sub-int v1, p2, p1

    .line 4155
    invoke-direct {p0, p1, p2, v1}, Ll/ۧܽܳ;->֫(III)V

    if-nez v1, :cond_0

    .line 4157
    monitor-exit v0

    return-void

    .line 4159
    :cond_0
    iget-object v2, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v2}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۧܳ;->֫()Ll/ܶۧܳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4161
    :try_start_1
    new-instance v3, Ll/᩶ۧܳ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1}, Ll/᩶ۧܳ;-><init>(BI)V

    .line 4162
    invoke-static {v3}, Ll/᩵ᩳܳ;->֫(Ll/ᩴܽܳ;)Ll/ۡᩳܳ;

    move-result-object v3

    .line 4163
    iget-object v5, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v5, p1, p2, v3}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;IILl/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v3

    .line 4165
    iget-object v5, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v5}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v5

    invoke-direct {p0, v3, p1, v5}, Ll/ۧܽܳ;->֫(Ll/ۡᩳܳ;ILl/᩸ۧܳ;)Ll/ۡᩳܳ;

    move-result-object v3

    .line 4166
    iget-object v5, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    invoke-static {v5, p1, p2, v1}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;III)Ll/۫֫ܳ;

    move-result-object p1

    .line 4168
    invoke-direct {p0, v3, p1}, Ll/ۧܽܳ;->֫(Ll/ۡᩳܳ;Ll/۫֫ܳ;)V

    .line 4170
    invoke-static {v3}, Ll/᩵ᩳܳ;->ܺ(Ll/ۡᩳܳ;)Ll/ۘᩳܳ;

    move-result-object p2

    .line 4171
    iput-object v3, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4172
    iput-object p1, p0, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    .line 4173
    invoke-virtual {p2}, Ll/ۘᩳܳ;->֫()J

    move-result-wide v5

    iput-wide v5, p0, Ll/ۧܽܳ;->ۙ:J

    .line 4174
    invoke-virtual {p2}, Ll/ۘᩳܳ;->ܽ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۧܽܳ;->ۛ:J
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4180
    :try_start_2
    iget-boolean p1, p0, Ll/ۧܽܳ;->᩺:Z

    .line 5055
    iget-wide v1, p0, Ll/ۧܽܳ;->֫֫:J

    const/4 p2, 0x1

    const-wide/16 v5, 0x0

    cmp-long v3, v1, v5

    if-nez v3, :cond_1

    iget-wide v1, p0, Ll/ۧܽܳ;->ܽ֫:J

    cmp-long v3, v1, v5

    if-nez v3, :cond_1

    iget-wide v1, p0, Ll/ۧܽܳ;->۬:J

    cmp-long v3, v1, v5

    if-eqz v3, :cond_2

    :cond_1
    const/4 v4, 0x1

    :cond_2
    or-int/2addr p1, v4

    .line 4180
    iput-boolean p1, p0, Ll/ۧܽܳ;->᩺:Z

    .line 4181
    iput-boolean p2, p0, Ll/ۧܽܳ;->ܰ:Z

    .line 4182
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 4177
    :goto_0
    iget-object p2, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {p2}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object p2

    invoke-virtual {p2, v2}, Ll/᩸ۧܳ;->֫(Ll/ܶۧܳ;)V

    .line 4178
    throw p1

    :catchall_0
    move-exception p1

    .line 4182
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(II[BILl/ܿۖ᩷;)V
    .locals 24

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    .line 4011
    invoke-static/range {p5 .. p5}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object v5

    .line 4012
    iget-object v6, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    move-object/from16 v16, v6

    monitor-enter v16

    .line 4013
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4014
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->᩻()V

    .line 4015
    invoke-static/range {p3 .. p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4016
    array-length v6, v3

    const/4 v7, 0x0

    invoke-static {v6, v7, v4}, Ll/ۡܽܳ;->ۧ(III)V

    .line 4017
    invoke-direct {v1, v0, v2, v4}, Ll/ۧܽܳ;->֫(III)V

    .line 4018
    invoke-interface {v5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v6

    if-nez v6, :cond_17

    if-ne v0, v2, :cond_0

    if-nez v4, :cond_0

    .line 4022
    monitor-exit v16

    return-void

    .line 4024
    :cond_0
    iget-object v6, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v6}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩸ۧܳ;->֫()Ll/ܶۧܳ;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int v7, v2, v0

    if-ne v7, v4, :cond_1

    const/16 v8, 0x1000

    if-gt v4, v8, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_2

    .line 4035
    :try_start_1
    iget-object v9, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v9, v0, v3, v4}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;I[BI)Ll/ܺᩳܳ;

    move-result-object v3

    .line 4037
    invoke-virtual {v3}, Ll/ܺᩳܳ;->֫()Ll/ۡᩳܳ;

    move-result-object v9

    .line 4038
    invoke-virtual {v3}, Ll/ܺᩳܳ;->ܽ()Z

    move-result v3

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    move/from16 p3, v3

    goto/16 :goto_6

    .line 4040
    :cond_2
    invoke-direct {v1, v4}, Ll/ۧܽܳ;->֫(I)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 4042
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_a
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    :goto_1
    if-ge v10, v4, :cond_4

    const/high16 v14, 0x2000000

    sub-int v15, v4, v10

    .line 4045
    :try_start_2
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 4143
    iget-object v15, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v15}, Ll/ᩳܽܳ;->ܿ(Ll/ᩳܽܳ;)Ljava/io/File;

    move-result-object v15

    if-eqz v15, :cond_3

    .line 4144
    invoke-virtual {v15}, Ljava/io/File;->isDirectory()Z

    move-result v17

    if-eqz v17, :cond_3

    .line 4049
    invoke-static {v15, v3, v10, v14, v5}, Ll/ۘۧܳ;->֫(Ljava/io/File;[BIILl/ܿۖ᩷;)Ll/ۘۧܳ;

    move-result-object v15

    .line 4052
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4054
    invoke-static {v15}, Ll/᩵ᩳܳ;->֫(Ll/ᩴܽܳ;)Ll/ۡᩳܳ;

    move-result-object v15

    .line 4053
    invoke-static {v11, v15}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v11

    add-int/2addr v10, v14

    goto :goto_1

    .line 4145
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Hex literal spill directory is unavailable"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    move-exception v0

    goto/16 :goto_e

    :catch_1
    move-exception v0

    goto/16 :goto_e

    :catch_2
    move-exception v0

    goto/16 :goto_e

    :cond_4
    const/4 v3, 0x1

    move-object v10, v9

    move-wide v14, v12

    move-object v12, v11

    goto :goto_2

    :cond_5
    const-wide/16 v9, 0x0

    .line 4059
    :try_start_3
    iget-object v11, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v11}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v11

    invoke-virtual {v11, v4, v3}, Ll/᩸ۧܳ;->֫(I[B)Ll/ۡᩳܳ;

    move-result-object v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide v14, v9

    move-object v10, v12

    move-object v12, v3

    const/4 v3, 0x0

    .line 4061
    :goto_2
    :try_start_4
    iget-object v9, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v9, v0, v2, v12}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;IILl/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v9

    .line 4064
    iget-object v11, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v11}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v11

    invoke-direct {v1, v9, v0, v11}, Ll/ۧܽܳ;->֫(Ll/ۡᩳܳ;ILl/᩸ۧܳ;)Ll/ۡᩳܳ;

    move-result-object v11

    if-nez v7, :cond_7

    if-eq v11, v9, :cond_6

    goto :goto_3

    :cond_6
    const/4 v13, 0x0

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v13, 0x1

    :goto_4
    move-object/from16 v17, v12

    move/from16 p3, v13

    .line 4067
    iget-wide v12, v1, Ll/ۧܽܳ;->۬:J
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    cmp-long v18, v12, v14

    if-eqz v18, :cond_8

    if-nez v7, :cond_9

    :cond_8
    if-eq v11, v9, :cond_a

    :cond_9
    const/4 v9, 0x1

    goto :goto_5

    :cond_a
    const/4 v9, 0x0

    :goto_5
    or-int/2addr v3, v9

    const/4 v9, 0x0

    move/from16 v13, p3

    move-object v9, v11

    move-object/from16 v12, v17

    const/16 p3, 0x0

    move v11, v3

    .line 4070
    :goto_6
    :try_start_5
    iget-object v3, v1, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    invoke-static {v3, v0, v2, v4}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;III)Ll/۫֫ܳ;

    move-result-object v2

    .line 4072
    invoke-direct {v1, v9, v2}, Ll/ۧܽܳ;->֫(Ll/ۡᩳܳ;Ll/۫֫ܳ;)V

    if-eqz v8, :cond_b

    .line 4076
    iget-wide v3, v1, Ll/ۧܽܳ;->ۙ:J

    .line 4077
    iget-wide v12, v1, Ll/ۧܽܳ;->ۛ:J

    goto :goto_8

    :cond_b
    if-eqz v13, :cond_c

    .line 4081
    invoke-static {v9}, Ll/᩵ᩳܳ;->ܺ(Ll/ۡᩳܳ;)Ll/ۘᩳܳ;

    move-result-object v0

    goto :goto_7

    .line 4082
    :cond_c
    iget-object v3, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v3, v12, v0}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;Ll/ۡᩳܳ;I)Ll/ۘᩳܳ;

    move-result-object v0

    :goto_7
    if-eqz v13, :cond_d

    .line 4085
    invoke-virtual {v0}, Ll/ۘᩳܳ;->֫()J

    move-result-wide v3

    .line 4086
    invoke-virtual {v0}, Ll/ۘᩳܳ;->ܽ()J

    move-result-wide v12

    goto :goto_8

    .line 4088
    :cond_d
    iget-wide v3, v1, Ll/ۧܽܳ;->ۙ:J

    .line 4089
    invoke-virtual {v0}, Ll/ۘᩳܳ;->֫()J

    move-result-wide v12

    .line 4088
    invoke-static {v3, v4, v12, v13}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v3

    .line 4090
    iget-wide v12, v1, Ll/ۧܽܳ;->ۛ:J

    move-wide/from16 p1, v3

    .line 4091
    invoke-virtual {v0}, Ll/ۘᩳܳ;->ܽ()J

    move-result-wide v3

    .line 4090
    invoke-static {v12, v13, v3, v4}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v12

    move-wide/from16 v3, p1

    :goto_8
    if-eqz v11, :cond_e

    .line 4095
    invoke-static {v9}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;)J

    move-result-wide v17

    move-wide/from16 v22, v14

    move-wide/from16 v14, v17

    move-wide/from16 v18, v22

    goto :goto_9

    :cond_e
    move-wide/from16 v18, v14

    .line 4096
    iget-wide v14, v1, Ll/ۧܽܳ;->۬:J

    :goto_9
    const-wide/32 v20, 0x800000

    cmp-long v0, v3, v20

    if-gtz v0, :cond_15

    .line 4101
    invoke-interface {v5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_14

    if-eqz v10, :cond_f

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ᩴܽܳ;

    .line 4106
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴܽܳ;

    .line 4105
    invoke-direct {v1, v0}, Ll/ۧܽܳ;->֫([Ll/ᩴܽܳ;)V

    const/4 v0, 0x0

    move-object v10, v0

    .line 4109
    :cond_f
    iput-object v9, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4110
    iput-object v2, v1, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    .line 4111
    iput-wide v3, v1, Ll/ۧܽܳ;->ۙ:J

    .line 4112
    iput-wide v12, v1, Ll/ۧܽܳ;->ۛ:J

    .line 4113
    iput-wide v14, v1, Ll/ۧܽܳ;->۬:J
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 4124
    :try_start_6
    iget-boolean v0, v1, Ll/ۧܽܳ;->᩺:Z

    if-eqz v8, :cond_10

    move/from16 v3, p3

    goto :goto_c

    :cond_10
    if-eqz v7, :cond_13

    .line 5055
    iget-wide v2, v1, Ll/ۧܽܳ;->֫֫:J

    cmp-long v4, v2, v18

    if-nez v4, :cond_12

    iget-wide v2, v1, Ll/ۧܽܳ;->ܽ֫:J

    cmp-long v4, v2, v18

    if-nez v4, :cond_12

    cmp-long v2, v14, v18

    if-eqz v2, :cond_11

    goto :goto_a

    :cond_11
    const/4 v2, 0x0

    goto :goto_b

    :cond_12
    :goto_a
    const/4 v2, 0x1

    :goto_b
    if-eqz v2, :cond_13

    const/4 v3, 0x1

    goto :goto_c

    :cond_13
    const/4 v3, 0x0

    :goto_c
    or-int/2addr v0, v3

    .line 4126
    iput-boolean v0, v1, Ll/ۧܽܳ;->᩺:Z

    const/4 v0, 0x1

    .line 4127
    iput-boolean v0, v1, Ll/ۧܽܳ;->ܰ:Z

    .line 4128
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-void

    :catch_3
    move-exception v0

    goto :goto_10

    :catch_4
    move-exception v0

    goto :goto_10

    :catch_5
    move-exception v0

    goto :goto_10

    .line 4102
    :cond_14
    :try_start_7
    new-instance v0, Ll/᩻ܽܳ;

    invoke-direct {v0}, Ll/᩻ܽܳ;-><init>()V

    throw v0

    .line 4098
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Literal heap storage exceeds memory limit"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catch_6
    move-exception v0

    goto :goto_d

    :catch_7
    move-exception v0

    goto :goto_d

    :catch_8
    move-exception v0

    :goto_d
    move-object v9, v10

    :goto_e
    move-object v10, v9

    goto :goto_10

    :catch_9
    move-exception v0

    goto :goto_f

    :catch_a
    move-exception v0

    goto :goto_f

    :catch_b
    move-exception v0

    :goto_f
    const/4 v10, 0x0

    :goto_10
    if-eqz v10, :cond_16

    const/4 v2, 0x0

    :try_start_8
    new-array v2, v2, [Ll/ᩴܽܳ;

    .line 4117
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ᩴܽܳ;

    .line 4116
    invoke-static {v2, v0}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;Ljava/lang/Throwable;)V

    .line 4120
    :cond_16
    iget-object v2, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v2}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v2

    invoke-virtual {v2, v6}, Ll/᩸ۧܳ;->֫(Ll/ܶۧܳ;)V

    .line 4121
    throw v0

    .line 4019
    :cond_17
    new-instance v0, Ll/᩻ܽܳ;

    invoke-direct {v0}, Ll/᩻ܽܳ;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    .line 4128
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0
.end method

.method public final ֫(ILl/ۢܽܳ;Ll/᩻۟ܿ;)V
    .locals 29

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    .line 4194
    invoke-static/range {p3 .. p3}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object v3

    .line 4203
    iget-object v4, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v4

    .line 4205
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4206
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->᩻()V

    const-string v5, "range"

    .line 4207
    invoke-static {v2, v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4541
    invoke-interface {v3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-nez v5, :cond_1f

    .line 4209
    iget-object v5, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    const/4 v6, 0x0

    if-nez v5, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    .line 45
    :cond_0
    iget v5, v5, Ll/ۡᩳܳ;->᩻:I

    .line 4210
    :goto_0
    invoke-static {v5, v0, v6}, Ll/ۡܽܳ;->ܽ(III)V

    .line 4211
    invoke-virtual/range {p2 .. p2}, Ll/ۢܽܳ;->length()I

    move-result v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_13
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_12
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    if-nez v6, :cond_1

    .line 4213
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    return-void

    :cond_1
    int-to-long v7, v5

    int-to-long v9, v6

    add-long/2addr v7, v9

    const-wide/32 v11, 0x7fffffff

    cmp-long v5, v7, v11

    if-gtz v5, :cond_1e

    .line 4219
    :try_start_2
    iget-object v5, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    iget-object v7, v2, Ll/ۢܽܳ;->ۤ:Ll/ۡᩳܳ;

    .line 4220
    invoke-static {v5, v7, v0}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;Ll/ۡᩳܳ;I)Ll/ۘᩳܳ;

    move-result-object v5

    .line 4221
    invoke-virtual {v5}, Ll/ۘᩳܳ;->֫()J

    move-result-wide v7

    .line 4222
    iget-wide v11, v1, Ll/ۧܽܳ;->ۙ:J

    .line 4223
    invoke-static {v11, v12, v7, v8}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    const-wide/32 v11, 0x10000

    .line 4222
    invoke-static {v7, v8, v11, v12}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v7

    const-wide/32 v11, 0x800000

    cmp-long v5, v7, v11

    if-lez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_4

    .line 4143
    iget-object v7, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v7}, Ll/ᩳܽܳ;->ܿ(Ll/ᩳܽܳ;)Ljava/io/File;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 4144
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_2

    .line 4145
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Hex literal spill directory is unavailable"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v7, 0x0

    :goto_2
    const-wide/32 v13, 0x1ffffff

    add-long/2addr v9, v13

    const-wide/32 v13, 0x2000000

    .line 4227
    div-long/2addr v9, v13

    .line 4230
    iget-object v8, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    if-nez v8, :cond_5

    const/4 v8, 0x0

    goto :goto_3

    .line 49
    :cond_5
    iget v8, v8, Ll/ۡᩳܳ;->ܿ:I

    :goto_3
    int-to-long v13, v8

    if-eqz v5, :cond_6

    goto :goto_5

    .line 4232
    :cond_6
    iget-object v8, v2, Ll/ۢܽܳ;->ۤ:Ll/ۡᩳܳ;

    if-nez v8, :cond_7

    const/4 v8, 0x0

    goto :goto_4

    .line 49
    :cond_7
    iget v8, v8, Ll/ۡᩳܳ;->ܿ:I

    :goto_4
    int-to-long v9, v8

    :goto_5
    add-long/2addr v13, v9

    const-wide/16 v8, 0x2

    add-long/2addr v13, v8

    .line 4234
    invoke-static {v13, v14}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v8

    iget-object v10, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4235
    invoke-static {v10}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v13

    iget-wide v11, v1, Ll/ۧܽܳ;->֫֫:J

    move-object/from16 p3, v3

    iget-wide v2, v1, Ll/ۧܽܳ;->ܽ֫:J

    iget-object v10, v1, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    move/from16 v17, v6

    move-object/from16 v18, v7

    .line 4238
    invoke-static {v10}, Ll/ܰ֫ܳ;->ܳ(Ll/۫֫ܳ;)J

    move-result-wide v6

    .line 4236
    invoke-static {v2, v3, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    invoke-static {v11, v12, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    .line 4235
    invoke-static {v13, v14, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    .line 4233
    invoke-static {v8, v9, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    .line 4239
    invoke-static {v2, v3}, Ll/ᩳܽܳ;->ۧ(J)Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 4243
    iget-object v2, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4244
    iget-object v3, v1, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    .line 4245
    iget-wide v6, v1, Ll/ۧܽܳ;->֫֫:J

    .line 4246
    iget-wide v8, v1, Ll/ۧܽܳ;->ܽ֫:J

    .line 4247
    iget-wide v10, v1, Ll/ۧܽܳ;->۬:J

    .line 4248
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->ᩳ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_13
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_12
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 4255
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    const/4 v4, 0x0

    new-array v4, v4, [Ll/ᩴܽܳ;

    if-eqz v5, :cond_9

    .line 4264
    :try_start_4
    invoke-virtual/range {p2 .. p2}, Ll/ۢܽܳ;->ܽ()V

    .line 4265
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v14, v17

    :goto_6
    if-ge v12, v14, :cond_8

    const/high16 v15, 0x2000000

    move-object/from16 v16, v4

    sub-int v4, v14, v12

    .line 4269
    :try_start_5
    invoke-static {v15, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    move-object/from16 v15, p2

    move-wide/from16 v19, v10

    .line 4271
    iget-object v10, v15, Ll/ۢܽܳ;->ۤ:Ll/ۡᩳܳ;

    invoke-static {v10, v12, v4}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;II)Ll/ۡᩳܳ;

    move-result-object v10

    move-object/from16 v11, p3

    move-wide/from16 v27, v8

    move-object/from16 v8, v18

    move-wide/from16 v17, v27

    .line 4274
    invoke-static {v8, v10, v11}, Ll/ۘۧܳ;->֫(Ljava/io/File;Ll/ۡᩳܳ;Ll/ܿۖ᩷;)Ll/ۘۧܳ;

    move-result-object v9

    .line 4276
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4278
    invoke-static {v9}, Ll/᩵ᩳܳ;->֫(Ll/ᩴܽܳ;)Ll/ۡᩳܳ;

    move-result-object v9

    .line 4277
    invoke-static {v13, v9}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v13

    add-int/2addr v12, v4

    move-object/from16 p3, v11

    move-object/from16 v4, v16

    move-wide/from16 v10, v19

    move-wide/from16 v27, v17

    move-object/from16 v18, v8

    move-wide/from16 v8, v27

    goto :goto_6

    :cond_8
    move-object/from16 v15, p2

    move-object/from16 v16, v4

    move-wide/from16 v17, v8

    move-wide/from16 v19, v10

    move-object/from16 v11, p3

    .line 4281
    invoke-virtual/range {p2 .. p2}, Ll/ۢܽܳ;->ܽ()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v4, v16

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_7

    :catch_2
    move-exception v0

    :goto_7
    move-object/from16 v4, v16

    goto/16 :goto_17

    :catchall_0
    move-exception v0

    goto/16 :goto_19

    :catch_3
    move-exception v0

    :goto_8
    move-object/from16 v16, v4

    goto :goto_9

    :catch_4
    move-exception v0

    goto :goto_8

    :catch_5
    move-exception v0

    goto :goto_8

    :goto_9
    move-object/from16 v4, v16

    goto/16 :goto_16

    :cond_9
    move-object/from16 v15, p2

    move-object/from16 v16, v4

    move-wide/from16 v19, v10

    move/from16 v14, v17

    move-object/from16 v11, p3

    move-wide/from16 v17, v8

    .line 4284
    :try_start_6
    invoke-virtual/range {p2 .. p2}, Ll/ۢܽܳ;->֫()[Ll/ᩴܽܳ;

    move-result-object v4
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_11
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_10
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_f
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 4285
    :try_start_7
    iget-object v13, v15, Ll/ۢܽܳ;->ۤ:Ll/ۡᩳܳ;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_d
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_c
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const/4 v5, 0x0

    .line 4550
    :goto_a
    :try_start_8
    iget-boolean v8, v1, Ll/ۧܽܳ;->ۤ:Z

    if-nez v8, :cond_19

    .line 4553
    invoke-interface {v11}, Ll/ܿۖ᩷;->᩻()Z

    move-result v8

    if-nez v8, :cond_18

    .line 4288
    invoke-static {v2, v0, v0, v13}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;IILl/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v8

    .line 4290
    invoke-static {v3, v0, v0, v14}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;III)Ll/۫֫ܳ;

    move-result-object v9

    const-wide/16 v14, 0x0

    cmp-long v10, v6, v14

    if-nez v10, :cond_a

    .line 4293
    invoke-static {v13}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v21

    :goto_b
    move-wide/from16 v23, v6

    move-wide/from16 v6, v21

    goto :goto_c

    .line 4294
    :cond_a
    invoke-static {v2, v13}, Ll/᩵ᩳܳ;->ۧ(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)J

    move-result-wide v21

    goto :goto_b

    :goto_c
    cmp-long v10, v17, v14

    if-nez v10, :cond_b

    .line 4296
    invoke-static {v13}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;)J

    move-result-wide v21

    :goto_d
    move-wide/from16 v25, v21

    goto :goto_e

    .line 4297
    :cond_b
    invoke-static {v2, v13}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)J

    move-result-wide v21

    goto :goto_d

    :goto_e
    cmp-long v10, v19, v14

    if-nez v10, :cond_c

    .line 4299
    invoke-static {v13}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;)J

    move-result-wide v12

    goto :goto_f

    .line 4300
    :cond_c
    invoke-static {v2, v13}, Ll/᩵ᩳܳ;->֫(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)J

    move-result-wide v12

    .line 4550
    :goto_f
    iget-boolean v10, v1, Ll/ۧܽܳ;->ۤ:Z

    if-nez v10, :cond_17

    .line 4553
    invoke-interface {v11}, Ll/ܿۖ᩷;->᩻()Z

    move-result v10

    if-nez v10, :cond_16

    .line 4303
    iget-object v10, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v10
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_a
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_9
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 4304
    :try_start_9
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4305
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->᩻()V

    .line 4306
    iget-object v14, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    if-ne v14, v2, :cond_15

    iget-object v2, v1, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    if-ne v2, v3, :cond_15

    .line 4541
    invoke-interface {v11}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    if-nez v2, :cond_14

    .line 4531
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ll/ᩳܽܳ;->֫(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_13

    if-eqz v5, :cond_d

    const/4 v2, 0x0

    new-array v2, v2, [Ll/ᩴܽܳ;

    .line 4313
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ᩴܽܳ;

    .line 4312
    invoke-direct {v1, v2}, Ll/ۧܽܳ;->֫([Ll/ᩴܽܳ;)V

    const/4 v2, 0x0

    move-object v5, v2

    goto :goto_10

    .line 4316
    :cond_d
    invoke-direct {v1, v4}, Ll/ۧܽܳ;->ۧ([Ll/ᩴܽܳ;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 4319
    :goto_10
    :try_start_a
    iput-object v8, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4562
    iget-object v2, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v2}, Ll/ᩳܽܳ;->ᩳ(Ll/ᩳܽܳ;)Ll/᩸ۧܳ;

    move-result-object v2

    invoke-direct {v1, v8, v0, v2}, Ll/ۧܽܳ;->֫(Ll/ۡᩳܳ;ILl/᩸ۧܳ;)Ll/ۡᩳܳ;

    move-result-object v0

    iput-object v0, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4322
    iput-object v9, v1, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    if-eq v0, v8, :cond_e

    .line 4325
    invoke-static {v0}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->֫֫:J

    .line 4326
    iget-object v0, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v0}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->ܽ֫:J

    .line 4327
    iget-object v0, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    invoke-static {v0}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->۬:J

    goto :goto_11

    :catchall_1
    move-exception v0

    goto/16 :goto_14

    :cond_e
    move-wide/from16 v2, v23

    .line 4329
    invoke-static {v2, v3, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->֫֫:J

    move-wide/from16 v2, v17

    move-wide/from16 v8, v25

    .line 4331
    invoke-static {v2, v3, v8, v9}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->ܽ֫:J

    move-wide/from16 v2, v19

    .line 4333
    invoke-static {v2, v3, v12, v13}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->۬:J

    .line 4336
    :goto_11
    iget-object v0, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    .line 4337
    invoke-static {v0}, Ll/᩵ᩳܳ;->ܺ(Ll/ۡᩳܳ;)Ll/ۘᩳܳ;

    move-result-object v0

    .line 4338
    invoke-virtual {v0}, Ll/ۘᩳܳ;->֫()J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->ۙ:J

    .line 4339
    invoke-virtual {v0}, Ll/ۘᩳܳ;->ܽ()J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۧܽܳ;->ۛ:J

    .line 4340
    iget-wide v2, v1, Ll/ۧܽܳ;->ۙ:J

    const-wide/32 v8, 0x800000

    cmp-long v0, v2, v8

    if-gtz v0, :cond_12

    .line 4345
    iget-boolean v0, v1, Ll/ۧܽܳ;->ܳ֫:Z

    const-wide/32 v2, 0x100000

    cmp-long v8, v6, v2

    if-gez v8, :cond_10

    cmp-long v6, v12, v2

    if-ltz v6, :cond_f

    goto :goto_12

    :cond_f
    const/4 v2, 0x0

    goto :goto_13

    :cond_10
    :goto_12
    const/4 v2, 0x1

    :goto_13
    or-int/2addr v0, v2

    iput-boolean v0, v1, Ll/ۧܽܳ;->ܳ֫:Z

    .line 5037
    iget-object v0, v1, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    iget-object v2, v1, Ll/ۧܽܳ;->ۗ:Ll/۫֫ܳ;

    invoke-direct {v1, v0, v2}, Ll/ۧܽܳ;->֫(Ll/ۡᩳܳ;Ll/۫֫ܳ;)V

    const/4 v0, 0x1

    .line 4349
    iput-boolean v0, v1, Ll/ۧܽܳ;->ܰ:Z

    .line 4350
    monitor-exit v10
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 4366
    iget-object v2, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v2

    .line 4615
    :try_start_b
    iget-object v0, v1, Ll/ۧܽܳ;->ۧ֫:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    if-ne v0, v3, :cond_11

    const/4 v0, 0x0

    .line 4616
    iput-object v0, v1, Ll/ۧܽܳ;->ۧ֫:Ljava/lang/Thread;

    .line 4618
    :cond_11
    iget-object v0, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 4368
    monitor-exit v2

    return-void

    :catchall_2
    move-exception v0

    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    throw v0

    .line 4341
    :cond_12
    :try_start_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Literal heap storage exceeds memory limit"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :goto_14
    const/4 v2, 0x1

    goto :goto_15

    .line 4532
    :cond_13
    :try_start_d
    new-instance v0, Ll/ۚᩳܳ;

    invoke-direct {v0}, Ll/ۚᩳܳ;-><init>()V

    throw v0

    .line 4542
    :cond_14
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->֫()V

    .line 4543
    new-instance v0, Ll/᩻ܽܳ;

    invoke-direct {v0}, Ll/᩻ܽܳ;-><init>()V

    throw v0

    .line 4307
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Transaction root changed during range transfer"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :catchall_3
    move-exception v0

    const/4 v2, 0x0

    .line 4350
    :goto_15
    :try_start_e
    monitor-exit v10
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/Error; {:try_start_f .. :try_end_f} :catch_6
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :catch_6
    move-exception v0

    goto :goto_18

    :catch_7
    move-exception v0

    goto :goto_18

    :catch_8
    move-exception v0

    goto :goto_18

    :catchall_4
    move-exception v0

    goto :goto_15

    .line 4554
    :cond_16
    :try_start_10
    new-instance v0, Ll/᩻ܽܳ;

    invoke-direct {v0}, Ll/᩻ܽܳ;-><init>()V

    throw v0

    .line 4551
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Transaction is not active"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4554
    :cond_18
    new-instance v0, Ll/᩻ܽܳ;

    invoke-direct {v0}, Ll/᩻ܽܳ;-><init>()V

    throw v0

    .line 4551
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Transaction is not active"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_a
    .catch Ljava/lang/Error; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :catch_9
    move-exception v0

    goto :goto_17

    :catch_a
    move-exception v0

    goto :goto_17

    :catch_b
    move-exception v0

    goto :goto_17

    :catch_c
    move-exception v0

    goto :goto_16

    :catch_d
    move-exception v0

    goto :goto_16

    :catch_e
    move-exception v0

    goto :goto_16

    :catch_f
    move-exception v0

    goto/16 :goto_9

    :catch_10
    move-exception v0

    goto/16 :goto_9

    :catch_11
    move-exception v0

    goto/16 :goto_9

    :goto_16
    const/4 v5, 0x0

    :goto_17
    const/4 v2, 0x0

    :goto_18
    if-nez v2, :cond_1a

    .line 4353
    :try_start_11
    invoke-static {v4}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;)V

    if-eqz v5, :cond_1a

    const/4 v2, 0x0

    new-array v2, v2, [Ll/ᩴܽܳ;

    .line 4356
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ᩴܽܳ;

    .line 4355
    invoke-static {v2, v0}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;Ljava/lang/Throwable;)V

    .line 4359
    :cond_1a
    iget-object v2, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 4360
    :try_start_12
    iget-boolean v3, v1, Ll/ۧܽܳ;->ۤ:Z

    if-nez v3, :cond_1b

    .line 4361
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->֫()V

    .line 4363
    :cond_1b
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 4364
    :try_start_13
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :catchall_5
    move-exception v0

    .line 4363
    :try_start_14
    monitor-exit v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    :try_start_15
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 4366
    :goto_19
    iget-object v2, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v2

    .line 4615
    :try_start_16
    iget-object v3, v1, Ll/ۧܽܳ;->ۧ֫:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v3, v4, :cond_1c

    const/4 v3, 0x0

    .line 4616
    iput-object v3, v1, Ll/ۧܽܳ;->ۧ֫:Ljava/lang/Thread;

    .line 4618
    :cond_1c
    iget-object v3, v1, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 4368
    monitor-exit v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 4369
    throw v0

    :catchall_6
    move-exception v0

    .line 4368
    :try_start_17
    monitor-exit v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    throw v0

    .line 4240
    :cond_1d
    :try_start_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Edit span structure exceeds memory limit"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4217
    :cond_1e
    new-instance v0, Ll/۟֫ܳ;

    invoke-direct {v0}, Ll/۟֫ܳ;-><init>()V

    throw v0

    .line 4542
    :cond_1f
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->֫()V

    .line 4543
    new-instance v0, Ll/᩻ܽܳ;

    invoke-direct {v0}, Ll/᩻ܽܳ;-><init>()V

    throw v0
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_13
    .catch Ljava/lang/Error; {:try_start_18 .. :try_end_18} :catch_12
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    :catch_12
    move-exception v0

    goto :goto_1a

    :catch_13
    move-exception v0

    goto :goto_1a

    :catch_14
    move-exception v0

    goto :goto_1a

    :catchall_7
    move-exception v0

    goto :goto_1b

    .line 4250
    :goto_1a
    :try_start_19
    iget-boolean v2, v1, Ll/ۧܽܳ;->ۤ:Z

    if-nez v2, :cond_20

    .line 4251
    invoke-direct/range {p0 .. p0}, Ll/ۧܽܳ;->֫()V

    .line 4253
    :cond_20
    throw v0

    .line 4255
    :goto_1b
    monitor-exit v4
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    throw v0
.end method

.method public final ֫(Ll/ܿۖ᩷;)Z
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 4394
    :cond_0
    invoke-static {p1}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p1

    .line 4396
    :goto_0
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v0

    .line 4397
    :try_start_0
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4398
    invoke-direct {p0}, Ll/ۧܽܳ;->᩻()V

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 4399
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4400
    invoke-direct {p0}, Ll/ۧܽܳ;->֫()V

    .line 4401
    monitor-exit v0

    return v1

    .line 4403
    :cond_1
    iget-object v2, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-static {v2, p0, p1}, Ll/ᩳܽܳ;->֫(Ll/ᩳܽܳ;Ll/ۧܽܳ;Ll/ܿۖ᩷;)[Ll/ᩴܽܳ;

    move-result-object p1

    if-nez p1, :cond_2

    .line 4405
    monitor-exit v0

    return v1

    .line 4407
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4408
    invoke-static {p1}, Ll/ᩳܽܳ;->֫([Ll/ᩴܽܳ;)V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 4407
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ(II)V
    .locals 4

    .line 4380
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v0

    .line 4381
    :try_start_0
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4382
    invoke-direct {p0}, Ll/ۧܽܳ;->᩻()V

    .line 4383
    new-instance v1, Ll/ۙۧܳ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p1, p2, v2, v3}, Ll/ۙۧܳ;-><init>(IIZZ)V

    .line 4385
    iget-object p1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    if-nez p1, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    iget v3, p1, Ll/ۡᩳܳ;->᩻:I

    .line 4385
    :goto_0
    invoke-static {v1, v3}, Ll/ۙۧܳ;->֫(Ll/ۙۧܳ;I)V

    .line 4386
    iput-object v1, p0, Ll/ۧܽܳ;->ᩳ֫:Ll/ۙۧܳ;

    .line 4387
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܿ(II[B)V
    .locals 3

    .line 3942
    iget-object v0, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    monitor-enter v0

    .line 3943
    :try_start_0
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    .line 4468
    iget-object v1, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-virtual {v1}, Ll/ᩳܽܳ;->᩸()V

    .line 4474
    iget-object v1, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3945
    invoke-direct {p0}, Ll/ۧܽܳ;->ܳ()V

    .line 3946
    iget-object v1, p0, Ll/ۧܽܳ;->ܿ֫:Ll/ۡᩳܳ;

    const/4 v2, 0x0

    invoke-static {p1, v2, p2, v1, p3}, Ll/᩵ᩳܳ;->ۧ(IIILl/ۡᩳܳ;[B)V

    .line 4468
    iget-object p1, p0, Ll/ۧܽܳ;->۟:Ll/ᩳܽܳ;

    invoke-virtual {p1}, Ll/ᩳܽܳ;->᩸()V

    .line 4474
    iget-object p1, p0, Ll/ۧܽܳ;->ۨ:Ljava/util/IdentityHashMap;

    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳܽܳ;->֫(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3948
    monitor-exit v0

    return-void

    .line 4475
    :cond_0
    invoke-direct {p0}, Ll/ۧܽܳ;->֫()V

    .line 4476
    new-instance p1, Ll/ۚᩳܳ;

    invoke-direct {p1}, Ll/ۚᩳܳ;-><init>()V

    throw p1

    .line 4475
    :cond_1
    invoke-direct {p0}, Ll/ۧܽܳ;->֫()V

    .line 4476
    new-instance p1, Ll/ۚᩳܳ;

    invoke-direct {p1}, Ll/ۚᩳܳ;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 3948
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
