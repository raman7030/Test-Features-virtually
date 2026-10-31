.class public final Ll/۫֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# instance fields
.field public ֫:I

.field public ۜ:I

.field public final ۡ:Ll/ۛۚܽ;

.field public ۢ:I

.field public ۧ:I

.field public ܳ:I

.field public ܺ:I

.field public final ܽ:I

.field public final ܿ:Z

.field public final ᩳ:I

.field public ᩷:Z

.field public final ᩻:I


# direct methods
.method public constructor <init>(ILl/ۛۚܽ;Ll/۬֨ܽ;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 678
    invoke-direct/range {v0 .. v5}, Ll/۫֨ܽ;-><init>(ILl/ۛۚܽ;Ll/۬֨ܽ;II)V

    return-void
.end method

.method public constructor <init>(ILl/ۛۚܽ;Ll/۬֨ܽ;II)V
    .locals 1

    .line 681
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 672
    iput v0, p0, Ll/۫֨ܽ;->ۧ:I

    const/4 v0, -0x1

    .line 673
    iput v0, p0, Ll/۫֨ܽ;->֫:I

    .line 682
    iput p1, p0, Ll/۫֨ܽ;->᩻:I

    .line 683
    iput-object p2, p0, Ll/۫֨ܽ;->ۡ:Ll/ۛۚܽ;

    .line 684
    iget p1, p3, Ll/۬֨ܽ;->ᩳ:I

    iput p1, p0, Ll/۫֨ܽ;->ۢ:I

    .line 685
    iget p1, p3, Ll/۬֨ܽ;->ۧ:I

    iput p1, p0, Ll/۫֨ܽ;->ۜ:I

    .line 686
    iget-boolean p1, p3, Ll/۬֨ܽ;->ܽ:Z

    iput-boolean p1, p0, Ll/۫֨ܽ;->᩷:Z

    .line 687
    iget-boolean p1, p3, Ll/۬֨ܽ;->֫:Z

    iput-boolean p1, p0, Ll/۫֨ܽ;->ܿ:Z

    .line 688
    iput p4, p0, Ll/۫֨ܽ;->ᩳ:I

    .line 689
    iput p5, p0, Ll/۫֨ܽ;->ܽ:I

    return-void
.end method
