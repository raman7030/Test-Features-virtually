.class public final Ll/ܽۤܺ;
.super Ll/ۜۤܺ;
.source "067E"


# instance fields
.field public final synthetic ᩸:Ll/ᩳۤܺ;


# direct methods
.method public constructor <init>(Ll/ᩳۤܺ;)V
    .locals 0

    .line 4201
    iput-object p1, p0, Ll/ܽۤܺ;->᩸:Ll/ᩳۤܺ;

    .line 82
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 4209
    iget-object v0, p0, Ll/ܽۤܺ;->᩸:Ll/ᩳۤܺ;

    check-cast v0, Ll/᩻ۙܺ;

    .line 168
    iget-object v0, v0, Ll/᩻ۙܺ;->ۙ:Ll/ۜۙܺ;

    invoke-virtual {v0}, Ll/ۜۙܺ;->ۧ()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 1

    .line 4204
    iget-object v0, p0, Ll/ܽۤܺ;->᩸:Ll/ᩳۤܺ;

    return-object v0
.end method
