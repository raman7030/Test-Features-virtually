.class public final Ll/ۜ۫ܺ;
.super Ll/᩸ۗܺ;
.source "F5KS"


# instance fields
.field public final synthetic ᩶:Ljava/lang/Iterable;

.field public final synthetic ᩹:Ll/ᩴܶܺ;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Ll/ᩴܶܺ;)V
    .locals 0

    .line 614
    iput-object p1, p0, Ll/ۜ۫ܺ;->᩶:Ljava/lang/Iterable;

    iput-object p2, p0, Ll/ۜ۫ܺ;->᩹:Ll/ᩴܶܺ;

    invoke-direct {p0}, Ll/᩸ۗܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 617
    iget-object v0, p0, Ll/ۜ۫ܺ;->᩶:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ll/ۜ۫ܺ;->᩹:Ll/ᩴܶܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    new-instance v2, Ll/ۘ۫ܺ;

    invoke-direct {v2, v0, v1}, Ll/ۘ۫ܺ;-><init>(Ljava/util/Iterator;Ll/ᩴܶܺ;)V

    return-object v2
.end method
