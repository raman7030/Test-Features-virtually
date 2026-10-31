.class public final Ll/ۨܰۧ;
.super Ll/ܽ۟ۧ;
.source "F1OQ"


# instance fields
.field public final synthetic ֫:Ll/ۖ۟ۧ;


# direct methods
.method public constructor <init>(Ll/ۖ۟ۧ;)V
    .locals 0

    .line 219
    iput-object p1, p0, Ll/ۨܰۧ;->֫:Ll/ۖ۟ۧ;

    invoke-direct {p0}, Ll/ܽ۟ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 0

    if-nez p1, :cond_0

    .line 231
    iget-object p1, p0, Ll/ۨܰۧ;->֫:Ll/ۖ۟ۧ;

    invoke-virtual {p1}, Ll/ۖ۟ۧ;->᩻()V

    :cond_0
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 2

    .line 222
    iget-object v0, p0, Ll/ۨܰۧ;->֫:Ll/ۖ۟ۧ;

    iget v1, v0, Ll/ۖ۟ۧ;->᩹:I

    if-eq v1, p1, :cond_0

    .line 223
    iput p1, v0, Ll/ۖ۟ۧ;->᩹:I

    .line 224
    iget-object p1, v0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1432
    invoke-virtual {p1}, Ll/᩻۟ۧ;->֫()V

    :cond_0
    return-void
.end method
