.class public final Ll/۟ۙ֫;
.super Ll/ۘܽۧ;
.source "H74H"


# instance fields
.field public ֫֫:I

.field public ۟:I

.field public final synthetic ۧ֫:Ll/ᩳۗ֫;

.field public ܽ֫:J

.field public final ᩳ֫:I


# direct methods
.method public constructor <init>(Ll/ᩳۗ֫;Ll/۫ܿۧ;I)V
    .locals 0

    .line 1057
    iput-object p1, p0, Ll/۟ۙ֫;->ۧ֫:Ll/ᩳۗ֫;

    const/4 p1, 0x0

    .line 1060
    invoke-direct {p0, p2, p1, p1}, Ll/ۘܽۧ;-><init>(Ll/᩸ܿۧ;Ll/ۙۛ֫;Ll/ܶۛ֫;)V

    .line 1061
    iput p3, p0, Ll/۟ۙ֫;->ᩳ֫:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 1062
    iput-wide p1, p0, Ll/۟ۙ֫;->ܽ֫:J

    const/4 p1, -0x1

    .line 1063
    iput p1, p0, Ll/۟ۙ֫;->֫֫:I

    .line 1064
    iput p1, p0, Ll/۟ۙ֫;->۟:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1114
    iget v0, p0, Ll/۟ۙ֫;->֫֫:I

    iget v1, p0, Ll/۟ۙ֫;->۟:I

    const-string v2, ", mainTrackIndex: "

    const-string v3, ", compatibilityTrackIndex: "

    const-string v4, "trackId: "

    .line 0
    iget v5, p0, Ll/۟ۙ֫;->ᩳ֫:I

    invoke-static {v4, v5, v2, v3, v0}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(J)V
    .locals 0

    .line 1079
    iput-wide p1, p0, Ll/۟ۙ֫;->ܽ֫:J

    return-void
.end method

.method public final ֫(JIIILl/ᩴۢۧ;)V
    .locals 13

    move-object v7, p0

    move-wide v8, p1

    const v0, -0x20000001

    and-int v3, p3, v0

    .line 1101
    iget v0, v7, Ll/۟ۙ֫;->֫֫:I

    const/4 v10, 0x0

    const/4 v11, -0x1

    if-eq v0, v11, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1102
    invoke-virtual {p0}, Ll/ۘܽۧ;->ۜ()I

    move-result v12

    move-object v0, p0

    move-wide v1, p1

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    .line 1103
    invoke-super/range {v0 .. v6}, Ll/ۘܽۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 1105
    invoke-virtual {p0}, Ll/ۘܽۧ;->ۜ()I

    move-result v0

    add-int/lit8 v12, v12, 0x1

    if-ne v0, v12, :cond_4

    const/high16 v0, 0x40000000    # 2.0f

    and-int v0, p3, v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_2

    const/4 v10, 0x1

    :cond_2
    or-int/2addr v0, v10

    .line 1124
    iget v1, v7, Ll/۟ۙ֫;->۟:I

    iget-object v2, v7, Ll/۟ۙ֫;->ۧ֫:Ll/ᩳۗ֫;

    if-eq v1, v11, :cond_3

    .line 1125
    invoke-static {v2}, Ll/ᩳۗ֫;->ۧ(Ll/ᩳۗ֫;)Ll/ܽۗ֫;

    move-result-object v1

    iget v3, v7, Ll/۟ۙ֫;->۟:I

    invoke-virtual {v1, v0, v3, p1, p2}, Ll/ܽۗ֫;->֫(IIJ)V

    .line 1128
    :cond_3
    invoke-static {v2}, Ll/ᩳۗ֫;->ۧ(Ll/ᩳۗ֫;)Ll/ܽۗ֫;

    move-result-object v1

    iget v2, v7, Ll/۟ۙ֫;->֫֫:I

    invoke-virtual {v1, v0, v2, p1, p2}, Ll/ܽۗ֫;->֫(IIJ)V

    :cond_4
    return-void
.end method

.method public final ۧ(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;
    .locals 1

    .line 1085
    invoke-virtual {p0}, Ll/ۘܽۧ;->᩻()Ll/۠ᩴ֫;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1086
    iget-object v0, p0, Ll/۟ۙ֫;->ۧ֫:Ll/ᩳۗ֫;

    invoke-static {v0, p0, p1}, Ll/ᩳۗ֫;->֫(Ll/ᩳۗ֫;Ll/۟ۙ֫;Ll/۠ᩴ֫;)V

    .line 1088
    :cond_0
    invoke-super {p0, p1}, Ll/ۘܽۧ;->ۧ(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(I)V
    .locals 0

    .line 1068
    iput p1, p0, Ll/۟ۙ֫;->֫֫:I

    return-void
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 1072
    iput p1, p0, Ll/۟ۙ֫;->۟:I

    return-void
.end method
