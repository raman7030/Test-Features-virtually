.class public final Ll/ܶۗܺ;
.super Ll/᩸ۗܺ;
.source "X4RA"


# instance fields
.field public final synthetic ᩹:[Ljava/lang/Iterable;


# direct methods
.method public constructor <init>([Ljava/lang/Iterable;)V
    .locals 0

    .line 293
    iput-object p1, p0, Ll/ܶۗܺ;->᩹:[Ljava/lang/Iterable;

    invoke-direct {p0}, Ll/᩸ۗܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 296
    new-instance v0, Ll/۠ۗܺ;

    iget-object v1, p0, Ll/ܶۗܺ;->᩹:[Ljava/lang/Iterable;

    array-length v2, v1

    invoke-direct {v0, v2, v1}, Ll/۠ۗܺ;-><init>(I[Ljava/lang/Iterable;)V

    .line 572
    new-instance v1, Ll/ۚ۫ܺ;

    invoke-direct {v1, v0}, Ll/ۚ۫ܺ;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method
