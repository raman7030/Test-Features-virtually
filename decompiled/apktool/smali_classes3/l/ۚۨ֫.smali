.class public final Ll/ۚۨ֫;
.super Ll/ܰܽۧ;
.source "A7N6"


# instance fields
.field public final ܿ:J

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>(JLjava/util/List;)V
    .locals 2

    .line 1169
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Ll/ܰܽۧ;-><init>(J)V

    .line 1171
    iput-wide p1, p0, Ll/ۚۨ֫;->ܿ:J

    .line 1172
    iput-object p3, p0, Ll/ۚۨ֫;->ᩳ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 4

    .line 1185
    invoke-virtual {p0}, Ll/ܰܽۧ;->ܽ()V

    .line 1187
    invoke-virtual {p0}, Ll/ܰܽۧ;->ᩳ()J

    move-result-wide v0

    long-to-int v1, v0

    iget-object v0, p0, Ll/ۚۨ֫;->ᩳ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩺֫;

    iget-wide v0, v0, Ll/᩹᩺֫;->ۨ:J

    iget-wide v2, p0, Ll/ۚۨ֫;->ܿ:J

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final ۧ()J
    .locals 5

    .line 1192
    invoke-virtual {p0}, Ll/ܰܽۧ;->ܽ()V

    .line 1193
    invoke-virtual {p0}, Ll/ܰܽۧ;->ᩳ()J

    move-result-wide v0

    long-to-int v1, v0

    iget-object v0, p0, Ll/ۚۨ֫;->ᩳ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩺֫;

    .line 1194
    iget-wide v1, p0, Ll/ۚۨ֫;->ܿ:J

    iget-wide v3, v0, Ll/᩹᩺֫;->ۨ:J

    add-long/2addr v1, v3

    .line 1195
    iget-wide v3, v0, Ll/᩹᩺֫;->ۙ:J

    add-long/2addr v1, v3

    return-wide v1
.end method
