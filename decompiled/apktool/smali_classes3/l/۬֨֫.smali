.class public final Ll/۬֨֫;
.super Ljava/lang/Object;
.source "S8SC"


# instance fields
.field public final ֫:[I

.field public final ۧ:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ljava/util/List;[I)V
    .locals 0

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 277
    invoke-static {p1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/۬֨֫;->ۧ:Ll/ܳ۬ܺ;

    .line 278
    iput-object p2, p0, Ll/۬֨֫;->֫:[I

    return-void
.end method
