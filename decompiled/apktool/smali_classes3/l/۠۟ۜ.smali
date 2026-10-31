.class public final Ll/۠۟ۜ;
.super Ljava/lang/Object;
.source "178J"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/֨᩷ۧ;

.field public final ۧ:Ll/֫۟ۜ;

.field public final ܽ:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ll/֨᩷ۧ;Ll/֫۟ۜ;Landroid/net/Uri;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    .line 84
    iput-object p2, p0, Ll/۠۟ۜ;->ۧ:Ll/֫۟ۜ;

    .line 85
    iput-object p3, p0, Ll/۠۟ۜ;->ܽ:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 1

    .line 105
    iget-object v0, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, p1, p2}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 1

    .line 115
    iget-object v0, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0}, Ll/֨᩷ۧ;->֫()V

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/֨᩷ۧ;->֫(JJ)V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 3

    .line 100
    new-instance v0, Ll/֨۟ۜ;

    iget-object v1, p0, Ll/۠۟ۜ;->ۧ:Ll/֫۟ۜ;

    iget-object v2, p0, Ll/۠۟ۜ;->ܽ:Landroid/net/Uri;

    invoke-direct {v0, p1, v1, v2}, Ll/֨۟ۜ;-><init>(Ll/᩸᩷ۧ;Ll/֫۟ۜ;Landroid/net/Uri;)V

    iget-object p1, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    invoke-interface {p1, v0}, Ll/֨᩷ۧ;->֫(Ll/᩸᩷ۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 1

    .line 90
    iget-object v0, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, p1}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0}, Ll/֨᩷ۧ;->ܳ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/۠۟ۜ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object v0

    return-object v0
.end method
