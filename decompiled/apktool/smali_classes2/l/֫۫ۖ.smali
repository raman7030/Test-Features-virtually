.class public final Ll/֫۫ۖ;
.super Ll/ۚ۬ۖ;
.source "P9KH"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩶:Ljava/util/ArrayList;

.field public ᩹:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 42
    sget-object v0, Ll/ۨ۬ۖ;->ۡ:Ll/ۨ۬ۖ;

    invoke-direct {p0, v0}, Ll/ۚ۬ۖ;-><init>(Ll/ۨ۬ۖ;)V

    .line 43
    iput-object p1, p0, Ll/֫۫ۖ;->᩶:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;[B)V
    .locals 1

    .line 36
    sget-object v0, Ll/ۨ۬ۖ;->ۡ:Ll/ۨ۬ۖ;

    invoke-direct {p0, v0}, Ll/ۚ۬ۖ;-><init>(Ll/ۨ۬ۖ;)V

    .line 37
    iput-object p1, p0, Ll/֫۫ۖ;->᩶:Ljava/util/ArrayList;

    .line 38
    iput-object p2, p0, Ll/֫۫ۖ;->᩹:[B

    return-void
.end method

.method public static synthetic ֫(Ll/֫۫ۖ;[B)V
    .locals 0

    .line 31
    iput-object p1, p0, Ll/֫۫ۖ;->᩹:[B

    return-void
.end method

.method public static synthetic ֫(Ll/֫۫ۖ;)[B
    .locals 0

    .line 31
    iget-object p0, p0, Ll/֫۫ۖ;->᩹:[B

    return-object p0
.end method


# virtual methods
.method public final get(I)Ll/ۚ۬ۖ;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/֫۫ۖ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۬ۖ;

    return-object p1
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֫۫ۖ;->᩶:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֫۫ۖ;->᩶:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
