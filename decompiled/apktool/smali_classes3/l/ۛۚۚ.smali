.class public final enum Ll/ۛۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InTable"

    const/16 v1, 0x8

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۛۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 980
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 8

    .line 478
    iget-object v0, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v1, Ll/ܺ֨ۚ;->᩹:Ll/ܺ֨ۚ;

    if-ne v0, v1, :cond_0

    .line 982
    invoke-virtual {p2}, Ll/֡ܶۚ;->֫()Ll/᩶֡ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/ۨۚۚ;->۟:[Ljava/lang/String;

    invoke-static {v0, v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 983
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩵()V

    .line 984
    invoke-virtual {p2}, Ll/ܿۚۚ;->ᩴ()V

    .line 985
    sget-object v0, Ll/᩺ۚۚ;->᩷֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 986
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 987
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ۧ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 474
    check-cast p1, Ll/ܳ֨ۚ;

    .line 988
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    return v1

    .line 990
    :cond_1
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܽ()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 991
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 993
    :cond_2
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    const-string v3, "template"

    const-string v4, "table"

    if-eqz v0, :cond_12

    .line 458
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v5, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v6, "caption"

    .line 996
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 997
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܳ()V

    .line 998
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۖ()V

    .line 999
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 1000
    sget-object p1, Ll/᩺ۚۚ;->᩺:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    :cond_3
    const-string v6, "colgroup"

    .line 1001
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 1002
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܳ()V

    .line 1003
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 1004
    sget-object p1, Ll/᩺ۚۚ;->۟:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    :cond_4
    const-string v7, "col"

    .line 1005
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 1006
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܳ()V

    .line 1007
    invoke-virtual {p2, v6}, Ll/֡ܶۚ;->ᩳ(Ljava/lang/String;)V

    .line 1008
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 1009
    :cond_5
    sget-object v6, Ll/ۨۚۚ;->֫֫:[Ljava/lang/String;

    invoke-static {v5, v6}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 1010
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܳ()V

    .line 1011
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 1012
    sget-object p1, Ll/᩺ۚۚ;->ۜ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    .line 1013
    :cond_6
    sget-object v6, Ll/ۨۚۚ;->ۤ:[Ljava/lang/String;

    invoke-static {v5, v6}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 1014
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܳ()V

    const-string v0, "tbody"

    .line 1015
    invoke-virtual {p2, v0}, Ll/֡ܶۚ;->ᩳ(Ljava/lang/String;)V

    .line 1016
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 1017
    :cond_7
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 1018
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1019
    invoke-virtual {p2, v5}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_1

    .line 1022
    :cond_8
    invoke-virtual {p2, v5}, Ll/ܿۚۚ;->ۘ(Ljava/lang/String;)V

    .line 1023
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩸()Z

    move-result v2

    if-nez v2, :cond_9

    .line 1025
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    return v1

    .line 1028
    :cond_9
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 1030
    :cond_a
    sget-object v4, Ll/ۨۚۚ;->ۧ֫:[Ljava/lang/String;

    invoke-static {v5, v4}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 1031
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    :cond_b
    const-string v4, "input"

    .line 1032
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 1033
    invoke-virtual {v0}, Ll/ۡ֨ۚ;->ۢ()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, v0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    const-string v3, "type"

    invoke-virtual {v2, v3}, Ll/ܺ֡ۚ;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "hidden"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    .line 1036
    :cond_c
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    return v1

    .line 1034
    :cond_d
    :goto_0
    invoke-virtual {p0, p1, p2}, Ll/ۛۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    :cond_e
    const-string v4, "form"

    .line 1038
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 1039
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1040
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۢ()Ll/۫֡ۚ;

    move-result-object p1

    if-nez p1, :cond_10

    invoke-virtual {p2, v3}, Ll/ܿۚۚ;->ۖ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_f

    goto :goto_1

    .line 1043
    :cond_f
    invoke-virtual {p2, v0, v2, v2}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;ZZ)V

    return v1

    :cond_10
    :goto_1
    return v2

    .line 1046
    :cond_11
    invoke-virtual {p0, p1, p2}, Ll/ۛۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1049
    :cond_12
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 466
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1053
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 1054
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_13

    .line 1055
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 1058
    :cond_13
    invoke-virtual {p2, v4}, Ll/ܿۚۚ;->ۘ(Ljava/lang/String;)V

    .line 1059
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩸()Z

    return v1

    .line 1061
    :cond_14
    sget-object v4, Ll/ۨۚۚ;->᩺:[Ljava/lang/String;

    invoke-static {v0, v4}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    .line 1062
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 1064
    :cond_15
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1065
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    return v1

    .line 1067
    :cond_16
    invoke-virtual {p0, p1, p2}, Ll/ۛۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1070
    :cond_17
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_19

    const-string p1, "html"

    .line 1071
    invoke-virtual {p2, p1}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 1072
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    :cond_18
    return v1

    .line 1075
    :cond_19
    invoke-virtual {p0, p1, p2}, Ll/ۛۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1
.end method

.method public ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 2

    .line 1079
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    const/4 v0, 0x1

    .line 1080
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Z)V

    .line 1081
    sget-object v1, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    const/4 p1, 0x0

    .line 1082
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Z)V

    return v0
.end method
