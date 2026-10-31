.class public final Ll/ۚۛܳ;
.super Ll/ܽ᩷ܳ;
.source "6B6V"

# interfaces
.implements Ll/᩶ۙܳ;


# instance fields
.field public ۗ:Ll/ۗۛܳ;

.field public ۙ:Ll/ܽۙܳ;

.field public final ۬:Ll/ۖۛܳ;

.field public final ᩶:Ll/ۜ᩶ܳ;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ll/᩻᩶ܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "archive"

    .line 59
    invoke-static {v0}, Ll/ܰۜܳ;->֫(Ljava/lang/String;)V

    .line 60
    new-instance v1, Ll/ۘۛܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "local"

    invoke-static {v0, v2, v1}, Ll/ۡ᩻ܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢ᩻ܳ;)V

    return-void
.end method

.method public constructor <init>(ILnet/sf/sevenzipjbinding/IInArchive;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    const-string v0, "/"

    .line 72
    invoke-direct {p0, p1, v0}, Ll/ܽ᩷ܳ;-><init>(ILjava/lang/String;)V

    .line 245
    new-instance p1, Ll/ܽۙܳ;

    const-string v0, "archive"

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ll/ܽۙܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۚۛܳ;->ۙ:Ll/ܽۙܳ;

    .line 257
    new-instance p1, Ll/᩻᩶ܳ;

    invoke-direct {p1, p0}, Ll/᩻᩶ܳ;-><init>(Ll/᩶ۙܳ;)V

    iput-object p1, p0, Ll/ۚۛܳ;->᩹:Ll/᩻᩶ܳ;

    .line 259
    new-instance p1, Ll/ۜ᩶ܳ;

    invoke-direct {p1, p0}, Ll/ۜ᩶ܳ;-><init>(Ll/᩶ۙܳ;)V

    iput-object p1, p0, Ll/ۚۛܳ;->᩶:Ll/ۜ᩶ܳ;

    .line 73
    new-instance p1, Ll/ۖۛܳ;

    invoke-direct {p1, p3, p4}, Ll/ۖۛܳ;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    iput-object p1, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    .line 74
    invoke-virtual {p1}, Ll/ۖۛܳ;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object p4

    invoke-virtual {p4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Ll/ۚۛܳ;->᩸:Ljava/lang/String;

    .line 75
    invoke-virtual {p0, p3}, Ll/ܽ᩷ܳ;->ᩳ(Ljava/lang/String;)V

    .line 77
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ۖۛܳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;)V

    .line 78
    invoke-virtual {p1}, Ll/ۖۛܳ;->ܳ()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 79
    new-instance p2, Ll/ۗۛܳ;

    invoke-direct {p2, p1}, Ll/ۗۛܳ;-><init>(Ll/ۖۛܳ;)V

    iput-object p2, p0, Ll/ۚۛܳ;->ۗ:Ll/ۗۛܳ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 83
    new-instance p2, Ll/᩵ۤۡ;

    const p3, 0x7f120711

    invoke-static {p3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p3

    .line 14
    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p2, p1}, Ll/᩵ۤۡ;->initCause(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 3

    .line 88
    invoke-direct {p0, p1}, Ll/ܽ᩷ܳ;-><init>(Ll/۬ۜܽ;)V

    .line 245
    new-instance v0, Ll/ܽۙܳ;

    const-string v1, "archive"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܽۙܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۚۛܳ;->ۙ:Ll/ܽۙܳ;

    .line 257
    new-instance v0, Ll/᩻᩶ܳ;

    invoke-direct {v0, p0}, Ll/᩻᩶ܳ;-><init>(Ll/᩶ۙܳ;)V

    iput-object v0, p0, Ll/ۚۛܳ;->᩹:Ll/᩻᩶ܳ;

    .line 259
    new-instance v0, Ll/ۜ᩶ܳ;

    invoke-direct {v0, p0}, Ll/ۜ᩶ܳ;-><init>(Ll/᩶ۙܳ;)V

    iput-object v0, p0, Ll/ۚۛܳ;->᩶:Ll/ۜ᩶ܳ;

    .line 89
    invoke-static {p1}, Ll/ۖۛܳ;->ۧ(Ll/۬ۜܽ;)Ll/ۖۛܳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    .line 90
    invoke-virtual {p1}, Ll/ۖۛܳ;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۛܳ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۛܳ;)Ll/ۖۛܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ۚۛܳ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 52
    iget-object p0, p0, Ll/ܽ᩷ܳ;->ۢ:Ll/ܶ᩵ܿ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ܽۙܳ;
    .locals 1

    .line 254
    iget-object v0, p0, Ll/ۚۛܳ;->ۙ:Ll/ܽۙܳ;

    return-object v0
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 95
    invoke-super {p0, p1}, Ll/ܽ᩷ܳ;->֫(Ll/ۤۜܽ;)V

    .line 96
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v0, p1}, Ll/ۖۛܳ;->֫(Ll/ۤۜܽ;)V

    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v0, p1}, Ll/ۖۛܳ;->֫(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public final ֫(Ll/ܽۙܳ;)V
    .locals 0

    .line 249
    iput-object p1, p0, Ll/ۚۛܳ;->ۙ:Ll/ܽۙܳ;

    return-void
.end method

.method public final synthetic ֫(Ll/ܽۢܳ;Landroid/view/View;Ll/ܽۙܳ;Ll/ᩳۙܳ;)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p3, p4}, Ll/᩹ۙܳ;->֫(Ll/᩶ۙܳ;Ll/ܽۢܳ;Ll/ܽۙܳ;Ll/ᩳۙܳ;)V

    return-void
.end method

.method public final ֫(Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 1

    .line 271
    new-instance v0, Ll/֡ۛܳ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/֡ۛܳ;-><init>(Ll/ۚۛܳ;Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V

    .line 387
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final ֫(Ll/ܽۢܳ;Ll/ܽۢܳ;)V
    .locals 1

    .line 194
    iget-object p1, p0, Ll/ۚۛܳ;->᩸:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 195
    iget-object p1, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {p1}, Ll/ۖۛܳ;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final declared-synchronized ֫(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 109
    :try_start_0
    iget-object v1, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v1, p1}, Ll/ۖۛܳ;->ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
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

.method public final ۗ()Ljava/lang/String;
    .locals 1

    const-string v0, "archive"

    return-object v0
.end method

.method public final ۘ()Ll/֫ۜܳ;
    .locals 3

    .line 160
    new-instance v0, Ll/֨ۛܳ;

    const v1, 0x7f1205f2

    const v2, 0x7f080227

    .line 12
    invoke-direct {v0, v1, v2}, Ll/֫ۜܳ;-><init>(II)V

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 2

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۚۛܳ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ll/ܽ᩷ܳ;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۛ()Ljava/util/List;
    .locals 8

    .line 231
    new-instance v0, Ll/۠ۚܳ;

    invoke-direct {v0}, Ll/۠ۚܳ;-><init>()V

    .line 239
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->ܽ()Ll/ۤۜܳ;

    move-result-object v1

    .line 240
    invoke-static {}, Ll/ܽ᩷ܳ;->ܽ֫()Ll/ۤۜܳ;

    move-result-object v2

    const v3, 0x7f1205b4

    const/4 v4, 0x1

    .line 241
    invoke-static {v3, v4}, Ll/ܽ᩷ܳ;->֫(IZ)Ll/ۤۜܳ;

    move-result-object v3

    const/16 v5, 0xa

    new-array v5, v5, [Ll/ۤۜܳ;

    sget-object v6, Ll/ܽ᩷ܳ;->ᩴ:Ll/ۤۜܳ;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    iget-object v6, p0, Ll/ۚۛܳ;->᩹:Ll/᩻᩶ܳ;

    aput-object v6, v5, v4

    const/4 v4, 0x2

    iget-object v6, p0, Ll/ۚۛܳ;->᩶:Ll/ۜ᩶ܳ;

    aput-object v6, v5, v4

    sget-object v4, Ll/ܽ᩷ܳ;->᩵:Ll/ۤۜܳ;

    const/4 v6, 0x3

    aput-object v4, v5, v6

    sget-object v4, Ll/ܽ᩷ܳ;->ۘ:Ll/ۤۜܳ;

    const/4 v6, 0x4

    aput-object v4, v5, v6

    const/4 v4, 0x5

    aput-object v0, v5, v4

    sget-object v0, Ll/ܽ᩷ܳ;->֡:Ll/ۤۜܳ;

    const/4 v4, 0x6

    aput-object v0, v5, v4

    const/4 v0, 0x7

    aput-object v1, v5, v0

    const/16 v0, 0x8

    aput-object v2, v5, v0

    const/16 v0, 0x9

    aput-object v3, v5, v0

    .line 231
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۟()Z
    .locals 1

    .line 179
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->ܶ()Z

    move-result v0

    return v0
.end method

.method public final ۤ()Ljava/util/List;
    .locals 4

    .line 146
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->᩶ۧ()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 147
    invoke-virtual {p0, v2}, Ll/ۚۛܳ;->ۧ(Z)V

    .line 149
    :cond_0
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    .line 199
    invoke-virtual {v0, v1, v3}, Ll/ۖۛܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v0

    .line 150
    sget-object v1, Ll/ܺۘܳ;->֫֫:Ll/ᩳۜܳ;

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-object v0
.end method

.method public final ۧ(Ll/ᩳۜܳ;)Ll/ܶ᩵ܿ;
    .locals 2

    .line 263
    iget-object v0, p0, Ll/ܽ᩷ܳ;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ֡᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 264
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 265
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ()Z

    return-object p1
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 134
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v0, p1}, Ll/ۖۛܳ;->֫(Z)V

    .line 135
    invoke-virtual {v0}, Ll/ۖۛܳ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 136
    iget-object p1, p0, Ll/ۚۛܳ;->ۗ:Ll/ۗۛܳ;

    if-eqz p1, :cond_0

    .line 137
    invoke-virtual {p1}, Ll/ۗۛܳ;->ۧ()V

    .line 139
    :cond_0
    new-instance p1, Ll/ۗۛܳ;

    invoke-direct {p1, v0}, Ll/ۗۛܳ;-><init>(Ll/ۖۛܳ;)V

    iput-object p1, p0, Ll/ۚۛܳ;->ۗ:Ll/ۗۛܳ;

    :cond_1
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x1

    .line 200
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 201
    iget-object v1, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v1, p1}, Ll/ۖۛܳ;->getEntry(Ljava/lang/String;)Ll/ۘܳᩳ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {p1}, Ll/ۘܳᩳ;->ۢ()Z

    move-result p1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۫()Z
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->֡()Z

    move-result v0

    return v0
.end method

.method public final ܳ()Ll/۫ۜܳ;
    .locals 4

    .line 174
    new-instance v0, Ll/۫ۜܳ;

    iget-object v1, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v1}, Ll/ۖۛܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/᩶ۖܳ;->᩵:Ll/᩶ۖܳ;

    iget-object v3, p0, Ll/ۚۛܳ;->᩸:Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Ll/۫ۜܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/᩶ۖܳ;)V

    return-object v0
.end method

.method public final declared-synchronized ܳ֫()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 105
    :try_start_0
    iget-object v1, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v1}, Ll/ۖۛܳ;->᩹()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ(Ll/ܽۢܳ;)V
    .locals 0

    .line 207
    invoke-virtual {p0, p1}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;)V

    return-void
.end method

.method public final ܿ֫()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩶()Ll/ܰܺܳ;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    return-object v0
.end method

.method public final ᩺()V
    .locals 1

    .line 212
    iget-object v0, p0, Ll/ۚۛܳ;->ۗ:Ll/ۗۛܳ;

    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {v0}, Ll/ۗۛܳ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ᩻()Ll/ۧۜܳ;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۚۛܳ;->۬:Ll/ۖۛܳ;

    .line 268
    invoke-virtual {v0}, Ll/ۖۛܳ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Ll/ۚۛܳ;->ۗ:Ll/ۗۛܳ;

    return-object v0

    .line 168
    :cond_0
    invoke-static {}, Ll/۫ۤܳ;->ۧ()Ll/۫ۤܳ;

    move-result-object v0

    return-object v0
.end method
