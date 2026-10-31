.class public Ll/۫ܽ᩻;
.super Ll/ۛܶۢ;
.source "795C"


# instance fields
.field public ۖ֫:Ljava/util/ArrayList;

.field public ܺ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 176
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    .line 177
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ܽ᩻;->ۖ֫:Ljava/util/ArrayList;

    .line 178
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ܽ᩻;->ܺ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 247
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 248
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 250
    :cond_0
    iget-object p1, p0, Ll/۫ܽ᩻;->ۖ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 251
    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 252
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V
    .locals 1

    .line 239
    iget-object p2, p0, Ll/۫ܽ᩻;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p3, "\n"

    .line 240
    invoke-static {p2, p3}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const p3, 0x7f12051b

    const/4 v0, 0x0

    .line 425
    invoke-virtual {p1, p3, p2, v0}, Ll/ۗܺ᩷;->֫(ILjava/lang/String;Z)V

    :cond_0
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 1

    const v0, 0x7f120a89

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 182
    sget-object v0, Ll/᩻ܶۢ;->ܺ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 11

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "targetPath"

    .line 205
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 207
    sget-object v2, Ll/ܽ֨ۢ;->ۙ:Ll/ܽ֨ۢ;

    invoke-static {v1, v2}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V

    const-wide/16 v2, 0xc8

    .line 208
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    .line 210
    new-instance v2, Ll/᩵ۛۡ;

    array-length v3, v0

    int-to-long v3, v3

    invoke-direct {v2, v3, v4}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v3, Ll/᩺᩺᩷;

    invoke-direct {v3, p0}, Ll/᩺᩺᩷;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    const/16 v3, 0x3e8

    .line 212
    array-length v4, v0

    div-int/2addr v3, v4

    const/16 v4, 0xc8

    if-le v3, v4, :cond_0

    const/16 v3, 0xc8

    .line 216
    :cond_0
    array-length v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_3

    aget-object v7, v0, v6

    new-array v8, v5, [Ljava/lang/String;

    .line 217
    invoke-static {v7, v8}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 218
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    .line 41
    invoke-virtual {v2, v9}, Ll/᩵ۛۡ;->֫(I)Z

    .line 220
    invoke-virtual {p0, v8}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    if-lez v3, :cond_1

    int-to-long v9, v3

    .line 222
    invoke-static {v9, v10}, Landroid/os/SystemClock;->sleep(J)V

    .line 224
    :cond_1
    invoke-static {v1, v8}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v10, v5, [Ljava/lang/String;

    invoke-static {v9, v10}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 225
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۖ֫()Ljava/lang/String;

    move-result-object v7

    .line 238
    :try_start_0
    invoke-virtual {v9, v7}, Ll/ܶ᩵ܿ;->ܽ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 226
    iget-object v7, p0, Ll/۫ܽ᩻;->ۖ֫:Ljava/util/ArrayList;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 228
    :catch_0
    iget-object v7, p0, Ll/۫ܽ᩻;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    :goto_1
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 231
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 234
    :cond_3
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 258
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f12051c

    .line 197
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const v0, 0x7f120797

    .line 198
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    return-void
.end method
