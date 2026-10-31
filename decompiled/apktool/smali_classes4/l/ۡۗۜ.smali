.class public final Ll/ۡۗۜ;
.super Ljava/lang/Object;
.source "075F"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:Ll/᩸۠֫;

.field public final ۧ:Ljava/util/ArrayList;

.field public final synthetic ܽ:Ll/ᩴۗۜ;


# direct methods
.method public constructor <init>(Ll/ᩴۗۜ;)V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۗۜ;->ܽ:Ll/ᩴۗۜ;

    .line 172
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۡۗۜ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 221
    iget-object v0, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 224
    :try_start_0
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 227
    iput-object v1, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    .line 228
    throw v0

    .line 227
    :cond_0
    :goto_0
    iput-object v1, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    return-void
.end method

.method public final read([BII)I
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    .line 202
    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    return p1

    .line 200
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Data source is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 4

    .line 185
    iget-object v0, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    if-nez v0, :cond_5

    .line 188
    iget-object v0, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    .line 233
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    .line 234
    :cond_0
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "http"

    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Ll/ۡۗۜ;->ܽ:Ll/ᩴۗۜ;

    if-nez v2, :cond_3

    const-string v2, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "mt_media"

    .line 238
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {v3}, Ll/ᩴۗۜ;->֫(Ll/ᩴۗۜ;)Ll/ܶ۠֫;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 239
    invoke-static {v3}, Ll/ᩴۗۜ;->֫(Ll/ᩴۗۜ;)Ll/ܶ۠֫;

    move-result-object v0

    invoke-interface {v0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v0

    goto :goto_2

    .line 241
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unsupported media URI scheme"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 236
    :cond_3
    :goto_1
    invoke-static {v3}, Ll/ᩴۗۜ;->ۧ(Ll/ᩴۗۜ;)Ll/ܶ۠֫;

    move-result-object v0

    invoke-interface {v0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v0

    .line 188
    :goto_2
    iput-object v0, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    .line 189
    iget-object v0, p0, Ll/ۡۗۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܶ֫;

    .line 190
    iget-object v2, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v2, v1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    goto :goto_3

    .line 193
    :cond_4
    iget-object v0, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    .line 186
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Data source is already open"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    if-nez v0, :cond_0

    .line 216
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 178
    iget-object v0, p0, Ll/ۡۗۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 179
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۡۗۜ;->֫:Ll/᩸۠֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 209
    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
