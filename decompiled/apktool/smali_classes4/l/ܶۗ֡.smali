.class public final Ll/ܶۗ֡;
.super Ll/ܶ᩵ۚ;
.source "N67N"


# instance fields
.field public final ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x0

    const-string v2, "Invalid reference type: %d"

    .line 46
    invoke-direct {p0, v0, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iput p1, p0, Ll/ܶۗ֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 102
    iget v0, p0, Ll/ܶۗ֡;->᩹:I

    return v0
.end method
