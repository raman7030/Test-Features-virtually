.class public final Ll/ܶ᩷ۚ;
.super Ll/֡᩵ۚ;
.source "H5GB"


# instance fields
.field public final synthetic ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 301
    iput-object p1, p0, Ll/ܶ᩷ۚ;->᩸:Ljava/util/List;

    .line 42
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 305
    iget-object v0, p0, Ll/ܶ᩷ۚ;->᩸:Ljava/util/List;

    invoke-static {v0}, Ll/᩸ۗܺ;->֫(Ljava/lang/Iterable;)Ll/᩸ۗܺ;

    move-result-object v0

    invoke-static {}, Ll/᩶᩷ۚ;->ܿ()Ll/ܽܶܺ;

    move-result-object v1

    .line 306
    invoke-virtual {v0, v1}, Ll/᩸ۗܺ;->֫(Ll/ܽܶܺ;)Ll/᩸ۗܺ;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 311
    iget-object v0, p0, Ll/ܶ᩷ۚ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
