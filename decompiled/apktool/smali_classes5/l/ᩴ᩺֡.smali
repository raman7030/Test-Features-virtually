.class public final Ll/ᩴ᩺֡;
.super Ljava/lang/Object;
.source "K4WX"

# interfaces
.implements Ll/۠ܽۚ;


# instance fields
.field public final synthetic ᩸:Ll/ܶۗ֡;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ܶۗ֡;I)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩺֡;->᩸:Ll/ܶۗ֡;

    iput p2, p0, Ll/ᩴ᩺֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final ܿ()V
    .locals 6

    .line 73
    new-instance v0, Ll/֨ܽۚ;

    iget-object v1, p0, Ll/ᩴ᩺֡;->᩸:Ll/ܶۗ֡;

    invoke-virtual {v1}, Ll/ܶۗ֡;->֫()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/ᩴ᩺֡;->᩹:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v3, v4, v2

    const-string v2, "%d@%d"

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ll/֨ܽۚ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
