.class public final Ll/ۖۧ;
.super Ljava/lang/Object;
.source "E5FU"


# instance fields
.field public ֫:J

.field public ۜ:J

.field public ۡ:J

.field public ۢ:I

.field public ۧ:J

.field public ܳ:Ljava/lang/CharSequence;

.field public ܽ:J

.field public ܿ:I

.field public final ᩳ:Ljava/util/ArrayList;

.field public ᩷:F

.field public ᩻:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖۧ;->ᩳ:Ljava/util/ArrayList;

    const-wide/16 v0, -0x1

    .line 1118
    iput-wide v0, p0, Ll/ۖۧ;->ۧ:J

    return-void
.end method

.method public constructor <init>(Ll/᩵ۧ;)V
    .locals 3

    .line 1133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖۧ;->ᩳ:Ljava/util/ArrayList;

    const-wide/16 v1, -0x1

    .line 1118
    iput-wide v1, p0, Ll/ۖۧ;->ۧ:J

    .line 1134
    iget v1, p1, Ll/᩵ۧ;->ۨ:I

    iput v1, p0, Ll/ۖۧ;->ۢ:I

    .line 1135
    iget-wide v1, p1, Ll/᩵ۧ;->ۤ:J

    iput-wide v1, p0, Ll/ۖۧ;->ۜ:J

    .line 1136
    iget v1, p1, Ll/᩵ۧ;->ۛ:F

    iput v1, p0, Ll/ۖۧ;->᩷:F

    .line 1137
    iget-wide v1, p1, Ll/᩵ۧ;->ܰ:J

    iput-wide v1, p0, Ll/ۖۧ;->ۡ:J

    .line 1138
    iget-wide v1, p1, Ll/᩵ۧ;->᩶:J

    iput-wide v1, p0, Ll/ۖۧ;->ܽ:J

    .line 1139
    iget-wide v1, p1, Ll/᩵ۧ;->᩸:J

    iput-wide v1, p0, Ll/ۖۧ;->֫:J

    .line 1140
    iget v1, p1, Ll/᩵ۧ;->ۗ:I

    iput v1, p0, Ll/ۖۧ;->ܿ:I

    .line 1141
    iget-object v1, p1, Ll/᩵ۧ;->۬:Ljava/lang/CharSequence;

    iput-object v1, p0, Ll/ۖۧ;->ܳ:Ljava/lang/CharSequence;

    .line 1142
    iget-object v1, p1, Ll/᩵ۧ;->ۙ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 1143
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1145
    :cond_0
    iget-wide v0, p1, Ll/᩵ۧ;->᩹:J

    iput-wide v0, p0, Ll/ۖۧ;->ۧ:J

    .line 1146
    iget-object p1, p1, Ll/᩵ۧ;->۫:Landroid/os/Bundle;

    iput-object p1, p0, Ll/ۖۧ;->᩻:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩵ۧ;
    .locals 19

    move-object/from16 v0, p0

    .line 1372
    new-instance v18, Ll/᩵ۧ;

    move-object/from16 v1, v18

    iget v2, v0, Ll/ۖۧ;->ۢ:I

    iget-wide v3, v0, Ll/ۖۧ;->ۜ:J

    iget v7, v0, Ll/ۖۧ;->᩷:F

    iget-wide v8, v0, Ll/ۖۧ;->֫:J

    iget-wide v12, v0, Ll/ۖۧ;->ۡ:J

    iget-wide v5, v0, Ll/ۖۧ;->ۧ:J

    move-wide v15, v5

    iget-object v5, v0, Ll/ۖۧ;->᩻:Landroid/os/Bundle;

    move-object/from16 v17, v5

    iget-wide v5, v0, Ll/ۖۧ;->ܽ:J

    iget v10, v0, Ll/ۖۧ;->ܿ:I

    iget-object v11, v0, Ll/ۖۧ;->ܳ:Ljava/lang/CharSequence;

    iget-object v14, v0, Ll/ۖۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct/range {v1 .. v17}, Ll/᩵ۧ;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    return-object v18
.end method

.method public final ֫(IJFJ)V
    .locals 0

    .line 1220
    iput p1, p0, Ll/ۖۧ;->ۢ:I

    .line 1221
    iput-wide p2, p0, Ll/ۖۧ;->ۜ:J

    .line 1222
    iput-wide p5, p0, Ll/ۖۧ;->ۡ:J

    .line 1223
    iput p4, p0, Ll/ۖۧ;->᩷:F

    return-void
.end method

.method public final ۧ()V
    .locals 2

    const-wide/16 v0, 0x336

    .line 1270
    iput-wide v0, p0, Ll/ۖۧ;->֫:J

    return-void
.end method
