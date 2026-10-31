.class public final Ll/ۡܳܺ;
.super Ll/ۢۡܺ;
.source "UBEJ"


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:I

.field public final synthetic ܽ:[Z


# direct methods
.method public constructor <init>([ZII)V
    .locals 0

    .line 443
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    iput-object p1, p0, Ll/ۡܳܺ;->ܽ:[Z

    iput p2, p0, Ll/ۡܳܺ;->֫:I

    iput p3, p0, Ll/ۡܳܺ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۡܺ;)V
    .locals 5

    .line 211
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 213
    invoke-virtual {p1}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 215
    iget-object v1, p0, Ll/ۡܳܺ;->ܽ:[Z

    const/4 v2, 0x0

    aget-boolean v3, v1, v2

    if-eqz v3, :cond_0

    iget v3, p0, Ll/ۡܳܺ;->֫:I

    iget v4, p0, Ll/ۡܳܺ;->ۧ:I

    sub-int/2addr v3, v4

    add-int/2addr v3, v0

    .line 217
    invoke-virtual {p1}, Ll/ܺۡܺ;->ܺ()Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    if-ne v3, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    aput-boolean p1, v1, v2

    :cond_1
    return-void
.end method
