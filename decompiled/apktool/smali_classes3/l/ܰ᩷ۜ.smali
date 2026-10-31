.class public final Ll/ܰ᩷ۜ;
.super Ljava/lang/Object;
.source "A797"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/util/HashMap;

.field public final ܳ:Ljava/util/HashMap;

.field public ܽ:Ljava/util/HashSet;

.field public final ܿ:Ll/᩺᩷ۜ;

.field public ᩳ:Ll/ۨ᩷ۜ;

.field public final ᩻:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(ZLl/᩺᩷ۜ;Ljava/util/HashSet;)V
    .locals 1

    .line 1205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1199
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܰ᩷ۜ;->ܳ:Ljava/util/HashMap;

    .line 1200
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܰ᩷ۜ;->ۧ:Ljava/util/HashMap;

    .line 1206
    iput-boolean p1, p0, Ll/ܰ᩷ۜ;->֫:Z

    .line 1207
    iput-object p2, p0, Ll/ܰ᩷ۜ;->ܿ:Ll/᩺᩷ۜ;

    .line 1208
    iput-object p3, p0, Ll/ܰ᩷ۜ;->᩻:Ljava/util/HashSet;

    return-void
.end method
