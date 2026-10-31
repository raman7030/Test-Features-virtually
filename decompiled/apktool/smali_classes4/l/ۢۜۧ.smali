.class public final Ll/ۢۜۧ;
.super Ll/ۙ᩹֫;
.source "W8IZ"


# instance fields
.field public ۜ֫:Ll/᩷ۜۧ;

.field public final ܳ֫:Ll/᩸᩸֫;

.field public final ᩷֫:Ll/ᩳ֨֫;

.field public ᩻֫:J


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x6

    .line 49
    invoke-direct {p0, v0}, Ll/ۙ᩹֫;-><init>(I)V

    .line 50
    new-instance v0, Ll/᩸᩸֫;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 132
    invoke-direct {v0, v1, v2}, Ll/᩸᩸֫;-><init>(II)V

    .line 50
    iput-object v0, p0, Ll/ۢۜۧ;->ܳ֫:Ll/᩸᩸֫;

    .line 51
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ۢۜۧ;->᩷֫:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 1

    const-string v0, "application/x-camera-motion"

    .line 61
    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    .line 245
    invoke-static {p1, v0, v0, v0}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    :cond_0
    invoke-static {v0, v0, v0, v0}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    .line 70
    check-cast p2, Ll/᩷ۜۧ;

    iput-object p2, p0, Ll/ۢۜۧ;->ۜ֫:Ll/᩷ۜۧ;

    :cond_0
    return-void
.end method

.method public final ֫(JJ)V
    .locals 5

    .line 90
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩻()Z

    move-result p3

    if-nez p3, :cond_7

    iget-wide p3, p0, Ll/ۢۜۧ;->᩻֫:J

    const-wide/32 v0, 0x186a0

    add-long/2addr v0, p1

    cmp-long v2, p3, v0

    if-gez v2, :cond_7

    .line 91
    iget-object p3, p0, Ll/ۢۜۧ;->ܳ֫:Ll/᩸᩸֫;

    invoke-virtual {p3}, Ll/᩸᩸֫;->ۧ()V

    .line 92
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object p4

    const/4 v0, 0x0

    .line 93
    invoke-virtual {p0, p4, p3, v0}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result p4

    const/4 v1, -0x4

    if-ne p4, v1, :cond_7

    .line 94
    invoke-virtual {p3}, Ll/ۘ᩸֫;->᩻()Z

    move-result p4

    if-eqz p4, :cond_1

    goto :goto_4

    .line 98
    :cond_1
    iget-wide v1, p3, Ll/᩸᩸֫;->ۤ:J

    iput-wide v1, p0, Ll/ۢۜۧ;->᩻֫:J

    .line 99
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v3

    cmp-long p4, v1, v3

    if-gez p4, :cond_2

    const/4 p4, 0x1

    goto :goto_1

    :cond_2
    const/4 p4, 0x0

    .line 100
    :goto_1
    iget-object v1, p0, Ll/ۢۜۧ;->ۜ֫:Ll/᩷ۜۧ;

    if-eqz v1, :cond_0

    if-eqz p4, :cond_3

    goto :goto_0

    .line 104
    :cond_3
    invoke-virtual {p3}, Ll/᩸᩸֫;->ᩴ()V

    .line 105
    iget-object p3, p3, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    sget-object p4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 126
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result p4

    const/16 v1, 0x10

    if-eq p4, v1, :cond_4

    const/4 p3, 0x0

    goto :goto_3

    .line 129
    :cond_4
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p4

    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    move-result v1

    iget-object v2, p0, Ll/ۢۜۧ;->᩷֫:Ll/ᩳ֨֫;

    invoke-virtual {v2, v1, p4}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 130
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p3

    add-int/lit8 p3, p3, 0x4

    invoke-virtual {v2, p3}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 p3, 0x3

    new-array p4, p3, [F

    :goto_2
    if-ge v0, p3, :cond_5

    .line 133
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩷()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    aput v1, p4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    move-object p3, p4

    :goto_3
    if-nez p3, :cond_6

    goto :goto_0

    .line 110
    :cond_6
    iget-object p4, p0, Ll/ۢۜۧ;->ۜ֫:Ll/᩷ۜۧ;

    iget-wide v0, p0, Ll/ۢۜۧ;->᩻֫:J

    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۗ()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-interface {p4, v0, v1, p3}, Ll/᩷ۜۧ;->֫(J[F)V

    goto/16 :goto_0

    :cond_7
    :goto_4
    return-void
.end method

.method public final ֫(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    .line 78
    iput-wide p1, p0, Ll/ۢۜۧ;->᩻֫:J

    .line 139
    iget-object p1, p0, Ll/ۢۜۧ;->ۜ֫:Ll/᩷ۜۧ;

    if-eqz p1, :cond_0

    .line 140
    invoke-interface {p1}, Ll/᩷ۜۧ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ۤ()V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۢۜۧ;->ۜ֫:Ll/᩷ۜۧ;

    if-eqz v0, :cond_0

    .line 140
    invoke-interface {v0}, Ll/᩷ۜۧ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
