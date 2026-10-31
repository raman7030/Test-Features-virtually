.class public final Ll/ۡۗۖ;
.super Ljava/lang/Object;
.source "94T8"


# instance fields
.field public ֫:Ljava/util/HashSet;

.field public ۧ:Z

.field public ܽ:Ll/ᩳ᩶ۖ;

.field public ᩳ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۡۗۖ;->ᩳ:Ljava/util/HashSet;

    .line 101
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۡۗۖ;->֫:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 103
    iput-boolean v0, p0, Ll/ۡۗۖ;->ۧ:Z

    return-void
.end method
