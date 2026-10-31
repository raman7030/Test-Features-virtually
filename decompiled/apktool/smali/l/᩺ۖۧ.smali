.class public final Ll/᩺ۖۧ;
.super Ljava/lang/Object;
.source "G8N2"


# instance fields
.field public ֫:Ll/۠ᩴ֫;

.field public ۧ:Z

.field public final ܳ:Ll/᩵ۢۧ;

.field public ܽ:I

.field public final ܿ:Ll/ܳۘۧ;

.field public final ᩳ:Ll/᩷ۘۧ;

.field public final ᩻:Ll/֡ۢۧ;


# direct methods
.method public constructor <init>(Ll/ܳۘۧ;Ll/᩷ۘۧ;Ll/᩵ۢۧ;)V
    .locals 0

    .line 1448
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1449
    iput-object p1, p0, Ll/᩺ۖۧ;->ܿ:Ll/ܳۘۧ;

    .line 1450
    iput-object p2, p0, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    .line 1451
    iput-object p3, p0, Ll/᩺ۖۧ;->ܳ:Ll/᩵ۢۧ;

    .line 1452
    iget-object p1, p1, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    iput-object p1, p0, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    const-string p2, "audio/true-hd"

    .line 1454
    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1455
    new-instance p1, Ll/֡ۢۧ;

    invoke-direct {p1}, Ll/֡ۢۧ;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1456
    :goto_0
    iput-object p1, p0, Ll/᩺ۖۧ;->᩻:Ll/֡ۢۧ;

    return-void
.end method
