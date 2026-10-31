.class public abstract Ll/᩹᩷᩵;
.super Ll/ܰۜ᩵;
.source "C9Z9"


# static fields
.field public static ۖ:Ll/֫᩻֨;


# instance fields
.field public ۜ:J

.field public ۡ:Ljava/net/InetAddress;

.field public final ۢ:I

.field public ܺ:I

.field public ᩷:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Ll/᩹᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩹᩷᩵;->ۖ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    .line 54
    iput p5, p0, Ll/᩹᩷᩵;->ܺ:I

    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩹᩷᩵;->ۜ:J

    .line 56
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    iput p1, p0, Ll/᩹᩷᩵;->ۢ:I

    add-int/lit8 p1, p1, 0x50

    .line 57
    iput p1, p0, Ll/᩹᩷᩵;->᩷:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 66
    instance-of v0, p1, Ll/᩹᩷᩵;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Ll/ܰۜ᩵;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩹᩷᩵;

    invoke-virtual {p0, p1}, Ll/᩹᩷᩵;->ܽ(Ll/᩹᩷᩵;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(I)J
    .locals 6

    .line 133
    iget-wide v0, p0, Ll/᩹᩷᩵;->ۜ:J

    int-to-long v2, p1

    iget p1, p0, Ll/᩹᩷᩵;->ܺ:I

    int-to-long v4, p1

    mul-long v2, v2, v4

    const-wide/16 v4, 0xa

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public abstract ֫(Ll/ۡۢ᩵;)Ll/ܶۢ᩵;
.end method

.method public abstract ֫(Z)Ll/᩶ۢ᩵;
.end method

.method public ֫(Ljava/lang/StringBuilder;)V
    .locals 4

    .line 1069
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x64

    .line 140
    invoke-virtual {p0, v2}, Ll/᩹᩷᩵;->֫(I)J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x3e8

    div-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    const-string v0, " ttl: \'"

    .line 1070
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/᩹᩷᩵;->ܺ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/net/InetAddress;)V
    .locals 0

    .line 1055
    iput-object p1, p0, Ll/᩹᩷᩵;->ۡ:Ljava/net/InetAddress;

    return-void
.end method

.method public abstract ֫(Ll/ܿ᩷᩵;)V
.end method

.method public final ֫(J)Z
    .locals 3

    const/16 v0, 0x64

    .line 149
    invoke-virtual {p0, v0}, Ll/᩹᩷᩵;->֫(I)J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۧ᩷᩵;)Z
    .locals 4

    const/4 v0, 0x0

    .line 105
    :try_start_0
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 122
    invoke-virtual {p0, v2}, Ll/᩹᩷᩵;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget v2, v2, Ll/᩹᩷᩵;->ܺ:I

    iget v3, p0, Ll/᩹᩷᩵;->ܺ:I

    div-int/lit8 v3, v3, 0x2
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-le v2, v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    :catch_0
    move-exception v1

    .line 112
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "suppressedBy() message "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " exception "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ll/᩹᩷᩵;->ۖ:Ll/֫᩻֨;

    invoke-interface {v2, p1, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final ۖ()I
    .locals 1

    .line 1078
    iget v0, p0, Ll/᩹᩷᩵;->ܺ:I

    return v0
.end method

.method public final ۘ()V
    .locals 2

    .line 175
    iget v0, p0, Ll/᩹᩷᩵;->᩷:I

    add-int/lit8 v0, v0, 0x5

    iput v0, p0, Ll/᩹᩷᩵;->᩷:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    .line 177
    iput v1, p0, Ll/᩹᩷᩵;->᩷:I

    :cond_0
    return-void
.end method

.method public final ۡ()J
    .locals 2

    .line 1082
    iget-wide v0, p0, Ll/᩹᩷᩵;->ۜ:J

    return-wide v0
.end method

.method public final ۧ(Ll/᩹᩷᩵;)V
    .locals 2

    .line 185
    iget-wide v0, p1, Ll/᩹᩷᩵;->ۜ:J

    iput-wide v0, p0, Ll/᩹᩷᩵;->ۜ:J

    .line 186
    iget p1, p1, Ll/᩹᩷᩵;->ܺ:I

    iput p1, p0, Ll/᩹᩷᩵;->ܺ:I

    .line 187
    iget p1, p0, Ll/᩹᩷᩵;->ۢ:I

    add-int/lit8 p1, p1, 0x50

    iput p1, p0, Ll/᩹᩷᩵;->᩷:I

    return-void
.end method

.method public final ۧ(J)Z
    .locals 3

    const/16 v0, 0x32

    .line 158
    invoke-virtual {p0, v0}, Ll/᩹᩷᩵;->֫(I)J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ۧ(Ll/ۡۢ᩵;)Z
.end method

.method public final ܺ()Ljava/net/InetAddress;
    .locals 1

    .line 1059
    iget-object v0, p0, Ll/᩹᩷᩵;->ۡ:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final ܽ(J)Z
    .locals 3

    .line 168
    iget v0, p0, Ll/᩹᩷᩵;->᩷:I

    invoke-virtual {p0, v0}, Ll/᩹᩷᩵;->֫(I)J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ܽ(Ll/ۡۢ᩵;)Z
.end method

.method public abstract ܽ(Ll/᩹᩷᩵;)Z
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 194
    iput-wide p1, p0, Ll/᩹᩷᩵;->ۜ:J

    const/4 p1, 0x1

    .line 195
    iput p1, p0, Ll/᩹᩷᩵;->ܺ:I

    return-void
.end method

.method public abstract ᩴ()Z
.end method
