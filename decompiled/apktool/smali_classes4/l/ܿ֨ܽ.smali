.class public final Ll/ܿ֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# instance fields
.field public final ֫:C

.field public final ۧ:Z

.field public final ܽ:I

.field public final ᩳ:Ll/ۧۚܽ;


# direct methods
.method public constructor <init>(CI)V
    .locals 0

    .line 1010
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1011
    iput p2, p0, Ll/ܿ֨ܽ;->ܽ:I

    const/4 p2, 0x1

    .line 1012
    iput-boolean p2, p0, Ll/ܿ֨ܽ;->ۧ:Z

    .line 1013
    iput-char p1, p0, Ll/ܿ֨ܽ;->֫:C

    const/4 p1, 0x0

    .line 1014
    iput-object p1, p0, Ll/ܿ֨ܽ;->ᩳ:Ll/ۧۚܽ;

    return-void
.end method

.method public constructor <init>(ILl/ۧۚܽ;)V
    .locals 0

    .line 1017
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1018
    iput p1, p0, Ll/ܿ֨ܽ;->ܽ:I

    const/4 p1, 0x0

    .line 1019
    iput-boolean p1, p0, Ll/ܿ֨ܽ;->ۧ:Z

    .line 1020
    iput-char p1, p0, Ll/ܿ֨ܽ;->֫:C

    .line 1021
    iput-object p2, p0, Ll/ܿ֨ܽ;->ᩳ:Ll/ۧۚܽ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿ֨ܽ;)C
    .locals 0

    .line 0
    iget-char p0, p0, Ll/ܿ֨ܽ;->֫:C

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۧۚܽ;)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܿ֨ܽ;->ۧ(Ll/ۧۚܽ;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/᩶֡ܽ;)I
    .locals 0

    .line 1252
    iget-object p0, p0, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {p0}, Ll/ܿ֨ܽ;->ۧ(Ll/ۧۚܽ;)I

    move-result p0

    return p0
.end method

.method public static ֫(ILl/ۧۚܽ;)Ll/ܿ֨ܽ;
    .locals 3

    .line 1241
    invoke-static {p1}, Ll/ܿ֨ܽ;->ۧ(Ll/ۧۚܽ;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 1243
    new-instance p1, Ll/ܿ֨ܽ;

    int-to-char v0, v0

    invoke-direct {p1, v0, p0}, Ll/ܿ֨ܽ;-><init>(CI)V

    return-object p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x80

    if-ge v0, v2, :cond_2

    .line 1285
    invoke-interface {p1, v0}, Ll/ۧۚܽ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x10

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    :goto_1
    const/4 p0, 0x0

    return-object p0

    .line 1289
    :cond_3
    new-instance v0, Ll/ܿ֨ܽ;

    invoke-direct {v0, p0, p1}, Ll/ܿ֨ܽ;-><init>(ILl/ۧۚܽ;)V

    return-object v0
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/ܿ֨ܽ;
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-eqz p0, :cond_12

    .line 1118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const v5, 0xffff

    const-class v6, Ll/ۢ֨ܽ;

    if-ne v4, v6, :cond_3

    .line 1119
    check-cast p0, Ll/ۢ֨ܽ;

    .line 1120
    iget-object v4, p0, Ll/ۖ֨ܽ;->ۧ:[I

    const/4 v6, 0x0

    .line 1121
    :goto_1
    array-length v7, v4

    if-ge v6, v7, :cond_2

    .line 1122
    aget v7, v4, v6

    if-le v7, v5, :cond_0

    return-object v0

    :cond_0
    if-eqz v3, :cond_1

    .line 1127
    new-instance v0, Ll/ܿ֨ܽ;

    add-int v8, v2, v6

    int-to-char v7, v7

    invoke-direct {v0, v7, v8}, Ll/ܿ֨ܽ;-><init>(CI)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 1130
    :cond_2
    array-length v4, v4

    add-int/2addr v2, v4

    .line 1131
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    .line 1134
    :cond_3
    instance-of v4, p0, Ll/᩶֡ܽ;

    if-eqz v4, :cond_5

    check-cast p0, Ll/᩶֡ܽ;

    .line 1234
    iget-object v4, p0, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {v2, v4}, Ll/ܿ֨ܽ;->֫(ILl/ۧۚܽ;)Ll/ܿ֨ܽ;

    move-result-object v4

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    move-object v0, v4

    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 1141
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    .line 1144
    :cond_5
    instance-of v4, p0, Ll/᩷ۚܽ;

    if-eqz v4, :cond_11

    move-object v4, p0

    check-cast v4, Ll/᩷ۚܽ;

    iget v5, v4, Ll/᩷ۚܽ;->ᩳ:I

    iget-object v7, v4, Ll/᩷ۚܽ;->ۧ:Ll/ۛۚܽ;

    if-lez v5, :cond_11

    iget v8, v4, Ll/᩷ۚܽ;->ܽ:I

    if-ne v5, v8, :cond_11

    .line 1221
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const/4 v8, 0x1

    if-ne p0, v6, :cond_6

    .line 1222
    move-object p0, v7

    check-cast p0, Ll/ۢ֨ܽ;

    iget-object p0, p0, Ll/ۖ֨ܽ;->ۧ:[I

    array-length p0, p0

    goto :goto_2

    .line 1224
    :cond_6
    instance-of p0, v7, Ll/᩶֡ܽ;

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    goto :goto_2

    :cond_7
    const/4 p0, -0x1

    :goto_2
    if-gez p0, :cond_8

    goto/16 :goto_7

    :cond_8
    int-to-long v9, v2

    int-to-long v11, p0

    int-to-long v13, v5

    mul-long v11, v11, v13

    add-long/2addr v11, v9

    const-wide/32 v9, 0x7fffffff

    cmp-long v2, v11, v9

    if-lez v2, :cond_9

    const/4 v2, -0x1

    goto :goto_3

    :cond_9
    long-to-int v2, v11

    :goto_3
    if-gez v2, :cond_a

    goto/16 :goto_7

    :cond_a
    if-nez v3, :cond_c

    .line 1189
    instance-of v9, v7, Ll/᩶֡ܽ;

    if-eqz v9, :cond_b

    move-object v9, v7

    check-cast v9, Ll/᩶֡ܽ;

    if-le v5, v8, :cond_b

    .line 1234
    iget-object v5, v9, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {v1, v5}, Ll/ܿ֨ܽ;->֫(ILl/ۧۚܽ;)Ll/ܿ֨ܽ;

    move-result-object v5

    if-nez v5, :cond_b

    goto :goto_4

    :cond_b
    const/4 v8, 0x0

    :cond_c
    :goto_4
    if-eqz v8, :cond_10

    sub-int p0, v2, p0

    .line 1199
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    if-ne v5, v6, :cond_e

    .line 1200
    check-cast v7, Ll/ۢ֨ܽ;

    iget-object v5, v7, Ll/ۖ֨ܽ;->ۧ:[I

    const/4 v6, 0x0

    .line 1201
    :goto_5
    array-length v7, v5

    if-ge v6, v7, :cond_10

    .line 1202
    aget v7, v5, v6

    const v9, 0xffff

    if-le v7, v9, :cond_d

    goto :goto_6

    .line 1206
    :cond_d
    new-instance v0, Ll/ܿ֨ܽ;

    add-int v9, p0, v6

    int-to-char v7, v7

    invoke-direct {v0, v7, v9}, Ll/ܿ֨ܽ;-><init>(CI)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 1210
    :cond_e
    instance-of v5, v7, Ll/᩶֡ܽ;

    if-eqz v5, :cond_10

    check-cast v7, Ll/᩶֡ܽ;

    .line 1234
    iget-object v5, v7, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {p0, v5}, Ll/ܿ֨ܽ;->֫(ILl/ۧۚܽ;)Ll/ܿ֨ܽ;

    move-result-object p0

    if-nez p0, :cond_f

    goto :goto_6

    :cond_f
    move-object v0, p0

    :cond_10
    :goto_6
    or-int/2addr v3, v8

    .line 1162
    iget-object p0, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto/16 :goto_0

    .line 1165
    :cond_11
    instance-of v1, p0, Ll/ۙ֡ܽ;

    if-eqz v1, :cond_12

    check-cast p0, Ll/ۙ֡ܽ;

    iget v1, p0, Ll/ۜۚܽ;->ۧ:I

    if-lez v1, :cond_12

    .line 1166
    iget-object p0, p0, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    invoke-static {v2, p0}, Ll/ܿ֨ܽ;->֫(ILl/ۧۚܽ;)Ll/ܿ֨ܽ;

    move-result-object p0

    if-eqz v3, :cond_12

    if-eqz p0, :cond_12

    return-object p0

    :cond_12
    :goto_7
    return-object v0
.end method

.method public static ֫(Ll/ۛۚܽ;Ll/ۧۚܽ;I)Ll/ܿ֨ܽ;
    .locals 5

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_b

    .line 1029
    instance-of v1, p0, Ll/ۢ֨ܽ;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p0, Ll/ۢ֨ܽ;

    .line 1030
    iget-object v1, p0, Ll/ۖ֨ܽ;->ۧ:[I

    .line 1031
    :goto_1
    array-length v3, v1

    if-ge v2, v3, :cond_2

    .line 1032
    aget v3, v1, v2

    const v4, 0xffff

    if-le v3, v4, :cond_0

    return-object v0

    .line 1036
    :cond_0
    invoke-interface {p1, v3}, Ll/ۧۚܽ;->֫(I)Z

    move-result v4

    if-nez v4, :cond_1

    .line 1037
    new-instance p0, Ll/ܿ֨ܽ;

    add-int/2addr p2, v2

    int-to-char p1, v3

    invoke-direct {p0, p1, p2}, Ll/ܿ֨ܽ;-><init>(CI)V

    return-object p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1040
    :cond_2
    array-length v0, v1

    add-int/2addr p2, v0

    .line 1041
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    .line 1044
    :cond_3
    instance-of v1, p0, Ll/᩶֡ܽ;

    if-eqz v1, :cond_b

    check-cast p0, Ll/᩶֡ܽ;

    iget-object v1, p0, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    .line 1252
    invoke-static {v1}, Ll/ܿ֨ܽ;->ۧ(Ll/ۧۚܽ;)I

    move-result v3

    if-ltz v3, :cond_4

    .line 1046
    invoke-interface {p1, v3}, Ll/ۧۚܽ;->֫(I)Z

    move-result v4

    if-nez v4, :cond_4

    .line 1047
    new-instance p0, Ll/ܿ֨ܽ;

    int-to-char p1, v3

    invoke-direct {p0, p1, p2}, Ll/ܿ֨ܽ;-><init>(CI)V

    return-object p0

    :cond_4
    const/4 v3, 0x0

    :goto_2
    const/16 v4, 0x80

    if-ge v2, v4, :cond_8

    .line 1266
    invoke-interface {v1, v2}, Ll/ۧۚܽ;->֫(I)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    .line 1269
    :cond_5
    invoke-interface {p1, v2}, Ll/ۧۚܽ;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0x10

    if-le v3, v4, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    if-nez v3, :cond_9

    goto :goto_4

    .line 1276
    :cond_9
    new-instance v0, Ll/ܿ֨ܽ;

    invoke-direct {v0, p2, v1}, Ll/ܿ֨ܽ;-><init>(ILl/ۧۚܽ;)V

    :goto_4
    if-eqz v0, :cond_a

    return-object v0

    :cond_a
    add-int/lit8 p2, p2, 0x1

    .line 1055
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    :cond_b
    return-object v0
.end method

.method public static ۧ(Ll/ۧۚܽ;)I
    .locals 1

    .line 1256
    instance-of v0, p0, Ll/᩷֨ܽ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩷֨ܽ;

    invoke-static {p0}, Ll/᩷֨ܽ;->֫(Ll/᩷֨ܽ;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ۧ(Ll/ۛۚܽ;)Ll/ܿ֨ܽ;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-eqz p0, :cond_6

    .line 1070
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ll/ۢ֨ܽ;

    if-ne v2, v3, :cond_2

    .line 1071
    check-cast p0, Ll/ۢ֨ܽ;

    .line 1072
    iget-object v2, p0, Ll/ۖ֨ܽ;->ۧ:[I

    const/4 v3, 0x0

    .line 1073
    :goto_1
    array-length v4, v2

    if-ge v3, v4, :cond_1

    .line 1074
    aget v4, v2, v3

    const v5, 0xffff

    if-le v4, v5, :cond_0

    return-object v0

    .line 1078
    :cond_0
    new-instance v0, Ll/ܿ֨ܽ;

    add-int v5, v1, v3

    int-to-char v4, v4

    invoke-direct {v0, v4, v5}, Ll/ܿ֨ܽ;-><init>(CI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1080
    :cond_1
    array-length v2, v2

    add-int/2addr v1, v2

    .line 1081
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    .line 1084
    :cond_2
    instance-of v2, p0, Ll/᩶֡ܽ;

    if-eqz v2, :cond_4

    check-cast p0, Ll/᩶֡ܽ;

    .line 1252
    iget-object v2, p0, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {v2}, Ll/ܿ֨ܽ;->ۧ(Ll/ۧۚܽ;)I

    move-result v2

    if-ltz v2, :cond_3

    .line 1087
    new-instance v0, Ll/ܿ֨ܽ;

    int-to-char v2, v2

    invoke-direct {v0, v2, v1}, Ll/ܿ֨ܽ;-><init>(CI)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 1090
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    .line 1093
    :cond_4
    instance-of v2, p0, Ll/᩷ۚܽ;

    if-eqz v2, :cond_6

    check-cast p0, Ll/᩷ۚܽ;

    iget v2, p0, Ll/᩷ۚܽ;->ᩳ:I

    if-lez v2, :cond_6

    iget v3, p0, Ll/᩷ۚܽ;->ܽ:I

    if-ne v2, v3, :cond_6

    .line 1096
    iget-object v3, p0, Ll/᩷ۚܽ;->ۧ:Ll/ۛۚܽ;

    instance-of v4, v3, Ll/᩶֡ܽ;

    if-eqz v4, :cond_6

    check-cast v3, Ll/᩶֡ܽ;

    .line 1252
    iget-object v3, v3, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {v3}, Ll/ܿ֨ܽ;->ۧ(Ll/ۧۚܽ;)I

    move-result v3

    if-ltz v3, :cond_5

    .line 1099
    new-instance v0, Ll/ܿ֨ܽ;

    add-int v4, v1, v2

    add-int/lit8 v4, v4, -0x1

    int-to-char v3, v3

    invoke-direct {v0, v3, v4}, Ll/ܿ֨ܽ;-><init>(CI)V

    :cond_5
    add-int/2addr v1, v2

    .line 1102
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ܿ֨ܽ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܿ֨ܽ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܿ֨ܽ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿ֨ܽ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܿ֨ܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ֨ܽ;->ᩳ:Ll/ۧۚܽ;

    return-object p0
.end method
