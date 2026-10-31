.class public final Ll/ۘۛ֡;
.super Ljava/lang/Object;
.source "M605"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ljava/util/Iterator;

.field public final synthetic ۬:Z

.field public final synthetic ᩶:Ll/۠ۛ֡;

.field public final ᩸:Ll/ܰܰ֡;

.field public final ᩹:Ll/ܰܰ֡;


# direct methods
.method public constructor <init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V
    .locals 0

    .line 425
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۛ֡;->᩶:Ll/۠ۛ֡;

    iput p3, p0, Ll/ۘۛ֡;->ۗ:I

    iput-object p4, p0, Ll/ۘۛ֡;->ۙ:Ljava/util/Iterator;

    iput-boolean p5, p0, Ll/ۘۛ֡;->۬:Z

    .line 427
    invoke-virtual {p2}, Ll/ۧ۟֡;->ܽ()Ll/ܰܰ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۛ֡;->᩸:Ll/ܰܰ֡;

    .line 429
    invoke-virtual {p2}, Ll/ۧ۟֡;->ᩳ()Ll/ܰܰ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۛ֡;->᩹:Ll/ܰܰ֡;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 434
    new-instance v0, Ll/ۖۛ֡;

    iget-object v1, p0, Ll/ۘۛ֡;->᩶:Ll/۠ۛ֡;

    iget-object v1, v1, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    iget v2, p0, Ll/ۘۛ֡;->ۗ:I

    invoke-direct {v0, p0, v1, v2}, Ll/ۖۛ֡;-><init>(Ll/ۘۛ֡;Ll/۬ۛ֡;I)V

    return-object v0
.end method
