.class public final Ll/۬ۙۖ;
.super Ljava/lang/Object;
.source "C5XL"


# instance fields
.field public ֫:Ljava/util/HashSet;

.field public ۧ:Ljava/util/HashSet;

.field public ܽ:I

.field public ᩳ:C


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    .line 57
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    const/4 v0, -0x1

    .line 58
    iput v0, p0, Ll/۬ۙۖ;->ܽ:I

    return-void
.end method
