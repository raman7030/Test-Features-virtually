.class public final Ll/֨ۗܺ;
.super Ll/᩸ۗܺ;
.source "X4RA"


# instance fields
.field public final synthetic ᩹:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .line 279
    iput-object p1, p0, Ll/֨ۗܺ;->᩹:Ljava/lang/Iterable;

    invoke-direct {p0}, Ll/᩸ۗܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 282
    iget-object v0, p0, Ll/֨ۗܺ;->᩹:Ljava/lang/Iterable;

    check-cast v0, Ll/᩷۫ܺ;

    invoke-virtual {v0}, Ll/᩷۫ܺ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    new-instance v1, Ll/ܺܶۡ;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ll/ܺܶۡ;-><init>(I)V

    .line 824
    new-instance v2, Ll/ᩴ۫ܺ;

    invoke-direct {v2, v0, v1}, Ll/ᩴ۫ܺ;-><init>(Ljava/util/Iterator;Ll/ܽܶܺ;)V

    .line 572
    new-instance v0, Ll/ۚ۫ܺ;

    invoke-direct {v0, v2}, Ll/ۚ۫ܺ;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method
