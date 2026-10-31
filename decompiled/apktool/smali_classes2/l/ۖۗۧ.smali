.class public abstract Ll/ۖۗۧ;
.super Ljava/lang/Object;
.source "Y64E"


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ܿ۬ۧ;

.field public final ܽ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Ll/ܿ۬ۧ;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 42
    iput v0, p0, Ll/ۖۗۧ;->֫:I

    .line 44
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۖۗۧ;->ܽ:Landroid/graphics/Rect;

    .line 47
    iput-object p1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    return-void
.end method

.method public static ֫(Ll/ܿ۬ۧ;I)Ll/ۖۗۧ;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 356
    new-instance p1, Ll/ܺۗۧ;

    invoke-direct {p1, p0}, Ll/ۖۗۧ;-><init>(Ll/ܿ۬ۧ;)V

    return-object p1

    .line 247
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 258
    :cond_1
    new-instance p1, Ll/ۡۗۧ;

    invoke-direct {p1, p0}, Ll/ۖۗۧ;-><init>(Ll/ܿ۬ۧ;)V

    return-object p1
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public abstract ֫(Landroid/view/View;)I
.end method

.method public abstract ֫(I)V
.end method

.method public final ۜ()I
    .locals 2

    const/high16 v0, -0x80000000

    .line 78
    iget v1, p0, Ll/ۖۗۧ;->֫:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Ll/ۖۗۧ;->᩻()I

    move-result v0

    iget v1, p0, Ll/ۖۗۧ;->֫:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public abstract ۧ()I
.end method

.method public abstract ۧ(Landroid/view/View;)I
.end method

.method public abstract ܳ()I
.end method

.method public abstract ܳ(Landroid/view/View;)I
.end method

.method public abstract ܽ()I
.end method

.method public abstract ܽ(Landroid/view/View;)I
.end method

.method public abstract ܿ()I
.end method

.method public abstract ܿ(Landroid/view/View;)I
.end method

.method public abstract ᩳ()I
.end method

.method public abstract ᩳ(Landroid/view/View;)I
.end method

.method public final ᩷()V
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/ۖۗۧ;->᩻()I

    move-result v0

    iput v0, p0, Ll/ۖۗۧ;->֫:I

    return-void
.end method

.method public abstract ᩻()I
.end method
