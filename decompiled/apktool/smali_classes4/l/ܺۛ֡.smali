.class public final Ll/ܺۛ֡;
.super Ljava/lang/Object;
.source "M605"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ljava/util/Iterator;

.field public final synthetic ᩸:Ll/۠ۛ֡;

.field public final synthetic ᩹:Ll/ۧ۟֡;


# direct methods
.method public constructor <init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V
    .locals 0

    .line 363
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۛ֡;->᩸:Ll/۠ۛ֡;

    iput-object p2, p0, Ll/ܺۛ֡;->᩹:Ll/ۧ۟֡;

    iput p3, p0, Ll/ܺۛ֡;->ۙ:I

    iput-object p4, p0, Ll/ܺۛ֡;->᩶:Ljava/util/Iterator;

    iput-boolean p5, p0, Ll/ܺۛ֡;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 368
    iget-object v0, p0, Ll/ܺۛ֡;->᩹:Ll/ۧ۟֡;

    invoke-virtual {v0}, Ll/ۧ۟֡;->ܽ()Ll/ܰܰ֡;

    move-result-object v5

    .line 370
    invoke-virtual {v0}, Ll/ۧ۟֡;->ᩳ()Ll/ܰܰ֡;

    move-result-object v6

    .line 372
    new-instance v0, Ll/ۡۛ֡;

    iget-object v1, p0, Ll/ܺۛ֡;->᩸:Ll/۠ۛ֡;

    iget-object v3, v1, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    iget v4, p0, Ll/ܺۛ֡;->ۙ:I

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Ll/ۡۛ֡;-><init>(Ll/ܺۛ֡;Ll/۬ۛ֡;ILl/ܰܰ֡;Ll/ܰܰ֡;)V

    return-object v0
.end method
