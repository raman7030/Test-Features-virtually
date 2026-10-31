.class public final Ll/ܶ۟ۜ;
.super Ljava/lang/Object;
.source "178J"

# interfaces
.implements Ll/᩶᩷ۧ;


# instance fields
.field public final ᩸:Ll/ᩴ᩷ۧ;

.field public final ᩹:Ll/֫۟ۜ;


# direct methods
.method public constructor <init>(Ll/ᩴ᩷ۧ;Ll/֫۟ۜ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ܶ۟ۜ;->᩸:Ll/ᩴ᩷ۧ;

    .line 39
    iput-object p2, p0, Ll/ܶ۟ۜ;->᩹:Ll/֫۟ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ll/ۤۘۧ;)Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public final ֫(Z)Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public final ֫(Landroid/net/Uri;Ljava/util/Map;)[Ll/֨᩷ۧ;
    .locals 5

    .line 55
    iget-object v0, p0, Ll/ܶ۟ۜ;->᩸:Ll/ᩴ᩷ۧ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩷ۧ;->֫(Landroid/net/Uri;Ljava/util/Map;)[Ll/֨᩷ۧ;

    move-result-object p2

    .line 60
    array-length v0, p2

    new-array v0, v0, [Ll/֨᩷ۧ;

    const/4 v1, 0x0

    .line 61
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_1

    .line 62
    aget-object v2, p2, v1

    .line 63
    invoke-interface {v2}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object v3

    .line 64
    instance-of v3, v3, Ll/۬ۖۧ;

    if-eqz v3, :cond_0

    .line 65
    new-instance v3, Ll/۠۟ۜ;

    iget-object v4, p0, Ll/ܶ۟ۜ;->᩹:Ll/֫۟ۜ;

    invoke-direct {v3, v2, v4, p1}, Ll/۠۟ۜ;-><init>(Ll/֨᩷ۧ;Ll/֫۟ۜ;Landroid/net/Uri;)V

    move-object v2, v3

    .line 66
    :cond_0
    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
