.class public final Ll/ܰᩳۚ;
.super Ll/֨۬֡;
.source "359P"

# interfaces
.implements Ll/ܿܿۚ;


# instance fields
.field public final ᩸:Ll/ۛ۬ܺ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Collection;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ܰᩳۚ;->᩹:Ljava/lang/String;

    .line 56
    invoke-static {p2}, Ll/᩷ᩳۚ;->֫(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܰᩳۚ;->᩸:Ll/ۛ۬ܺ;

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܰᩳۚ;->᩸:Ll/ۛ۬ܺ;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ܰᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method
