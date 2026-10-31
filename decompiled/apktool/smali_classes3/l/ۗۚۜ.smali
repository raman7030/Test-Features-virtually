.class public final Ll/ۗۚۜ;
.super Ljava/lang/Object;
.source "874F"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public final ֫:Ll/᩸۠֫;

.field public final ۧ:Ll/᩵֨ۜ;


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/᩵֨ۜ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/ۗۚۜ;->֫:Ll/᩸۠֫;

    .line 23
    iput-object p2, p0, Ll/ۗۚۜ;->ۧ:Ll/᩵֨ۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۗۚۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->close()V

    return-void
.end method

.method public final read([BII)I
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ۗۚۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 3

    .line 30
    iget-object v0, p0, Ll/ۗۚۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v0

    .line 31
    iget-object v2, p0, Ll/ۗۚۜ;->ۧ:Ll/᩵֨ۜ;

    invoke-virtual {v2, p1}, Ll/᩵֨ۜ;->֫(Ll/ۗ۠֫;)V

    return-wide v0
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۗۚۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۗۚۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ۗۚۜ;->֫:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
