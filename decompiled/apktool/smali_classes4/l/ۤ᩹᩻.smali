.class public Ll/ۤ᩹᩻;
.super Ll/᩹ܶۢ;
.source "E1YX"


# static fields
.field public static final synthetic ֡֫:I


# instance fields
.field public ۘ֫:J

.field public ᩴ֫:Ll/᩸᩶᩻;

.field public ᩵֫:Ll/ᩳܰۡ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 95
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 222
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 223
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_0
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "zipPath"

    .line 107
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a27

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 102
    sget-object v0, Ll/᩻ܶۢ;->᩻:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "ARG_PATHS"

    .line 141
    invoke-virtual {v0, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const-string v2, "zipPath"

    .line 120
    invoke-virtual {v0, v2}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 121
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->ۛ()Ll/ۨۧᩳ;

    move-result-object v3

    const-string v4, "keepApkSigBlock"

    .line 122
    invoke-virtual {v0, v4}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    .line 123
    invoke-static {v2, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 125
    sget-object v5, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-static {v2, v5}, Ll/ᩳ֨ۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V

    .line 127
    new-instance v5, Ll/ᩳܰۡ;

    invoke-direct {v5, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v5, v0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 128
    :goto_0
    invoke-static {v2, v6}, Ll/᩹᩶᩻;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩸᩶᩻;

    move-result-object v6

    iput-object v6, v0, Ll/ۤ᩹᩻;->ᩴ֫:Ll/᩸᩶᩻;

    .line 129
    invoke-virtual {v6}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v6

    if-nez v3, :cond_1

    if-eqz v4, :cond_1

    .line 130
    iget-object v4, v0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v4}, Ll/ᩳܰۡ;->ܶ()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 131
    iget-object v4, v0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v6, v4}, Ll/ۡܰۡ;->֫(Ll/ᩳܰۡ;)V

    .line 133
    :cond_1
    iget-object v4, v0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v4}, Ll/ᩳܰۡ;->᩸()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 134
    invoke-virtual {v6}, Ll/ۡܰۡ;->ᩳ()V

    .line 136
    :cond_2
    iget-object v4, v0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v4}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v4

    .line 138
    invoke-static {v4}, Ll/᩹᩶᩻;->֫(Ljava/util/Collection;)J

    move-result-wide v7

    .line 139
    new-instance v9, Ll/۫᩹᩻;

    invoke-direct {v9, v0, v7, v8}, Ll/۫᩹᩻;-><init>(Ll/ۤ᩹᩻;J)V

    .line 152
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 153
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 154
    array-length v10, v1

    const/4 v11, 0x0

    :goto_1
    const-string v12, "/"

    if-ge v11, v10, :cond_4

    aget-object v13, v1, v11

    .line 155
    invoke-virtual {v13, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 156
    invoke-virtual {v13, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 158
    :cond_3
    invoke-virtual {v13, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 163
    :cond_4
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v10, 0x0

    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۗ᩺ۡ;

    .line 164
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 165
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v1

    return-object v1

    .line 168
    :cond_6
    invoke-virtual {v11}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_4

    .line 171
    :cond_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 172
    invoke-virtual {v11}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_8

    .line 179
    :goto_4
    invoke-virtual {v11}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v13

    if-nez v13, :cond_5

    .line 180
    iget-wide v13, v0, Ll/ۤ᩹᩻;->ۘ֫:J

    invoke-virtual {v11}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v15

    add-long/2addr v13, v15

    iput-wide v13, v0, Ll/ۤ᩹᩻;->ۘ֫:J

    goto :goto_3

    :cond_9
    add-int/lit8 v10, v10, 0x1

    .line 186
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const v14, 0x7f120ac0

    invoke-static {v14}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "("

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, ")"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 186
    invoke-virtual {v0, v13}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 188
    invoke-virtual {v11}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 189
    invoke-virtual {v11}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v13

    if-eqz v13, :cond_a

    .line 190
    invoke-virtual {v6, v11}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto/16 :goto_3

    .line 192
    :cond_a
    iget-object v13, v0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-static {v11, v13, v6, v9}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/۠᩶᩻;)V

    .line 193
    iget-wide v13, v0, Ll/ۤ᩹᩻;->ۘ֫:J

    invoke-virtual {v11}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v15

    add-long/2addr v13, v15

    iput-wide v13, v0, Ll/ۤ᩹᩻;->ۘ֫:J

    goto/16 :goto_3

    :cond_b
    const/4 v1, 0x0

    const/16 v4, 0x64

    .line 197
    invoke-virtual {v0, v4}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 198
    invoke-virtual {v0, v4}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 200
    invoke-virtual {v6}, Ll/ۡܰۡ;->close()V

    if-eqz v3, :cond_c

    .line 203
    iget-object v4, v0, Ll/ۤ᩹᩻;->ᩴ֫:Ll/᩸᩶᩻;

    invoke-static {v4, v3, v0}, Ll/ۤۗܳ;->֫(Ll/᩸᩶᩻;Ll/ۨۧᩳ;Ll/ۘ۠ۢ;)V

    .line 205
    :cond_c
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_d

    .line 206
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v1

    return-object v1

    .line 208
    :cond_d
    invoke-static {v2}, Ll/ᩴܶۡ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 209
    new-instance v3, Ll/ܿ᩵ܿ;

    invoke-direct {v3}, Ll/ܿ᩵ܿ;-><init>()V

    .line 210
    invoke-virtual {v3, v2}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 212
    iget-object v4, v0, Ll/ۤ᩹᩻;->ᩴ֫:Ll/᩸᩶᩻;

    new-instance v6, Ll/۬᩹᩻;

    invoke-direct {v6, v0, v2}, Ll/۬᩹᩻;-><init>(Ll/ۤ᩹᩻;Ll/ܶ᩵ܿ;)V

    iget-object v7, v0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    new-array v5, v5, [Ljava/lang/AutoCloseable;

    aput-object v7, v5, v1

    invoke-virtual {v4, v2, v6, v5}, Ll/᩸᩶᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;[Ljava/lang/AutoCloseable;)V

    .line 216
    invoke-virtual {v3, v2}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 217
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v1

    return-object v1
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 229
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 230
    iget-object p1, p0, Ll/ۤ᩹᩻;->ᩴ֫:Ll/᩸᩶᩻;

    if-eqz p1, :cond_0

    .line 231
    invoke-virtual {p1}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object p1

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 232
    iget-object p1, p0, Ll/ۤ᩹᩻;->ᩴ֫:Ll/᩸᩶᩻;

    invoke-virtual {p1}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 235
    :cond_0
    iget-object p1, p0, Ll/ۤ᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 236
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 112
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 113
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
