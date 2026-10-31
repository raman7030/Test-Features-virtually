.class public Ll/ܳۙ᩷;
.super Ll/ۘۙ᩷;
.source "T8VV"


# instance fields
.field public ۫֫:Ll/ۜܺ᩷;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    .line 15
    invoke-direct {p0}, Ll/ܳۙ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    invoke-direct {p0}, Ll/ܳۙ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    invoke-direct {p0}, Ll/ܳۙ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 30
    invoke-direct {p0}, Ll/ܳۙ᩷;->ۢ֫()V

    return-void
.end method

.method private ۢ֫()V
    .locals 2

    const v0, 0x7f12064a

    .line 34
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, " mt.cc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 2

    .line 39
    iget-object v0, p0, Ll/ܳۙ᩷;->۫֫:Ll/ۜܺ᩷;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Ll/ۜܺ᩷;

    invoke-direct {v0, p1}, Ll/ۜܺ᩷;-><init>(Ll/ۗܺ᩷;)V

    iput-object v0, p0, Ll/ܳۙ᩷;->۫֫:Ll/ۜܺ᩷;

    .line 42
    :cond_0
    iget-object p1, p0, Ll/ܳۙ᩷;->۫֫:Ll/ۜܺ᩷;

    .line 64
    new-instance v0, Ll/֡᩹ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ll/ۜܺ᩷;->֫(ZLjava/lang/Runnable;)V

    return-void
.end method
