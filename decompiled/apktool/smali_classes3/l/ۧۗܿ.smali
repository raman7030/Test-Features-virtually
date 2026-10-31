.class public final Ll/ۧۗܿ;
.super Ljava/lang/Object;
.source "014Q"


# instance fields
.field public final ֫:Ll/۟ۙܿ;

.field public ۧ:Z

.field public final ܽ:Ljava/util/ArrayList;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۟ۙܿ;)V
    .locals 1

    .line 351
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 347
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۧۗܿ;->ܽ:Ljava/util/ArrayList;

    .line 348
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۧۗܿ;->ᩳ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 349
    iput-boolean v0, p0, Ll/ۧۗܿ;->ۧ:Z

    .line 352
    iput-object p1, p0, Ll/ۧۗܿ;->֫:Ll/۟ۙܿ;

    return-void
.end method
