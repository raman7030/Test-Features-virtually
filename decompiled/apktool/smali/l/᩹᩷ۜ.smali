.class public final Ll/᩹᩷ۜ;
.super Ljava/lang/Object;
.source "D76O"

# interfaces
.implements Ll/֫ۨ֡;


# instance fields
.field public ֫:Ll/ܽۨ֡;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/ܿۜۜ;

.field public ܿ:J

.field public ᩳ:Ljava/lang/String;


# virtual methods
.method public final ֫(Ll/ܿۜۜ;Ljava/util/ArrayList;Ll/ܽۨ֡;J)V
    .locals 0

    .line 177
    iput-object p1, p0, Ll/᩹᩷ۜ;->ܽ:Ll/ܿۜۜ;

    .line 178
    iput-object p2, p0, Ll/᩹᩷ۜ;->ۧ:Ljava/util/ArrayList;

    .line 179
    iput-object p3, p0, Ll/᩹᩷ۜ;->֫:Ll/ܽۨ֡;

    .line 180
    iput-wide p4, p0, Ll/᩹᩷ۜ;->ܿ:J

    const/4 p1, 0x0

    .line 181
    iput-object p1, p0, Ll/᩹᩷ۜ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/֨ۗ֡;J)Z
    .locals 12

    .line 186
    iget-wide v0, p0, Ll/᩹᩷ۜ;->ܿ:J

    cmp-long v2, p2, v0

    if-eqz v2, :cond_0

    goto :goto_0

    .line 189
    :cond_0
    iget-object p2, p0, Ll/᩹᩷ۜ;->ᩳ:Ljava/lang/String;

    if-nez p2, :cond_1

    .line 190
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Ll/᩹᩷ۜ;->֫:Ll/ܽۨ֡;

    .line 183
    iget-object p3, p3, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {p3}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object p3

    .line 190
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "->"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Ll/᩹᩷ۜ;->֫:Ll/ܽۨ֡;

    invoke-static {p3}, Ll/ۡ۠ۘ;->֫(Ll/ᩴ֫ۚ;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/᩹᩷ۜ;->ᩳ:Ljava/lang/String;

    .line 192
    :cond_1
    iget-object p2, p0, Ll/᩹᩷ۜ;->ۧ:Ljava/util/ArrayList;

    new-instance p3, Ll/ᩳ᩷ۜ;

    iget-object v4, p0, Ll/᩹᩷ۜ;->ᩳ:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/᩹᩷ۜ;->ܽ:Ll/ܿۜۜ;

    iget-object p1, p1, Ll/ܿۜۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v1, "dex"

    const-string v2, "resource_id"

    const-string v3, "dex_method"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v11}, Ll/ᩳ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    iget-object p1, p0, Ll/᩹᩷ۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object p2, p0, Ll/᩹᩷ۜ;->ܽ:Ll/ܿۜۜ;

    iget p2, p2, Ll/ܿۜۜ;->ۧ:I

    if-ge p1, p2, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
