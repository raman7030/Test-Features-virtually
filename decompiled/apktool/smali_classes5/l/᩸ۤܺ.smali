.class public final Ll/᩸ۤܺ;
.super Ll/ܶۤܺ;
.source "Y2OD"


# instance fields
.field public final synthetic ֫:Ll/᩹ۤܺ;


# direct methods
.method public constructor <init>(Ll/᩹ۤܺ;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 297
    iput-object p1, p0, Ll/᩸ۤܺ;->֫:Ll/᩹ۤܺ;

    return-void
.end method


# virtual methods
.method public final ܽ()Ll/ۗ۫ܺ;
    .locals 3

    .line 300
    iget-object v0, p0, Ll/᩸ۤܺ;->֫:Ll/᩹ۤܺ;

    .line 301
    invoke-virtual {v0}, Ll/᩹ۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ll/۠ۤܺ;

    invoke-direct {v1}, Ll/۠ۤܺ;-><init>()V

    .line 332
    new-instance v2, Ll/ۙۤܺ;

    .line 48
    invoke-direct {v2, v0}, Ll/ܽۙܺ;-><init>(Ljava/util/Map;)V

    .line 342
    iput-object v1, v2, Ll/ۙۤܺ;->۬:Ll/ۛܶܺ;

    return-object v2
.end method
