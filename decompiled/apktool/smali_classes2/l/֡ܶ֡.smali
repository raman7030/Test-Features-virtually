.class public final Ll/֡ܶ֡;
.super Ll/ܶ᩵ۚ;
.source "04UF"


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 721
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x0

    const-string v1, "No switch payload at offset: %d"

    .line 46
    invoke-direct {p0, p1, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
