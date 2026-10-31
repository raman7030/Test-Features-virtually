.class public final Ll/ۨ᩺ۚ;
.super Ll/ܿ۬᩻;
.source "A7EF"


# instance fields
.field public ۙ:Ll/ܰ۟ۚ;

.field public ᩶:Ll/۫ۗۚ;

.field public ᩸:Ll/ۘۨۚ;

.field public ᩹:Ll/ۜ۟ۚ;


# direct methods
.method public static bridge synthetic ֫(Ll/ۨ᩺ۚ;)Ll/ۜ۟ۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨ᩺ۚ;->᩹:Ll/ۜ۟ۚ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۨ᩺ۚ;Ll/ۜ۟ۚ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۨ᩺ۚ;->᩹:Ll/ۜ۟ۚ;

    return-void
.end method

.method private ۖ(Ll/ᩳ֫֨;)I
    .locals 6

    .line 1002
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩹:Ll/ۜ۟ۚ;

    iget-object v1, v0, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    sget-object v2, Ll/ܶۨۚ;->ۨܽ:Ll/ܶۨۚ;

    if-ne v1, v2, :cond_0

    .line 1003
    iget p1, v0, Ll/ۜ۟ۚ;->ܺ:I

    .line 1005
    :try_start_0
    invoke-virtual {v0}, Ll/ۜ۟ۚ;->֫()V
    :try_end_0
    .catch Ll/۫ۗۚ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    .line 1007
    iput-object v0, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    return p1

    .line 1010
    :cond_0
    iget-object v1, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    iget-wide v2, v0, Ll/ۜ۟ۚ;->ᩴ:J

    invoke-virtual {p1}, Ll/ᩳ֫֨;->ۧ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩹:Ll/ۜ۟ۚ;

    iget-object v0, v0, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 p1, 0x1

    aput-object v0, v4, p1

    const-string p1, "Incorrect TypeAnnotation \"{0}\" argument: (expected Integer),  \"{1}\""

    .line 0
    invoke-static {v1, v2, v3, p1, v4}, Ll/᩵۫ۡ;->֫(Ll/ۘۨۚ;JLjava/lang/String;[Ljava/lang/Object;)Ll/۫ۗۚ;

    move-result-object p1

    .line 1011
    iput-object p1, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    const/4 p1, -0x1

    return p1
.end method

.method private ܽ()Z
    .locals 1

    .line 1043
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final ֫(Ll/ۜ۟ۚ;)V
    .locals 0

    .line 976
    iput-object p1, p0, Ll/ۨ᩺ۚ;->᩹:Ll/ۜ۟ۚ;

    .line 977
    iget-object p1, p1, Ll/֫ܰۚ;->֫:Ll/ۘۨۚ;

    iput-object p1, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 p1, 0x0

    .line 982
    iput-object p1, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    .line 983
    iput-object p1, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    return-void
.end method

.method public final ۜ(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1097
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Throws Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1098
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1099
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1100
    new-instance v1, Ll/ۤ۟ۚ;

    invoke-direct {v1, p1, v0}, Ll/ۤ۟ۚ;-><init>(Ll/ᩳ֫֨;I)V

    iput-object v1, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    :cond_0
    return-void
.end method

.method public final ۡ(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1066
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TypeParam Bound Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1067
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1068
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1071
    :cond_0
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v1

    .line 1072
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    return-void

    .line 1075
    :cond_1
    new-instance v2, Ll/ۨ۟ۚ;

    invoke-direct {v2, p1, v0, v1}, Ll/ۨ۟ۚ;-><init>(Ll/ᩳ֫֨;II)V

    iput-object v2, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    return-void
.end method

.method public final ۢ(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1153
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TypeArg Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1155
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1158
    :cond_0
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v1

    .line 1159
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    return-void

    .line 1162
    :cond_1
    new-instance v2, Ll/ۛ۟ۚ;

    invoke-direct {v2, p1, v0, v1}, Ll/ۛ۟ۚ;-><init>(Ll/ᩳ֫֨;II)V

    iput-object v2, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    return-void
.end method

.method public final ۧ()Ll/ܰ۟ۚ;
    .locals 1

    .line 996
    iget-object v0, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    return-object v0
.end method

.method public final ۧ(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1136
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Catch Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1137
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1139
    new-instance v1, Ll/ܶ۟ۚ;

    invoke-direct {v1, p1, v0}, Ll/ܶ۟ۚ;-><init>(Ll/ᩳ֫֨;I)V

    iput-object v1, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    return-void
.end method

.method public final ܳ(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1144
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Offset Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1145
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1146
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1147
    new-instance v1, Ll/۬۟ۚ;

    invoke-direct {v1, p1, v0}, Ll/۬۟ۚ;-><init>(Ll/ᩳ֫֨;I)V

    iput-object v1, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    :cond_0
    return-void
.end method

.method public final ܺ(Ll/ᩳ֫֨;)V
    .locals 1

    const/4 v0, 0x0

    .line 982
    iput-object v0, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    .line 983
    iput-object v0, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    .line 989
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->֫(Ll/ᩳ֫֨;)V

    .line 990
    iget-object p1, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    if-nez p1, :cond_0

    return-void

    .line 991
    :cond_0
    throw p1
.end method

.method public final ܽ(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1080
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Empty Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1082
    new-instance v0, Ll/᩸۟ۚ;

    .line 201
    invoke-direct {v0, p1}, Ll/ܰ۟ۚ;-><init>(Ll/ᩳ֫֨;)V

    .line 1082
    iput-object v0, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    :cond_0
    return-void
.end method

.method public final ܿ(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1088
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MethodParam Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1090
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1091
    new-instance v1, Ll/᩹۟ۚ;

    invoke-direct {v1, p1, v0}, Ll/᩹۟ۚ;-><init>(Ll/ᩳ֫֨;I)V

    iput-object v1, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    :cond_0
    return-void
.end method

.method public final ᩳ(Ll/ᩳ֫֨;)V
    .locals 4

    .line 1106
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "LocalVar Target: "

    invoke-virtual {v0, v3, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1107
    new-instance v0, Ll/ۗ۟ۚ;

    invoke-direct {v0, p1, v1}, Ll/ۗ۟ۚ;-><init>(Ll/ᩳ֫֨;I)V

    .line 1108
    iput-object v0, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    .line 1110
    :cond_0
    iget-object v1, p0, Ll/ۨ᩺ۚ;->᩹:Ll/ۜ۟ۚ;

    iget-object v2, v1, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    sget-object v3, Ll/ܶۨۚ;->۬ۧ:Ll/ܶۨۚ;

    if-eq v2, v3, :cond_4

    sget-object v3, Ll/ܶۨۚ;->֡ܿ:Ll/ܶۨۚ;

    if-eq v2, v3, :cond_4

    .line 1036
    :try_start_0
    sget-object v2, Ll/ܶۨۚ;->᩺ܽ:Ll/ܶۨۚ;

    invoke-virtual {v1, v2}, Ll/ۜ۟ۚ;->ۧ(Ll/ܶۨۚ;)V
    :try_end_0
    .catch Ll/۫ۗۚ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 1038
    iput-object v1, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    .line 1113
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 1117
    :cond_1
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v1

    .line 1118
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 1121
    :cond_2
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v2

    .line 1122
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    .line 1125
    :cond_3
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v3

    .line 1126
    invoke-virtual {v0, v1, v2, v3}, Ll/ۗ۟ۚ;->֫(III)V

    .line 1036
    :try_start_1
    iget-object v1, p0, Ll/ۨ᩺ۚ;->᩹:Ll/ۜ۟ۚ;

    sget-object v2, Ll/ܶۨۚ;->֡ܿ:Ll/ܶۨۚ;

    invoke-virtual {v1, v2}, Ll/ۜ۟ۚ;->ۧ(Ll/ܶۨۚ;)V
    :try_end_1
    .catch Ll/۫ۗۚ; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 1038
    iput-object v1, p0, Ll/ۨ᩺ۚ;->᩶:Ll/۫ۗۚ;

    .line 1128
    :goto_1
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_4
    :goto_2
    return-void
.end method

.method public final ᩷(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1048
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Type Param Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1049
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1050
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1051
    new-instance v1, Ll/᩺۟ۚ;

    invoke-direct {v1, p1, v0}, Ll/᩺۟ۚ;-><init>(Ll/ᩳ֫֨;I)V

    iput-object v1, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    :cond_0
    return-void
.end method

.method public final ᩻(Ll/ᩳ֫֨;)V
    .locals 3

    .line 1057
    iget-object v0, p0, Ll/ۨ᩺ۚ;->᩸:Ll/ۘۨۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SuperType Target: "

    invoke-virtual {v0, v2, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1058
    invoke-direct {p0, p1}, Ll/ۨ᩺ۚ;->ۖ(Ll/ᩳ֫֨;)I

    move-result v0

    .line 1059
    invoke-direct {p0}, Ll/ۨ᩺ۚ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1060
    new-instance v1, Ll/۫۟ۚ;

    invoke-direct {v1, p1, v0}, Ll/۫۟ۚ;-><init>(Ll/ᩳ֫֨;I)V

    iput-object v1, p0, Ll/ۨ᩺ۚ;->ۙ:Ll/ܰ۟ۚ;

    :cond_0
    return-void
.end method
