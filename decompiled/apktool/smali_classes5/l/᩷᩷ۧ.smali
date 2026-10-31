.class public final Ll/᩷᩷ۧ;
.super Ljava/lang/Object;
.source "Z8LG"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֫:J

.field public final ۧ:[J

.field public final ܳ:[J

.field public final ܽ:I

.field public final ܿ:[I

.field public final ᩳ:[J


# direct methods
.method public constructor <init>([I[J[J[J)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩷᩷ۧ;->ܿ:[I

    .line 51
    iput-object p2, p0, Ll/᩷᩷ۧ;->ᩳ:[J

    .line 52
    iput-object p3, p0, Ll/᩷᩷ۧ;->ۧ:[J

    .line 53
    iput-object p4, p0, Ll/᩷᩷ۧ;->ܳ:[J

    .line 54
    array-length p1, p1

    iput p1, p0, Ll/᩷᩷ۧ;->ܽ:I

    if-lez p1, :cond_0

    add-int/lit8 p2, p1, -0x1

    .line 56
    aget-wide p2, p3, p2

    add-int/lit8 p1, p1, -0x1

    aget-wide v0, p4, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩷᩷ۧ;->֫:J

    return-void

    :cond_0
    const-wide/16 p1, 0x0

    .line 58
    iput-wide p1, p0, Ll/᩷᩷ۧ;->֫:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChunkIndex(length="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩷᩷ۧ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sizes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷᩷ۧ;->ܿ:[I

    .line 102
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offsets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷᩷ۧ;->ᩳ:[J

    .line 104
    invoke-static {v1}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", timeUs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷᩷ۧ;->ܳ:[J

    .line 106
    invoke-static {v1}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", durationsUs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷᩷ۧ;->ۧ:[J

    .line 108
    invoke-static {v1}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(J)Ll/ۜۢۧ;
    .locals 9

    .line 69
    iget-object v0, p0, Ll/᩷᩷ۧ;->ܳ:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v2

    .line 87
    new-instance v3, Ll/ۡۢۧ;

    aget-wide v4, v0, v2

    iget-object v6, p0, Ll/᩷᩷ۧ;->ᩳ:[J

    aget-wide v7, v6, v2

    invoke-direct {v3, v4, v5, v7, v8}, Ll/ۡۢۧ;-><init>(JJ)V

    cmp-long v7, v4, p1

    if-gez v7, :cond_1

    .line 88
    iget p1, p0, Ll/᩷᩷ۧ;->ܽ:I

    sub-int/2addr p1, v1

    if-ne v2, p1, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    new-instance p1, Ll/ۡۢۧ;

    add-int/2addr v2, v1

    aget-wide v4, v0, v2

    aget-wide v0, v6, v2

    invoke-direct {p1, v4, v5, v0, v1}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 92
    new-instance p2, Ll/ۜۢۧ;

    invoke-direct {p2, v3, p1}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p2

    .line 89
    :cond_1
    :goto_0
    new-instance p1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {p1, v3, v3}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1
.end method

.method public final ۜ()J
    .locals 2

    .line 81
    iget-wide v0, p0, Ll/᩷᩷ۧ;->֫:J

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
