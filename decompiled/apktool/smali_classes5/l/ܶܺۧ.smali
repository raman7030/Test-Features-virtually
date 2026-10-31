.class public final Ll/ܶܺۧ;
.super Ll/ۚܺۧ;
.source "R8SJ"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:J

.field public final ܽ:J


# direct methods
.method public constructor <init>(JJLjava/util/List;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-wide p1, p0, Ll/ܶܺۧ;->ܽ:J

    .line 111
    iput-wide p3, p0, Ll/ܶܺۧ;->ۧ:J

    .line 112
    invoke-static {p5}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܶܺۧ;->֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;JLl/ۢ֨֫;)Ll/ܶܺۧ;
    .locals 16

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    .line 122
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    .line 124
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    and-int/lit16 v4, v4, 0x80

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 129
    :goto_0
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v4, :cond_8

    .line 136
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    and-int/lit8 v10, v4, 0x40

    if-eqz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    and-int/lit8 v11, v4, 0x20

    if-eqz v11, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    :goto_2
    and-int/lit8 v4, v4, 0x10

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    if-eqz v10, :cond_4

    if-nez v5, :cond_4

    .line 142
    invoke-static {v1, v2, v0}, Ll/ۗܺۧ;->֫(JLl/ᩳ֨֫;)J

    move-result-wide v12

    goto :goto_4

    :cond_4
    move-wide v12, v8

    :goto_4
    if-nez v10, :cond_6

    .line 145
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    .line 146
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_5
    if-ge v6, v4, :cond_6

    .line 148
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    if-nez v5, :cond_5

    .line 151
    invoke-static {v1, v2, v0}, Ll/ۗܺۧ;->֫(JLl/ᩳ֨֫;)J

    move-result-wide v14

    goto :goto_6

    :cond_5
    move-wide v14, v8

    .line 153
    :goto_6
    new-instance v10, Ll/۠ܺۧ;

    .line 157
    invoke-virtual {v3, v14, v15}, Ll/ۢ֨֫;->ۧ(J)J

    .line 194
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 153
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_6
    if-eqz v11, :cond_7

    .line 161
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    .line 163
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    .line 166
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    .line 167
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    .line 168
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-object v5, v7

    move-wide v1, v12

    goto :goto_7

    :cond_8
    move-object v5, v7

    move-wide v1, v8

    .line 170
    :goto_7
    new-instance v6, Ll/ܶܺۧ;

    .line 177
    invoke-virtual {v3, v1, v2}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v3

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ܶܺۧ;-><init>(JJLjava/util/List;)V

    return-object v6
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SCTE-35 SpliceInsertCommand { programSplicePts="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ܶܺۧ;->ܽ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", programSplicePlaybackPositionUs= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ܶܺۧ;->ۧ:J

    const-string v3, " }"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
