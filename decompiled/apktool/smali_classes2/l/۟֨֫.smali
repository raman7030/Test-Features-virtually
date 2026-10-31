.class public final Ll/۟֨֫;
.super Ljava/lang/Object;
.source "S8SC"


# instance fields
.field public final ֫:Ll/ܳ۬ܺ;

.field public final ۧ:Ll/۬֨֫;

.field public final ܽ:Ll/ۤ֨֫;

.field public final ᩳ:Ll/ܰ֨֫;


# direct methods
.method public constructor <init>(Ljava/util/List;Ll/۬֨֫;Ll/ۤ֨֫;Ll/ܰ֨֫;)V
    .locals 0

    .line 380
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 382
    invoke-static {p1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/۟֨֫;->֫:Ll/ܳ۬ܺ;

    .line 383
    iput-object p2, p0, Ll/۟֨֫;->ۧ:Ll/۬֨֫;

    .line 384
    iput-object p3, p0, Ll/۟֨֫;->ܽ:Ll/ۤ֨֫;

    .line 385
    iput-object p4, p0, Ll/۟֨֫;->ᩳ:Ll/ܰ֨֫;

    return-void
.end method
