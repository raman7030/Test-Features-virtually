.class public final Ll/ۜ᩷ۚ;
.super Ljava/util/AbstractSet;
.source "J4UM"


# static fields
.field public static final ᩶:Ll/ۜ᩷ۚ;


# instance fields
.field public final ᩸:Ljava/util/Set;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Ll/ۜ᩷ۚ;

    .line 46
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۜ᩷ۚ;-><init>(Ll/ۛ۬ܺ;)V

    sput-object v0, Ll/ۜ᩷ۚ;->᩶:Ll/ۜ᩷ۚ;

    return-void
.end method

.method public constructor <init>(Ll/ۛ۬ܺ;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput v0, p0, Ll/ۜ᩷ۚ;->᩹:I

    .line 53
    iput-object p1, p0, Ll/ۜ᩷ۚ;->᩸:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۜ᩷ۚ;->᩸:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۜ᩷ۚ;->᩸:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method
