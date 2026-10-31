.class public Ll/ۨۤۧ;
.super Ll/ۖۨۧ;
.source "D618"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ll/ۖۨۧ;-><init>()V

    .line 40
    invoke-direct {p0}, Ll/ۨۤۧ;->ܽ()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Ll/ۖۨۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    invoke-direct {p0}, Ll/ۨۤۧ;->ܽ()V

    return-void
.end method

.method private ܽ()V
    .locals 3

    const/4 v0, 0x1

    .line 49
    invoke-virtual {p0, v0}, Ll/ۖۨۧ;->ܽ(I)V

    .line 50
    new-instance v1, Ll/᩷ۛۧ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/᩷ۛۧ;-><init>(I)V

    invoke-virtual {p0, v1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    new-instance v1, Ll/᩻ۛۧ;

    invoke-direct {v1}, Ll/᩻ۛۧ;-><init>()V

    .line 51
    invoke-virtual {p0, v1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    new-instance v1, Ll/᩷ۛۧ;

    invoke-direct {v1, v0}, Ll/᩷ۛۧ;-><init>(I)V

    .line 52
    invoke-virtual {p0, v1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    return-void
.end method
