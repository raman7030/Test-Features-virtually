.class public Ll/ۗܰܳ;
.super Ll/᩹ܶۢ;
.source "D1K5"


# static fields
.field public static final synthetic ᩴ֫:I


# instance fields
.field public ۘ֫:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 105
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 106
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۗܰܳ;->ۘ֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 177
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 178
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ܽ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 179
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 181
    :cond_0
    iget-object p1, p0, Ll/ۗܰܳ;->ۘ֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    .line 182
    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 183
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 1

    const v0, 0x7f1205ce

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 110
    sget-object v0, Ll/᩻ܶۢ;->ۜ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 128
    invoke-static {v0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ܳ֫֨;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ll/ܳ֫֨;-><init>(I)V

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/᩶ܰܳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܶ᩵ܿ;

    const-string v2, "dexVersion"

    .line 129
    invoke-virtual {v1, v2}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v2

    const-string v3, "onlyFixHeader"

    .line 130
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-nez v9, :cond_0

    const-string v3, "replaceWithNop"

    .line 131
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v12, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v12, 0x0

    .line 132
    :goto_0
    array-length v13, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v13, :cond_3

    .line 133
    aget-object v14, v0, v3

    const-string v4, ".tmp"

    .line 899
    invoke-virtual {v14, v4}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v15

    add-int/lit8 v16, v3, 0x1

    mul-int/lit8 v3, v16, 0x64

    .line 135
    div-int/2addr v3, v13

    .line 136
    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 137
    invoke-virtual {v1, v10}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 138
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 140
    :try_start_0
    new-instance v8, Ll/ۙܰܳ;

    invoke-direct {v8, v1}, Ll/ۙܰܳ;-><init>(Ll/ۗܰܳ;)V

    move-object v3, v14

    move-object v4, v15

    move v5, v2

    move v6, v9

    move v7, v12

    invoke-static/range {v3 .. v8}, Ll/ۡ۬ܳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;IZZLl/ܳ۬ܳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 161
    invoke-virtual {v15}, Ll/ܶ᩵ܿ;->۬()Z

    .line 162
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 164
    :cond_1
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "dfb"

    invoke-interface {v3, v4, v11}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 165
    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->᩶()V

    goto :goto_2

    .line 167
    :cond_2
    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->۫()Z

    :goto_2
    const/4 v3, 0x0

    .line 991
    invoke-virtual {v15, v14, v3}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V

    .line 170
    iget-object v3, v1, Ll/ۗܰܳ;->ۘ֫:Ljava/util/HashSet;

    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move/from16 v3, v16

    goto :goto_1

    :catch_0
    move-exception v0

    .line 157
    invoke-virtual {v15}, Ll/ܶ᩵ܿ;->۬()Z

    .line 158
    new-instance v2, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 172
    :cond_3
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 190
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f1205ce

    .line 120
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const v0, 0x7f120797

    .line 121
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    return-void
.end method
