.class public final Ll/֫ۢܿ;
.super Ljava/lang/Object;
.source "N6ZQ"


# instance fields
.field public ֫:I

.field public ۖ:Z

.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:[I

.field public ܳ:I

.field public final ܺ:Ll/ᩳۢܿ;

.field public final ܽ:Ll/ܶۘܿ;

.field public final ܿ:I

.field public ᩳ:Z

.field public final ᩷:I

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ᩳۢܿ;Ll/ܶۘܿ;IIII[I)V
    .locals 4

    .line 1112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 1102
    iput v0, p0, Ll/֫ۢܿ;->ܳ:I

    .line 1106
    iput-boolean v0, p0, Ll/֫ۢܿ;->ۖ:Z

    .line 1113
    iput-object p1, p0, Ll/֫ۢܿ;->ܺ:Ll/ᩳۢܿ;

    const-string v1, "changes"

    .line 1114
    invoke-static {p2, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Ll/֫ۢܿ;->ܽ:Ll/ܶۘܿ;

    const-string v1, "activeRelativeNodes"

    .line 1115
    invoke-static {p7, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p7, p0, Ll/֫ۢܿ;->ۧ:[I

    .line 1117
    invoke-virtual {p2}, Ll/ܶۘܿ;->ܿ()I

    move-result p7

    invoke-static {p1}, Ll/ᩳۢܿ;->ܳ(Ll/ᩳۢܿ;)I

    move-result v1

    if-ne p7, v1, :cond_0

    if-lt p3, v0, :cond_0

    invoke-static {p1}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result p7

    if-gt p3, p7, :cond_0

    if-ltz p4, :cond_0

    int-to-long v0, p3

    int-to-long v2, p4

    add-long/2addr v0, v2

    invoke-static {p1}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result p1

    int-to-long v2, p1

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    if-ltz p5, :cond_0

    .line 1120
    invoke-virtual {p2}, Ll/ܶۘܿ;->ܿ()I

    move-result p1

    if-gt p5, p1, :cond_0

    if-ltz p6, :cond_0

    .line 1121
    invoke-virtual {p2}, Ll/ܶۘܿ;->ᩳ()I

    move-result p1

    if-gt p6, p1, :cond_0

    .line 1124
    iput p3, p0, Ll/֫ۢܿ;->ۡ:I

    .line 1125
    iput p4, p0, Ll/֫ۢܿ;->ܿ:I

    add-int/2addr p3, p4

    .line 1126
    iput p3, p0, Ll/֫ۢܿ;->ۜ:I

    .line 1127
    iput p5, p0, Ll/֫ۢܿ;->ۢ:I

    .line 1128
    iput p6, p0, Ll/֫ۢܿ;->᩷:I

    return-void

    .line 1122
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Syntax context checkpoint boundaries differ"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(I)I
    .locals 4

    .line 1215
    iget-object v0, p0, Ll/֫ۢܿ;->ܽ:Ll/ܶۘܿ;

    const/4 v1, -0x1

    :try_start_0
    sget-object v2, Ll/֨ۘܿ;->᩶:Ll/֨ۘܿ;

    invoke-virtual {v0, p1, v2}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v2

    .line 1216
    sget-object v3, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {v0, p1, v3}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v2, p1, :cond_0

    return v2

    :catch_0
    :cond_0
    return v1
.end method

.method private ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 1233
    iput-boolean v0, p0, Ll/֫ۢܿ;->ۖ:Z

    const/4 v0, 0x1

    .line 1234
    iput-boolean v0, p0, Ll/֫ۢܿ;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 1253
    iget-boolean v0, p0, Ll/֫ۢܿ;->ᩳ:Z

    return v0
.end method

.method public final ֫(Ll/ܳۢܿ;)Z
    .locals 14

    const-string v0, "target"

    .line 1135
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1136
    iget-boolean v0, p0, Ll/֫ۢܿ;->ᩳ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 1137
    :cond_0
    iget-boolean v0, p0, Ll/֫ۢܿ;->᩻:Z

    iget-object v2, p0, Ll/֫ۢܿ;->ۧ:[I

    iget v3, p0, Ll/֫ۢܿ;->᩷:I

    iget v4, p0, Ll/֫ۢܿ;->ۢ:I

    iget v5, p0, Ll/֫ۢܿ;->ۜ:I

    const/4 v6, 0x1

    if-nez v0, :cond_4

    .line 1138
    iput-boolean v6, p0, Ll/֫ۢܿ;->᩻:Z

    .line 1139
    invoke-virtual {p1}, Ll/ܳۢܿ;->ᩳ()I

    move-result v0

    iget-object v1, p0, Ll/֫ۢܿ;->ܽ:Ll/ܶۘܿ;

    invoke-virtual {v1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v1

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Ll/ܳۢܿ;->ۧ()I

    move-result p1

    if-ne p1, v6, :cond_3

    .line 1140
    invoke-direct {p0, v4}, Ll/֫ۢܿ;->֫(I)I

    move-result p1

    if-eq p1, v3, :cond_1

    goto :goto_0

    .line 1144
    :cond_1
    iget p1, p0, Ll/֫ۢܿ;->ܳ:I

    if-lt p1, v5, :cond_16

    .line 1225
    iget p1, p0, Ll/֫ۢܿ;->֫:I

    array-length v0, v2

    if-eq p1, v0, :cond_2

    .line 1226
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    return v6

    .line 1228
    :cond_2
    iput-boolean v6, p0, Ll/֫ۢܿ;->ᩳ:Z

    return v6

    .line 1141
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    return v6

    .line 1147
    :cond_4
    iget v8, p0, Ll/֫ۢܿ;->ܳ:I

    if-lt v8, v5, :cond_6

    .line 1225
    iget p1, p0, Ll/֫ۢܿ;->֫:I

    array-length v0, v2

    if-eq p1, v0, :cond_5

    .line 1226
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    return v1

    .line 1228
    :cond_5
    iput-boolean v6, p0, Ll/֫ۢܿ;->ᩳ:Z

    return v1

    .line 1152
    :cond_6
    iget v0, p0, Ll/֫ۢܿ;->ۡ:I

    sub-int v7, v8, v0

    .line 1153
    iget v9, p0, Ll/֫ۢܿ;->֫:I

    array-length v10, v2

    if-ge v9, v10, :cond_7

    .line 1154
    aget v9, v2, v9

    goto :goto_1

    :cond_7
    const v9, 0x7fffffff

    :goto_1
    if-lt v9, v7, :cond_17

    if-ltz v9, :cond_17

    .line 1155
    iget v10, p0, Ll/֫ۢܿ;->ܿ:I

    if-lt v9, v10, :cond_8

    goto/16 :goto_9

    :cond_8
    if-ne v9, v7, :cond_9

    const/4 v7, 0x1

    const/4 v13, 0x1

    goto :goto_2

    :cond_9
    const/4 v7, 0x0

    const/4 v13, 0x0

    .line 1170
    :goto_2
    iget-object v7, p0, Ll/֫ۢܿ;->ܺ:Ll/ᩳۢܿ;

    invoke-static {v7}, Ll/ᩳۢܿ;->ܽ(Ll/ᩳۢܿ;)[I

    move-result-object v9

    aget v11, v9, v8

    if-lt v8, v0, :cond_a

    if-eqz v11, :cond_a

    if-ge v11, v0, :cond_a

    .line 1172
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    goto/16 :goto_7

    :cond_a
    if-eqz v13, :cond_c

    .line 1177
    iget v9, p0, Ll/֫ۢܿ;->֫:I

    if-nez v9, :cond_b

    goto :goto_3

    :cond_b
    sub-int/2addr v9, v6

    .line 1178
    aget v1, v2, v9

    add-int/2addr v1, v0

    :goto_3
    if-eq v11, v1, :cond_c

    .line 1180
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    goto :goto_7

    .line 1184
    :cond_c
    invoke-static {v7}, Ll/ᩳۢܿ;->ܿ(Ll/ᩳۢܿ;)[I

    move-result-object v0

    aget v0, v0, v8

    invoke-direct {p0, v0}, Ll/֫ۢܿ;->֫(I)I

    move-result v9

    if-ltz v9, :cond_11

    if-le v9, v3, :cond_d

    goto :goto_6

    :cond_d
    if-eqz v13, :cond_e

    .line 1193
    :try_start_0
    invoke-virtual {p1, v11}, Ll/ܳۢܿ;->֫(I)I

    move-result v0

    move v10, v0

    goto :goto_4

    .line 1195
    :cond_e
    invoke-static {v7}, Ll/ᩳۢܿ;->֫(Ll/ᩳۢܿ;)[I

    move-result-object v0

    aget v0, v0, v8

    .line 1196
    invoke-direct {p0, v0}, Ll/֫ۢܿ;->֫(I)I

    move-result v1

    if-gt v0, v4, :cond_10

    if-ltz v1, :cond_10

    if-gt v1, v3, :cond_10

    sub-int v3, v1, v9

    .line 1197
    invoke-static {v7}, Ll/ᩳۢܿ;->ܿ(Ll/ᩳۢܿ;)[I

    move-result-object v4

    aget v4, v4, v8

    sub-int/2addr v0, v4

    if-eq v3, v0, :cond_f

    goto :goto_5

    :cond_f
    move v10, v1

    .line 1203
    :goto_4
    invoke-static {v7}, Ll/ᩳۢܿ;->ۧ(Ll/ᩳۢܿ;)[Ll/ܶۜܿ;

    move-result-object v0

    aget-object v12, v0, v8

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Ll/ܳۢܿ;->֫(IIIILl/ܶۜܿ;)Z

    move-result p1

    if-nez p1, :cond_12

    .line 1205
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    goto :goto_7

    .line 1199
    :cond_10
    :goto_5
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    .line 1208
    :catch_0
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    goto :goto_7

    .line 1186
    :cond_11
    :goto_6
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    .line 1161
    :cond_12
    :goto_7
    iget-boolean p1, p0, Ll/֫ۢܿ;->ۖ:Z

    if-nez p1, :cond_13

    goto :goto_8

    :cond_13
    if-eqz v13, :cond_14

    .line 1162
    iget p1, p0, Ll/֫ۢܿ;->֫:I

    add-int/2addr p1, v6

    iput p1, p0, Ll/֫ۢܿ;->֫:I

    .line 1163
    :cond_14
    iget p1, p0, Ll/֫ۢܿ;->ܳ:I

    add-int/2addr p1, v6

    iput p1, p0, Ll/֫ۢܿ;->ܳ:I

    if-lt p1, v5, :cond_16

    .line 1225
    iget p1, p0, Ll/֫ۢܿ;->֫:I

    array-length v0, v2

    if-eq p1, v0, :cond_15

    .line 1226
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    goto :goto_8

    .line 1228
    :cond_15
    iput-boolean v6, p0, Ll/֫ۢܿ;->ᩳ:Z

    :cond_16
    :goto_8
    return v6

    .line 1156
    :cond_17
    :goto_9
    invoke-direct {p0}, Ll/֫ۢܿ;->ᩳ()V

    return v6
.end method

.method public final ۧ()Z
    .locals 1

    .line 1257
    iget-boolean v0, p0, Ll/֫ۢܿ;->ۖ:Z

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 1239
    iget v0, p0, Ll/֫ۢܿ;->ۡ:I

    return v0
.end method
