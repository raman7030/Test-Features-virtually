.class public final Ll/᩷۫ܺ;
.super Ll/᩸ۗܺ;
.source "F5KS"


# instance fields
.field public final synthetic ᩶:Ll/ܽܶܺ;

.field public final synthetic ᩹:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Ll/ܽܶܺ;)V
    .locals 0

    .line 757
    iput-object p1, p0, Ll/᩷۫ܺ;->᩹:Ljava/lang/Iterable;

    iput-object p2, p0, Ll/᩷۫ܺ;->᩶:Ll/ܽܶܺ;

    invoke-direct {p0}, Ll/᩸ۗܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 760
    iget-object v0, p0, Ll/᩷۫ܺ;->᩹:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 824
    new-instance v1, Ll/ᩴ۫ܺ;

    iget-object v2, p0, Ll/᩷۫ܺ;->᩶:Ll/ܽܶܺ;

    invoke-direct {v1, v0, v2}, Ll/ᩴ۫ܺ;-><init>(Ljava/util/Iterator;Ll/ܽܶܺ;)V

    return-object v1
.end method
