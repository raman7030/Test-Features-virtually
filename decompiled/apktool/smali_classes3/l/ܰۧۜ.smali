.class public final Ll/ܰۧۜ;
.super Ljava/lang/Object;
.source "26KG"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public ۜ:Ll/֡᩻ܽ;

.field public final ۧ:I

.field public final ܳ:Ljava/util/HashSet;

.field public final ܽ:Ljava/lang/String;

.field public ܿ:I

.field public final ᩳ:Ljava/util/HashMap;

.field public final ᩷:Ljava/util/HashSet;

.field public final ᩻:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܰۧۜ;->ᩳ:Ljava/util/HashMap;

    .line 328
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܰۧۜ;->֫:Ljava/util/HashMap;

    .line 329
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܰۧۜ;->᩷:Ljava/util/HashSet;

    .line 331
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܰۧۜ;->ܳ:Ljava/util/HashSet;

    .line 332
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܰۧۜ;->᩻:Ljava/util/HashSet;

    .line 336
    iput p1, p0, Ll/ܰۧۜ;->ۧ:I

    iput-object p2, p0, Ll/ܰۧۜ;->ܽ:Ljava/lang/String;

    return-void
.end method
