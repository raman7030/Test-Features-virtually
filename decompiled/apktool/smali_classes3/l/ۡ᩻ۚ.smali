.class public final Ll/ۡ᩻ۚ;
.super Ljava/util/AbstractSet;
.source "C2RY"


# instance fields
.field public final synthetic ᩸:Ll/ᩳ᩻ۚ;

.field public final synthetic ᩹:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ll/ᩳ᩻ۚ;)V
    .locals 0

    .line 78
    iput-object p1, p0, Ll/ۡ᩻ۚ;->᩹:Ljava/util/Set;

    iput-object p2, p0, Ll/ۡ᩻ۚ;->᩸:Ll/ᩳ᩻ۚ;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 82
    iget-object v0, p0, Ll/ۡ᩻ۚ;->᩹:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 83
    new-instance v1, Ll/᩻᩻ۚ;

    invoke-direct {v1, p0, v0}, Ll/᩻᩻ۚ;-><init>(Ll/ۡ᩻ۚ;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۡ᩻ۚ;->᩹:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method
