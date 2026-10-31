.class public abstract Ll/᩶ܶܺ;
.super Ll/۠۠ܺ;
.source "O3OZ"


# instance fields
.field public final ۗ:Z

.field public ۙ:I

.field public final ۫:Ll/ۨ۠ܺ;

.field public final ۬:Ljava/lang/CharSequence;

.field public ᩶:I


# direct methods
.method public constructor <init>(Ll/ۗܶܺ;Ljava/lang/CharSequence;)V
    .locals 2

    .line 543
    invoke-direct {p0}, Ll/۠۠ܺ;-><init>()V

    const/4 v0, 0x0

    .line 540
    iput v0, p0, Ll/᩶ܶܺ;->ۙ:I

    .line 544
    invoke-static {p1}, Ll/ۗܶܺ;->֫(Ll/ۗܶܺ;)Ll/ۨ۠ܺ;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ܶܺ;->۫:Ll/ۨ۠ܺ;

    .line 545
    iput-boolean v0, p0, Ll/᩶ܶܺ;->ۗ:Z

    .line 546
    invoke-static {p1}, Ll/ۗܶܺ;->ۧ(Ll/ۗܶܺ;)I

    move-result p1

    iput p1, p0, Ll/᩶ܶܺ;->᩶:I

    .line 547
    iput-object p2, p0, Ll/᩶ܶܺ;->۬:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public abstract ۧ(I)I
.end method

.method public abstract ܽ(I)I
.end method
