.class public final Ll/ܶᩳۚ;
.super Ll/᩸ᩳۚ;
.source "X5AR"

# interfaces
.implements Ll/۟ۧۚ;


# static fields
.field public static final ۙ:Ll/ۘۗ֡;


# instance fields
.field public final ᩶:I

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    sget-object v0, Ll/ۘۗ֡;->ۘ֫:Ll/ۘۗ֡;

    sput-object v0, Ll/ܶᩳۚ;->ۙ:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/֨ۗ֡;II)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Ll/᩸ᩳۚ;-><init>(Ll/֨ۗ֡;)V

    .line 51
    invoke-static {p2}, Ll/ۧᩳܽ;->ۧ(I)V

    iput p2, p0, Ll/ܶᩳۚ;->᩶:I

    .line 52
    iput p3, p0, Ll/ܶᩳۚ;->᩹:I

    return-void
.end method


# virtual methods
.method public final synthetic ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫()I
    .locals 1

    .line 67
    iget v0, p0, Ll/ܶᩳۚ;->᩶:I

    return v0
.end method

.method public final ۖ()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ܶᩳۚ;->᩹:I

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 77
    sget-object v0, Ll/ܶᩳۚ;->ۙ:Ll/ۘۗ֡;

    return-object v0
.end method
