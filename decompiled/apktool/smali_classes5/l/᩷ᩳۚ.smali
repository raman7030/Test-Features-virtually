.class public final Ll/᩷ᩳۚ;
.super Ll/ܳ۬֡;
.source "2623"


# static fields
.field public static final ۙ:Ll/᩶᩵ۚ;


# instance fields
.field public final ᩶:Ll/ܿܿۚ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Ll/ۜᩳۚ;

    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    sput-object v0, Ll/᩷ᩳۚ;->ۙ:Ll/᩶᩵ۚ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۤܽۚ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Ll/᩷ᩳۚ;->᩹:Ljava/lang/String;

    .line 68
    invoke-static {p2}, Ll/᩻ܿۚ;->֫(Ll/ۤܽۚ;)Ll/ܿܿۚ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩳۚ;->᩶:Ll/ܿܿۚ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ܿܿۚ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Ll/᩷ᩳۚ;->᩹:Ljava/lang/String;

    .line 74
    iput-object p2, p0, Ll/᩷ᩳۚ;->᩶:Ll/ܿܿۚ;

    return-void
.end method

.method public static ֫(Ljava/util/Collection;)Ll/ۛ۬ܺ;
    .locals 1

    .line 89
    sget-object v0, Ll/᩷ᩳۚ;->ۙ:Ll/᩶᩵ۚ;

    invoke-virtual {v0, p0}, Ll/᩶᩵ۚ;->ۧ(Ljava/lang/Iterable;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/᩷ᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ll/ۤܽۚ;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/᩷ᩳۚ;->᩶:Ll/ܿܿۚ;

    return-object v0
.end method
