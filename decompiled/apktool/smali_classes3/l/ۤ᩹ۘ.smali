.class public final Ll/ۤ᩹ۘ;
.super Ljava/lang/Object;
.source "QABT"


# instance fields
.field public ֫:Ll/ܿ۟᩵;

.field public final ۧ:Ljava/lang/String;

.field public volatile ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 149
    invoke-static {}, Lorg/simpleframework/xml/stream/MyPullProvider;->inject()V

    return-void
.end method

.method public constructor <init>(Ll/ܿ۟᩵;Ljava/lang/String;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Ll/ۤ᩹ۘ;->֫:Ll/ܿ۟᩵;

    .line 171
    invoke-static {p2}, Ll/ۤ᩹ۘ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method private ֫(Ll/ۡ۟᩵;Ll/ۧ᩶ۘ;)Ljava/lang/Object;
    .locals 3

    .line 893
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    .line 1113
    iget-boolean v1, v0, Ll/۬᩹ۘ;->ᩳ:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    const/16 v2, 0x193

    if-ne v1, v2, :cond_0

    .line 895
    iget-object v0, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 1256
    :try_start_0
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    .line 231
    iput-object v0, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    .line 897
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    .line 899
    :cond_0
    invoke-direct {p0, v0}, Ll/ۤ᩹ۘ;->֫(Ll/۬᩹ۘ;)V

    .line 900
    iget-object p1, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    invoke-interface {p2, p1}, Ll/ۧ᩶ۘ;->֫(Ll/ᩴ۟᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1146
    invoke-static {p1, p0}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 1149
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 1150
    invoke-virtual {p2, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    return-object v1

    .line 1153
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr p1, p0

    const/4 p0, 0x0

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۤ᩹ۘ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;
    .locals 14

    .line 1009
    iget-object v0, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "If"

    const-string v4, "DESTINATION"

    if-eqz v0, :cond_d

    iget-object v0, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 1012
    :cond_0
    iget-object v0, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    .line 1013
    invoke-virtual {p1}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1014
    iget-object v6, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-static {v5, v6, v0}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1015
    invoke-virtual {p1, v4}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-static {v7, v8, v0}, Ll/ۤ᩹ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1016
    invoke-virtual {p1, v3}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-static {v8, v9, v0}, Ll/ۤ᩹ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1017
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 1018
    invoke-virtual {p1, v4}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v7, :cond_2

    if-nez v8, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    goto :goto_0

    .line 1248
    :cond_2
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    :goto_0
    if-eqz v8, :cond_5

    .line 1019
    invoke-virtual {p1, v3}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v0, :cond_4

    if-nez v8, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    goto :goto_1

    .line 1248
    :cond_4
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    :goto_1
    if-eqz v8, :cond_5

    .line 1020
    new-instance v0, Ll/ۗ᩹ۘ;

    invoke-direct {v0, p1, v2}, Ll/ۗ᩹ۘ;-><init>(Ll/ۡ۟᩵;Z)V

    goto :goto_5

    .line 1022
    :cond_5
    invoke-virtual {p1}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v8

    .line 1023
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 1024
    invoke-virtual {v8, v6}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 1026
    :cond_6
    invoke-virtual {p1, v4}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v7, :cond_8

    if-nez v5, :cond_7

    const/4 v5, 0x1

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    goto :goto_2

    .line 1248
    :cond_8
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-nez v5, :cond_9

    if-eqz v7, :cond_9

    .line 1027
    invoke-virtual {v8, v4, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1029
    :cond_9
    invoke-virtual {p1, v3}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v0, :cond_b

    if-nez v5, :cond_a

    const/4 v5, 0x1

    goto :goto_3

    :cond_a
    const/4 v5, 0x0

    goto :goto_3

    .line 1248
    :cond_b
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    :goto_3
    if-nez v5, :cond_c

    if-eqz v0, :cond_c

    .line 1030
    invoke-virtual {v8, v3, v0}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1032
    :cond_c
    new-instance v0, Ll/ۗ᩹ۘ;

    invoke-virtual {v8}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v5

    invoke-direct {v0, v5, v1}, Ll/ۗ᩹ۘ;-><init>(Ll/ۡ۟᩵;Z)V

    goto :goto_5

    .line 1010
    :cond_d
    :goto_4
    new-instance v0, Ll/ۗ᩹ۘ;

    invoke-direct {v0, p1, v2}, Ll/ۗ᩹ۘ;-><init>(Ll/ۡ۟᩵;Z)V

    .line 964
    :goto_5
    iget-object v5, v0, Ll/ۗ᩹ۘ;->֫:Ll/ۡ۟᩵;

    .line 965
    invoke-virtual {v5}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1132
    iget-object v7, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    const/4 v8, 0x0

    if-eqz v7, :cond_e

    iget-object v7, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    invoke-static {v6, v7}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 1133
    iget-object v6, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    goto :goto_6

    .line 1135
    :cond_e
    iget-object v7, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    if-eqz v7, :cond_f

    invoke-static {v6, v7}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 1136
    iget-object v6, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    goto :goto_6

    :cond_f
    move-object v6, v8

    .line 966
    :goto_6
    iget-object v7, p0, Ll/ۤ᩹ۘ;->֫:Ll/ܿ۟᩵;

    invoke-virtual {v7, v5}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v5

    invoke-interface {v5}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v5

    const/4 v7, 0x0

    .line 971
    :goto_7
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v9

    const/16 v10, 0x133

    if-ne v9, v10, :cond_10

    const/4 v2, 0x1

    :cond_10
    const/16 v9, 0x12e

    .line 977
    invoke-static {v5, v9}, Ll/ۤ᩹ۘ;->֫(Ll/ᩴ۟᩵;I)Z

    move-result v9

    or-int/2addr v2, v9

    const/16 v9, 0x12f

    .line 978
    invoke-static {v5, v9}, Ll/ۤ᩹ۘ;->֫(Ll/ᩴ۟᩵;I)Z

    move-result v9

    or-int/2addr v2, v9

    .line 979
    invoke-static {v5, v10}, Ll/ۤ᩹ۘ;->֫(Ll/ᩴ۟᩵;I)Z

    move-result v9

    or-int/2addr v2, v9

    .line 981
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v6, :cond_11

    .line 1103
    invoke-static {v9, v6}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_8

    .line 1132
    :cond_11
    iget-object v6, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    if-eqz v6, :cond_12

    iget-object v6, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    invoke-static {v9, v6}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 1133
    iget-object v6, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    goto :goto_8

    .line 1135
    :cond_12
    iget-object v6, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    if-eqz v6, :cond_13

    invoke-static {v9, v6}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 1136
    iget-object v6, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    goto :goto_8

    :cond_13
    move-object v6, v8

    .line 1040
    :goto_8
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v11

    if-eq v11, v10, :cond_14

    const/16 v10, 0x134

    if-ne v11, v10, :cond_16

    :cond_14
    const-string v10, "Location"

    .line 1043
    invoke-virtual {v5, v10}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_15

    goto :goto_9

    .line 1047
    :cond_15
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v11

    invoke-virtual {v11, v10}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;)Ll/ۨܰ᩵;

    move-result-object v10

    if-nez v10, :cond_17

    :cond_16
    :goto_9
    move-object v10, v8

    goto :goto_a

    .line 1051
    :cond_17
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v11

    .line 1052
    invoke-virtual {v11}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v12

    .line 1053
    invoke-virtual {v12, v10}, Ll/ۢ۟᩵;->֫(Ll/ۨܰ᩵;)V

    if-eqz v6, :cond_19

    .line 1055
    invoke-virtual {v11}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v13

    invoke-virtual {v13}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v13

    .line 1056
    invoke-virtual {v10}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v6, v13, v10}, Ll/ۤ᩹ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1066
    invoke-virtual {v11, v4}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v6, v10}, Ll/ۤ᩹ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_18

    .line 1068
    invoke-virtual {v12, v4, v13}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1070
    :cond_18
    invoke-virtual {v11, v3}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6, v10}, Ll/ۤ᩹ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_19

    .line 1072
    invoke-virtual {v12, v3, v10}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1059
    :cond_19
    invoke-virtual {v12}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v10

    :goto_a
    if-nez v10, :cond_1c

    .line 985
    new-instance v1, Ll/۬᩹ۘ;

    iget-boolean v0, v0, Ll/ۗ᩹ۘ;->ۧ:Z

    .line 991
    invoke-virtual {p1}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1121
    iget-object v4, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    if-eqz v4, :cond_1b

    invoke-static {p1, v4}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1a

    goto :goto_b

    .line 1124
    :cond_1a
    invoke-static {v4, p1, v3}, Ll/ۤ᩹ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 991
    :cond_1b
    :goto_b
    invoke-direct {v1, v5, v0, v2, v8}, Ll/۬᩹ۘ;-><init>(Ll/ᩴ۟᩵;ZZLjava/lang/String;)V

    return-object v1

    :cond_1c
    if-nez v6, :cond_1d

    move-object v6, v8

    goto :goto_c

    .line 996
    :cond_1d
    invoke-virtual {v10}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v6, v9, v11}, Ll/ۤ᩹ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 997
    :goto_c
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->close()V

    add-int/2addr v7, v1

    const/16 v5, 0x14

    if-gt v7, v5, :cond_1e

    .line 1001
    iget-object v5, p0, Ll/ۤ᩹ۘ;->֫:Ll/ܿ۟᩵;

    invoke-virtual {v5, v10}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v5

    invoke-interface {v5}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v5

    goto/16 :goto_7

    .line 999
    :cond_1e
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Too many follow-up requests: "

    .line 0
    invoke-static {v7, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 999
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/۬᩹ۘ;)V
    .locals 1

    .line 1080
    iget-object v0, p1, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Ll/۬᩹ۘ;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1083
    :cond_0
    iget-object p1, p1, Ll/۬᩹ۘ;->֫:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 1084
    iput-object p1, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ᩴ۟᩵;I)Z
    .locals 1

    .line 1236
    :cond_0
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩴ()Ll/ᩴ۟᩵;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 1237
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p2, :cond_1

    .line 1160
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, p1}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 1163
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 1208
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 1211
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    return v3

    .line 1214
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 p1, 0x2f

    if-eq p0, p1, :cond_3

    const/16 p1, 0x3f

    if-eq p0, p1, :cond_3

    const/16 p1, 0x23

    if-ne p0, p1, :cond_2

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v3

    :cond_4
    :goto_1
    return v0
.end method

.method public static ܳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_3

    .line 1182
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1198
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/ۨܰ᩵;->ܽ(Ljava/lang/String;)Ll/ۨܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    const-string v0, "/"

    .line 1186
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 1189
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    if-eqz p2, :cond_1

    .line 1171
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1174
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public final ֫(JLjava/lang/String;)Ljava/io/InputStream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 390
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 395
    invoke-static {}, Ll/ۤܰ᩵;->ܽ()Ll/ۤܰ᩵;

    move-result-object p1

    .line 399
    new-instance p2, Ll/ۢ۟᩵;

    invoke-direct {p2}, Ll/ۢ۟᩵;-><init>()V

    .line 400
    invoke-virtual {p2, p3}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 401
    invoke-virtual {p2}, Ll/ۢ۟᩵;->ۧ()V

    .line 402
    invoke-virtual {p2, p1}, Ll/ۢ۟᩵;->֫(Ll/ۤܰ᩵;)V

    .line 403
    invoke-virtual {p2}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    .line 405
    new-instance p2, Ll/ܰ᩹ۘ;

    .line 17
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 405
    invoke-direct {p0, p1, p2}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;Ll/ۧ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/InputStream;

    return-object p1

    .line 412
    :cond_0
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    .line 413
    invoke-virtual {v0, p3}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 414
    invoke-virtual {v0}, Ll/ۢ۟᩵;->ۧ()V

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "bytes="

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Range"

    filled-new-array {p2, p1}, [Ljava/lang/String;

    move-result-object p1

    .line 415
    invoke-static {p1}, Ll/ۤܰ᩵;->֫([Ljava/lang/String;)Ll/ۤܰ᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->֫(Ll/ۤܰ᩵;)V

    .line 416
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    .line 417
    new-instance p2, Ll/᩸᩹ۘ;

    .line 17
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 417
    invoke-direct {p0, p1, p2}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;Ll/ۧ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/InputStream;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/io/OutputStream;
    .locals 10

    .line 907
    iget-object v0, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 908
    new-instance v0, Ll/۫᩹ۘ;

    invoke-direct {v0, p1, v1}, Ll/۫᩹ۘ;-><init>(Ljava/lang/String;Z)V

    move-object v8, v0

    goto/16 :goto_4

    .line 910
    :cond_0
    iget-object v0, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    .line 912
    iget-object v4, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-static {p1, v4, v0}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 913
    new-instance v4, Ll/۫᩹ۘ;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-direct {v4, v0, p1}, Ll/۫᩹ۘ;-><init>(Ljava/lang/String;Z)V

    move-object v8, v4

    goto/16 :goto_4

    .line 928
    :cond_1
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 929
    invoke-virtual {v0, v4}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string v4, "HEAD"

    .line 228
    invoke-virtual {v0, v4, v2}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 931
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 928
    invoke-direct {p0, v0}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    iget-object v4, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 933
    :try_start_0
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 934
    invoke-direct {p0, v0}, Ll/ۤ᩹ۘ;->֫(Ll/۬᩹ۘ;)V

    .line 1092
    iget-object v0, v0, Ll/۬᩹ۘ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_3

    move-object v5, v0

    goto :goto_0

    .line 937
    :cond_2
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v7, 0x195

    if-eq v0, v7, :cond_4

    const/16 v7, 0x1f5

    if-ne v0, v7, :cond_3

    goto :goto_1

    .line 1256
    :cond_3
    :goto_0
    :try_start_1
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    nop

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 944
    :catch_1
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 945
    invoke-virtual {v0, v4}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 946
    invoke-virtual {v0}, Ll/ۢ۟᩵;->ۧ()V

    .line 947
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 944
    invoke-direct {p0, v0}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    iget-object v4, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 949
    :try_start_3
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 950
    invoke-direct {p0, v0}, Ll/ۤ᩹ۘ;->֫(Ll/۬᩹ۘ;)V

    .line 1092
    iget-object v0, v0, Ll/۬᩹ۘ;->֫:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_3

    move-object v5, v0

    goto :goto_0

    .line 916
    :goto_2
    iget-object v0, p0, Ll/ۤ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-static {p1, v0, v5}, Ll/ۤ᩹ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 918
    iget-object v4, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    if-eqz v4, :cond_5

    iget-object v4, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    .line 919
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 920
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    .line 921
    :goto_3
    new-instance p1, Ll/۫᩹ۘ;

    invoke-direct {p1, v0, v3}, Ll/۫᩹ۘ;-><init>(Ljava/lang/String;Z)V

    move-object v8, p1

    .line 106
    :goto_4
    :try_start_4
    invoke-static {p2}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    .line 489
    :catch_2
    new-instance p1, Ll/֡۬ۡ;

    invoke-direct {p1, p3, p4, v2}, Ll/֡۬ۡ;-><init>(JLl/ܰܰ᩵;)V

    .line 490
    invoke-virtual {p1}, Ll/֡۬ۡ;->ۢ()Ll/ܶᩳ֡;

    move-result-object p2

    iget-object p3, p0, Ll/ۤ᩹ۘ;->֫:Ll/ܿ۟᩵;

    invoke-virtual {p3}, Ll/ܿ۟᩵;->᩹()I

    move-result p3

    int-to-long p3, p3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p3, p4}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    .line 491
    new-instance p2, Ll/ۢ۟᩵;

    invoke-direct {p2}, Ll/ۢ۟᩵;-><init>()V

    iget-object p3, v8, Ll/۫᩹ۘ;->֫:Ljava/lang/String;

    .line 492
    invoke-virtual {p2, p3}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string p3, "PUT"

    .line 244
    invoke-virtual {p2, p3, p1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 493
    new-instance p3, Ll/۫ܰ᩵;

    invoke-direct {p3}, Ll/۫ܰ᩵;-><init>()V

    .line 494
    invoke-virtual {p3}, Ll/۫ܰ᩵;->֫()Ll/ۤܰ᩵;

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/ۢ۟᩵;->֫(Ll/ۤܰ᩵;)V

    .line 495
    invoke-virtual {p2}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p2

    .line 496
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 497
    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 498
    iget-object v0, p0, Ll/ۤ᩹ۘ;->֫:Ll/ܿ۟᩵;

    invoke-virtual {v0, p2}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object p2

    new-instance v0, Ll/᩹᩹ۘ;

    move-object v4, v0

    move-object v5, p0

    move-object v6, p3

    move-object v7, p1

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, Ll/᩹᩹ۘ;-><init>(Ll/ۤ᩹ۘ;Ljava/util/concurrent/atomic/AtomicReference;Ll/֡۬ۡ;Ll/۫᩹ۘ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {p2, v0}, Ll/ܽܰ᩵;->֫(Ll/ᩳܰ᩵;)V

    .line 532
    new-instance p2, Ll/᩶᩹ۘ;

    invoke-virtual {p1}, Ll/֡۬ۡ;->ܳܽ()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {p2, v0, p1, p4, p3}, Ll/᩶᩹ۘ;-><init>(Ljava/io/OutputStream;Ll/֡۬ۡ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V

    return-object p2

    :catchall_0
    move-exception p1

    .line 1256
    :try_start_5
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 956
    :catch_3
    throw p1

    :catchall_1
    move-exception p1

    .line 1256
    :try_start_6
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 942
    :catch_4
    throw p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 231
    iput-object v0, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    .line 610
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    .line 611
    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string p1, "MKCOL"

    const/4 v1, 0x0

    .line 612
    invoke-virtual {v0, p1, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 613
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    .line 893
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    .line 1113
    iget-boolean v2, v0, Ll/۬᩹ۘ;->ᩳ:Z

    if-eqz v2, :cond_0

    iget-object v2, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    invoke-virtual {v2}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    const/16 v3, 0x193

    if-ne v2, v3, :cond_0

    .line 895
    iget-object v0, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 1256
    :try_start_0
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    :catch_0
    iput-object v1, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    .line 897
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    .line 899
    :cond_0
    invoke-direct {p0, v0}, Ll/ۤ᩹ۘ;->֫(Ll/۬᩹ۘ;)V

    .line 900
    iget-object p1, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 19
    invoke-static {p1}, Ll/ᩳ᩶ۘ;->֫(Ll/ᩴ۟᩵;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1198
    :try_start_0
    invoke-static {p2}, Ll/ۨܰ᩵;->ܽ(Ljava/lang/String;)Ll/ۨܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 631
    :goto_0
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    .line 632
    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string p1, "MOVE"

    const/4 v1, 0x0

    .line 633
    invoke-virtual {v0, p1, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 635
    new-instance p1, Ll/۫ܰ᩵;

    invoke-direct {p1}, Ll/۫ܰ᩵;-><init>()V

    const-string v2, "DESTINATION"

    .line 636
    invoke-virtual {p1, v2, p2}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "OVERWRITE"

    const-string v2, "T"

    .line 637
    invoke-virtual {p1, p2, v2}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 642
    invoke-virtual {p1}, Ll/۫ܰ᩵;->֫()Ll/ۤܰ᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->֫(Ll/ۤܰ᩵;)V

    .line 643
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    .line 893
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object p2

    .line 1113
    iget-boolean v0, p2, Ll/۬᩹ۘ;->ᩳ:Z

    if-eqz v0, :cond_0

    iget-object v0, p2, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v2, 0x193

    if-ne v0, v2, :cond_0

    .line 895
    iget-object p2, p2, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 1256
    :try_start_1
    invoke-virtual {p2}, Ll/ᩴ۟᩵;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 231
    :catch_1
    iput-object v1, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    .line 897
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object p2

    .line 899
    :cond_0
    invoke-direct {p0, p2}, Ll/ۤ᩹ۘ;->֫(Ll/۬᩹ۘ;)V

    .line 900
    iget-object p1, p2, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 19
    invoke-static {p1}, Ll/ᩳ᩶ۘ;->֫(Ll/ᩴ۟᩵;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 179
    iget-object v0, p0, Ll/ۤ᩹ۘ;->֫:Ll/ܿ۟᩵;

    invoke-virtual {v0}, Ll/ܿ۟᩵;->ۖ()Ll/ᩳ۟᩵;

    move-result-object v0

    new-instance v1, Ll/ܶ᩹ۘ;

    invoke-direct {v1, p1, p2}, Ll/ܶ᩹ۘ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    invoke-virtual {v0, v1}, Ll/ᩳ۟᩵;->֫(Ll/۬᩺᩵;)V

    if-eqz p3, :cond_0

    .line 182
    new-instance p3, Ll/ۙ᩹ۘ;

    invoke-direct {p3, p1, p2}, Ll/ۙ᩹ۘ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ll/ᩳ۟᩵;->֫(Ll/᩺ܰ᩵;)V

    .line 184
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩹ۘ;->֫:Ll/ܿ۟᩵;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 3

    .line 601
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    .line 602
    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 240
    sget-object p1, Ll/᩶۟᩵;->ۧ:Ll/ۖ۟᩵;

    const-string v1, "DELETE"

    .line 236
    invoke-virtual {v0, v1, p1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 604
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    .line 893
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    .line 1113
    iget-boolean v1, v0, Ll/۬᩹ۘ;->ᩳ:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    const/16 v2, 0x193

    if-ne v1, v2, :cond_0

    .line 895
    iget-object v0, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 1256
    :try_start_0
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    .line 231
    iput-object v0, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    .line 897
    invoke-direct {p0, p1}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;)Ll/۬᩹ۘ;

    move-result-object v0

    .line 899
    :cond_0
    invoke-direct {p0, v0}, Ll/ۤ᩹ۘ;->֫(Ll/۬᩹ۘ;)V

    .line 900
    iget-object p1, v0, Ll/۬᩹ۘ;->ۧ:Ll/ᩴ۟᩵;

    .line 19
    invoke-static {p1}, Ll/ᩳ᩶ۘ;->֫(Ll/ᩴ۟᩵;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 2

    .line 669
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    .line 670
    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string p1, "HEAD"

    const/4 v1, 0x0

    .line 671
    invoke-virtual {v0, p1, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 672
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    .line 674
    new-instance v0, Ll/᩺᩹ۘ;

    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 674
    invoke-direct {p0, p1, v0}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;Ll/ۧ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 224
    invoke-static {p1}, Ll/ۤ᩹ۘ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩹ۘ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 268
    new-instance v0, Lcom/thegrizzlylabs/sardineandroid/model/Propfind;

    invoke-direct {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propfind;-><init>()V

    .line 269
    new-instance v1, Lcom/thegrizzlylabs/sardineandroid/model/Allprop;

    invoke-direct {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Allprop;-><init>()V

    invoke-virtual {v0, v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propfind;->setAllprop(Lcom/thegrizzlylabs/sardineandroid/model/Allprop;)V

    const-string v1, "text/xml"

    .line 106
    :try_start_0
    invoke-static {v1}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    .line 294
    :goto_0
    invoke-static {v0}, Ll/ܳ᩶ۘ;->֫(Lcom/thegrizzlylabs/sardineandroid/model/Propfind;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۖ۟᩵;->֫(Ll/ܰܰ᩵;Ljava/lang/String;)Ll/ۖ۟᩵;

    move-result-object v0

    .line 295
    new-instance v1, Ll/ۢ۟᩵;

    invoke-direct {v1}, Ll/ۢ۟᩵;-><init>()V

    .line 296
    invoke-virtual {v1, p1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string p1, "Depth"

    const/4 v2, 0x1

    .line 297
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "PROPFIND"

    .line 298
    invoke-virtual {v1, p1, v0}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 299
    invoke-virtual {v1}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    .line 301
    new-instance v0, Ll/֫᩶ۘ;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 301
    invoke-direct {p0, p1, v0}, Ll/ۤ᩹ۘ;->֫(Ll/ۡ۟᩵;Ll/ۧ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
