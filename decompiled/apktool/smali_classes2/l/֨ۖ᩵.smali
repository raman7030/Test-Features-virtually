.class public final Ll/֨ۖ᩵;
.super Ljava/lang/Object;
.source "M9V7"

# interfaces
.implements Ll/ܳۚ᩵;
.implements Ll/۠ۡ᩵;


# instance fields
.field public final ֫֫:Z

.field public ۗ:I

.field public ۙ:J

.field public ۛ:Ljava/lang/String;

.field public ۟:Ljava/lang/String;

.field public ۤ:I

.field public ۨ:J

.field public ۫:I

.field public ۬:J

.field public ܰ:I

.field public final ᩶:Ll/֨ۡ᩵;

.field public ᩸:J

.field public ᩹:J

.field public ᩺:J


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Z)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/֨ۖ᩵;->᩶:Ll/֨ۡ᩵;

    .line 59
    iput-boolean p2, p0, Ll/֨ۖ᩵;->֫֫:Z

    return-void
.end method


# virtual methods
.method public final getAttributes()I
    .locals 1

    .line 94
    iget v0, p0, Ll/֨ۖ᩵;->۫:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/֨ۖ᩵;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final length()J
    .locals 2

    .line 118
    iget-wide v0, p0, Ll/֨ۖ᩵;->۬:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 188
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbFindFileBothDirectoryInfo[nextEntryOffset="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/֨ۖ᩵;->ܰ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fileIndex="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֨ۖ᩵;->ۤ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",creationTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/֨ۖ᩵;->ۙ:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastAccessTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/֨ۖ᩵;->ۨ:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/֨ۖ᩵;->᩺:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",changeTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/֨ۖ᩵;->᩹:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",endOfFile="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/֨ۖ᩵;->۬:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",allocationSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/֨ۖ᩵;->᩸:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",extFileAttributes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֨ۖ᩵;->۫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",eaSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֨ۖ᩵;->ۗ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",shortName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֨ۖ᩵;->۟:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",filename="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֨ۖ᩵;->ۛ:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 188
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(II[B)I
    .locals 3

    .line 138
    invoke-static {p1, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/֨ۖ᩵;->ܰ:I

    add-int/lit8 p2, p1, 0x4

    .line 140
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/֨ۖ᩵;->ۤ:I

    add-int/lit8 p2, p1, 0x8

    .line 142
    invoke-static {p2, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۖ᩵;->ۙ:J

    add-int/lit8 p2, p1, 0x10

    .line 144
    invoke-static {p2, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۖ᩵;->ۨ:J

    add-int/lit8 p2, p1, 0x18

    .line 146
    invoke-static {p2, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۖ᩵;->᩺:J

    add-int/lit8 p2, p1, 0x20

    .line 148
    invoke-static {p2, p3}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۖ᩵;->᩹:J

    add-int/lit8 p2, p1, 0x28

    .line 150
    invoke-static {p2, p3}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۖ᩵;->۬:J

    add-int/lit8 p2, p1, 0x30

    .line 152
    invoke-static {p2, p3}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۖ᩵;->᩸:J

    add-int/lit8 p2, p1, 0x38

    .line 154
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/֨ۖ᩵;->۫:I

    add-int/lit8 p2, p1, 0x3c

    .line 156
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    add-int/lit8 v0, p1, 0x40

    .line 158
    invoke-static {v0, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/֨ۖ᩵;->ۗ:I

    add-int/lit8 v0, p1, 0x44

    .line 161
    aget-byte v0, p3, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x46

    .line 164
    invoke-static {v1, v0, p3}, Ll/ۤ֨᩵;->ܽ(II[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۖ᩵;->۟:Ljava/lang/String;

    add-int/lit8 v0, p1, 0x5e

    .line 168
    iget-boolean v1, p0, Ll/֨ۖ᩵;->֫֫:Z

    if-eqz v1, :cond_1

    if-lez p2, :cond_0

    add-int v1, v0, p2

    add-int/lit8 v2, v1, -0x1

    .line 169
    aget-byte v2, p3, v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, -0x2

    aget-byte v1, p3, v1

    if-nez v1, :cond_0

    add-int/lit8 p2, p2, -0x2

    .line 172
    :cond_0
    invoke-static {v0, p2, p3}, Ll/ۤ֨᩵;->ܽ(II[B)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_1
    if-lez p2, :cond_2

    add-int v1, v0, p2

    add-int/lit8 v1, v1, -0x1

    .line 174
    aget-byte v1, p3, v1

    if-nez v1, :cond_2

    add-int/lit8 p2, p2, -0x1

    .line 177
    :cond_2
    iget-object v1, p0, Ll/֨ۖ᩵;->᩶:Ll/֨ۡ᩵;

    invoke-static {p3, v0, p2, v1}, Ll/ۤ֨᩵;->֫([BIILl/֨ۡ᩵;)Ljava/lang/String;

    move-result-object p3

    .line 179
    :goto_0
    iput-object p3, p0, Ll/֨ۖ᩵;->ۛ:Ljava/lang/String;

    add-int/2addr v0, p2

    sub-int/2addr p1, v0

    return p1
.end method

.method public final ۚ()J
    .locals 2

    .line 106
    iget-wide v0, p0, Ll/֨ۖ᩵;->᩺:J

    return-wide v0
.end method

.method public final ܳ()I
    .locals 1

    .line 126
    iget v0, p0, Ll/֨ۖ᩵;->ܰ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 80
    iget v0, p0, Ll/֨ۖ᩵;->ۤ:I

    return v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/֨ۖ᩵;->ۛ:Ljava/lang/String;

    return-object v0
.end method
