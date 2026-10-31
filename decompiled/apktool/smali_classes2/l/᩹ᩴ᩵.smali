.class public final Ll/᩹ᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "J9WB"


# instance fields
.field public final ܳۧ:Ll/ۚۖ᩵;

.field public final ܿۧ:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;IIJJJ)V
    .locals 10

    move-object v0, p0

    .line 62
    new-instance v9, Ll/ۚۖ᩵;

    move v1, p3

    or-int/lit16 v2, v1, 0x80

    move-object v1, v9

    move-wide v3, p4

    move-wide/from16 v5, p8

    move-wide/from16 v7, p6

    invoke-direct/range {v1 .. v8}, Ll/ۚۖ᩵;-><init>(IJJJ)V

    const/16 v1, 0x32

    const/16 v2, 0x8

    move-object v3, p1

    .line 44
    invoke-direct {p0, p1, v1, v2}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    move v1, p2

    .line 45
    iput v1, v0, Ll/᩹ᩴ᩵;->ܿۧ:I

    .line 46
    iput-object v9, v0, Ll/᩹ᩴ᩵;->ܳۧ:Ll/ۚۖ᩵;

    const/4 v1, 0x6

    .line 47
    iput v1, v0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const/4 v1, 0x0

    .line 48
    iput v1, v0, Ll/ᩳᩴ᩵;->᩶֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 127
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2SetFileInformation["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩹ᩴ᩵;->ܿۧ:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 3

    .line 92
    iget-object v0, p0, Ll/᩹ᩴ᩵;->ܳۧ:Ll/ۚۖ᩵;

    invoke-virtual {v0, p1, p2}, Ll/ۚۖ᩵;->֫(I[B)I

    move-result v0

    add-int/2addr v0, p1

    const-wide/16 v1, 0x0

    .line 95
    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    add-int/lit8 v0, v0, 0x6

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ܽ([B)I
    .locals 3

    .line 78
    iget v0, p0, Ll/᩹ᩴ᩵;->ܿۧ:I

    int-to-long v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 80
    iget-object v0, p0, Ll/᩹ᩴ᩵;->ܳۧ:Ll/ۚۖ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x101

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 v0, 0x4

    const-wide/16 v1, 0x0

    .line 82
    invoke-static {v1, v2, v0, p1}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 p1, 0x6

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 68
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    const/4 p1, 0x0

    .line 69
    aput-byte p1, p2, v0

    const/4 p1, 0x2

    return p1
.end method
