.class public final Ll/ۜۛ֡;
.super Ljava/lang/Object;
.source "M605"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Z

.field public final synthetic ᩶:Ljava/util/Iterator;

.field public final synthetic ᩸:Ll/۠ۛ֡;

.field public final synthetic ᩹:Ll/ۧ۟֡;


# direct methods
.method public constructor <init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V
    .locals 0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۛ֡;->᩸:Ll/۠ۛ֡;

    iput-object p2, p0, Ll/ۜۛ֡;->᩹:Ll/ۧ۟֡;

    iput p3, p0, Ll/ۜۛ֡;->ۗ:I

    iput-object p4, p0, Ll/ۜۛ֡;->᩶:Ljava/util/Iterator;

    iput-boolean p5, p0, Ll/ۜۛ֡;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 8

    .line 228
    iget-object v0, p0, Ll/ۜۛ֡;->᩹:Ll/ۧ۟֡;

    .line 229
    invoke-virtual {v0}, Ll/ۧ۟֡;->ۧ()Ll/ܰܰ֡;

    move-result-object v6

    .line 230
    iget-object v0, p0, Ll/ۜۛ֡;->᩸:Ll/۠ۛ֡;

    iget-object v1, v0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    iget v2, p0, Ll/ۜۛ֡;->ۗ:I

    .line 231
    invoke-static {v1, v2}, Ll/ܺ۟֡;->֫(Ll/۬ۛ֡;I)Ll/ܺ۟֡;

    move-result-object v5

    .line 233
    new-instance v7, Ll/᩻ۛ֡;

    iget-object v3, v0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-static {v0}, Ll/۠ۛ֡;->ᩳ(Ll/۠ۛ֡;)I

    move-result v4

    move-object v1, v7

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Ll/᩻ۛ֡;-><init>(Ll/ۜۛ֡;Ll/۬ۛ֡;ILl/ܺ۟֡;Ll/ܰܰ֡;)V

    return-object v7
.end method
