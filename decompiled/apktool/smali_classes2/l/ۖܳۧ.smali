.class public final Ll/ۖܳۧ;
.super Ljava/lang/Object;
.source "C7MW"

# interfaces
.implements Ll/᩻ܳۧ;


# instance fields
.field public final ֫:Ll/ᩴܶ֫;

.field public final ۧ:Ll/ۗ۠֫;

.field public final ܳ:I

.field public final ܽ:J

.field public volatile ܿ:Ljava/lang/Object;

.field public final ᩳ:Ll/ܺܳۧ;


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ll/ܺܳۧ;)V
    .locals 1

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    new-instance v0, Ll/ᩴܶ֫;

    invoke-direct {v0, p1}, Ll/ᩴܶ֫;-><init>(Ll/᩸۠֫;)V

    iput-object v0, p0, Ll/ۖܳۧ;->֫:Ll/ᩴܶ֫;

    .line 134
    iput-object p2, p0, Ll/ۖܳۧ;->ۧ:Ll/ۗ۠֫;

    const/4 p1, 0x4

    .line 135
    iput p1, p0, Ll/ۖܳۧ;->ܳ:I

    .line 136
    iput-object p3, p0, Ll/ۖܳۧ;->ᩳ:Ll/ܺܳۧ;

    .line 137
    invoke-static {}, Ll/ۧۧۧ;->֫()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۖܳۧ;->ܽ:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 179
    iget-object v0, p0, Ll/ۖܳۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->᩷()V

    .line 180
    new-instance v0, Ll/᩶۠֫;

    iget-object v1, p0, Ll/ۖܳۧ;->֫:Ll/ᩴܶ֫;

    iget-object v2, p0, Ll/ۖܳۧ;->ۧ:Ll/ۗ۠֫;

    invoke-direct {v0, v1, v2}, Ll/᩶۠֫;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;)V

    .line 182
    :try_start_0
    invoke-virtual {v0}, Ll/᩶۠֫;->֫()V

    .line 183
    iget-object v1, p0, Ll/ۖܳۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v1}, Ll/ᩴܶ֫;->ܿ()Landroid/net/Uri;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    iget-object v2, p0, Ll/ۖܳۧ;->ᩳ:Ll/ܺܳۧ;

    invoke-interface {v2, v1, v0}, Ll/ܺܳۧ;->֫(Landroid/net/Uri;Ll/᩶۠֫;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ll/ۖܳۧ;->ܿ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 187
    throw v1
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ܳ()Landroid/net/Uri;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ۖܳۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->᩻()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 152
    iget-object v0, p0, Ll/ۖܳۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->ܳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ۖܳۧ;->ܿ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/Map;
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ۖܳۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
