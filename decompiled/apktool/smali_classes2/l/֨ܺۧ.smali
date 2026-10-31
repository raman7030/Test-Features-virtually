.class public final Ll/֨ܺۧ;
.super Ll/ܶۡۧ;
.source "18KE"


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public final ۧ:Ll/ܽ֨֫;

.field public ܽ:Ll/ۢ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/֨ܺۧ;->֫:Ll/ᩳ֨֫;

    .line 46
    new-instance v0, Ll/ܽ֨֫;

    invoke-direct {v0}, Ll/ܽ֨֫;-><init>()V

    iput-object v0, p0, Ll/֨ܺۧ;->ۧ:Ll/ܽ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠ۡۧ;Ljava/nio/ByteBuffer;)Ll/᩻᩵֫;
    .locals 6

    .line 53
    iget-object v0, p0, Ll/֨ܺۧ;->ܽ:Ll/ۢ֨֫;

    if-eqz v0, :cond_0

    iget-wide v1, p1, Ll/۠ۡۧ;->ۨ:J

    .line 54
    invoke-virtual {v0}, Ll/ۢ֨֫;->ܽ()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_1

    .line 55
    :cond_0
    new-instance v0, Ll/ۢ֨֫;

    iget-wide v1, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-direct {v0, v1, v2}, Ll/ۢ֨֫;-><init>(J)V

    iput-object v0, p0, Ll/֨ܺۧ;->ܽ:Ll/ۢ֨֫;

    .line 56
    iget-wide v1, p1, Ll/᩸᩸֫;->ۤ:J

    iget-wide v3, p1, Ll/۠ۡۧ;->ۨ:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ll/ۢ֨֫;->֫(J)J

    .line 59
    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    .line 60
    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    .line 61
    iget-object v0, p0, Ll/֨ܺۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v0, p2, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 62
    iget-object v1, p0, Ll/֨ܺۧ;->ۧ:Ll/ܽ֨֫;

    invoke-virtual {v1, p2, p1}, Ll/ܽ֨֫;->ܽ(I[B)V

    const/16 p1, 0x27

    .line 65
    invoke-virtual {v1, p1}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 p1, 0x1

    .line 66
    invoke-virtual {v1, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p2

    int-to-long v2, p2

    const/16 p2, 0x20

    shl-long/2addr v2, p2

    .line 67
    invoke-virtual {v1, p2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p2

    int-to-long v4, p2

    or-long/2addr v2, v4

    const/16 p2, 0x14

    .line 69
    invoke-virtual {v1, p2}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 p2, 0xc

    .line 70
    invoke-virtual {v1, p2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p2

    const/16 v4, 0x8

    .line 71
    invoke-virtual {v1, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    const/16 v4, 0xe

    .line 74
    invoke-virtual {v0, v4}, Ll/ᩳ֨֫;->ܳ(I)V

    if-eqz v1, :cond_6

    const/16 v4, 0xff

    if-eq v1, v4, :cond_5

    const/4 p2, 0x4

    if-eq v1, p2, :cond_4

    const/4 p2, 0x5

    if-eq v1, p2, :cond_3

    const/4 p2, 0x6

    if-eq v1, p2, :cond_2

    const/4 p2, 0x0

    goto :goto_0

    .line 87
    :cond_2
    iget-object p2, p0, Ll/֨ܺۧ;->ܽ:Ll/ۢ֨֫;

    invoke-static {v0, v2, v3, p2}, Ll/ۗܺۧ;->֫(Ll/ᩳ֨֫;JLl/ۢ֨֫;)Ll/ۗܺۧ;

    move-result-object p2

    goto :goto_0

    .line 83
    :cond_3
    iget-object p2, p0, Ll/֨ܺۧ;->ܽ:Ll/ۢ֨֫;

    .line 84
    invoke-static {v0, v2, v3, p2}, Ll/ܶܺۧ;->֫(Ll/ᩳ֨֫;JLl/ۢ֨֫;)Ll/ܶܺۧ;

    move-result-object p2

    goto :goto_0

    .line 80
    :cond_4
    invoke-static {v0}, Ll/ۙܺۧ;->֫(Ll/ᩳ֨֫;)Ll/ۙܺۧ;

    move-result-object p2

    goto :goto_0

    .line 90
    :cond_5
    invoke-static {v0, p2, v2, v3}, Ll/֡ܺۧ;->֫(Ll/ᩳ֨֫;IJ)Ll/֡ܺۧ;

    move-result-object p2

    goto :goto_0

    .line 77
    :cond_6
    new-instance p2, Ll/᩸ܺۧ;

    .line 23
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :goto_0
    const/4 v0, 0x0

    if-nez p2, :cond_7

    .line 96
    new-instance p1, Ll/᩻᩵֫;

    new-array p2, v0, [Ll/ܳ᩵֫;

    invoke-direct {p1, p2}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    return-object p1

    :cond_7
    new-instance v1, Ll/᩻᩵֫;

    new-array p1, p1, [Ll/ܳ᩵֫;

    aput-object p2, p1, v0

    invoke-direct {v1, p1}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    return-object v1
.end method
