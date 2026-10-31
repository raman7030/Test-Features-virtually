.class public final Ll/ۚۖ᩵;
.super Ljava/lang/Object;
.source "SA1S"

# interfaces
.implements Ll/֡ۖ᩵;


# instance fields
.field public ۗ:J

.field public ۙ:J

.field public ᩶:J

.field public ᩸:I

.field public ᩹:J


# direct methods
.method public constructor <init>(IJJJ)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-wide p2, p0, Ll/ۚۖ᩵;->᩶:J

    .line 56
    iput-wide p4, p0, Ll/ۚۖ᩵;->ۙ:J

    .line 57
    iput-wide p6, p0, Ll/ۚۖ᩵;->ۗ:J

    const-wide/16 p2, 0x0

    .line 58
    iput-wide p2, p0, Ll/ۚۖ᩵;->᩹:J

    .line 59
    iput p1, p0, Ll/ۚۖ᩵;->᩸:I

    return-void
.end method


# virtual methods
.method public final getAttributes()I
    .locals 1

    .line 77
    iget v0, p0, Ll/ۚۖ᩵;->᩸:I

    return v0
.end method

.method public final getSize()J
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final size()I
    .locals 1

    const/16 v0, 0x28

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 163
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbQueryFileBasicInfo[createTime="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/ۚۖ᩵;->᩶:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastAccessTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/ۚۖ᩵;->ۙ:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/ۚۖ᩵;->ۗ:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",changeTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/ۚۖ᩵;->᩹:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",attributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۚۖ᩵;->᩸:I

    const/4 v3, 0x4

    .line 166
    invoke-static {v2, v3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(II[B)I
    .locals 2

    .line 113
    invoke-static {p1, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚۖ᩵;->᩶:J

    add-int/lit8 p2, p1, 0x8

    .line 115
    invoke-static {p2, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚۖ᩵;->ۙ:J

    add-int/lit8 p2, p1, 0x10

    .line 117
    invoke-static {p2, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚۖ᩵;->ۗ:J

    add-int/lit8 p2, p1, 0x18

    .line 119
    invoke-static {p2, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚۖ᩵;->᩹:J

    add-int/lit8 p2, p1, 0x20

    .line 121
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/ۚۖ᩵;->᩸:I

    add-int/lit8 p2, p1, 0x24

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ֫(I[B)I
    .locals 3

    .line 146
    iget-wide v0, p0, Ll/ۚۖ᩵;->᩶:J

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->ᩳ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    .line 148
    iget-wide v1, p0, Ll/ۚۖ᩵;->ۙ:J

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ᩳ(JI[B)V

    add-int/lit8 v0, p1, 0x10

    .line 150
    iget-wide v1, p0, Ll/ۚۖ᩵;->ۗ:J

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ᩳ(JI[B)V

    add-int/lit8 v0, p1, 0x18

    .line 152
    iget-wide v1, p0, Ll/ۚۖ᩵;->᩹:J

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ᩳ(JI[B)V

    add-int/lit8 v0, p1, 0x20

    .line 154
    iget v1, p0, Ll/ۚۖ᩵;->᩸:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 p2, p1, 0x28

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ۛ()J
    .locals 2

    .line 89
    iget-wide v0, p0, Ll/ۚۖ᩵;->ۗ:J

    return-wide v0
.end method

.method public final ۧ()B
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
