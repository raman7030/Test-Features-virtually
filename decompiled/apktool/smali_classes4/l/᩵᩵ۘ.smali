.class public final Ll/᩵᩵ۘ;
.super Ljava/lang/Object;
.source "48CR"


# instance fields
.field public ֫:Ll/᩸᩵ۘ;

.field public ۧ:Ll/᩹᩵ۘ;

.field public ܽ:[Ll/᩷᩵ۘ;


# direct methods
.method public constructor <init>(Ll/֡᩵ۘ;ILl/᩹᩵ۘ;)V
    .locals 4

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p3, p0, Ll/᩵᩵ۘ;->ۧ:Ll/᩹᩵ۘ;

    .line 70
    new-array v0, p2, [Ll/᩷᩵ۘ;

    iput-object v0, p0, Ll/᩵᩵ۘ;->ܽ:[Ll/᩷᩵ۘ;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 72
    invoke-virtual {p3}, Ll/᩹᩵ۘ;->֫()Ll/᩷᩵ۘ;

    move-result-object v1

    .line 73
    move-object v2, v1

    check-cast v2, Ll/᩻᩵ۘ;

    .line 74
    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v3

    check-cast v3, Ll/۟ۘۘ;

    invoke-virtual {v3, v2}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 75
    iget-object v2, p0, Ll/᩵᩵ۘ;->ܽ:[Ll/᩷᩵ۘ;

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 77
    :cond_0
    new-instance p1, Ll/᩸᩵ۘ;

    iget-object p2, p0, Ll/᩵᩵ۘ;->ܽ:[Ll/᩷᩵ۘ;

    invoke-direct {p1, p2}, Ll/᩸᩵ۘ;-><init>([Ll/᩷᩵ۘ;)V

    iput-object p1, p0, Ll/᩵᩵ۘ;->֫:Ll/᩸᩵ۘ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩵ۘ;)Ll/᩹᩵ۘ;
    .locals 0

    .line 62
    iget-object p0, p0, Ll/᩵᩵ۘ;->ۧ:Ll/᩹᩵ۘ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩵᩵ۘ;)Ll/᩸᩵ۘ;
    .locals 0

    .line 62
    iget-object p0, p0, Ll/᩵᩵ۘ;->֫:Ll/᩸᩵ۘ;

    return-object p0
.end method
