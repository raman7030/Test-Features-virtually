.class public final Ll/ۤۡ;
.super Ll/ܶۗ;
.source "S566"


# instance fields
.field public final synthetic ֫:Ll/֫ܺ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:I

.field public final synthetic ᩳ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/֫ܺ;IILjava/lang/ref/WeakReference;)V
    .locals 0

    .line 379
    iput-object p1, p0, Ll/ۤۡ;->֫:Ll/֫ܺ;

    iput p2, p0, Ll/ۤۡ;->ۧ:I

    iput p3, p0, Ll/ۤۡ;->ܽ:I

    iput-object p4, p0, Ll/ۤۡ;->ᩳ:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ll/ܶۗ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFontRetrievalFailed(I)V
    .locals 0

    return-void
.end method

.method public final onFontRetrieved(Landroid/graphics/Typeface;)V
    .locals 2

    .line 382
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    const/4 v0, -0x1

    .line 383
    iget v1, p0, Ll/ۤۡ;->ۧ:I

    if-eq v1, v0, :cond_1

    .line 384
    iget v0, p0, Ll/ۤۡ;->ܽ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v1, v0}, Ll/۟ۡ;->֫(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    .line 388
    :cond_1
    iget-object v0, p0, Ll/ۤۡ;->֫:Ll/֫ܺ;

    iget-object v1, p0, Ll/ۤۡ;->ᩳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1, p1}, Ll/֫ܺ;->֫(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V

    return-void
.end method
