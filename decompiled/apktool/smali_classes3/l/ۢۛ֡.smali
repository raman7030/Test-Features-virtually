.class public final Ll/ۢۛ֡;
.super Ljava/lang/Object;
.source "M605"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Ljava/util/Iterator;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/۠ۛ֡;

.field public final synthetic ᩹:Ll/ۧ۟֡;


# direct methods
.method public constructor <init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V
    .locals 0

    .line 291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۛ֡;->᩸:Ll/۠ۛ֡;

    iput-object p2, p0, Ll/ۢۛ֡;->᩹:Ll/ۧ۟֡;

    iput p3, p0, Ll/ۢۛ֡;->᩶:I

    iput-object p4, p0, Ll/ۢۛ֡;->ۙ:Ljava/util/Iterator;

    iput-boolean p5, p0, Ll/ۢۛ֡;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 295
    iget-object v0, p0, Ll/ۢۛ֡;->᩹:Ll/ۧ۟֡;

    .line 296
    invoke-virtual {v0}, Ll/ۧ۟֡;->ۧ()Ll/ܰܰ֡;

    move-result-object v0

    .line 298
    new-instance v1, Ll/᩷ۛ֡;

    iget-object v2, p0, Ll/ۢۛ֡;->᩸:Ll/۠ۛ֡;

    iget-object v2, v2, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    iget v3, p0, Ll/ۢۛ֡;->᩶:I

    invoke-direct {v1, p0, v2, v3, v0}, Ll/᩷ۛ֡;-><init>(Ll/ۢۛ֡;Ll/۬ۛ֡;ILl/ܰܰ֡;)V

    return-object v1
.end method
