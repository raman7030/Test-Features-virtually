.class public final Ll/᩷۟ۜ;
.super Ljava/lang/Object;
.source "R790"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1284
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1285
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷۟ۜ;->ۧ:Ljava/util/ArrayList;

    .line 1286
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩷۟ۜ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷۟ۜ;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷۟ۜ;->֫:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩷۟ۜ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷۟ۜ;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method
