.class public final Ll/᩶ۚۜ;
.super Ljava/lang/Object;
.source "B75R"


# instance fields
.field public ֫:Ll/۟ܰۜ;

.field public ۖ:Z

.field public ۘ:Ll/᩹ۚۜ;

.field public ۜ:Ll/֡ۚۜ;

.field public ۡ:Ll/᩸ۚۜ;

.field public ۢ:I

.field public ۧ:Ll/ܽۤۜ;

.field public ܳ:Ll/ۚ۟ۜ;

.field public final ܺ:Ljava/util/ArrayDeque;

.field public ܽ:Ll/ܶۚۜ;

.field public final ܿ:Ljava/lang/String;

.field public ᩳ:I

.field public ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ܶۚۜ;ILl/ܽۤۜ;)V
    .locals 1

    .line 870
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 866
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/᩶ۚۜ;->ܺ:Ljava/util/ArrayDeque;

    .line 871
    iput-object p1, p0, Ll/᩶ۚۜ;->ܽ:Ll/ܶۚۜ;

    .line 872
    check-cast p1, Ll/ܺ֨ۜ;

    invoke-virtual {p1}, Ll/ܺ֨ۜ;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۚۜ;->ܿ:Ljava/lang/String;

    .line 873
    iput p2, p0, Ll/᩶ۚۜ;->᩻:I

    .line 874
    iput-object p3, p0, Ll/᩶ۚۜ;->ۧ:Ll/ܽۤۜ;

    return-void
.end method
