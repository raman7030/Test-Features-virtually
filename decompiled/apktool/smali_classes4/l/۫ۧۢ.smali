.class public final Ll/۫ۧۢ;
.super Ll/ܶ۬᩷;
.source "P67V"


# static fields
.field public static final ۙ:I

.field public static final ᩶:[I


# instance fields
.field public ֡:Landroid/os/Bundle;

.field public final ֨:Ljava/util/ArrayList;

.field public ۖ:J

.field public ۘ:Z

.field public final ۚ:Ljava/util/HashMap;

.field public final ۜ:Ll/ۧ۫᩷;

.field public final ۠:Ll/ۚۡ֫;

.field public final ۡ:Ll/ۧۤᩴ;

.field public final ۢ:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:Ljava/util/Map;

.field public final ܶ:Ljava/util/HashMap;

.field public final ܺ:Ll/ۚۡ֫;

.field public ܽ:Z

.field public final ܿ:Ljava/util/Map;

.field public final ᩳ:Ljava/util/HashMap;

.field public ᩴ:Ljava/util/Set;

.field public final ᩵:Ll/ۚۡ֫;

.field public final ᩷:Ljava/util/HashMap;

.field public final ᩸:Ljava/util/HashMap;

.field public final ᩹:Ll/֡ᩳۢ;

.field public final ᩻:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 110
    fill-array-data v0, :array_0

    sput-object v0, Ll/۫ۧۢ;->᩶:[I

    .line 643
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v0

    sput v0, Ll/۫ۧۢ;->ۙ:I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x23
        0x25
        0x26
        0x27
        0x28
        0x29
    .end array-data
.end method

.method public constructor <init>(Ll/ۧ۫᩷;)V
    .locals 14

    .line 165
    invoke-direct {p0, p1}, Ll/ܶ۬᩷;-><init>(Ll/ۧ۫᩷;)V

    .line 114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->ۧ:Ljava/util/ArrayList;

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    .line 116
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    .line 117
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->ܶ:Ljava/util/HashMap;

    .line 118
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->᩸:Ljava/util/HashMap;

    .line 119
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/۫ۧۢ;->ܳ:Ljava/util/Map;

    .line 120
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/۫ۧۢ;->ܿ:Ljava/util/Map;

    .line 126
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->ۚ:Ljava/util/HashMap;

    .line 138
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->᩷:Ljava/util/HashMap;

    .line 140
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->᩻:Ll/ۧۤᩴ;

    .line 141
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->ۡ:Ll/ۧۤᩴ;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    .line 144
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object v0, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    const/4 v0, 0x1

    .line 151
    iput-boolean v0, p0, Ll/۫ۧۢ;->ܽ:Z

    .line 156
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    .line 157
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->۠:Ll/ۚۡ֫;

    .line 158
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->᩵:Ll/ۚۡ֫;

    .line 166
    new-instance v0, Ll/ۧ۫᩷;

    const-string v1, "dex"

    invoke-direct {v0, p1, v1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object v0, p0, Ll/۫ۧۢ;->ۜ:Ll/ۧ۫᩷;

    .line 167
    invoke-virtual {v0}, Ll/ۧ۫᩷;->ۧ()Z

    move-result p1

    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    .line 168
    new-instance p1, Ll/֡ᩳۢ;

    invoke-direct {p1, p0}, Ll/֡ᩳۢ;-><init>(Ll/۫ۧۢ;)V

    iput-object p1, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    .line 169
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۘ()Ll/ۧ۫᩷;

    move-result-object p1

    .line 170
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۢ()[Ll/ۧ۫᩷;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 174
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 175
    new-instance v2, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v3

    const-string v4, "exclude_dex"

    invoke-direct {v2, v3, v4}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 176
    invoke-virtual {v2}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 168
    invoke-virtual {v2}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\n"

    .line 177
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    .line 178
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    .line 179
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1613
    :cond_1
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v2

    const-string v3, "removed"

    invoke-virtual {v2, v3}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 1614
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-nez v3, :cond_2

    .line 1615
    sget-object v2, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_2

    .line 1617
    :cond_2
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܳۧ()Ljava/io/BufferedReader;

    move-result-object v2

    .line 1618
    :try_start_0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 1620
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 1621
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto :goto_1

    .line 1624
    :cond_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    move-object v2, v3

    .line 184
    :goto_2
    array-length v3, v0

    const/4 v5, 0x0

    :goto_3
    const-wide/16 v6, 0x0

    if-ge v5, v3, :cond_8

    aget-object v8, v0, v5

    .line 76
    invoke-virtual {v8}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 185
    invoke-virtual {v8}, Ll/ۧ۫᩷;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "_list"

    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 186
    invoke-virtual {v8}, Ll/ۧ۫᩷;->getName()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x5

    .line 0
    invoke-static {v10, v4, v9}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 188
    iget-object v10, p0, Ll/۫ۧۢ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_6

    .line 192
    :cond_4
    iget-object v10, p0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    new-instance v10, Ll/ۧ۫᩷;

    invoke-direct {v10, p1, v9}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 194
    new-instance v11, Ll/۬ۜܽ;

    invoke-virtual {v8}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object v8

    invoke-direct {v11, v8}, Ll/۬ۜܽ;-><init>([B)V

    .line 195
    :goto_4
    invoke-virtual {v11}, Ll/۬ۜܽ;->available()J

    move-result-wide v12

    cmp-long v8, v12, v6

    if-lez v8, :cond_7

    .line 196
    new-instance v8, Ll/ᩳۧۢ;

    invoke-virtual {v11}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v8, v12}, Ll/ᩳۧۢ;-><init>(Ljava/lang/String;)V

    .line 197
    iput-object v9, v8, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    .line 198
    iput-object v10, v8, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    .line 199
    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v12

    iput v12, v8, Ll/ᩳۧۢ;->֫:I

    const/high16 v13, -0x80000000

    and-int/2addr v13, v12

    if-eqz v13, :cond_5

    const v13, 0x7fffffff

    and-int/2addr v12, v13

    .line 201
    iput v12, v8, Ll/ᩳۧۢ;->֫:I

    .line 202
    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v12

    iput v12, v8, Ll/ᩳۧۢ;->ᩳ:I

    goto :goto_5

    .line 204
    :cond_5
    iput v4, v8, Ll/ᩳۧۢ;->ᩳ:I

    .line 206
    :goto_5
    iget-object v12, v8, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    .line 207
    iget-object v13, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v13, v12, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 209
    :cond_6
    iget-object v13, p0, Ll/۫ۧۢ;->ܶ:Ljava/util/HashMap;

    invoke-virtual {v13, v12, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    .line 214
    :cond_8
    iget-object p1, p0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/ᩴۧۢ;->֫(Ljava/util/ArrayList;)V

    .line 215
    iget-object p1, p0, Ll/۫ۧۢ;->ۧ:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/ᩴۧۢ;->֫(Ljava/util/ArrayList;)V

    .line 216
    invoke-virtual {p0}, Ll/۫ۧۢ;->᩶()V

    .line 1632
    iget-object p1, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "recent"

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1633
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_8

    .line 1636
    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 1637
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܳۧ()Ljava/io/BufferedReader;

    move-result-object v0

    .line 1639
    :cond_a
    :goto_7
    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 1640
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    .line 1641
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    .line 1644
    :cond_b
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 1645
    invoke-direct {p0}, Ll/۫ۧۢ;->ۗ()V

    .line 1286
    :goto_8
    new-instance p1, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "map"

    invoke-direct {p1, v0, v1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1287
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_a

    .line 1290
    :cond_c
    new-instance v0, Ll/۬ۜܽ;

    invoke-virtual {p1}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    .line 1291
    :goto_9
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    cmp-long p1, v1, v6

    if-lez p1, :cond_d

    .line 1292
    iget-object p1, p0, Ll/۫ۧۢ;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 1178
    :cond_d
    :goto_a
    new-instance p1, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "rename_map"

    invoke-direct {p1, v0, v1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1179
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_c

    .line 1182
    :cond_e
    new-instance v0, Ll/۬ۜܽ;

    invoke-virtual {p1}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    .line 1183
    :goto_b
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    cmp-long p1, v1, v6

    if-lez p1, :cond_f

    .line 1184
    iget-object p1, p0, Ll/۫ۧۢ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    .line 1249
    :cond_f
    :goto_c
    new-instance p1, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "dex_name_map"

    invoke-direct {p1, v0, v1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1250
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_e

    .line 1253
    :cond_10
    new-instance v0, Ll/۬ۜܽ;

    invoke-virtual {p1}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    .line 1254
    :goto_d
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    cmp-long p1, v1, v6

    if-lez p1, :cond_11

    .line 1255
    iget-object p1, p0, Ll/۫ۧۢ;->᩷:Ljava/util/HashMap;

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :cond_11
    :goto_e
    return-void

    :catchall_0
    move-exception p1

    .line 1637
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_f

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw p1

    :catchall_2
    move-exception p1

    .line 1617
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_10

    :catchall_3
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw p1

    .line 172
    :cond_12
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "List files fail in: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۧ۫᩷;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֡(Ljava/lang/String;)Ll/ۧ۫᩷;
    .locals 4

    .line 652
    new-instance v0, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/ܶ۬᩷;->֫()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v2, "dexBuild/"

    const-string v3, ".dex"

    .line 0
    invoke-static {v2, p1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 652
    invoke-direct {v0, v1, p1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/۫ۧۢ;)Ll/ۚۡ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    return-object p0
.end method

.method public static ֫(Ll/ۧ۫᩷;)Ll/۠ۛ֡;
    .locals 3

    .line 715
    invoke-virtual {p0}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object p0

    .line 716
    new-instance v0, Ll/۬ۛ֡;

    sget v1, Ll/۫ۧۢ;->ۙ:I

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Ll/۬ۛ֡;-><init>([BIZ)V

    .line 717
    invoke-virtual {v0}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ll/ᩴ۟֡;

    invoke-virtual {p0}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ۛ֡;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/۫ۧۢ;Ll/ۧ۫᩷;)Ll/ۧ۫᩷;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۫ۧۢ;->ۧ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/lang/String;Ll/ۧ۫᩷;Ll/ۧ۫᩷;)V
    .locals 4

    .line 680
    invoke-virtual {p2}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object p2

    .line 681
    invoke-virtual {p0, p1}, Ll/۫ۧۢ;->ۖ(Ljava/lang/String;)Ll/᩵ܺۚ;

    move-result-object p1

    .line 682
    iget v0, p1, Ll/᩵ܺۚ;->ۧ:I

    .line 672
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v1

    const/4 v2, 0x1

    .line 673
    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->update(B)V

    ushr-int/lit8 v2, v0, 0x8

    int-to-byte v2, v2

    .line 674
    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v0, v0

    .line 675
    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update(B)V

    .line 676
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    .line 683
    invoke-static {v0, p3}, Ll/۫ۧۢ;->֫([BLl/ۧ۫᩷;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 688
    :cond_0
    invoke-virtual {p1}, Ll/᩵ܺۚ;->֫()Ll/᩵ۡۚ;

    move-result-object v1

    .line 689
    new-instance v2, Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, p2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v2, v1, p1}, Ll/ۢܺۚ;->֫(Ljava/lang/String;Ll/᩵ۡۚ;Ll/᩵ܺۚ;)Ll/֡᩷ۚ;

    .line 690
    new-instance p1, Ll/᩸ۡۚ;

    invoke-direct {p1}, Ll/᩸ۡۚ;-><init>()V

    .line 691
    invoke-virtual {v1, p1}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V

    .line 692
    invoke-virtual {p3}, Ll/ۧ۫᩷;->ܿ()V

    .line 136
    invoke-virtual {p3}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p2

    const/4 p3, 0x0

    .line 446
    invoke-virtual {p2, p3}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p2

    .line 694
    :try_start_0
    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 695
    invoke-virtual {p1}, Ll/᩸ۡۚ;->֫()[B

    move-result-object v0

    invoke-virtual {p1}, Ll/᩸ۡۚ;->ᩳ()I

    move-result p1

    invoke-virtual {p2, v0, p3, p1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 696
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_1

    .line 693
    :try_start_1
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
.end method

.method public static ֫(Ll/ۘ֫ۚ;Ljava/util/Set;)V
    .locals 5

    .line 1130
    invoke-interface {p0}, Ll/ۘ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :pswitch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷֫ۚ;

    .line 1163
    invoke-interface {v1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "Ldalvik/annotation/Signature;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_1
    const-string v3, "Ldalvik/annotation/MemberClasses;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_2
    const-string v3, "Ldalvik/annotation/InnerClass;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 1132
    invoke-interface {v1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ֫ۚ;

    .line 1133
    invoke-interface {v2}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v2

    invoke-static {v2, p1}, Ll/۫ۧۢ;->֫(Ll/ۤܽۚ;Ljava/util/Set;)V

    goto :goto_1

    .line 1137
    :cond_4
    invoke-interface {p0}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 1139
    invoke-static {p0, p1}, Ll/۫ۧۢ;->֫(Ll/ۤܽۚ;Ljava/util/Set;)V

    :cond_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71f1656d -> :sswitch_2
        0x8ffe875 -> :sswitch_1
        0x63354869 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۡۛۡ;Ll/᩵ۛۡ;Ll/ܰ֫ۢ;Ljava/util/Set;)V
    .locals 4

    .line 1075
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 p0, 0x1

    .line 41
    invoke-virtual {p1, p0}, Ll/᩵ۛۡ;->֫(I)Z

    .line 1079
    invoke-interface {p2}, Ll/ܰ֫ۢ;->ܿ()Ll/۠ۛ֡;

    move-result-object p0

    .line 1089
    :try_start_0
    invoke-virtual {p0}, Ll/۠ۛ֡;->getAnnotations()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷֫ۚ;

    .line 1163
    invoke-interface {p2}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "Ldalvik/annotation/Signature;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "Ldalvik/annotation/MemberClasses;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "Ldalvik/annotation/InnerClass;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    const/4 v2, 0x1

    :pswitch_0
    if-eqz v2, :cond_1

    .line 1091
    :try_start_1
    invoke-interface {p2}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֫ۚ;

    .line 1092
    invoke-interface {v0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    invoke-static {v0, p3}, Ll/۫ۧۢ;->֫(Ll/ۤܽۚ;Ljava/util/Set;)V

    goto :goto_1

    .line 1097
    :cond_5
    invoke-virtual {p0}, Ll/۠ۛ֡;->getFields()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ֫ۚ;

    .line 1098
    invoke-static {p2, p3}, Ll/۫ۧۢ;->֫(Ll/ۘ֫ۚ;Ljava/util/Set;)V

    goto :goto_2

    .line 1101
    :cond_6
    invoke-virtual {p0}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴ֫ۚ;

    .line 1102
    invoke-static {p1, p3}, Ll/۫ۧۢ;->֫(Ll/ᩴ֫ۚ;Ljava/util/Set;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    :cond_7
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x71f1656d -> :sswitch_2
        0x8ffe875 -> :sswitch_1
        0x63354869 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۤܽۚ;Ljava/util/Set;)V
    .locals 2

    .line 1110
    invoke-interface {p0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    const/16 v1, 0x17

    if-eq v0, v1, :cond_3

    const/16 v1, 0x1c

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1d

    if-eq v0, v1, :cond_0

    goto :goto_2

    .line 1112
    :cond_0
    check-cast p0, Ll/᩹ܽۚ;

    .line 1113
    invoke-interface {p0}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֫ۚ;

    .line 1114
    invoke-interface {v0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/۫ۧۢ;->֫(Ll/ۤܽۚ;Ljava/util/Set;)V

    goto :goto_0

    .line 1118
    :cond_1
    check-cast p0, Ll/᩶ܽۚ;

    .line 1119
    invoke-interface {p0}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤܽۚ;

    .line 1120
    invoke-static {v0, p1}, Ll/۫ۧۢ;->֫(Ll/ۤܽۚ;Ljava/util/Set;)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void

    .line 1124
    :cond_3
    check-cast p0, Ll/ܿᩳۚ;

    invoke-interface {p0}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ֫(Ll/ۧ۫᩷;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 479
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۢ()[Ll/ۧ۫᩷;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_2

    .line 483
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v3, p1, v2

    .line 80
    invoke-virtual {v3}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 485
    invoke-virtual {v3}, Ll/ۧ۫᩷;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۡ۠ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "/"

    .line 0
    invoke-static {p2, v4, v5}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 486
    invoke-direct {p0, v3, v4, p3}, Ll/۫ۧۢ;->֫(Ll/ۧ۫᩷;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 488
    :cond_1
    invoke-virtual {v3}, Ll/ۧ۫᩷;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۡ۠ۘ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, ".smali"

    .line 489
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 490
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x6

    invoke-virtual {v4, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 491
    iget-object v5, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۧۢ;

    if-nez v6, :cond_2

    .line 493
    new-instance v6, Ll/ᩳۧۢ;

    invoke-direct {v6, v4}, Ll/ᩳۧۢ;-><init>(Ljava/lang/String;)V

    .line 494
    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    :cond_2
    iput-object p3, v6, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    .line 497
    iput-object v3, v6, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public static ֫(Ll/۫ۧۢ;Ljava/lang/String;Ll/۠ۛ֡;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1271
    invoke-virtual {p2}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/۫ۧۢ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ۧۢ;Ljava/lang/String;Ll/ۧ۫᩷;Ll/ۧ۫᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/۫ۧۢ;->֫(Ljava/lang/String;Ll/ۧ۫᩷;Ll/ۧ۫᩷;)V

    return-void
.end method

.method public static ֫(Ll/ᩴ֫ۚ;Ljava/util/Set;)V
    .locals 5

    .line 1143
    invoke-interface {p0}, Ll/ᩴ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :pswitch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷֫ۚ;

    .line 1163
    invoke-interface {v1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "Ldalvik/annotation/Signature;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_1
    const-string v3, "Ldalvik/annotation/MemberClasses;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_2
    const-string v3, "Ldalvik/annotation/InnerClass;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 1145
    invoke-interface {v1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ֫ۚ;

    .line 1146
    invoke-interface {v2}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v2

    invoke-static {v2, p1}, Ll/۫ۧۢ;->֫(Ll/ۤܽۚ;Ljava/util/Set;)V

    goto :goto_1

    .line 1150
    :cond_4
    invoke-interface {p0}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object p0

    if-eqz p0, :cond_7

    .line 1152
    invoke-interface {p0}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺֫ۚ;

    .line 1153
    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    .line 1154
    sget-object v2, Ll/ۘۗ֡;->ܰ:Ll/ۘۗ֡;

    if-eq v1, v2, :cond_6

    sget-object v2, Ll/ۘۗ֡;->ܺ֫:Ll/ۘۗ֡;

    if-ne v1, v2, :cond_5

    :cond_6
    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget v1, v1, Ll/֨ۗ֡;->۬:I

    if-nez v1, :cond_5

    .line 1155
    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    .line 1156
    check-cast v0, Ll/ܶܽۚ;

    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x71f1656d -> :sswitch_2
        0x8ffe875 -> :sswitch_1
        0x63354869 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۧ۫᩷;Ll/ۧ۫᩷;[B)Z
    .locals 3

    .line 1046
    invoke-virtual {p0}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1048
    :try_start_0
    new-instance v0, Ll/۬ۜܽ;

    invoke-virtual {p1}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    const p1, 0x73737312

    .line 1049
    invoke-static {v0, p1}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 1050
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1051
    new-instance p1, Ljava/io/DataInputStream;

    invoke-virtual {p0}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 p0, 0x18

    new-array p2, p0, [B

    const/16 v2, 0x8

    .line 1053
    invoke-virtual {p1, p2, v1, v2}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 1054
    invoke-virtual {p1, p2, v1, p0}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 1055
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object p0

    invoke-static {p0, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_0
    return v1
.end method

.method public static ֫([BLl/ۧ۫᩷;)Z
    .locals 5

    .line 700
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    .line 703
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 704
    :try_start_1
    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-byte v3, p0, v2

    .line 705
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    and-int/lit16 v3, v3, 0xff

    if-eq v4, v3, :cond_1

    .line 709
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_3
    return p0

    :catchall_0
    move-exception p0

    if-eqz p1, :cond_4

    .line 703
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :goto_2
    return v1
.end method

.method private ۗ()V
    .locals 3

    .line 1734
    iget-object v0, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0xf

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 1735
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۧۢ;->۠:Ll/ۚۡ֫;

    invoke-virtual {v1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method private ۙ()Z
    .locals 21

    move-object/from16 v0, p0

    .line 746
    iget-object v1, v0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ll/ᩳۧۢ;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ᩳۧۢ;

    .line 749
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v2, :cond_3

    aget-object v5, v1, v3

    .line 750
    iget-object v6, v5, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v6, :cond_2

    .line 752
    invoke-direct {v0, v6}, Ll/۫ۧۢ;->ۧ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v7

    .line 753
    iget-object v5, v5, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    .line 660
    invoke-virtual {v7}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v8

    if-nez v8, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    .line 663
    :cond_0
    invoke-virtual {v6}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object v6

    .line 664
    invoke-virtual {v0, v5}, Ll/۫ۧۢ;->ۖ(Ljava/lang/String;)Ll/᩵ܺۚ;

    move-result-object v5

    iget v5, v5, Ll/᩵ܺۚ;->ۧ:I

    .line 672
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v8

    .line 673
    invoke-virtual {v8, v4}, Ljava/security/MessageDigest;->update(B)V

    ushr-int/lit8 v4, v5, 0x8

    int-to-byte v4, v4

    .line 674
    invoke-virtual {v8, v4}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v4, v5

    .line 675
    invoke-virtual {v8, v4}, Ljava/security/MessageDigest;->update(B)V

    .line 676
    invoke-virtual {v8, v6}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    .line 665
    invoke-static {v4, v7}, Ll/۫ۧۢ;->֫([BLl/ۧ۫᩷;)Z

    move-result v4

    :goto_1
    if-nez v4, :cond_2

    :cond_1
    :goto_2
    const/4 v1, 0x1

    goto/16 :goto_c

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 979
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ll/۫ۧۢ;->֡()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "opt_dex_version"

    .line 980
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "opt_rm_source"

    .line 981
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    const-string v5, "opt_rm_line"

    .line 982
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "opt_rm_param"

    .line 983
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    const-string v7, "opt_rm_prologue"

    .line 984
    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v7

    const-string v8, "opt_rm_local"

    .line 985
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v8

    const-string v9, "opt_rm_api_mod"

    .line 986
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-nez v4, :cond_5

    if-nez v5, :cond_5

    if-nez v6, :cond_5

    if-nez v7, :cond_5

    if-nez v8, :cond_5

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const/4 v9, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v9, 0x1

    :goto_4
    if-nez v3, :cond_6

    if-nez v9, :cond_6

    const/4 v9, 0x1

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    .line 761
    :goto_5
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 762
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 763
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v12

    .line 764
    iget-object v13, v0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_f

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 765
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 766
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 767
    array-length v15, v1

    const/16 v16, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v15, :cond_a

    move/from16 v16, v15

    aget-object v15, v1, v13

    move-object/from16 v18, v1

    .line 768
    iget-object v1, v15, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 769
    iget-object v1, v15, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v1, :cond_7

    .line 770
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 771
    :cond_7
    iget-object v1, v15, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz v1, :cond_8

    .line 772
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 774
    :cond_8
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad class item: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v15, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    const/16 v4, 0x2f

    const/16 v5, 0x2e

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_8
    add-int/lit8 v13, v13, 0x1

    move/from16 v15, v16

    move-object/from16 v1, v18

    goto :goto_7

    :cond_a
    move-object/from16 v18, v1

    .line 777
    invoke-direct {v0, v14}, Ll/۫ۧۢ;->֡(Ljava/lang/String;)Ll/ۧ۫᩷;

    move-result-object v1

    .line 656
    new-instance v13, Ll/ۧ۫᩷;

    invoke-virtual/range {p0 .. p0}, Ll/ܶ۬᩷;->֫()Ll/ۧ۫᩷;

    move-result-object v15

    move/from16 v16, v2

    const-string v2, "dexBuild/"

    move/from16 v19, v8

    const-string v8, ".digest"

    .line 0
    invoke-static {v2, v14, v8}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 656
    invoke-direct {v13, v15, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    if-eqz v9, :cond_b

    .line 779
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 321
    invoke-virtual {v0, v14}, Ll/۫ۧۢ;->ܳ(Ljava/lang/String;)Ll/ܿۧۢ;

    move-result-object v2

    iget v2, v2, Ll/ܿۧۢ;->֫:I

    .line 780
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ne v2, v8, :cond_b

    move/from16 v8, v16

    move/from16 v2, v19

    goto/16 :goto_b

    .line 786
    :cond_b
    invoke-virtual {v1}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v13}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_2

    .line 789
    :cond_c
    sget-object v2, Ll/ᩳۧۢ;->ۜ:Ljava/util/Comparator;

    invoke-static {v10, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 790
    invoke-static {v11, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 791
    invoke-virtual {v12}, Ljava/security/MessageDigest;->reset()V

    int-to-byte v2, v3

    .line 992
    invoke-virtual {v12, v2}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v2, v4

    .line 993
    invoke-virtual {v12, v2}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v2, v5

    .line 994
    invoke-virtual {v12, v2}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v2, v6

    .line 995
    invoke-virtual {v12, v2}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v2, v7

    .line 996
    invoke-virtual {v12, v2}, Ljava/security/MessageDigest;->update(B)V

    move/from16 v2, v19

    int-to-byte v8, v2

    .line 997
    invoke-virtual {v12, v8}, Ljava/security/MessageDigest;->update(B)V

    move/from16 v8, v16

    int-to-byte v14, v8

    .line 998
    invoke-virtual {v12, v14}, Ljava/security/MessageDigest;->update(B)V

    const/16 v14, -0x7f

    .line 793
    invoke-virtual {v12, v14}, Ljava/security/MessageDigest;->update(B)V

    .line 794
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ᩳۧۢ;

    .line 795
    iget-object v15, v15, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-static {v12, v15}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    goto :goto_9

    :cond_d
    const/16 v14, -0x7e

    .line 797
    invoke-virtual {v12, v14}, Ljava/security/MessageDigest;->update(B)V

    .line 798
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ᩳۧۢ;

    .line 799
    iget-object v0, v15, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-static {v12, v0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 800
    iget-object v0, v15, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v12, v0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V

    move-object/from16 v0, p0

    goto :goto_a

    :cond_e
    const/16 v0, -0x7d

    .line 802
    invoke-virtual {v12, v0}, Ljava/security/MessageDigest;->update(B)V

    .line 803
    invoke-virtual {v12}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    .line 804
    invoke-static {v1, v13, v0}, Ll/۫ۧۢ;->֫(Ll/ۧ۫᩷;Ll/ۧ۫᩷;[B)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_b
    move-object/from16 v0, p0

    move-object/from16 v13, v17

    move-object/from16 v1, v18

    move/from16 v20, v8

    move v8, v2

    move/from16 v2, v20

    goto/16 :goto_6

    :goto_c
    return v1

    :cond_f
    const/4 v0, 0x0

    return v0
.end method

.method private ۤ()V
    .locals 5

    .line 1649
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "recent"

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1650
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 491
    new-instance v2, Ljava/io/BufferedWriter;

    .line 475
    new-instance v3, Ljava/io/OutputStreamWriter;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v3, v0, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 491
    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1651
    :try_start_1
    iget-object v0, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1652
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 1653
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->newLine()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1655
    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-void

    :catchall_0
    move-exception v0

    .line 1650
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    .line 1743
    iget-object v1, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    invoke-virtual {v1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method private ۧ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;
    .locals 4

    .line 647
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۧ۫᩷;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 228
    new-instance v1, Ll/ۧ۫᩷;

    iget-object v2, p0, Ll/۫ۧۢ;->ۜ:Ll/ۧ۫᩷;

    const-string v3, "smali"

    invoke-direct {v1, v2, v3}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 647
    invoke-virtual {v1}, Ll/ۧ۫᩷;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".bin"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 648
    new-instance v0, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/ܶ۬᩷;->֫()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v2, "dexBuild"

    .line 0
    invoke-static {v2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 648
    invoke-direct {v0, v1, p1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    return-object v0
.end method

.method private ۫()V
    .locals 5

    .line 1190
    new-instance v0, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v2, "rename_map"

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1191
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 1192
    iget-object v2, p0, Ll/۫ۧۢ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 1193
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v1, v4}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 1194
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1196
    :cond_0
    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    return-void
.end method

.method private ۬()V
    .locals 4

    .line 1298
    :try_start_0
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 1299
    iget-object v1, p0, Ll/۫ۧۢ;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1300
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 1301
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1303
    :cond_0
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v2, "map"

    invoke-virtual {v1, v2}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1305
    iget-object v1, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    invoke-virtual {v1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static ܽ(Ll/ۧ۫᩷;)Ll/۫ۧۢ;
    .locals 1

    .line 161
    new-instance v0, Ll/۫ۧۢ;

    invoke-direct {v0, p0}, Ll/۫ۧۢ;-><init>(Ll/ۧ۫᩷;)V

    return-object v0
.end method

.method private ܽ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, v0, p2}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1276
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Ll/۫ۧۢ;->ۚ:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 1277
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1278
    invoke-direct {p0}, Ll/۫ۧۢ;->۬()V

    return-void

    .line 1280
    :cond_0
    invoke-virtual {v1, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1281
    invoke-direct {p0}, Ll/۫ۧۢ;->۬()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֡()Landroid/os/Bundle;
    .locals 4

    .line 1691
    iget-object v0, p0, Ll/۫ۧۢ;->֡:Landroid/os/Bundle;

    if-nez v0, :cond_0

    .line 1692
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ll/۫ۧۢ;->֡:Landroid/os/Bundle;

    .line 1693
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "options"

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1694
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1696
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    .line 1697
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 1698
    array-length v2, v0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 1699
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1700
    iget-object v0, p0, Ll/۫ۧۢ;->֡:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 1701
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1743
    iget-object v1, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    invoke-virtual {v1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 1707
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/۫ۧۢ;->֡:Landroid/os/Bundle;

    return-object v0
.end method

.method public final ֨()V
    .locals 1

    .line 1362
    iget-object v0, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    invoke-virtual {v0}, Ll/֡ᩳۢ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ᩳۧۢ;)Ljava/lang/String;
    .locals 4

    .line 1437
    iget-object v0, p1, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v0, :cond_0

    .line 168
    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1440
    :cond_0
    iget-object v0, p1, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz v0, :cond_1

    .line 1441
    iget-object v0, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    new-instance v1, Ll/᩺ۖܽ;

    invoke-direct {v1}, Ll/᩺ۖܽ;-><init>()V

    .line 358
    invoke-virtual {v0, p1, v1}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ll/᩺ۖܽ;)V

    .line 359
    invoke-virtual {v1}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1443
    :cond_1
    new-instance v0, Ll/᩵ۤۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad class: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    const/16 v2, 0x2f

    const/16 v3, 0x2e

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1443
    throw v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 270
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1661
    iget-object v0, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1664
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1665
    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1666
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/16 v1, 0x1e

    if-le p1, v1, :cond_1

    const/4 p1, 0x1

    .line 0
    invoke-static {v0, p1}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_0

    .line 1669
    :cond_1
    invoke-direct {p0}, Ll/۫ۧۢ;->ۤ()V

    .line 1670
    invoke-direct {p0}, Ll/۫ۧۢ;->ۗ()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1485
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۧۢ;

    if-eqz v0, :cond_0

    .line 1489
    invoke-virtual {p0, v0, p2}, Ll/۫ۧۢ;->֫(Ll/ᩳۧۢ;Ljava/lang/String;)V

    return-void

    .line 1487
    :cond_0
    new-instance p2, Ll/᩵ۤۡ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class not found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1487
    throw p2
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v1, ".smali"

    const-string v2, "Class exists: "

    move-object v0, p0

    .line 5
    monitor-enter v0

    .line 1510
    :try_start_0
    iget-object v3, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v3, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1514
    invoke-static {p3}, Ll/ۖۧۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1518
    invoke-direct {p0, p2, v2}, Ll/۫ۧۢ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1520
    new-instance v2, Ll/ᩳۧۢ;

    invoke-direct {v2, p2}, Ll/ᩳۧۢ;-><init>(Ljava/lang/String;)V

    .line 1521
    iput-object p1, v2, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    .line 1522
    new-instance p1, Ll/ۧ۫᩷;

    .line 228
    new-instance v3, Ll/ۧ۫᩷;

    iget-object v4, p0, Ll/۫ۧۢ;->ۜ:Ll/ۧ۫᩷;

    const-string v5, "smali"

    invoke-direct {v3, v4, v5}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1522
    iget-object v4, v2, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-direct {p1, v3, v4}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1523
    invoke-virtual {p1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ۡ۠ۘ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 1524
    invoke-static {p1, v1}, Ll/ۧ۫᩷;->֫(Ll/ۧ۫᩷;Ll/ܶ᩵ܿ;)Ll/ۧ۫᩷;

    move-result-object p1

    iput-object p1, v2, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    .line 1526
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 1527
    iget-object p3, v2, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-virtual {p3, p1}, Ll/ۧ۫᩷;->֫([B)V

    .line 1529
    iget-object p1, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {p1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1530
    iget-boolean p1, p0, Ll/۫ۧۢ;->ܽ:Z

    if-eqz p1, :cond_0

    .line 1531
    iget-object p1, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1739
    iget-object p1, p0, Ll/۫ۧۢ;->᩵:Ll/ۚۡ֫;

    iget-object p2, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    :cond_0
    const-wide/16 p1, 0x0

    .line 1534
    iput-wide p1, p0, Ll/۫ۧۢ;->ۖ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1535
    monitor-exit v0

    return-void

    .line 1516
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Parse class type failed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1511
    :cond_2
    new-instance p1, Ll/᩵ۤۡ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1511
    throw p1

    :catchall_0
    move-exception p1

    .line 1535
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩺ۖܽ;)V
    .locals 3

    .line 1447
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۧۢ;

    if-eqz v0, :cond_0

    .line 1451
    invoke-virtual {p0, v0, p2}, Ll/۫ۧۢ;->֫(Ll/ᩳۧۢ;Ll/᩺ۖܽ;)V

    return-void

    .line 1449
    :cond_0
    new-instance p2, Ll/᩵ۤۡ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class not found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1449
    throw p2
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 3

    .line 247
    iget-object v0, p0, Ll/۫ۧۢ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    new-instance v0, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v2, "exclude_dex"

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 251
    invoke-virtual {v0}, Ll/ۧ۫᩷;->ܿ()V

    const/16 v1, 0xa

    .line 252
    invoke-static {p1, v1}, Ll/ۢܺ֡;->֫(Ljava/util/Collection;C)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۧ۫᩷;->֫([B)V

    return-void

    .line 248
    :cond_0
    new-instance p1, Ll/᩵ۤۡ;

    const v0, 0x7f120926

    invoke-direct {p1, v0}, Ll/᩵ۤۡ;-><init>(I)V

    throw p1
.end method

.method public final ֫(Ljava/util/Collection;)V
    .locals 7

    .line 1562
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1563
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1564
    iget-object v5, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۧۢ;

    if-eqz v5, :cond_0

    .line 1566
    iget-object v6, v5, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v6, :cond_2

    .line 1567
    invoke-virtual {v6}, Ll/ۧ۫᩷;->֫()Z

    .line 1568
    iget-boolean v6, p0, Ll/۫ۧۢ;->ܽ:Z

    if-eqz v6, :cond_1

    .line 1569
    iget-object v2, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    :cond_1
    const/4 v6, 0x0

    .line 1572
    iput-object v6, v5, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    .line 1574
    :cond_2
    iget-object v6, v5, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz v6, :cond_3

    .line 1575
    iget-object v6, p0, Ll/۫ۧۢ;->ܶ:Ljava/util/HashMap;

    invoke-virtual {v6, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1576
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0xa

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1579
    :cond_3
    iget-object v5, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v1, 0x1

    .line 1582
    :cond_4
    iget-object v5, p0, Ll/۫ۧۢ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    .line 1587
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    iget-object v4, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    if-lez p1, :cond_6

    .line 1588
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object p1

    const-string v5, "removed"

    invoke-virtual {p1, v5}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 1590
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 1591
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 1743
    invoke-virtual {v4, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    :cond_6
    :goto_1
    if-eqz v1, :cond_7

    .line 1597
    invoke-direct {p0}, Ll/۫ۧۢ;->ۗ()V

    :cond_7
    if-eqz v2, :cond_8

    .line 1739
    iget-object p1, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Ll/۫ۧۢ;->᩵:Ll/ۚۡ֫;

    invoke-virtual {v0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    :cond_8
    if-eqz v3, :cond_9

    .line 1604
    :try_start_1
    invoke-direct {p0}, Ll/۫ۧۢ;->۫()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 1743
    invoke-virtual {v4, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    :cond_9
    :goto_2
    const-wide/16 v0, 0x0

    .line 1609
    iput-wide v0, p0, Ll/۫ۧۢ;->ۖ:J

    return-void
.end method

.method public final ֫(Ljava/util/HashMap;)V
    .locals 8

    .line 1200
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1201
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1202
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1203
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1204
    iget-object v4, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x2e

    const/16 v7, 0x2f

    if-nez v5, :cond_1

    .line 1207
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۧۢ;

    if-eqz v4, :cond_0

    .line 1211
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1209
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class not found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1205
    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class exists: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1213
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    .line 256
    iput-boolean v1, p0, Ll/۫ۧۢ;->ܽ:Z

    .line 1217
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1218
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 1219
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۧۢ;

    .line 1220
    invoke-virtual {p0, v4}, Ll/۫ۧۢ;->֫(Ll/ᩳۧۢ;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    .line 1221
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1222
    iget-object v4, v4, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p0, v4, v3, v5}, Ll/۫ۧۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1223
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1224
    iget-object v4, p0, Ll/۫ۧۢ;->᩸:Ljava/util/HashMap;

    invoke-static {v4, v6, v6}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 1225
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 1228
    :goto_2
    iget-object v3, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ge v1, v4, :cond_6

    .line 1229
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    .line 1231
    invoke-virtual {v3, v1, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1235
    :cond_6
    invoke-virtual {p0, v2}, Ll/۫ۧۢ;->֫(Ljava/util/Collection;)V

    .line 1236
    invoke-direct {p0}, Ll/۫ۧۢ;->۫()V

    .line 1237
    invoke-virtual {p0, v5}, Ll/۫ۧۢ;->֫(Z)V

    if-eqz v0, :cond_7

    .line 1239
    invoke-direct {p0}, Ll/۫ۧۢ;->ۤ()V

    .line 1240
    invoke-direct {p0}, Ll/۫ۧۢ;->ۗ()V

    :cond_7
    :goto_3
    return-void
.end method

.method public final ֫(Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/String;ZLjava/util/function/Predicate;)V
    .locals 1

    .line 517
    new-instance v0, Ll/ۡ᩵ܿ;

    invoke-direct {v0, p1}, Ll/ۡ᩵ܿ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2, p3, p4}, Ll/۫ۧۢ;->֫(Ll/۟֫ۢ;Ljava/lang/String;ZLjava/util/function/Predicate;)V

    return-void
.end method

.method public final ֫(Ll/۟֫ۢ;Ljava/lang/String;ZLjava/util/function/Predicate;)V
    .locals 2

    const-string v0, "/"

    .line 522
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 523
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 525
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 526
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 528
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    if-nez p4, :cond_2

    if-eqz p3, :cond_2

    .line 529
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-static {p2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    sget-object p3, Ll/ᩳۧۢ;->᩻:Ljava/util/Comparator;

    .line 530
    invoke-interface {p2, p3}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance p3, Ll/ۗۧۢ;

    invoke-direct {p3, p0}, Ll/ۗۧۢ;-><init>(Ll/۫ۧۢ;)V

    .line 531
    invoke-interface {p2, p3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 532
    new-instance p3, Ll/֡ۧۢ;

    invoke-direct {p3, p1}, Ll/֡ۧۢ;-><init>(Ll/۟֫ۢ;)V

    invoke-interface {p2, p3}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    return-void

    .line 535
    :cond_2
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۚۧۢ;

    invoke-direct {v1, p4, p2, p3}, Ll/ۚۧۢ;-><init>(Ljava/util/function/Predicate;Ljava/lang/String;Z)V

    .line 536
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    sget-object p3, Ll/ᩳۧۢ;->᩻:Ljava/util/Comparator;

    .line 549
    invoke-interface {p2, p3}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance p3, Ll/֨ۧۢ;

    invoke-direct {p3, p0}, Ll/֨ۧۢ;-><init>(Ll/۫ۧۢ;)V

    .line 550
    invoke-interface {p2, p3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 551
    new-instance p3, Ll/֡ۧۢ;

    invoke-direct {p3, p1}, Ll/֡ۧۢ;-><init>(Ll/۟֫ۢ;)V

    invoke-interface {p2, p3}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ֫(Ll/ۧۧۢ;)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 828
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 829
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 830
    new-instance v4, Ll/᩸ۡۚ;

    invoke-direct {v4}, Ll/᩸ۡۚ;-><init>()V

    .line 832
    iget-object v5, v1, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Ll/ᩳۧۢ;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ll/ᩳۧۢ;

    .line 834
    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    .line 835
    iget-object v9, v8, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    iget-object v10, v8, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    if-eqz v9, :cond_0

    .line 837
    invoke-interface {v0, v10}, Ll/ۧۧۢ;->ܳ(Ljava/lang/String;)V

    .line 838
    invoke-direct {v1, v9}, Ll/۫ۧۢ;->ۧ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v11

    .line 840
    :try_start_0
    iget-object v8, v8, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-direct {v1, v8, v9, v11}, Ll/۫ۧۢ;->֫(Ljava/lang/String;Ll/ۧ۫᩷;Ll/ۧ۫᩷;)V
    :try_end_0
    .catch Ll/ܳܿ֡; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 842
    new-instance v2, Ll/֫ۧۢ;

    invoke-direct {v2, v10, v0}, Ll/֫ۧۢ;-><init>(Ljava/lang/String;Ll/ܳܿ֡;)V

    throw v2

    :cond_0
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 979
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ll/۫ۧۢ;->֡()Landroid/os/Bundle;

    move-result-object v6

    const-string v7, "opt_dex_version"

    .line 980
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v7

    const-string v8, "opt_rm_source"

    .line 981
    invoke-virtual {v6, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v8

    const-string v9, "opt_rm_line"

    .line 982
    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v9

    const-string v10, "opt_rm_param"

    .line 983
    invoke-virtual {v6, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v10

    const-string v11, "opt_rm_prologue"

    .line 984
    invoke-virtual {v6, v11}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    const-string v12, "opt_rm_local"

    .line 985
    invoke-virtual {v6, v12}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v12

    const-string v13, "opt_rm_api_mod"

    .line 986
    invoke-virtual {v6, v13}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    if-nez v8, :cond_3

    if-nez v9, :cond_3

    if-nez v10, :cond_3

    if-nez v11, :cond_3

    if-nez v12, :cond_3

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v13, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v13, 0x1

    :goto_3
    if-nez v7, :cond_4

    if-nez v13, :cond_4

    const/4 v13, 0x1

    goto :goto_4

    :cond_4
    const/4 v13, 0x0

    .line 848
    :goto_4
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v14

    .line 849
    iget-object v15, v1, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    move/from16 v16, v6

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/16 v17, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v6, :cond_14

    .line 850
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v19, v15

    move-object/from16 v15, v17

    check-cast v15, Ljava/lang/String;

    move/from16 v17, v11

    .line 851
    invoke-virtual {v1, v15}, Ll/۫ۧۢ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v12, v12, 0x1

    invoke-interface {v0, v12, v6, v11}, Ll/ۧۧۢ;->֫(IILjava/lang/String;)V

    .line 853
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 854
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 855
    invoke-virtual {v4}, Ll/᩸ۡۚ;->ܳ()V

    .line 856
    array-length v11, v5

    const/16 v20, 0x0

    move/from16 v21, v6

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v11, :cond_8

    move/from16 v20, v11

    aget-object v11, v5, v6

    move-object/from16 v22, v5

    .line 857
    iget-object v5, v11, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 858
    iget-object v5, v11, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v5, :cond_5

    .line 859
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 860
    :cond_5
    iget-object v5, v11, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz v5, :cond_6

    .line 861
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 863
    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad class item: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v11, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    const/16 v4, 0x2f

    const/16 v5, 0x2e

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_7
    add-int/lit8 v6, v6, 0x1

    move/from16 v11, v20

    move-object/from16 v5, v22

    goto :goto_6

    :cond_8
    move-object/from16 v22, v5

    .line 866
    invoke-direct {v1, v15}, Ll/۫ۧۢ;->֡(Ljava/lang/String;)Ll/ۧ۫᩷;

    move-result-object v5

    .line 656
    new-instance v6, Ll/ۧ۫᩷;

    invoke-virtual/range {p0 .. p0}, Ll/ܶ۬᩷;->֫()Ll/ۧ۫᩷;

    move-result-object v11

    move/from16 v20, v12

    const-string v12, "dexBuild/"

    move-object/from16 v23, v4

    const-string v4, ".digest"

    .line 0
    invoke-static {v12, v15, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 656
    invoke-direct {v6, v11, v4}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    if-eqz v13, :cond_9

    .line 868
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 321
    invoke-virtual {v1, v15}, Ll/۫ۧۢ;->ܳ(Ljava/lang/String;)Ll/ܿۧۢ;

    move-result-object v4

    iget v4, v4, Ll/ܿۧۢ;->֫:I

    .line 869
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ne v4, v11, :cond_9

    .line 870
    invoke-virtual {v5}, Ll/ۧ۫᩷;->֫()Z

    .line 871
    invoke-virtual {v6}, Ll/ۧ۫᩷;->֫()Z

    move-object/from16 v26, v2

    move-object/from16 v25, v14

    move/from16 v6, v16

    move/from16 v4, v17

    move/from16 v11, v18

    move-object/from16 v0, v23

    move/from16 v16, v13

    goto/16 :goto_d

    .line 876
    :cond_9
    invoke-interface/range {p1 .. p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_a

    goto/16 :goto_c

    .line 886
    :cond_a
    sget-object v4, Ll/ᩳۧۢ;->ۜ:Ljava/util/Comparator;

    invoke-static {v2, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 887
    invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 888
    invoke-virtual {v14}, Ljava/security/MessageDigest;->reset()V

    int-to-byte v4, v7

    .line 992
    invoke-virtual {v14, v4}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v4, v8

    .line 993
    invoke-virtual {v14, v4}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v4, v9

    .line 994
    invoke-virtual {v14, v4}, Ljava/security/MessageDigest;->update(B)V

    int-to-byte v4, v10

    .line 995
    invoke-virtual {v14, v4}, Ljava/security/MessageDigest;->update(B)V

    move/from16 v4, v17

    int-to-byte v11, v4

    .line 996
    invoke-virtual {v14, v11}, Ljava/security/MessageDigest;->update(B)V

    move/from16 v11, v18

    int-to-byte v12, v11

    .line 997
    invoke-virtual {v14, v12}, Ljava/security/MessageDigest;->update(B)V

    move/from16 v12, v16

    move/from16 v16, v13

    int-to-byte v13, v12

    .line 998
    invoke-virtual {v14, v13}, Ljava/security/MessageDigest;->update(B)V

    const/16 v13, -0x7f

    .line 890
    invoke-virtual {v14, v13}, Ljava/security/MessageDigest;->update(B)V

    .line 891
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v13

    move-object/from16 v13, v17

    check-cast v13, Ll/ᩳۧۢ;

    .line 892
    iget-object v13, v13, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-static {v14, v13}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    move-object/from16 v13, v18

    goto :goto_8

    :cond_b
    const/16 v13, -0x7e

    .line 894
    invoke-virtual {v14, v13}, Ljava/security/MessageDigest;->update(B)V

    .line 895
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v13

    move-object/from16 v13, v17

    check-cast v13, Ll/ᩳۧۢ;

    move/from16 v17, v12

    .line 896
    iget-object v12, v13, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-static {v14, v12}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 897
    iget-object v12, v13, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-virtual {v12}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object v12

    invoke-static {v14, v12}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V

    move/from16 v12, v17

    move-object/from16 v13, v18

    goto :goto_9

    :cond_c
    move/from16 v17, v12

    const/16 v12, -0x7d

    .line 899
    invoke-virtual {v14, v12}, Ljava/security/MessageDigest;->update(B)V

    .line 900
    invoke-virtual {v14}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v12

    .line 901
    invoke-static {v5, v6, v12}, Ll/۫ۧۢ;->֫(Ll/ۧ۫᩷;Ll/ۧ۫᩷;[B)Z

    move-result v13

    if-eqz v13, :cond_d

    move-object/from16 v26, v2

    move-object/from16 v25, v14

    move/from16 v6, v17

    move-object/from16 v0, v23

    goto/16 :goto_d

    .line 906
    :cond_d
    invoke-interface/range {p1 .. p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v13

    if-eqz v13, :cond_e

    goto/16 :goto_c

    .line 911
    :cond_e
    new-instance v13, Ll/᩵ۛۡ;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v18

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v24

    move-object/from16 v25, v14

    add-int v14, v24, v18

    move-object/from16 v18, v5

    move-object/from16 v24, v6

    int-to-long v5, v14

    invoke-direct {v13, v5, v6}, Ll/᩵ۛۡ;-><init>(J)V

    .line 912
    new-instance v5, Ll/᩹ۧۢ;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Ll/᩹ۧۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v13, v5}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 913
    new-instance v5, Ll/᩵ۡۚ;

    if-lez v7, :cond_f

    const/4 v6, 0x7

    if-ge v7, v6, :cond_f

    .line 338
    sget-object v6, Ll/۫ۧۢ;->᩶:[I

    aget v6, v6, v7

    invoke-static {v6}, Ll/۠ۗ֡;->ᩳ(I)Ll/۠ۗ֡;

    move-result-object v6

    goto :goto_a

    .line 326
    :cond_f
    :try_start_1
    invoke-virtual {v1, v15}, Ll/۫ۧۢ;->ܳ(Ljava/lang/String;)Ll/ܿۧۢ;

    move-result-object v6

    iget-object v6, v6, Ll/ܿۧۢ;->ۧ:Ll/۠ۗ֡;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_a

    :catch_1
    const/16 v6, 0xf

    .line 129
    invoke-static {v6}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object v6

    .line 913
    :goto_a
    invoke-direct {v5, v6}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 914
    iput-boolean v9, v5, Ll/᩵ۡۚ;->ܺ֫:Z

    .line 915
    iput-boolean v11, v5, Ll/᩵ۡۚ;->ۖ֫:Z

    .line 916
    iput-boolean v10, v5, Ll/᩵ۡۚ;->ۘ֫:Z

    .line 917
    iput-boolean v4, v5, Ll/᩵ۡۚ;->ᩴ֫:Z

    .line 918
    iput-boolean v8, v5, Ll/᩵ۡۚ;->᩵֫:Z

    move/from16 v6, v17

    .line 919
    iput-boolean v6, v5, Ll/᩵ۡۚ;->ۡ֫:Z

    .line 920
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_11

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v26, v2

    move-object/from16 v2, v17

    check-cast v2, Ll/ᩳۧۢ;

    const/4 v0, 0x1

    .line 41
    invoke-virtual {v13, v0}, Ll/᩵ۛۡ;->֫(I)Z

    .line 924
    :try_start_2
    new-instance v0, Ll/۬ۧۢ;

    invoke-direct {v0, v1, v2}, Ll/۬ۧۢ;-><init>(Ll/۫ۧۢ;Ll/ᩳۧۢ;)V

    invoke-virtual {v0}, Ll/۬ۧۢ;->֫()Ll/۠ۛ֡;

    move-result-object v0
    :try_end_2
    .catch Ll/ܳܿ֡; {:try_start_2 .. :try_end_2} :catch_2

    .line 928
    invoke-virtual {v5, v0}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    .line 929
    invoke-interface/range {p1 .. p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_c

    :cond_10
    move-object/from16 v0, p1

    move-object/from16 v2, v26

    goto :goto_b

    :catch_2
    move-exception v0

    .line 926
    new-instance v3, Ll/֫ۧۢ;

    iget-object v2, v2, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-direct {v3, v2, v0}, Ll/֫ۧۢ;-><init>(Ljava/lang/String;Ll/ܳܿ֡;)V

    throw v3

    :cond_11
    move-object/from16 v26, v2

    .line 933
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۧۢ;

    const/4 v14, 0x1

    .line 41
    invoke-virtual {v13, v14}, Ll/᩵ۛۡ;->֫(I)Z

    .line 937
    :try_start_3
    new-instance v14, Ll/۬ۧۢ;

    invoke-direct {v14, v1, v2}, Ll/۬ۧۢ;-><init>(Ll/۫ۧۢ;Ll/ᩳۧۢ;)V

    invoke-virtual {v14}, Ll/۬ۧۢ;->֫()Ll/۠ۛ֡;

    move-result-object v2
    :try_end_3
    .catch Ll/ܳܿ֡; {:try_start_3 .. :try_end_3} :catch_3

    .line 941
    invoke-virtual {v5, v2}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    .line 942
    invoke-interface/range {p1 .. p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    if-eqz v2, :cond_12

    :goto_c
    return-void

    :catch_3
    move-exception v0

    .line 939
    new-instance v3, Ll/֫ۧۢ;

    iget-object v2, v2, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-direct {v3, v2, v0}, Ll/֫ۧۢ;-><init>(Ljava/lang/String;Ll/ܳܿ֡;)V

    throw v3

    .line 948
    :cond_13
    invoke-virtual {v1, v15}, Ll/۫ۧۢ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    invoke-interface/range {p1 .. p1}, Ll/ۧۧۢ;->ᩳ()V

    .line 949
    invoke-virtual/range {v18 .. v18}, Ll/ۧ۫᩷;->֫()Z

    .line 950
    invoke-virtual/range {v24 .. v24}, Ll/ۧ۫᩷;->֫()Z

    move-object/from16 v0, v23

    .line 952
    invoke-virtual {v5, v0}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V

    .line 953
    invoke-virtual {v0}, Ll/᩸ۡۚ;->֫()[B

    move-result-object v2

    invoke-virtual {v0}, Ll/᩸ۡۚ;->ᩳ()I

    move-result v5

    .line 160
    invoke-virtual/range {v18 .. v18}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v13, v2, v14, v5}, Ll/ܶ᩵ܿ;->֫([BII)V

    .line 955
    new-instance v2, Ll/ۤۜܽ;

    invoke-direct {v2}, Ll/ۤۜܽ;-><init>()V

    const v5, 0x73737312

    .line 956
    invoke-virtual {v2, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 957
    invoke-virtual {v2, v12}, Ll/ۤۜܽ;->ۧ([B)V

    .line 958
    invoke-virtual {v0}, Ll/᩸ۡۚ;->֫()[B

    move-result-object v5

    const/16 v12, 0x8

    const/16 v13, 0x20

    invoke-static {v5, v12, v13}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/ۤۜܽ;->ۧ([B)V

    .line 959
    invoke-virtual {v2}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v5

    invoke-virtual {v2}, Ll/ۤۜܽ;->size()I

    move-result v2

    .line 160
    invoke-virtual/range {v24 .. v24}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v5, v13, v2}, Ll/ܶ᩵ܿ;->֫([BII)V

    :goto_d
    move/from16 v18, v11

    move/from16 v13, v16

    move-object/from16 v15, v19

    move/from16 v12, v20

    move-object/from16 v5, v22

    move-object/from16 v14, v25

    move-object/from16 v2, v26

    move v11, v4

    move/from16 v16, v6

    move/from16 v6, v21

    move-object v4, v0

    move-object/from16 v0, p1

    goto/16 :goto_5

    :cond_14
    const/4 v0, 0x0

    .line 964
    iput-boolean v0, v1, Ll/۫ۧۢ;->ۘ:Z

    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;Z)V
    .locals 4

    .line 1024
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۙ()Z

    .line 1025
    iget-object v0, p0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1026
    invoke-direct {p0, v1}, Ll/۫ۧۢ;->֡(Ljava/lang/String;)Ll/ۧ۫᩷;

    move-result-object v2

    .line 1027
    invoke-virtual {v2}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 1030
    :cond_1
    invoke-virtual {p0, v1}, Ll/۫ۧۢ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    if-eqz p2, :cond_2

    .line 1032
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩶()V

    .line 1034
    :cond_2
    :try_start_0
    invoke-virtual {v2}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    .line 446
    :try_start_1
    invoke-virtual {v1, v3}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1035
    :try_start_2
    invoke-static {v2, v3}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_3

    .line 1036
    :try_start_3
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_3
    if-eqz v2, :cond_0

    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    :catchall_0
    move-exception p1

    if-eqz v3, :cond_4

    .line 1034
    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v2, :cond_5

    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    move-exception p1

    if-eqz p2, :cond_6

    .line 1038
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩸()V

    .line 1040
    :cond_6
    throw p1

    :cond_7
    return-void
.end method

.method public final ֫(Ll/ܿۛ᩷;Ll/ۙ۫ܿ;)V
    .locals 1

    .line 1747
    iget-object v0, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    invoke-virtual {v0, p1, p2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public final declared-synchronized ֫(Ll/ᩳۧۢ;Ljava/lang/String;)V
    .locals 5

    move-object v0, p0

    monitor-enter v0

    .line 1493
    :try_start_0
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 1495
    iget-object v1, p1, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-nez v1, :cond_0

    .line 1496
    new-instance v1, Ll/ۧ۫᩷;

    .line 228
    new-instance v2, Ll/ۧ۫᩷;

    iget-object v3, p0, Ll/۫ۧۢ;->ۜ:Ll/ۧ۫᩷;

    const-string v4, "smali"

    invoke-direct {v2, v3, v4}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1496
    iget-object v3, p1, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1497
    invoke-virtual {v1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".smali"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۡ۠ۘ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 1498
    invoke-static {v1, v2}, Ll/ۧ۫᩷;->֫(Ll/ۧ۫᩷;Ll/ܶ᩵ܿ;)Ll/ۧ۫᩷;

    move-result-object v1

    iput-object v1, p1, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1501
    :goto_0
    iget-object v2, p1, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    invoke-virtual {v2, p2}, Ll/ۧ۫᩷;->֫([B)V

    .line 1502
    iget-boolean p2, p0, Ll/۫ۧۢ;->ܽ:Z

    if-eqz p2, :cond_1

    if-eqz v1, :cond_1

    .line 1503
    iget-object p2, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1739
    iget-object p1, p0, Ll/۫ۧۢ;->᩵:Ll/ۚۡ֫;

    iget-object p2, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    :cond_1
    const-wide/16 p1, 0x0

    .line 1506
    iput-wide p1, p0, Ll/۫ۧۢ;->ۖ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1507
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ᩳۧۢ;Ll/᩺ۖܽ;)V
    .locals 3

    .line 1455
    iget-object v0, p1, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v0, :cond_2

    .line 172
    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 708
    :try_start_1
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_0

    .line 709
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_1

    .line 707
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p2

    :catch_0
    move-exception p2

    .line 704
    invoke-static {p1, p2}, Ll/۫ᩴܿ;->֫(Ll/ܶ᩵ܿ;Ljava/io/IOException;)V

    .line 705
    throw p2

    .line 1459
    :cond_2
    iget-object v0, p1, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz v0, :cond_3

    .line 1460
    iget-object v0, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    invoke-virtual {v0, p1, p2}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ll/᩺ۖܽ;)V

    return-void

    .line 1463
    :cond_3
    new-instance p2, Ll/᩵ۤۡ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bad class: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1463
    throw p2
.end method

.method public final ֫(Ll/᩸᩻ۢ;Ll/֫۠ۢ;)V
    .locals 1

    .line 1751
    iget-object v0, p0, Ll/۫ۧۢ;->۠:Ll/ۚۡ֫;

    invoke-virtual {v0, p1, p2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public final ֫(Ll/᩸᩻ۢ;Ll/ۘ᩻ۢ;)V
    .locals 1

    .line 1755
    iget-object v0, p0, Ll/۫ۧۢ;->᩵:Ll/ۚۡ֫;

    invoke-virtual {v0, p1, p2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 256
    iput-boolean p1, p0, Ll/۫ۧۢ;->ܽ:Z

    if-eqz p1, :cond_0

    .line 258
    invoke-virtual {p0}, Ll/۫ۧۢ;->᩶()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܿۛ᩷;Ll/ۘۛ᩷;)Z
    .locals 8

    .line 1768
    invoke-virtual {p0}, Ll/ܶ۬᩷;->ܿ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 232
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v2, "strings_changed"

    invoke-virtual {v0, v2}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    .line 1770
    invoke-virtual {p1}, Ll/ܿۛ᩷;->ܿ֫()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_3

    .line 728
    iget-boolean v2, p0, Ll/۫ۧۢ;->ۘ:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 731
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Ll/۫ۧۢ;->ۖ:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0xbb8

    cmp-long v2, v4, v6

    if-gez v2, :cond_1

    .line 732
    iget-boolean v2, p0, Ll/۫ۧۢ;->ۘ:Z

    goto :goto_1

    .line 735
    :cond_1
    :try_start_0
    invoke-direct {p0}, Ll/۫ۧۢ;->ۙ()Z

    move-result v2

    iput-boolean v2, p0, Ll/۫ۧۢ;->ۘ:Z

    .line 736
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Ll/۫ۧۢ;->ۖ:J

    .line 737
    iget-boolean v2, p0, Ll/۫ۧۢ;->ۘ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 740
    :catch_0
    iput-boolean v3, p0, Ll/۫ۧۢ;->ۘ:Z

    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v2, 0x1

    :goto_3
    if-eqz v0, :cond_5

    .line 1772
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v4, 0x7f120b7b

    .line 1773
    invoke-virtual {v0, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    const v4, 0x7f120a01

    .line 1774
    invoke-virtual {v0, v4}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v4, Ll/᩵ۧۢ;

    invoke-direct {v4, v1, p2}, Ll/᩵ۧۢ;-><init>(ILjava/lang/Object;)V

    const p2, 0x7f120b8b

    .line 1775
    invoke-virtual {v0, p2, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    if-eqz v2, :cond_4

    .line 1780
    new-instance p2, Ll/᩷ܿ᩷;

    const/4 v1, 0x4

    invoke-direct {p2, v1, p1}, Ll/᩷ܿ᩷;-><init>(ILjava/lang/Object;)V

    const p1, 0x7f120465

    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_4

    .line 1782
    :cond_4
    new-instance p2, Ll/۠ۧۢ;

    invoke-direct {p2, p1}, Ll/۠ۧۢ;-><init>(Ll/ܿۛ᩷;)V

    const p1, 0x7f120319

    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1783
    :goto_4
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v3

    :cond_5
    if-eqz v2, :cond_6

    .line 1786
    invoke-virtual {p1}, Ll/ܿۛ᩷;->ۡ֫()V

    return v3

    :cond_6
    return v1
.end method

.method public final ۖ()Ll/ۧ۫᩷;
    .locals 3

    .line 232
    new-instance v0, Ll/ۧ۫᩷;

    iget-object v1, p0, Ll/۫ۧۢ;->ۜ:Ll/ۧ۫᩷;

    const-string v2, "config"

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۖ(Ljava/lang/String;)Ll/᩵ܺۚ;
    .locals 2

    .line 347
    invoke-virtual {p0}, Ll/۫ۧۢ;->֡()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "opt_dex_version"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    .line 338
    sget-object v1, Ll/۫ۧۢ;->᩶:[I

    aget v0, v1, v0

    invoke-static {v0}, Ll/۠ۗ֡;->ᩳ(I)Ll/۠ۗ֡;

    move-result-object v0

    goto :goto_0

    .line 326
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Ll/۫ۧۢ;->ܳ(Ljava/lang/String;)Ll/ܿۧۢ;

    move-result-object v0

    iget-object v0, v0, Ll/ܿۧۢ;->ۧ:Ll/۠ۗ֡;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/16 v0, 0xf

    .line 129
    invoke-static {v0}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object v0

    .line 414
    :goto_0
    iget v0, v0, Ll/۠ۗ֡;->֫:I

    .line 415
    new-instance v1, Ll/ܶۧۢ;

    invoke-direct {v1, v0}, Ll/ܶۧۢ;-><init>(I)V

    iget-object v0, p0, Ll/۫ۧۢ;->ۡ:Ll/ۧۤᩴ;

    invoke-static {v0, p1, v1}, Ll/ᩳۤᩴ;->compute(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ܺۚ;

    return-object p1
.end method

.method public final ۘ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1310
    iget-object v0, p0, Ll/۫ۧۢ;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ۘ()Ll/ۧ۫᩷;
    .locals 3

    .line 224
    new-instance v0, Ll/ۧ۫᩷;

    iget-object v1, p0, Ll/۫ۧۢ;->ۜ:Ll/ۧ۫᩷;

    const-string v2, "data"

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 263
    iget-object v0, p0, Ll/۫ۧۢ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ljava/util/ArrayList;
    .locals 4

    .line 508
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 509
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۧۢ;

    .line 510
    new-instance v3, Ll/۬ۧۢ;

    invoke-direct {v3, p0, v2}, Ll/۬ۧۢ;-><init>(Ll/۫ۧۢ;Ll/ᩳۧۢ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 512
    :cond_0
    new-instance v1, Ll/ۙۧۢ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final ۜ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4

    .line 317
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 290
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "$"

    .line 291
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 292
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 293
    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 294
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 297
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 298
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x1

    if-gt p1, v0, :cond_2

    return-object v1

    .line 301
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 303
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 304
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 305
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v1, v2

    goto :goto_1

    :cond_4
    return-object p1
.end method

.method public final ۠()V
    .locals 1

    .line 1366
    iget-object v0, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    invoke-virtual {v0}, Ll/֡ᩳۢ;->֫()V

    .line 1367
    invoke-virtual {v0}, Ll/֡ᩳۢ;->ᩳ()V

    return-void
.end method

.method public final ۡ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1429
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۧۢ;

    if-eqz v0, :cond_0

    .line 1433
    invoke-virtual {p0, v0}, Ll/۫ۧۢ;->֫(Ll/ᩳۧۢ;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1431
    :cond_0
    new-instance v0, Ll/᩵ۤۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2f

    const/16 v3, 0x2e

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1431
    throw v0
.end method

.method public final ۡ()Ll/ܿۛۡ;
    .locals 2

    .line 436
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۛۡ;->֫(Ljava/util/Collection;)Ll/ܳۛۡ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ܳۛۡ;->֫(I)V

    invoke-virtual {v0}, Ll/ܳۛۡ;->֫()Ll/ܿۛۡ;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1411
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۧۢ;

    .line 1412
    iget-object v2, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    if-eqz v1, :cond_1

    iget-object v3, p0, Ll/۫ۧۢ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1413
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 1414
    iget-object v3, p0, Ll/۫ۧۢ;->ܶ:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۧۢ;

    if-nez v3, :cond_0

    .line 1416
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ll/ᩳۧۢ;

    :cond_0
    if-eqz v3, :cond_1

    .line 1418
    iget-object p1, v3, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz p1, :cond_1

    .line 1419
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    new-instance p1, Ll/᩺ۖܽ;

    invoke-direct {p1}, Ll/᩺ۖܽ;-><init>()V

    .line 358
    invoke-virtual {v2, v3, p1}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ll/᩺ۖܽ;)V

    .line 359
    :goto_0
    invoke-virtual {p1}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    .line 1422
    iget-object p1, v1, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz p1, :cond_2

    .line 1423
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    new-instance p1, Ll/᩺ۖܽ;

    invoke-direct {p1}, Ll/᩺ۖܽ;-><init>()V

    .line 358
    invoke-virtual {v2, v1, p1}, Ll/֡ᩳۢ;->֫(Ll/ᩳۧۢ;Ll/᩺ۖܽ;)V

    goto :goto_0

    :cond_2
    const-string p1, ""

    return-object p1
.end method

.method public final ۢ()Ljava/util/Map;
    .locals 7

    .line 1320
    iget-object v0, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    .line 1328
    iget-object v1, p0, Ll/۫ۧۢ;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1329
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    .line 1331
    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    add-int/2addr v3, v2

    .line 1332
    new-instance v2, Ljava/util/HashMap;

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x4

    invoke-static {v3, v6, v4, v5}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 1333
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, ""

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 1334
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 1335
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v6, "# TOO_LONG_NAME/"

    .line 1336
    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 1338
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1341
    :cond_2
    invoke-static {v2, v3, v5}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_1

    .line 1342
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 1344
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1347
    :cond_3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1348
    invoke-virtual {v2, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    return-object v2
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1467
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ᩳۧۢ;

    if-eqz v1, :cond_1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 1475
    :try_start_0
    iget-object p1, v1, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/۫ۧۢ;->ۖ(Ljava/lang/String;)Ll/᩵ܺۚ;

    move-result-object p1

    .line 1476
    invoke-virtual {p1}, Ll/᩵ܺۚ;->֫()Ll/᩵ۡۚ;

    move-result-object v2

    invoke-static {p2, v2, p1}, Ll/ۢܺۚ;->֫(Ljava/lang/String;Ll/᩵ۡۚ;Ll/᩵ܺۚ;)Ll/֡᩷ۚ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1479
    iget-object v2, v1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    .line 1271
    invoke-virtual {p1}, Ll/֡᩷ۚ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Ll/۫ۧۢ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1481
    invoke-virtual {p0, v1, p2}, Ll/۫ۧۢ;->֫(Ll/ᩳۧۢ;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1482
    monitor-exit v0

    return-void

    .line 1478
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unknown error"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 1482
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 1469
    :cond_1
    new-instance p2, Ll/᩵ۤۡ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class not found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1469
    throw p2
.end method

.method public final ۧ(Ll/ܿۛ᩷;)V
    .locals 1

    .line 1358
    iget-object v0, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    invoke-virtual {v0, p1}, Ll/֡ᩳۢ;->֫(Ll/ܿۛ᩷;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 270
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܳ(Ljava/lang/String;)Ll/ܿۧۢ;
    .locals 6

    .line 351
    iget-object v0, p0, Ll/۫ۧۢ;->ܿ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۧۢ;

    if-eqz v1, :cond_0

    return-object v1

    .line 355
    :cond_0
    iget-object v2, p0, Ll/۫ۧۢ;->ܳ:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/Reference;

    if-eqz v2, :cond_1

    .line 357
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۛ֡;

    if-eqz v2, :cond_1

    .line 359
    new-instance v1, Ll/ܿۧۢ;

    invoke-virtual {v2}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v3

    invoke-virtual {v2}, Ll/۬ۛ֡;->ܳ()I

    move-result v2

    invoke-direct {v1, v3, v2}, Ll/ܿۧۢ;-><init>(Ll/۠ۗ֡;I)V

    :cond_1
    if-nez v1, :cond_2

    .line 363
    new-instance v1, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۘ()Ll/ۧ۫᩷;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 364
    invoke-virtual {v1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v2, "r"

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v1

    .line 365
    :try_start_0
    new-instance v2, Ll/ܿۧۢ;

    const-wide/16 v3, 0x4

    .line 116
    invoke-virtual {v1, v3, v4}, Ll/᩻ۖܽ;->seek(J)V

    .line 117
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v3

    add-int/lit8 v3, v3, -0x30

    mul-int/lit8 v3, v3, 0x64

    .line 118
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v4

    add-int/lit8 v4, v4, -0x30

    mul-int/lit8 v4, v4, 0xa

    add-int/2addr v4, v3

    .line 119
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v3

    add-int/lit8 v3, v3, -0x30

    add-int/2addr v3, v4

    .line 120
    invoke-static {v3}, Ll/۠ۗ֡;->ᩳ(I)Ll/۠ۗ֡;

    move-result-object v3

    const-wide/16 v4, 0x60

    .line 111
    invoke-virtual {v1, v4, v5}, Ll/᩻ۖܽ;->seek(J)V

    .line 112
    invoke-virtual {v1}, Ll/᩻ۖܽ;->ۛۧ()I

    move-result v4

    .line 365
    invoke-direct {v2, v3, v4}, Ll/ܿۧۢ;-><init>(Ll/۠ۗ֡;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 366
    invoke-virtual {v1}, Ll/᩻ۖܽ;->close()V

    move-object v1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 364
    :try_start_1
    invoke-virtual {v1}, Ll/᩻ۖܽ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 368
    :cond_2
    :goto_1
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final ܳ()V
    .locals 1

    .line 1681
    iget-object v0, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1682
    invoke-direct {p0}, Ll/۫ۧۢ;->ۤ()V

    .line 1683
    invoke-direct {p0}, Ll/۫ۧۢ;->ۗ()V

    return-void
.end method

.method public final ܶ()V
    .locals 1

    .line 1380
    iget-object v0, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    invoke-virtual {v0}, Ll/֡ᩳۢ;->ۧ()V

    return-void
.end method

.method public final ܺ(Ljava/lang/String;)I
    .locals 5

    .line 1396
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۧۢ;

    if-nez p1, :cond_0

    goto :goto_0

    .line 1400
    :cond_0
    iget-object v0, p1, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v0, :cond_1

    .line 84
    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v1

    .line 88
    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    xor-long v0, v1, v3

    .line 1402
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->hashCode()I

    move-result p1

    return p1

    .line 1404
    :cond_1
    iget-object p1, p1, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-eqz p1, :cond_2

    const/high16 p1, -0x20000000

    return p1

    :cond_2
    :goto_0
    const/high16 p1, -0x10000000

    return p1
.end method

.method public final ܺ()Ljava/util/Collection;
    .locals 1

    .line 283
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)Ll/᩹ܶ֡;
    .locals 2

    .line 402
    new-instance v0, Ll/᩸ۧۢ;

    invoke-direct {v0, p0, p1}, Ll/᩸ۧۢ;-><init>(Ll/۫ۧۢ;Ljava/lang/String;)V

    iget-object v1, p0, Ll/۫ۧۢ;->᩻:Ll/ۧۤᩴ;

    invoke-static {v1, p1, v0}, Ll/ᩳۤᩴ;->computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܶ֡;

    return-object p1
.end method

.method public final ܿ(Ljava/lang/String;)Ll/۬ۛ֡;
    .locals 5

    const-string v1, "Read DexFile from file: "

    .line 374
    iget-object v0, p0, Ll/۫ۧۢ;->ܳ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/Reference;

    if-eqz v0, :cond_0

    .line 376
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۛ֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 381
    :cond_0
    iget-object v0, p0, Ll/۫ۧۢ;->ܳ:Ljava/util/Map;

    monitor-enter v0

    .line 382
    :try_start_0
    iget-object v2, p0, Ll/۫ۧۢ;->ܳ:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/Reference;

    if-eqz v2, :cond_1

    .line 384
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۛ֡;

    if-eqz v2, :cond_1

    .line 386
    monitor-exit v0

    return-object v2

    .line 388
    :cond_1
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 389
    new-instance v1, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۘ()Ll/ۧ۫᩷;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 390
    invoke-virtual {v1}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 391
    :try_start_1
    invoke-static {v1}, Ll/۬ۛ֡;->֫(Ljava/io/InputStream;)Ll/۬ۛ֡;

    move-result-object v2

    .line 392
    iget-object v3, p0, Ll/۫ۧۢ;->ܳ:Ljava/util/Map;

    new-instance v4, Ljava/lang/ref/SoftReference;

    invoke-direct {v4, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v3, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 394
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-object v2

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_2

    .line 390
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw p1

    :catchall_2
    move-exception p1

    .line 395
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public final ᩳ(Ljava/lang/String;)Ll/ܰ֫ۢ;
    .locals 1

    .line 1385
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۧۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1389
    :cond_0
    new-instance v0, Ll/۬ۧۢ;

    invoke-direct {v0, p0, p1}, Ll/۬ۧۢ;-><init>(Ll/۫ۧۢ;Ll/ᩳۧۢ;)V

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 236
    iget-object v0, p0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ(Ljava/lang/String;)V
    .locals 4

    .line 1546
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1547
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1549
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1550
    iget-object v1, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۧۢ;

    .line 1551
    iget-object v3, v2, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1552
    iget-object v2, v2, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1555
    :cond_2
    invoke-virtual {p0, v0}, Ll/۫ۧۢ;->֫(Ljava/util/Collection;)V

    return-void
.end method

.method public final ᩵()Ljava/util/Set;
    .locals 1

    .line 1759
    iget-object v0, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵(Ljava/lang/String;)V
    .locals 1

    .line 1674
    iget-object v0, p0, Ll/۫ۧۢ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1675
    invoke-direct {p0}, Ll/۫ۧۢ;->ۤ()V

    .line 1676
    invoke-direct {p0}, Ll/۫ۧۢ;->ۗ()V

    :cond_0
    return-void
.end method

.method public final ᩶()V
    .locals 6

    .line 444
    iget-boolean v0, p0, Ll/۫ۧۢ;->ܽ:Z

    if-eqz v0, :cond_7

    .line 447
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۧۢ;

    const/4 v3, 0x0

    .line 448
    iput-object v3, v2, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    goto :goto_0

    .line 228
    :cond_0
    new-instance v1, Ll/ۧ۫᩷;

    iget-object v2, p0, Ll/۫ۧۢ;->ۜ:Ll/ۧ۫᩷;

    const-string v3, "smali"

    invoke-direct {v1, v2, v3}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 451
    iget-object v2, p0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 452
    new-instance v4, Ll/ۧ۫᩷;

    invoke-direct {v4, v1, v3}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 453
    invoke-virtual {v4}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, ""

    .line 454
    invoke-direct {p0, v4, v5, v3}, Ll/۫ۧۢ;->֫(Ll/ۧ۫᩷;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 457
    :cond_2
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 458
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 459
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 460
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 461
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۧۢ;

    .line 462
    iget-object v3, v2, Ll/ᩳۧۢ;->ܿ:Ll/ۧ۫᩷;

    if-eqz v3, :cond_4

    .line 463
    iget-object v2, v2, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 464
    :cond_4
    iget-object v2, v2, Ll/ᩳۧۢ;->ۧ:Ll/ۧ۫᩷;

    if-nez v2, :cond_3

    .line 465
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    .line 468
    :cond_5
    iget-object v0, p0, Ll/۫ۧۢ;->᩵:Ll/ۚۡ֫;

    invoke-virtual {v0}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    if-eqz v2, :cond_6

    .line 470
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v4

    if-ne v3, v4, :cond_6

    .line 471
    invoke-interface {v2, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_6

    return-void

    .line 474
    :cond_6
    iput-object v1, p0, Ll/۫ۧۢ;->ᩴ:Ljava/util/Set;

    .line 1739
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    .line 445
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1260
    iget-object v0, p0, Ll/۫ۧۢ;->᩷:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ".dex"

    .line 0
    invoke-static {p1, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 240
    iget-object v0, p0, Ll/۫ۧۢ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()V
    .locals 4

    .line 1711
    iget-object v0, p0, Ll/۫ۧۢ;->֡:Landroid/os/Bundle;

    if-nez v0, :cond_0

    return-void

    .line 1717
    :cond_0
    invoke-virtual {p0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "options"

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1719
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 1720
    iget-object v2, p0, Ll/۫ۧۢ;->֡:Landroid/os/Bundle;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1721
    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    move-result-object v2

    .line 1722
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 1723
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->֫([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1743
    iget-object v1, p0, Ll/۫ۧۢ;->ܺ:Ll/ۚۡ֫;

    invoke-virtual {v1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩹()V
    .locals 1

    .line 1375
    iget-object v0, p0, Ll/۫ۧۢ;->᩹:Ll/֡ᩳۢ;

    invoke-virtual {v0}, Ll/֡ᩳۢ;->ܽ()V

    .line 1376
    invoke-virtual {v0}, Ll/֡ᩳۢ;->ܿ()V

    return-void
.end method

.method public final ᩻(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 427
    iget-object v0, p0, Ll/۫ۧۢ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۧۢ;

    .line 428
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Ll/ᩳۧۢ;->ܽ:Ljava/lang/String;

    return-object p1
.end method

.method public final ᩻()V
    .locals 5

    .line 1006
    invoke-virtual {p0}, Ll/ܶ۬᩷;->ۧ()Ll/ۧ۫᩷;

    move-result-object v0

    .line 148
    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 1008
    iget-object v1, p0, Ll/۫ۧۢ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1009
    invoke-direct {p0, v2}, Ll/۫ۧۢ;->֡(Ljava/lang/String;)Ll/ۧ۫᩷;

    move-result-object v3

    .line 1010
    invoke-virtual {v3}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 1011
    new-instance v3, Ll/ۧ۫᩷;

    invoke-virtual {p0}, Ll/۫ۧۢ;->ۘ()Ll/ۧ۫᩷;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    .line 1013
    :cond_1
    invoke-virtual {p0, v2}, Ll/۫ۧۢ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 1014
    invoke-virtual {v3}, Ll/ۧ۫᩷;->ۡ()Ljava/io/InputStream;

    move-result-object v3

    const/4 v4, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1015
    :try_start_1
    invoke-static {v3, v2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    .line 1016
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_2
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_3

    .line 1014
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz v3, :cond_4

    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw v0

    :cond_5
    return-void
.end method
