.class public final Ll/ۨᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public final ֫:Ll/۫ᩴ֫;

.field public final ۧ:J

.field public final ܳ:Ljava/lang/Object;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ll/ܳ۬ܺ;

.field public final ᩳ:Ljava/util/List;

.field public final ᩻:Landroid/net/Uri;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    const/4 v0, 0x5

    .line 1242
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x6

    .line 1243
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x7

    .line 1244
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ll/۫ᩴ֫;Ljava/util/List;Ll/ܳ۬ܺ;Ljava/lang/Object;J)V
    .locals 0

    .line 1185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1186
    iput-object p1, p0, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    .line 1187
    invoke-static {p2}, Ll/ۢ᩵֫;->ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨᩴ֫;->ܽ:Ljava/lang/String;

    .line 1188
    iput-object p3, p0, Ll/ۨᩴ֫;->֫:Ll/۫ᩴ֫;

    .line 1190
    iput-object p4, p0, Ll/ۨᩴ֫;->ᩳ:Ljava/util/List;

    .line 1192
    iput-object p5, p0, Ll/ۨᩴ֫;->ܿ:Ll/ܳ۬ܺ;

    .line 1193
    sget p1, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance p1, Ll/֫۬ܺ;

    invoke-direct {p1}, Ll/֫۬ܺ;-><init>()V

    const/4 p2, 0x0

    .line 1194
    :goto_0
    invoke-virtual {p5}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    .line 1195
    invoke-interface {p5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֫᩵֫;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1703
    new-instance p4, Ll/۟ᩴ֫;

    invoke-direct {p4, p3}, Ll/۟ᩴ֫;-><init>(Ll/֫᩵֫;)V

    .line 1646
    new-instance p3, Ll/ܰᩴ֫;

    .line 1838
    invoke-direct {p3, p4}, Ll/֫᩵֫;-><init>(Ll/۟ᩴ֫;)V

    .line 1195
    invoke-virtual {p1, p3}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 1197
    :cond_0
    invoke-virtual {p1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    .line 1198
    iput-object p6, p0, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    .line 1199
    iput-wide p7, p0, Ll/ۨᩴ֫;->ۧ:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 1207
    :cond_0
    instance-of v0, p1, Ll/ۨᩴ֫;

    if-nez v0, :cond_1

    goto :goto_1

    .line 1210
    :cond_1
    check-cast p1, Ll/ۨᩴ֫;

    .line 1212
    iget-object v0, p0, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    iget-object v1, p1, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۨᩴ֫;->ܽ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۨᩴ֫;->ܽ:Ljava/lang/String;

    .line 1213
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۨᩴ֫;->֫:Ll/۫ᩴ֫;

    iget-object v1, p1, Ll/ۨᩴ֫;->֫:Ll/۫ᩴ֫;

    .line 1214
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1215
    iget-object v0, p0, Ll/ۨᩴ֫;->ᩳ:Ljava/util/List;

    iget-object v1, p1, Ll/ۨᩴ֫;->ᩳ:Ljava/util/List;

    .line 1216
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1217
    iget-object v0, p0, Ll/ۨᩴ֫;->ܿ:Ll/ܳ۬ܺ;

    iget-object v1, p1, Ll/ۨᩴ֫;->ܿ:Ll/ܳ۬ܺ;

    .line 1218
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    iget-object v1, p1, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    .line 1219
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Ll/ۨᩴ֫;->ۧ:J

    iget-wide v2, p1, Ll/ۨᩴ֫;->ۧ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1225
    iget-object v0, p0, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    .line 1226
    iget-object v2, p0, Ll/ۨᩴ֫;->ܽ:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 1227
    iget-object v2, p0, Ll/ۨᩴ֫;->֫:Ll/۫ᩴ֫;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ll/۫ᩴ֫;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3c1

    .line 1229
    iget-object v2, p0, Ll/ۨᩴ֫;->ᩳ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x3c1

    .line 1231
    iget-object v0, p0, Ll/ۨᩴ֫;->ܿ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/ܳ۬ܺ;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 1232
    iget-object v2, p0, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    const-wide/16 v1, 0x1f

    int-to-long v3, v0

    mul-long v3, v3, v1

    .line 1233
    iget-wide v0, p0, Ll/ۨᩴ֫;->ۧ:J

    add-long/2addr v3, v0

    long-to-int v0, v3

    return v0
.end method
